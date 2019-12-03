package us.inest.app.ppj.queue;

import java.util.LinkedList;
import java.util.List;

public class MyQueue {
    private List<Integer> list;

    public MyQueue() {
        list = new LinkedList<Integer>();
    }

    void add(int data) {
        list.add(data);
    }

    Integer peek() {
        return (list.size() == 0) ? null : list.get(0);
    }

    Integer poll() {
        return (list.size() == 0) ? null : list.remove(0);
    }
}
