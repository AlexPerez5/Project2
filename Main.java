import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Beginning of Survey//
      System.out.println("Hello, ");
      System.out.println("Welcome to the MiniSurvey website!");

    //Scanner for main questions//
      Scanner scan = new Scanner(System.in);

        System.out.println("What's your FULL name?"); //First Question//
        String name = scan.next();
        name += scan.nextLine();//Use code if more than one word//

        System.out.println("What is your age? Respond with number! "); //Second Question//
        int age = scan.nextInt();
        if(age >= 18){ //If,Else Statement #1//
          System.out.println("You are not a minor!");
        }else{
          System.out.println("You are a minor!");

        }

      Scanner number = new Scanner(System.in);

        System.out.println("Which animal is better cats or dogs?"); //Third Question//
        String animal = scan.next();

        if(animal.equals("dogs")) {//if,else statement for cats and dogs//
          for(int i = 0; i<3; i++){ //Loop code for both dogs are cats//
            System.out.println("You like dogs!");
          }
        }else{
          for(int i = 0; i<3; i++){
            System.out.println("You like cats!");
          }
        }
      
      Scanner percentage = new Scanner(System.in);
      
      System.out.println("What grade percentage is passing for you?");
        int grade = scan.nextInt();
        if(grade >= 70 && grade <= 100) {
          System.out.println("That is in the passing range!");
        }
        else if(grade >= 0 && grade < 70) {
          System.out.println("This is in the failing range!");
        }
  }
}
