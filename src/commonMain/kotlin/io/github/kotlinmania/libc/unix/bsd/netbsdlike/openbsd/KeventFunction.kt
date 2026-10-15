// port-lint: source unix/bsd/netbsdlike/openbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.openbsd

import io.github.kotlinmania.libc.*

public expect fun kevent(kq: Int, changelist: Kevent?, nchanges: Int, eventlist: Kevent?, nevents: Int, timeout: Timespec?): Int
