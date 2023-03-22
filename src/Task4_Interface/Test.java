package Task4_Interface;

public class Test implements Mul{
	public int mul1(int i1, int i2){
      		return i1 * i2;
   	}
  	public int mul2(int i1, int i2, int i3){
      		return i1 * i2 * i3;
   	}
  	public void display()
  	{
  		System.out.println("Display Method");
  	}
   	public static void main(String args[]){
     	 	Mul obj = new Test();
     	 	obj.display();
      		System.out.println(obj.mul1(3, 7));
     		System.out.println(obj.mul2(1, 9, 1));
     		
   	}
}
