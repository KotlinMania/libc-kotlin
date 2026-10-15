// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun mqReceive(mqd: io.github.kotlinmania.libc.COpaquePointer?, msgPtr: String?, msgLen: ULong, msgPrio: UInt?): Long
