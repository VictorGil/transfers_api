package net.devaction.kafka.avro.util;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import net.devaction.entity.AccountBalanceEntity;
import net.devaction.kafka.avro.AccountBalance;

/**
 * @author Víctor Gil
 *
 * since August 2019
 */
class AccountConverterTest {

    @Test
    public void testConvertToPojo01() {
        BigDecimal balance = new BigDecimal("945.27");
        AccountBalanceEntity entityExpected = new AccountBalanceEntity("test_id", "test_customer_id", 
                "test_transfer_id", balance);
        
        AccountBalance account = new AccountBalance("test_id", "test_customer_id", "test_transfer_id", 
                94527L, 2);
        
        Assertions.assertEquals(entityExpected, 
                AccountBalanceConverter.convertToPojo(account));
    }
    
    @Test
    public void testConvertToAvro01() {
        AccountBalance avroExpected = new AccountBalance("test_id", "test_customer_id", "test_transfer_id", 
                94527L, 2);
        
        BigDecimal balance = new BigDecimal("945.27");
        AccountBalanceEntity entity = new AccountBalanceEntity("test_id", "test_customer_id", 
                "test_transfer_id", balance);
        
        Assertions.assertEquals(avroExpected, 
                AccountBalanceConverter.convertToAvro(entity));
    }
}
