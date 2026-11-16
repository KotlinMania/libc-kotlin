// port-lint: source unix/bsd/netbsdlike/netbsd/x86.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.x86

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.CUchar
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.sizeOf

public typealias CpuSimpleLockNvT = CUchar

internal val ALIGNBYTES: Int = sizeOf<CInt>(typeLayoutT = PrimitiveLayouts.I32) - 1
