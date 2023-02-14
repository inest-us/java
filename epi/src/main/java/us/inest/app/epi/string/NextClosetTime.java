package us.inest.app.epi.string;

import java.util.HashSet;
import java.util.Set;

public class NextClosetTime {
    
    public static String nextClosetTime(String time) {
        int minutes = Integer.parseInt(time.substring(0, 2));
        minutes += Integer.parseInt(time.substring(3));
        
        Set<Integer> digits = new HashSet<>();
        for (char c : time.toCharArray()) {
            digits.add(c - '0');
        }
        
        while(true) {
            minutes = (minutes + 1) % (24 * 60);
            int[] nextDigits = new int[] {(minutes / 60) / 10, (minutes / 60) % 10, (minutes % 60) / 10, (minutes % 60) % 10};
            boolean isValid = true;
            for (int digit : nextDigits) {
                if (!digits.contains(digit)) {
                    isValid = false;
                }
            }
            if (isValid) {
                return String.format("%02d:%02d", minutes / 60, minutes % 60);
            }
            
        }
    }

    public static void main(String[] args) {
        String time = "05:30";
        String ans = nextClosetTime(time);
        System.out.println(ans);
    }

}
