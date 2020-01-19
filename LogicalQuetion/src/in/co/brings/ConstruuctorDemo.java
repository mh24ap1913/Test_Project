package in.co.brings;

public class ConstruuctorDemo {
	
	String name;
	Double price;
	Integer quantity;
	public ConstruuctorDemo(String n,Double d,Integer q) {
		name=n;
		price=d;
		quantity=q;
	}
	public void setMethod() {
		System.out.println("Name:-"+name);
		System.out.println("Price:-"+price);
		System.out.println("Quantity:-"+quantity);
	}
	public static void main(String[] args) {
		ConstruuctorDemo d=new ConstruuctorDemo("vikas",12.5,4);
		d.setMethod();
	}

}
