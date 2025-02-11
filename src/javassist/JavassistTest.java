package javassist;

//import com.meituan.mtrace.agent.javassist.*;


import vss.Util;

import java.io.IOException;
import java.util.HashMap;

public class JavassistTest {
    public static void main(String[] args) throws NotFoundException, CannotCompileException, IllegalAccessException, InstantiationException, IOException {
        ClassPool cp = ClassPool.getDefault();
        CtClass cc = cp.get("javassist.Base");
        CtMethod m = cc.getDeclaredMethod("process");
        m.insertBefore("{ System.out.println(\"start\"); }");
        m.insertAfter("{ System.out.println(\"end\"); }");
//        m.insertAfter("{         ArrayList<String> strings = putAll();\n" +
//                "        System.out.println(strings);}");


        Class c = cc.toClass();
        cc.writeFile(".javassist");
        Base h = (Base)c.newInstance();
        h.process();
    }
}