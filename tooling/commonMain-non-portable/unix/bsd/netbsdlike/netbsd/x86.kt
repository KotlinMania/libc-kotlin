// port-lint: source unix/bsd/netbsdlike/netbsd/x86.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public typealias CpuSimpleLockNvT = CUchar

internal val ALIGNBYTES: Int = sizeOf<CInt>() - 1
