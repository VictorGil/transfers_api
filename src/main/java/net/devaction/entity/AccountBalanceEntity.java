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
    private BigDecimal balance;
        
    public AccountBalanceEntity(String id, String customerId, BigDecimal balance){
        this.id = id;
        this.customerId = customerId;
        this.balance = balance;
    }
    
    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((balance == null) ? 0 : balance.hashCode());
        result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        if (balance == null){
            if (other.balance != null)
                return false;
        } else if (!balance.equals(other.balance))
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
        return true;
    }

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
    public BigDecimal getBalance(){
        return balance;
    }
    public void setBalance(BigDecimal balance){
        this.balance = balance;
    }
}
