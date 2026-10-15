// port-lint: source unix/linux_like/linux/gnu/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public expect fun prlimit64(pid: Int, resource: UInt, newLimit: Rlimit64?, oldLimit: Rlimit64?): Int
