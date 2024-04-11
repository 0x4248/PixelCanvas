/**
 * PixelCanvas
 * A simple library that allows you to draw on a canvas in java.
 * GitHub: https://www.github.com/0x4248/PixelCanvas
 * Licence: GNU General Public License v3.0
 * By: 0x4248
 */

package com.github.0x4248.PixelCanvasDemos;

import com.github.0x4248.PixelCanvas.PixelCanvas;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Random_paint {
    public static void main(String[] args) throws InterruptedException {
        int width = 100;
        int height = 100;
        int pixelSize = 8;

        JFrame frame = new JFrame("Pixel Canvas");

        PixelCanvas Canvas = new PixelCanvas(width, height, pixelSize);
        frame.getContentPane().add(Canvas);
        frame.setSize(width * pixelSize, height * pixelSize);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

        int x = width/ 2;
        int y = height / 2;
        Color color = Color.WHITE;
        while (true) {
            Canvas.setPixel(x, y, color);
            TimeUnit.MILLISECONDS.sleep(2);
            x += (int) (Math.random() * 3) - 1;
            y += (int) (Math.random() * 3) - 1;
            if (Math.random() < 0.1) {
                color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
            }

            if (x > width) {
                Canvas.clearCanvas();
                x = width / 2;
                y = height / 2;
                continue;
            }
            else if (y > height) {
                Canvas.clearCanvas();
                x = width / 2;
                y = width / 2;
                continue;
            }
            else if (x < 0) {
                Canvas.clearCanvas();
                x = width / 2;
                y = height / 2;
                continue;
            }
            else if (y < 0) {
                Canvas.clearCanvas();
                x = width / 2;
                y = height / 2;
                continue;
            }

        }

    }
}
