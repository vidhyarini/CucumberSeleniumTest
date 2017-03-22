set projectLocation=C:\Users\Rivi\workspace\com.learnautomation.cucumber
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause