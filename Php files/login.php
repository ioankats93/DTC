<?php
$username = $_GET['username'];
$password = $_GET['password'];

if($username == "" || $password == ""){
        echo 'please fill all vssalues';
}else{
        require_once('UserRegistration/dbConnect.php');
        $sql = "SELECT * FROM users WHERE username='$username' AND password='$password' limit 1";

        $result = mysqli_query($con,$sql);
        $row = $result->fetch_assoc();
        echo json_encode($row);
        

        // if(isset($check)){
        //         echo 'username or email already exist';
        //         echo $check;
        // }else{
        //         // $sql = "INSERT INTO users (name,surname,username,password,email,ami,amth,telephone,house,sex,birth,diagnosis,surgery,surgeon,histological,diameter,estiwn,lovoi,diithisi,ekserethentwnlns,diithimenwnlns,stage,hmerametenxeirisis,proetoimasia,scan,uptake,tsh,htg,tg,tm,us,ablation)
        //         //  VALUES('$name','$surname','$username','$password','$email','$ami','$amth','$telephone','$house','$sex','$birth','$diagnosis','$surgery','$surgeon','$histological','$diameter','$estiwn','$lovoi','$diithisi','$ekserethentwnlns','$diithimenwnlns','$stage','$hmerametenxeirisis','$proetoimasia','$scan','$uptake','$tsh','$htg','$tg','$tm','$us','$ablation')";
        //         // if(mysqli_query($con,$sql)){
        //         //         echo 'successfully registered';
        //         // }else{
        //         //         echo 'oops! Please try again!';
        //         // }
        // }
        mysqli_close($con);
}

?>
