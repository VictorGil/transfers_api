package net.devaction.entity.util;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @author Víctor Gil
 *
 * since May 2019
 */
public class DateFormatter{
    
    private DateFormatter(){}
    
    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(
            "EEEE dd-MMM-yyyy HH:mm:ss.SSSZ", new Locale("en", "US"));
    
    public static String getDateTimeString(ZonedDateTime date){
        return FORMATTER.format(date);        
    }
    
    public static ZonedDateTime getDateTimeFromEpochMillis(long epochMillis){
        return ZonedDateTime.ofInstant(Instant.ofEpochMilli(epochMillis), ZoneId.of("UTC"));
    }
    
    public static String getDateTimeString(long epochMillis){
        return getDateTimeString(getDateTimeFromEpochMillis(epochMillis));        
    }    
}
