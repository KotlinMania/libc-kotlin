package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun msgsnd(msqid: Int, msgp: COpaquePointer?, msgsz: ULong, msgflg: Int): Int
