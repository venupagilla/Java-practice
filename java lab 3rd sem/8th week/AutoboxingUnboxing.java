public class AutoboxingUnboxing {
    public static void main(String[] args) {
        int num1 = 10;
        Integer numObj = num1;
        
        System.out.println("Autoboxed Integer: " + numObj);
        
        Integer numObj2 = 20;
        int num2 = numObj2;
        
        System.out.println("Unboxed int: " + num2);
        
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(numObj);
        
        int num3 = list.get(0);
        
        System.out.println("Value from ArrayList after unboxing: " + num3);
    }
}
