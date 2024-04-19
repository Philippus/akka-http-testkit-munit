# akka-http-testkit-munit

[![build](https://github.com/Philippus/akka-http-testkit-munit/workflows/build/badge.svg)](https://github.com/Philippus/akka-http-testkit-munit/actions/workflows/scala.yml?query=workflow%3Abuild+branch%3Amain)
[![codecov](https://codecov.io/gh/Philippus/akka-http-testkit-munit/branch/master/graph/badge.svg)](https://codecov.io/gh/Philippus/akka-http-testkit-munit)
![Current Version](https://img.shields.io/badge/version-0.0.1-brightgreen.svg?style=flat "0.0.1")
[![Scala Steward badge](https://img.shields.io/badge/Scala_Steward-helping-blue.svg?style=flat&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA4AAAAQCAMAAAARSr4IAAAAVFBMVEUAAACHjojlOy5NWlrKzcYRKjGFjIbp293YycuLa3pYY2LSqql4f3pCUFTgSjNodYRmcXUsPD/NTTbjRS+2jomhgnzNc223cGvZS0HaSD0XLjbaSjElhIr+AAAAAXRSTlMAQObYZgAAAHlJREFUCNdNyosOwyAIhWHAQS1Vt7a77/3fcxxdmv0xwmckutAR1nkm4ggbyEcg/wWmlGLDAA3oL50xi6fk5ffZ3E2E3QfZDCcCN2YtbEWZt+Drc6u6rlqv7Uk0LdKqqr5rk2UCRXOk0vmQKGfc94nOJyQjouF9H/wCc9gECEYfONoAAAAASUVORK5CYII=)](https://scala-steward.org)
[![license](https://img.shields.io/badge/license-Apache%202.0-blue.svg?style=flat "Apache 2.0")](LICENSE)

akka-http-testkit-munit allows you to test your akka-http routes with munit. It provides a `MunitRouteTest` trait that
you can mix in with your test classes to test your routes.

## Installation
akka-http-testkit-munit is published for Scala 2.13. To start using it add the following to your `build.sbt`:

    libraryDependencies += "nl.gn0s1s" %% "akka-http-testkit-munit" % "0.0.1"

akka-http-testkit, akka-stream-testkit and munit also need to be added as dependencies to your project.

## Example usage

See the tests for an example.

## Resources

## License
The code is available under the [Apache License, version 2.0](LICENSE).
