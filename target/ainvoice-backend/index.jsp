<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="http://ainvoice-backend.azurewebsites.net/AddServlet">

<label for="slNo">Enter Sl_no</label> <input type="number" name="slNo" id="slNo"><br>

<label for="customerOrderID">Enter CUSTOMER_ORDER_ID</label>
<input type="number" name="customerOrderID" id="customerOrderID"><br>

<label for="salesOrg">Enter SALES_ORG</label> <input type="number" name="salesOrg" id="salesOrg"><br>

<label for="distributionChannel">Enter DISTRIBUTION_CHANNEL</label>
<input type="text" name="distributionChannel" id="distributionChannel"><br>

<label for="division">Enter DIVISION</label>
<input type="text" name="division" id="division"><br>

<label for="releasedCreditValue">Enter RELEASED_CREDIT_VALUE</label>
<input type="number" name="releasedCreditValue" id="releasedCreditValue"><br>

<label for="purchaseOrderType">Enter PURCHASE_ORDER_TYPE</label>
<input type="text" name="purchaseOrderType" id="purchaseOrderType"><br>

<label for="companyCode">Enter COMPANY_CODE</label>
<input type="number" name="companyCode" id="companyCode"><br>

<label for="orderCreationDate">Enter ORDER_CREATION_DATE</label>
<input type="text" name="orderCreationDate" id="orderCreationDate"><br>

<label for="orderCreationTime">Enter ORDER_CREATION_TIME</label>
<input type="text" name="orderCreationTime" id="orderCreationTime"><br>

<label for="creditControlArea">Enter CREDIT_CONTROL_AREA</label>
<input type="text" name="creditControlArea" id="creditControlArea"><br>

<label for="soldToParty">Enter SOLD_TO_PARTY</label>
<input type="number" name="soldToParty" id="soldToParty"><br>

<label for="orderAmount">Enter ORDER_AMOUNT</label>
<input type="number" name="orderAmount" id="orderAmount"><br>

<label for="requestedDeliveryDate">Enter REQUESTED_DELIVERY_DATE</label>
<input type="text" name="requestedDeliveryDate" id="requestedDeliveryDate"><br>

<label for="orderCurrency">Enter ORDER_CURRENCY</label>
<input type="text" name="orderCurrency" id="orderCurrency"><br>

<label for="creditStatus">Enter CREDIT_STATUS</label>
<input type="text" name="creditStatus" id="creditStatus"><br>

<label for="customerNumber">Enter CUSTOMER_NUMBER</label>
<input type="number" name="customerNumber" id="customerNumber"><br>

<label for="amountInUsd">Enter AMOUNT_IN_USD</label>
<input type="number" name="amountInUsd" id="amountInUsd"><br>

<label for="uniqueCustID">Enter UNIQUE_CUST_ID</label>
<input type="text" name="uniqueCustID" id="uniqueCustID"><br>

<button type="submit" value="Add Data">Submit</button>
</form>
</body>
</html>
