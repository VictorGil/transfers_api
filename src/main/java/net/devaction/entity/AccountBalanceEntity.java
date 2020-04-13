package net.devaction.entity;

import java.math.BigDecimal;

/**
 * @author Víctor Gil
 *
 * since August 2019
 *
 * DTO/POJO class to avoid having the Avro-related code and limitations
 * 
 * Analogous TypeScript class in the frontend:
 * https://github.com/VictorGil/transfers_frontend/blob/master/src/app/entities/accountBalance.ts
 */
public class AccountBalanceEntity {

    private String accountId;
    private String clientId;
    private String transferId;
    private BigDecimal balance;
    private long version;

    private static final String N_A = "N/A";

    public static AccountBalanceEntity createNAobject(String invalidAccountId) {
        AccountBalanceEntity entity = new AccountBalanceEntity();

        entity.setAccountId(invalidAccountId);
        entity.setClientId(N_A);
        entity.setTransferId(N_A);
        entity.setBalance(BigDecimal.ZERO);
        entity.setVersion(-1L);

        return entity;
    }

    public AccountBalanceEntity() {
    }

    public AccountBalanceEntity(String accountId, String clientId, String transferId,
            BigDecimal balance, long version) {
        this.accountId = accountId;
        this.clientId = clientId;
        this.transferId = transferId;
        this.balance = balance;
        this.version = version;
    }

    public AccountBalanceEntity(String accountId, String clientId) {
        this.accountId = accountId;
        this.clientId = clientId;
        this.transferId = "INITIAL";
        this.balance = BigDecimal.ZERO;
        this.version = 0L;
    }

    @Override
    public String toString() {
        return "AccountBalanceEntity [accountId=" + accountId
                + ", clientId=" + clientId + ", transferId="
                + transferId + ", balance=" + balance
                + ", version=" + version + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
        result = prime * result + ((balance == null) ? 0 : balance.hashCode());
        result = prime * result + ((clientId == null) ? 0 : clientId.hashCode());
        result = prime * result + ((transferId == null) ? 0 : transferId.hashCode());
        result = prime * result + (int) (version ^ (version >>> 32));

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        AccountBalanceEntity other = (AccountBalanceEntity) obj;

        if (accountId == null) {
            if (other.accountId != null) {
                return false;
            }
        } else if (!accountId.equals(other.accountId)) {
            return false;
        }

        if (version != other.version) {
            return false;
        }

        if (balance == null) {
            if (other.balance != null) {
                return false;
            }
        } else if (!balance.equals(other.balance)) {
            return false;
        }

        return innerEquals(other);
    }

    private boolean innerEquals(AccountBalanceEntity other) {
        if (clientId == null) {
            if (other.clientId != null) {
                return false;
            }
        } else if (!clientId.equals(other.clientId)) {
            return false;
        }

        if (transferId == null) {
            if (other.transferId != null) {
                return false;
            }
        } else if (!transferId.equals(other.transferId)) {
            return false;
        }

        return true;
    }

    // just getters and setters
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }
}
