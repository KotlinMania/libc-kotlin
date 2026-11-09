@file:OptIn(kotlin.ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.new.qurt.sys.mman

import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.new.qurt.OffT
import io.github.kotlinmania.libc.new.qurt.SizeT

public actual fun mmap(addr: COpaquePointer?, len: SizeT, prot: CInt, flags: CInt, fd: CInt, offset: OffT): COpaquePointer? =
    null

public actual fun munmap(addr: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun mprotect(addr: COpaquePointer?, len: SizeT, prot: CInt): CInt =
    0

public actual fun mlock(addr: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun munlock(addr: COpaquePointer?, len: SizeT): CInt =
    0

public actual fun mlockall(flags: CInt): CInt =
    0

public actual fun munlockall(): CInt =
    0

public actual fun msync(addr: COpaquePointer?, len: SizeT, flags: CInt): CInt =
    0
