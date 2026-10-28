package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class ProcessorSetBasicInfo(
    val processorCount: Int,
    val defaultPolicy: Int,
)
