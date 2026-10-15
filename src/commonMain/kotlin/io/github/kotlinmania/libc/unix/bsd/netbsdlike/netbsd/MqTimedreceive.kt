// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun mqTimedreceive(mqd: Int, msgPtr: String?, msgLen: ULong, msgPrio: UInt?, absTimeout: Timespec?): Long
