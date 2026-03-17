import java.util.*;

public class CollePratice {
    public static void main(String[] args){

//        ArrayList<Integer> A=new ArrayList<>();
//
//        A.add(100);
//        A.add(200);
//        A.add(100);
//        A.add(400);
//
//        //print the values;
//
//        System.out.println(A);
//        System.out.println(A.remove(2));
//        System.out.println(A);
//        System.out.println(A.add(500));
//        System.out.println(A.contains(2));
//        System.out.println(A);
//        System.out.println(A.isEmpty());
//        System.out.println(A);
//        A.clear();
//        System.out.println(A);

        //Scanner

//        Scanner sc=new Scanner(System.in);
//
//        ArrayList <Integer> B=new ArrayList<>();
//
//        //intger values
//
//        int c = sc.nextInt();
//
//        for(int i=0;i<c;i++){
//            B.add(c);
//        }
//
//                  System.out.println(B);

        //set as  3 types: hashset ,linked hashset,treeset

        Set<Integer> E=new HashSet<>();

        E.add(200);
        E.add(100);
        E.add(200);
        E.add(300);

        System.out.println(E);

        Set<Integer> set = new LinkedHashSet<>();//Insertion order

        set.add(20);
        set.add(10);
        set.add(30);
        set.add(10); // duplicate

        System.out.println(set);

        Set<Integer> sete = new TreeSet<>();//sort oder

        sete.add(10);
        sete.add(20);
        sete.add(30);
        sete.add(10); // duplicate

        System.out.println(sete);


        Scanner Q=new Scanner(System.in);
        Set<Integer> H=new HashSet<>();//unorder

        int y=Q.nextInt();

        //Print the values;

        for(int i=0;i<y;i++){
            H.add(Q.nextInt());
        }
    }
}









