name         := "akka-http-testkit-munit"
organization := "nl.gn0s1s"
startYear    := Some(2024)
homepage     := Some(url("https://github.com/philippus/akka-http-testkit-munit"))
licenses += ("MPL-2.0", url("https://www.mozilla.org/MPL/2.0/"))

developers := List(
  Developer(
    id = "philippus",
    name = "Philippus Baalman",
    email = "",
    url = url("https://github.com/philippus")
  )
)

crossScalaVersions := List("2.13.16")
scalaVersion       := crossScalaVersions.value.last

ThisBuild / versionScheme          := Some("semver-spec")
ThisBuild / versionPolicyIntention := Compatibility.None

Compile / packageBin / packageOptions += Package.ManifestAttributes(
  "Automatic-Module-Name" -> "nl.gn0s1s.akka.http.scaladsl.testkit.munit"
)

scalacOptions += "-deprecation"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http-testkit"   % "10.2.9" % Provided,
  "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.21" % Provided,
  "org.scalameta"     %% "munit"               % "1.0.4"  % Provided
)

ThisBuild / turbo := true
