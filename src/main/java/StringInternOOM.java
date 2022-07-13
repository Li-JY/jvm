import java.util.HashSet;
import java.util.Set;

/**
 * -Xms6M -Xmx6M修改堆大小
 * jdk8字符串常量池移至堆
 */
public class StringInternOOM {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        int i = 0;
        while (true) {
            set.add(String.valueOf(i++).intern());
        }
    }

}
