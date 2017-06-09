package Security;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class AES {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        String str = "Same message fore security";

        Cipher cipher = Cipher.getInstance("AES");

//        KeyGenerator kgen = KeyGenerator.getInstance("AES");
//        kgen.init(128);
//        SecretKey key = kgen.generateKey();

        SecretKeySpec key = new SecretKeySpec("qwe12345rtr12345".getBytes(), "AES");

        cipher.init(Cipher.ENCRYPT_MODE, key);

        byte[] bytes = cipher.doFinal(str.getBytes());
        for (byte b :
                bytes) {
            System.out.print(b);
        }

        System.out.println("\n");

        Cipher dCipher = Cipher.getInstance("AES");
        dCipher.init(Cipher.DECRYPT_MODE, key);
        byte[] dBytes = dCipher.doFinal(bytes);
        for (byte d :
                dBytes) {
            System.out.print((char) d);
        }
    }
}
