plugins {
    kotlin("jvm")
}

dependencies {
    implementation(project(":domain"))
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(25)
}

tasks.test {
    useJUnitPlatform()
}