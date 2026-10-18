package io.github.kotlinmania.libc.unix.bsd.netbsdlike
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd.ShmidDs

public expect fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int
