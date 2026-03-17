import java.util.*;

public class test {
    public static void main(String[] args){

        //set has three types hash set , linked hash set,tree set
        //Hash set;

        Set<String> fruits=new HashSet<>();

        fruits.add("apple");
        fruits.add("orange");
        fruits.add("Green apple");
        fruits.add("apple");

        System.out.println(fruits);
         //useing methods//
        System.out.println(fruits.remove("orange"));
        System.out.println(fruits.contains("apple"));


        //scanne use

        Scanner sc=new Scanner(System.in);
        Set<Integer>  id=new HashSet<>();

        int A= sc.nextInt();

        for(int i =0;i<A;i++){
            id.add(sc.nextInt());

        }

    }
}