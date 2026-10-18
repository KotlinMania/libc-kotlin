package io.github.kotlinmania.libc.unix.haiku

import io.github.kotlinmania.libc.*

public expect fun semop(semid: Int, sops: Sembuf?, nsops: ULong): Int
