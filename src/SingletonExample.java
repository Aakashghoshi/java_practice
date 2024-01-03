public class SingletonExample {
    // private field that refers to the object
    private static SingletonExample singleObject;

    private SingletonExample() {
        // constructor of the SingletonExample class
    }

    public static SingletonExample getInstance() {


        // create object if it's not already created
        if(singleObject == null) {
            singleObject = new SingletonExample();
        }

        // returns the singleton object
        return singleObject;
        // write code that allows us to create only one object
        // access the object as per our need
    }

    public static void main(String[] args) {
        SingletonExample db1;
        SingletonExample db2;

        // refers to the only object of Database
        db1= SingletonExample.getInstance();
        db2 = SingletonExample.getInstance();
        System.out.println(db1==db2);

    }

}
