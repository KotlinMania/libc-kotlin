// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public data class Itimerspec(
    val itInterval: Timespec,
    val itValue: Timespec,
)
