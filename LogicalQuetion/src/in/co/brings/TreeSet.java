package in.co.brings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TreeSet {
	public static void main(String[] args) {
		 Set<String> hash_Set = new HashSet<String>(); 
	        hash_Set.add("Geeks"); 
	        hash_Set.add("For"); 
	        hash_Set.add("Geeks"); 
	        hash_Set.add("Example"); 
	       // hash_Set.add("Set"); 
	        System.out.print("Set output without the duplicates"); 
	  
	        System.out.println(hash_Set); 
	  
	        // Set deonstration using TreeSet 
	        System.out.print("Sorted Set after passing into TreeSet"); 
	        Set<String> tree_Set = new LinkedHashSet<String>(hash_Set); 
	        System.out.println(tree_Set); 
	    } 
	} 
