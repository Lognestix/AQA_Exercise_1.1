# В ветке junit4 в build.gradle добавленна поддержка JUnit4.
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
    testImplementation 'junit:junit:4.13.2'
}

test {
    useJUnit()
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
# Авто-тесты находящиеся в этом репозитории
```Java
package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    //Общие данные:
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldBelowLimit() {
        int amount = 750;

        int actual = service.remain(amount);
        int expected = 250;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldLimit() {
        int amount = 1_000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAboveLimit() {
        int amount = 1_250;

        int actual = service.remain(amount);
        int expected = 750;

        assertEquals(expected, actual);
    }
}
```