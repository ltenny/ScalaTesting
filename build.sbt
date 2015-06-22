name := "ScalaTesting"

version := "1.0"

scalaVersion := "2.11.6"


resolvers ++= Seq("snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
                  "releases" at "http://oss.sonatype.org/content/repositories/releases",
                  "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases",
                  "scala-tools" at "https://oss.sonathype.org/content/groups/scala-tools")

libraryDependencies ++= Seq("org.scalatest"     %%  "scalatest"       % "2.2.1"   % "test",
                            "org.specs2"        %%  "specs2-core"     % "3.6.1"   % "test",
                            "org.scalacheck"    %%  "scalacheck"      % "1.12.4"  % "test")

scalacOptions in Test ++= Seq("-Yrangepos")

