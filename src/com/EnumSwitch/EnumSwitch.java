// #69 Enum if and Switch in Java
public class EnumSwitch {
    public static void main(String[] args) {
        HttpStatus Stats = HttpStatus.NON_AUTHORATIVE_INFORMATION;
        
        String s = PrintHttpStatus(Stats);

        System.out.println(s);

        System.out.println(s.getClass().getSuperclass());

    }

    static String PrintHttpStatus(HttpStatus Stats) {
        switch (Stats) {
            case ACCEPTED:
                return "200";
            case CREATED:
                return "201";
            case NON_AUTHORATIVE_INFORMATION:
                return "203";
            case NO_CONTENT:
                return "204";
            default:
                return "";
        }
    }

}

enum HttpStatus {
    OK, CREATED, ACCEPTED, NON_AUTHORATIVE_INFORMATION, NO_CONTENT, RESET_CONTENT
}
