package io.github.kotlinmania.build;

import org.gradle.api.DefaultTask;
import org.gradle.api.file.DirectoryProperty;
import org.gradle.api.tasks.OutputDirectory;

/** Exposes compiled Android JNI payloads to the Android variant resource pipeline. */
public abstract class LibcAndroidJniTask extends DefaultTask {
    @OutputDirectory
    public abstract DirectoryProperty getNativeDirectory();
}
