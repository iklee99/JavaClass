// counting how many invocation of all methods made
// using static variable

public class InvocationCounter
{
    private static int numberOfInvocations = 0;

    public void demoMethod( ) {
        numberOfInvocations++;
        //In a real example, more code would go here.
    }

    public void outPutCount( ) {
        numberOfInvocations++;
        System.out.println("Number of invocations so far = "
        + numberOfInvocations);
    }

    public static int numberSoFar( ) {
        numberOfInvocations++;
        return numberOfInvocations;
    }

    public static void main(String[] args) {
        InvocationCounter object1 = new InvocationCounter( );
        object1.outPutCount( );  // 1
        for (int i = 1; i <= 5 ; i++)
            object1.demoMethod( );  // +1
        object1.outPutCount( ); // 7

        InvocationCounter object2 = new InvocationCounter( );
        for (int i = 1; i <= 5 ; i++) {
            object2.demoMethod( ); // +1
            object2.outPutCount( ); // +1
        }

        System.out.println("Total number of invocations = " + numberSoFar( )); // 18
    }
}
