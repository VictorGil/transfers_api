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
    
    private String id;
    private String customerId;
    private String transferId;
    private BigDecimal balance;
    
    public AccountBalanceEntity(){}
    
    public AccountBalanceEntity(String id, String customerId, String transferId, BigDecimal balance){
        this.id = id;
        this.customerId = customerId;
        this.transferId = transferId;
        this.balance = balance;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        
        result = prime * result + ((balance == null) ? 0 : balance.hashCode());
        result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        if (transferId == null){
            if (other.transferId != null)
                return false;
        } else if (!transferId.equals(other.transferId))
            return false;
        if (customerId == null){
            if (other.customerId != null)
                return false;
        } else if (!customerId.equals(other.customerId))
            return false;
        if (id == null){
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (balance == null){
            if (other.balance != null)
                return false;
        } else if (!balance.equals(other.balance))
            return false;
        return true;
    }
    
    // just getters and setters
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
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
