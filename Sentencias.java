package escuelait;

import java.util.stream.IntStream;

public class Sentencias {
    public static void main(String[] args) {

        int primeNumberSumInTheFirst50NaturalNumbers = IntStream.rangeClosed(2, 50)
                .filter(p -> IntStream.rangeClosed(2, p / 2).noneMatch(i -> p % i == 0))
                .sum();
        System.out.println(primeNumberSumInTheFirst50NaturalNumbers);

        int sumOfFirst50PrimeNumbers = IntStream.iterate(2, n -> n + 1)
                .filter(p -> IntStream.rangeClosed(2, p / 2).noneMatch(i -> p % i == 0))
                .limit(50)
                .sum();
        System.out.println(sumOfFirst50PrimeNumbers);


    }
}
