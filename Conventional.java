import java.util.*;

public class Conventional implements Common {
    public static void main(String[] args) {
    }

    @Override
    public List<Integer> extractEvenNumbers(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer n :
                numbers) {
            if (n % 2 == 0) {
                evenNumbers.add(n);
            }
        }
        return evenNumbers;
    }

    @Override
    public List<Integer> doubleListNumbers(List<Integer> numbers) {
        List<Integer> doubledListNumbers = new ArrayList<>();
        for (Integer n :
                numbers) {
            doubledListNumbers.add(n*2);
        }
        return doubledListNumbers;
    }

    @Override
    public List<Integer> reverseOrder(List<Integer> numbers) {
        Collections.reverse(numbers);
        return numbers;
    }
}

