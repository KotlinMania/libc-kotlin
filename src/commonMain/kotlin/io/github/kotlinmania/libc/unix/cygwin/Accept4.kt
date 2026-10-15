// port-lint: source unix/cygwin/mod.rs
package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun accept4(s: Int, addr: Sockaddr?, addrlen: Int?, flags: Int): Int
