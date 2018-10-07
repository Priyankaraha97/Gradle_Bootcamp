import org.apache.commons.lang3.StringUtils;

public class StringUtilsExample {
    public StringUtilsExample() {
    }

    public static void main(String[] args) {
        System.out.println("7)" + StringUtils.join(new String[]{"AB", "CD", "EF"}));
    }
}