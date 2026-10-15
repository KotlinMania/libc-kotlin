// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun sscanf(s: String?, format: String?, vararg args: Any?): Int
