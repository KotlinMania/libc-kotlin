// port-lint: source unix/cygwin/mod.rs
package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun strerrorR(errnum: Int, buf: String?, buflen: ULong): Int
