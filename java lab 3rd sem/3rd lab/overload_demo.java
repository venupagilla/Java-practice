class maths{
	void sum(int a,int b){
		System.out.println("Sum of a + b is "+(a+b));
	}
	
	void sum(int a, int b,int c){
		System.out.println("sum of a + b + c is "+(a+b+c));
	}
}
class overload_demo{
	public static void main(String args[]){
		maths m1=new maths();
		m1.sum(5,10);
		m1.sum(5,10,15);
	}
}
	