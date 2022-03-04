import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {

        numbers.add(84);
        numbers.add(20);
        numbers.add(91);
        numbers.add(100);
        numbers.add(101);

        // 1. Find All the even numbers
        showEvenNumbers();
        System.out.println("----------");
        // 2. Find All the numbers start with 1
        showNumbersStartWith1();
        System.out.println("----------");
        // 3. Total numbers of element
        totalNumber();
        System.out.println("----------");
        // 4. Sort all the value
        sortNumbers();

    }

    private static void showEvenNumbers() {
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        evenNumbers.forEach(System.out::println);
    }

    private static void showNumbersStartWith1() {
        List<Integer> result = numbers.stream()
                .filter(num -> num.toString().startsWith("1"))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }

    private static void totalNumber() {
        Integer total = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(total);
    }

    private static void sortNumbers(){
        numbers = numbers.stream().sorted().collect(Collectors.toList());
        numbers.forEach(System.out::println);
    }
}
