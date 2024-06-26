/**
 * PixelCanvas
 * A simple library that allows you to draw on a canvas in java.
 * GitHub: https://www.github.com/0x4248/PixelCanvas
 * Licence: GNU General Public License v3.0
 * By: 0x4248
 */

package com.github._0x4248.PixelCanvas;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class PixelCanvas extends JPanel {
    BufferedImage canvas;
    int pixelSize;
    public PixelCanvas(int width, int height, int _pixelSize) {
        width *= _pixelSize;
        height *= _pixelSize;
        pixelSize = _pixelSize;
        canvas = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        clearCanvas();
    }

    public void clearCanvas() {
        Graphics2D g = canvas.createGraphics();
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        g.dispose();
        repaint();
    }

    public void setPixel(int x, int y, Color color) {
        Graphics2D g = canvas.createGraphics();
        g.setColor(color);
        g.fillRect(x * pixelSize, y * pixelSize, pixelSize, pixelSize);
        g.dispose();
        repaint();
    }

    public void setPixelWithoutUpdate(int x, int y, Color color) {
        Graphics2D g = canvas.createGraphics();
        g.setColor(color);
        g.fillRect(x * pixelSize, y * pixelSize, pixelSize, pixelSize);
        g.dispose();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(canvas, 0, 0, null);
    }
}
