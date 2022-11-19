javac -d classes "src" src/Story.java
jar -cfm Lab3_prog.jar src/MANIFEST.mf -C ./classes .
java -jar Lab3_prog.jar
