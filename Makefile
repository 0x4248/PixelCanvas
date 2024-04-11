#PixelCanvas
#A simple library that allows you to draw on a canvas in java.
#GitHub: https://www.github.com/0x4248/PixelCanvas
#Licence: GNU General Public License v3.0
#By: 0x4248

all: compile compile_to_jar

compile:

	javac -parameters -d . src/main/java/com/github/0x4248/*.java src/main/java/com/github/0x4248/PixelCanvas/*.java
	
compile_to_jar:
	jar cfm PixelCanvas.jar META-INF/MANIFEST.MF -C . com

clean:
	rm -rf com
	rm PixelCanvas.jar