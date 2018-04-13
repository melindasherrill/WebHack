<?php
    $db = new SQLite3('../dbs/users.sqlite'); //connect to db

    if(isset($_POST["login-submit"])){ //When login button is pressed, run this code
        $user = $_POST['username']; //record user from form
        $pass = $_POST['password'];  // record pass from form   
        $result = $db->query("select * from users where user = '$user' and password = '$pass'");//connect to query
        $row = $result->fetchArray(); // fetch query

        if($row == false){ // if nothing returned, login fails      
            echo 'Login failed';
        }else{
          
            $login = 'The flag is: flag_LmN6dlNZKq';

            echo "<p>Logged in </p>";
            echo "Hello, ", $user,"! ", $login;

        }
    }
    ?>
