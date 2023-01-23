# Software you will need for this module

- [JDK 17](https://www.oracle.com/ie/java/technologies/javase-downloads.html)
- [Visual Studio Code](https://code.visualstudio.com/)
- [Visual Studio Code Java Extensions](https://code.visualstudio.com/docs/languages/java)
- [Git](https://git-scm.com/download/)

Setting up Java on Windows:

[![YouTube](http://img.youtube.com/vi/WXftKFCtPrQ/0.jpg)](https://www.youtube.com/watch?v=WXftKFCtPrQ)

Install the above software. Create an empty folder on your computer. Right click on the folder and select Git Bash here.

To clone the repository for the course type:

```bash
git clone http://github.com/skooter500/OOP-2023
```

Launch Visual Studio Code and choose File | Open Folder *not open file* and open the repo. There are two files in this folder that tells VSC how to compile and the Java code. The most significant of these is the .classpath file. This is an XML file that lists all the jar files that the project depends on. Open the file in VSC and check it out.  jar files are zip files with a .jar extension that contain .class files. You should be able to open Main.java and choose Debug from the debug menu in VSC to compile and run the code.