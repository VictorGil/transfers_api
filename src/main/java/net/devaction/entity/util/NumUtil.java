package net.devaction.entity.util;

import java.math.BigDecimal;

/**
 * @author Víctor Gil
 *
 * since August 2019
 */
public class NumUtil {

    private NumUtil() {}

    public static BigDecimal convert(long number, int scale) {
        return BigDecimal.valueOf(number, scale);
    }
}
