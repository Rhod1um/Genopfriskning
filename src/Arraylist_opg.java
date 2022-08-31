import java.util.ArrayList;

public class Arraylist_opg {

  private ArrayList<String> list;

  Arraylist_opg(){
    list = new ArrayList<>();
  }

  public boolean doesArraylistContainString(ArrayList<String> list, String str){
    if(list.contains(str)){
      return true;
    }
    else {
      list.add(str);
      return false;
    }
  }
}
