package com.yegor.entities;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by YegorKost on 23.09.2016.
 */
@Entity
@Table(name = "customer", schema = "simple_bank")
public class CustomerEntity {
    private long customerId;
    private String customerLastName;
    private String customerFirstName;
    private String customerMiddleInitial;
    private String customerState;
    private String customerCity;
    private String customerStreet;
    private int customerZipCode;
    private long customerPhone;
    private String customerMail;
    private Set<CustomerAccountRefEntity> bankAccounts;

    @Id
    @Column(name = "customer_id")
    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "customer_last_name")
    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    @Basic
    @Column(name = "customer_first_name")
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    @Basic
    @Column(name = "customer_middle_initial")
    public String getCustomerMiddleInitial() {
        return customerMiddleInitial;
    }

    public void setCustomerMiddleInitial(String customerMiddleInitial) {
        this.customerMiddleInitial = customerMiddleInitial;
    }

    @Basic
    @Column(name = "customer_state")
    public String getCustomerState() {
        return customerState;
    }

    public void setCustomerState(String customerState) {
        this.customerState = customerState;
    }

    @Basic
    @Column(name = "customer_city")
    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    @Basic
    @Column(name = "customer_street")
    public String getCustomerStreet() {
        return customerStreet;
    }

    public void setCustomerStreet(String customerStreet) {
        this.customerStreet = customerStreet;
    }

    @Basic
    @Column(name = "customer_zip_code")
    public int getCustomerZipCode() {
        return customerZipCode;
    }

    public void setCustomerZipCode(int customerZipCode) {
        this.customerZipCode = customerZipCode;
    }

    @Basic
    @Column(name = "customer_phone")
    public long getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(long customerPhone) {
        this.customerPhone = customerPhone;
    }

    @Basic
    @Column(name = "customer_mail")
    public String getCustomerMail() {
        return customerMail;
    }

    public void setCustomerMail(String customerMail) {
        this.customerMail = customerMail;
    }

    @OneToMany(mappedBy = "customer")
    public Set<CustomerAccountRefEntity> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(Set<CustomerAccountRefEntity> customerAccountRefEntitySet) {
        this.bankAccounts = customerAccountRefEntitySet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerEntity that = (CustomerEntity) o;

        if (customerId != that.customerId) return false;
        if (customerZipCode != that.customerZipCode) return false;
        if (customerPhone != that.customerPhone) return false;
        if (customerLastName != null ? !customerLastName.equals(that.customerLastName) : that.customerLastName != null)
            return false;
        if (customerFirstName != null ? !customerFirstName.equals(that.customerFirstName) : that.customerFirstName != null)
            return false;
        if (customerMiddleInitial != null ? !customerMiddleInitial.equals(that.customerMiddleInitial) : that.customerMiddleInitial != null)
            return false;
        if (customerState != null ? !customerState.equals(that.customerState) : that.customerState != null)
            return false;
        if (customerCity != null ? !customerCity.equals(that.customerCity) : that.customerCity != null) return false;
        if (customerStreet != null ? !customerStreet.equals(that.customerStreet) : that.customerStreet != null)
            return false;
        if (customerMail != null ? !customerMail.equals(that.customerMail) : that.customerMail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (customerId ^ (customerId >>> 32));
        result = 31 * result + (customerLastName != null ? customerLastName.hashCode() : 0);
        result = 31 * result + (customerFirstName != null ? customerFirstName.hashCode() : 0);
        result = 31 * result + (customerMiddleInitial != null ? customerMiddleInitial.hashCode() : 0);
        result = 31 * result + (customerState != null ? customerState.hashCode() : 0);
        result = 31 * result + (customerCity != null ? customerCity.hashCode() : 0);
        result = 31 * result + (customerStreet != null ? customerStreet.hashCode() : 0);
        result = 31 * result + customerZipCode;
        result = 31 * result + (int) (customerPhone ^ (customerPhone >>> 32));
        result = 31 * result + (customerMail != null ? customerMail.hashCode() : 0);
        return result;
    }
}
