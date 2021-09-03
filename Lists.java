import java.util.ArrayList;

public class Lists {
  
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();

    names.add("Josh");
    names.add("Shanhu");
    names.add("Frankie");
    for (String name : names) {
      System.out.println(name);
    }

    names.set(names.indexOf("Shanhu"), names.get(names.indexOf("Shanhu")) + " Hu");
    System.out.println(names.get(1));

    names.remove(2);
    names.add("Russ");
    names.add("Lindsey");

    for(int i = 0; i < names.size(); i++) {
      if (i == 2) {
        continue;
      }
      names.set(i, names.get(i) + "!");
    }
    System.out.print(names.toString());
  }
}
