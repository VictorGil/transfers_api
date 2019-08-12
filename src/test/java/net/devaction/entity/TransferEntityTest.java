package net.devaction.entity;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

/**
 * @author Víctor Gil
 *
 * since August 2019
 */
class TransferEntityTest{
    
    @Test
    void testGenerateRandomId(){
        String id = new TransferEntity().generateRandomId();
        
        Assertions.assertEquals(12, id.length());
    }
}

