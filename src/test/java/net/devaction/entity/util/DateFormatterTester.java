package net.devaction.entity.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Víctor Gil
 *
 * since August 2019
 */
public class DateFormatterTester {
    private static final Logger log = LoggerFactory.getLogger(DateFormatterTester.class);

    public static void main(String[] args) {
        new DateFormatterTester().run();
    }

    private void run() {
        long millis = System.currentTimeMillis();
        String dateTime = DateFormatter.getDateTimeString(millis);

        log.info("Current date and time: {} ( {})", dateTime, millis);

        long maxJSinteger = (long) Math.pow(2, 53) - 1;
        log.info("Maximum integer value in JavaScript: {} --> "
                + "corresponding date: {}",
                maxJSinteger,
                DateFormatter.getDateTimeString(maxJSinteger));

        long maxJavaInteger = Long.MAX_VALUE;
        log.info("Maximum integer value in Java: {} --> "
                + "corresponding date: {}",
                maxJavaInteger,
                DateFormatter.getDateTimeString(maxJavaInteger));
    }
}
