package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        //1st challenge
        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));

        //2nd challenge
        String challenge2 = "I want a ball.";
        String regex1 = "I want a \\w{4}.";
        System.out.println(challenge1.matches(regex1));
        System.out.println(challenge2.matches(regex1));

        //3rd challenge
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(challenge1);
        System.out.println(matcher1.matches());
        matcher1 = pattern1.matcher(challenge2);
        System.out.println(matcher1.matches());

        //4th challenge
        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll(" ","_"));

        //5th and 6th challenge
        String challenge5 = "aaabccccccccdddefffg";
        String regex5 = "^a{3}bc{8}d{3}ef{3}g$";
        System.out.println(challenge5.matches(regex5));

        //7th challenge
        String challenge7 = "abcd.135";
        String regex7 = "^[A-Za-z]+\\.[0-9]+$";
        System.out.println(challenge7.matches(regex7));

        //8th challenge
        String challenge8 = "abcd.137uvqz.7tzik.999";
        String regex8 = "([A-Za-z]+\\.)([0-9]+)";
        Pattern pattern8 = Pattern.compile(regex8);
        Matcher matcher8 = pattern8.matcher(challenge8);
        while (matcher8.find()) {
            System.out.println(matcher8.group(2));
        }

        //9th challenge
        String challenge9 = "abcd.137\tuvqz.7\ttzik.999\n";
        String regex9 = "[A-za-z]+\\.([0-9]+)[\\t\\n]+"; // [\\t\\n] can also be replaced by \\s but it would include all whitespaces.
        Pattern pattern9 = Pattern.compile(regex9);
        Matcher matcher9 = pattern9.matcher(challenge9);
        while (matcher9.find()) {
            System.out.println(matcher9.group(1));
        }

        //10th challenge
        matcher9.reset();
        while(matcher9.find()) {
            System.out.println(matcher9.start(1) + " : " + (matcher9.end(1)-1));
        }

        //11th challenge
        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        String regex11 = "\\{(\\d+, \\d+)\\}";
        Pattern pattern11 = Pattern.compile(regex11);
        Matcher matcher11 = pattern11.matcher(challenge11);
        while (matcher11.find()) {
            System.out.println(matcher11.group(1));
        }

        //12th challenge
        String challenge12 = "11111";
        String regex12 = "^\\d{5}$";
        System.out.println(challenge12.matches(regex12));

        //13th challenge
        String challenge13 = "11111-1111";
        String regex13 = "^\\d{5}\\-\\d{4}$";
        System.out.println(challenge13.matches(regex13));

        //14th challenge
        String regex14 = "^\\d{5}(\\-\\d{4})?$";
        System.out.println(challenge12.matches(regex14));
        System.out.println(challenge13.matches(regex14));
    }
}
