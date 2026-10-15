package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd

import io.github.kotlinmania.libc.*

public expect fun procstatGetprocs(procstat: Procstat?, what: Int, arg: Int, count: UInt?): KinfoProc?
