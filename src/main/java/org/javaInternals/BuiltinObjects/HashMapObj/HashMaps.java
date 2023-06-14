package org.javaInternals.BuiltinObjects.HashMapObj;

import static org.javaInternals.App.log;
import java.util.HashMap;

public class HashMaps {
    public HashMaps() {

        // containsKey(key): verify key existence
        HashMap<String, String> ex1 = new HashMap<>();
        ex1.put("a", "hello");
        ex1.put("b", "world");
        ex1.put("c", "koala");

        log(ex1.containsKey("sa"));

        // containsValue(value): verify value existence
        HashMap<String, String> ex2 = new HashMap<>();
        ex2.put("a", "hello");
        ex2.put("b", "world");
        ex2.put("c", "koala");

        log(ex2.containsValue("hello"));

        // remove(key): remove a specified key
        HashMap<String, String> ex3 = new HashMap<>();
        ex3.put("a", "hello");
        ex3.put("b", "world");
        ex3.put("c", "koala");

        ex3.remove("b");
        ex3.keySet().forEach(key -> log(key));

        // size(): measure the size of the hashmap
        HashMap<String, String> ex4 = new HashMap<>();
        ex4.put("a", "hello");
        ex4.put("b", "world");
        ex4.put("c", "koala");

        log(ex4.size());

        // isEmpty(): verify if hashmap is empty
        HashMap<String, String> ex5 = new HashMap<>();
        ex5.put("a", "hello");
        ex5.put("b", "world");
        ex5.put("c", "koala");

        log(ex5.isEmpty());

        // keySet(): return a set of keys
        HashMap<String, String> ex6 = new HashMap<>();
        ex6.put("a", "hello");
        ex6.put("b", "world");
        ex6.put("c", "koala");

        log(ex6.keySet());

        // values(): return a set of values
        HashMap<String, String> ex7 = new HashMap<>();
        ex7.put("a", "hello");
        ex7.put("b", "world");
        ex7.put("c", "koala");

        log(ex7.values());

        // entrySet(): return a set of pairs key, value
        HashMap<String, String> ex8 = new HashMap<>();
        ex8.put("a", "hello");
        ex8.put("b", "world");
        ex8.put("c", "koala");

        log(ex8.entrySet());

        // putAll(hashmap): add new entries from another hashmap
        HashMap<String, String> ex9 = new HashMap<>();
        ex9.put("a", "hello");
        ex9.put("b", "world");
        ex9.put("c", "koala");

        HashMap<String, String> ex10 = new HashMap<>();
        ex10.put("d", "master");
        ex10.put("e", "build");
        ex10.put("f", "pc");

        ex9.putAll(ex10);
        log(ex9);

        // clear(): delete all entries
        HashMap<String, String> ex11 = new HashMap<>();
        ex11.put("a", "hello");
        ex11.put("b", "world");
        ex11.put("c", "koala");

        ex11.clear();
        log(ex11);

        // replace(key, new value): replace the value of a specific key
        HashMap<String, String> ex12 = new HashMap<>();
        ex12.put("a", "hello");
        ex12.put("b", "world");
        ex12.put("c", "koala");

        ex12.replace("b", "cuya");
        log(ex12);

        // replace(key, new value): replace the value of a specific key
        HashMap<String, String> ex13 = new HashMap<>();
        ex13.put("a", "hello");
        ex13.put("b", "world");
        ex13.put("c", "koala");

        ex13.replace("b", "cuya");
        log(ex13);

        // getOrDefault(value): try to get a specific value related with its key, but if not found return a default value
        HashMap<String, String> ex14 = new HashMap<>();
        ex14.put("a", "hello");
        ex14.put("b", "world");
        ex14.put("c", "koala");

        log(ex14.getOrDefault("d", "not found value :("));

        // computeIfAbsent(key to find, (key -> "action to perform if not exists")): verify key existence and if not exists,
        // a new key and value will be created for it, if the new computed value is null the key and value get deleted
        HashMap<String, String> ex15 = new HashMap<>();
        ex15.put("a", "hello");
        ex15.put("b", "world");
        ex15.put("c", "koala");

        ex15.computeIfAbsent("z", key -> "master choi");
        ex15.computeIfAbsent("a", key -> "master julius");
        log(ex15);

        // computeIfPresent(key to find, (key, value) -> "action to perform if exists"): verify key existence and if exists,
        // a new value will replace the old one, if the new computed value is null the key and value get deleted
        HashMap<String, String> ex16 = new HashMap<>();
        ex16.put("a", "hello");
        ex16.put("b", "world");
        ex16.put("c", "koala");

        log(ex16.computeIfPresent("a", (key, value) -> null));
        log(ex16);

        // compute(key to find, (key, value) -> "action to perform"): verify key existence and if exists,
        // a new value will replace the old one, and if it doesn't exist a new key, value will be created
        // also, if the new computed value is null the key and value get deleted
        HashMap<String, String> ex17 = new HashMap<>();
        ex17.put("a", "hello");
        ex17.put("b", "world");
        ex17.put("c", "koala");

        ex17.compute("a", (key, value) -> "new value before it gets deleted");
        ex17.compute("a", (key, value) -> null);
        ex17.compute("z", (key, value) -> "value for not existing key");
        log(ex17);

        // replaceAll(key, new value): replace the value of a specific key
        HashMap<String, Integer> ex18 = new HashMap<>();
        ex18.put("a", 1);
        ex18.put("b", 2);
        ex18.put("c", 3);
        ex18.put("d", 4);
        ex18.put("e", 5);
        ex18.put("f", 6);

        ex18.replaceAll((key, value) -> {
            if ((value % 2) == 0) return value;
            return 0;
        });
        log(ex18);
    }
}
