<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>

<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600&display=swap" rel="stylesheet">

<style>
*{
    margin:0;
    padding:0;
    box-sizing:border-box;
}

body{
    font-family: 'Poppins', sans-serif;
    background: linear-gradient(135deg, #4e73df, #1cc88a);
    min-height:100vh;
    display:flex;
    flex-direction:column;
}

/* HEADER */
header{
    background:#222;
    color:white;
    padding:15px;
    text-align:center;
}

/* MAIN */
main{
    flex:1;
    display:flex;
    justify-content:center;
    align-items:center;
}

/* FOOTER */
footer{
    background:#222;
    color:white;
    text-align:center;
    padding:10px;
}

/* LOGIN CONTAINER */
.container{
    width:370px;
    padding:35px;
    background: white;
    border-radius:15px;
    box-shadow:0px 15px 35px rgba(0,0,0,0.2);
    animation: fadeIn 0.7s ease-in-out;
}

@keyframes fadeIn{
    from{opacity:0; transform:translateY(20px);}
    to{opacity:1; transform:translateY(0);}
}

h2{
    text-align:center;
    margin-bottom:25px;
    color:#333;
}

label{
    font-size:14px;
    font-weight:500;
}

input{
    width:100%;
    padding:10px;
    margin:8px 0 18px;
    border-radius:8px;
    border:1px solid #ddd;
    transition:0.3s;
}

input:focus{
    border-color:#4e73df;
    outline:none;
    box-shadow:0 0 5px rgba(78,115,223,0.4);
}

button{
    width:100%;
    padding:10px;
    background: linear-gradient(90deg, #4e73df, #224abe);
    color:white;
    border:none;
    border-radius:8px;
    cursor:pointer;
    font-weight:600;
    transition:0.3s;
}

button:hover{
    transform:scale(1.03);
    background: linear-gradient(90deg, #224abe, #4e73df);
}

.register{
    text-align:center;
    margin-top:15px;
    font-size:14px;
}

.register a{
    color:#4e73df;
    font-weight:600;
    text-decoration:none;
}

.register a:hover{
    text-decoration:underline;
}
</style>
</head>

<body>



<main>
    <div class="container">
        <h2>Welcome Back 👋</h2>

        <form action="LoginController" method="post">
            <label>UserName</label>
            <input type="text" name="UserName" required>

            <label>Password</label>
            <input type="password" name="pass" required>

            <button type="submit">Login</button>
        </form>

        <div class="register">
            <p>Don't have an account?</p>
            <a href="Registration.jsp">Register Here</a>
        </div>
    </div>
</main>



</body>
</html>