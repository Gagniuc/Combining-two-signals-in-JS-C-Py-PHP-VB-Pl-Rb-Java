// Spectral forecast for signals in Java
// Author: Dr. Paul A. Gagniuc
// Date:   01/02/2022

public class Main
{
	public static void main(String[] args) {
        
        String A = "10.3,23.4,44.8,63.2,44.1,35.1,46.5,62.6,50.4,28.9,24.7";
        String B = "18.8,43.1,52.2,45.5,46.8,46.6,67.9,66.3,70.4,62,39.7";
        String M = "";
        
        String[] tA = A.split(",");
        String[] tB = B.split(",");
        
        float v = 0;
        float d = 33;
        float maxA = 0;
        float maxB = 0;
        float maxAB = 0;
        
        for (int i = 0; i < tA.length; i++) 
        {
            if (Float.parseFloat(tA[i]) > maxA){maxA = Float.parseFloat(tA[i]);}
            if (Float.parseFloat(tB[i]) > maxB){maxB = Float.parseFloat(tB[i]);}
            if (maxA > maxAB){maxAB = maxA;}
            if (maxB > maxAB){maxAB = maxB;}
        }
        
        for (int i=0; i<tA.length; i++) {
            v = ((d/maxA)*Float.parseFloat(tA[i]))+(((maxAB-d)/maxB)*Float.parseFloat(tB[i]));
            M += Math.round(v*100)/100.0;
            if(i<tA.length-1){M += ",";}
        }
        
        System.out.println(M);
	}
}