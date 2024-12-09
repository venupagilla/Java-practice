class mainOverload{
	public static void main(String a){
		System.out.println("i am in overloaded main : "+a);
	}
	public static void main(String a ,String b){
		System.out.println("I am in overloaded main 2 : "+a+" " +b);
	}
	public static void main(String args[]){
		System.out.println("I am in original main method");
		mainOverload.main("hi");
		mainOverload.main("hi","hello");
	}
}