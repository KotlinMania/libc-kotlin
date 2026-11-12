@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.wasi.p2

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.wasi.SizeT
import io.github.kotlinmania.libc.wasi.SsizeT
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

private object WasiP2JniBridge {
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
        val stream = WasiP2JniBridge::class.java.classLoader?.getResourceAsStream(resourcePath)
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
    external fun libcWasiP2Socket(domain: Int, type: Int, protocol: Int): Int

    @JvmStatic
    external fun libcWasiP2Connect(fd: Int, name: Long, addrlen: Int): Int

    @JvmStatic
    external fun libcWasiP2Bind(socket: Int, addr: Long, addrlen: Int): Int

    @JvmStatic
    external fun libcWasiP2Listen(socket: Int, backlog: Int): Int

    @JvmStatic
    external fun libcWasiP2Accept(socket: Int, addr: Long, addrlen: Long): Int

    @JvmStatic
    external fun libcWasiP2Accept4(socket: Int, addr: Long, addrlen: Long, flags: Int): Int

    @JvmStatic
    external fun libcWasiP2Getsockname(socket: Int, addr: Long, addrlen: Long): Int

    @JvmStatic
    external fun libcWasiP2Getpeername(socket: Int, addr: Long, addrlen: Long): Int

    @JvmStatic
    external fun libcWasiP2Sendto(socket: Int, buffer: Long, length: Long, flags: Int, addr: Long, addrlen: Int): Long

    @JvmStatic
    external fun libcWasiP2Recvfrom(socket: Int, buffer: Long, length: Long, flags: Int, addr: Long, addrlen: Long): Long

    @JvmStatic
    external fun libcWasiP2Getsockopt(sockfd: Int, level: Int, optname: Int, optval: Long, optlen: Long): Int

    @JvmStatic
    external fun libcWasiP2Setsockopt(sockfd: Int, level: Int, optname: Int, optval: Long, optlen: Int): Int

    @JvmStatic
    external fun libcWasiP2Getaddrinfo(host: Long, serv: Long, hint: Long, res: Long): Int

    @JvmStatic
    external fun libcWasiP2Freeaddrinfo(p: Long)

    @JvmStatic
    external fun libcWasiP2GaiStrerror(ecode: Int): Long
}

public actual fun socket(domain: CInt, type: CInt, protocol: CInt): CInt =
    WasiP2JniBridge.libcWasiP2Socket(domain, type, protocol)

public actual fun connect(fd: CInt, name: ConstPtr, addrlen: SocklenT): CInt =
    WasiP2JniBridge.libcWasiP2Connect(fd, name.rawAddress, addrlen.toInt())

public actual fun bind(socket: CInt, addr: ConstPtr, addrlen: SocklenT): CInt =
    WasiP2JniBridge.libcWasiP2Bind(socket, addr.rawAddress, addrlen.toInt())

public actual fun listen(socket: CInt, backlog: CInt): CInt =
    WasiP2JniBridge.libcWasiP2Listen(socket, backlog)

public actual fun accept(socket: CInt, addr: MutPtr, addrlen: MutPtr): CInt =
    WasiP2JniBridge.libcWasiP2Accept(socket, addr.rawAddress, addrlen.rawAddress)

public actual fun accept4(socket: CInt, addr: MutPtr, addrlen: MutPtr, flags: CInt): CInt =
    WasiP2JniBridge.libcWasiP2Accept4(socket, addr.rawAddress, addrlen.rawAddress, flags)

public actual fun getsockname(socket: CInt, addr: MutPtr, addrlen: MutPtr): CInt =
    WasiP2JniBridge.libcWasiP2Getsockname(socket, addr.rawAddress, addrlen.rawAddress)

public actual fun getpeername(socket: CInt, addr: MutPtr, addrlen: MutPtr): CInt =
    WasiP2JniBridge.libcWasiP2Getpeername(socket, addr.rawAddress, addrlen.rawAddress)

public actual fun sendto(socket: CInt, buffer: ConstPtr, length: SizeT, flags: CInt, addr: ConstPtr, addrlen: SocklenT): SsizeT =
    WasiP2JniBridge.libcWasiP2Sendto(socket, buffer.rawAddress, length.toLong(), flags, addr.rawAddress, addrlen.toInt())

public actual fun recvfrom(socket: CInt, buffer: MutPtr, length: SizeT, flags: CInt, addr: MutPtr, addrlen: MutPtr): SsizeT =
    WasiP2JniBridge.libcWasiP2Recvfrom(socket, buffer.rawAddress, length.toLong(), flags, addr.rawAddress, addrlen.rawAddress)

public actual fun getsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: MutPtr, optlen: MutPtr): CInt =
    WasiP2JniBridge.libcWasiP2Getsockopt(sockfd, level, optname, optval.rawAddress, optlen.rawAddress)

public actual fun setsockopt(sockfd: CInt, level: CInt, optname: CInt, optval: ConstPtr, optlen: SocklenT): CInt =
    WasiP2JniBridge.libcWasiP2Setsockopt(sockfd, level, optname, optval.rawAddress, optlen.toInt())

public actual fun getaddrinfo(host: ConstPtr, serv: ConstPtr, hint: ConstPtr, res: MutPtr): CInt =
    WasiP2JniBridge.libcWasiP2Getaddrinfo(host.rawAddress, serv.rawAddress, hint.rawAddress, res.rawAddress)

public actual fun freeaddrinfo(p: MutPtr) {
    WasiP2JniBridge.libcWasiP2Freeaddrinfo(p.rawAddress)
}

public actual fun gaiStrerror(ecode: CInt): ConstPtr =
    ConstPtr(WasiP2JniBridge.libcWasiP2GaiStrerror(ecode))
