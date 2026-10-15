// port-lint: source windows/mod.rs
package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun strtoll(s: String?, endp: COpaquePointer?, base: Int): Long
