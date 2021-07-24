package ru.netology;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Igor Khristiuk
 */
public class Logger {
    protected int num = 1;
    private static Logger logger = null;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }

    public void log(String msg) {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        System.out.println("[" + dateFormat.format(new Date()) + " " + num + "] " + msg);
        num++;
    }
}
