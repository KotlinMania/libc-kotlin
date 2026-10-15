// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class Umutex(
    val mOwner: Int,
    val mFlags: UInt,
    val mCeilings: UIntArray,
    val mRbLink: ULong,
    val mSpare: UIntArray,
)
