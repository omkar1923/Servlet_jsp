<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
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
    }
    
    form {
        width: 300px;
        background-color: #fff;
        padding: 20px;
        border-radius: 5px;
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
    }
    
    input[type="text"], input[type="password"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 10px;
        border: 1px solid #ccc;
        border-radius: 3px;
        box-sizing: border-box;
    }
    
    button {
        width: 100%;
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
        <form action="login">
            <label for="email">Email:</label><br>
            <input type="text" id="email" name="email"><br><br>
            <label for="password">Password:</label><br>
            <input type="password" id="password" name="password"><br><br>
            <button>Login</button>
        </form>
    </div>
</body>
</html>
