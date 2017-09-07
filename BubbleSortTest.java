import java.util.*;

public class BubbleSortTest {
  public static void main(String[] args) {
    Random r = new Random();
    
    int[] arr = new int[10];
    
    for(int i = 0; i < 10; i++) {
      arr[i] = Math.abs(r.nextInt() % 10);
    }
    
    for(int i = 0; i < arr.length; i++) {
      for(int j = 0; j < (arr.length - 1); j++) {
        if(arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    
    for(int i = 0; i < 10; i++) {
      System.out.print(arr[i] + ", ");
    }
    
    System.out.println();
  }
}