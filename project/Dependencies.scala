import sbt.Keys.resolvers
import sbt._

object Dependencies {
  resolvers += "Local Maven Repository" at "file://Users/edwardprentice/.m2/repository"
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.1"
  lazy val awsiot = "com.amazonaws" % "aws-iot-device-sdk-java" % "1.1.1"
//  lazy val awsiotsamples = "com.amazonaws" %% "aws-iot-device-sdk-java" % "1.1.1"
}
