// Spectral forecast for signals in Javascript
// Author: Dr. Paul A. Gagniuc
// Date:   01/02/2022

function sf(A, B, d){

    var tA = [];
    var tB = [];
    var M ='';

    var tA = A.split(',');
    var tB = B.split(',');

    var maxA = Math.max.apply(null, tA);
    var maxB = Math.max.apply(null, tB);
    var max = Math.max(maxA, maxB);

    for(var i=0; i<tA.length; i++) {
        var v = ((d/maxA)*tA[i])+(((max-d)/maxB)*tB[i]);
        M += v.toFixed(2);
        if(i<tA.length-1){M += ','}
    }

    return M;
}
