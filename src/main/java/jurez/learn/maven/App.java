package jurez.learn.maven;

import org.slf4j.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! Dzureee..." );
        Logger logger = LoggerFactory.getLogger(App.class);
        logger.info("Hey what's up from logger.");
    }
}