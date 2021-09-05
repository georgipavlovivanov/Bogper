/*
 * This file is generated by jOOQ.
 */
package com.example.msbogper.jooq;


import com.example.msbogper.jooq.information_schema.InformationSchema;
import com.example.msbogper.jooq.schemabooks.Schemabooks;

import java.util.Arrays;
import java.util.List;

import org.jooq.Schema;
import org.jooq.impl.CatalogImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultCatalog extends CatalogImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DEFAULT_CATALOG</code>
     */
    public static final DefaultCatalog DEFAULT_CATALOG = new DefaultCatalog();

    /**
     * The schema <code>INFORMATION_SCHEMA</code>.
     */
    public final InformationSchema INFORMATION_SCHEMA = InformationSchema.INFORMATION_SCHEMA;

    /**
     * The schema <code>schemaBooks</code>.
     */
    public final Schemabooks SCHEMABOOKS = Schemabooks.SCHEMABOOKS;

    /**
     * No further instances allowed
     */
    private DefaultCatalog() {
        super("");
    }

    @Override
    public final List<Schema> getSchemas() {
        return Arrays.<Schema>asList(
            InformationSchema.INFORMATION_SCHEMA,
            Schemabooks.SCHEMABOOKS);
    }
}
