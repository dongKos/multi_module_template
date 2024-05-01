dependencies {
    api(project(":presentation"))
//    api(project(":infrastructure"))
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}
