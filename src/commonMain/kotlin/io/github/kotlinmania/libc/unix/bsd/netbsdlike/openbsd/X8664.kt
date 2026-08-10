// port-lint: source unix/bsd/netbsdlike/openbsd/x86_64.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*


// Sigcontext is defined in Aarch64.kt (first definition in this package).

public data class Fxsave64(
    val fxFcw: UShort,
    val fxFsw: UShort,
    val fxFtw: UByte,
    val fxFop: UShort,
    val fxRip: ULong,
    val fxRdp: ULong,
    val fxMxcsr: UInt,
    val fxMxcsrMask: UInt,
    val fxSt: List<ULongArray>,
    val fxXmm: List<ULongArray>,
)

public const val PT_STEP: CInt = PT_FIRSTMACH + 0
public const val PT_GETREGS: CInt = PT_FIRSTMACH + 1
public const val PT_SETREGS: CInt = PT_FIRSTMACH + 2
public const val PT_GETFPREGS: CInt = PT_FIRSTMACH + 3
public const val PT_SETFPREGS: CInt = PT_FIRSTMACH + 4
