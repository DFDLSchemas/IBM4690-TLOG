name := "dfdl-ibm4690-tlog"

organization := "com.toshibacommerce"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.18"

// To run against IBM DFDL, uncomment the line below so that
// the ibm-dfdl-crosstester plugin will run.
// Setup of the ibm-dfdl-crosstester is explained in the README.md
// file of the github openDFDL ibm-dfdl-crosstester project.
//
// IBMDFDLCrossTesterPlugin.settings

enablePlugins(DaffodilPlugin)
