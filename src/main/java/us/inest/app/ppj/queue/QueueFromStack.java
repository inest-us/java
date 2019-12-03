package us.inest.app.ppj.queue;

import java.util.Stack;

public class QueueFromStack {
    private Stack<Integer> instack;
    private Stack<Integer> outstack;

    QueueFromStack() {
        instack = new Stack<Integer>();
        outstack = new Stack<Integer>();
    }

    void add(int data) {
        instack.push(data);
    }

    Integer peek() {
        if (outstack.empty() && instack.empty()) {
            return null;
        }
        transfer();
        return outstack.peek();
    }

    Integer pop() {
        if (outstack.empty() && instack.empty()) {
            return null;
        }
        transfer();
        return outstack.pop();
    }

    private void transfer() {
        if (outstack.empty()) {
            while (!instack.isEmpty()) {
                outstack.push(instack.pop());
            }
        }
    }
}
