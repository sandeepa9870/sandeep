import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class quaq {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //priority  queue
        Queue<Integer> A = new PriorityQueue<>();
        int B= sc.nextInt();

        //print the element
        for(int i=0;i<B;i++){
            A.add(sc.nextInt());
        }

        System.out.println(A);
        System.out.println(A.peek());
        System.out.println(A);
        System.out.println(A.remove());
        System.out.println(A);
        System.out.println(A.poll());
        System.out.println(A);

        //array dequw also same but we are useing addfirst and add last same li prioroty queue add remove frist and last also:




    }
}
