// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun calloc(nobj: ULong, size: ULong): COpaquePointer?
