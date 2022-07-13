/**
 * -Xss128K
 */
public class JavaVMStackSOF {

    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        JavaVMStackSOF javaVMStackSOF = new JavaVMStackSOF();
        try {
            javaVMStackSOF.stackLeak();
        }catch (Throwable throwable){
            System.out.println("stack length is " + javaVMStackSOF.stackLength);
            throw throwable;
        }
    }

}
