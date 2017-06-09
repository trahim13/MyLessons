package JNDI;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.Properties;

public class JNDI1 {
    public static void main(String[] args) throws NamingException {
        Properties prop = new Properties();
        prop.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.RefFSContextFactory");
        prop.put(Context.PROVIDER_URL, "file:///");

        Context context = new InitialContext(prop);


    }
}
