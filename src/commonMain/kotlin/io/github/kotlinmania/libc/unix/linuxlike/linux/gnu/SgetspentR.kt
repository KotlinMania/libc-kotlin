// port-lint: source unix/linux_like/linux/gnu/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

public expect fun sgetspentR(s: String?, spbuf: Spwd?, buf: String?, buflen: ULong, spbufp: COpaquePointer?): Int
