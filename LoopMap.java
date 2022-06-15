import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LoopMap {

    private static String line = "=================================================================================================================";

    private static Map<Integer, String> customers = new HashMap<>() {{
        put(1, "Jonh Doe");
        put(2, "Black Smith");
        put(3, "Jackie Joe");
    }};

    public static void main(String[] args) {
        
        usingForEach();

        usingStream();

        usingForEntrySet();

        usingForKeySet();

        usingIterators();

    }

    /**
     * In java 8, this is the easiest way to loop map items
     */
    public static void usingForEach() {
        System.out.println(line);
        System.out.println("Using forEach in Java 8");
        customers.forEach((id, name) -> {
            System.out.println("Key : " + id + " value : " + name);
        });
    }


    /**
     * In java 8, we also can use stream to loop map items
     */
    public static void usingStream() {
        System.out.println(line);
        System.out.println("Using stream forEach in Java 8");
        customers.entrySet().stream()
        .forEach((item) -> {
            System.out.println("Key : " + item.getKey() + " value : " + item.getValue());
        });
    }

    /**
     * Java 8 or below, the old style to loop map items
     */
    public static void usingForEntrySet() {
        System.out.println(line);
        System.out.println("Using for with entrySet");
        for (Map.Entry<Integer, String> entry: customers.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
        }
    }

    /**
     * Java 8 or below, the old style to loop map items
     */
    public static void usingForKeySet() {
        System.out.println(line);
        System.out.println("Using for with keySet");
        for (Integer key: customers.keySet()) {
            System.out.println("Key : " + key + " value : " + customers.get(key));
        }
    }

    /**
     * Or we use while loop with iterator of entrySet or keySet
     */
    public static void usingIterators() {
        System.out.println(line);
        System.out.println("Using for with iterator of entrySet");
        Iterator<Map.Entry<Integer, String>> iterator = customers.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
		}

        System.out.println(line);
        System.out.println("Using for with iterator of keySet");
        Iterator<Integer> iteratorKey = customers.keySet().iterator();
		while (iteratorKey.hasNext()) {
			Integer key = iteratorKey.next();
			System.out.println("Key : " + key + " value : " + customers.get(key));
		}
    }
}