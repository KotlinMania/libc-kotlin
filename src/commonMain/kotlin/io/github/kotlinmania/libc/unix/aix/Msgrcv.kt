// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun msgrcv(msqid: Int, msgp: COpaquePointer?, msgsz: ULong, msgtyp: Long, msgflg: Int): Long
