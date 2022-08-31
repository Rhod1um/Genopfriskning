import java.util.Scanner;

public class LawnMoving {
  private final double GROWTH_CM_PER_DAY;

  public LawnMoving(){
    GROWTH_CM_PER_DAY = 0.8;
  }

  public double lawnMoving(double maxHeight, double nowHeight){
    double days;
    if (nowHeight >= maxHeight ){
      days = 0;
    }
    else {
      days = (maxHeight - nowHeight) / GROWTH_CM_PER_DAY;
    }
    return days;
  }

  public void go(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Type height of grass in cm: ");
    double nowHeight = sc.nextDouble();
    System.out.print("Type max height of grass in cm: ");
    double maxHeight = sc.nextDouble();

    double days = lawnMoving(maxHeight, nowHeight);
    System.out.println("Days before lawn has to be moved: " + days + " days");
  }

  public static void main(String[] args) {
    new LawnMoving().go();
  }
}

