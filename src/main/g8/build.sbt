name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "6.0.4",
  "org.specs2" %% "specs2" % "1.13" % "test"
)

initialCommands := "import $organization$.$name;format="lower,word"$._"
