// port-lint: source new/emscripten/sched.rs
package io.github.kotlinmania.libc.new.emscripten

import io.github.kotlinmania.libc.*
import kotlinx.cinterop.COpaquePointer

public data class SchedParam(
    val schedPriority: CInt,
)

public data class SchedParam(
    val schedPriority: CInt,
    val schedSsLowPriority: CInt,
    val schedSsReplPeriod: Timespec,
    val schedSsInitBudget: Timespec,
    val schedSsMaxRepl: CInt,
)
