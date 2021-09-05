/*
 * This file is generated by jOOQ.
 */
package com.example.msbogper.jooq.schemabooks;


import com.example.msbogper.jooq.DefaultCatalog;
import com.example.msbogper.jooq.schemabooks.tables.Book;
import com.example.msbogper.jooq.schemabooks.tables.SchemaVersion;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Schemabooks extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>schemaBooks</code>
     */
    public static final Schemabooks SCHEMABOOKS = new Schemabooks();

    /**
     * The table <code>schemaBooks.BOOK</code>.
     */
    public final Book BOOK = Book.BOOK;

    /**
     * The table <code>schemaBooks.schema_version</code>.
     */
    public final SchemaVersion SCHEMA_VERSION = SchemaVersion.SCHEMA_VERSION;

    /**
     * No further instances allowed
     */
    private Schemabooks() {
        super("schemaBooks", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Book.BOOK,
            SchemaVersion.SCHEMA_VERSION);
    }
}
