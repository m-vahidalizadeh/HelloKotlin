plugins {
    // Apply the Kotlin plugin for the JVM
    kotlin("jvm") version "1.9.22"

    // Apply the application plugin to add support for building a CLI application.
    application
}

// Define the main repository for fetching dependencies.
// mavenCentral() is a common choice for public libraries.
repositories {
    mavenCentral()
}

// Define the project's dependencies.
dependencies {
    // This is the crucial dependency for the Kotlin Standard Library.
    // It provides essential functions and types like ranges (1..5).
    implementation(kotlin("stdlib"))
}

// --- NEW SECTION TO SET THE JAVA VERSION ---
// This block configures the Kotlin plugin to use a specific JVM toolchain.
// Gradle will now use a JDK version 21 to compile and run your code.
kotlin {
    jvmToolchain(21)
}

// Configure the application plugin.
application {
    // Specify the fully qualified name of your main class.
    // The file Main.kt is compiled into a class named MainKt.
    mainClass.set("MainKt")
}