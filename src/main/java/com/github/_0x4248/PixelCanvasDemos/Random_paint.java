/**
 * PixelCanvas
 * A simple library that allows you to draw on a canvas in java.
 * GitHub: https://www.github.com/0x4248/PixelCanvas
 * Licence: GNU General Public License v3.0
 * By: 0x4248
 */

package com.github._0x4248.PixelCanvasDemos;

import com.github._0x4248.PixelCanvas.PixelCanvas;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;
import java.awt.event.KeyEvent;

public class Random_paint {
    static int width = 500;
    static int height = 500;
    static int pixelSize = 2;
    static int speed = 1;
    static boolean eraseOnEdge = true;
    static int x = width / 2;
    static int y = height / 2;

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Pixel Canvas");
        PixelCanvas Canvas = new PixelCanvas(width, height, pixelSize);
        frame.getContentPane().add(Canvas);
        frame.setSize(width * pixelSize, height * pixelSize);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_UP) {
                    speed += 1;
                    System.out.println("Speed is now: " + speed*100);
                }
                else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
                    if (speed > 1) {
                        speed -= 1;
                    } else {
                    speed -= 1;
                    }
                    System.out.println("Speed is now: " + speed*100);
                }
                else if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
                    Canvas.clearCanvas();
                    System.out.println("Canvas cleared");
                }
                else if (evt.getKeyCode() == KeyEvent.VK_E) {
                    eraseOnEdge = !eraseOnEdge;
                    System.out.println("Erase on edge is now: " + eraseOnEdge);
                }
            }
        });

        Color color = Color.WHITE;
        while (true) {

            Canvas.setPixel(x, y, color);
            TimeUnit.MICROSECONDS.sleep(speed*100);
            x += (int) (Math.random() * 3) - 1;
            y += (int) (Math.random() * 3) - 1;
            if (Math.random() < 0.1) {
                color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
            }

            if (x > width) {
                Random_paint.resetCanvas(Canvas);
            }
            else if (y > height) {
                Random_paint.resetCanvas(Canvas);
            }
            else if (x < 0) {
                Random_paint.resetCanvas(Canvas);
            }
            else if (y < 0) {
                Random_paint.resetCanvas(Canvas);
            }
        }
    }

    public static void resetCanvas(PixelCanvas canvas) {
        if (eraseOnEdge) {
            canvas.clearCanvas();
        }
        x = width / 2;
        y = height / 2;
    }
}

