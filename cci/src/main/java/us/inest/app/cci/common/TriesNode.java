package us.inest.app.cci.common;

import java.util.HashMap;

public class TriesNode {
    public HashMap<Character, TriesNode> children;
    public boolean isCompleteWord;

    public TriesNode() {
        children = new HashMap<>();
        isCompleteWord = false;
    }
}
