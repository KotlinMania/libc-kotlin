// port-lint: source new/common/linux_like/pthread.rs
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

// Per ANDROID.md bucket classification:
//   pthread_getattr_np         Bucket 2 — present on bionic, not in K/N's
//                              posix.def for androidNative (no _GNU_SOURCE)
//   pthread_setname_np         Bucket 2 — same situation
//   pthread_getname_np         Bucket 2 — API 26+ in bionic
//   pthread_getaffinity_np     Bucket 2 — API 26+ in bionic
//   pthread_setaffinity_np     Bucket 2 — API 26+ in bionic

private val pthreadGetaffinityNpP: CPointer<CFunction<(Long, ULong, COpaquePointer) -> Int>>? =
    dlsym(null, "pthread_getaffinity_np")?.reinterpret()

private val pthreadGetattrNpP: CPointer<CFunction<(Long, COpaquePointer) -> Int>>? =
    dlsym(null, "pthread_getattr_np")?.reinterpret()

private val pthreadGetnameNpP: CPointer<CFunction<(Long, COpaquePointer, ULong) -> Int>>? =
    dlsym(null, "pthread_getname_np")?.reinterpret()

private val pthreadSetaffinityNpP: CPointer<CFunction<(Long, ULong, COpaquePointer) -> Int>>? =
    dlsym(null, "pthread_setaffinity_np")?.reinterpret()

private val pthreadSetnameNpP: CPointer<CFunction<(Long, COpaquePointer) -> Int>>? =
    dlsym(null, "pthread_setname_np")?.reinterpret()

public actual fun pthreadGetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT): Int =
    pthreadGetaffinityNpP?.invoke(thread.rawValue.toLong(), cpusetsize, cpuset.rawValue) ?: 38

public actual fun pthreadGetattrNp(native: PthreadT, attr: PthreadAttrT): Int =
    pthreadGetattrNpP?.invoke(native.rawValue.toLong(), attr.rawValue) ?: 38

public actual fun pthreadGetnameNp(thread: PthreadT, name: ByteArray, len: ULong): Int {
    val p = pthreadGetnameNpP ?: return 38
    return name.usePinned { p.invoke(thread.rawValue.toLong(), it.addressOf(0).reinterpret(), len) }
}

public actual fun pthreadSetaffinityNp(thread: PthreadT, cpusetsize: ULong, cpuset: CpuSetT): Int =
    pthreadSetaffinityNpP?.invoke(thread.rawValue.toLong(), cpusetsize, cpuset.rawValue) ?: 38

public actual fun pthreadSetnameNp(thread: PthreadT, name: String): Int {
    val p = pthreadSetnameNpP ?: return 38
    val bytes = name.encodeToByteArray() + 0.toByte()
    return bytes.usePinned { p.invoke(thread.rawValue.toLong(), it.addressOf(0).reinterpret()) }
}
