package joshwa;


class Test {
    void cleanup() {
        System.out.println("Memory re-handled");
    }
}

public class grbg{
    public static void main(String[] args) {
        Test T = new Test();
        T.cleanup();
        T = null;

        System.gc();
    }
}
