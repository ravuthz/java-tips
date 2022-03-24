import java.util.*;

public class ExecuteTimer {
    public static void main(String args[]) {
        int nums = 100000;
        
        long st1 = System.nanoTime();
        List<String> myList = new ArrayList<>();
        for(int i=0; i<nums; i++) {
          myList.add("List item" + i);
        }
        long et1 = System.nanoTime();
        long dt1 = (et1 - st1) / 1000000; // to get miliseconds
        System.out.printf("The myList has %s records and executed %d seconds.\n", myList.size(), dt1);
        
        long st2 = System.nanoTime();
        String[] myArray = new String[nums];
        for(int i=0; i<nums; i++) {
          myArray[i] = "List item" + i;
        }
        long et2 = System.nanoTime();
        long dt2 = (et2 - st2) / 1000000; // to get miliseconds
        System.out.printf("The myList has %s records and executed %d seconds.\n", myArray.length, dt2);
    }

}