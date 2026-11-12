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
