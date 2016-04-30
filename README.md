# Spring Data Groovy Traits Bug #

This project demonstrates a problem that occurs when trying to use Spring Data with Groovy traits.
Specifically, when trying to work with a property provided by a trait, an exception like this is thrown:

    org.springframework.data.mapping.context.InvalidPersistentPropertyPath: No property age found on example.springdata.groovytraitsbug.Customer!

This bug has been reported as [DATACMNS-851](https://jira.spring.io/browse/DATACMNS-851).

## Running the Test Case ##

This project uses the [Gradle wrapper][], so assuming you have a JDK installed, you can simply run:

    $ ./gradlew test

[Gradle wrapper]: https://docs.gradle.org/current/userguide/gradle_wrapper.html
