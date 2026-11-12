@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd11

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge {
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
        val stream = UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd11Setgrent(): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd11Mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd11Freelocale(loc: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd11Msgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtyp: Long, msgflg: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd11Dirname(path: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd11Basename(path: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd11QsortR(base: Long, num: Long, size: Long, arg: Long, compar: Long)
}

public actual fun setgrent(): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd11Setgrent()

public actual fun mprotect(addr: ConstPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd11Mprotect(addr.rawAddress, len.toLong(), prot)

public actual fun freelocale(loc: LocaleT): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd11Freelocale(loc.rawAddress)

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd11Msgrcv(msqid, msgp.rawAddress, msgsz.toLong(), msgtyp, msgflg)

public actual fun dirname(path: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd11Dirname(path.rawAddress))

public actual fun basename(path: ConstPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd11Basename(path.rawAddress))

public actual fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, arg: MutPtr<CVoid>, compar: QsortRComparCallback?) {
    UnixBsdFreebsdlikeFreebsdFreebsd11JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd11QsortR(base.rawAddress, num.toLong(), size.toLong(), arg.rawAddress, 0L)
}
