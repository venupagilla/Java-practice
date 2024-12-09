import java.util.Scanner;
class A{
	Scanner ob=new Scanner(System.in);
	int a;
}
class B extends A{
	void put(){
		System.out.print("Enter value of a : ");
		a=ob.nextInt();
	}
	void get(){
		System.out.println("value of a is : "+a);
	}
}
class singleInherit{
	public static void main(String args[]){
		B obje=new B();
		obje.put();
		obje.get();
	}
}
