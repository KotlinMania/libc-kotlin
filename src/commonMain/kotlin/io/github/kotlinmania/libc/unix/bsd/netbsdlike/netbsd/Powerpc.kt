// port-lint: source unix/bsd/netbsdlike/netbsd/powerpc.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public typealias CpuSimpleLockNvT = CInt

public const val PT_STEP: CInt = PT_FIRSTMACH + 0
public const val PT_GETREGS: CInt = PT_FIRSTMACH + 1
public const val PT_SETREGS: CInt = PT_FIRSTMACH + 2
