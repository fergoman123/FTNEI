package io.github.fergoman123.ftnei.helper;

import io.github.fergoman123.fergoutil.logging.ILogLevel;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by Fergoman123.
 */
public class LogHelper implements ILogLevel
{
    public static final Logger logger = LogManager.getLogger("FTNEI");

    public static void log(Level level, Object object)
    {
        logger.log(level, String.valueOf(object));
    }

    public static void all(Object o)
    {
        log(all, o);
    }

    public static void debug(Object o)
    {
        log(debug, o);
    }

    public static void error(Object o)
    {
        log(error, o);
    }

    public static void fatal(Object o)
    {
        log(fatal, o);
    }

    public static void info(Object o)
    {
        log(info, o);
    }

    public static void off(Object o)
    {
        log(off, o);
    }

    public static void trace(Object o)
    {
        log(trace, o);
    }

    public static void warn(Object o)
    {
        log(warn, o);
    }
}
