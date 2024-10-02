public class Substring {
    public static void main(String[] args) {
        String text = "USA (United States of America)";
        System.out.println(text.substring( text.indexOf("United") + "United".length()));
    }
}
