package us.inest.app.epi.arrays;

import java.util.Collections;
import java.util.List;

public class DutchFlagPartition {
    public static void dutchFlagPartition_V1(int pivotIndex, List<Integer> A) {
        int pivot = A.get(pivotIndex);
        // First pass: group elements smaller than pivot
        for (int i = 0; i < A.size(); i++) {
            // Look for smaller element
            for (int j = i + 1; j < A.size(); j++) {
                if (A.get(j) < pivot) {
                    Collections.swap(A, i, j);
                    break;
                }
            }
        }
        
        // Second pass: Group elements larger than pivot
        for (int i = A.size() - 1; i >=0 && A.get(i) >= pivot; i--) {
            // Look for a larger element. Stop when we reach an element less than pivot
            for (int j = i - 1; j >= 0 && A.get(j) >= pivot; j--) {
                if (A.get(j) > pivot) {
                    Collections.swap(A, i, j);
                    break;
                }
            }
        }
    }
    
    public static void dutchFlagPartition_V2(int pivotIndex, List<Integer> A) {
        int pivot = A.get(pivotIndex);
        int smaller = 0;
        // First pass: group elements smaller than pivot
        for (int i = 0; i < A.size(); i++) {
            // Look for smaller element
            if (A.get(i) < pivot) {
                Collections.swap(A, smaller++, i);
            }
        }
        
        // Second pass: Group elements larger than pivot
        int larger = A.size() - 1;
        for (int i = A.size() - 1; i >=0 && A.get(i) >= pivot; i--) {
            // Look for a larger element. Stop when we reach an element less than pivot
            if (A.get(i) > pivot) {
                Collections.swap(A, larger--, i);
            }
        }
    }
    
    public static void dutchFlagPartition_V3(int pivotIndex, List<Integer> A) {
        int pivot = A.get(pivotIndex);
        int smaller = 0, equal = 0, larger = A.size();
        while (equal < larger) {
            if (A.get(equal) < pivot) {
                Collections.swap(A, smaller++, equal++);
            } else if (A.get(equal) == pivot) {
                equal++;
            } else {
                Collections.swap(A, equal, --larger);
            }
        }
    }
}
