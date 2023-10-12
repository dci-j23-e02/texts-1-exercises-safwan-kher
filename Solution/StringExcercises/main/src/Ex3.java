import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please create your bridg string :");
    String BridgeStatus = scanner.nextLine();
    if(Ex3.isSafeBridge(BridgeStatus)){
      System.out.println("The bridge is safe ");
    }else{
      System.out.println("The bridge is not safe ");
    }


  }

  // write your isSafeBridge method here
  public static boolean isSafeBridge(String str){
    return str.indexOf(" ") == -1;
  }
}
