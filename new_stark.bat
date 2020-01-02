@ECHO OFF
set CLASSPATH=.
javac -cp PATIENT_DOCTOR_MODULE.jar AEvent3.java
java MyActionListener
pause