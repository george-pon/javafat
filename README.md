# javafat
heap memory eater / cpu eater for memory limit / cpu limit test java web app (jsp/servlet)

### how to use

install gradle. see https://gradle.org/install/ Gradle | Installation 
in Windows, install gradle with chocolatey.
```
choco install -y gradle
```

create gradle wrapper file.
see https://guides.gradle.org/building-java-web-applications/ Building Java Web Applications
```
gradle wrapper --gradle-version=4.5
```

build and test run in localhost:8080
```
.\gradlew.bat clean build war appRun
```

access with web browser http://localhost:8080/javafat/


after all, stop gradle daemon
```
gradle --stop
```


