
<html>
<body>



<form action="bookInsert" method="POST">


	<% if(request.getAttribute("insertRes")!=null && ((String)request.getAttribute("insertRes")).equals("success")){ %>
	<span style="color: green;font-size: 20px"> <%=request.getAttribute("insertRes") %> </span>
	<% }else if(request.getAttribute("insertRes")!=null){ %>
	<span style="color: red;font-size: 20px"> <%=request.getAttribute("insertRes") %> </span>
	<%} %>
<br><br>
<br><br>
  <label for="BookName">Book Name:</label>
  
  <input type="text" id="bName" name="bName"><br><br>
  
 
  <label for="BookDescription">Book Description:</label>
  
  <input type="text" id="bDescription" name="bDescription"><br><br>
  
  <label for="BookPrice">Price:</label>
  
  <input type="text" id="price" name="price"><br><br>
  
  
  <label for="OrderDate">Order Date:</label>
  
  <input type="text" id="date" name="date"><br><br>
  
   
   <label for="BookAvailability">Book Availability:</label>
  
  <input type="text" id="availability" name="availability"><br><br>
  
  
  
  
  
  <input type="submit" value="Submit">
</form>

</body>
</html>