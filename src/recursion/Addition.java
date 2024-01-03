package recursion;

public class Addition {
    public static void main(String[] args) {
        int a=10,b=20;
        Add add = (a1, b1) -> {
            System.out.println(a+b);
        };
        add.add(a,b);
    }
}
