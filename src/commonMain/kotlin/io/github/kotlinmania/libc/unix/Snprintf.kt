// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun snprintf(s: String?, n: ULong, format: String?, vararg args: Any?): Int
