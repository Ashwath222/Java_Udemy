package lambdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) {

        //1st challenge
        Runnable runnable = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for(String string : parts)
                System.out.println(parts);
        };

        //2nd challenge
        Function<String, String> lambdaFunction = source -> {
            StringBuilder returnVal = new StringBuilder();
            for(int i = 0; i < source.length(); i++) {
                if(i % 2 == 0) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        //3rd challenge
        System.out.println(lambdaFunction.apply("1234567890"));

        //5th challenge
        System.out.println(everySecondCharacter(lambdaFunction, "1234567890"));

        //6th challenge
        Supplier<String> iLoveJava = () -> "I love Java";

        //7th challenge
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

        //9th challenge
        List<String> topNames2015 = Arrays.asList("Amelia", "Olivia", "emily", "Isla", "Ava",
                                                    "oliver", "Jack", "Charlie", "harry", "Jacob");
        List<String> result = new ArrayList<>();
        topNames2015.forEach(s -> result.add(s.substring(0,1).toUpperCase()+s.substring(1)));
        result.sort((s1, s2) -> s1.compareTo(s2));
        result.forEach(s -> System.out.println(s));

        //10th challenge
        result.clear();
        topNames2015.forEach(s -> result.add(s.substring(0, 1).toUpperCase() + s.substring(1)));
        result.sort(String::compareTo);
        result.forEach(System.out::println);

        //11th challenge
        topNames2015.stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .sorted(String::compareTo)
                .forEach(System.out::println);

        //12th challenge
        long res = topNames2015.stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .filter(s -> s.startsWith("A"))
                .count();
        System.out.println(res);

        //14th challenge
        topNames2015
                .stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                //.count(); won't work with jdk 11 and above
                .collect(Collectors.toList());
    }

    //4th challenge
    public static String everySecondCharacter(Function<String, String> function, String source){
        return function.apply(source);
    }
}
