// port-lint: source unix/bsd/freebsdlike/freebsd/freebsd13/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd13

import io.github.kotlinmania.libc.*

public expect fun msgrcv(msqid: Int, msgp: COpaquePointer?, msgsz: ULong, msgtyp: Long, msgflg: Int): Long
