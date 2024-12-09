import java.util.Scanner;
class Student{
	Scanner sc=new Scanner(System.in);
	int id;
	void putId(){
		System.out.print("Enter the Student id : ");
		id=sc.nextInt();
		sc.nextLine();
	}
}
class Engineering extends Student{
	String subject;
	void put(){
		putId();
		System.out.print("Enter the subject of engineering student : ");
		subject=sc.nextLine();
	}
	void display(){
		System.out.println("id is : "+id);
		System.out.println("Engineering subject is : "+subject);
	}
}
class Science extends Student{
	String subject;
	void put(){
		putId();
		System.out.print("Enter the subject of science student : ");
		subject=sc.nextLine();
	}
	void display(){
		System.out.println("id is : "+id);
		System.out.println("Science subject is : "+subject);
	}
}
class Arts extends Student{
	String subject;
	void put(){
		putId();
		System.out.print("Enter the subject of arts student : ");
		subject=sc.nextLine();
	}
	void display(){
		System.out.println("id is : "+id);
		System.out.println("Arts subject is : "+subject);
	}
}
class hierarOverload{
	public static void main(String args[]){
		Engineering e1=new Engineering();
		e1.put();
		Science s1=new Science();
		s1.put();
		Arts a1=new Arts();
		a1.put();
		e1.display();
		s1.display();
		a1.display();
	}
}

	
	