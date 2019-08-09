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
class TransferentityTest{
    private static final Logger log = LoggerFactory.getLogger(TransferentityTest.class);

    @Test
    void testGenerateRandomId(){
        String id = new TransferEntity().generateRandomId();
        
        Assertions.assertEquals(12, id.length());
    }
}

