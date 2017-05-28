import java.util.Scanner;
 
class EvenOdd
{
  public static void main(String args[])
  {
    int z;
    System.out.println("Input an integer");
    Scanner in = new Scanner(System.in);
    z = in.nextInt();
 
    if ( (z/2)*2 == z )
      System.out.println("The Number is Even");
    else
      System.out.println("The Number is 3Odd");
  }
}