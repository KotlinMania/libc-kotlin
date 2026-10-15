// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun recv(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long
