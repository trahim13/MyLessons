package Security;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.*;

public class RSA {
    public static void main(String[] args) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {

        String str = "Message \"hellow word\".";
        Cipher ciper = Cipher.getInstance("RSA");

        KeyPairGenerator keypairgen = KeyPairGenerator.getInstance("RSA");
//        SecureRandom random = new SecureRandom();
//        keypairgen.initialize(512, random);
        KeyPair keyPair = keypairgen.generateKeyPair();
        Key publickey = keyPair.getPublic();
        Key privatekey = keyPair.getPrivate();


        ciper.init(Cipher.ENCRYPT_MODE, publickey);

        byte bytes[] = ciper.doFinal(str.getBytes());
        for (byte  a   :
                bytes) {
            System.out.print(a);

        }
        System.out.println();
        Cipher cipherDe = Cipher.getInstance("RSA");
        cipherDe.init(Cipher.DECRYPT_MODE, privatekey);
        byte[] deByte = cipherDe.doFinal(bytes);
        for (byte a :
                deByte) {
            System.out.print((char) a);
        }

    }
}
