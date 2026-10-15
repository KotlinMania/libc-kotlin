// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun mqSend(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt): Int
