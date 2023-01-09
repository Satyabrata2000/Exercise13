package Exercise13;

//Private Static method inside interface
public interface Example1 {

    default void say(){
        saySomething(); //calling private method
        sayPolitely(); //calling private static method
    }
    //private method inside interface
    private void saySomething(){
        System.out.println("This is a private method");
    }

    //private static method inside interface
    private static void sayPolitely(){
        System.out.println("This is a private static method");
    }
}
