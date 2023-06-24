<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Invoices</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script>
        $(document).ready(function() {
            $.get("http://ainvoice-backend.azurewebsites.net/DataLoadingServlet")
                .done(function(data) {
                    var invoices = data;
                    var rows = "";
                    for (var i = 0; i < invoices.length; i++) {
                        var invoice = invoices[i];
                        rows += "<tr>";
                        rows += "<td>" + invoice.slNo + "</td>";
                        rows += "<td>" + invoice.customerOrderID + "</td>";
                        rows += "<td>" + invoice.salesOrg + "</td>";
                        rows += "<td>" + invoice.distributionChannel + "</td>";
                        rows += "<td>" + invoice.division + "</td>";
                        rows += "<td>" + invoice.releasedCreditValue + "</td>";
                        rows += "<td>" + invoice.purchaseOrderType + "</td>";
                        rows += "<td>" + invoice.companyCode + "</td>";
                        rows += "<td>" + invoice.orderCreationDate + "</td>";
                        rows += "<td>" + invoice.orderCreationTime + "</td>";
                        rows += "<td>" + invoice.creditControlArea + "</td>";
                        rows += "<td>" + invoice.soldToParty + "</td>";
                        rows += "<td>" + invoice.orderAmount + "</td>";
                        rows += "<td>" + invoice.requestedDeliveryDate + "</td>";
                        rows += "<td>" + invoice.orderCurrency + "</td>";
                        rows += "<td>" + invoice.creditStatus + "</td>";
                        rows += "<td>" + invoice.customerNumber + "</td>";
                        rows += "<td>" + invoice.amountInUsd + "</td>";
                        rows += "<td>" + invoice.uniqueCustId + "</td>";
                        rows += "</tr>";
                    }
                    $("#invoiceTable tbody").html(rows);
                })
                .fail(function(xhr, status, error) {
                    console.log("Request failed. Status: " + status + ". Error: " + error);
                });
        });
    </script>
</head>
<body>
    <table id="invoiceTable">
        <thead>
            <tr>
                <th>Sl. No.</th>
                <th>Customer Order ID</th>
                <th>Sales Org</th>
                <th>Distribution Channel</th>
                <th>Division</th>
                <th>Released Credit Value</th>
                <th>Purchase Order Type</th>
                <th>Company Code</th>
                <th>Order Creation Date</th>
                <th>Order Creation Time</th>
                <th>Credit Control Area</th>
                <th>Sold To Party</th>
                <th>Order Amount</th>
                <th>Requested Delivery Date</th>
                <th>Order Currency</th>
                <th>Credit Status</th>
                <th>Customer Number</th>
                <th>Amount in USD</th>
                <th>Unique Cust ID</th>
            </tr>
        </thead>
        <tbody>
        </tbody>
    </table>
</body>
</html>
