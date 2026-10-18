package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Rlimit
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.KinfoProc

public expect fun procstatGetrlimit(procstat: Procstat?, kp: KinfoProc?, which: Int, rlimit: Rlimit?): Int
