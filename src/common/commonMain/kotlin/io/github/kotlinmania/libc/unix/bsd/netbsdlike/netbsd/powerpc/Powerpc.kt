// port-lint: source unix/bsd/netbsdlike/netbsd/powerpc.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.powerpc

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.PT_FIRSTMACH

public typealias CpuSimpleLockNvT = CInt

public val PT_STEP: CInt = PT_FIRSTMACH + 0

public val PT_GETREGS: CInt = PT_FIRSTMACH + 1

public val PT_SETREGS: CInt = PT_FIRSTMACH + 2

internal val ALIGNBYTES: Int = 8 - 1
