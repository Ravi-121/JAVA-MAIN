package Hash;
import java.util.HashSet;

public class DirectAccess {
  public static void main(String[] args){

    HashSet<Integer> set = new HashSet<>();

    set.add(12);
    set.add(24);
    set.add(36);
    set.add(48);

    // .add ads the value 
    // .contains check the value and return true or false

    System.out.println(set.contains(12)); // True
    System.out.println(set.contains(60)); // False

    set.add(12); // Ignorse 

  }
}
