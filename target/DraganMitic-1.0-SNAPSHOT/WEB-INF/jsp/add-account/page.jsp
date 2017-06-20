<%@ page isELIgnored="false"%>
<html>
    <body>
        <h2>Add new account</h2>
        <form method="post" action="${flowExecutionUrl}">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <input type="hidden" name="_eventId" value="performAddAccount">
            <input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
            <select name="type">
                <option value="paypal">PayPal</option>
                <option value="bank">Bank</option>
            </select>
            Enter account details<input type="text" name="account" maxlength="40" />
            <input type="submit" value="Add" />
        </form>
    </body>
</html>