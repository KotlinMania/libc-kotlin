// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun realloc(p: COpaquePointer?, size: ULong): COpaquePointer?
