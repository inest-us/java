package us.inest.app.epi.hashtable;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

/*
 * A record object for each input line
 */
class Record {
    String dsn;
    LocalDateTime ts;
    String beginState;
    String endState;
    
    public Record(LocalDateTime ts, String dsn, String beginState, String endState) {
        this.dsn = dsn;
        this.ts = ts;
        this.beginState = beginState;
        this.endState = endState;
    }
}

public class DeviceState {
    
    
    public static void deviceStatus(String inputFilepath, String outputFilepath) throws IOException {
        /*
         * using HasHMap, the key is Device's DSN
         * For each key, store all its record in a max heap, the record with the latest TimeStamp will be top heap
         * We take the top node from the max heap, get that endState and determine if the device is Allowed or Denied 
         */
        Map<String, PriorityQueue<Record>> cache = new HashMap<>();
        
        BufferedReader br = new BufferedReader(new FileReader(inputFilepath));
        String line;
        while ((line = br.readLine()) != null) {
           System.out.println(line);
           String[] tokens= line.split(" ");
           LocalDateTime ts = LocalDateTime.parse(tokens[0].trim());
           String dsn = tokens[1].trim();
           String beginState = tokens[2].trim();
           String endState = tokens[4].trim();
           Record r = new Record(ts, dsn, beginState, endState);
           if (!cache.containsKey(dsn)) {
               PriorityQueue<Record> maxHeap = new PriorityQueue<>((r1,r2) -> r2.ts.compareTo(r1.ts));
               maxHeap.add(r);
               cache.put(dsn, maxHeap);
           } else {
               cache.get(dsn).add(r);
           }
        }
        br.close();
        
        //Output File
        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilepath));
        List<String> allowedList = new ArrayList<>();
        List<String> deniedList = new ArrayList<>();
        for (String dsn : cache.keySet()) {
            String endState = cache.get(dsn).remove().endState;
            if (endState.equals("IN_STORAGE")) {
                allowedList.add(dsn);
            } else if (endState.equals("OUT_OF_USE")) {
                deniedList.add(dsn);
            }
        }
        bw.write("DSNs under DENY LIST:");
        bw.newLine();
        for (int i = 0; i < deniedList.size(); i++) {
            bw.write(deniedList.get(i));
            bw.newLine();
        }
        bw.write("DSNs under ALLOW LIST:");
        bw.newLine();
        for (int i = 0; i < allowedList.size(); i++) {
            bw.write(allowedList.get(i));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        deviceStatus("C:\\repos\\java\\epi\\src\\main\\java\\us\\inest\\app\\epi\\hashtable\\data.txt",
                "C:\\repos\\java\\epi\\src\\main\\java\\us\\inest\\app\\epi\\hashtable\\output.txt");

    }

}
