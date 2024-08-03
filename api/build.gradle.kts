dependencies {
    implementation(project(":presentation"))
    implementation(project(":infrastructure"))
}

tasks.bootJar {
    enabled = true
}

tasks.jar {
    enabled = false
}
