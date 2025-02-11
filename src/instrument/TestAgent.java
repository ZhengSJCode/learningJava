package instrument;

import vss.Util;

import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;
import java.util.ArrayList;

import static vss.Util.putAll;

public class TestAgent {
    public static void agentMain(String[] args, Instrumentation inst) {
        inst.addTransformer(new TestTransformer(), true);

        try {
            inst.retransformClasses(Base.class);
            System.out.println("Agent Loaded Done.");
        } catch (UnmodifiableClassException e) {
            System.out.println("Agent Loaded Failed.");
            throw new RuntimeException(e);
        }
    }


}
