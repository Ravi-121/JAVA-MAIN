public class BinarySearchMethod {

  public static int binarySearch(int[] A, int target) {

    int left = 0;
    int right = A.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (target == A[mid]) {
        return mid;
      } else if (target > A[mid]) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }

    }
    return -1;
  }

  public static void main(String[] args) {

    int[] A = {7};
    int target =3;

    int result = binarySearch(A, target);

    if (result == -1) {
      System.out.println("Target not found");
    } else {
      System.out.println("Target found at:" + result);
    }

  }

}
