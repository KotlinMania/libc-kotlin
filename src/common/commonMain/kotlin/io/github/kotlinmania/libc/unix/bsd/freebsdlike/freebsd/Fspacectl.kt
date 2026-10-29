package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun fspacectl(fd: Int, cmd: Int, rqsr: SpacectlRange?, flags: Int, rmsr: SpacectlRange?): Int
