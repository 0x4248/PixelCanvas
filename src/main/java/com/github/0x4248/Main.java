/**
 * PixelCanvas
 * A simple library that allows you to draw on a canvas in java.
 * GitHub: https://www.github.com/0x4248/PixelCanvas
 * Licence: GNU General Public License v3.0
 * By: 0x4248
 */

package com.github.0x4248;

import com.github.0x4248.PixelCanvas.PixelCanvas;
import com.github.0x4248.PixelCanvas.PixelUtil;
import com.github.0x4248.PixelCanvas.Mouse;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
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

        PixelUtil.rectangle.fill(Canvas, 0, 0, width, height, Color.RED);
    }
}
