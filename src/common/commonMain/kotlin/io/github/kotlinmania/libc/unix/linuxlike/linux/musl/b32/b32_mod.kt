// port-lint: source unix/linux_like/linux/musl/b32/b32_mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl.b32

import io.github.kotlinmania.libc.*

public typealias NlinkT = UInt

public typealias BlksizeT = CLong

public typealias U64 = CUlonglong

public typealias S64 = CLonglong

public typealias RegoffT = CInt

public open class PthreadAttrT(public var size: List<UInt>)

public open class SigsetT(public var value: List<CUlong>)

public open class SemT(public var value: List<CInt>)

public val SIZEOF_PTHREAD_RWLOCK_T: Int = 32

public val SIZEOF_PTHREAD_MUTEX_T: Int = 24

public val SIZEOF_PTHREAD_BARRIER_T: Int = 20
