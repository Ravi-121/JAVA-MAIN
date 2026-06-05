package Arrayss;
public class SecondLargest {
  public static void main(String[] args) {

    int[] A = { 3, 7, 1, 9, 4 };

    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int i = 0; i < A.length; i++) {

      if (largest < A[i]) {
        secondLargest = largest;
        largest = A[i];
      }

      else if (secondLargest < A[i] && secondLargest != largest) {
        secondLargest = A[i];
      }

    }
    System.out.println("The Second Largest number is: " + secondLargest);

  }
}
