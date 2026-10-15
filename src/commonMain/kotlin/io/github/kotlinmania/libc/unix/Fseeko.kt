// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun fseeko(stream: FILE?, offset: Long, whence: Int): Int
