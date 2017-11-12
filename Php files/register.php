<?php

                $name = $_GET['name'];
                $surname = $_GET['surname'];
                $username = $_GET['username'];
                $password = $_GET['password'];
                $email = $_GET['email'];
                $ami = $_GET['ami'];
                $amth = $_GET['amth'];
                $telephone = $_GET['telephone'];
                $house = $_GET['house'];

                $sex = $_GET['sex'];
                $birth = $_GET['birth'];
                $diagnosis = $_GET['diagnosis'];
                $surgery = $_GET['surgery'];

                $surgeon = $_GET['surgeon'];
                $histological = $_GET['histological'];
                $diameter = $_GET['diameter'];

                $estiwn = $_GET['estiwn'];
                $lovoi = $_GET['lovoi'];
                $diithisi = $_GET['diithisi'];
                $ekserethentwnlns = $_GET['ekserethentwnlns'];
                $diithimenwnlns = $_GET['diithimenwnlns'];

                $stage = $_GET['stage'];
                $hmerametenxeirisis = $_GET['hmerametenxeirisis'];
                $proetoimasia = $_GET['proetoimasia'];
                $scan = $_GET['scan'];

                $uptake = $_GET['uptake'];
                $tsh = $_GET['tsh'];
                $htg = $_GET['htg'];
                $tg = $_GET['tg'];

                $tm = $_GET['tm'];
                $us = $_GET['us'];
                $ablation = $_GET['ablation'];

                ///Sunthikes elenxou  kenwn
                
                if($name == '' || $username == '' || $password == '' || $email == ''
                        ){
                        echo 'please fill all values';
                }else{
                        require_once('dbConnect.php');
                        $sql = "SELECT * FROM users WHERE username='$username' OR email='$email'";
                        
                        $check = mysqli_fetch_array(mysqli_query($con,$sql));
                        
                        if(isset($check)){
                                echo 'username or email already exist';
                        }else{                          
                                $sql = "INSERT INTO users (name,surname,username,password,email,ami,amth,telephone,house,sex,birth,diagnosis,surgery,surgeon,histological,diameter,estiwn,lovoi,diithisi,ekserethentwnlns,diithimenwnlns,stage,hmerametenxeirisis,proetoimasia,scan,uptake,tsh,htg,tg,tm,us,ablation)
                                 VALUES('$name','$surname','$username','$password','$email','$ami','$amth','$telephone','$house','$sex','$birth','$diagnosis','$surgery','$surgeon','$histological','$diameter','$estiwn','$lovoi','$diithisi','$ekserethentwnlns','$diithimenwnlns','$stage','$hmerametenxeirisis','$proetoimasia','$scan','$uptake','$tsh','$htg','$tg','$tm','$us','$ablation')";
                                if(mysqli_query($con,$sql)){
                                        echo 'successfully registered';
                                }else{
                                        echo 'oops! Please try again!';
                                }
                        }
                        mysqli_close($con);
                }