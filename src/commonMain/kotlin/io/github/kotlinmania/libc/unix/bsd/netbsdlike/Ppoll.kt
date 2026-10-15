// port-lint: source unix/bsd/netbsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike

import io.github.kotlinmania.libc.*

public expect fun ppoll(fds: Pollfd?, nfds: UInt, ts: Timespec?, sigmask: ULong?): Int
