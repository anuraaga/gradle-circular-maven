plugins {
  `java-library`
  `maven-publish`
}

base {
  archivesBaseName = "proj1-framework"
}

dependencies {
  api("com.google.guava:guava:28-jre")
}

publishing {
  publications {
    register<MavenPublication>("maven") {
      artifactId = "proj1-framework"
      from(components.getByName("java"))
    }
  }
}
