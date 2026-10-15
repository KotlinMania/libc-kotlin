// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class RusageExt(
    val ruxRuntime: ULong,
    val ruxUticks: ULong,
    val ruxSticks: ULong,
    val ruxIticks: ULong,
    val ruxUu: ULong,
    val ruxSu: ULong,
    val ruxTu: ULong,
)
