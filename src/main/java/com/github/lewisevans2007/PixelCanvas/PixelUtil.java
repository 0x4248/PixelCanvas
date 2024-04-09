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
                    canvas.setPixel(i, j, color);
                }
            }
        }

        public static void outline(PixelCanvas canvas, int x, int y, int width, int height, Color color) {
            for (int i = x; i < x + width; i++) {
                canvas.setPixel(i, y, color);
                canvas.setPixel(i, y + height, color);
            }
            for (int i = y; i < y + height; i++) {
                canvas.setPixel(x, i, color);
                canvas.setPixel(x + width, i, color);
            }
            canvas.setPixel(x+width, y+height, color);
        }

        public static void fillOutline(PixelCanvas canvas, int x, int y, int width, int height, Color fillColor, Color outlineColor) {
            fill(canvas, x, y, width, height, fillColor);
            outline(canvas, x, y, width, height, outlineColor);
        }

        public static void dottedOutline(PixelCanvas canvas, int x, int y, int width, int height, Color color) {
            for (int i = x; i < x + width; i++) {
                if (i % 2 == 0) {
                    canvas.setPixel(i, y, color);
                    canvas.setPixel(i, y + height, color);
                }
            }
            for (int i = y; i < y + height; i++) {
                if (i % 2 == 0) {
                    canvas.setPixel(x, i, color);
                    canvas.setPixel(x + width, i, color);
                }
            }
        }
    }
}
