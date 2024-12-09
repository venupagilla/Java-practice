class A{
	int a=10,b=20;
	void sum(){
		System.out.println("sum of a+b is : "+(a+b));
	}
}
class B extends A{
	int c=30,d=40;
	void sum(){
		System.out.println("sum of a+b+c+d is : "+(a+b+c+d));
	}
}
class SuperclassMethodDemo{
	public static void main(String args[]){
		B ob=new B();
		ob.sum();
	}
}
