import java.security.*;
import java.util.*;

class md5{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = sc.nextLine();

        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] b = md.digest(s.getBytes());

        String res = "";
        for(byte x : b)
        res += String.format("%02X", x);

        System.out.println("Hash: " + res);
    }
}

/*
Enter text: hello world
Hash: 2AAE6C35C94FCFB415DBE95F408B9CE91EE846ED
*/