// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun semctl(semid: Int, semnum: Int, cmd: Int, vararg args: Any?): Int
