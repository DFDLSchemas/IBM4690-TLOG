name := "dfdl-ibm4690-tlog"

organization := "com.toshibacommerce"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.15"

libraryDependencies ++= Seq(
  "org.apache.daffodil" %% "daffodil-tdml-processor" % "3.2.0" % "test",
  "junit" % "junit" % "4.13.2" % "test",
  "com.github.sbt" % "junit-interface" % "0.13.3" % "test",
  "org.apache.logging.log4j" % "log4j-api" % "2.18.0" % "test",
  "org.apache.logging.log4j" % "log4j-core" % "2.18.0" % "test",
)

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

crossPaths := false

// To run against IBM DFDL, uncomment the line below so that
// the ibm-dfdl-crosstester plugin will run.
// Setup of the ibm-dfdl-crosstester is explained in the README.md
// file of the github openDFDL ibm-dfdl-crosstester project.
//
// IBMDFDLCrossTesterPlugin.settings
