// port-lint: source unix/haiku/mod.rs
package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun msgsnd(msqid: Int, msgp: COpaquePointer?, msgsz: ULong, msgflg: Int): Int
