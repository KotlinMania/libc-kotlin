package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun shmctl(shmid: Int, cmd: Int, buf: ShmidDs?): Int
