package us.inest.app.epi.hashtable;

import us.inest.app.epi.common.TreeNodeWithParent;
import java.util.*;

public class LowestCommonAncestor {
    public static TreeNodeWithParent LCA(TreeNodeWithParent node0, TreeNodeWithParent node1) {
        Set<TreeNodeWithParent> set = new HashSet<>();
        while (node0 != null || node1 != null) {
            if (node0 != null) {
                if (!set.add(node0)) {
                    // node0 is already in set => it is the LCA
                    return node0;
                }
                node0 = node0.parent;
            }
            if (node1 != null) {
                if (!set.add(node1)) {
                    // node1 is already in set => it is the LCA
                    return node1;
                }
                node1 = node1.parent;
            }
        }
        return null;
    }
}
