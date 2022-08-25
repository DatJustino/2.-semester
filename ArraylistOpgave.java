import java.util.ArrayList;

public class ArraylistOpgave {

  public static void main(String[] args) {
    ArraylistOpgave prg = new ArraylistOpgave();
    ArrayList<String> al = new ArrayList<>();

    al.add("String String");
    al.add("Streng Streng");

    prg.doesArraylistContainsString(al,"String String");
    prg.doesArraylistContainsString(al,"Streng Streng");
    prg.doesArraylistContainsString(al,"asdasd");

  }


    public boolean doesArraylistContainsString (ArrayList < String > liste, String text ){
      if (liste.contains(text)) {
        System.out.println(text + " - The String has been found");
        return true;
      } else {
        liste.add(text);
        System.out.println(text + "has been added to the list");
        return false;
      }
    }
  }

