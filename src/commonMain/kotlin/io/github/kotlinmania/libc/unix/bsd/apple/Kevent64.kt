package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun kevent64(kq: Int, changelist: Kevent64S?, nchanges: Int, eventlist: Kevent64S?, nevents: Int, flags: UInt, timeout: Timespec?): Int
