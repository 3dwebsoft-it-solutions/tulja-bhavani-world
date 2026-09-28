<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Products List</title>
    <link rel="stylesheet" href="/CSS/product.css">
    <jsp:include page="Menu.jsp"></jsp:include>
</head>
<body>
    <h1>Products</h1>
    <!-- Add Product link removed per request -->
    <table class="productCart">
        <tr><th>ID</th><th>Name</th><th>Price</th><th>Actions</th></tr>
        <c:forEach var="p" items="${products}">
            <tr>
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td>${p.price}</td>
                <td>
                    <!-- Edit/Delete actions removed per request -->
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>