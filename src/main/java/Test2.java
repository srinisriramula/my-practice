public class Test2 {
    public static void main(String[] args) {
        String testStr = "\u0000D";
        testStr = testStr.replaceAll("\u0000D", "D");
        System.out.println("testStr :: "+testStr);
    }
}