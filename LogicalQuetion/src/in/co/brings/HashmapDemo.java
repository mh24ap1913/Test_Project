package in.co.brings;

import java.util.HashMap;

public class HashmapDemo extends Thread{

	static HashMap<Integer,String> hm=new HashMap<Integer,String>();
	public void run() {
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		
		hm.put( 1000,"vikas");
		hm.put(1001, "rajesh");
		HashmapDemo hmt=new HashmapDemo();
		hmt.start();
		
		 for (Object o : hm.entrySet())  
	        { 
	            Object s=o; 
	            System.out.println(s); 
	            Thread.sleep(1000); 
	        } 
	        System.out.println(hm); 
	
	}
}
