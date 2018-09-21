# javafat
heap memory eater / cpu eater for memory limit / cpu limit test java web app (jsp/servlet)

### how to use

install gradle (if you have not). see https://gradle.org/install/ Gradle | Installation 
in Windows, install gradle with chocolatey. see https://chocolatey.org/ Chocolatey - The package manager for Windows
```
choco install -y gradle
```

build and test run in localhost:8080
```
# see gradle tasks
gradle tasks

# build
gradle build

# run
# gradle appRun # run in gretty ?
gradle tomcatRun  # run on tomcat
```

access with web browser http://localhost:8080/javafat/


after all, stop gradle daemon
```
gradle --stop
```


