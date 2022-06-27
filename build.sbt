ThisBuild / scalaVersion:= "2.12.12"
ThisBuild / organization := "com.example"

lazy val root = (project in file("."))
  .aggregate(common,rest)
  .settings(
    name := "root"
    
  )

lazy val common = (project in file("common"))
  .settings(
    name := "common",
    libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.7", 
    libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.3.0",  
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.7" % Test,
    libraryDependencies += "org.mockito" %% "mockito-scala" % "1.16.32" % "Test"
  )  
lazy val rest = (project in file("rest"))
  .settings(
    name := "rest",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http" %  "10.2.4",
      "com.typesafe.akka" %% "akka-stream" % "2.6.14",
      "com.typesafe.akka" %% "akka-actor" % "2.6.14",
      "org.json4s" %% "json4s-native" % "3.7.0-M16" ,
      "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.14" % "Test",
      "com.typesafe.akka" %% "akka-http-testkit" % "10.2.4" % "Test",
      "com.typesafe.akka" %% "akka-testkit" % "2.6.14" % "Test")
    
  )  
