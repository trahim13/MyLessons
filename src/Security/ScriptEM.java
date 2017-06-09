package Security;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptEM {
    public static void main(String[] args) throws ScriptException, NoSuchMethodException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        engine.put("z", 10);

        String code = "print('Hello from \"JavaScript\".');" +
                "var n = 1+2;" +
                "n+4+z;" +
                "function f(){print ('this from function F.');return 8; };" +
                "function f2(arg){print('this from function F2');return arg+7;};";

          Object o = engine.eval(code);
        System.out.println(o);

        Object o2 = ((Invocable) engine).invokeFunction("f");
        System.out.println(o2);

        Object o3 = ((Invocable) engine).invokeFunction("f2", 5);
        System.out.println(o3);

        System.out.println(engine.get("n"));

        System.out.println(engine.get("z"));

    }
}
