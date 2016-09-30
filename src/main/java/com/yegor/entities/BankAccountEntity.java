package com.yegor.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

/**
 * Created by YegorKost on 23.09.2016.
 */
@Entity
@Table(name = "bank_account", schema = "simple_bank")
public class BankAccountEntity {
    private long accountId;
    private Long accountBalance;
    private Long accountCreditLine;
    private Timestamp accountLastAccess;
    private Timestamp accountCreated;
    private AccountTypeEntity accountTypeEntity;
    private Set<BankTransactionEntity> bankTransactionEntitySet;
    private Set<CustomerAccountRefEntity> customers;

    @Id
    @Column(name = "account_id")
    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "account_balance")
    public Long getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Long accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Basic
    @Column(name = "account_credit_line")
    public Long getAccountCreditLine() {
        return accountCreditLine;
    }

    public void setAccountCreditLine(Long accountCreditLine) {
        this.accountCreditLine = accountCreditLine;
    }

    @Basic
    @Column(name = "account_last_access")
    public Timestamp getAccountLastAccess() {
        return accountLastAccess;
    }

    public void setAccountLastAccess(Timestamp accountLastAccess) {
        this.accountLastAccess = accountLastAccess;
    }

    @Basic
    @Column(name = "account_created")
    public Timestamp getAccountCreated() {
        return accountCreated;
    }

    public void setAccountCreated(Timestamp accountCreated) {
        this.accountCreated = accountCreated;
    }

    @ManyToOne
    @JoinColumn(name = "account_type_id")
    public AccountTypeEntity getAccountTypeEntity() {
        return accountTypeEntity;
    }

    public void setAccountTypeEntity(AccountTypeEntity accountTypeEntity) {
        this.accountTypeEntity = accountTypeEntity;
    }

    @OneToMany(mappedBy = "bankAccountEntity")
    public Set<BankTransactionEntity> getBankTransactionEntitySet() {
        return bankTransactionEntitySet;
    }

    public void setBankTransactionEntitySet(Set<BankTransactionEntity> bankTransactionEntitySet) {
        this.bankTransactionEntitySet = bankTransactionEntitySet;
    }

    @OneToMany(mappedBy = "bankAccount")
    public Set<CustomerAccountRefEntity> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<CustomerAccountRefEntity> customers) {
        this.customers = customers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BankAccountEntity that = (BankAccountEntity) o;

        if (accountId != that.accountId) return false;
        if (accountBalance != null ? !accountBalance.equals(that.accountBalance) : that.accountBalance != null)
            return false;
        if (accountCreditLine != null ? !accountCreditLine.equals(that.accountCreditLine) : that.accountCreditLine != null)
            return false;
        if (accountLastAccess != null ? !accountLastAccess.equals(that.accountLastAccess) : that.accountLastAccess != null)
            return false;
        if (accountCreated != null ? !accountCreated.equals(that.accountCreated) : that.accountCreated != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (accountId ^ (accountId >>> 32));
        result = 31 * result + (accountBalance != null ? accountBalance.hashCode() : 0);
        result = 31 * result + (accountCreditLine != null ? accountCreditLine.hashCode() : 0);
        result = 31 * result + (accountLastAccess != null ? accountLastAccess.hashCode() : 0);
        result = 31 * result + (accountCreated != null ? accountCreated.hashCode() : 0);
        return result;
    }
}
