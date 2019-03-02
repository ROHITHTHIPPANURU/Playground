import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int n1=in.nextInt();
    int n2=n1%10;
    int n3=n1/10;
    int n4=n3%10;
    int n5=n1/100;
    int sum=n2*100+n4*10+n5;
    System.out.println(sum);
    
    
  }
}