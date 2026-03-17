import java.util.Scanner;
import java.util.Stack;

public class staCK {
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);

        Stack<Integer> A=new Stack<>();

        int B= sc.nextInt();

        for(int i=0;i<B;i++){
            A.push(sc.nextInt());
        }

        System.out.println("size of elemets:"+ A);
        System.out.println("size of elemets:"+ A.pop());
        System.out.println("size of elemets:"+ A.push(10));
        System.out.println("size of elemets:"+ A.peek());
        System.out.println("size of elemets:"+ A);
        System.out.println("Is Empty: " + A.empty());

        System.out.println("Search 10: " + A.search(10));


        
        
        
        
    }
}
