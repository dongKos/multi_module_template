plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "demo"

include("presentation")
include("infrastructure")
include("domain")
include("application")
include("core")
include("api")
