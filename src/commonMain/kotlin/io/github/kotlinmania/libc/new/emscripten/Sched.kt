// port-lint: source libc/src/new/emscripten/sched.rs
package io.github.kotlinmania.libc.new.emscripten

import io.github.kotlinmania.libc.*

public data class SchedParam(
    val schedPriority: CInt,
)
