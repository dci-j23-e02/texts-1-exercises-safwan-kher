import java.util.Scanner;

public class Ex5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter your name: ");
    String name = scanner.nextLine();

     // comparing Strings in Java doesn't work with '=='
    // to do so , you can use equals which returns false if they are not equal
   if(name.equals("Youssef") ){
      System.out.println("Hello "+name+ ", you are my favourit student!!");
    }else{
      System.out.println("Hello "+name+ ", You are one of my students.");
    }
  }
}
