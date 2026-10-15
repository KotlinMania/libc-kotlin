package io.github.kotlinmania.libc.unix.linuxlike

import io.github.kotlinmania.libc.*

public data class Utsname(
    val handle: Long = 0L,
    val sysname: ByteArray = ByteArray(65),
    val nodename: ByteArray = ByteArray(65),
    val release: ByteArray = ByteArray(65),
    val version: ByteArray = ByteArray(65),
    val machine: ByteArray = ByteArray(65),
    val domainname: ByteArray = ByteArray(65),
)
