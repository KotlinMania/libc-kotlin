package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class SaUT(
    val saHandler: TerminatingSignalHandler? = null,
    val saSigaction: TerminatingSignalAction? = null,
)
