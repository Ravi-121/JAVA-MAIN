public class MoreBinarySearch {
  public static void main(String[] args) {

    int[] A = { 1, 3, 5, 7, 9};
    int target = 6;
    int left = 0;
    int right = A.length-1;
    int index = -1;

    while (left <= right) { 
      int mid = left + (right - left) / 2;

      if(target < A[mid]){
        index = mid;
        right--;
      }
      else{
        left++;
      }
     
    }


      System.out.println("The indext is " +index);
  

  }

}
