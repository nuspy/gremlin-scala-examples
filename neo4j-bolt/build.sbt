name := "gremlin-scala-examples-neo4j"
organization := "com.michaelpollmeier"
version := "1.0.0-SNAPSHOT"
scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.michaelpollmeier" %% "gremlin-scala" % "3.2.3.1",
  "com.steelbridgelabs.oss" % "neo4j-gremlin-bolt" % "0.2.11",
  "org.slf4j" % "slf4j-simple" % "1.7.21",
  "org.scalatest" %% "scalatest" % "3.0.0" % "test"
)
resolvers += Resolver.mavenLocal
