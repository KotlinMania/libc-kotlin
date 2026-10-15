// port-lint: source unix/linux_like/linux/gnu/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public data class CAnonymousPtraceSyscallInfoExit(
    val sval: Long,
    val isError: UByte,
)
