package chapter3;


/**
 *
 * -XX:+PrintGC -XX:+PrintHeapAtGC
 */


public class ReferenceCountGC {

    public Object instance;

    private static final int MB = 1024 * 1024;

    private byte[] size = new byte[2 * MB];

    public static void main(String[] args) {
        ReferenceCountGC referenceCountGCA = new ReferenceCountGC();
        ReferenceCountGC referenceCountGCB = new ReferenceCountGC();
        referenceCountGCA.instance = referenceCountGCB;
        referenceCountGCB.instance = referenceCountGCA;
        referenceCountGCA = null;
        referenceCountGCB = null;
        System.gc();
    }
}
