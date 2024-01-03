package fuctionalnterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FuctionalInterface {

    // Test
    public static void main(String[] args) {

        // Dummy users
        List<User> userList = new ArrayList<User>();
        userList.add(new User("1", "Alpha", 60));
        userList.add(new User("2", "Beta", 50));
        userList.add(new User("3", "Gama", 40));
        userList.add(new User("4", "Becca", 30));
        userList.add(new User("5", "Tesla", 20));
        userList.add(new User("6", "Noob", 10));

        // Function interface example to find the size of user list.
        Function<List<User>, Integer> func = x -> x.size();

        Integer size = func.apply(userList); // 6

        System.out.println(size);

    }

}
