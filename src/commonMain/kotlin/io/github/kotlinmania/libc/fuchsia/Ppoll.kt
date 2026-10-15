// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun ppoll(fds: Pollfd?, nfds: ULong, timeout: Timespec?, sigmask: SigsetT?): Int
