package com.cominatyou.util;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;

public class WinTrayIcon {
    public static TrayIcon createTrayIcon() throws AWTException {
        SystemTray tray = SystemTray.getSystemTray();
        Image image = Toolkit.getDefaultToolkit().createImage(WinTrayIcon.class.getResource("/trayicon.png"));
        TrayIcon trayIcon = new TrayIcon(image, "Discord Date Extractor");
        trayIcon.setImageAutoSize(true);
        trayIcon.setToolTip("Discord Date Calculator");
        tray.add(trayIcon);
        return trayIcon;
    }
}
