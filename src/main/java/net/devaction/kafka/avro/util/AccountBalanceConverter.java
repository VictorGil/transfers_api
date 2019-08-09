package net.devaction.kafka.avro.util;

import java.math.BigDecimal;

import net.devaction.entity.AccountBalanceEntity;
import net.devaction.entity.util.NumUtil;
import net.devaction.kafka.avro.AccountBalance;

/**
 * @author Víctor Gil
 *
 * since August 2019
 */
public class AccountBalanceConverter {    

    public static AccountBalanceEntity convertToPojo(AccountBalance account){
        BigDecimal balance = NumUtil.convert(account.getBalanceUnscaled(), 
                account.getBalanceScale());
        
        return new AccountBalanceEntity(account.getId(), account.getCustomerId(), 
                account.getTransferId(), balance);
    }    
    
    public static AccountBalance convertToAvro(AccountBalanceEntity entity){
        return new AccountBalance(entity.getId(), entity.getCustomerId(), 
                entity.getTransferId(),
                entity.getBalance().unscaledValue().longValueExact(), 
                entity.getBalance().scale());
    } 
   
}
