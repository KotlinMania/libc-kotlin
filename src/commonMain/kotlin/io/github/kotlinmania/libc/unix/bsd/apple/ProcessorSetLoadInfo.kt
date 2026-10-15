// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public data class ProcessorSetLoadInfo(
    val taskCount: Int,
    val threadCount: Int,
    val loadAverage: Int,
    val machFactor: Int,
)
