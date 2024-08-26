public class ExceptionEx03 {
    public static void main(String args[]) {
        try {
            Exception e = new Exception("My Exception");
            throw e; // throw the exception
        }
        catch (Exception e) {
            System.out.println("Error message: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Program ended");
    }
}
