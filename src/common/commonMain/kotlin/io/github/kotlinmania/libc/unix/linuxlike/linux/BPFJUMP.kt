package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.SockFilter

public fun bpfJump(code: UShort, k: UInt, jt: UByte, jf: UByte): SockFilter = SockFilter(code = code, jt = jt, jf = jf, k = k)
