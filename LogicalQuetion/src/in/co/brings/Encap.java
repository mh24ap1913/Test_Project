package in.co.brings;

public class Encap {

	public static void main(String[] args) {
		EncapsultionDemo demo=new EncapsultionDemo();
		demo.setAge(10);
		demo.setName("vikas");
		
		System.out.println("age:-"+demo.getAge()+"name:-"+
		demo.getName());
	}
}
