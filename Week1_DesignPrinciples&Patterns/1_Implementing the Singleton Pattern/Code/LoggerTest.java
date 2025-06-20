public class LoggerTest 
{
    
    public static void runTests() 
    {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println("Logger Test:");
        logger1.log("Hey 6397978 - ANAND here");
        logger2.log("Hey 6397978 - ANAND here again");

        if (logger1 == logger2) 
        {
            System.out.println("PASS: Both logger instances are the same.");
        } 
        else 
        {
            System.out.println("FAIL: Logger instances are different.");
        }
    }
}
