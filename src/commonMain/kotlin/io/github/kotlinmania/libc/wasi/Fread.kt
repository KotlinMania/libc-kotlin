// port-lint: source wasi/mod.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun fread(buf: COpaquePointer?, a: ULong, b: ULong, f: FILE?): ULong
