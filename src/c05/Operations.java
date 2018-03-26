package c05;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.PriorityQueue;

public class Operations {
	int lchild_index(int index) {
		return index * 2 + 1;
	}

	int rchild_index(int index) {
		return index * 2 + 2;
	}
	
	int parent_index(int index) {
		return (index != 0) ? (index - 1) / 2 : 0;
	}
	
	/*
	 * construct a binary heap in-place
	 */
	void heapify(List<Integer> array) {
		for (int i = 0; i < array.size(); i++) {
			int parent = parent_index(i);
			while (i != parent && array.get(parent) < array.get(i)) {
				int temp = array.get(i);
				array.set(i, array.get(parent));
				array.set(parent, temp);
				i = parent;
				parent = parent_index(i);
			}
		}
	}
	
	void insert(List<Integer> heap, int value) {
		heap.add(value);
		int index = heap.size() - 1;
		int parent = parent_index(index);
		while (index != 0 && heap.get(index) > heap.get(parent)) {
			int temp = heap.get(index);
			heap.set(index, heap.get(parent));
			heap.set(parent, temp);
			index = parent;
			parent = parent_index(index);
		}
	}
	
	int find_max(List<Integer> heap) {
		return heap.get(0);
	}
	
	void remove_max(List<Integer> heap) {
		heap.remove(0);
		int index = 0;
		while (index < heap.size()) {
			int child = lchild_index(index);
			if (child > heap.size()) {
				break;
			}
			int right = rchild_index(index);
			//find the child that has larger value
			if (right < heap.size() && heap.get(right) > heap.get(child)) {
				child = right;
			}
			if (heap.get(index) > heap.get(child)) {
				break; //already met the heap property
			}
			//iterative swapping until heap met the heap property
			int temp = heap.get(index);
			heap.set(index, heap.get(child));
			heap.set(child, temp);
			index = child;
		}
	}
	
	void increase_key(List<Integer> heap, int index) {
		heap.set(index, heap.get(index) + 1);
		int parent = parent_index(index);
		while (index != 0 && heap.get(index) > heap.get(parent)) {
			int temp = heap.get(index);
			heap.set(index, heap.get(parent));
			heap.set(parent, temp);
			index = parent;
			parent = parent_index(index);
		}
	}
	
	int max(int[] array) {
		int maxVal = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxVal) {
				maxVal = array[i];
			}
		}
		return maxVal;
	}
	
	void find_top_k(InputStream in, int k, PriorityQueue<Integer> heap) throws IOException {
		//using a min-heap
		int val = 0;
		while (heap.size() < k && (val = in.read()) != -1) {
			heap.add(val);
		}
		
		while(in.available() > 0 && (val = in.read()) != -1) {
			if (val > heap.peek()) {
				//removing the min element in heap and adding val
				heap.poll();
				heap.add(val);
			}
		}
	}
}
