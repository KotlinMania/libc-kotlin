// port-lint: source unix/bsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public data class Utsname(
    val handle: Long = 0L,
    val sysname: ByteArray = ByteArray(256),
    val sysname2: ByteArray = ByteArray(256),
    val nodename: ByteArray = ByteArray(256),
    val nodename2: ByteArray = ByteArray(256),
    val release: ByteArray = ByteArray(256),
    val release2: ByteArray = ByteArray(256),
    val version: ByteArray = ByteArray(256),
    val version2: ByteArray = ByteArray(256),
    val machine: ByteArray = ByteArray(256),
    val machine2: ByteArray = ByteArray(256),
)
