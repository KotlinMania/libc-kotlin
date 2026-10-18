package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.KinfoProc

import io.github.kotlinmania.libc.*

public expect fun procstatGetfiles(procstat: Procstat?, kp: KinfoProc?, mmapped: Int): FilestatList?
