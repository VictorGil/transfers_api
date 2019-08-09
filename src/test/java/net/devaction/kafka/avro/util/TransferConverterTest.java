package net.devaction.kafka.avro.util;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.devaction.entity.TransferEntity;
import net.devaction.kafka.avro.Transfer;

/**
 * @author Víctor Gil
 *
 * since August 2019
 */
class TransferConverterTest{
    private static final Logger log = LoggerFactory.getLogger(TransferConverterTest.class);

    @Test
    void testConvertToPojo01(){        
        TransferEntity entityExpected = new TransferEntity();
        entityExpected.setId("test_id");
        entityExpected.setAccountId("test_account_id");
        
        BigDecimal amount = new BigDecimal("7.02"); 
        entityExpected.setAmount(amount);
        
        long now = System.currentTimeMillis(); 
        entityExpected.setTransferTS(now);
        
        log.debug("Transfer entity expected: {}", entityExpected);
        Transfer transfer = new Transfer();
        transfer.setId("test_id");
        transfer.setAccountId("test_account_id");
        transfer.setAmountUnscaled(702L);
        transfer.setAmountScale(2);
        transfer.setTransferTS(now);
        
        Assertions.assertEquals(entityExpected, 
                TransferConverter.convertToPojo(transfer));        
    }
    
    @Test
    public void testConvertToAvro01(){
        Transfer avroExpected = new Transfer();
        
        avroExpected.setId("test_id");
        avroExpected.setAccountId("test_account_id");
        avroExpected.setAmountUnscaled(1205L);
        avroExpected.setAmountScale(2);
        
        long now = System.currentTimeMillis();
        avroExpected.setTransferTS(now);
        
        TransferEntity entity = new TransferEntity();
        
        entity.setId("test_id");
        entity.setAccountId("test_account_id");        
        entity.setAmount(new BigDecimal("12.05"));
        entity.setTransferTS(now);        
    }
}
