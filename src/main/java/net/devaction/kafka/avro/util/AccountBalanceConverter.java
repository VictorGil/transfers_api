package net.devaction.kafka.avro.util;

import java.math.BigDecimal;

import net.devaction.entity.AccountBalanceEntity;
import net.devaction.entity.util.NumUtil;
import net.devaction.kafka.avro.Account;

/**
 * @author Víctor Gil
 *
 * since August 2019
 */
public class AccountBalanceConverter {    
    
    public static AccountBalanceEntity convertToPojo(Account account){
        BigDecimal balance = NumUtil.convert(account.getBalanceUnscaled(), 
                account.getBalanceScale());
        
        return new AccountBalanceEntity(account.getId(), account.getCustomerId(), 
                balance);
    }    
    
    public static Account convertToAvro(AccountBalanceEntity entity){
        return new Account(entity.getId(), entity.getCustomerId(), 
                entity.getBalance().unscaledValue().longValueExact(), 
                entity.getBalance().scale());
    }    
}
