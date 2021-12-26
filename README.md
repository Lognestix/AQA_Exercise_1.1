# В ветке master в build.gradle добавленна поддержка JUnit-Jupiter. Поддержка TestNG и JUnit4 будет в соответсвующих ветках.
```gradle
plugins {
    id 'java'
}

group 'ru.netology'
version '1.0-SNAPSHOT'

sourceCompatibility = 11

compileJava.options.encoding = "UTF-8"
compileTestJava.options.encoding = "UTF-8"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter:5.8.2'
}

test {
    useJUnitPlatform()
}
```
# Код Java находящийся в этом репозитории
```Java
package ru.netology.service;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}
```