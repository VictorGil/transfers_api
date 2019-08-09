package net.devaction.entity.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Víctor Gil
 *
 * since August 2019
 */
public class DateFormatterTester{
    private static final Logger log = LoggerFactory.getLogger(DateFormatterTester.class);
    
    public static void main(String args[]){
        new DateFormatterTester().run();
    }
    
    private void run(){
        long millis = System.currentTimeMillis();
        String dateTime = DateFormatter.getDateTimeString(millis);
        
        log.info("Current date and time: {} ({})", dateTime, millis);
    }
}
