package exception;

public class MyExceptionUsing {
    public static void main(String[] args) {
        try {
            doSomething(true);
        } catch (MyException e) {
            System.out.println("Error with true");
        }

        try {
            doSomething(false);
            System.out.println("Not error with false");
        } catch (MyException e) {
            throw new RuntimeException(e);
        }
    }

    public static void doSomething(boolean needThrow) throws MyException {
        if (needThrow)
            throw new MyException();
    }
}
