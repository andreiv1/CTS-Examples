package ASingleton.SimpleSingleton.Logger;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Logger implements ILogger {
    //Singleton with Eager Loading
    private static Logger instance = new Logger();

    private Logger(){
    }

    public static Logger getInstance() {
        return instance;
    }

    @Override
    public void log(String message) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("[" + DateTimeFormatter.ISO_DATE_TIME.format(now) + "] " + message);
    }
}

