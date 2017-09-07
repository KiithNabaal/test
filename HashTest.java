import java.util.*;

public class HashTest {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<String, String>();
    map.put("one", "val-one");
    map.put("two", "terminator");
    map.put("three", "java");
    
    Set<String> set = map.keySet();
    
    Iterator<String> iter = set.iterator();
    
    while(iter.hasNext()) {
      System.out.print(iter.next() + " ");
    }
    
    System.out.println();
    
    Collection<String> vals = map.values();
    
    iter = vals.iterator();
    
    while(iter.hasNext()) {
      System.out.print(iter.next() + " ");
    }
    
    System.out.println();
  }
}