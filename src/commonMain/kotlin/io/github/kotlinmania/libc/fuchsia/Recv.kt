// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun recv(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long
