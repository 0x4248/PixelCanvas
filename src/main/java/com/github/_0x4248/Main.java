/**
 * PixelCanvas
 * A simple library that allows you to draw on a canvas in java.
 * GitHub: https://www.github.com/0x4248/PixelCanvas
 * Licence: GNU General Public License v3.0
 * By: 0x4248
 */


package com.github._0x4248;

import com.github._0x4248.PixelCanvas.PixelCanvas;
import com.github._0x4248.PixelCanvas.PixelUtil;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int width = 100;
        int height = 100;
        int pixelSize = 4;

        JFrame frame = new JFrame("Pixel Canvas");

        PixelCanvas Canvas = new PixelCanvas(width, height, pixelSize);
        frame.getContentPane().add(Canvas);
        frame.setSize(width * pixelSize, height * pixelSize);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);

        Canvas.setPixel(50,50,Color.RED);
    }
}
