package io.github.kotlinmania.libc.unix.linuxlike.linux
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.linuxlike.Sembuf

public expect fun semop(semid: Int, sops: Sembuf?, nsops: ULong): Int
