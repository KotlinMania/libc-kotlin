// port-lint: source unix/bsd/netbsdlike/netbsd/x86.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public typealias CpuSimpleLockNvT = CUChar

// _ALIGNBYTES = size_of::<c_int>() - 1
internal const val ALIGNBYTES: Int = 3
