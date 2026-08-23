import java.util.*;

public class tickets { 
    // Finds the absolute starting point of the journey
    public static String getStart(HashMap<String, String> hs) { 
        HashMap<String, String> reverse = new HashMap<>(); 
        
        // Create a reverse map (Destination -> Departure)
        for (String key : hs.keySet()) { 
            reverse.put(hs.get(key), key); 
        } 
        
        // Find the departure city that is never a destination
        for (String key : hs.keySet()) { 
            if (!reverse.containsKey(key)) { 
                return key; 
            } 
        } 
        return null; 
    } 

    public static void main(String[] args) { 
        HashMap<String, String> hs = new HashMap<>(); 
        hs.put("Ambajogai", "Kolhapur"); 
        hs.put("Jalna", "Ambajogai"); 
        
        // Note: Modified "kolkatta" to connect logically to the chain.
        // If left as "kolkatta -> Mumbai", you have two separate chains, 
        // and the loop behavior will break with NullPointerExceptions.
        hs.put("Mumbai", "Jalna"); 

        String start = getStart(hs); 
        System.out.print(start); 

        // Print the chronological itinerary chain
        for (int i = 0; i < hs.size(); i++) { 
            System.out.print(" -> " + hs.get(start)); 
            start = hs.get(start); 
        } 
    } 
}
