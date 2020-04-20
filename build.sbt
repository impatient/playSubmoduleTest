import Common._

version := "1.0-SNAPSHOT"


lazy val playOne = (project in file("playone"))
  .settings(commonSettings("playone", "com.x"),
    libraryDependencies ++= Seq(guice)
  )
  .enablePlugins(PlayScala)

lazy val playTwo = (project in file("playtwo"))
  .aggregate(playOne)
  .settings(commonSettings("playtwo", "com.x.test"),
    libraryDependencies ++= Seq(guice)
  )
  .dependsOn(playOne)
  .enablePlugins(PlayScala)


lazy val root = (project in file("."))
  .aggregate(playOne, playTwo)
  .dependsOn(playOne, playTwo)


ThisBuild / scalaVersion := "2.13.1"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.x.test.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.x.test.binders._"
