@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.newlib.horizon

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CLong
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.SsizeT
import io.github.kotlinmania.libc.unix.newlib.ClockidT
import io.github.kotlinmania.libc.unix.newlib.PthreadAttrT
import io.github.kotlinmania.libc.unix.newlib.PthreadCondattrT
import io.github.kotlinmania.libc.unix.newlib.PthreadT
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixNewlibHorizonJniBridge {
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
        val stream = UnixNewlibHorizonJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcUnixNewlibHorizonPthreadCreate(native: Long, attr: Long, f: Long, value: Long): Int

    @JvmStatic
    external fun libcUnixNewlibHorizonPthreadAttrGetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixNewlibHorizonPthreadAttrSetschedparam(attr: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixNewlibHorizonPthreadAttrGetprocessoridNp(attr: Long, processorId: Long): Int

    @JvmStatic
    external fun libcUnixNewlibHorizonPthreadAttrSetprocessoridNp(attr: Long, processorId: Int): Int

    @JvmStatic
    external fun libcUnixNewlibHorizonPthreadGetschedparam(native: Long, policy: Long, param: Long): Int

    @JvmStatic
    external fun libcUnixNewlibHorizonPthreadSetschedparam(native: Long, policy: Int, param: Long): Int

    @JvmStatic
    external fun libcUnixNewlibHorizonPthreadCondattrGetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libcUnixNewlibHorizonPthreadCondattrSetclock(attr: Long, clockId: Long): Int

    @JvmStatic
    external fun libcUnixNewlibHorizonPthreadGetprocessoridNp(): Int

    @JvmStatic
    external fun libcUnixNewlibHorizonGetrandom(buf: Long, buflen: Long, flags: Int): Long

    @JvmStatic
    external fun libcUnixNewlibHorizonGethostid(): Long
}

public actual fun pthreadCreate(native: MutPtr<PthreadT>, attr: ConstPtr<PthreadAttrT>, f: PthreadCreateFCallback, value: MutPtr<CVoid>): CInt =
    UnixNewlibHorizonJniBridge.libcUnixNewlibHorizonPthreadCreate(native.rawAddress, attr.rawAddress, 0L, value.rawAddress)

public actual fun pthreadAttrGetschedparam(attr: ConstPtr<PthreadAttrT>, param: MutPtr<SchedParam>): CInt =
    UnixNewlibHorizonJniBridge.libcUnixNewlibHorizonPthreadAttrGetschedparam(attr.rawAddress, param.rawAddress)

public actual fun pthreadAttrSetschedparam(attr: MutPtr<PthreadAttrT>, param: ConstPtr<SchedParam>): CInt =
    UnixNewlibHorizonJniBridge.libcUnixNewlibHorizonPthreadAttrSetschedparam(attr.rawAddress, param.rawAddress)

public actual fun pthreadAttrGetprocessoridNp(attr: ConstPtr<PthreadAttrT>, processorId: MutPtr<CInt>): CInt =
    UnixNewlibHorizonJniBridge.libcUnixNewlibHorizonPthreadAttrGetprocessoridNp(attr.rawAddress, processorId.rawAddress)

public actual fun pthreadAttrSetprocessoridNp(attr: MutPtr<PthreadAttrT>, processorId: CInt): CInt =
    UnixNewlibHorizonJniBridge.libcUnixNewlibHorizonPthreadAttrSetprocessoridNp(attr.rawAddress, processorId)

public actual fun pthreadGetschedparam(native: PthreadT, policy: MutPtr<CInt>, param: MutPtr<SchedParam>): CInt =
    UnixNewlibHorizonJniBridge.libcUnixNewlibHorizonPthreadGetschedparam(native.toLong(), policy.rawAddress, param.rawAddress)

public actual fun pthreadSetschedparam(native: PthreadT, policy: CInt, param: ConstPtr<SchedParam>): CInt =
    UnixNewlibHorizonJniBridge.libcUnixNewlibHorizonPthreadSetschedparam(native.toLong(), policy, param.rawAddress)

public actual fun pthreadCondattrGetclock(attr: ConstPtr<PthreadCondattrT>, clockId: MutPtr<ClockidT>): CInt =
    UnixNewlibHorizonJniBridge.libcUnixNewlibHorizonPthreadCondattrGetclock(attr.rawAddress, clockId.rawAddress)

public actual fun pthreadCondattrSetclock(attr: MutPtr<PthreadCondattrT>, clockId: ClockidT): CInt =
    UnixNewlibHorizonJniBridge.libcUnixNewlibHorizonPthreadCondattrSetclock(attr.rawAddress, clockId.toLong())

public actual fun pthreadGetprocessoridNp(): CInt =
    UnixNewlibHorizonJniBridge.libcUnixNewlibHorizonPthreadGetprocessoridNp()

public actual fun getrandom(buf: MutPtr<CVoid>, buflen: SizeT, flags: CUint): SsizeT =
    UnixNewlibHorizonJniBridge.libcUnixNewlibHorizonGetrandom(buf.rawAddress, buflen.toLong(), flags.toInt())

public actual fun gethostid(): CLong =
    UnixNewlibHorizonJniBridge.libcUnixNewlibHorizonGethostid()
