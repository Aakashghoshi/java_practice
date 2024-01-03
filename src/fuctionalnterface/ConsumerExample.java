package fuctionalnterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        // Dummy users
        List<User> userList = new ArrayList<User>();
        userList.add(new User("1", "Alpha", 60));
        userList.add(new User("2", "Beta", 50));
        userList.add(new User("3", "Gama", 40));
        userList.add(new User("4", "Becca", 30));
        userList.add(new User("5", "Tesla", 20));
        userList.add(new User("6", "Noob", 10));


        // Consumer accept() method example
        // Consumer to find print all users
        Consumer<List<User>> consumerUser
                = s -> System.out.println(s);
        consumerUser.accept(userList);

        // Consumer forEach() example
        // Creating Consumer for user object
        // which will be used in forEach method of list
        Consumer<User> consumerForUser
                = s -> System.out.println(s);
        userList.forEach(consumerForUser);

        // Consumer andThen() method example
        Consumer<User> userA
                = x -> System.out.println(x.getName()
                .toLowerCase());
        Consumer<User> userB
                = y -> System.out.println(y.getName()
                .toUpperCase());
        Consumer<User> result = userA.andThen(userB);

        User user = new User("1", "Alpha", 60);
        result.accept(user);

    }
}
