public class Lab6 {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            StackTraceElement[] stackTraceElements = e.getStackTrace();
            for (int i = 0; i < stackTraceElements.length; i++) {
                System.out.println(stackTraceElements[0].getClassName());
                System.out.println(stackTraceElements[0].getMethodName());
                System.out.println(stackTraceElements[0].getFileName());
                System.out.println(stackTraceElements[0].getLineNumber());
            }
        }
    }
}
