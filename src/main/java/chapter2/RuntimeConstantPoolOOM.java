package chapter2;

public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);// true
        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);// false java字符串虚拟机加载已经出现，intern是首次遇见原则，因此不是同一对象
    }
}
