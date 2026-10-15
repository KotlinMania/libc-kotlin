// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun fstatfs(fd: Int, buf: Statfs?): Int
