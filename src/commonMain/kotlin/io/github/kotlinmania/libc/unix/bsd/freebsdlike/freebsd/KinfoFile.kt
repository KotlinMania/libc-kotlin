// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class KinfoFile(
    val kfStructsize: Int,
    val kfType: Int,
    val kfFd: Int,
    val kfRefCount: Int,
    val kfFlags: Int,
    val kfOffset: Long,
    val priv: UByteArray,
    val kfStatus: UShort,
    val kfIspare0: Int,
    val kfCapRights: CapRightsT,
    val kfCapSpare: ULong,
    val kfPath: ByteArray,
)
