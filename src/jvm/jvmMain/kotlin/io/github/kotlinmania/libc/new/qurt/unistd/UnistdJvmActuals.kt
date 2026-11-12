@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.unistd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.OffT
import io.github.kotlinmania.libc.new.qurt.PidT
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.SsizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewQurtUnistdJniBridge {
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
        val stream = NewQurtUnistdJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcNewQurtUnistdAccess(pathname: Long, mode: Int): Int

    @JvmStatic
    external fun libcNewQurtUnistdClose(fd: Int): Int

    @JvmStatic
    external fun libcNewQurtUnistdLseek(fd: Int, offset: Long, whence: Int): Long

    @JvmStatic
    external fun libcNewQurtUnistdRead(fd: Int, buf: Long, count: Long): Int

    @JvmStatic
    external fun libcNewQurtUnistdWrite(fd: Int, buf: Long, count: Long): Int

    @JvmStatic
    external fun libcNewQurtUnistdFtruncate(fd: Int, length: Long): Int

    @JvmStatic
    external fun libcNewQurtUnistdUnlink(pathname: Long): Int

    @JvmStatic
    external fun libcNewQurtUnistdGetcwd(buf: Long, size: Long): Long

    @JvmStatic
    external fun libcNewQurtUnistdRmdir(pathname: Long): Int

    @JvmStatic
    external fun libcNewQurtUnistdGetpid(): Int

    @JvmStatic
    external fun libcNewQurtUnistdSleep(seconds: Int): Int

    @JvmStatic
    external fun libcNewQurtUnistdSysconf(name: Int): Long
}

public actual fun access(pathname: ConstPtr<CChar>, mode: CInt): CInt =
    NewQurtUnistdJniBridge.libcNewQurtUnistdAccess(pathname.rawAddress, mode)

public actual fun close(fd: CInt): CInt =
    NewQurtUnistdJniBridge.libcNewQurtUnistdClose(fd)

public actual fun lseek(fd: CInt, offset: OffT, whence: CInt): OffT =
    NewQurtUnistdJniBridge.libcNewQurtUnistdLseek(fd, offset, whence)

public actual fun read(fd: CInt, buf: MutPtr<CVoid>, count: SizeT): SsizeT =
    NewQurtUnistdJniBridge.libcNewQurtUnistdRead(fd, buf.rawAddress, count.toLong())

public actual fun write(fd: CInt, buf: ConstPtr<CVoid>, count: SizeT): SsizeT =
    NewQurtUnistdJniBridge.libcNewQurtUnistdWrite(fd, buf.rawAddress, count.toLong())

public actual fun ftruncate(fd: CInt, length: OffT): CInt =
    NewQurtUnistdJniBridge.libcNewQurtUnistdFtruncate(fd, length)

public actual fun unlink(pathname: ConstPtr<CChar>): CInt =
    NewQurtUnistdJniBridge.libcNewQurtUnistdUnlink(pathname.rawAddress)

public actual fun getcwd(buf: MutPtr<CChar>, size: SizeT): MutPtr<CChar> =
    MutPtr(NewQurtUnistdJniBridge.libcNewQurtUnistdGetcwd(buf.rawAddress, size.toLong()))

public actual fun rmdir(pathname: ConstPtr<CChar>): CInt =
    NewQurtUnistdJniBridge.libcNewQurtUnistdRmdir(pathname.rawAddress)

public actual fun getpid(): PidT =
    NewQurtUnistdJniBridge.libcNewQurtUnistdGetpid()

public actual fun sleep(seconds: CUint): CUint =
    NewQurtUnistdJniBridge.libcNewQurtUnistdSleep(seconds.toInt()).toUInt()

public actual fun sysconf(name: CInt): CLong =
    NewQurtUnistdJniBridge.libcNewQurtUnistdSysconf(name)
