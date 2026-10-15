// port-lint: source unix/cygwin/mod.rs
package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int
