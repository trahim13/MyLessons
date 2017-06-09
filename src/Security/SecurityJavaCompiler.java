package Security;


import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class SecurityJavaCompiler {
    public static void main(String[] args) {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        int a = compiler.run(null, null, null, "C:\\Users\\petrovski\\IdeaProjects\\JavaLessons\\src\\TestForSecurityJavaCompiler.java");
        System.out.println(a);
    }
}
