val scala3Version = "3.0.0-RC1"
connectInput in run := true

lazy val root = project
  .in(file("."))
  .settings(
    name := "helloworld",
    organization := "com.example",
    version := "0.0.1",
    scalaVersion := scala3Version,
    libraryDependencies += "com.example" %% "greeter" % "1.0.1",
    publishTo := Some(
      "proxy" at s"https://repo1.maven.org/maven2/"
    )
  )
