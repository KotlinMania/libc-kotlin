package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public data class Seminfo(
    val semmap: Int,
    val semmni: Int,
    val semmns: Int,
    val semmnu: Int,
    val semmsl: Int,
    val semopm: Int,
    val semume: Int,
    val semusz: Int,
    val semvmx: Int,
    val semaem: Int,
)
