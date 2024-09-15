import java.util.*;

public class hashMap {

    public static void main(String[] args) {
        // Create a HashMap which implements the Map interface
        Map<String, Integer> map = new HashMap<>();

        // 1. put(K key, V value)
        // Adds a key-value pair to the map.
        map.put("One", 1);
        map.put("Two", 2);

        // 2. get(Object key)
        // Returns the value associated with the specified key.
        System.out.println("Value for 'One': " + map.get("One"));

        // 3. remove(Object key)
        // Removes the key-value pair associated with the specified key.
        map.remove("Two");

        // 4. containsKey(Object key)
        // Checks if the map contains the specified key.
        System.out.println("Contains 'Two': " + map.containsKey("Two"));

        // 5. containsValue(Object value)
        // Checks if the map contains the specified value.
        System.out.println("Contains value 1: " + map.containsValue(1));

        // 6. size()
        // Returns the number of key-value pairs in the map.
        System.out.println("Size of map: " + map.size());

        // 7. isEmpty()
        // Checks if the map is empty.
        System.out.println("Is map empty: " + map.isEmpty());

        // 8. clear()
        // Removes all key-value pairs from the map.
        map.clear();
        System.out.println("Map cleared. Size: " + map.size());

        // 9. putAll(Map<? extends K, ? extends V> m)
        // Copies all key-value pairs from the specified map to this map.
        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("Three", 3);
        anotherMap.put("Four", 4);
        map.putAll(anotherMap);

        // 10. keySet()
        // Returns a set view of the keys contained in the map.
        System.out.println("Keys: " + map.keySet());

        // 11. values()
        // Returns a collection view of the values contained in the map.
        System.out.println("Values: " + map.values());

        // 12. entrySet()
        // Returns a set view of the mappings contained in the map.
        System.out.println("Entries: " + map.entrySet());

        // 13. getOrDefault(Object key, V defaultValue)
        // Returns the value associated with the key, or defaultValue if the key is not present.
        System.out.println("Value for 'Five': " + map.getOrDefault("Five", 0));

        // 14. replace(K key, V value)
        // Replaces the value associated with the specified key.
        map.replace("Three", 33);
        System.out.println("Replaced value for 'Three': " + map.get("Three"));

        // 15. replace(K key, V oldValue, V newValue)
        // Replaces the value associated with the key if the current value is equal to oldValue.
        map.replace("Three", 33, 333);
        System.out.println("Replaced value for 'Three': " + map.get("Three"));



//   for (String key : map.keySet()) {
//             Integer value = map.get(key);
//             System.out.println("Key: " + key + ", Value: " + value);


        // 16. computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction)
        // If the key is not present, computes its value using the mapping function and adds it to the map.
        map.computeIfAbsent("Six", k -> 6);
        System.out.println("Value for 'Six': " + map.get("Six"));

        // 17. computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction)
        // If the key is present, computes its new value using the remapping function.
        map.computeIfPresent("Six", (k, v) -> v + 1);
        System.out.println("Updated value for 'Six': " + map.get("Six"));

        // 18. merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)
        // Merges the specified value with the existing value for the key using the remapping function.
        map.merge("Six", 6, (v1, v2) -> v1 + v2);
        System.out.println("Merged value for 'Six': " + map.get("Six"));

        // 19. forEach(BiConsumer<? super K, ? super V> action)
        // Performs the given action for each entry in the map.
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
