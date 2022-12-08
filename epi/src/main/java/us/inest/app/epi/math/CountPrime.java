package us.inest.app.epi.math;

public class CountPrime {
    public static int countPrimes(int n) {
        boolean[] primes = new boolean[n + 1];
        // init
        for (int i = 0; i <= n; i++) {
            primes[i] = true;
        }
        
        for (int i = 2; i * i <= n; i++) {
            if (primes[i]) {
                for (int j = i; j * i <= n; j++) {
                    primes[j * i] = false;
                }
            }
        }
        
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                count++;
                System.out.println(i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(100));

    }

}
