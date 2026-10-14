package io.github.kotlinmania.libc.internal

import java.io.File

internal object LibcJni {
    init {
        var loaded = false
        try {
            System.loadLibrary("libc_jni")
            loaded = true
        } catch (_: UnsatisfiedLinkError) {
            // Library not in java.library.path
        }
        if (!loaded) {
            loadFallback()
        }
    }

    private fun loadFallback() {
        try {
            val osName = (System.getProperty("os.name") ?: "").lowercase()
            val isWindows = osName.contains("win")
            val isMac = osName.contains("mac") || osName.contains("darwin")
            val (libName, osInclude) =
                when {
                    isWindows -> "libc_jni.dll" to "win32"
                    isMac -> "liblibc_jni.dylib" to "darwin"
                    else -> "liblibc_jni.so" to "linux"
                }
            val localBuilt = File("build/natives", libName)
            if (localBuilt.exists()) {
                System.load(localBuilt.absolutePath)
                return
            }
            val tmpDir = File(System.getProperty("java.io.tmpdir") ?: "/tmp", "kotlinmania-libc-jni-0.1.4")
            val outFile = File(tmpDir, libName)
            if (!outFile.exists()) {
                tmpDir.mkdirs()
                val javaHome = System.getProperty("java.home") ?: System.getenv("JAVA_HOME") ?: ""
                val javaInclude = File(javaHome, "include")
                val javaOsInclude = File(javaInclude, osInclude)
                if (javaInclude.exists()) {
                    val cSource =
                        LibcJni::class.java
                            .getResourceAsStream("/io/github/kotlinmania/libc/native/libc_jni.c")
                            ?.bufferedReader()
                            ?.use { it.readText() }
                            ?: FALLBACK_JNI_C_SOURCE
                    val suffix = System.nanoTime()
                    val cFile = File(tmpDir, "libc_jni_$suffix.c")
                    val tmpOut = File(tmpDir, "$libName.$suffix.tmp")
                    cFile.writeText(cSource)
                    val cmd =
                        mutableListOf(
                            "clang",
                            "-shared",
                            "-O2",
                            "-I${javaInclude.absolutePath}",
                            "-I${javaOsInclude.absolutePath}",
                            cFile.absolutePath,
                            "-o",
                            tmpOut.absolutePath,
                        )
                    if (!isWindows) {
                        cmd.add(2, "-fPIC")
                    } else {
                        cmd.add("-lws2_32")
                    }
                    val proc = ProcessBuilder(cmd).redirectErrorStream(true).start()
                    proc.inputStream.bufferedReader().use { it.readText() }
                    val exitCode = proc.waitFor()
                    cFile.delete()
                    if (exitCode == 0 && tmpOut.exists()) {
                        if (!tmpOut.renameTo(outFile)) {
                            tmpOut.copyTo(outFile, overwrite = true)
                            tmpOut.delete()
                        }
                    } else {
                        tmpOut.delete()
                    }
                }
            }
            if (outFile.exists()) {
                System.load(outFile.absolutePath)
            }
        } catch (_: Throwable) {
            // Best-effort dynamic compilation fallback
        }
    }

    // --- Environment & Terminal ---

    @JvmStatic
    external fun getenv(name: String): String?

    @JvmStatic
    external fun setenv(name: String, value: String, overwrite: Int): Int

    @JvmStatic
    external fun unsetenv(name: String): Int

    @JvmStatic
    external fun putenv(string: String): Int

    @JvmStatic
    external fun putenvS(name: String, value: String): Int

    @JvmStatic
    external fun clearenv(): Int

    @JvmStatic
    external fun isatty(fd: Int): Int
}

private const val FALLBACK_JNI_C_SOURCE = """
#include <jni.h>
#include <stdint.h>
#include <stdlib.h>
#include <string.h>
#include <errno.h>

#ifndef _WIN32
#include <unistd.h>
#else
#define WIN32_LEAN_AND_MEAN
#include <windows.h>
#include <io.h>
#include <wchar.h>
#endif

JNIEXPORT jstring JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_getenv(
    JNIEnv* env, jclass clazz, jstring name) {
    (void)clazz;
    if (!name) return NULL;
    const char* cname = (*env)->GetStringUTFChars(env, name, NULL);
    if (!cname) return NULL;
    const char* val = getenv(cname);
    jstring result = val ? (*env)->NewStringUTF(env, val) : NULL;
    (*env)->ReleaseStringUTFChars(env, name, cname);
    return result;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_setenv(
    JNIEnv* env, jclass clazz, jstring name, jstring value, jint overwrite) {
    (void)clazz;
    if (!name || !value) {
        errno = EINVAL;
        return -1;
    }
    const char* cname = (*env)->GetStringUTFChars(env, name, NULL);
    if (!cname) return -1;
    const char* cval = (*env)->GetStringUTFChars(env, value, NULL);
    if (!cval) {
        (*env)->ReleaseStringUTFChars(env, name, cname);
        return -1;
    }
#ifndef _WIN32
    int res = setenv(cname, cval, (int)overwrite);
#else
    int res = -1;
    if (!*cname || strchr(cname, '=') != NULL) {
        errno = EINVAL;
    } else if (!overwrite && getenv(cname) != NULL) {
        res = 0;
    } else {
        res = _putenv_s(cname, cval) == 0 ? 0 : -1;
    }
#endif
    (*env)->ReleaseStringUTFChars(env, value, cval);
    (*env)->ReleaseStringUTFChars(env, name, cname);
    return (jint)res;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_unsetenv(
    JNIEnv* env, jclass clazz, jstring name) {
    (void)clazz;
    if (!name) {
        errno = EINVAL;
        return -1;
    }
    const char* cname = (*env)->GetStringUTFChars(env, name, NULL);
    if (!cname) return -1;
#ifndef _WIN32
    int res = unsetenv(cname);
#else
    int res = -1;
    if (!*cname || strchr(cname, '=') != NULL) {
        errno = EINVAL;
    } else {
        res = _putenv_s(cname, "") == 0 ? 0 : -1;
    }
#endif
    (*env)->ReleaseStringUTFChars(env, name, cname);
    return (jint)res;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_putenv(
    JNIEnv* env, jclass clazz, jstring string) {
    (void)clazz;
    if (!string) {
        errno = EINVAL;
        return -1;
    }
    const char* cstr = (*env)->GetStringUTFChars(env, string, NULL);
    if (!cstr) return -1;
#ifndef _WIN32
    int res = putenv(strdup(cstr));
#else
    int res = _putenv(_strdup(cstr));
#endif
    (*env)->ReleaseStringUTFChars(env, string, cstr);
    return (jint)res;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_putenvS(
    JNIEnv* env, jclass clazz, jstring name, jstring value) {
    (void)clazz;
    if (!name || !value) {
        errno = EINVAL;
        return EINVAL;
    }
    const char* cname = (*env)->GetStringUTFChars(env, name, NULL);
    if (!cname) return EINVAL;
    const char* cval = (*env)->GetStringUTFChars(env, value, NULL);
    if (!cval) {
        (*env)->ReleaseStringUTFChars(env, name, cname);
        return EINVAL;
    }
#ifdef _WIN32
    int res = (int)_putenv_s(cname, cval);
#else
    int res;
    if (cval[0] == '\0') {
        res = unsetenv(cname) == 0 ? 0 : errno;
    } else {
        res = setenv(cname, cval, 1) == 0 ? 0 : errno;
    }
#endif
    (*env)->ReleaseStringUTFChars(env, value, cval);
    (*env)->ReleaseStringUTFChars(env, name, cname);
    return (jint)res;
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_clearenv(
    JNIEnv* env, jclass clazz) {
    (void)env; (void)clazz;
#if defined(_WIN32)
    LPWCH envBlock = GetEnvironmentStringsW();
    if (!envBlock) return -1;
    LPWCH p = envBlock;
    while (*p) {
        size_t len = wcslen(p);
        if (p[0] != L'=') {
            wchar_t* eq = wcschr(p, L'=');
            if (eq) {
                size_t namelen = (size_t)(eq - p);
                wchar_t* name = (wchar_t*)malloc((namelen + 1) * sizeof(wchar_t));
                if (name) {
                    memcpy(name, p, namelen * sizeof(wchar_t));
                    name[namelen] = L'\0';
                    _wputenv_s(name, L"");
                    free(name);
                }
            }
        }
        p += len + 1;
    }
    FreeEnvironmentStringsW(envBlock);
    return 0;
#elif defined(__linux__) && !defined(__ANDROID__)
    return clearenv();
#else
    extern char **environ;
    if (!environ) return 0;
    while (environ[0] != NULL) {
        const char* entry = environ[0];
        const char* eq = strchr(entry, '=');
        if (eq != NULL && eq > entry) {
            size_t len = (size_t)(eq - entry);
            char* name = (char*)malloc(len + 1);
            if (!name) return -1;
            memcpy(name, entry, len);
            name[len] = '\0';
            unsetenv(name);
            free(name);
        } else {
            environ[0] = NULL;
            break;
        }
    }
    return 0;
#endif
}

JNIEXPORT jint JNICALL
Java_io_github_kotlinmania_libc_internal_LibcJni_isatty(
    JNIEnv* env, jclass clazz, jint fd) {
    (void)env; (void)clazz;
#ifndef _WIN32
    return (jint)isatty((int)fd);
#else
    return (jint)_isatty((int)fd);
#endif
}
"""
