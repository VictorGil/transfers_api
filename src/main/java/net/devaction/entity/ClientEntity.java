package net.devaction.entity;

import java.util.UUID;

/**
 * @author Víctor Gil
 *
 * since August 2019
 */
public class ClientEntity{
    
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String level;
    
    public ClientEntity() {}       
    
    public ClientEntity(String id, String firstName, String lastName, String email, String address, String level){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.level = level;
    }

    public ClientEntity(String firstName, String lastName, String email, String address, String level){
        this.id = generateRandomId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.level = level;
    }
    
    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        
        result = prime * result + ((id == null) ? 0 : id.hashCode());        
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((level == null) ? 0 : level.hashCode());
        
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
        
        ClientEntity other = (ClientEntity) obj;
        
        if (id == null){
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        
        if (address == null){
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        
        if (email == null){
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        
        if (firstName == null){
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        
        if (lastName == null){
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        
        if (level == null){
            if (other.level != null)
                return false;
        } else if (!level.equals(other.level))
            return false;
        
        return true;
    }

    @Override
    public String toString(){
        return "ClientEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", address="
                + address + ", level=" + level + "]";
    }

    public void generateId(){
        if (id != null)
            throw new IllegalStateException(
                    "The id should not have been given any value");
        
        id = generateRandomId();    
    }
    
    String generateRandomId(){
        // last 12 hexadecimal digits of the random UUID
        return UUID.randomUUID().toString().substring(24);
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getLevel(){
        return level;
    }
    
    public void setLevel(String level){
        this.level = level;
    }    
}
