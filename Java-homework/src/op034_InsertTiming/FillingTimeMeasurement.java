package op034_InsertTiming;

import java.util.*;

public class FillingTimeMeasurement {
	
	public void measureFillListTime(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long stop = System.currentTimeMillis();
        System.out.println("Time to fill an Integer List = " + (double) (stop - start) / 1000 + "s");
    }
	
	public void measureFillLinkedListTime(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long stop = System.currentTimeMillis();
        System.out.println("Time to fill an Integer LinkedList = " + (double) (stop - start) / 1000 + "s");
    }
	
    public void measureFillHashSetTime(Set<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long stop = System.currentTimeMillis();
        System.out.println("Time to fill an Integer HashSet = " + (double) (stop - start) / 1000 + "s");
    }
    
    public void measureFillTreeSetTime(Set<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long stop = System.currentTimeMillis();
        System.out.println("Time to fill an Integer TreeSet = " + (double) (stop - start) / 1000 + "s");
    }
    
    public void measureFillHashMapTime(Map<Integer,Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.put(i,((int) (Math.random() * 100)));
        }
        long stop = System.currentTimeMillis();
        System.out.println("Time to fill an Integer HashMap = " + (double) (stop - start) / 1000 + "s");
    }
    
    public void measureFillTreeMapTime(Map<Integer,Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.put(i,((int) (Math.random() * 100)));
        }
        long stop = System.currentTimeMillis();
        System.out.println("Time to fill an Integer TreeMap = " + (double) (stop - start) / 1000 + "s");
    }
	
}
