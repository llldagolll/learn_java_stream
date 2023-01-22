import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Stream implements Common {

    @Override
    public  List<Integer> extractEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2==0)
                .collect(Collectors.toList());
    }


    @Override
    public  List<Integer> doubleListNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n *2)
                .collect(Collectors.toList());
    }

    @Override
    public List<Integer> reverseOrder(List<Integer> numbers) {
        return numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

}
