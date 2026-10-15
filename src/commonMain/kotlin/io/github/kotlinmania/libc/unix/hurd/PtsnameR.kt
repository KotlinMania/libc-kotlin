// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun ptsnameR(fd: Int, buf: String?, buflen: ULong): Int
