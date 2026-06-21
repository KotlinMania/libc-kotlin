// port-lint: source unix/linux_like/linux/musl/b32/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias NlinkT = UInt
public typealias BlksizeT = CLong
public typealias U64 = CULongLong
public typealias S64 = CLongLong
public typealias RegoffT = CInt

public data class PthreadAttrT(
    val size: UIntArray,
)

public data class SigsetT(
    val val: ULongArray,
)

public data class SemT(
    val val: IntArray,
)

public const val __SIZEOF_PTHREAD_RWLOCK_T: ULong = 32uL
public const val __SIZEOF_PTHREAD_MUTEX_T: ULong = 24uL
public const val __SIZEOF_PTHREAD_BARRIER_T: ULong = 20uL
