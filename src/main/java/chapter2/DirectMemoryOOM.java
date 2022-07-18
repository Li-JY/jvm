package chapter2;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 *
 * 直接内存溢出
 * -XX:MaxDirectMemorySize=10M 指定最大大小
 */

public class DirectMemoryOOM {

    private static final int MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(MB);
        }
    }

}
