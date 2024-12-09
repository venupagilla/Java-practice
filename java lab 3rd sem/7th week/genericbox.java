/*Create a generic class called Box that can hold any type of object.
Implement the following methods: 
1) void set(T obj): sets the object stored in the box
2) T get(): retrieves the object stored in the box 
3) boolean isEmpty(): returns true if the box is empty, false otherwise*/
class box<T> {
        T obj;
    public void set(T obj) {
        this.obj = obj;
    }
    public T get() {
        return obj;
    }
    public boolean isEmpty() {
        return obj == null;
    }
}

public class genericbox {
    public static void main(String args[]){
        box<Integer> inob=new box<>();
        System.out.println("is object empty : "+inob.isEmpty());
        inob.set(100);
        System.out.println("is object empty : "+inob.isEmpty());
        System.out.println("The value you stored is : "+inob.get());
    }
}
