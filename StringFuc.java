public class StringFuc {

    public static void main(String[] args){


        String d= "my name is sandeep";

        System.out.println(d.length());
        System.out.println(d.toLowerCase());
        System.out.println(d.toUpperCase());

        //equl
        String a="sandeep";
        String b="deepu";
        String c="deepu";

        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(a.equalsIgnoreCase(b));
        System.out.println(c.equalsIgnoreCase(b));

        //split (its use for each

//        String s = "Java is easy way";
//        String[] arr = s.split(" ");
//
//        for (String word : arr) {
//            System.out.println(word);
//        }

        //replace

        String e= "        sandeep            ";

         System.out.println(e.replace('e','o'));

         //trim

        System.out.println(e.trim());
         //indexof

        String z = "Sandeepiwsa";
        System.out.println(z.indexOf("iw"));

        //substring

        String x= "sandeep is a good boy handsome person";
        System.out.println(x.substring(2, 6));

        //


    }
}
