import java.util.Scanner;
import java.util.Random;
class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    Random random = new Random();

    boolean isRight = false;

    int randomNumber = random.nextInt(20);

    System.out.println("Guest the number between 0 and 20");
    while(!isRight){
      System.out.print("Enter your number : ");
      int number = scanner.nextInt();

      if(number == randomNumber){
        System.out.println("Congratulations, you are right");
        isRight = true;
      }else if(number > randomNumber){
        System.out.println("Your number is to big");
      }else{
        System.out.println("Your number is to small");
      }
    }
  }
}
