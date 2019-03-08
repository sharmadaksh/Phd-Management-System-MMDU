<%-- 
    Document   : AdminHome
    Created on : Mar 2, 2018, 10:53:49 AM
    Author     : HP PAVILION
--%>



<style>
body {
  
    font-family: "Lato", sans-serif;
    transition: background-color .5s;
    
}

p {
    background-color: cadetblue;
    width: 1400px;
    border: 2px none;
    padding: 5px;
    margin: 5px;
    border-radius: 20px;
}


.sidenav {
    height: 100%;
    width: 0;
    position: fixed;
    z-index: 1;
    top: 0;
    left: 0;
    background-color: #111;
    overflow-x: hidden;
    transition: 0.5s;
    padding-top: 60px;
}

.sidenav a {
    padding: 8px 8px 8px 32px;
    text-decoration: none;
    font-size: 14px;
    color: #818181;
    display: block;
    transition: 0.3s;
}

.sidenav a:hover {
    color: #f1f1f1;
}

.sidenav .closebtn {
    position: absolute;
    top: 0;
    right: 25px;
    font-size: 36px;
    margin-left: 50px;
}

#main {
    transition: margin-left .5s;
    padding: 14px;
}

@media screen and (max-height: 450px) {
  .sidenav {padding-top: 12px;}
  .sidenav a {font-size: 12px;}
}

.dropbtn {
    background-color: #4CAF50;
    color: white;
    padding: 16px;
    font-size: 16px;
    border: none;
    cursor: pointer;
}

.dropbtn:hover, .dropbtn:focus {
    background-color: #3e8e41;
}

#myInput {
    border-box: box-sizing;
    background-image: url('searchicon.png');
    background-position: 14px 12px;
    background-repeat: no-repeat;
    font-size: 16px;
    padding: 14px 20px 12px 45px;
    border: none;
    border-bottom: 1px solid #ddd;
}

#myInput:focus {outline: 3px solid #ddd;}

.dropdown {
    position: relative;
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f6f6f6;
    min-width: 230px;
    overflow: auto;
    border: 1px solid #ddd;
    z-index: 1;
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}

.dropdown a:hover {background-color: #ddd}

.show {display:block;}
</style>

<div id="mySidenav" class="sidenav">
    <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a><br><br>
    <a href="WelcomeAdmin.jsp">Home</a><br>
    <a href="addlogindetails.jsp">Login Creation</a><br>
    <a href="addphdstep.jsp">Phd Step Addition</a><br>
  <a href="addstream.jsp">Stream Creation</a><br>
  <a href="addstudent.jsp">Student Creation</a><br>
  <a href="viewlogindetails.do">View Login Details</a><br>
  <a href="viewstreamdetails.do">View Stream Details</a><br>
  <a href="viewphdsteps.do">View Ph.D Steps</a><br>
  <a href="http://localhost:8888/Final Phd Management System/">Logout</a><br>
</div>

<div id="main">
    <img src="../Images/logo.png" style="width: 300px; height:100px; margin-left: 2px"><br>
    <hr width="100%" color="grey" size="2">
    <center><img src="../Images/logo-big.png" width="150" height="50"></center>
    
  <span style="font-size:22px;cursor:pointer;color: black" onclick="openNav()">&#9776; Administrator Dashboard</span>
</div>
   
   
<script>
function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
    document.getElementById("main").style.marginLeft = "250px";
    document.body.style.backgroundColor = "rgba(0,0,0,0.4)";
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
    document.getElementById("main").style.marginLeft= "0";
    document.body.style.backgroundColor = "white";
}
</script>
     
