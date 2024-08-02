public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();

        System.out.println(logger.shouldPrintMessage(1, "foo"));
        System.out.println(logger.shouldPrintMessage(2, "bar"));

        System.out.println(logger.shouldPrintMessage(3, "foo"));
        System.out.println(logger.shouldPrintMessage(8, "bar"));
        System.out.println(logger.shouldPrintMessage(10, "foo"));
        System.out.println(logger.shouldPrintMessage(11, "foo"));

        System.out.println(logger.loggerSize());

        System.out.println(logger.clean(11));
        System.out.println(logger.clean(12));

        System.out.println(logger.loggerSize());
    }
}