@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.bioniclibc.sys.socket

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUint
import io.github.kotlinmania.libc.new.qurt.SizeT
import io.github.kotlinmania.libc.new.qurt.SocklenT
import io.github.kotlinmania.libc.new.qurt.SsizeT
import io.github.kotlinmania.libc.new.qurt.Timespec
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.Mmsghdr
import io.github.kotlinmania.libc.unix.newlib.aarch64.Sockaddr
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object NewBioniclibcSysSocketJniBridge {
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
        val stream = NewBioniclibcSysSocketJniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcNewBioniclibcSysSocketRecvmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int, timeout: Long): Int

    @JvmStatic
    external fun libcNewBioniclibcSysSocketSendmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int): Int

    @JvmStatic
    external fun libcNewBioniclibcSysSocketRecvfrom(socket: Int, buf: Long, len: Long, flags: Int, addr: Long, addrlen: Long): Int
}

public actual fun recvmmsg(sockfd: CInt, msgvec: MutPtr<Mmsghdr>, vlen: CUint, flags: CInt, timeout: ConstPtr<Timespec>): CInt =
    NewBioniclibcSysSocketJniBridge.libcNewBioniclibcSysSocketRecvmmsg(sockfd, msgvec.rawAddress, vlen.toInt(), flags, timeout.rawAddress)

public actual fun sendmmsg(sockfd: CInt, msgvec: ConstPtr<Mmsghdr>, vlen: CUint, flags: CInt): CInt =
    NewBioniclibcSysSocketJniBridge.libcNewBioniclibcSysSocketSendmmsg(sockfd, msgvec.rawAddress, vlen.toInt(), flags)

public actual fun recvfrom(socket: CInt, buf: MutPtr<CVoid>, len: SizeT, flags: CInt, addr: MutPtr<Sockaddr>, addrlen: MutPtr<SocklenT>): SsizeT =
    NewBioniclibcSysSocketJniBridge.libcNewBioniclibcSysSocketRecvfrom(socket, buf.rawAddress, len.toLong(), flags, addr.rawAddress, addrlen.rawAddress)
