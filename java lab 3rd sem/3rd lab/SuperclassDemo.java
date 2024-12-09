class A{
	A(){
		System.out.println("In super class");
	}
}
class B extends A{
	B(){
		super();
		System.out.println("In base class");
	}
}
class SuperclassDemo{
	public static void main(String args[]){
		B ob=new B();
	}
}
