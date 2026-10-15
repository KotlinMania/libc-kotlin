// port-lint: source unix/bsd/freebsdlike/freebsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public data class SctpErrorUnrecognizedChunk(
    val cause: SctpErrorCause,
    val ch: SctpChunkhdr,
)
