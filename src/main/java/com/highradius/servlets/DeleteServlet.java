package com.highradius.servlets;

import com.highradius.implementation.InvoiceDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DeleteInvoiceServlet")
public class DeleteServlet extends HttpServlet {
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("slNo");
        if (id != null && !id.isEmpty()) {
            int invoiceId = Integer.parseInt(id);
            InvoiceDaoImpl invoiceDao = new InvoiceDaoImpl();
            invoiceDao.deleteInvoice(invoiceId);
            response.getWriter().append("Invoice deleted successfully");
        } else {
            response.getWriter().append("Invalid invoice ID");
        }
    }
}