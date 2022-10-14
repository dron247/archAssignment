package org.dementiev.archassignment.gradle.dependencies

import org.gradle.kotlin.dsl.DependencyHandlerScope

sealed class DependencyRecord(
    val configuration: String,
    val dependencyNotation: String
) {
    class ImplementationDependencyRecord(notation: String) : DependencyRecord(
        "implementation",
        notation
    )

    class TestDependencyRecord(notation: String) : DependencyRecord(
        "testImplementation",
        notation
    )

    class AndroidTestDependencyRecord(notation: String) : DependencyRecord(
        "androidTestImplementation",
        notation
    )

    class DebugDependencyRecord(notation: String) : DependencyRecord(
        "debugImplementation",
        notation
    )
}

val String.toImpl: DependencyRecord
    get() = DependencyRecord.ImplementationDependencyRecord(this)

val String.toTestImpl: DependencyRecord
    get() = DependencyRecord.TestDependencyRecord(this)

val String.toAndroidTestImpl: DependencyRecord
    get() = DependencyRecord.AndroidTestDependencyRecord(this)

val String.toDebugImpl: DependencyRecord
    get() = DependencyRecord.DebugDependencyRecord(this)

fun DependencyHandlerScope.dependency(dep: DependencyRecord) {
    add(dep.configuration, dep.dependencyNotation)
}
