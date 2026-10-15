// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): Int
