// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun strncmp(cs: String?, ct: String?, n: ULong): Int
