/*
 * This file is generated by jOOQ.
 */
package com.example.msbogper.jooq.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InDoubt implements Serializable {

    private static final long serialVersionUID = 1L;

    private String transaction;
    private String state;

    public InDoubt() {}

    public InDoubt(InDoubt value) {
        this.transaction = value.transaction;
        this.state = value.state;
    }

    public InDoubt(
        String transaction,
        String state
    ) {
        this.transaction = transaction;
        this.state = state;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.IN_DOUBT.TRANSACTION</code>.
     */
    public String getTransaction() {
        return this.transaction;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.IN_DOUBT.TRANSACTION</code>.
     */
    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.IN_DOUBT.STATE</code>.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.IN_DOUBT.STATE</code>.
     */
    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InDoubt (");

        sb.append(transaction);
        sb.append(", ").append(state);

        sb.append(")");
        return sb.toString();
    }
}
