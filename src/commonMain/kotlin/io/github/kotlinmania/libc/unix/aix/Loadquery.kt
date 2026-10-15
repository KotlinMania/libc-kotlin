// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun loadquery(flags: Int, buf: COpaquePointer?, buflen: UInt, vararg args: Any?): Int
