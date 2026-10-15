// port-lint: source unix/linux_like/linux/gnu/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public data class Ntptimeval(
    val time: Timeval,
    val maxerror: Long,
    val esterror: Long,
    val tai: Long,
    val glibcReserved1: Long,
    val glibcReserved2: Long,
    val glibcReserved3: Long,
    val glibcReserved4: Long,
)
