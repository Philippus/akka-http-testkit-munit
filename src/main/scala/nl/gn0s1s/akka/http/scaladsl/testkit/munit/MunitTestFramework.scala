package nl.gn0s1s.akka.http.scaladsl.testkit.munit

import akka.http.scaladsl.server.ExceptionHandler
import akka.http.scaladsl.testkit.TestFrameworkInterface
import munit.FunSuite

trait MunitTestFramework extends FunSuite with TestFrameworkInterface {
  override def failTest(msg: String): Nothing = throw new AssertionError(msg)

  override def afterAll(): Unit = {
    cleanUp()
    super.afterAll()
  }

  override val testExceptionHandler: ExceptionHandler = ExceptionHandler {
    case e: munit.ComparisonFailException => throw e
    case e: munit.FailSuiteException      => throw e
    case e: munit.FailException           => throw e
    case e: java.lang.AssertionError      => throw e
  }
}
