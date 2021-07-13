@echo off
setlocal
set JAVA_HOME=C:\Program Files\Java\jdk-11.0.2
set Path=%JAVA_HOME%\bin;%Path%
echo Java 11 activated.
call mvn clean verify
endlocal