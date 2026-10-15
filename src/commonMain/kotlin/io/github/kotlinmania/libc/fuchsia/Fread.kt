// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong
