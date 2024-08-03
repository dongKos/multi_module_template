dependencies {
    api(project(":domain"))
    api(project(":core"))
    implementation("org.springframework.data:spring-data-commons")
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}
