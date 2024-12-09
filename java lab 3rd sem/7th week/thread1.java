/*Write a Java program that creates three threads.
 First thread displays —Good Morning every one second,
 the second thread displays —Hello every two seconds and 
 the third thread displays —Welcome every three seconds.*/

class printmessage implements Runnable{
    String mes;
    int interval;
    printmessage(String r,int k){
        mes=r;
        interval=k;
    }
    public void run(){
        while(true){
        System.out.println(mes);
        try {
            Thread.sleep(interval);
        } catch (Exception e) {
            System.out.println(e);
            break;
        }
    }
    }
}


public class thread1 {
    public static void main(String args[]){
        Thread t1=new Thread(new printmessage("Good Morning",1000));
        Thread t2=new Thread(new printmessage("Hello",2000));
        Thread t3=new Thread(new printmessage("Welcome",3000));
        t1.start();
        t2.start();
        t3.start();

    }
}
