import java.io.File
import sbt.Keys._
import sbt._

object Common {

  def commonSettings(module: String, org: String) = Seq(
    name := module,
    organization := org,
    version := "1.0",
    //publishArtifact in (Compile, packageDoc) := false,
    //publishArtifact in packageDoc := false,
    // ScalaTest's built-in event buffering algorithm, which shows the events of one suite as they occur until that
    // suite either completes or a timeout occurs
    //logBuffered in Test := false,
    //sources in (Compile, doc) := Seq.empty,
    //testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-l", "org.scalatest.tags.Ignore"),
    //turbo := true,
    //addCompilerPlugin(scalafixSemanticdb)
  )

  // Rename so we dont inappropriately shadow the default IntegrationTest config
  //val IntTest = config("it") extend Test

  //lazy val GatlingTest = config("gatling") extend Test

  lazy val sharedConfFilesReplicator = taskKey[Seq[File]]("Replicate shared.*.conf files.")

  def sharedConfFilesReplicate(rootDir: File, managedDir: File, log: Logger): Seq[File] = {
    val files = ((rootDir / "conf") ** "shared.*.conf").get
    val destinationDir = managedDir / "conf"
    destinationDir.mkdirs()
    files.map { file =>
      val destinationFile = destinationDir / file.getName()
      IO.copyFile(file, destinationFile)
      file
    }
  }

}
