package Patterns.TwoPointers;
public class TwoPointer {
  public static void main(String[] args) {

    int[] A = {1,2,3};
    int target = 0;
    int left = 0;
    int right = A.length - 1;

    while (left < right) {

      int sum = A[left]+ A[left+1] + A[right];

      if (target == sum) {
        System.out.println("Target found at " + left + ", "+ (left+1) +" & " + right);
        System.out.println("The pair is " +A[left]+ ", "+ A[left +1]+" & " +A[right]);
        break;
      } else if (target > sum) {
        left++;
      } else if(target < sum) {
        right--;
      }
    }
    
    System.out.println("Target not found");

  }

}