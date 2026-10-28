package io.github.kotlinmania.libc.unix.bsd

public data class Utsname(
    val handle: Long = 0L,
    val sysname: ByteArray = ByteArray(256),
    val nodename: ByteArray = ByteArray(256),
    val release: ByteArray = ByteArray(256),
    val version: ByteArray = ByteArray(256),
    val machine: ByteArray = ByteArray(256),
)
