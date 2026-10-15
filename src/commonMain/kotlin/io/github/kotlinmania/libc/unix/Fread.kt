// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun fread(ptr: COpaquePointer?, size: ULong, nobj: ULong, stream: FILE?): ULong
