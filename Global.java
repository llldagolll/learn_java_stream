import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


abstract class Common {

    abstract List<Integer> extractEvenNumbers(List<Integer> numbers);
     abstract List<Integer> doubleListNumbers(List<Integer> numbers);
     abstract List<Integer> reverseOrder(List<Integer> numbers);
}


public class Global {
    public static List<Integer> numbers = IntStream.range(1, 6)
                    .boxed()
                    .collect(Collectors.toList());

    public static void isEqual(
            List<Integer> originalList,
            Function<List<Integer>, List<Integer>>f1,
            Function<List<Integer>, List<Integer>>f2
    ) {
        List<Integer> f1Result = f1.apply(originalList);
        List<Integer> f2Result = f2.apply(originalList);
        System.out.println("元の数値: " + originalList);
        System.out.println("従来関数の処理結果: " + f1Result);
        System.out.println("関数インタフェース型関数の処理結果: " + f2Result);
        System.out.println(
                "二つの処理結果は同じ値か？: "
                        +
                Objects.equals(f1Result, f2Result)
        );

        System.out.println();
    }


}
