package us.inest.app.ppj.hashtable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleHashTable extends HashTable {
    private List<List<Item>> items;

    public SimpleHashTable() {
        this(DEFAULT_HASH_TABLE_SIZE);
    }

    public SimpleHashTable(int size) {
        items = new ArrayList<>(size);
        for (int i = 0; i < items.size(); i++) {
            items.set(i, new ArrayList<>());
        }
    }

    @Override
    void insert(Item entry) {
        int hash = hash_function(entry.key);
        int index = hash % items.size();
        items.get(index).add(entry);
    }

    @Override
    Item find(String key) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    void resize(int size) {
        // TODO Auto-generated method stub

    }

}
