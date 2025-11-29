<%-- ensure user logged in --%>
<%@page import="com.praosha.model.Product"%>
<%@page import="java.util.List"%>
<%
  if (session.getAttribute("user")==null) { response.sendRedirect("login.jsp"); return; }
  List<Product> products = (List<Product>) request.getAttribute("products");
%>
<h2>Products</h2>
<c:forEach var="p" items="${products}">
  <div>
    <h3>${p.name}</h3>
    <p>${p.description}</p>
    <p>₹ ${p.price}</p>
  </div>
</c:forEach>
