package program;

public class Test implements Cloneable {
	
	int rollNo;
	String name;
	
	Test (int rollNo,String name ){
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Test t=new Test(101,"Ram");
		
		Test t2=(Test)t.clone();
		
		System.out.println(t.rollNo+" "+t.name);
		System.out.println(t2.rollNo+" "+t2.name);
	}

}
