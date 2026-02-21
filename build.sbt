val root = (project in file("."))
  .settings(
    name := "dfdl-ibm4690-tlog",

    organization := "com.toshibacommerce",

    version := "0.0.1-SNAPSHOT"
  )
  .daffodilProject()
