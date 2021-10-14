/*
 * This file is generated by jOOQ.
 */
package com.example.msbogper.jooq.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FunctionAliases implements Serializable {

    private static final long serialVersionUID = 1L;

    private String  aliasCatalog;
    private String  aliasSchema;
    private String  aliasName;
    private String  javaClass;
    private String  javaMethod;
    private Integer dataType;
    private String  typeName;
    private Integer columnCount;
    private Short   returnsResult;
    private String  remarks;
    private Integer id;
    private String  source;

    public FunctionAliases() {}

    public FunctionAliases(FunctionAliases value) {
        this.aliasCatalog = value.aliasCatalog;
        this.aliasSchema = value.aliasSchema;
        this.aliasName = value.aliasName;
        this.javaClass = value.javaClass;
        this.javaMethod = value.javaMethod;
        this.dataType = value.dataType;
        this.typeName = value.typeName;
        this.columnCount = value.columnCount;
        this.returnsResult = value.returnsResult;
        this.remarks = value.remarks;
        this.id = value.id;
        this.source = value.source;
    }

    public FunctionAliases(
        String  aliasCatalog,
        String  aliasSchema,
        String  aliasName,
        String  javaClass,
        String  javaMethod,
        Integer dataType,
        String  typeName,
        Integer columnCount,
        Short   returnsResult,
        String  remarks,
        Integer id,
        String  source
    ) {
        this.aliasCatalog = aliasCatalog;
        this.aliasSchema = aliasSchema;
        this.aliasName = aliasName;
        this.javaClass = javaClass;
        this.javaMethod = javaMethod;
        this.dataType = dataType;
        this.typeName = typeName;
        this.columnCount = columnCount;
        this.returnsResult = returnsResult;
        this.remarks = remarks;
        this.id = id;
        this.source = source;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.ALIAS_CATALOG</code>.
     */
    public String getAliasCatalog() {
        return this.aliasCatalog;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.ALIAS_CATALOG</code>.
     */
    public void setAliasCatalog(String aliasCatalog) {
        this.aliasCatalog = aliasCatalog;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.ALIAS_SCHEMA</code>.
     */
    public String getAliasSchema() {
        return this.aliasSchema;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.ALIAS_SCHEMA</code>.
     */
    public void setAliasSchema(String aliasSchema) {
        this.aliasSchema = aliasSchema;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.ALIAS_NAME</code>.
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.ALIAS_NAME</code>.
     */
    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.JAVA_CLASS</code>.
     */
    public String getJavaClass() {
        return this.javaClass;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.JAVA_CLASS</code>.
     */
    public void setJavaClass(String javaClass) {
        this.javaClass = javaClass;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.JAVA_METHOD</code>.
     */
    public String getJavaMethod() {
        return this.javaMethod;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.JAVA_METHOD</code>.
     */
    public void setJavaMethod(String javaMethod) {
        this.javaMethod = javaMethod;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.DATA_TYPE</code>.
     */
    public Integer getDataType() {
        return this.dataType;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.DATA_TYPE</code>.
     */
    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.TYPE_NAME</code>.
     */
    public String getTypeName() {
        return this.typeName;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.TYPE_NAME</code>.
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.COLUMN_COUNT</code>.
     */
    public Integer getColumnCount() {
        return this.columnCount;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.COLUMN_COUNT</code>.
     */
    public void setColumnCount(Integer columnCount) {
        this.columnCount = columnCount;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.RETURNS_RESULT</code>.
     */
    public Short getReturnsResult() {
        return this.returnsResult;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.RETURNS_RESULT</code>.
     */
    public void setReturnsResult(Short returnsResult) {
        this.returnsResult = returnsResult;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.REMARKS</code>.
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.REMARKS</code>.
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.ID</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.ID</code>.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.SOURCE</code>.
     */
    public String getSource() {
        return this.source;
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_ALIASES.SOURCE</code>.
     */
    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FunctionAliases (");

        sb.append(aliasCatalog);
        sb.append(", ").append(aliasSchema);
        sb.append(", ").append(aliasName);
        sb.append(", ").append(javaClass);
        sb.append(", ").append(javaMethod);
        sb.append(", ").append(dataType);
        sb.append(", ").append(typeName);
        sb.append(", ").append(columnCount);
        sb.append(", ").append(returnsResult);
        sb.append(", ").append(remarks);
        sb.append(", ").append(id);
        sb.append(", ").append(source);

        sb.append(")");
        return sb.toString();
    }
}
