// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun strtol(s: String?, endp: COpaquePointer?, base: Int): Long
