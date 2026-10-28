package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.ShmidDs

public expect fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int
