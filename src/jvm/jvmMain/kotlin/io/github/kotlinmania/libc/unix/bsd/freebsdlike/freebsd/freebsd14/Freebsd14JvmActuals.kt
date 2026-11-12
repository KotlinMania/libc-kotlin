@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.unix.LocaleT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.IdT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.KvmT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpulevelT
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.CpuwhichT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixBsdFreebsdlikeFreebsdFreebsd14JniBridge {
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
        val stream = UnixBsdFreebsdlikeFreebsdFreebsd14JniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd14Setgrent()

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd14Mprotect(addr: Long, len: Long, prot: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd14Freelocale(loc: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd14Msgrcv(msqid: Int, msgp: Long, msgsz: Long, msgtyp: Long, msgflg: Int): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd14CpusetGetdomain(level: Int, which: Int, id: Long, setsize: Long, mask: Long, policy: Long): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd14CpusetSetdomain(level: Int, which: Int, id: Long, setsize: Long, mask: Long, policy: Int): Int

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd14Dirname(path: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd14Basename(path: Long): Long

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd14QsortR(base: Long, num: Long, size: Long, compar: Long, arg: Long)

    @JvmStatic
    external fun libcUnixBsdFreebsdlikeFreebsdFreebsd14KvmKerndisp(kd: Long): Long
}

public actual fun setgrent() {
    UnixBsdFreebsdlikeFreebsdFreebsd14JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd14Setgrent()
}

public actual fun mprotect(addr: MutPtr<CVoid>, len: SizeT, prot: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd14JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd14Mprotect(addr.rawAddress, len.toLong(), prot)

public actual fun freelocale(loc: LocaleT) {
    UnixBsdFreebsdlikeFreebsdFreebsd14JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd14Freelocale(loc.rawAddress)
}

public actual fun msgrcv(msqid: CInt, msgp: MutPtr<CVoid>, msgsz: SizeT, msgtyp: CLong, msgflg: CInt): SsizeT =
    UnixBsdFreebsdlikeFreebsdFreebsd14JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd14Msgrcv(msqid, msgp.rawAddress, msgsz.toLong(), msgtyp, msgflg)

public actual fun cpusetGetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: MutPtr<DomainsetT>, policy: MutPtr<CInt>): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd14JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd14CpusetGetdomain(level, which, id, setsize.toLong(), mask.rawAddress, policy.rawAddress)

public actual fun cpusetSetdomain(level: CpulevelT, which: CpuwhichT, id: IdT, setsize: SizeT, mask: ConstPtr<DomainsetT>, policy: CInt): CInt =
    UnixBsdFreebsdlikeFreebsdFreebsd14JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd14CpusetSetdomain(level, which, id, setsize.toLong(), mask.rawAddress, policy)

public actual fun dirname(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixBsdFreebsdlikeFreebsdFreebsd14JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd14Dirname(path.rawAddress))

public actual fun basename(path: MutPtr<CChar>): MutPtr<CChar> =
    MutPtr(UnixBsdFreebsdlikeFreebsdFreebsd14JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd14Basename(path.rawAddress))

public actual fun qsortR(base: MutPtr<CVoid>, num: SizeT, size: SizeT, compar: QsortRComparCallback?, arg: MutPtr<CVoid>) {
    UnixBsdFreebsdlikeFreebsdFreebsd14JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd14QsortR(base.rawAddress, num.toLong(), size.toLong(), 0L, arg.rawAddress)
}

public actual fun kvmKerndisp(kd: MutPtr<KvmT>): KssizeT =
    UnixBsdFreebsdlikeFreebsdFreebsd14JniBridge.libcUnixBsdFreebsdlikeFreebsdFreebsd14KvmKerndisp(kd.rawAddress)
