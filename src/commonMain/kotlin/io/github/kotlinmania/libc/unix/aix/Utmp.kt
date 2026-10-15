// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public data class Utmp(
    val utUser: ByteArray,
    val utId: ByteArray,
    val utLine: ByteArray,
    val utPid: Int,
    val utType: Short,
    val utTime: Long,
    val utExit: ExitStatus,
    val utHost: ByteArray,
    val dblWordPad: Int,
    val reservedA: IntArray,
    val reservedV: IntArray,
)
