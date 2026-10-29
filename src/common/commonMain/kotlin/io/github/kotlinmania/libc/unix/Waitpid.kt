package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun waitpid(pid: Int, status: Int?, options: Int): Int
