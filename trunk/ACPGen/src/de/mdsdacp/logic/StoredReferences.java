package de.mdsdacp.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StoredReferences {
    private static HashMap<String, List<String>> references = new HashMap<String, List<String>>();

    public static void putReference(String key, String value) {
        if (references.containsKey(key)) {
            references.get(key).add(value);
        } else {
            List<String> list = new ArrayList<String>();
            list.add(value);
            references.put(key, list);
        }
    }

    public static List<String> getReferences(String key) {
        return references.get(key);
    }
    
    public static void clearReferences(){
    	references.clear();
    }

}
