package jurez.learn.maven;

import com.duzre.tester.SimpleTester;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! Dzureee..." );
        System.out.println( "Hello World! Dzureee..." );
        Logger logger = LoggerFactory.getLogger(App.class);
        logger.info("Hey what's up from logger.");
        logger.info("Hey what's up from logger.");
        logger.info("Hey what's up from logger.");
        logger.info("Hey what's up from logger.");
        logger.info("Hey what's up from logger.");

        SimpleTester simpleTester = new SimpleTester();
        simpleTester.simpleTesterMethod("Hey man.. What's up?");

    }
}
