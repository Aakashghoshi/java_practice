package methodrefrence;

import java.util.function.Function;

public class Java8MethodReferences {
    public static void main(String[] args) {
        //Calling parseInt() method using lambda
        Function<String,Integer> lamdaFction = (String s)-> Integer.parseInt(s);
        System.out.println(lamdaFction.apply("12"));

        //Calling parseInt() method using method reference

        Function<String, Integer> referenceFunction = Integer::parseInt;
        System.out.println(referenceFunction.apply("12"));

        //Calling toLowerCase() method using lambda

        Function<String, String> lambdaFunction = (String s) -> s.toLowerCase();
        System.out.println(lambdaFunction.apply("JAVA"));

        //Calling toLowerCase() method using method reference

        Function<String, String> referencejFunction = String::toLowerCase;
        System.out.println(referencejFunction.apply("JAVA"));


    }
}
