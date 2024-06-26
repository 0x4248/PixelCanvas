/**
 * PixelCanvas
 * A simple library that allows you to draw on a canvas in java.
 * GitHub: https://www.github.com/0x4248/PixelCanvas
 * Licence: GNU General Public License v3.0
 * By: 0x4248
 */

package com.github._0x4248.PixelCanvas;

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
    public static class circle {
        public static void fill(PixelCanvas canvas, int x, int y, int radius, Color color) {
            for (int i = x - radius; i < x + radius; i++) {
                for (int j = y - radius; j < y + radius; j++) {
                    if (Math.sqrt(Math.pow(i - x, 2) + Math.pow(j - y, 2)) < radius) {
                        canvas.setPixelWithoutUpdate(i, j, color);
                    }
                }
            }
            canvas.repaint();
        }

        public static void outline(PixelCanvas canvas, int x, int y, int radius, Color color) {
            for (int i = x - radius; i < x + radius; i++) {
                if (Math.sqrt(Math.pow(i - x, 2) + Math.pow(y - radius, 2)) < radius) {
                    canvas.setPixelWithoutUpdate(i, y - radius, color);
                }
                if (Math.sqrt(Math.pow(i - x, 2) + Math.pow(y + radius, 2)) < radius) {
                    canvas.setPixelWithoutUpdate(i, y + radius, color);
                }
            }
            for (int i = y - radius; i < y + radius; i++) {
                if (Math.sqrt(Math.pow(x - radius, 2) + Math.pow(i - y, 2)) < radius) {
                    canvas.setPixelWithoutUpdate(x - radius, i, color);
                }
                if (Math.sqrt(Math.pow(x + radius, 2) + Math.pow(i - y, 2)) < radius) {
                    canvas.setPixelWithoutUpdate(x + radius, i, color);
                }
            }
            canvas.repaint();
        }

        public static void fillOutline(PixelCanvas canvas, int x, int y, int radius, Color fillColor, Color outlineColor) {
            fill(canvas, x, y, radius, fillColor);
            outline(canvas, x, y, radius, outlineColor);
        }
    }

    public static class line {
        public static void draw(PixelCanvas canvas, int x1, int y1, int x2, int y2, Color color) {
            int dx = Math.abs(x2 - x1);
            int dy = Math.abs(y2 - y1);
            int sx = x1 < x2 ? 1 : -1;
            int sy = y1 < y2 ? 1 : -1;
            int err = dx - dy;
            while (true) {
                canvas.setPixelWithoutUpdate(x1, y1, color);
                if (x1 == x2 && y1 == y2) break;
                int e2 = 2 * err;
                if (e2 > -dy) {
                    err -= dy;
                    x1 += sx;
                }
                if (e2 < dx) {
                    err += dx;
                    y1 += sy;
                }
            }
            canvas.repaint();
        }

        public static void dotted(PixelCanvas canvas, int x1, int y1, int x2, int y2, Color color) {
            int dx = Math.abs(x2 - x1);
            int dy = Math.abs(y2 - y1);
            int sx = x1 < x2 ? 1 : -1;
            int sy = y1 < y2 ? 1 : -1;
            int err = dx - dy;
            int count = 0;
            while (true) {
                if (count % 2 == 0) {
                    canvas.setPixelWithoutUpdate(x1, y1, color);
                }
                if (x1 == x2 && y1 == y2) break;
                int e2 = 2 * err;
                if (e2 > -dy) {
                    err -= dy;
                    x1 += sx;
                }
                if (e2 < dx) {
                    err += dx;
                    y1 += sy;
                }
                count++;
            }
            canvas.repaint();
        }
    }
}