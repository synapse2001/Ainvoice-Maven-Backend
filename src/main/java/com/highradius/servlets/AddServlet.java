//package com.highradius.servlets;
//
//import com.highradius.model.Invoice;
//
//import com.highradius.implementation.*;
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//
//@WebServlet("/TestServlet")
//public class AddServlet extends HttpServlet {
//	
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		Invoice invoice=null;
//		InvoiceDao dao=null;
////		String s_slNo=null;
////	    String s_customerOrderID=null;
////	    String s_salesOrg=null;
////	    String s_distributionChannel=null;
////	    String s_companyCode=null;
////	    String s_orderCreationDate=null;
////	    String s_orderAmount=null;
////	    String s_orderCurrency=null;
////	    String s_customerNumber=null;
////	    String s_amountInUsd=null;
//		String s_slNo = request.getParameter("slNo");
//		int slNo = Integer.parseInt(s_slNo);
//		String s_customerOrderID = request.getParameter("customerOrderID");
//		int customerOrderID = Integer.parseInt(s_customerOrderID);
//		String s_salesOrg = request.getParameter("salesOrg");
//		int salesOrg = Integer.parseInt(s_salesOrg);
//		String s_distributionChannel = request.getParameter("distributionChannel");
//		String s_companyCode = request.getParameter("companyCode");
//		int companyCode = Integer.parseInt(s_companyCode);
//		String s_orderCreationDate = request.getParameter("orderCreationDate");
//		String s_orderAmount = request.getParameter("orderAmount");
//	    int orderAmount = Integer.parseInt(s_orderAmount);
//		String s_orderCurrency = request.getParameter("orderCurrency");
//		String s_customerNumber = request.getParameter("customerNumber");
//		int customerNumber = Integer.parseInt(s_customerNumber);
//		String s_amountInUsd = request.getParameter("amountInUsd");
//		int amountInUsd = Integer.parseInt(s_amountInUsd);
//		
//			 
//		    
//		if(slNo != 0 && customerOrderID != 0 && salesOrg != 0 && s_distributionChannel != null && companyCode != 0 && s_orderCreationDate != null && orderAmount != 0 && s_orderCurrency != null && customerNumber != 0 && amountInUsd != 0) {
//			invoice = new Invoice(slNo,customerOrderID,salesOrg,s_distributionChannel,companyCode,s_orderCreationDate,orderAmount,s_orderCurrency,customerNumber,amountInUsd) ;
//		    dao=new InvoiceDaoImpl();
//			boolean inserted=dao.addInvoice(invoice);
//			if(inserted) {
//				response.getWriter().append("Inserted data");
//				}
//			else {
//				response.getWriter().append("error in inserion");
//			}
//		
//		}
//		else {
//			response.getWriter().append("Insufficient data");
//		}	
//	}
//}







// ------------------------------------------------------------------------------------



package com.highradius.servlets;

import com.highradius.model.Invoice;
import com.highradius.implementation.InvoiceDaoImpl;
import com.highradius.implementation.InvoiceDao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        InvoiceDao dao = new InvoiceDaoImpl();

        String s_slNo = request.getParameter("slNo");
        int slNo = 0;
        if (s_slNo != null && !s_slNo.isEmpty()) {
            slNo = Integer.parseInt(s_slNo);
        }

        String s_customerOrderID = request.getParameter("customerOrderID");
        int customerOrderID = 0;
        if (s_customerOrderID != null && !s_customerOrderID.isEmpty()) {
            customerOrderID = Integer.parseInt(s_customerOrderID);
        }

        String s_salesOrg = request.getParameter("salesOrg");
        int salesOrg = 0;
        if (s_salesOrg != null && !s_salesOrg.isEmpty()) {
            salesOrg = Integer.parseInt(s_salesOrg);
        }

        String distributionChannel = request.getParameter("distributionChannel");
        if (distributionChannel == null || distributionChannel.isEmpty()) {
        }

        String division = request.getParameter("division");
        if (division == null || division.isEmpty()) {
        }

        String s_releasedCreditValue = request.getParameter("releasedCreditValue");
        double releasedCreditValue = 0;
        if (s_releasedCreditValue != null && !s_releasedCreditValue.isEmpty()) {
            releasedCreditValue = Double.parseDouble(s_releasedCreditValue);
        }

        String purchaseOrderType = request.getParameter("purchaseOrderType");
        if (purchaseOrderType == null || purchaseOrderType.isEmpty()) {
        }

        String s_companyCode = request.getParameter("companyCode");
        int companyCode = 0;
        if (s_companyCode != null && !s_companyCode.isEmpty()) {
            companyCode = Integer.parseInt(s_companyCode);
        }

        String orderCreationDate = request.getParameter("orderCreationDate");
        if (orderCreationDate == null || orderCreationDate.isEmpty()) {
        }

        String orderCreationTime = request.getParameter("orderCreationTime");
        if (orderCreationTime == null || orderCreationTime.isEmpty()) {
        }

        String creditControlArea = request.getParameter("creditControlArea");
        if (creditControlArea == null || creditControlArea.isEmpty()) {
        }

        String s_soldToParty = request.getParameter("soldToParty");
        int soldToParty = 0;
        if (s_soldToParty != null && !s_soldToParty.isEmpty()) {
            soldToParty = Integer.parseInt(s_soldToParty);
        }

        String s_orderAmount = request.getParameter("orderAmount");
        double orderAmount = 0;
        if (s_orderAmount != null && !s_orderAmount.isEmpty()) {
            orderAmount = Double.parseDouble(s_orderAmount);
        }

        String requestedDeliveryDate = request.getParameter("requestedDeliveryDate");
        if (requestedDeliveryDate == null || requestedDeliveryDate.isEmpty()) {
        }

        String orderCurrency = request.getParameter("orderCurrency");
        if (orderCurrency == null || orderCurrency.isEmpty()) {
        }

        String creditStatus = request.getParameter("creditStatus");
        if (creditStatus == null || creditStatus.isEmpty()) {
        }

        String s_customerNumber = request.getParameter("customerNumber");
        int customerNumber = 0;
        if (s_customerNumber != null && !s_customerNumber.isEmpty()) {
            customerNumber = Integer.parseInt(s_customerNumber);
        }

        String s_amountInUsd = request.getParameter("amountInUsd");
        double amountInUsd = 0;
        if (s_amountInUsd != null && !s_amountInUsd.isEmpty()) {
            amountInUsd = Double.parseDouble(s_amountInUsd);
        }

        String uniqueCustID = request.getParameter("uniqueCustID");
        if (uniqueCustID == null || uniqueCustID.isEmpty()) {
        }

        if (slNo != 0 && customerOrderID != 0 && salesOrg != 0 && distributionChannel != null
                && division != null && releasedCreditValue != 0 && purchaseOrderType != null
                && companyCode != 0 && orderCreationDate != null && orderCreationTime != null
                && creditControlArea != null && soldToParty != 0 && orderAmount != 0
                && requestedDeliveryDate != null && orderCurrency != null && creditStatus != null
                && customerNumber != 0 && amountInUsd != 0 && uniqueCustID != null) {
            Invoice invoice = new Invoice(slNo, customerOrderID, salesOrg, distributionChannel, division,
                    releasedCreditValue, purchaseOrderType, companyCode, orderCreationDate, orderCreationTime,
                    creditControlArea, soldToParty, orderAmount, requestedDeliveryDate, orderCurrency,
                    creditStatus, customerNumber, amountInUsd, uniqueCustID);
            boolean inserted = dao.addInvoice(invoice);
            if (inserted) {
                response.getWriter().append("Inserted data");
            } else {
                response.getWriter().append("Error in insertion");
            }
        } else {
            response.getWriter().append("Insufficient data");
        }
    }
}
