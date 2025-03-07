import java.util.*;

public class MathsHomework {
  public static void main(String[] args) {
    Random rand = new Random();
    int number1 = rand.nextInt(10);
    int number2 = rand.nextInt(10);
    System.out.println("What is " + number1 + " + " + number2 + "?");
    Scanner scanner = new Scanner(System.in);
    int answer = scanner.nextInt();
    if (number1 + number2 == answer) {
      System.out.println("Correct!");
    } else {
      System.out.println("Incorrect, the answer is " + (number1 + number2));
    }
  }
}