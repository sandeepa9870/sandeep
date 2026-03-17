import java.util.*;


public class setcolle {
    public static void main(String[] args){

//        Scanner sc=new Scanner(System.in);
//        //take the set
//        Set<Integer> Q= new HashSet<>();
//
//        //create intiger
//
//        int A= sc.nextInt();
//
//        //create a size of elements.
//        for(int i=0;i<A;i++){
//            Q.add(sc.nextInt());
//
//
//        }
//
//        System.out.println(Q);
//
//        while (Q.size()<2){
//            System.out.println("remove" +Q.remove(2));}
//
//        System.out.println(Q);
//        System.out.println(Q.contains(10));
//        Scanner sc=new Scanner(System.in);
//
//        Set<Integer>  A=new TreeSet<>();
//
//        int B=sc.nextInt();
//
//        for(int i=0;i<B;i++){
//
//            A.add(sc.nextInt());
//
//        }
//        System.out.println(A);

        Scanner A=new Scanner(System.in);

        Set<Integer> B=new LinkedHashSet<>();

        int c=A.nextInt();

        for(int i=0;i<c; i++)
        {B.add(A.nextInt());}

        System.out.println(B);
        B.remove(10);
        System.out.println(B);
        B.add(70);
        System.out.println(B);
        System.out.println("con"+B.contains(10));
        System.out.println("con"+B.isEmpty());









    }
}
