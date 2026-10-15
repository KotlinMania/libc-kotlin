// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun fchown(fd: Int, owner: UInt, group: UInt): Int
