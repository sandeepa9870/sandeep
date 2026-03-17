import static java.lang.System.out;

public class arithmaticOP {
  public static void main(String[] args){

      int a = 21 , b=30, c=49;

      System.out.println ("Add:" + (a+b));
      System.out.println ("div: "+ (a/b));
      System.out.println("mul *" + (a*b));
      System.out.println("sub:" + (a-c-b));
      System.out.println ("Mod: "+ (c%b));

      //relations operators (boolen result)//

      System.out.println("grather:"+ (a>c));
      System.out.println("less:"+ (b<c));
      System.out.println("equl:"+(a=b));
      System.out.println("grather thn or eql:"+ (b>c));
      System.out.println("lessthan or equl:"+ (b<a) );

      // short code //
      System.out.printf("%d %d %d  %b %b %b  %n" ,a+b,b+c ,c-a, a=b ,a>c ,c<a);











      //System.out.println(a+b);
      //System.out.println(a-b);
      //System.out.println(a/b);
      //System.out.println(a%b);
      //System.out.println(a*b);

      // Relations operators//boolen//

      //System.out.println(a>b);
      //System.out.println(a<b);
      //System.out.println(a>=b);
      //System.out.println(a<=b);
      //System.out.println(a!=b);
      //System.out.println(a==b);
  }

}
