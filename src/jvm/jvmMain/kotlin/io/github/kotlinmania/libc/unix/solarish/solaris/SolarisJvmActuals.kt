@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.unix.solarish.solaris

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.unix.PidT
import io.github.kotlinmania.libc.unix.SizeT
import io.github.kotlinmania.libc.unix.Winsize
import io.github.kotlinmania.libc.unix.solarish.PthreadAttrT
import io.github.kotlinmania.libc.unix.solarish.PthreadT
import io.github.kotlinmania.libc.unix.solarish.Termios
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object UnixSolarishSolarisJniBridge {
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
        val stream = UnixSolarishSolarisJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcUnixSolarishSolarisFexecve(fd: Int, argv: Long, envp: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSolarisMincore(addr: Long, len: Long, vec: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSolarisDoorCall(d: Int, params: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSolarisDoorReturn(dataPtr: Long, dataSize: Long, descPtr: Long, numDesc: Int): Int

    @JvmStatic
    external fun libcUnixSolarishSolarisDoorCreate(serverProcedure: Long, cookie: Long, attributes: Int): Int

    @JvmStatic
    external fun libcUnixSolarishSolarisFattach(fildes: Int, path: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSolarisPthreadGetattrNp(thread: Long, attr: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSolarisEuidaccess(path: Long, amode: Int): Int

    @JvmStatic
    external fun libcUnixSolarishSolarisOpenpty(amain: Long, asubord: Long, name: Long, termp: Long, winp: Long): Int

    @JvmStatic
    external fun libcUnixSolarishSolarisForkpty(amain: Long, name: Long, termp: Long, winp: Long): Int
}

public actual fun fexecve(fd: CInt, argv: ConstPtr<ConstPtr<CChar>>, envp: ConstPtr<ConstPtr<CChar>>): CInt =
    UnixSolarishSolarisJniBridge.libcUnixSolarishSolarisFexecve(fd, argv.rawAddress, envp.rawAddress)

public actual fun mincore(addr: MutPtr<CVoid>, len: SizeT, vec: MutPtr<CChar>): CInt =
    UnixSolarishSolarisJniBridge.libcUnixSolarishSolarisMincore(addr.rawAddress, len.toLong(), vec.rawAddress)

public actual fun doorCall(d: CInt, params: MutPtr<DoorArgT>): CInt =
    UnixSolarishSolarisJniBridge.libcUnixSolarishSolarisDoorCall(d, params.rawAddress)

public actual fun doorReturn(dataPtr: MutPtr<CChar>, dataSize: SizeT, descPtr: MutPtr<DoorDescT>, numDesc: CUint): CInt =
    UnixSolarishSolarisJniBridge.libcUnixSolarishSolarisDoorReturn(dataPtr.rawAddress, dataSize.toLong(), descPtr.rawAddress, numDesc.toInt())

public actual fun doorCreate(serverProcedure: DoorCreateServerProcedureCallback, cookie: MutPtr<CVoid>, attributes: DoorAttrT): CInt =
    UnixSolarishSolarisJniBridge.libcUnixSolarishSolarisDoorCreate(0L, cookie.rawAddress, attributes.toInt())

public actual fun fattach(fildes: CInt, path: ConstPtr<CChar>): CInt =
    UnixSolarishSolarisJniBridge.libcUnixSolarishSolarisFattach(fildes, path.rawAddress)

public actual fun pthreadGetattrNp(thread: PthreadT, attr: MutPtr<PthreadAttrT>): CInt =
    UnixSolarishSolarisJniBridge.libcUnixSolarishSolarisPthreadGetattrNp(thread.toLong(), attr.rawAddress)

public actual fun euidaccess(path: ConstPtr<CChar>, amode: CInt): CInt =
    UnixSolarishSolarisJniBridge.libcUnixSolarishSolarisEuidaccess(path.rawAddress, amode)

public actual fun openpty(amain: MutPtr<CInt>, asubord: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): CInt =
    UnixSolarishSolarisJniBridge.libcUnixSolarishSolarisOpenpty(amain.rawAddress, asubord.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)

public actual fun forkpty(amain: MutPtr<CInt>, name: MutPtr<CChar>, termp: MutPtr<Termios>, winp: MutPtr<Winsize>): PidT =
    UnixSolarishSolarisJniBridge.libcUnixSolarishSolarisForkpty(amain.rawAddress, name.rawAddress, termp.rawAddress, winp.rawAddress)
