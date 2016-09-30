package com.yegor.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by YegorKost on 23.09.2016.
 */
public class CustomerAccountRefEntityPK implements Serializable {
    private long customerId;
    private long accountId;

    @Column(name = "customer_id")
    @Id
    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    @Column(name = "account_id")
    @Id
    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerAccountRefEntityPK that = (CustomerAccountRefEntityPK) o;

        if (customerId != that.customerId) return false;
        if (accountId != that.accountId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (customerId ^ (customerId >>> 32));
        result = 31 * result + (int) (accountId ^ (accountId >>> 32));
        return result;
    }
}
