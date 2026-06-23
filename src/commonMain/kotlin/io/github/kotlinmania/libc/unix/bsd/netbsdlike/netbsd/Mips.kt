// port-lint: source unix/bsd/netbsdlike/netbsd/mips.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias CpuSimpleLockNvT = CInt

public const val PT_GETREGS: CInt = PT_FIRSTMACH + 1
public const val PT_SETREGS: CInt = PT_FIRSTMACH + 2
public const val PT_GETFPREGS: CInt = PT_FIRSTMACH + 3
public const val PT_SETFPREGS: CInt = PT_FIRSTMACH + 4
