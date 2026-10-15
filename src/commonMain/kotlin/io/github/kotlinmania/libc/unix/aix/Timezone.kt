// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class Timezone(
    val handle: Long = 0L,
    val tzMinuteswest: Int,
    val tzDsttime: Int,
)
