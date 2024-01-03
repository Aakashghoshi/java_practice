package fuctionalnterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PrididateExample {

    // Predicate to find all users whose age is more than 35
    public static Predicate<User> isPro(){
    return p ->p.getAge()>35;
    }
    // Predicate to find all users whose name starts with ant character

    public static Predicate<User> nameStartWithCharacter(){
        return p->p.getName().startsWith("A");

    }

    // Predicate to find all users whose name starts with B or A

    public static Predicate<User> nameStartWithAorB(){
        return p -> p.getName().startsWith("A") || p.getName().startsWith("B");

    }

    public static void main(String[] args) {
        List<User> userList = new ArrayList<User>();
        userList.add(new User("1", "Alpha", 60));
        userList.add(new User("2", "Beta", 50));
        userList.add(new User("3", "Gama", 40));
        userList.add(new User("4", "Becca", 30));
        userList.add(new User("5", "Tesla", 20));
        userList.add(new User("6", "Noob", 10));

        System.out.println("All users =");
        System.out.println(userList);

        List<User> above35 = userList.stream().filter(isPro()).collect(Collectors.<User>toList());
        System.out.println("Users whose age above 35=");
        System.out.println(above35);

        List<User> nameStartsWithB = userList.stream().filter(nameStartWithCharacter()).collect(Collectors.toList());
        System.out.println("Users whose name starts with B=");
        System.out.println(nameStartsWithB);

        List<User> nameStartsWithBorA  = userList.stream().filter(nameStartWithAorB()).collect(Collectors.toList());
        System.out.println("Users whose name starts with B or A=");
        System.out.println(nameStartsWithBorA);
    }

}
