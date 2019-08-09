package net.devaction.entity;

/**
 * @author Víctor Gil
 *
 * since August 2019
 */
public class TransferEntity{

    private String id;
    private String accountId;
    private String amountUnscaled;
    private String amountScale;
    

    public TransferEntity(String id, String accountId, String amountUnscaled, String amountScale){
        this.id = id;
        this.accountId = accountId;
        this.amountUnscaled = amountUnscaled;
        this.amountScale = amountScale;
    }
    
    public TransferEntity(){}
    
    @Override
    public String toString(){
        return "TransferEntity [id=" + id + ", accountId=" + accountId + ", amountUnscaled=" + amountUnscaled + ", amountScale="
                + amountScale + "]";
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
        result = prime * result + ((amountScale == null) ? 0 : amountScale.hashCode());
        result = prime * result + ((amountUnscaled == null) ? 0 : amountUnscaled.hashCode());
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
        TransferEntity other = (TransferEntity) obj;
        
        // The id value should be unique, so it makes sense 
        // that it is the first field to be checked
        if (id == null){
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (amountScale == null){
            if (other.amountScale != null)
                return false;
        } else if (!amountScale.equals(other.amountScale))
            return false;
        if (amountUnscaled == null){
            if (other.amountUnscaled != null)
                return false;
        } else if (!amountUnscaled.equals(other.amountUnscaled))
            return false;
        if (accountId == null){
            if (other.accountId != null)
                return false;
        } else if (!accountId.equals(other.accountId))
            return false;
        return true;
    }

    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getAccountId(){
        return accountId;
    }
    
    public void setAccountId(String accountId){
        this.accountId = accountId;
    }
    
    public String getAmountUnscaled(){
        return amountUnscaled;
    }
    
    public void setAmountUnscaled(String amountUnscaled){
        this.amountUnscaled = amountUnscaled;
    }
    
    public String getAmountScale(){
        return amountScale;
    }
    
    public void setAmountScale(String amountScale){
        this.amountScale = amountScale;
    }    
}
