// port-lint: source unix/haiku/mod.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun semctl(semid: Int, semnum: Int, cmd: Int, vararg args: Any?): Int
