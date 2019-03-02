import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
       int n = in.nextInt();
       int sum=0;
      int a;
      while(n!=0)
      {
        a=n%10;
        sum=sum+a;
        n=n/10;
        
	}
      System.out.println(sum);
}
}