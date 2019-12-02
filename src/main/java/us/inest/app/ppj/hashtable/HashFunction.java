package us.inest.app.ppj.hashtable;

public class HashFunction {
    /*
     * creating a hash function for lower case English words
     */
    public int hash_simple(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        return str.charAt(0) - 'a'; // ASCCI code
    }

    public int hash(String str) {
        int hash_value = 0;
        for (int i = 0; i < str.length(); i++) {
            hash_value += str.charAt(i) - 'a';
        }
        return hash_value;
    }

    /*
     * it is common that complexity increase as we aim to smooth the distribution or
     * increase the range
     */
    public int hash_complex(String str) {
        int hash_value = 0;
        for (int i = 0, count = 15; i < str.length() && count >= 0; i++, count--) {
            hash_value += (str.charAt(i) - 'a') << (count % 4);
        }
        return hash_value;
    }
}
