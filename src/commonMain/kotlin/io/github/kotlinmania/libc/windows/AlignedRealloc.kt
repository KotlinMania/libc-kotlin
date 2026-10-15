// port-lint: source windows/mod.rs
package io.github.kotlinmania.libc.windows

import io.github.kotlinmania.libc.*

public expect fun alignedRealloc(memblock: COpaquePointer?, size: ULong, alignment: ULong): COpaquePointer?
