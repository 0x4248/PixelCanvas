/**
 * PixelCanvas
 * A simple library that allows you to draw on a canvas in java.
 * GitHub: https://www.github.com/lewisevans2007/PixelCanvas
 * Licence: GNU General Public License v3.0
 * By: Lewis Evans
 */

package com.github.lewisevans2007.PixelCanvas;

import java.awt.*;

public class PixelUtil {
    public static class rectangle {
        public static void fill(PixelCanvas canvas, int x, int y, int width, int height, Color color) {
            for (int i = x; i < x + width; i++) {
                for (int j = y; j < y + height; j++) {
                    canvas.setPixelWithoutUpdate(i, j, color);
                }
            }
            canvas.repaint();
        }

        public static void outline(PixelCanvas canvas, int x, int y, int width, int height, Color color) {
            for (int i = x; i < x + width; i++) {
                canvas.setPixelWithoutUpdate(i, y, color);
                canvas.setPixelWithoutUpdate(i, y + height, color);
            }
            for (int i = y; i < y + height; i++) {
                canvas.setPixelWithoutUpdate(x, i, color);
                canvas.setPixelWithoutUpdate(x + width, i, color);
            }
            canvas.setPixelWithoutUpdate(x+width, y+height, color);
            canvas.repaint();
        }

        public static void fillOutline(PixelCanvas canvas, int x, int y, int width, int height, Color fillColor, Color outlineColor) {
            fill(canvas, x, y, width, height, fillColor);
            outline(canvas, x, y, width, height, outlineColor);
        }

        public static void dottedOutline(PixelCanvas canvas, int x, int y, int width, int height, Color color) {
            for (int i = x; i < x + width; i++) {
                if (i % 2 == 0) {
                    canvas.setPixelWithoutUpdate(i, y, color);
                    canvas.setPixelWithoutUpdate(i, y + height, color);
                }
            }
            for (int i = y; i < y + height; i++) {
                if (i % 2 == 0) {
                    canvas.setPixelWithoutUpdate(x, i, color);
                    canvas.setPixelWithoutUpdate(x + width, i, color);
                }
            }
            canvas.setPixelWithoutUpdate(x+width, y+height, color);
            canvas.repaint();
        }
    }
}
