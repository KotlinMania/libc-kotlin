// port-lint: source unix/bsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public expect fun semOpen(name: String?, oflag: Int, vararg args: Any?): io.github.kotlinmania.libc.COpaquePointer?
