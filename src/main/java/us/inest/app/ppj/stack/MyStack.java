package us.inest.app.ppj.stack;

import java.util.LinkedList;
import java.util.List;

public class MyStack {
    private List<Integer> list;

    MyStack() {
        list = new LinkedList<Integer>();
    }

    void push(int data) {
        list.add(0, data);
    }

    Integer peek() {
        return (list.size() == 0) ? null : list.get(0);
    }

    Integer pop() {
        return (list.size() == 0) ? null : list.remove(0);
    }
}
