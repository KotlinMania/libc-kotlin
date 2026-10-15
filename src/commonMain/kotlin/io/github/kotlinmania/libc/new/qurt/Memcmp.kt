// port-lint: source new/qurt/mod.rs
package io.github.kotlinmania.libc.new.qurt

import io.github.kotlinmania.libc.*

public expect fun memcmp(s1: COpaquePointer?, s2: COpaquePointer?, n: ULong): Int
