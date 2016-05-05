<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:import url="/header.html" />
    <body>
         <header><h1>Titan Bank - Transactions</h1></header>
         <c:import url="/navigation.html" />
         <h2>Account Balances</h2>
         <h3>Checking: ${checking.balance} || Savings: ${savings.balance}</h3>
        <p>====================================================</p>
         <h2>Transfer Funds from Checking to Savings</h2>
         <p><i>${message}</i></p>
         <form action="transaction" method="post" >
            <input type="hidden" name="action" value="toSavings">
            
            <label>Transfer Amount: </label>
            <input type="double" name="amount" >
             <p></p>
            <input type="submit" value="Transfer to Savings">
        </form>
        <p>====================================================</p>
        <h2>Transfer Funds from Savings to Checking</h2>
         <p><i>${message}</i></p>
         <form action="transaction" method="post" >
            <input type="hidden" name="action" value="toChecking">
            <label>Transfer Amount: </label>
            <input type="double" name="amount" >
             <p></p>
            <input type="submit" value="Transfer to Checking">
        </form>
    
        <c:import url="/footer.jsp" />   
    </body>
</html>
