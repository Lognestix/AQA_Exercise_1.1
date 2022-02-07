# Selenide (AQA_Exercise_1.1)
## Домашнее задание по курсу "Автоматизированное тестирование"
## Тема: «1.1. Основы автоматизации», задание №1: «CashbackHacker», задание №2: «JUnit5 и Legacy»
- Применены инструменты:
	1. Задание №1:
		1. часть 1 - TestNG;
		1. часть 2 - JUnit4.
	1. Задание №2:
		- JUnit5.
- Тестируемая функциональность:
	1. Задание №1:
		1. часть 1 - использование TestNG (реализовано в ветке testng):
			- для использования необходимо в зависимости добавить
			```
			dependencies {
				testImplementation 'org.testng:testng:7.4.0'
			}

			test {
				useTestNG()
			}
			```
		1. часть 2 - использование JUnit4 (реализовано в ветке junit4):
			- для использования необходимо в зависимости добавить
			```
			dependencies {
				testImplementation 'junit:junit:4.13.2'
			}

			test {
				useJUnit()
			}
			```
	1. Задание №2:
		- использование JUnit5 с поддержкой наследия JUnit4 ((реализовано в ветке junit4-platform)):
			- для использования необходимо в зависимости добавить
			```
			dependencies {
				testImplementation 'org.junit.jupiter:junit-jupiter-api:5.8.2'
				testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.8.2'

				testImplementation 'junit:junit:4.13.2'
				testRuntimeOnly 'org.junit.vintage:junit-vintage-engine:5.8.2'
			}

			test {
				useJUnitPlatform()
			}
			```
### Предварительные требования
- На компьютере пользователя должна быть установлена:
	- Intellij IDEA
### Установка и запуск
1. Склонировать проект на свой компьютер
	- открыть терминал
	- ввести команду 
		```
		git clone https://github.com/Lognestix/AQA_Exercise_1.1
		```
1. Открыть склонированный проект в Intellij IDEA
1. Перейти в необходимую ветку:
	- в Intellij IDEA во вкладке Terminal (Alt+F12) ввести команду
	```
	git checkout name
	```
	где name - имя ветки
1. Запустить авто-тесты командой
	```
	./gradlew clean test
	```