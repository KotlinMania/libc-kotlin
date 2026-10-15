// port-lint: source windows/gnu/mod.rs
package io.github.kotlinmania.libc.windows.gnu

import io.github.kotlinmania.libc.*

public expect fun wmemchr(cx: UInt?, c: UInt, n: ULong): UInt?
