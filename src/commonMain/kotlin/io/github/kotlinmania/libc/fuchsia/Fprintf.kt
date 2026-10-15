// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun fprintf(stream: FILE?, format: String?, vararg args: Any?): Int
