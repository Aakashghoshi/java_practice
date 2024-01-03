package fuctionalnterface;

import javax.print.attribute.standard.RequestingUserName;

public interface TestFuctional {

    void test();
}


class Test implements TestFuctional {
    public static void main(String[] args) {

        TestFuctional ref1 = new Test();
        ref1.test();

        TestFuctional ref2 = new TestFuctional() {
            public void test() {
                System.out.println("implemented 2");
            }
        };
        ref2.test();

        TestFuctional ref3 = ()-> System.out.println("implemented 3");
        ref3.test();
    }


    @Override
    public void test() {
        System.out.println("implemented 1");
    }
}