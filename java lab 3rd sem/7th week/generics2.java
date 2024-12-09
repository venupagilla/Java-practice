class gen<Y>{
    Y name;
    gen(Y name){
        this.name=name;
    }
    public Y printing(){
        return name;
    }
}


public class generics2 {
   public static void main(String args[]){
    gen<String> stob=new gen<>("Venu");
    gen<Integer> inob=new gen<>(100);
    System.out.println("Name is : "+stob.printing());
    System.out.println("Marks of the student is : "+inob.printing());
   } 
}
