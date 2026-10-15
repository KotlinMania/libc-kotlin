// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun execl(path: String?, arg0: String?, vararg args: Any?): Int
