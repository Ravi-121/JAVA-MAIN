public class MoreWindow {
  public static void main(String[] args) {

    int[] A = { 5, 5, 5, 5 };
    int k = 2;
    int windowSum = 0;
    int minimum;

    if (k > A.length) {
      System.out.println("Can not found sum of subarray");
      return;
    }

    for (int i = 0; i < k; i++) {
      windowSum += A[i];
    }
    minimum = windowSum;

    for (int i = k; i < A.length; i++) {
      windowSum += A[i] - A[i - k];
      minimum = Math.min(minimum, windowSum);

    }
    System.out.println("The minimum sum of subarray is " + minimum);
  }

}