package net.devaction.kafka.avro.util;

import java.math.BigDecimal;

import net.devaction.entity.AccountEntity;
import net.devaction.entity.util.NumUtil;
import net.devaction.kafka.avro.Account;

/**
 * @author Víctor Gil
 *
 * since August 2019
 */
public class AccountConverter {    
    
    public static AccountEntity convertToPojo(Account account){
        BigDecimal balance = NumUtil.convert(account.getBalanceNumber(), 
                account.getBalanceScale());
        
        return new AccountEntity(account.getId(), account.getCustomerId(), 
                balance);
    }    
    
    public static Account convertToAvro(AccountEntity entity){
        return new Account(entity.getId(), entity.getCustomerId(), 
                entity.getBalance().unscaledValue().longValueExact(), 
                entity.getBalance().scale());
    }    
}
