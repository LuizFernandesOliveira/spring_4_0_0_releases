# Spring 4.0.0 Release Notes

## New Features and Improvements

### First class support for Java 25 (whilst retaining Java 17 compatibility).
Spring Framework 4.0.0 introduces full support for Java 25, allowing developers to leverage the latest language features and APIs while maintaining compatibility with Java 17. This ensures that applications can benefit from modern Java capabilities without sacrificing stability on older versions.

### A complete modularization of the Spring Boot codebase providing smaller and more focused jars.
The Spring Boot codebase has been restructured into a modular format, resulting in smaller, more focused JAR files. This modularization enhances application performance by allowing developers to include only the necessary components, reducing bloat and improving startup times.

### Portfolio-wide improvements for null safety with JSpecify.
Spring Framework 4.0.0 incorporates JSpecify annotations across the entire portfolio, enhancing null safety and reducing the likelihood of NullPointerExceptions. This improvement helps developers write more robust and reliable code by clearly defining nullability contracts.

### Support for API Versioning and HTTP Service Clients for REST based applications.
Spring Framework 4.0.0 introduces built-in support for API versioning and HTTP service clients, making it easier to manage and consume RESTful services. This feature allows developers to version their APIs seamlessly and create HTTP clients that can interact with REST endpoints efficiently.