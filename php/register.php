<?php
$con = new SQLite3("../dbs/users.sqlite");

$username = $_POST["username"];
$query="select * from users where username = '$username'";
$result = $con->query($query);
$row = $result->fetchArray();

if($row == false){
    echo "Registration has been disabled";
}else{
    echo "Someone already has registered <em>", $username,"</em>." ;
}
?>
