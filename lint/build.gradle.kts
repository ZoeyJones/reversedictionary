plugins {
    id("kotlin")
    id("java-library")
}

dependencies {
    compileOnly(kotlin("stdlib", "1.3.72"))

    compileOnly("com.android.tools.lint:lint-api:27.0.0")
    compileOnly("com.android.tools.lint:lint-checks:27.0.0")

    testImplementation("junit:junit:4.13")
    testImplementation("com.android.tools.lint:lint:27.0.0")
    testImplementation("com.android.tools.lint:lint-tests:27.0.0")
    testImplementation("com.android.tools:testutils:27.0.0")
}

tasks.jar {
    manifest {
        attributes(
            "Lint-Registry-v2" to "com.gscanlon21.lint.LintRegistry"
        )
    }
}