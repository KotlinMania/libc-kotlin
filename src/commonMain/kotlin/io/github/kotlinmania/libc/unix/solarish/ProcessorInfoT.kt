// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public data class ProcessorInfoT(
    val piState: Int,
    val piProcessorType: ByteArray,
    val piFputypes: ByteArray,
    val piClock: Int,
)
