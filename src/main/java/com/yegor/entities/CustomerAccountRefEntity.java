package com.yegor.entities;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by YegorKost on 23.09.2016.
 */
@Entity
@Table(name = "customer_account_ref", schema = "simple_bank")
@IdClass(CustomerAccountRefEntityPK.class)
public class CustomerAccountRefEntity {
    private long customerId;
    private long accountId;
    private Timestamp customerAccountRefTimestamp;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private BankAccountEntity bankAccount;

    @Id
    @Column(name = "customer_id")
    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    @Id
    @Column(name = "account_id")
    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    @Basic
    @Column(name = "customer_account_ref_timestamp")
    public Timestamp getCustomerAccountRefTimestamp() {
        return customerAccountRefTimestamp;
    }

    public void setCustomerAccountRefTimestamp(Timestamp customerAccountRefTimestamp) {
        this.customerAccountRefTimestamp = customerAccountRefTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerAccountRefEntity that = (CustomerAccountRefEntity) o;

        if (customerId != that.customerId) return false;
        if (accountId != that.accountId) return false;
        if (customerAccountRefTimestamp != null ? !customerAccountRefTimestamp.equals(that.customerAccountRefTimestamp) : that.customerAccountRefTimestamp != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (customerId ^ (customerId >>> 32));
        result = 31 * result + (int) (accountId ^ (accountId >>> 32));
        result = 31 * result + (customerAccountRefTimestamp != null ? customerAccountRefTimestamp.hashCode() : 0);
        return result;
    }
}
