<?php
    $db = new SQLite3('dbs/users.sqlite');

    if(isset($_POST["login-submit"])){
        $user = $_POST['user'];
        $pass = $_POST['password'];     
        $result = $db->query("select * from credentials where user = '$user' and password = '$pass'");//select username
        $row = $result->fetchArray();

        if($row == false){       
            echo 'Login failed';
        }else{
          
            $login = 'The flag is: flag_LmN6dlNZKq';

            echo "<p>Logged in </p>";
            echo "Hello, ", $user,"! ", $login;

        }
    }
    ?>
