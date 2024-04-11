# PixelCanvas
A simple library that allows you to draw on a canvas in java. This can be used for creating interesting animations or games.

Pixel canvas is

## Usage
By the end of this section you should have a basic window with a red screen at 100x100.

Download the jar file from the releases page and add it to your project. This can be done in intelij by going to `File -> Project Structure -> Libraries -> + -> Java -> Select the jar file`.

In `Main.java`:
```java
import com.github._0x4248.PixelCanvas.PixelCanvas;
import com.github._0x4248.PixelCanvas.PixelUtil;

import javax.swing.*;
import java.awt.*;

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
```

Lets go line by line:

```java
import com.github._0x4248.PixelCanvas.PixelCanvas;
import com.github._0x4248.PixelCanvas.PixelUtil;
```

This imports the PixelCanvas and PixelUtil classes.

```java
import javax.swing.*;
import java.awt.*;
```

This imports the JFrame class and the Color class.

```java
public class Main {
    public static void main(String[] args) {
```

This is the main class and method.

```java
int width = 100;
int height = 100;
int pixelSize = 8;
```

These are the width and height of the canvas and the size of each pixel.

```java
JFrame frame = new JFrame("Pixel Canvas");
```

This creates a new JFrame with the title "Pixel Canvas".

```java
PixelCanvas Canvas = new PixelCanvas(width, height, pixelSize);
```

This creates a new PixelCanvas object with the width, height and pixel size.

```java
frame.getContentPane().add(Canvas);
```

This adds the canvas to the frame.

```java
frame.setSize(width * pixelSize, height * pixelSize);
```

This sets the size of the frame to the size of the canvas.

```java
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
```

This sets the default close operation to exit on close.

```java
frame.setVisible(true);
```

This makes the frame visible.

```java
frame.setResizable(false);
```

This makes the frame not resizable.

```java
PixelUtil.rectangle.fill(Canvas, 0, 0, width, height, Color.RED);
```

This fills the canvas with a red rectangle.

## PixelUtil

The PixelUtil class contains a number of methods for drawing on the canvas. The methods are static and take a PixelCanvas object as the first argument.

### Rectangle

```java
PixelUtil.rectangle.fill(Canvas, x, y, width, height, color);
```

This fills a rectangle with the top left corner at (x, y) and the bottom right corner at (x + width, y + height) with the specified color.

```java
PixelUtil.rectangle.outline(Canvas, x, y, width, height, color);
```

This outlines a rectangle with the top left corner at (x, y) and the bottom right corner at (x + width, y + height) with the specified color.

```java
PixelUtil.rectangle.fillOutline(canvas, x, y, width, height, FillColor, outlineColor)
```

This fills a rectangle with the top left corner at (x, y) and the bottom right corner at (x + width, y + height) with the specified fill color and outlines it with the specified outline color.

```java
PixelUtil.rectangle.dottedOutline(canvas, x, y, width, height, color, dotSize)
```

This outlines a rectangle with the top left corner at (x, y) and the bottom right corner at (x + width, y + height) with the specified color and a dotted line with the specified dot size.

### Circle

```java
PixelUtil.circle.fill(Canvas, x, y, radius, color);
```

This fills a circle with the center at (x, y) and the specified radius with the specified color.

```java
PixelUtil.circle.outline(Canvas, x, y, radius, color);
```

This outlines a circle with the center at (x, y) and the specified radius with the specified color.

```java
PixelUtil.circle.fillOutline(canvas, x, y, radius, FillColor, outlineColor)
```

This fills a circle with the center at (x, y) and the specified radius with the specified fill color and outlines it with the specified outline color.


## Licence

This project is licenced under the GNU General Public Licence v3.0 please see the [LICENCE](LICENCE) file for more information.