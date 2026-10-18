package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd
import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Timespec

public expect fun kevent(kq: Int, changelist: Kevent?, nchanges: Int, eventlist: Kevent?, nevents: Int, timeout: Timespec?): Int
