public class BinarySearch {
  public static void main(String[] args) {

    int[] A = {10};
    int target = 10;
    int left = 0;
    int right = A.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2; // avoid integer overfloww

      if (A[mid] == target) {
        System.out.println("Target found at " + mid);
        return;
      } else if (target > A[mid]) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }

    }
    System.out.println("-1");

  }

}