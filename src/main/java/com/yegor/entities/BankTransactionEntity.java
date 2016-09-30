package com.yegor.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by YegorKost on 23.09.2016.
 */
@Entity
@Table(name = "bank_transaction", schema = "simple_bank")
public class BankTransactionEntity {
    private long transactionId;
    private Timestamp transactionTimestamp;
    private long transactionAmount;
    private long transactionBalance;
    private String transactionDescription;
    private BankAccountEntity bankAccountEntity;

    @Id
    @Column(name = "transaction_id")
    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    @Basic
    @Column(name = "transaction_timestamp")
    public Timestamp getTransactionTimestamp() {
        return transactionTimestamp;
    }

    public void setTransactionTimestamp(Timestamp transactionTimestamp) {
        this.transactionTimestamp = transactionTimestamp;
    }

    @Basic
    @Column(name = "transaction_amount")
    public long getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(long transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    @Basic
    @Column(name = "transaction_balance")
    public long getTransactionBalance() {
        return transactionBalance;
    }

    public void setTransactionBalance(long transactionBalance) {
        this.transactionBalance = transactionBalance;
    }

    @Basic
    @Column(name = "transaction_description")
    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    @ManyToOne
    @JoinColumn(name = "transaction_account_id")
    public BankAccountEntity getBankAccountEntity() {
        return bankAccountEntity;
    }

    public void setBankAccountEntity(BankAccountEntity bankAccountEntity) {
        this.bankAccountEntity = bankAccountEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BankTransactionEntity that = (BankTransactionEntity) o;

        if (transactionId != that.transactionId) return false;
        if (transactionAmount != that.transactionAmount) return false;
        if (transactionBalance != that.transactionBalance) return false;
        if (transactionTimestamp != null ? !transactionTimestamp.equals(that.transactionTimestamp) : that.transactionTimestamp != null)
            return false;
        if (transactionDescription != null ? !transactionDescription.equals(that.transactionDescription) : that.transactionDescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (transactionId ^ (transactionId >>> 32));
        result = 31 * result + (transactionTimestamp != null ? transactionTimestamp.hashCode() : 0);
        result = 31 * result + (int) (transactionAmount ^ (transactionAmount >>> 32));
        result = 31 * result + (int) (transactionBalance ^ (transactionBalance >>> 32));
        result = 31 * result + (transactionDescription != null ? transactionDescription.hashCode() : 0);
        return result;
    }
}
