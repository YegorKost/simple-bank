package com.yegor.entities;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by YegorKost on 23.09.2016.
 */
@Entity
@Table(name = "account_type", schema = "simple_bank")
public class AccountTypeEntity {
    private byte accountTypeId;
    private String accountTypeValue;
    private String accountTypeDescription;

    @Id
    @Column(name = "account_type_id")
    public byte getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(byte accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    @Basic
    @Column(name = "account_type_value")
    public String getAccountTypeValue() {
        return accountTypeValue;
    }

    public void setAccountTypeValue(String accountTypeValue) {
        this.accountTypeValue = accountTypeValue;
    }

    @Basic
    @Column(name = "account_type_description")
    public String getAccountTypeDescription() {
        return accountTypeDescription;
    }

    public void setAccountTypeDescription(String accountTypeDescription) {
        this.accountTypeDescription = accountTypeDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountTypeEntity that = (AccountTypeEntity) o;

        if (accountTypeId != that.accountTypeId) return false;
        if (accountTypeValue != null ? !accountTypeValue.equals(that.accountTypeValue) : that.accountTypeValue != null)
            return false;
        if (accountTypeDescription != null ? !accountTypeDescription.equals(that.accountTypeDescription) : that.accountTypeDescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) accountTypeId;
        result = 31 * result + (accountTypeValue != null ? accountTypeValue.hashCode() : 0);
        result = 31 * result + (accountTypeDescription != null ? accountTypeDescription.hashCode() : 0);
        return result;
    }
}
