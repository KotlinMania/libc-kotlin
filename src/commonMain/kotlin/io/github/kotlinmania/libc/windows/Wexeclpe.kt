// port-lint: source windows/mod.rs
package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun wexeclpe(path: UShort?, arg0: UShort?, vararg args: Any?): Long
