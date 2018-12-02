package c06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SimpleHashTable extends HashTable {
	private List<Item> items;
	
	SimpleHashTable() {
		this(DEFAULT_HASH_TABLE_SIZE);
	}
	
	SimpleHashTable(int size) {
		this.items = new ArrayList<>(Collections.nCopies(size, (Item) null));
	}
	
	@Override
	void insert(Item entry) {
		// TODO Auto-generated method stub
		
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
