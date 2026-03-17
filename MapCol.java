import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapCol {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
//
//        Map<Integer,String> m=new HashMap<>();
//
//        m.put(101 ,"sandeep");
//        m.put(102,"srikanth");
//        m.put(103,"gowtham");
//
//        //print the value with for each
//
//        for (int key : m.keySet()){
//            System.out.println(key);}
//
//        for (Map.Entry<Integer, String> e : m.entrySet()) {
//            System.out.println(e.getKey() + " = " + e.getValue());}
//
//        //🔁 Iterating a Map
//
//        System.out.println(m.get(2));
//        System.out.println(m.remove(101));
//        System.out.println(m.get(102));
//        System.out.println(m);
//        System.out.println(m.keySet() +"====="+m.values());
//        System.out.println(m.entrySet());
//        System.out.println(m.containsKey(103));

        Map<Integer,String> map =new HashMap<>();

        //take the int value

        int A= sc.nextInt();
        sc.nextLine();

        //print the value

        for (int i=0;i<A;i++);
        int key = sc.nextInt();
        String Value = sc.nextLine();

        map.put(key,Value);


        //print the value

        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());}






    }



}
