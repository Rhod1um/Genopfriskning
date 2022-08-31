package square;

public class Square {
  private char character;

  public StringBuilder createSquare(int length){
    StringBuilder stringBuilder = new StringBuilder();

    for(int i=0; i<length; i++){
      stringBuilder.append("*  ".repeat(length));
      stringBuilder.append("\n");
    }
    return stringBuilder;
  }

  public void setCharacter(char character){
    this.character = character;
  }
}
