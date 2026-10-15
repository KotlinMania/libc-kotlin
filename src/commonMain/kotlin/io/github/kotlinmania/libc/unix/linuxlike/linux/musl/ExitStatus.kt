// port-lint: source unix/linux_like/linux/musl/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.musl

import io.github.kotlinmania.libc.*

public data class ExitStatus(
    val eTermination: Short,
    val eExit: Short,
)
