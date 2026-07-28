// port-lint: source unix/bsd/freebsdlike/freebsd/powerpc64.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*


    val mcVers: CInt,
    val mcFlags: CInt,
    val mcOnstack: CInt,
    val mcLen: CInt,
    val mcAvec: ULongArray,
    val mcAv: UIntArray,
    val mcFrame: List<RegisterT>,
    val mcFpreg: ULongArray,
    val mcVsxfpreg: ULongArray,
)

