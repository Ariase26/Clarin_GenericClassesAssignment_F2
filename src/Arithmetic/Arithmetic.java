package Arithmetic;

public class Arithmetic<Num1 extends Number, Num2 extends Number> {
    public Num1 n1;
    public Num2 n2;
    public String result;

    public Arithmetic(Num1 n1, Num2 n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public String add() {
        result = String.format("%.02f", n1.doubleValue() + n2.doubleValue());
        return result;
    }

    public String subtract() {
        result = String.format("%.02f", n1.doubleValue() - n2.doubleValue());
        return result;
    }

    public String multiply() {
        result = String.format("%.02f", n1.doubleValue() * n2.doubleValue());
        return result;
    }

    public String divide() {
        try {
            if (n2.doubleValue() == 0) {
                throw new ArithmeticException("Number 2 cannot be zero.");
            }

            result = String.format("%.2f", n1.doubleValue() / n2.doubleValue());
        } catch (ArithmeticException e) {
            System.err.println("Division Error: " + e.getMessage());
            result = "Undefined";
        }

        return result;
    }

    public Number getMin() {
        return Math.min(n1.doubleValue(), n2.doubleValue());
    }

    public Number getMax() {
        return Math.max(n1.doubleValue(), n2.doubleValue());
    }
}