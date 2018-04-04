#Showcase in difference how logger.error and System.err.print are handled

You can switch between distributions in `gradle/wrapper/gradle-wrapper.properties`

In Gradle 4.5.1 they are printend in standard error.

`./gradlew print >out 2>error`
`cat error`

In Gradle 4.8 nightly are printed in standard output.

`./gradlew print >out 2>error`
`cat error`