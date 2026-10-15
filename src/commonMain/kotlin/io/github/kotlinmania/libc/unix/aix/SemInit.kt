// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun semInit(sem: Int?, pshared: Int, value: UInt): Int
