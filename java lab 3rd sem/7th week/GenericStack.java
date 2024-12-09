/*Implement a generic Stack class that can hold any type of object. Implement the following methods: 
1) void push(T obj): pushes an object onto the top of the stack 
,2) T pop(): removes and returns the object at the top of the stack 
3) boolean isEmpty(): returns true if the stack is empty, false otherwise*/

import java.util.*;
class Stack<T>{
    ArrayList<T> list1=new ArrayList<>();
    void push(T obj){
        list1.add(obj);
        System.out.println(obj+" is pushed into the stack");
    }
    void pop(){
        if(list1.isEmpty()){
            System.out.println("Cannot pop the stack since it is empty");
        }
        else{
            T elem=list1.get(list1.size()-1);
            list1.remove(list1.size()-1);
            System.out.println("element "+elem+" is popped");
        }
    }
    boolean isEmpty(){
        return list1.isEmpty();
    }
    void printelements(){
        System.out.print("Elements in the stack are : ");
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
    }

}



public class GenericStack {
    public static void main(String args[]){
        Stack<Integer> obj=new Stack<>();
        obj.push(10);
        obj.push(30);
        obj.push(50);
        obj.pop();
        System.out.println("Is stack empty : "+obj.isEmpty());
        obj.printelements();
        }

}
