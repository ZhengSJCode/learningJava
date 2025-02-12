public class Main {
    static {
        System.out.println("static block");
        System.loadLibrary("Main");
    }
    
    private native void sayHello();

    public static void main(String[] args) {
        System.out.println("main method");
        new Main().sayHello();
    }
}

