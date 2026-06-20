// port-lint: source new/musl/sched.rs
package io.github.kotlinmania.libc.new.musl

import io.github.kotlinmania.libc.*

/**
 * Scheduling parameters (`sched_param`).
 *
 * On musl v1.2.3 only [schedPriority] is part of the public ABI; the remaining
 * members are reserved padding (a `CInt`, then — on `musl32_time64` targets — a
 * `[CLong; 4]`, otherwise two [SchedParamReserved2] entries, then a final
 * `CInt`). On earlier musl the struct instead carried the now-removed
 * `sched_ss_*` members.
 */
public data class SchedParam(
    val schedPriority: CInt,
)

internal data class SchedParamReserved2(
    val reserved1: TimeT,
    val reserved2: CLong,
)
