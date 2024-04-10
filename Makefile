#PixelCanvas
#A simple library that allows you to draw on a canvas in java.
#GitHub: https://www.github.com/lewisevans2007/PixelCanvas
#Licence: GNU General Public License v3.0
#By: Lewis Evans

all: compile compile_to_jar

compile:
	javac -d . src/main/java/com/github/lewisevans2007/*.java src/main/java/com/github/lewisevans2007/PixelCanvas/*.java

compile_to_jar:
	jar cfm PixelCanvas.jar META-INF/MANIFEST.MF -C . com

clean:
	rm -rf com
	rm PixelCanvas.jar