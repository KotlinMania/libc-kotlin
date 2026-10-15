// port-lint: source wasi/mod.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): Int
