plugins {
  `java-library`
  id("dev.yumi.gradle.licenser").version("2.1.1")
}

license {
  rule(rootProject.file("LICENSE.header"))
  include("**/*.java")
}

tasks.named("clean") {
  dependsOn("applyLicenses")
}

java {
  sourceCompatibility = JavaVersion.VERSION_25
  targetCompatibility = JavaVersion.VERSION_25

  withJavadocJar()
  withSourcesJar()
}