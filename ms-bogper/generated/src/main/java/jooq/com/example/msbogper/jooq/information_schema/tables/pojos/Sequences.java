/*
 * This file is generated by jOOQ.
 */
package com.example.msbogper.jooq.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences implements Serializable {

    private static final long serialVersionUID = 1L;

    private String  sequenceCatalog;
    private String  sequenceSchema;
    private String  sequenceName;
    private Long    currentValue;
    private Long    increment;
    private Boolean isGenerated;
    private String  remarks;
    private Long    cache;
    private Long    minValue;
    private Long    maxValue;
    private Boolean isCycle;
    private Integer id;

    public Sequences() {}

    public Sequences(Sequences value) {
        this.sequenceCatalog = value.sequenceCatalog;
        this.sequenceSchema = value.sequenceSchema;
        this.sequenceName = value.sequenceName;
        this.currentValue = value.currentValue;
        this.increment = value.increment;
        this.isGenerated = value.isGenerated;
        this.remarks = value.remarks;
        this.cache = value.cache;
        this.minValue = value.minValue;
        this.maxValue = value.maxValue;
        this.isCycle = value.isCycle;
        this.id = value.id;
    }

    public Sequences(
        String  sequenceCatalog,
        String  sequenceSchema,
        String  sequenceName,
        Long    currentValue,
        Long    increment,
        Boolean isGenerated,
        String  remarks,
        Long    cache,
        Long    minValue,
        Long    maxValue,
        Boolean isCycle,
        Integer id
    ) {
        this.sequenceCatalog = sequenceCatalog;
        this.sequenceSchema = sequenceSchema;
        this.sequenceName = sequenceName;
        this.currentValue = currentValue;
        this.increment = increment;
        this.isGenerated = isGenerated;
        this.remarks = remarks;
        this.cache = cache;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.isCycle = isCycle;
        this.id = id;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SEQUENCES.SEQUENCE_CATALOG</code>.
     */
    public String getSequenceCatalog() {
        return this.sequenceCatalog;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SEQUENCES.SEQUENCE_CATALOG</code>.
     */
    public void setSequenceCatalog(String sequenceCatalog) {
        this.sequenceCatalog = sequenceCatalog;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SEQUENCES.SEQUENCE_SCHEMA</code>.
     */
    public String getSequenceSchema() {
        return this.sequenceSchema;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SEQUENCES.SEQUENCE_SCHEMA</code>.
     */
    public void setSequenceSchema(String sequenceSchema) {
        this.sequenceSchema = sequenceSchema;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SEQUENCES.SEQUENCE_NAME</code>.
     */
    public String getSequenceName() {
        return this.sequenceName;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SEQUENCES.SEQUENCE_NAME</code>.
     */
    public void setSequenceName(String sequenceName) {
        this.sequenceName = sequenceName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SEQUENCES.CURRENT_VALUE</code>.
     */
    public Long getCurrentValue() {
        return this.currentValue;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SEQUENCES.CURRENT_VALUE</code>.
     */
    public void setCurrentValue(Long currentValue) {
        this.currentValue = currentValue;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SEQUENCES.INCREMENT</code>.
     */
    public Long getIncrement() {
        return this.increment;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SEQUENCES.INCREMENT</code>.
     */
    public void setIncrement(Long increment) {
        this.increment = increment;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SEQUENCES.IS_GENERATED</code>.
     */
    public Boolean getIsGenerated() {
        return this.isGenerated;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SEQUENCES.IS_GENERATED</code>.
     */
    public void setIsGenerated(Boolean isGenerated) {
        this.isGenerated = isGenerated;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SEQUENCES.REMARKS</code>.
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SEQUENCES.REMARKS</code>.
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SEQUENCES.CACHE</code>.
     */
    public Long getCache() {
        return this.cache;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SEQUENCES.CACHE</code>.
     */
    public void setCache(Long cache) {
        this.cache = cache;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SEQUENCES.MIN_VALUE</code>.
     */
    public Long getMinValue() {
        return this.minValue;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SEQUENCES.MIN_VALUE</code>.
     */
    public void setMinValue(Long minValue) {
        this.minValue = minValue;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SEQUENCES.MAX_VALUE</code>.
     */
    public Long getMaxValue() {
        return this.maxValue;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SEQUENCES.MAX_VALUE</code>.
     */
    public void setMaxValue(Long maxValue) {
        this.maxValue = maxValue;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SEQUENCES.IS_CYCLE</code>.
     */
    public Boolean getIsCycle() {
        return this.isCycle;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SEQUENCES.IS_CYCLE</code>.
     */
    public void setIsCycle(Boolean isCycle) {
        this.isCycle = isCycle;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.SEQUENCES.ID</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.SEQUENCES.ID</code>.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Sequences (");

        sb.append(sequenceCatalog);
        sb.append(", ").append(sequenceSchema);
        sb.append(", ").append(sequenceName);
        sb.append(", ").append(currentValue);
        sb.append(", ").append(increment);
        sb.append(", ").append(isGenerated);
        sb.append(", ").append(remarks);
        sb.append(", ").append(cache);
        sb.append(", ").append(minValue);
        sb.append(", ").append(maxValue);
        sb.append(", ").append(isCycle);
        sb.append(", ").append(id);

        sb.append(")");
        return sb.toString();
    }
}
