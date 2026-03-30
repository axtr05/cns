import javax.crypto.*;
import java.util.*;

class AES {
    public static void main(String[] args) throws Exception {
        KeyGenerator kg = KeyGenerator.getInstance("AES");
        SecretKey key = kg.generateKey();

        Cipher c = Cipher.getInstance("AES");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String s = sc.nextLine();

        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] enc = c.doFinal(s.getBytes());
        System.out.println("Encrypted: " + new String(enc));

        c.init(Cipher.DECRYPT_MODE, key);
        String dec = new String(c.doFinal(enc));
        System.out.println("Decrypted: " + dec);
    }
}

/*
in : Enter text: Hello rijndael

out: Encrypted:  gÉ?L??'Dïx?Å#u?{
Decrypted: Hello rijndael
*/