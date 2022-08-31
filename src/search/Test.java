package search;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

  public void go() throws Exception {
    Search search = new Search();
    search.search("ill", new ArrayList<String>(Arrays.asList("anna", "jumbo", "rød")));
  }

  public static void main(String[] args) throws Exception {
    new Test().go();
  }
}
