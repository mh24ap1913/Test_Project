package in.co.brings;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateValue {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("vikas");
		al.add("ghodke");
		al.add("vikas");
		System.out.println(al.toString());
		Set<String> s=new LinkedHashSet<String>(al);
		System.out.println(s);
		
		
	}
}
