package us.inest.app.dcp.heap;

import java.util.Arrays;

public class MinHeap {
    private int capacity = 10;
    private int size = 0;
    private int[] items;

    public MinHeap() {
        items = new int[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Heap is empty");
        }
        return items[0];
    }

    public void add(int item) {
        // resize if need
        resize();
        items[size] = item;
        size++;
        siftUp();
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Heap is empty");
        }
        int minItem = items[0];
        items[0] = items[size - 1];
        size--;
        heapifyDown();
        return minItem;
    }

    private void resize() {
        if (size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
            capacity *= 2;
        }
    }

    private void swap(int i, int j) {
        int temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }

    private void siftUp() {
        int index = size - 1;
        while (hasParent(index) && items[index] < parent(index)) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    private void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) < leftChild(index)) {
                smallerChildIndex = getRightChildIndex(index);
            }
            if (items[index] < items[smallerChildIndex]) {
                break;
            } else {
                swap(index, smallerChildIndex);
            }
            index = smallerChildIndex;
        }
    }

    private int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    private int getRightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    private int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    private boolean hasParent(int index) {
        return (index > 0 && getParentIndex(index) >= 0);
    }

    private int leftChild(int index) {
        return items[getLeftChildIndex(index)];
    }

    private int rightChild(int index) {
        return items[getRightChildIndex(index)];
    }

    private int parent(int index) {
        return items[getParentIndex(index)];
    }
}
