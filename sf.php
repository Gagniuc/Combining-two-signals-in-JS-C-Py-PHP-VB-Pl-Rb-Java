<?php

// Spectral forecast for signals in PHP
// Author: Dr. Paul A. Gagniuc
// Date:   01/02/2022

$tA = [];
$tB = [];

$d = 33;

$A ='10.3,23.4,44.8,63.2,44.1,35.1,46.5,62.6,50.4,28.9,24.7';
$B ='18.8,43.1,52.2,45.5,46.8,46.6,67.9,66.3,70.4,62,39.7';
$M ='';

$tA = explode(",", $A); 
$tB = explode(",", $B);

$maxA = Max($tA);
$maxB = Max($tB);
$max = Max($maxA, $maxB);

for($i=0; $i < count($tA); $i++) {
    $v = (($d/$maxA)*$tA[$i])+((($max-$d)/$maxB)*$tB[$i]);
    $M .= strval(round($v,2));
    if($i<count($tA)-1){$M .= ',';}
}

echo $M;

?>