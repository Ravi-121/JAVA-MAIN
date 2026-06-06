package Hash;

import java.util.HashSet;

public class SecondLargestWithHsash {
  public static void main(String[] args) {

    HashSet<Integer> set = new HashSet<>();

    int[] A = { -3, 7, 5 };
    int target = 2;
    int compltements;

    for (int i = 0; i < A.length; i++) {

      compltements = target - A[i];

      if (set.contains(compltements)) {
        System.out.println(true);
        return;
      }
      set.add(A[i]);
    }
    System.out.println(false);

  }

}
