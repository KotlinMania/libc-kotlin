// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun posixFadvise(fd: Int, offset: Long, len: Long, advise: Int): Int
