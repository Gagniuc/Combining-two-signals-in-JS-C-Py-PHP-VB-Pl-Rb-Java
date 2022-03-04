# Spectral forecast for signals in Perl
# Author: Dr. Paul A. Gagniuc
# Date:   01/02/2022

my $A = '10.3,23.4,44.8,63.2,44.1,35.1,46.5,62.6,50.4,28.9,24.7';
my $B = '18.8,43.1,52.2,45.5,46.8,46.6,67.9,66.3,70.4,62,39.7';
my $M = "";

my $v = 0;
my $d = 33;
my $maxA = 0;
my $maxB = 0;
my $maxAB = 0;

my @tA = split(',', $A);
my @tB = split(',', $B);

for(my $i = 0; $i <= $#tA; $i++){
    if($tA[$i] > $maxA){$maxA = $tA[$i]};
    if($tB[$i] > $maxB){$maxB = $tB[$i]};
    if($maxA > $maxAB){$maxAB = $maxA};
    if($maxB > $maxAB){$maxAB = $maxB};
}

for(my $i = 0; $i <= $#tA; $i++){
    $v = (($d/$maxA)*$tA[$i])+((($maxAB-$d)/$maxB)*$tB[$i]);
    $M .= sprintf("%.2f", $v);
    if($i<$#tA){$M .= ',';}
}

print($M);