dependencies {
    implementation(project(":core"))
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}
