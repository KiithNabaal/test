import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = new int[20];
    Random r = new Random();
    
    for(int i = 0; i < 20; i++) {
      arr[i] = (r.nextInt() % 30);
    }
    
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    
    System.out.println(search(arr, 0, arr.length - 1, 20));
  }
  
  public static boolean search(int[] a, int start, int end, int k) {
    if(a == null) {
      return false;
    }
    
    if((start >= 0) && (end < a.length) && (start <= end)) {
      int mid = ((start + end) / 2);
      
      if((start == end) && (a[mid] != k)) {
        return false;
      }
      else if(a[mid] < k) {
        return search(a, mid + 1, end, k);
      }
      else if(a[mid] > k) {
        return search(a, start, mid - 1, k);
      }
      else if(a[mid] == k) {
        System.out.println("Key found at index: " + mid);
        return true;
      }
    }
    else {
      return false;
    }
    
    return false;
  }
}