package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

public expect fun shmat(shmid: Int, shmaddr: COpaquePointer?, shmflg: Int): COpaquePointer?
