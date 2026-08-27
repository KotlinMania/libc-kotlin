// port-lint: source libc/src/new/common/linux_like/pthread.rs
@file:OptIn(kotlinx.cinterop.ExperimentalForeignApi::class)

package io.github.kotlinmania.libc.new.common.linuxlike.pthread

import io.github.kotlinmania.libc.new.common.posix.pthread.PthreadAttrT
import io.github.kotlinmania.libc.new.common.posix.pthread.PthreadT
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.invoke
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toLong
import kotlinx.cinterop.usePinned
import platform.posix.dlsym

// K/N's posix.def for Linux does not enable _GNU_SOURCE, so glibc's *_np
// extensions are not declared by platform.posix.* — they ARE in libc.so but
// must be resolved at runtime via dlsym.

private val pthreadGetaffinityNpP: CPointer<CFunction<(ULong, ULong, COpaquePointer) -> Int>>? =
    dlsym(null, "pthread_getaffinity_np")?.reinterpret()

private val pthreadGetattrNpP: CPointer<CFunction<(ULong, COpaquePointer) -> Int>>? =
    dlsym(null, "pthread_getattr_np")?.reinterpret()

private val pthreadGetnameNpP: CPointer<CFunction<(ULong, COpaquePointer, ULong) -> Int>>? =
    dlsym(null, "pthread_getname_np")?.reinterpret()

private val pthreadSetaffinityNpP: CPointer<CFunction<(ULong, ULong, COpaquePointer) -> Int>>? =
    dlsym(null, "pthread_setaffinity_np")?.reinterpret()

private val pthreadSetnameNpP: CPointer<CFunction<(ULong, COpaquePointer) -> Int>>? =
    dlsym(null, "pthread_setname_np")?.reinterpret()

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT): Int =
    pthreadGetaffinityNpP?.invoke(thread.rawValue.toLong().toULong(), cpusetsize, cpuset.rawValue) ?: 38

public actual fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT): Int =
    pthreadGetattrNpP?.invoke(native.rawValue.toLong().toULong(), attr.rawValue) ?: 38

public actual fun pthreadGetnameNp(thread: PthreadT, name: ByteArray, len: ULong): Int {
    val p = pthreadGetnameNpP ?: return 38
    return name.usePinned { p.invoke(thread.rawValue.toLong().toULong(), it.addressOf(0).reinterpret(), len) }
}

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT): Int =
    pthreadSetaffinityNpP?.invoke(thread.rawValue.toLong().toULong(), cpusetsize, cpuset.rawValue) ?: 38

public actual fun pthreadSetnameNp(thread: PthreadT, name: String): Int {
    val p = pthreadSetnameNpP ?: return 38
    val bytes = name.encodeToByteArray() + 0.toByte()
    return bytes.usePinned { p.invoke(thread.rawValue.toLong().toULong(), it.addressOf(0).reinterpret()) }
}
