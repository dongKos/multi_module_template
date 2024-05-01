dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-r2dbc")
    implementation("com.github.jasync-sql:jasync-r2dbc-mysql:2.2.4")
    implementation("io.r2dbc:r2dbc-proxy:1.0.0.RELEASE")
    api("mysql:mysql-connector-java:8.0.33")

    implementation(project(":application"))
    implementation(project(":domain"))
    implementation(project(":core"))

    // Flyway
    implementation("org.flywaydb:flyway-core")
    implementation("org.flywaydb:flyway-mysql")
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}
