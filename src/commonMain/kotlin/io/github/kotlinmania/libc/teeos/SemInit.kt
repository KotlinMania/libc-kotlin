// port-lint: source teeos/mod.rs
package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun semInit(sem: SemT?, pshared: Int, value: UInt): Int
