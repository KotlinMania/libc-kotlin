package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun taskKill(taskId: Int, signo: Int): Int
