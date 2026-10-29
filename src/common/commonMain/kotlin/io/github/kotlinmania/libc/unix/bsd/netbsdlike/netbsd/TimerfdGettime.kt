package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.new.netbsd.sys.Itimerspec

public expect fun timerfdGettime(fd: Int, currValue: Itimerspec?): Int
