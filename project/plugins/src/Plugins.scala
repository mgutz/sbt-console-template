import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
    lazy val eclipsify = "de.element34" % "sbt-eclipsify" % "0.5.0"
}

// vim: set ts=4 sw=4 et:
