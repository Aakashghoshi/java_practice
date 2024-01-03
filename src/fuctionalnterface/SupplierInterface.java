package fuctionalnterface;

import java.util.function.Supplier;

public class SupplierInterface {

    // Test
    public static void main(String[] args) {

        Supplier userSupplier = () -> new User("1", "Alpha", 60);
        User user = (User) userSupplier.get();
        System.out.println(user);

    }
}
