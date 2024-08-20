pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "UniversityCenter"
include(":app")
include(":core")
include(":core:common")
include(":core:designsystem")
include(":core:navigation")
include(":core:networking")
include(":login")
include(":login:presentation")
include(":login:infrastructure")
include(":login:domain")
