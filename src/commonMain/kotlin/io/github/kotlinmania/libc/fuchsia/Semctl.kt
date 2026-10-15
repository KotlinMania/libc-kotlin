// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun semctl(semid: Int, semnum: Int, cmd: Int, vararg args: Any?): Int
