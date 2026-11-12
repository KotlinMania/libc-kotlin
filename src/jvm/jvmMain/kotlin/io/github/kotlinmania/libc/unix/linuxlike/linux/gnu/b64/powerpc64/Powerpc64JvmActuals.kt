@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.powerpc64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixLinuxlikeLinuxGnuB64Powerpc64JniBridge {
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
        val stream = UnixLinuxlikeLinuxGnuB64Powerpc64JniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcUnixLinuxlikeLinuxGnuB64Powerpc64Sysctl(name: Long, namelen: Int, oldp: Long, oldlenp: Long, newp: Long, newlen: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuB64Powerpc64Getcontext(ucp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuB64Powerpc64Setcontext(ucp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuB64Powerpc64Swapcontext(oucp: Long, ucp: Long): Int

    @JvmStatic
    external fun libcUnixLinuxlikeLinuxGnuB64Powerpc64Makecontext(ucp: Long, func: Long, argc: Int, kmVac: Int, kmVa0: Long, kmVa1: Long, kmVa2: Long, kmVa3: Long)
}

public actual fun sysctl(name: MutPtr<CInt>, namelen: CInt, oldp: MutPtr<CVoid>, oldlenp: MutPtr<SizeT>, newp: MutPtr<CVoid>, newlen: SizeT): CInt =
    UnixLinuxlikeLinuxGnuB64Powerpc64JniBridge.libcUnixLinuxlikeLinuxGnuB64Powerpc64Sysctl(name.rawAddress, namelen, oldp.rawAddress, oldlenp.rawAddress, newp.rawAddress, newlen.toLong())

public actual fun getcontext(ucp: MutPtr<UcontextT>): CInt =
    UnixLinuxlikeLinuxGnuB64Powerpc64JniBridge.libcUnixLinuxlikeLinuxGnuB64Powerpc64Getcontext(ucp.rawAddress)

public actual fun setcontext(ucp: ConstPtr<UcontextT>): CInt =
    UnixLinuxlikeLinuxGnuB64Powerpc64JniBridge.libcUnixLinuxlikeLinuxGnuB64Powerpc64Setcontext(ucp.rawAddress)

public actual fun swapcontext(oucp: MutPtr<UcontextT>, ucp: ConstPtr<UcontextT>): CInt =
    UnixLinuxlikeLinuxGnuB64Powerpc64JniBridge.libcUnixLinuxlikeLinuxGnuB64Powerpc64Swapcontext(oucp.rawAddress, ucp.rawAddress)

public actual fun makecontext(ucp: MutPtr<UcontextT>, func: SigactionSaRestorerCallback, argc: CInt, vararg variadicArgs: Long) {
    UnixLinuxlikeLinuxGnuB64Powerpc64JniBridge.libcUnixLinuxlikeLinuxGnuB64Powerpc64Makecontext(ucp.rawAddress, 0L, argc, variadicArgs.size.coerceAtMost(4), if (variadicArgs.size > 0) variadicArgs[0] else 0L, if (variadicArgs.size > 1) variadicArgs[1] else 0L, if (variadicArgs.size > 2) variadicArgs[2] else 0L, if (variadicArgs.size > 3) variadicArgs[3] else 0L)
}
