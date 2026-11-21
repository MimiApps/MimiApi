plugins {
    kotlin("jvm")
}

dependencies {
    implementation(project(":application"))
    implementation(project(":infrastructure"))
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(25)
}

tasks.test {
    useJUnitPlatform()
}