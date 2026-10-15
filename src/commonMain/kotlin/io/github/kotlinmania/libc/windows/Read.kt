// port-lint: source windows/mod.rs
package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun read(fd: Int, buf: COpaquePointer?, count: UInt): Int
