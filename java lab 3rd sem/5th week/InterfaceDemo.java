interface A{
 public void sum(int x,int y);
}
class Sum1 implements A {
	public void sum(int x,int y){
		System.out.printf("sum of %d and %d is %d",x,y,x+y);
	}
}
class InterfaceDemo{
	public static void main(String args[]){
		Sum1 s=new Sum1();
		s.sum(10,20);
	}
}