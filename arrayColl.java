import java.util.ArrayList;
import java.util.Scanner;

public class arrayColl {
    public static void main(String[] args){

      ArrayList<Integer>  A=new ArrayList<>();
//
//        A.add(10);
//        A.add(20);
//        A.add(30);
//        A.add(40);
//        A.add(50);
//
//        //print the elements
//
//        System.out.println("print values:"+ A);
//        //remove
//        System.out.println("remove:"+A.remove(2));
//        //add
//        System.out.println(A.add(100));
//        System.out.println(A.add(90));
//        System.out.println();
//        System.out.println("print :"+ A);
//        System.out.println("asd:" + A.set(4,70) );
//        A.add(1,345);
//        System.out.println("print :"+ A);

        Scanner Deepu = new Scanner(System.in);

        ArrayList<Integer> D= new ArrayList<>();

        //Taking size from user;

        int Q=Deepu.nextInt();

        //print the size;

        for(int i=0 ;i<Q;i++){
            D.add(Deepu.nextInt());


        }
        System.out.println("size:"+D);

        //Remove elements:

        while (D.size() > 2)
            System.out.println(D.remove(2));







































////        ArrayList<Integer>  A=new ArrayList<>();
////
////        A.add(10);
////        A.add(20);
////        A.add(50);
////        A.add(90);
////
////        System.out.println("result:" + A);
////        System.out.println("result get value :" + A.get(2));
////        System.out.println("res:"+ A.remove(2));
//
//        ArrayList<Integer>  B=new ArrayList<>();
//
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("enter integer value");
//        int san=sc.nextInt();
//
//        //values ex
//
//        for(int i =0;i<san;i++){
//            System.out.println("print it");
//            B.add(sc.nextInt());
//
//        }
//       System.out.println("value:" + B);
//
//        B.remove(1);
//        System .out.println("1st remove"+B);
//        B.add(2 ,100);
//        System .out.println("1st Add"+ B);


    }
}
