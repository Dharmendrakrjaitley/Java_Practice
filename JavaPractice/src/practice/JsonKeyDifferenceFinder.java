package practice;
//import org.json.JSONObject;
import java.util.*;

//1. Given two string in json format. Return all keys in json, which are present in both strings but have different value.
//
//Input : s1 – {“a”:”d”, “e”:”r”}
//
//s2 = {“a”:”c”, “e”:”r”, “K”:”s”}
//
//Output : “a”

//public class JsonKeyDifferenceFinder {
//
//	
//		public static List<String> findKeysWithDifferentValues(String s1, String s2) {
//	        // Parse the JSON strings into JSONObject
//	        JSONObject json1 = new JSONObject(s1);
//	        JSONObject json2 = new JSONObject(s2);
//	        
//	        List<String> differentKeys = new ArrayList<>();
//	        
//	        // Get the intersection of keys from both JSON objects
//	        Set<String> commonKeys = json1.keySet();
//	        commonKeys.retainAll(json2.keySet());
//	        
//	        // Compare values for the common keys
//	        for (String key : commonKeys) {
//	            if (!json1.get(key).equals(json2.get(key))) {
//	                differentKeys.add(key);
//	            }
//	        }
//	        
//	        return differentKeys;
//	    }
//	    
//	    public static void main(String[] args) {
//	        String s1 = "{\"a\":\"d\", \"e\":\"r\"}";
//	        String s2 = "{\"a\":\"c\", \"e\":\"r\", \"K\":\"s\"}";
//	        
//	        List<String> result = findKeysWithDifferentValues(s1, s2);
//	        System.out.println(result);  // Output: [a]
//	    }
//
//	
//
//}
