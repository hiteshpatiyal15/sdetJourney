package day2Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionExamples {
    public static void main(String[] args) {
        // List
        // Store duplicate values
        // ArrayList maintain insertion order
        List<String> browsers = new ArrayList<>();

        browsers.add("Chrome");
        browsers.add("Safari");
        browsers.add("Edge");

        System.out.println("List collection size: " + browsers.size());
        System.out.println("Browsers from collection List: " + browsers);

        // Set
        // Hashset remove duplicate values
        // Insertion order is not maintain
        Set<String> browsers1 = new HashSet<>();
        browsers1.add("Chrome");
        browsers1.add("Safari");
        browsers1.add("Edge");

        System.out.println("Set collection size: " + browsers.size());
        System.out.println("Browsers from collection Set: " + browsers1);

        // Map
        // Store objects as key value pair
        // Unique key with duplicate value
        // adding a value with an existing key replaces the previous value
        Map<String, String> user = new HashMap<>();

        user.put("username", "qa_user");
        user.put("role", "admin");
        user.put("status", "active");

        System.out.println(user.get("username"));
    }

}
