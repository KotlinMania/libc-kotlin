// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class AioResultT(
    val aioReturn: Long,
    val aioErrno: Int,
)
