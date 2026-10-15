// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun semOpen(name: String?, oflag: Int, vararg args: Any?): io.github.kotlinmania.libc.unix.nto.SyncT?
