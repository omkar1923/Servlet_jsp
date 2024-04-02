<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up Form</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f2f2f2;
        margin: 0;
        padding: 0;
    }
    
    .container {
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        width: 100%; /* Adjust the width as needed */
    }
    
    form {
        width: 300px;
        background-color: #fff;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
    }
    
    input[type="number"], input[type="text"], input[type="password"] {
        width: calc(100% - 22px); /* Adjusted for padding and border */
        padding: 10px;
        margin-bottom: 10px;
        border: 1px solid #ccc;
        border-radius: 3px;
        box-sizing: border-box;
    }
    
    button {
        width: calc(100% - 22px); /* Adjusted for padding and border */
        padding: 10px;
        background-color: #007bff;
        color: #fff;
        border: none;
        border-radius: 3px;
        cursor: pointer;
    }
    
    button:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
    <div class="container">
        <form action="details">
            ID:<br>
            <input type="number" name="id"><br><br>
            Name:<br>
            <input type="text" name="name"><br><br>
            Phone:<br>
            <input type="number" name="phone"><br><br>
            Address:<br>
            <input type="text" name="address"><br><br>
            Email:<br>
            <input type="text" name="email"><br><br>
            Password:<br>
            <input type="password" name="password"><br><br>
            <button onclick="openLogin()">Sign Up</button>
        </form>
    </div>
    <script type="text/javascript">
    function openLogin() {
    	open("login.jsp");
		
	}</script>
</body>
</html>
