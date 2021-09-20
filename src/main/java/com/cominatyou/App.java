package com.cominatyou;

import java.awt.AWTException;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.cominatyou.util.WinTrayIcon;

public class App {
    static String getSnowflakeDateString(long snowflake) {
        final long timestamp = snowflake >> 22;
        final long epoch = 1420070400000L;
        final Date date = new Date(epoch + timestamp);
        return new SimpleDateFormat("MMM d, YYYY").format(date) + " at " + new SimpleDateFormat("h:mm a").format(date);
    }
    private static void displayNotification(String title, String description, TrayIcon trayIcon, MessageType type) throws AWTException {
        trayIcon.displayMessage(title, description, type);
    }
    public static void main(String[] args) throws AWTException, InterruptedException {
        final TrayIcon trayIcon = WinTrayIcon.createTrayIcon();
        if (args.length == 0) {
            displayNotification("No Snowflake Provided", "A Discord Snowflake is required to get a date.", trayIcon, MessageType.ERROR);
            TimeUnit.SECONDS.sleep(8);
            System.exit(1);
        }
        if (args[0].length() < 18) {
            displayNotification("Invalid Snowflake", "That doesn't look to be a valid Discord Snowflake.", trayIcon, MessageType.ERROR);
            TimeUnit.SECONDS.sleep(8);
            System.exit(1);
        }
        final long snowflake = Long.parseLong(args[0]);
        final String dateString = getSnowflakeDateString(snowflake);
        displayNotification("Discord Date Calculator", "Created on " + dateString, trayIcon, MessageType.INFO);
        TimeUnit.SECONDS.sleep(8);
        System.exit(0);
    }
}
