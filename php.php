$datetime1 = new DateTime('2016-10-30 03:55:06');//start time
$datetime2 = new DateTime('2016-11-30 11:55:06');//end time
$interval = $datetime1->diff($datetime2);
echo $interval->format('%Y years %m months %d days %H hours %i minutes %s seconds');
echo('<br>');
$sd='2016/10/30 03:55:06';
$ed='2016-11-30 11:55:06';
$diff = strtotime($ed) - strtotime($sd);
echo($diff);
echo('<br>');
echo('<br>');
echo('<br>');
$now_time=date("Y-m-d H:i:s", time()); 
//echo $now_time."<br>"; 
$today_date=strtotime($now_time); 
$d1_register=strtotime("2017-11-01 18:46:38"); 
$mint=round(abs($today_date - $d1_register) / 60,2)." minute"; 
$day=round(($mint/60)/24,2); 

if ($day>=30) { 
echo "Account Expired"; 
} else { 
echo "Welcome Back!"; 
} 