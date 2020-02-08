plugins {
  `java-library`
  `maven-publish`
}

base {
  archivesBaseName = "proj2-framework"
}

dependencies {
  api(project(":proj1:framework"))
}

publishing {
  publications {
    register<MavenPublication>("maven") {
      artifactId = "proj2-framework"
      from(components.getByName("java"))
    }
  }
}
