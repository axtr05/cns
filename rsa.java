import java.math.BigInteger;
import java.util.*;

class RSA {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter p: ");
        BigInteger p = sc.nextBigInteger();

        System.out.print("Enter q: ");
        BigInteger q = sc.nextBigInteger();

        BigInteger n = p.multiply(q);
        BigInteger phi = p.subtract(BigInteger.ONE)
                            .multiply(q.subtract(BigInteger.ONE));

        BigInteger e = new BigInteger("3");
        while (!phi.gcd(e).equals(BigInteger.ONE)) 
        e = e.add(BigInteger.TWO);

        BigInteger d = e.modInverse(phi);

        System.out.println("Public Key: ("+e+","+n+")");
        System.out.println("Private Key: ("+d+","+n+")");
    }
}

/*
Enter p: 61
Enter q: 53
Public Key: (7,3233)
Private Key: (1783,3233)
*/