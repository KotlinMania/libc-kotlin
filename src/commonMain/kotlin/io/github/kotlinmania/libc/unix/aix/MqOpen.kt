// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun mqOpen(name: String?, oflag: Int, vararg args: Any?): Int
