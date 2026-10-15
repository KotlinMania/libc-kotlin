// port-lint: source unix/bsd/freebsdlike/mod.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun ppoll(fds: Pollfd?, nfds: UInt, timeout: Timespec?, sigmask: SigsetT?): Int
