package OptionalBasic;

import java.util.Optional;

public class OptionalBasicExample1 {
    public static void main(String[] args) {
        Optional<String> op = Optional.of("null");
        String st1 ="aakash";
        String str2 = null;
        System.out.println(op);
        System.out.println(op.get());
        System.out.println(op.isEmpty());
        System.out.println(op.isPresent());



        Optional<String> gender = Optional.of("MALE");
        String answer1 = "Yes";
        String answer2 = null;
        System.out.println("Non-Empty Optional:" + gender);
        System.out.println("Non-Empty Optional: Gender value : " + gender.get());
        System.out.println("Empty Optional: " + Optional.empty());

        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));

        // java.lang.NullPointerException
        System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));
    }
}
