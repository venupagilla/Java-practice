public class Annotations {

    @Override
    public String toString() {
        return "This is the overridden toString method.";
    }

    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated.");
    }

    public static void main(String[] args) {
        Annotations obj = new Annotations();
        
        // Using @Override
        System.out.println(obj.toString());
        
        // Using @Deprecated
        obj.oldMethod();
    }
}
