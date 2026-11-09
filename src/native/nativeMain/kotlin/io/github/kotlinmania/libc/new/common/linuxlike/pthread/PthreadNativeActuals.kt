@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class, kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.common.linuxlike.pthread

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.PthreadT
import io.github.kotlinmania.libc.new.qurt.SizeT
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.common.linuxlike.pthread.cinterop.libc_new_common_linuxlike_pthread_pthreadGetaffinityNp(thread.toLong().toCPointer<ByteVar>(), cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetattrNp(native: PthreadT, attr: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.common.linuxlike.pthread.cinterop.libc_new_common_linuxlike_pthread_pthreadGetattrNp(native.toLong().toCPointer<ByteVar>(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    io.github.kotlinmania.libc.new.common.linuxlike.pthread.cinterop.libc_new_common_linuxlike_pthread_pthreadGetnameNp(thread.toLong().toCPointer<ByteVar>(), name?.value?.toCPointer<ByteVar>(), len)

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: COpaquePointer?): CInt =
    io.github.kotlinmania.libc.new.common.linuxlike.pthread.cinterop.libc_new_common_linuxlike_pthread_pthreadSetaffinityNp(thread.toLong().toCPointer<ByteVar>(), cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    io.github.kotlinmania.libc.new.common.linuxlike.pthread.cinterop.libc_new_common_linuxlike_pthread_pthreadSetnameNp(thread.toLong().toCPointer<ByteVar>(), name)
