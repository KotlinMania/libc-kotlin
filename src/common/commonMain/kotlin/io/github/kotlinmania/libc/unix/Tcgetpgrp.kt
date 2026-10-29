package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun tcgetpgrp(fd: Int): Int
