class MyThread extends Thread{

    public void run() {

        for (int i = 0; i <= 5; i++) {

            System.out.println(+i);}

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("print this ");
        }
        public void run ( int a){
            a = 10;

            System.out.println("print this :" + a);
        }
    }


public class Multithreaded{
    public static void main(String[] args){

        MyThread e=new MyThread();
        MyThread e1=new MyThread();
        e.start();
        e1.start();
        System.out.println(e.getName());
        System.out.println(e.getPriority());

    }
}











//class Mythread extends Thread {
//
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("print: " + i);
//
//            try {
//                Thread.sleep(1000);   // 1 second pause
//            }
//            catch (InterruptedException e) {
//                System.out.println("Exception: " + e);
//            }
//        }
//    }
//}
//
//public class Multithreaded {
//
//    public static void main(String[] args) {
//
//        Mythread e = new Mythread();
//        e.start();
//
//        try {
//            e.join();   // main thread waits until Mythread finishes
//        }
//        catch (InterruptedException ex) {
//            System.out.println("Join Exception: " + ex);
//        }
//
//        System.out.println("Main thread finished");
//    }
//}

























//class mythread extends Thread{
//
//    public void run(){
//        System.out.println("print the thread");
//    }
//
//}
//
//public class Multithreaded {
//
//    public static void main(String[] args){
//
//        mythread t1=new mythread();
//        t1.start();
//    }
//}


