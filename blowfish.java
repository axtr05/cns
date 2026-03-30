import javax.crypto.*;
import java.util.*;

class Blowfish {
    public static void main(String[] args) throws Exception {
        KeyGenerator kg = KeyGenerator.getInstance("Blowfish");
        SecretKey key = kg.generateKey();

        Cipher c = Cipher.getInstance("Blowfish");
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
in : Enter text: Hello Blowfish

out: Encrypted: ?y?í(?°±?
Decrypted: Hello Blowfish
*/