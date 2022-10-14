plugins {
    id("com.android.application") version "7.3.0" apply false
    id("com.android.library") version "7.3.0" apply false
    id("org.jetbrains.kotlin.android") version "1.6.10" apply false
}

tasks.register("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}

gradle.taskGraph.whenReady {
    allTasks.forEach { task ->
        if (task.name.contains("lint")) {
            task.enabled = false
            logger.log(LogLevel.WARN, "${task.name} has been disabled")
        }
    }
}
