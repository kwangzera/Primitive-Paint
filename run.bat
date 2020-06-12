@echo off

echo creating bin\
>nul mkdir bin

echo compiling src\PaintApp.java
javac -sourcepath src -d bin src\PaintApp.java || (pause & exit /b)
echo running bin\PaintApp
java -cp .;bin PaintApp

echo deleting bin\
>nul rmdir /q /s bin

pause
