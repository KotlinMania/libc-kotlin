@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.common.linuxlike

import io.github.kotlinmania.libc.COpaquePointer
import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.toCPointer
import io.github.kotlinmania.libc.*
import kotlinx.cinterop.*

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    libc.cinterop.libc_pthread_pthread_getaffinity_np(thread.toInt(), cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT?): CInt =
    libc.cinterop.libc_pthread_pthread_getattr_np(native.toInt(), attr?.value?.toCPointer<ByteVar>())

public actual fun pthreadGetnameNp(thread: PthreadT, name: COpaquePointer?, len: SizeT): CInt =
    libc.cinterop.libc_pthread_pthread_getname_np(thread.toInt(), name?.value?.toCPointer<ByteVar>(), len)

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: SizeT, cpuset: CpuSetT?): CInt =
    libc.cinterop.libc_pthread_pthread_setaffinity_np(thread.toInt(), cpusetsize, cpuset?.value?.toCPointer<ByteVar>())

public actual fun pthreadSetnameNp(thread: PthreadT, name: String?): CInt =
    libc.cinterop.libc_pthread_pthread_setname_np(thread.toInt(), name)
