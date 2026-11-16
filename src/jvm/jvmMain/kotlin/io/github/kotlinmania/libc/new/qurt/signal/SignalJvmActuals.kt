@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.signal

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.PidT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewQurtSignalJniBridge {
    init {
        loadNativeLibrary()
    }

    private fun loadNativeLibrary() {
        val osRaw = System.getProperty("os.name", "").lowercase()
        val archRaw = System.getProperty("os.arch", "").lowercase()
        val hostPlatform =
            when {
                osRaw.contains("win") -> "windows"
                osRaw.contains("mac") || osRaw.contains("darwin") -> "macos"
                else -> "linux"
            }
        val hostArch =
            when {
                archRaw == "aarch64" || archRaw == "arm64" -> "aarch64"
                archRaw == "amd64" || archRaw == "x86_64" -> "x86_64"
                else -> archRaw
            }
        val libFileName =
            when (hostPlatform) {
                "windows" -> "libc_jni.dll"
                "macos" -> "liblibc_jni.dylib"
                else -> "liblibc_jni.so"
            }
        val pathSep = System.getProperty("path.separator", ":")
        val libPathProp = System.getProperty("java.library.path", "")
        for (dirEntry in libPathProp.split(pathSep)) {
            if (dirEntry.isEmpty()) continue
            val candidate = java.io.File(dirEntry, libFileName)
            if (candidate.isFile) {
                System.load(candidate.absolutePath)
                return
            }
        }
        val resourcePath = "io/github/kotlinmania/libc/native/$hostPlatform-$hostArch/$libFileName"
        val stream = NewQurtSignalJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
        if (stream != null) {
            val suffix = "." + libFileName.substringAfterLast('.')
            val extracted =
                java.nio.file.Files
                    .createTempFile("libc_jni-", suffix)
                    .toFile()
            extracted.deleteOnExit()
            stream.use { input ->
                extracted.outputStream().use { output ->
                    input.copyTo(output)
                }
            }
            System.load(extracted.absolutePath)
            return
        }
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libcNewQurtSignalSignal(sig: Int, handler: Long): Long

    @JvmStatic
    external fun libcNewQurtSignalKill(pid: Int, sig: Int): Int

    @JvmStatic
    external fun libcNewQurtSignalRaise(sig: Int): Int

    @JvmStatic
    external fun libcNewQurtSignalAlarm(seconds: Int): Int

    @JvmStatic
    external fun libcNewQurtSignalPause(): Int

    @JvmStatic
    external fun libcNewQurtSignalSigemptyset(set: Long): Int

    @JvmStatic
    external fun libcNewQurtSignalSigfillset(set: Long): Int

    @JvmStatic
    external fun libcNewQurtSignalSigaddset(set: Long, signum: Int): Int

    @JvmStatic
    external fun libcNewQurtSignalSigdelset(set: Long, signum: Int): Int

    @JvmStatic
    external fun libcNewQurtSignalSigismember(set: Long, signum: Int): Int

    @JvmStatic
    external fun libcNewQurtSignalSigprocmask(how: Int, set: Long, oldset: Long): Int

    @JvmStatic
    external fun libcNewQurtSignalSigpending(set: Long): Int

    @JvmStatic
    external fun libcNewQurtSignalSigsuspend(mask: Long): Int

    @JvmStatic
    external fun libcNewQurtSignalSigwait(set: Long, sig: Long): Int

    @JvmStatic
    external fun libcNewQurtSignalSigaction(sig: Int, act: Long, oact: Long): Int

    @JvmStatic
    external fun libcNewQurtSignalSigtimedwait(set: Long, info: Long, timeout: Long): Int
}

public actual fun signal(sig: CInt, handler: SighandlerT): SighandlerT =
    NewQurtSignalJniBridge.libcNewQurtSignalSignal(sig, handler.toLong()).toULong()

public actual fun kill(pid: PidT, sig: CInt): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalKill(pid, sig)

public actual fun raise(sig: CInt): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalRaise(sig)

public actual fun alarm(seconds: CUint): CUint =
    NewQurtSignalJniBridge.libcNewQurtSignalAlarm(seconds.toInt()).toUInt()

public actual fun pause(): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalPause()

public actual fun sigemptyset(set: MutPtr): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalSigemptyset(set.rawAddress)

public actual fun sigfillset(set: MutPtr): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalSigfillset(set.rawAddress)

public actual fun sigaddset(set: MutPtr, signum: CInt): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalSigaddset(set.rawAddress, signum)

public actual fun sigdelset(set: MutPtr, signum: CInt): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalSigdelset(set.rawAddress, signum)

public actual fun sigismember(set: ConstPtr, signum: CInt): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalSigismember(set.rawAddress, signum)

public actual fun sigprocmask(how: CInt, set: ConstPtr, oldset: MutPtr): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalSigprocmask(how, set.rawAddress, oldset.rawAddress)

public actual fun sigpending(set: MutPtr): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalSigpending(set.rawAddress)

public actual fun sigsuspend(mask: ConstPtr): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalSigsuspend(mask.rawAddress)

public actual fun sigwait(set: ConstPtr, sig: MutPtr): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalSigwait(set.rawAddress, sig.rawAddress)

public actual fun sigaction(sig: CInt, act: ConstPtr, oact: MutPtr): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalSigaction(sig, act.rawAddress, oact.rawAddress)

public actual fun sigtimedwait(set: ConstPtr, info: MutPtr, timeout: ConstPtr): CInt =
    NewQurtSignalJniBridge.libcNewQurtSignalSigtimedwait(set.rawAddress, info.rawAddress, timeout.rawAddress)
