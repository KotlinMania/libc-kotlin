// port-lint: source teeos/mod.rs
package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun snprintf(s: String?, n: ULong, fmt: String?, vararg args: Any?): Int
