// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun connect(socket: Int, address: Sockaddr?, len: UInt): Int
