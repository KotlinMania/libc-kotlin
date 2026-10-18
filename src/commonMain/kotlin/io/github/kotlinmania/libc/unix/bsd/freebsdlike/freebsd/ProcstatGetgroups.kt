package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd15.KinfoProc

import io.github.kotlinmania.libc.*

public expect fun procstatGetgroups(procstat: Procstat?, kp: KinfoProc?, count: UInt?): UInt?
