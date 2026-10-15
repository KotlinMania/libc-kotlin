// port-lint: source unix/linux_like/linux/gnu/b64/x86_64/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu.b64.x8664

import io.github.kotlinmania.libc.*

public data class McontextT(
    val gregs: List<Long>,
    val fpregs: LibcFpstate?,
    val private: ULongArray,
)
