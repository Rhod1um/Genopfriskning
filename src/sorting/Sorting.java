package sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
  private ArrayList<String> words;

  public Sorting(){
    words = new ArrayList<>();
  }
  public void takeInWords (String word1, String word2,
                           String word3, String word4, String word5){
    words.clear();
    words.add(word1);
    words.add(word2);
    words.add(word3);
    words.add(word4);
    words.add(word5);
    printWords(words);
    Collections.sort(words);
    printWords(words);
  }

  private void printWords(ArrayList<String> words){
    System.out.println(words);
  }

}
