import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println("Home Work");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 9, 6, 8, 9, 5, 4, 7, 9, 5, 5, 6, 7));
        oddNumbers(nums);
        evenNumbers(nums);
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три", "четыре", "четыре", "четыре", "четыре"));
        keyWords(strings);
        uniqueWordsDouble(strings);
    }

    private static void uniqueWordsDouble(List<String> strings) {
        Map<String, Integer> uniqueWordsDouble = new HashMap<>();
        for (String string : strings) {
            uniqueWordsDouble.put(string, uniqueWordsDouble.getOrDefault(string, 0) + 1);
        }
        for (int count : uniqueWordsDouble.values()) {
            System.out.print(count);
        }
    }

    private static void keyWords(List<String> strings) {
        Map<String, Integer> keyWords = new HashMap<>();
        for (String string : strings) {
            if (!keyWords.containsKey(string)) {
                keyWords.put(string, 1);
            } else {
                keyWords.put(string, keyWords.get(string) + 1);
            }
        }
        System.out.println(keyWords.values());
    }

    private static void oddNumbers(List<Integer> nums) {
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            Integer x = nums.get(i);
            if (nums.get(i) % 2 != 0) {
                odd.add(x);
            }
        }
        System.out.println(odd);
    }

    private static void evenNumbers(List<Integer> nums) {
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            Integer x = nums.get(i);
            if (nums.get(i) % 2 == 0) {
                even.add(x);
            }
        }
        List<Integer> evenWithoutDuplicate = even.stream().distinct().collect(Collectors.toList());
        Collections.sort(evenWithoutDuplicate);
        System.out.println(evenWithoutDuplicate);
    }
}