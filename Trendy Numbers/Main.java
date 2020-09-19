import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      	Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int rem,count=0;
      while(num!=0){
        rem=num%10;
        num=num/10;
        count++;
      }
      if(count==3)
      {
        int x=num%100;
        int y=x%10;
        if(y%3==0)
          System.out.println("Trendy Number");
        else
          System.out.println("Not a Trendy Number");
      }
      else
        System.out.println("Not a Trendy Number");
    }
}