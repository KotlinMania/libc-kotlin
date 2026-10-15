// port-lint: source unix/bsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd

import io.github.kotlinmania.libc.*

public expect fun semClose(sem: io.github.kotlinmania.libc.COpaquePointer?): Int
