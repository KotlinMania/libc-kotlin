// port-lint: source wasi/mod.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun recv(socket: Int, buf: COpaquePointer?, len: ULong, flags: Int): Long
