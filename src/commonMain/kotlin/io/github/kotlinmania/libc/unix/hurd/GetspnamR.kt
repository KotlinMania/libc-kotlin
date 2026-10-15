// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun getspnamR(name: String?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): Int
