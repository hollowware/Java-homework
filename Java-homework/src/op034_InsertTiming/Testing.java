package op034_InsertTiming;

import java.util.*;

public class Testing {
	public static void main(String[] args) {
		
		FillingTimeMeasurement measure = new FillingTimeMeasurement();
		 
		List<Integer> intList = new ArrayList<>();
		measure.measureFillListTime(intList);

        List<Integer> intLinkedList = new LinkedList<>();
        measure.measureFillLinkedListTime(intLinkedList);

        Set<Integer> intHashSet = new HashSet<>();
        measure.measureFillHashSetTime(intHashSet);

        Set<Integer> intTreeSet = new TreeSet<>();
        measure.measureFillTreeSetTime(intTreeSet);

        Map<Integer, Integer> intHashMap = new HashMap<>();
        measure.measureFillHashMapTime(intHashMap);

        Map<Integer, Integer> intTreeMap = new TreeMap<>();
        measure.measureFillTreeMapTime(intTreeMap);
		
	}
}
