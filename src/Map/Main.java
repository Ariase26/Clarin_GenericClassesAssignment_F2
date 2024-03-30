package Map;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] keys = {1, 2, 3, 4, 5};
        Double[] values = {3.5, 3.6, 3.7, 3.8, 3.9};

        MyMap<Integer, Double> genMap = new MyMap<>();

        for (int i = 0; i < keys.length; i++) {
            genMap.put(keys[i], values[i]);
        }

        System.out.println("Key-Value List: ");
        for (int i = 0; i < genMap.size(); i++) {
            System.out.println("Key: " + genMap.getKeys().get(i) + ", Value: " + genMap.getValues().get(i));
            //System.out.println("Student No: " + genMap.getKeys().get(i) + ", Grade: " + genMap.getValues().get(i));
        }

        Integer getValue;
        System.out.print("\nEnter the corresponding key to retrieve a value: ");
        getValue = Integer.parseInt(sc.next());

        Double value1 = genMap.get(getValue);
        if (value1 != null) {
            System.out.println("| Value of Key " + getValue + ": " + value1);
        } else {
            System.out.println("| Key " + getValue + " does not exist.");
        }

        Integer removeValue;
        System.out.print("\nEnter the corresponding key to remove the value: ");
        removeValue = Integer.parseInt(sc.next());

        Double value2 = genMap.remove(removeValue);
        if (value2 != null) {
            System.out.println("| Value removed: " + value2);
        } else {
            System.out.println("| Key " + removeValue + " does not exist.");
        }

        System.out.println("\nModified Key-Value List: ");
        for (int i = 0; i < genMap.size(); i++) {
            System.out.println("Key: " + genMap.getKeys().get(i) + ", Value: " + genMap.getValues().get(i));
        }
    }
}
