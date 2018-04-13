    <?php
    $db = new SQLite3('dbs/users.sqlite');
    if(isset($_POST["login-submit"])){ // If button pressed, submit information
        $user = $_POST['username'];
        $pass = $_POST['password'];     
        $result = $db->query("select * from users where user = '$user' and password = '$pass'");// Queries database
        $row = $result->fetchArray(); // Fetch data from database

        if($row == false) {   // if nothing found, login fails
            echo 'Login failed';
        }else{ // bypassed login!
          
            $login = 'The flag is: flag_LmN6dlNZKq';

            echo "<p>Logged in </p>";
            echo "Hello, ", $user,"! ", $login;
            
        }
    }
    ?>
