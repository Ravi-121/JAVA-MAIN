package Patterns.TwoPointers;
public class TwoPointer {
  public static void main(String[] args) {

    int[] A = { 1, 2, 4, 6, 8, 10 };
    int target = 13;
    int left = 0;
    int right = A.length - 1;

    while (left < right) {

      int sum = A[left] + A[right];

      if (target == sum) {
        System.out.println("Target found at " + left + ", " + right);
        System.out.println("The pair is " +A[left]+ ", " +A[right]);
        break;
      } else if (target > sum) {
        left++;
      } else if(target < sum) {
        right--;
      }
    }

  }

}
