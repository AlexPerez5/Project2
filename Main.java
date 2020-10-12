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

        System.out.println("What is your age? Respond with number! "); //Second Question//
        scan.nextInt();
        String age = "18";
        if(age == "18"){
          System.out.println("You are not a minor!");
        }else{
          System.out.println("You are a minor!");

        }
  }
}