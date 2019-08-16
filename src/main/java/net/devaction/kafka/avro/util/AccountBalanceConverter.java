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

    private AccountBalanceConverter(){}
    
    public static AccountBalanceEntity convertToPojo(AccountBalance account){
        BigDecimal balance = NumUtil.convert(account.getBalanceUnscaled(), 
                account.getBalanceScale());
        
        return new AccountBalanceEntity(account.getAccountId(), account.getClientId(), 
                account.getTransferId(), balance, account.getVersion());
    }    
    
    public static AccountBalance convertToAvro(AccountBalanceEntity entity){
        return new AccountBalance(entity.getAccountId(), entity.getClientId(), 
                entity.getTransferId(),
                entity.getBalance().unscaledValue().longValueExact(), 
                entity.getBalance().scale(),
                entity.getVersion());
    }   
}
