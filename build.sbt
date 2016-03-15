import com.scalapenos.sbt.prompt.SbtPrompt.autoImport._

//sonatypeSettings

promptTheme := ScalapenosTheme

name := "denormalisation-exercise"

organization := "com.janschulte"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.7"

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases"),
  Resolver.sonatypeRepo("snapshots"),
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"
)

libraryDependencies ++= Seq(
  "org.scala-lang.modules" % "scala-xml_2.11" % "1.0.5",
  "org.monifu" %% "monifu" % "1.0",
  "com.typesafe.play" % "play-ws_2.11" % "2.5.0",
  "io.plasmap" %% "geow" % "0.3.11-SNAPSHOT",
  "com.janschulte" %% "akvokolekta" % "0.1.0-SNAPSHOT",
  "com.typesafe.akka" %% "akka-actor" % "2.4.2-RC1",
  "com.typesafe.akka" %% "akka-testkit" % "2.4.2",
  "com.typesafe.akka" %% "akka-stream" % "2.4.2",
  "org.scalacheck" %% "scalacheck" % "1.11.6" % "test",
  "org.specs2" %% "specs2" % "2.4.11" % "test"
)
