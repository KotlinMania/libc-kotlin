// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class SchedParam(
    val schedPriority: Int,
    val schedSsLowPriority: Int,
    val schedSsReplPeriod: Timespec,
    val schedSsInitBudget: Timespec,
    val schedSsMaxRepl: Int,
)
