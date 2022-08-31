package sorting;

public class Test {

  public void go(){
    Sorting sorting = new Sorting();
    sorting.takeInWords("abekat", "musefælde", "ananas", "slut", "solskin");
    sorting.takeInWords("abe", "fælde", "æble", "lut", "stjerne");
  }

  public static void main(String[] args) {
    new Test().go();
  }
}
