// port-lint: source windows/mod.rs
package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun wopen(path: UShort?, oflag: Int, vararg args: Any?): Int
