package us.inest.app.ppj.hashtable;

public abstract class HashTable {
    protected static final int DEFAULT_HASH_TABLE_SIZE = 97;

    int hash_function(String str) {
        int hash_value = 0;
        for (int i = 0; i < str.length(); i++) {
            hash_value += str.charAt(i) - 'a';
        }
        return hash_value;
    }

    abstract void insert(Item entry);

    abstract Item find(String key);

    abstract int size();

    abstract void resize(int size);
}
