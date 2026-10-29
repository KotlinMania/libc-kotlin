package io.github.kotlinmania.libc.unix.linuxlike

public data class Timezone(
    val handle: Long = 0L,
    val tzMinuteswest: Int,
    val tzDsttime: Int,
)
