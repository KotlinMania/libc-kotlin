// port-lint: source unix/cygwin/mod.rs
package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun semOpen(name: String?, oflag: Int, vararg args: Any?): io.github.kotlinmania.libc.COpaquePointer?
