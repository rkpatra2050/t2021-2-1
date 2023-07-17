  import java.util.*;
public class Program_4 {
  

    public static Map<Integer, Integer> countNumberMultiples(List<Integer> numbers) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            counts.put(i, 0);  // Initialize count for each number
        }
        for (int number : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (number % i == 0) {
                    counts.put(i, counts.get(i) + 1);
                }
            }
        }
        return counts;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);
        Map<Integer, Integer> counts = countNumberMultiples(numbers);
        System.out.println(counts);
    
}

}
