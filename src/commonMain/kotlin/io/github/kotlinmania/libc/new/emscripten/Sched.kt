// port-lint: source new/emscripten/sched.rs
package io.github.kotlinmania.libc.new.emscripten

import io.github.kotlinmania.libc.*

/**
 * Scheduling parameters (`sched_param`).
 *
 * On musl v1.2.3 only [schedPriority] is public; the rest is reserved padding
 * (a `CInt`, then a `[CLong; 4]` on `musl32_time64` or two [SchedParamReserved2]
 * entries otherwise, then a final `CInt`). On earlier musl the struct carried
 * the now-removed `sched_ss_*` members.
 */
public data class SchedParam(
    val schedPriority: CInt,
)

internal data class SchedParamReserved2(
    val reserved1: TimeT,
    val reserved2: CLong,
)
