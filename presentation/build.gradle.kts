dependencies {
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    implementation(project(":application"))
    implementation(project(":infrastructure"))
    implementation(project(":core"))
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}
