// port-lint: source wasi/mod.rs
package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun pthreadEqual(t1: io.github.kotlinmania.libc.COpaquePointer?, t2: io.github.kotlinmania.libc.COpaquePointer?): Int
