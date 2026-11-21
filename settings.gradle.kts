plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
rootProject.name = "mimi"

dependencyResolutionManagement {
    repositories { mavenCentral() }
}

include(":domain", ":application", ":infrastructure", ":api")