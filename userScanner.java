import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class userScanner {
    public static void main(String[] args) throws Exception {

    Scanner sum=new Scanner(System.in);


        BufferedReader ar = new BufferedReader(new InputStreamReader(System.in));

        String name= ar.readLine();
        System.out.println("myname:" +name);

        System.out.println("myname:");

        String name1= sum.nextLine();
        int a= sum.nextInt();
        int b=sum.nextInt();

        System.out.println("result:"+ (a+b));
        System.out.println("sub:"+ (a-b));
        System.out.println("mul:"+ (a*b));
        System.out.println("mul:"+ (a++));
        System.out.println("mul:"+ (++a));


    }



}
