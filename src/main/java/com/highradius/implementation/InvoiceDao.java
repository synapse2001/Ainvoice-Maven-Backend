package com.highradius.implementation;

import com.highradius.model.Invoice;

import java.util.List;

public interface InvoiceDao {
    List<Invoice> getAllInvoices();

    boolean addInvoice(Invoice invoice);

    boolean updateInvoice(Invoice invoice);

    void deleteInvoice(int id);
}