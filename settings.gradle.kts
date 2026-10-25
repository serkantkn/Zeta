// The public repository: ZetaHubKit and its example. Zeta itself is closed source.
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ZetaHubKit"
include(":hubkit-protocol", ":hubkit", ":hubkit-sample")
project(":hubkit-protocol").projectDir = file("hubkit/protocol")
project(":hubkit").projectDir = file("hubkit/kit")
project(":hubkit-sample").projectDir = file("hubkit/sample")
