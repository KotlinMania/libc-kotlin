// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun mqOpen(name: String?, oflag: Int, vararg args: Any?): Int
