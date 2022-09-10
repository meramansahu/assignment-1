import java.util.Scanner;
class greater{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter The Two Numbers:");
     int a=sc.nextInt();
     int b=sc.nextInt();
        if(a>b)
           {
              System.out.println("The First Number Is Greater Than The Second Number.");              
           }

        else if(b>a)
          {
             System.out.println("The Second Number Is Greater Than The First Number.");
          }

        else
         {
            System.out.println("Both are Equal.");
         }

 }

}