// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun kvmGetswapinfo(kd: io.github.kotlinmania.libc.COpaquePointer?, info: KvmSwap?, maxswap: Int, flags: Int): Int
