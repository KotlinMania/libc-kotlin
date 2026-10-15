// port-lint: source unix/newlib/mod.rs
package io.github.kotlinmania.libc.unix.newlib

import io.github.kotlinmania.libc.*

public expect fun semOpen(name: String?, oflag: Int, vararg args: Any?): SemT?
