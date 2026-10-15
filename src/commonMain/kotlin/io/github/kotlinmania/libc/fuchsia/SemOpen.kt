// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun semOpen(name: String?, oflag: Int, vararg args: Any?): SemT?
