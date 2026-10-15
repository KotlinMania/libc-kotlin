// port-lint: source windows/mod.rs
package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun memmove(dest: COpaquePointer?, src: COpaquePointer?, n: ULong): COpaquePointer?
