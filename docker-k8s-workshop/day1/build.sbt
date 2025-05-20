name := "hello-world-api"
version := "0.1"
scalaVersion := "2.13.12"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % "10.2.10",
  "com.typesafe.akka" %% "akka-stream" % "2.6.21",
  "com.typesafe.akka" %% "akka-actor" % "2.6.21"
)

enablePlugins(AssemblyPlugin)

mainClass in assembly := Some("HelloWorldServer")
