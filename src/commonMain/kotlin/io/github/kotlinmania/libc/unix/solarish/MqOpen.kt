// port-lint: source unix/solarish/mod.rs
package io.github.kotlinmania.libc.unix.solarish

import io.github.kotlinmania.libc.*

public expect fun mqOpen(name: String?, oflag: Int, vararg args: Any?): io.github.kotlinmania.libc.COpaquePointer?
