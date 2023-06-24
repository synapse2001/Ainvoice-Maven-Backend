package com.highradius.implementation;
import com.google.gson.Gson;

import com.highradius.connection.DatabaseConnection;
import com.highradius.model.Invoice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.google.gson.Gson;
import com.highradius.connection.DatabaseConnection;
import com.highradius.model.Invoice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class InvoiceDaoImpl implements InvoiceDao {
    Connection connection = null;
    PreparedStatement ps = null;
//    private static final String INSERT_INVOICE = "INSERT INTO h2h_oap (CUSTOMER_ORDER_ID, SALES_ORG, DISTRIBUTION_CHANNEL, DIVISION, RELEASED_CREDIT_VALUE, PURCHASE_ORDER_TYPE, COMPANY_CODE, ORDER_CREATION_DATE, ORDER_CREATION_TIME, CREDIT_CONTROL_AREA, SOLD_TO_PARTY, ORDER_AMOUNT, REQUESTED_DELIVERY_DATE, ORDER_CURRENCY, CREDIT_STATUS, CUSTOMER_NUMBER, AMOUNT_IN_USD, UNIQUE_CUST_ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//    private static final String UPDATE_INVOICE = "UPDATE h2h_oap SET CUSTOMER_ORDER_ID=?, SALES_ORG=?, DISTRIBUTION_CHANNEL=?, DIVISION=?, RELEASED_CREDIT_VALUE=?, PURCHASE_ORDER_TYPE=?, COMPANY_CODE=?, ORDER_CREATION_DATE=?, ORDER_CREATION_TIME=?, CREDIT_CONTROL_AREA=?, SOLD_TO_PARTY=?, ORDER_AMOUNT=?, REQUESTED_DELIVERY_DATE=?, ORDER_CURRENCY=?, CREDIT_STATUS=?, CUSTOMER_NUMBER=?, AMOUNT_IN_USD=?, UNIQUE_CUST_ID=? WHERE Sl_no=?";
//    private static final String DELETE_INVOICE = "DELETE FROM h2h_oap WHERE Sl_no=?";
//    private static final String SELECT_ALL_INVOICES = "SELECT * FROM h2h_oap";
    private static final String INSERT_INVOICE = "INSERT INTO db_h2h_gagan.h2h_oap (CUSTOMER_ORDER_ID, SALES_ORG, DISTRIBUTION_CHANNEL, DIVISION, RELEASED_CREDIT_VALUE, PURCHASE_ORDER_TYPE, COMPANY_CODE, ORDER_CREATION_DATE, ORDER_CREATION_TIME, CREDIT_CONTROL_AREA, SOLD_TO_PARTY, ORDER_AMOUNT, REQUESTED_DELIVERY_DATE, ORDER_CURRENCY, CREDIT_STATUS, CUSTOMER_NUMBER, AMOUNT_IN_USD, UNIQUE_CUST_ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String UPDATE_INVOICE = "UPDATE db_h2h_gagan.h2h_oap SET CUSTOMER_ORDER_ID=?, SALES_ORG=?, DISTRIBUTION_CHANNEL=?, DIVISION=?, RELEASED_CREDIT_VALUE=?, PURCHASE_ORDER_TYPE=?, COMPANY_CODE=?, ORDER_CREATION_DATE=?, ORDER_CREATION_TIME=?, CREDIT_CONTROL_AREA=?, SOLD_TO_PARTY=?, ORDER_AMOUNT=?, REQUESTED_DELIVERY_DATE=?, ORDER_CURRENCY=?, CREDIT_STATUS=?, CUSTOMER_NUMBER=?, AMOUNT_IN_USD=?, UNIQUE_CUST_ID=? WHERE Sl_no=?";
    private static final String DELETE_INVOICE = "DELETE FROM db_h2h_gagan.h2h_oap WHERE Sl_no=?";
   private static final String SELECT_ALL_INVOICES = "SELECT TOP 20000 * FROM db_h2h_gagan.h2h_oap";
    // private static final String SELECT_ALL_INVOICES = "select* from db_h2h_gagan.h2h_oap limit 20000;";

    @Override
    public boolean addInvoice(Invoice invoice) {
        try {
            connection = DatabaseConnection.getConnection();
            if (connection == null) {
            	System.out.println("jbjwjjwehek");
                return false;
            }
            ps = connection.prepareStatement(INSERT_INVOICE);
            ps.setInt(1, invoice.getCustomerOrderID());
            ps.setInt(2, invoice.getSalesOrg());
            ps.setString(3, invoice.getDistributionChannel());
            ps.setString(4, invoice.getDivision());
            ps.setDouble(5, invoice.getReleasedCreditValue());
            ps.setString(6, invoice.getPurchaseOrderType());
            ps.setInt(7, invoice.getCompanyCode());
            ps.setString(8, invoice.getOrderCreationDate());
            ps.setString(9, invoice.getOrderCreationTime());
            ps.setString(10, invoice.getCreditControlArea());
            ps.setInt(11, invoice.getSoldToParty());
            ps.setDouble(12, invoice.getOrderAmount());
            ps.setString(13, invoice.getRequestedDeliveryDate());
            ps.setString(14, invoice.getOrderCurrency());
            ps.setString(15, invoice.getCreditStatus());
            ps.setInt(16, invoice.getCustomerNumber());
            ps.setDouble(17, invoice.getAmountInUsd());
            ps.setString(18, invoice.getUniqueCustId());
            int insertedRows = ps.executeUpdate();
            return insertedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } 
//        finally {
//            closeResources();
//        }
    }

    @Override
    public boolean updateInvoice(Invoice invoice) {
        try {
            connection = DatabaseConnection.getConnection();
            if (connection == null) {
                return false ;
            }
            ps = connection.prepareStatement(UPDATE_INVOICE);
            ps.setInt(1, invoice.getCustomerOrderID());
            ps.setInt(2, invoice.getSalesOrg());
            ps.setString(3, invoice.getDistributionChannel());
            ps.setString(4, invoice.getDivision());
            ps.setDouble(5, invoice.getReleasedCreditValue());
            ps.setString(6, invoice.getPurchaseOrderType());
            ps.setInt(7, invoice.getCompanyCode());
            ps.setString(8, invoice.getOrderCreationDate());
            ps.setString(9, invoice.getOrderCreationTime());
            ps.setString(10, invoice.getCreditControlArea());
            ps.setInt(11, invoice.getSoldToParty());
            ps.setDouble(12, invoice.getOrderAmount());
            ps.setString(13, invoice.getRequestedDeliveryDate());
            ps.setString(14, invoice.getOrderCurrency());
            ps.setString(15, invoice.getCreditStatus());
            ps.setInt(16, invoice.getCustomerNumber());
            ps.setDouble(17, invoice.getAmountInUsd());
            ps.setString(18, invoice.getUniqueCustId());
            ps.setInt(19, invoice.getSlNo());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } 
//        finally {
//            closeResources();
//        }
    }

    @Override
    public void deleteInvoice(int id) {
        try {
            connection = DatabaseConnection.getConnection();
            if (connection == null) {
                return;
            }
            ps = connection.prepareStatement(DELETE_INVOICE);
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
//        finally {
//            closeResources();
//        }
    }

    @Override
    public List<Invoice> getAllInvoices() {
        List<Invoice> invoices = new ArrayList<>();

        try {
            connection = DatabaseConnection.getConnection();
            if (connection == null) {
            	System.out.println("jbjwjjwehek");
            	return null;
            }

            ps = connection.prepareStatement(SELECT_ALL_INVOICES);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Invoice invoice = new Invoice(0, 0, 0, null, null, 0, null, 0, null, null, null, 0, 0, null, null, null, 0, 0, null);
                invoice.setSlNo(rs.getInt("Sl_no"));
                invoice.setCustomerOrderID(rs.getInt("CUSTOMER_ORDER_ID"));
                invoice.setSalesOrg(rs.getInt("SALES_ORG"));
                invoice.setDistributionChannel(rs.getString("DISTRIBUTION_CHANNEL"));
                invoice.setDivision(rs.getString("DIVISION"));
                invoice.setReleasedCreditValue(rs.getDouble("RELEASED_CREDIT_VALUE"));
                invoice.setPurchaseOrderType(rs.getString("PURCHASE_ORDER_TYPE"));
                invoice.setCompanyCode(rs.getInt("COMPANY_CODE"));
                invoice.setOrderCreationDate(rs.getString("ORDER_CREATION_DATE"));
                invoice.setOrderCreationTime(rs.getString("ORDER_CREATION_TIME"));
                invoice.setCreditControlArea(rs.getString("CREDIT_CONTROL_AREA"));
                invoice.setSoldToParty(rs.getInt("SOLD_TO_PARTY"));
                invoice.setOrderAmount(rs.getDouble("ORDER_AMOUNT"));
                invoice.setRequestedDeliveryDate(rs.getString("REQUESTED_DELIVERY_DATE"));
                invoice.setOrderCurrency(rs.getString("ORDER_CURRENCY"));
                invoice.setCreditStatus(rs.getString("CREDIT_STATUS"));
                invoice.setCustomerNumber(rs.getInt("CUSTOMER_NUMBER"));
                invoice.setAmountInUsd(rs.getDouble("AMOUNT_IN_USD"));
                invoice.setUniqueCustId(rs.getString("UNIQUE_CUST_ID"));

                invoices.add(invoice);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
//        finally {
//            closeResources();
//        }

        return invoices;
    }

    private void closeResources() {
        try {
            if (ps != null) {
                ps.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
