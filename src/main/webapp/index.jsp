<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>

    <title>Flightbookingsystem v1.0</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

</head>
<body>

<div class="container">
    <h1>Select your flight</h1>
</div>

<div class="container">
    <form name="loginForm" method="post" action="SearchAll.jsp" class="form-inline">
        <h4>From</h4>
        <select name="From" class="btn btn-default dropdown-toggle">
            <option value="From">Select Airport</option>
            <script>
                var myArray = new Array("1", "2", "3", "4", "5");
                for(i=0; i<myArray.length; i++) {
                    document.write('<option value="' + myArray[i] +'">' + myArray[i] + '</option>');
                }
            </script>
        </select>
        <h4>To</h4>
        <select name="To" class="btn btn-default dropdown-toggle">
            <option value="To">Select Airport</option>
            <script>
                var myArray = new ArrayList("1", "2", "3", "4", "5");
                for(i=0; i<myArray.length; i++) {
                    document.write('<option value="' + myArray[i] +'">' + myArray[i] + '</option>');
                }
            </script>
        </select>
        <input type="submit" name = "action" value="Search" class="btn btn-default">
    </form>
</div>


</body>
</html>


