package net.devaction.entity;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Víctor Gil
 *
 * since August 2019
 */
public class TransferEntityTest {
    private static final Logger log = LoggerFactory.getLogger(TransferEntityTest.class);

    @Test
    public void testGenerateRandomId() {
        String id = new TransferEntity().generateRandomId();
        log.trace("Random id: {}", id);
        Assertions.assertEquals(12, id.length());
    }
}
