/**
 * PixelCanvas
 * A simple library that allows you to draw on a canvas in java.
 * GitHub: https://www.github.com/lewisevans2007/PixelCanvas
 * Licence: GNU General Public License v3.0
 * By: Lewis Evans
 */

package com.github.lewisevans2007.PixelCanvas;

import java.awt.*;


public class Mouse {
    public static Point getMousePosition() {
        return MouseInfo.getPointerInfo().getLocation();
    }

    public static Point getMousePositionRelativeToPixelSize(int pixelSize) {
        Point mousePosition = getMousePosition();
        int x = (int) Math.floor(mousePosition.getX() / pixelSize);
        int y = (int) Math.floor(mousePosition.getY() / pixelSize);
        return new Point(x, y);
    }
}
