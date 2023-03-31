package project2Class2;

public class MyProjectInClass {
    public static void main(String[] args) {
        try {
            int[] list = new int[10];
            System.out.println("list[10] is " + list[10]);
        }
        catch (ArithmeticException ex){
            System.out.println("ArithmeticException");
        }
        catch (RuntimeException ex){
            System.out.println("RuntimeException");
        }
        catch (Exception ex){
            System.out.println("Exception");
        }
        try {
            System.out.println("Statement 1");
            System.out.println(1/0);
            System.out.println("Statement 2");
        }
        catch(IndexOutOfBoundsException ex){
            
        }
        finally {
            System.out.println("Statement 4"); // do every if have or not exception
        }
        System.out.println("Statement 5");
    }
}
