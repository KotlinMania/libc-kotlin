// port-lint: source new/musl/sched.rs
package io.github.kotlinmania.libc.new.musl

import io.github.kotlinmania.libc.*

public data class SchedParam(
    val schedPriority: CInt,
)