import java.util.Scanner;
class Main {
	public static void main (String[] args)
    {
	    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l=n%10;
      
      while(n>10)
    {
        n=n/10;
	}
      int sum=n+l;
      System.out.println(sum);
}
}