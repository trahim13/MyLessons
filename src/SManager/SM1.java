package SManager;

public class SM1 {
    public static void main(String[] args) {
        System.setProperty("java.util.security", "src/SManager/MyApp.policy");
        System.setSecurityManager(new SecurityManager());
        System.out.println(System.getProperty("os.name"));
    }
}
