# Back-end

## Descriptif

This repository contains a Spring Boot application that provides a Rest service that allows you to compute basics operations. This project serve as an example about the use of Serenity behavior tests.

## Installation

This project was made with maven and to install it, you'll just have to go to the root and to run thoses commands:

- This one will clean and verify unit and behavior tests

```
$ mvn verify
```

- This one will launch the Rest service

```
$ mvn spring-boot:run
```

It's important to notice that serenity tests are not detected when using mvn verify directly. In order to see the results, you'll have to execute the tests with IntellIj first for whatever reason.
