dependencies {
    api(project(":domain"))
    implementation(project(":core"))
    implementation("org.springframework.data:spring-data-commons")
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}
