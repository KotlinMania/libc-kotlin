@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.musl.sys.socket

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.CUint

private object NewMuslSysSocketJniBridge {
    init {
        System.loadLibrary("libc_jni")
    }

    @JvmStatic
    external fun libc_new_musl_sys_socket_sendmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int): Int

    @JvmStatic
    external fun libc_new_musl_sys_socket_recvmmsg(sockfd: Int, msgvec: Long, vlen: Int, flags: Int, timeout: Long): Int
}

public actual fun sendmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint): CInt =
    NewMuslSysSocketJniBridge.libc_new_musl_sys_socket_sendmmsg(sockfd, (msgvec?.value ?: 0L), vlen.toInt(), flags.toInt())

public actual fun recvmmsg(sockfd: CInt, msgvec: COpaquePointer?, vlen: CUint, flags: CUint, timeout: COpaquePointer?): CInt =
    NewMuslSysSocketJniBridge.libc_new_musl_sys_socket_recvmmsg(sockfd, (msgvec?.value ?: 0L), vlen.toInt(), flags.toInt(), (timeout?.value ?: 0L))
