package io.github.kotlinmania.libc.new.nto.net

import io.github.kotlinmania.libc.unix.nto.BpfInsn

public actual fun bpfClass(code: UInt): UInt = code and 0x07u

public actual fun bpfSize(code: UInt): UInt = code and 0x18u

public actual fun bpfMode(code: UInt): UInt = code and 0xe0u

public actual fun bpfOp(code: UInt): UInt = code and 0xf0u

public actual fun bpfSrc(code: UInt): UInt = code and 0x08u

public actual fun bpfRval(code: UInt): UInt = code and 0x18u

public actual fun bpfMiscOp(code: UInt): UInt = code and 0xf8u

public actual fun bpfStmt(code: UShort, k: UInt): BpfInsn =
    BpfInsn(code = code, jt = 0.toUByte(), jf = 0.toUByte(), k = k)

public actual fun bpfJump(code: UShort, k: UInt, jt: UByte, jf: UByte): BpfInsn =
    BpfInsn(code = code, jt = jt, jf = jf, k = k)
