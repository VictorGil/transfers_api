package net.devaction.kafka.avro.util;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import net.devaction.entity.AccountBalanceEntity;
import net.devaction.kafka.avro.Account;

/**
 * @author Víctor Gil
 *
 * since August 2019
 */
class AccountConverterTest {

    @Test
    public void testConvertToPojo01() {
        BigDecimal balance = new BigDecimal("945.27");
        AccountBalanceEntity entityExpected = new AccountBalanceEntity("1", "2", balance);
        
        Account account = new Account("1", "2", 94527L, 2);
        
        Assertions.assertEquals(entityExpected, 
                AccountBalanceConverter.convertToPojo(account));
    }
    
    @Test
    public void testConvertToAvro01() {
        Account avroExpected = new Account("1", "2", 94527L, 2);
        
        BigDecimal balance = new BigDecimal("945.27");
        AccountBalanceEntity entity = new AccountBalanceEntity("1", "2", balance);
        
        Assertions.assertEquals(avroExpected, 
                AccountBalanceConverter.convertToAvro(entity));
    }
}
