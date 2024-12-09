class A{
	int a=10,b=20;
	void sum(){
		System.out.println("In class A sum is :"+(a+b));
	}
}
class B extends A{
	int c=30,d=40;
	void sum(){
		System.out.println("In class B sum of a+b+c+d is : "+(a+b+c+d));
	}
}
class MethodOverriding{
	public static void main(String args[]){
		B ob=new B();
		ob.sum();
	}
}
