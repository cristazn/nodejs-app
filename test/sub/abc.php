<?php 
session_start();
	echo "Should not see this line!";
	print_r($_SESSION);

?>
