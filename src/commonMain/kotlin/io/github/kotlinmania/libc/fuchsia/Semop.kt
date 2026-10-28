package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun semop(semid: Int, sops: Sembuf?, nsops: ULong): Int
