package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int
