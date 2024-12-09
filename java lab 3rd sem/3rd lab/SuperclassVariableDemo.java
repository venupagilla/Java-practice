class A{
	A(){
		System.out.println("In super class");
	}
	int a=10,b=20;
}
class B extends A{
	int c=30,d=40;
	int e=super.a;
	int f=super.b;
	void sum(){
		
		System.out.println("sum of a+b+c+d is : "+(c+d+e+f));
	}
}
class SuperclassVariableDemo{
	public static void main(String args[]){
		B ob=new B();
		ob.sum();
	}
}
