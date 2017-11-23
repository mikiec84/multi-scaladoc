// See https://github.com/eed3si9n/sbt-assembly
addSbtPlugin("com.eed3si9n"                      % "sbt-assembly"      % "0.14.5")

// See https://github.com/sbt/sbt-buildinfo
addSbtPlugin("com.eed3si9n"                      % "sbt-buildinfo"     % "0.7.0")

// See https://github.com/sbt/sbt-bintray
addSbtPlugin("org.foundweekends"                 % "sbt-bintray"       % "0.5.1" exclude("org.slf4j", "slf4j-nop"))

// See https://github.com/ThoughtWorksInc/sbt-api-mappings
//addSbtPlugin("com.thoughtworks.sbt-api-mappings" % "sbt-api-mappings"  % "2.0.0")

libraryDependencies += "ch.qos.logback"          %  "logback-classic"  % "1.2.3"

// See https://stackoverflow.com/a/27858890/553865
evictionWarningOptions in update :=
  EvictionWarningOptions
    .default
    .withWarnTransitiveEvictions(false)
    .withWarnDirectEvictions(false)
    .withWarnScalaVersionEviction(false)

//logLevel in Global := Level.Debug
logBuffered in Global := false
