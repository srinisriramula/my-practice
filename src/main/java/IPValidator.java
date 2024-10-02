import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPValidator {

    private List<Pattern> ipBlockList;

    public IPValidator(List<String> ipBlockList) {
        this.ipBlockList = compilePatterns(ipBlockList);
    }

    // Compile each IP block pattern into a regular expression Pattern
    private List<Pattern> compilePatterns(List<String> ipBlockList) {
        List<Pattern> patterns = new ArrayList<>();
        for (String ipBlock : ipBlockList) {
            String regex = ipBlockToRegex(ipBlock);
            patterns.add(Pattern.compile(regex));
        }
        return patterns;
    }

    // Convert an IP block to a regular expression
    private String ipBlockToRegex(String ipBlock) {
        String[] parts = ipBlock.split("\\.");
        StringBuilder regexBuilder = new StringBuilder();

        for (String part : parts) {
            if (part.equals("*")) {
                regexBuilder.append("\\d{1,3}");
            } else {
                regexBuilder.append(part);
            }
            regexBuilder.append("\\.");
        }
        // Remove the trailing dot and add anchors to ensure exact matching
        return "^" + regexBuilder.substring(0, regexBuilder.length() - 1) + "$";
    }


    // Validate an IP address against the IP block list
    public boolean validateIP(String ipAddress) {
        System.out.println(ipBlockList);

        for (Pattern pattern : ipBlockList) {
            Matcher matcher = pattern.matcher(ipAddress);
            if (matcher.matches()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<String> ipBlockList = new ArrayList<>();
        ipBlockList.add("192.168.*.*");
        ipBlockList.add("10.0.*.*");
        ipBlockList.add("172.16.*.*");

        IPValidator ipValidator = new IPValidator(ipBlockList);

        String ipAddress1 = "192.168.1.10";
        String ipAddress2 = "10.0.5.25";
        String ipAddress3 = "172.16.0.1";
        String ipAddress4 = "192.168.2.15";

        System.out.println(ipValidator.validateIP(ipAddress1)); // true
//        System.out.println(ipValidator.validateIP(ipAddress2)); // true
//        System.out.println(ipValidator.validateIP(ipAddress3)); // true
 //       System.out.println(ipValidator.validateIP(ipAddress4)); // false
    }
}
