import java.util.Scanner;
class Average {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter two numbers: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    double sum = a + b;
    double avg = sum/2;
    System.out.println("Average: " + avg );
  }
}