package square;

import java.util.Scanner;

public class UI {
  private Scanner sc = new Scanner(System.in);

  public void intro(){
    System.out.println("-Square-");
    System.out.println("Type x to quit");
  }

  public String askLength(){
    System.out.print("Type length of square (between 1 and 20): ");
    return sc.nextLine();
  }

  public void errorWrongLength(){
    System.out.println("Length not usable.\n");
  }

  public void createSqaure(StringBuilder stringBuilder){
    System.out.println("\n" + stringBuilder);
  }

}
