// port-lint: source teeos/mod.rs
package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun memcmp(cx: COpaquePointer?, ct: COpaquePointer?, n: ULong): Int
