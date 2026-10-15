// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun mqTimedsend(mqdes: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt, absTimeout: Timespec?): Int
