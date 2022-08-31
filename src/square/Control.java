package square;

public class Control {
  private final UI ui;
  private boolean isRunning;
  private Square square;
  private final short maxLength;
  private int lengthAsInt;
  public Control(){
    ui = new UI();
    isRunning = true;
    maxLength = 20;
  }

  public void start(){
    ui.intro();
    square = new Square();
    menu();
  }
  public void menu() {
    while (isRunning) {
      String length = ui.askLength();
      boolean isInputUsable = testUserInput(length);

      if (length.equals("x")){
        isRunning = false;

      } else if (isInputUsable == false){
        ui.errorWrongLength();

      } else {
        StringBuilder squareToPost = square.createSquare(lengthAsInt);
        ui.createSqaure(squareToPost);
      }
    }
  }

  public boolean testUserInput(String length){
    boolean isInputUsable;
    for(int i=0; i<length.length(); i++){
      switch (length.charAt(i)){
        case '0','1','2','3','4','5','6','7','8','9' -> isInputUsable = true;
        default -> isInputUsable = false;
      }
      if (isInputUsable == false) return false;
    }
    convertToInt(length);
    if (lengthAsInt > maxLength) return false;
    else return true;
  }

  public void convertToInt(String length){
    lengthAsInt = Integer.parseInt(length);
  }

  public static void main(String[] args) {
    new Control().start();
  }
}
