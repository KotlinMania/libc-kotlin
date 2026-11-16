package io.github.kotlinmania.libc.unix.linuxlike.android.b32.x86

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.linuxlike.android.syscall
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

public fun accept4(fd: CInt, addr: MutPtr, len: MutPtr, flg: CInt): CInt {
    // Arguments are passed as array of `long int`
    // (which is big enough on x86 for a pointer).
    val args = listOf(fd.toLong(), addr.rawAddress, len.rawAddress, flg.toLong())
    val argsBuf =
        io.github.kotlinmania.rustlang.core.mem
            .AddressableArrayLocal(args, io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64)
    val rc = syscall(SYS_SOCKETCALL, SYS_ACCEPT41.toLong(), argsBuf.rawAddress).toInt()
    io.github.kotlinmania.rustlang.core.intrinsics
        .kmDealloc(argsBuf.rawAddress, maxOf(1L, argsBuf.layout.sizeBytes), 8L)
    return rc
}
