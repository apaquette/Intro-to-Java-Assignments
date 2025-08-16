import java.util.Scanner;
/**
 * Asks for five numbers from the user, then displays how many positive, negative, or zero values were entered.
 * @author Alexandre Paquette
 * @version 02/08/2022
 *
 */
public class NegativePositiveZero{
  /**
   * Main method for NegativePositiveZero program
   * @param args the command line arguments
   */
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int num1, num2, num3, num4, num5;
    int positive = 0, negative = 0, zero = 0;

    System.out.print("Enter a Number: ");
    num1 = in.nextInt();
    System.out.print("Enter a Number: ");
    num2 = in.nextInt();
    System.out.print("Enter a Number: ");
    num3 = in.nextInt();
    System.out.print("Enter a Number: ");
    num4 = in.nextInt();
    System.out.print("Enter a Number: ");
    num5 = in.nextInt();

      if(num1 > 0){
        positive++;
      }
      if(num1 < 0){
        negative++;
      }
      if(num1 == 0){
        zero++;
      }

      if(num2 > 0){
        positive++;
      }
      if(num2 < 0){
        negative++;
      }
      if(num2 == 0){
        zero++;
      }

      if(num3 > 0){
        positive++;
      }
      if(num3 < 0){
        negative++;
      }
      if(num3 == 0){
        zero++;
      }

      if(num4 > 0){
        positive++;
      }
      if(num4 < 0){
        negative++;
      }
      if(num4 == 0){
        zero++;
      }

      if(num5 > 0){
        positive++;
      }
      if(num5 < 0){
        negative++;
      }
      if(num5 == 0){
        zero++;
      }

    System.out.printf("Count of Positive Numbers: %d%n", positive);
    System.out.printf("Count of Negative Numbers: %d%n", negative);
    System.out.printf("Count of Zero Numbers: %d%n", zero);
  }
}
