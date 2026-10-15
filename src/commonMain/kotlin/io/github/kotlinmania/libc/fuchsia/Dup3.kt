// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun dup3(oldfd: Int, newfd: Int, flags: Int): Int
