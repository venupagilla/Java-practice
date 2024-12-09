class gen<T>{
    T ob;
    gen(T ob1){
        ob=ob1;
    }
    public T printing(){
        return ob;
    }
}

public class generics {
    public static void main(String args[]){
        gen<String> a1=new gen<String>("hello world");
        System.out.println(a1.printing());

    }

}
