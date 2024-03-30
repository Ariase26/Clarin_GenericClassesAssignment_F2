package Map;

import java.util.ArrayList;

public class MyMap<K, V> {
    private ArrayList<K> keyArray;
    private ArrayList<V> valueArray;

    public MyMap() {
        keyArray = new ArrayList<>();
        valueArray = new ArrayList<>();
    }

    public ArrayList<K> getKeys() {
        return keyArray;
    }

    public ArrayList<V> getValues() {
        return valueArray;
    }

    public int size() {
        return keyArray.size();
    }

    public void put(K key, V value) {
        int i = keyArray.indexOf(key);

        if (i != -1) {
            valueArray.set(i, value);
        } else {
            keyArray.add(key);
            valueArray.add(value);
        }
    }

    public V get(K key) {
        int i = keyArray.indexOf(key);

        if (i != -1) {
            return valueArray.get(i);
        }

        return null;
    }

    public V remove(K key) {
        int i = keyArray.indexOf(key);

        if (i != -1) {
            keyArray.remove(i);
            return valueArray.remove(i);
        }

        return null;
    }
}