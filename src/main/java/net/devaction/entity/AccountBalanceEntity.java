package net.devaction.entity;

import java.math.BigDecimal;

/**
 * @author Víctor Gil
 *
 * since August 2019
 * 
 * DTO/POJO class to avoid having the Avro-related code and limitations
 */
public class AccountBalanceEntity{
    
    private String accountId;
    private String customerId;
    private String transferId;
    private BigDecimal balance;
    
    public AccountBalanceEntity(){}
    
    public AccountBalanceEntity(String id, String customerId, String transferId, BigDecimal balance){
        this.accountId = id;
        this.customerId = customerId;
        this.transferId = transferId;
        this.balance = balance;
    }

    @Override
    public String toString(){
        return "AccountBalanceEntity [accountId=" + accountId + ", customerId=" + customerId + ", transferId=" + transferId + ", balance="
                + balance + "]";
    }    

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        
        result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
        result = prime * result + ((balance == null) ? 0 : balance.hashCode());
        result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
        result = prime * result + ((transferId == null) ? 0 : transferId.hashCode());
        
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        
        if (obj == null)
            return false;
        
        if (getClass() != obj.getClass())
            return false;
        
        AccountBalanceEntity other = (AccountBalanceEntity) obj;
        
        if (accountId == null){
            if (other.accountId != null)
                return false;
        } else if (!accountId.equals(other.accountId))
            return false;
        
        if (balance == null){
            if (other.balance != null)
                return false;
        } else if (!balance.equals(other.balance))
            return false;
        
        return innerEquals(other);
    }

    private boolean innerEquals(AccountBalanceEntity other) {
        if (customerId == null){
            if (other.customerId != null)
                return false;
        } else if (!customerId.equals(other.customerId))
            return false;
        
        if (transferId == null){
            if (other.transferId != null)
                return false;
        } else if (!transferId.equals(other.transferId))
            return false;
        
        return true;
    }
    // just getters and setters
    public String getAccountId(){
        return accountId;
    }
    
    public void setAccountId(String accountId){
        this.accountId = accountId;
    }
    
    public String getCustomerId(){
        return customerId;
    }
    
    public void setCustomerId(String customerId){
        this.customerId = customerId;
    }
    
    public String getTransferId(){
        return transferId;
    }
    
    public void setTransferId(String transferId){
        this.transferId = transferId;
    }
    
    public BigDecimal getBalance(){
        return balance;
    }
    
    public void setBalance(BigDecimal balance){
        this.balance = balance;
    }        
}
