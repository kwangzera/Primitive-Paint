@echo off

echo creating bin\
>nul mkdir bin

echo compiling src\Main.java
javac -sourcepath src -d bin src\Main.java || (pause & exit /b)
echo running bin\Main
java -cp .;bin Main

echo deleting bin\
>nul rmdir /q /s bin

pause
