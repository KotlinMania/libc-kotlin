// port-lint: source unix/bsd/freebsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun mqSend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt): Int
