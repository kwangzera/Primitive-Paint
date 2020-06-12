@echo off

echo moved previously created .class files to bin
>nul del *.class

echo compiling src/javac PaintApp.java
javac PaintApp.java || (pause & exit /b)
echo running src/java PaintApp
java PaintApp
pause