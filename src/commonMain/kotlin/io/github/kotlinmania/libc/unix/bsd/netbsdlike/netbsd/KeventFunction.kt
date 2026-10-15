// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun kevent(kq: Int, changelist: Kevent?, nchanges: ULong, eventlist: Kevent?, nevents: ULong, timeout: Timespec?): Int
