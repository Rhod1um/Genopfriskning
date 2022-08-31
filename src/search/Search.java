package search;

import java.util.ArrayList;

public class Search {
  private ArrayList<String> wordList;//

  public Search(){
    wordList = new ArrayList<>();
  }

  public void search (String word, ArrayList<String> wordList) throws Exception {
      if (wordList.contains(word)){
        int index = wordList.indexOf(word);
        printResult(word, index);
      } else throw new Exception(word + " is not in the wordlist");
  }
  public void printResult(String word, int index){
    System.out.println("The word list contained " + word + " on index " + index);
  }

}
