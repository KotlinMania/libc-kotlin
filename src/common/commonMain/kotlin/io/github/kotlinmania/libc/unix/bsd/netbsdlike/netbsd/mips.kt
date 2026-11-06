// port-lint: source unix/bsd/netbsdlike/netbsd/mips.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.PT_FIRSTMACH

public typealias CpuSimpleLockNvT = CInt

internal val ALIGNBYTES: Int = sizeOf<CLonglong>() - 1

public val PT_GETREGS: CInt = PT_FIRSTMACH + 1

public val PT_SETREGS: CInt = PT_FIRSTMACH + 2

public val PT_GETFPREGS: CInt = PT_FIRSTMACH + 3

public val PT_SETFPREGS: CInt = PT_FIRSTMACH + 4
