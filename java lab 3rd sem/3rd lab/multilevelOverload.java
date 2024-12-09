import java.util.Scanner;
class A{
	Scanner sc=new Scanner(System.in);
	int a;
	void puta(){
		System.out.print("Enter the value of a : ");
		a=sc.nextInt();
	}
}
class B extends A{
	int b;
	void putb(){
		System.out.print("Enter the value of b : ");
		b=sc.nextInt();
	}
}
class C extends B{
	int c;
	void put(){
		puta();
		putb();
		System.out.print("Enter the value of c : ");
		c=sc.nextInt();
	}
	void sum(){
		System.out.println("sum of a+b+c is : "+(a+b+c));
	}
}
class multilevelOverload{
	public static void main(String args[]){
		C obje=new C();
		obje.put();
		obje.sum();
	}
}

	
	