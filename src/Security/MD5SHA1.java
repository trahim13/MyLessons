package Security;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5SHA1 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String str = " Hello word.";
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");

        byte[] bytes = md5.digest(str.getBytes());
        StringBuilder builder = new StringBuilder();
        for (byte b :
                bytes) {
            builder.append(String.format("%02X ", b));

        }

        System.out.println(builder);

    }
}
