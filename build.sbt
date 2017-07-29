import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.3",
      version := "0.1.0-SNAPSHOT"
    )),
    name := "Hello",
    libraryDependencies ++= Seq(
      scalaTest % Test,
      awsiot
    ),
    resolvers += "Local Maven Repository" at "file://Users/edwardprentice/.m2/repository"
    // "file://"+Path.userHome.absolutePath+"/.m2/repository"

  )
