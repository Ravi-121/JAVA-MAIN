public class SlidingWindow {
  public static void main(String[] args) {

    int[] A = {5, -2, 3, 1, -1, 4};
    int k = 4;
    int windownSum = 0;
    int maxSum = 0;

    if (k > A.length) {
      System.out.println("K(window) is larger then array itself chose small window");
    } else {

      // Calculate window sum;
      for (int i = 0; i < k; i++) {
        windownSum += A[i];
      }

      maxSum = windownSum;

      // Sliding the window adding right element and removind left element
      for (int i = k; i < A.length; i++) {
        windownSum += A[i] - A[i - k];
        maxSum = Math.max(maxSum, windownSum);
      }
      System.out.println("The max sum of subarray  of size " + k + "; " + maxSum);

    }
  }

}
