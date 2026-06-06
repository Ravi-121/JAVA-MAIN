package Patterns.TwoPointers;

class MoerPointer {

  public static void main(String[] args) {

    int[] A = { 1, 2, 3 };
    int target = 0;

    for (int i = 0; i < A.length - 2; i++) {

      int left = i + 1;
      int right = A.length - 1;

      while (left < right) {
        int sum = A[i] + A[left] + A[right];

        if (target == sum) {
          System.out.println("Target found at index:" + i + ", " + left + "& " + right);
          return;
        } else if (target < sum) {
          left++;
        } else {
          right--;
        }

      }

    }
    System.out.println("Target not found");

  }

}
