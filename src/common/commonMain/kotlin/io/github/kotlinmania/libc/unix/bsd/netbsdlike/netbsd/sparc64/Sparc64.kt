// port-lint: source unix/bsd/netbsdlike/netbsd/sparc64.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.sparc64

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CUchar

public typealias CpuSimpleLockNvT = CUchar

// should be pub(crate), but that requires Rust 1.18.0
public val ALIGNBYTES: Int = 0xf
