package net.devaction.entity.util;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * @author Víctor Gil
 *
 * since August 2019
 */
public class NumUtilTest {

    @Test
    public void testConvert01() {
        BigDecimal actual = NumUtil.convert(3001, 2);

        Assertions.assertEquals(new BigDecimal("30.01"), actual);
    }

    @Test
    public void testConvert02() {
        BigDecimal actual = NumUtil.convert(3001, 3);

        Assertions.assertEquals(new BigDecimal("3.001"), actual);
    }

    @Test
    public void testConvert03() {
        BigDecimal actual = NumUtil.convert(3001, 6);

        Assertions.assertEquals(new BigDecimal("0.003001"), actual);
    }
}
