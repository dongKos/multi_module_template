dependencies {
    api(project(":presentation"))
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}
