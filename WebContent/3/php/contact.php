<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "contacct";
// Create connection
$con=new mysqli($servername, $username, $password, $dbname);
if(! $con)
{
die('Connection Failed'.mysql_error());
}
session_start();
$name = mysqli_real_escape_string($con,$_POST['name']);
$emailid = mysqli_real_escape_string($con,$_POST['email']);
$message = mysqli_real_escape_string($con,$_POST['message']);
	
	$query="INSERT INTO contactsub(name,emailid,message) VALUES ('$name','$emailid','$message')";
           $data = mysqli_query($con,$query);
		   if($data)
			   {
				echo "YOUR REGISTRATION IS COMPLETED...";
						 header("location: ..\sj\Submitted.html");
				}
		   else
			   print "ERROR";

		   		// header("location: \index.html");
mysqli_close($con);
?>
