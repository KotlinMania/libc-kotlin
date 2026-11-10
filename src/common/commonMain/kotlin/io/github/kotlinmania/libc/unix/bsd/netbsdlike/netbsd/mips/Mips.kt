// port-lint: source unix/bsd/netbsdlike/netbsd/mips.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.mips

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.PT_FIRSTMACH

public typealias CpuSimpleLockNvT = CInt

public val PT_GETREGS: CInt = PT_FIRSTMACH + 1

public val PT_SETREGS: CInt = PT_FIRSTMACH + 2

public val PT_GETFPREGS: CInt = PT_FIRSTMACH + 3

public val PT_SETFPREGS: CInt = PT_FIRSTMACH + 4

internal val ALIGNBYTES: Int = 8 - 1
