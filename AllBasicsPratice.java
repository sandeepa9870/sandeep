import java.util.Scanner;

public class AllBasicsPratice {

    public static void main(String[] args) {
        // primitive data types// byte :-
        //taking only -128 to 127
        byte number = 100;
        byte min = 127;
        byte max = -128;

        System.out.println("number" + number);
        System.out.println("min number" + min + "max number" + max);

        //int
        int num = 10000;
        int num1 = 10000000;
        int num2 = 100000000;
        int maxvalue = Integer.MIN_VALUE;

        System.out.println("value: " + num);
        System.out.println("sub: " + num1 + num2);
        System.out.println("min value" + Integer.MIN_VALUE);
        System.out.println("max value" + Integer.MAX_VALUE);

        //SHORT

        short age = 30;
        short year = 1995;
        short qwe = 27 - 9 - 1995;

        System.out.println("min value" + Short.MIN_VALUE);
        System.out.println("max value" + Short.MAX_VALUE);
        System.out.println("value " + qwe);

        //double uses 8 bytes (64 bits) of memory.

        double di = 10.1234;
        double per = 99.234;

        double maxValue = Double.MAX_VALUE;
        double minvalue = Double.MIN_VALUE;
        double subnvalue = -Double.MIN_VALUE;


        System.out.println("minvalue:" + Double.MIN_VALUE);
        System.out.println("maxvalue:" + Double.MAX_VALUE);
        System.out.println("maxvalue:" + -Double.MAX_VALUE);
        System.out.println("min:" + di);
        System.out.println("max:" + per);

// float - 4 bytes (decimal, ~6-7 digits precision)

        float myFloat = 3.14f;  // 'f' suffix is required
        float temperature = 98.6f;
        float pi = 3.1415927f;
        System.out.println("\nfloat value: " + myFloat);
        System.out.println("Temperature: " + temperature);

        //char - 2 bytes (single character, Unicode)
        // ============================================
        char myChar = 'A';
        char digit = '9';
        char symbol = '@';
        char unicode = '\u0041'; // Unicode for 'A'
        System.out.println("\nchar value: " + myChar);
        System.out.println("digit: " + digit);
        System.out.println("symbol: " + symbol);
        System.out.println("unicode: " + unicode);

        //boolean - 1 bit (true or false)
        // ============================================
        boolean isJavaFun = true;
        boolean isRaining = false;
        boolean isAdult = (20 >= 18); // evaluates to true
        System.out.println("\nisJavaFun: " + isJavaFun);
        System.out.println("isRaining: " + isRaining);
        System.out.println("isAdult: " + isAdult);

        // Boolean from expressions
        int ag = 20;
        boolean Adult = (ag >= 18);          // true
        boolean isTeenager = (ag >= 13 && ag <= 19);  // false
        boolean isSenior = (ag >= 60);         // false

        System.out.println("\nAge: " + age);
        System.out.println("Is Adult? " + Adult);
        System.out.println("Is Teenager? " + isTeenager);
        System.out.println("Is Senior? " + isSenior);

        // Boolean from comparison
        int a = 10, b = 20;
        boolean isEqual = (a == b);
        boolean isGreater = (a > b);
        boolean isLess = (a < b);
        boolean isNotEqual = (a != b);

        System.out.println("\na = " + a + ", b = " + b);
        System.out.println("a == b? " + isEqual);
        System.out.println("a > b?  " + isGreater);
        System.out.println("a < b?  " + isLess);
        System.out.println("a != b? " + isNotEqual);


        // String


        // Creating Strings
        String name = "Anil";                      // String literal
        String city = new String("Hyderabad");     // Using new keyword

        System.out.println("Name: " + name);
        System.out.println("City: " + city);

        // Common String methods
        System.out.println("\n--- String Methods ---");
        System.out.println("Length: " + name.length());              // 4
        System.out.println("Uppercase: " + name.toUpperCase());     // ANIL
        System.out.println("Lowercase: " + name.toLowerCase());     // anil
        System.out.println("Char at 0: " + name.charAt(0));         // A
        System.out.println("Index of 'n': " + name.indexOf('n'));   // 1
        System.out.println("Contains 'ni': " + name.contains("ni")); // true
        System.out.println("Starts with 'A': " + name.startsWith("A")); // true
        System.out.println("Ends with 'l': " + name.endsWith("l"));     // true

        // String comparison
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");

        System.out.println("\n--- String Comparison ---");
        System.out.println("s1 == s2: " + (s1 == s2));           // true (same pool reference)
        System.out.println("s1 == s3: " + (s1 == s3));           // false (different objects)
        System.out.println("s1.equals(s3): " + s1.equals(s3));   // true (same content)

        // String concatenation
        String firstName = "Anil";
        String lastName = "Kumar";
        String fullName = firstName + " " + lastName;
        String usingConcat = firstName.concat(" ").concat(lastName);

        System.out.println("\n--- Concatenation ---");
        System.out.println("Using +: " + fullName);
        System.out.println("Using concat(): " + usingConcat);

        // Substring
        String sentence = "Java Programming";
        System.out.println("\n--- Substring ---");
        System.out.println("substring(0,4): " + sentence.substring(0, 4));  // Java
        System.out.println("substring(5): " + sentence.substring(5));       // Programming

        // Replace and Trim
        String messy = "  Hello World  ";
        System.out.println("\n--- Replace & Trim ---");
        System.out.println("Trimmed: '" + messy.trim() + "'");
        System.out.println("Replace: " + sentence.replace("Java", "Python"));

        //if connedition;Executes a block of code only if the condition is true.//

        int sandeep = 23;

        if (sandeep >= 25) {

            System.out.println("your elglible");
        } else if (sandeep >= 20) {
            System.out.println("your not elglible");
        } else {
            System.out.println("done");
        }

        //How to take the code from user //

        Scanner id = new Scanner(System.in);

        int myName= id.nextInt();

        System.out.println("result:" + myName );

//        System.out.print("Enter item price: ");
//        double price = sc.nextDouble();
//
//        System.out.print("Enter quantity: ");
//        int qty = sc.nextInt();
//
//        double total = price * qty;
//        System.out.println("Total bill: ₹" + total);

        //if condition in scanner;

        Scanner idser = new Scanner(System.in);

        float persentage =idser.nextFloat();

        if (persentage > 35.0f){System.out.println("re:" +persentage+"%");} else if (persentage>20.0f)
        {System.out.println("re:"+ persentage+"%");}
        else{System.out.println("done");

        }

        int w= 4;

        {System.out.println("doen:"+w++);}


    }
}





