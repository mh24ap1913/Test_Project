package in.co.brings;

import java.util.LinkedHashMap;

public class CharacterFrequency {
	
	static void frequency(String str,int n) {
		
		LinkedHashMap<Character,Integer> lhm=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<n;i++) {
			Integer j=lhm.get(str.charAt(i));
			if(j==null)
			{
				lhm.put(str.charAt(i),1);
			}
			else {
				lhm.put(str.charAt(i),j+1);
			}
			for(Character c:lhm.keySet()) {
				System.out.println(""+c+lhm.get(c));
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		String str="dfghjklvbnmghjdfgh";
		int n=str.length();
		frequency(str,n);
	}

}
