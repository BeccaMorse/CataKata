<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:import url="common/header.jsp">
	<c:param name="title" value="Fibonacci"></c:param>
</c:import>

<nav id="page-options">
	<ul>
		<c:set var="numberOfItems" value="20" />
		<c:url var="fibonacciRoute" value="fibonacci.jsp">
			<c:param value="${ numberOfItems }" name="max" />
		</c:url>
		<li><a href="<c:out value="${ fibonacciRoute }" />"><c:out
					value="${ numberOfItems }" /></a></li>

		<c:set var="numberOfItems" value="50" />
		<c:url var="fibonacciRoute" value="fibonacci.jsp">
			<c:param value="${ numberOfItems }" name="max" />
		</c:url>
		<li><a href="<c:out value="${ fibonacciRoute }" />"><c:out
					value="${ numberOfItems }" /></a></li>

		<c:set var="numberOfItems" value="100" />
		<c:url var="fibonacciRoute" value="fibonacci.jsp">
			<c:param value="${ numberOfItems }" name="max" />
		</c:url>
		<li><a href="<c:out value="${ fibonacciRoute }" />"><c:out
					value="${ numberOfItems }" /></a></li>
	</ul>
</nav>

<ul id="fibonacci">
	<c:set var="n1" value="0" />
	<c:set var="n2" value="1" />
	<c:set var="currentNum" value="${n1 + n2 }" />
	<c:forEach begin="1" end="${ param.max }" var="i">
			<c:if test="${param.max > currentNum + n1 }">
			<c:set var="currentNum" value="${n1 + n2 }" />
			<li><c:out value="${ currentNum }" /></li>
			<c:set var="n1" value="${ n2  }" />
			<c:set var="n2" value="${ currentNum  }" />
		</c:if>

	</c:forEach>
</ul>

<c:import url="common/footer.jsp"></c:import>