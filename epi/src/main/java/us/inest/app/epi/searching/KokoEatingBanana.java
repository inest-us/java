package us.inest.app.epi.searching;

public class KokoEatingBanana {
    public static int minEatingSpeed(int[] piles, int h) {
        // find the max value in piles
        int r = Integer.MIN_VALUE;
        for (int pile : piles) {
            r = Math.max(r, pile); 
        }
        int l = 1; // min speed
        int result = r; // init result with max speed
        
        while (l <= r) {
            int k = (l + r) / 2;
            int hours = 0;
            for (int pile : piles) {
                hours += (int) Math.ceil((double)pile / k);
            }
            if (hours <= h) {
                result = k;
                r = k - 1;
            } else {
                l = k + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[] {3, 6, 7, 11}, 8)); // 4
    }

}
