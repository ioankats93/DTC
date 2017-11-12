<?php
  define('HOST' ,'mysql.hostinger.gr');
  define('USER','u652943771_user');
  define('PASS','evatest1');
  define('DB' , 'u652943771_db');

  $con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to connect');	