import sbt._

logLevel := Level.Info


// Linting
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.7")

// Coverage
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.6.0")

// Native Binaries
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.3.3")

// Cinnamon Metrics
// addSbtPlugin("com.lightbend.cinnamon" % "sbt-cinnamon" % "2.11.4")

// Play Framework
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.7.3")

// sbt-paradox, used for documentation
// addSbtPlugin("com.lightbend.paradox" % "sbt-paradox" % "0.3.1")

// Load testing tool:
// http://gatling.io/docs/2.2.2/extensions/sbt_plugin.html
addSbtPlugin("io.gatling" % "gatling-sbt" % "2.2.2")

// Scala formatting: "sbt scalafmt"
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.0.4")

// Dependency updates
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.4.2")

// unify scaladoc/javadoc across multiple projects.
addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.4.2")
