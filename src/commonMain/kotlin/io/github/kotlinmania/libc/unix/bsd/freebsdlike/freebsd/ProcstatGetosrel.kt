package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.KinfoProc

public expect fun procstatGetosrel(procstat: Procstat?, kp: KinfoProc?, osrelp: Int?): Int
