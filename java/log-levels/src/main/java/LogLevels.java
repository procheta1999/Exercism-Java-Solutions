public class LogLevels {

    public static String message(String logLine) {
        try
        {
//            logLine.trim();
            if(logLine.charAt(1)=='E')
            {
                return logLine.substring(9).trim();
            }
            else if(logLine.charAt(1)=='W')
            {
                return logLine.substring(11).trim();
            }
            else
            {
                return logLine.substring(8).trim();
            }
        }
        catch(UnsupportedOperationException e) {

            throw new UnsupportedOperationException("Please implement the (static) LogLine.message() method");
        }
    }

    public static String logLevel(String logLine) {
        try
        {
//            logLine.trim();
            if(logLine.charAt(1)=='E')
            {
                return "error";
            }
            else if(logLine.charAt(1)=='W')
            {
                return "warning";
            }
            else
            {
                return "info";
            }
        }
        catch(UnsupportedOperationException e) {

            throw new UnsupportedOperationException("Please implement the (static) LogLine.logLevel() method");

        }
    }

    public static String reformat(String logLine) {
        try
        {
            String s;
//            logLine.trim();
            if(logLine.charAt(1)=='E')
            {
                s=logLine.substring(9).trim()+" (error)";
            }
            else if(logLine.charAt(1)=='W')
            {
                s=logLine.substring(11).trim()+" (warning)";
            }
            else
            {
                s=logLine.substring(8).trim()+" (info)";
            }
            return s.trim();
        }
        catch(UnsupportedOperationException e) {

            throw new UnsupportedOperationException("Please implement the (static) LogLine.reformat() method");
        }
    }
}
