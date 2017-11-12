<?php

	define('HOST' ,'mysql.hostinger.gr');
	define('USER','u652943771_user');
	define('PASS','evatest1');
	define('DB' , 'u652943771_db');

	$con = mysqli_connect(HOST,USER,PASS,DB) or die ('Unable to connect');

	
    $username = $_POST['username'];
    $password = $_POST['password'];

    $statement = mysql_prepare($con, "SELECT * FROM User WHERE username = ? and password = ?");
    mysqli_stmt_bind_param($statement,"ss", $username, $password);
    mysqli_stmt_execute($statement);

    mysqli_stmt_store_result($statement);
    mysqli_Stmt_Bind_result($statement,$name,$surname,$username,$password,$email,$ami,$amth,$telephone,$house,$sex,$birth,
    	$diagnosis,$surgery,$surgeon,$histological,$diameter,$estiwn,$lovoi,$diithisi,$ekserethentwnlns,$diithimenwnlns,
    	$stage,$hmerametenxeirisis,$proetoimasia,$scan,$uptake,$tsh,$htg,$tg,$tm,$us,$ablation);

    	$user = array();

    	while(mysqli_stmt_fetch($statement)){
    		$user [name] = $name;
    		$user [surname] = $surname;
    		$user [username] = $username;
    		$user [password] = $password;
    		$user [email] = $email;
    		$user [ami] = $ami;
    		$user [amth] = $amth;
    		$user [telephone] = $telephone;
    		$user [house] = $house;
    		$user [sex] = $sex;
    		$user [birth] = $birth;
    		$user [diagnosis] = $diagnosis;
    		$user [surgery] = $surgery;
    		$user [surgeon] = $surgeon;
   		 $user [histological] = $histological;
    		$user [diameter] = $diameter;
    		$user [estiwn] = $estiwn;
    		$user [lovoi] = $lovoi;
    		$user [diithisi] = $diithisi;
    		$user [ekserethentwnlns] = $ekserethentwnlns;
    		$user [diithimenwnlns] = $diithimenwnlns;
    		$user [stage] = $stage;
    		$user [hmerametenxeirisis] = $hmerametenxeirisis;
    		$user [proetoimasia] = $proetoimasia;
    		$user [scan] = $scan;
    		$user [uptake] = $uptake;
    		$user [tsh] = $tsh;
    		$user [htg] = $htg;
    		$user [tg] = $tg;
    		$user [tm] = $tm;
    		$user [us] = $us;
    		$user [ablation] = $ablation;
    	}

    	echo json_encode($user);

    	mysqli_stmt_close($statement);


    	mysqli_close($con);
    ?>