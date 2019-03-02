import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
       int n = in.nextInt();
      while(n>100)
      {
        n=n/10;
      }
      int c2 = n%10;
      
      System.out.println(c2);
    }
}