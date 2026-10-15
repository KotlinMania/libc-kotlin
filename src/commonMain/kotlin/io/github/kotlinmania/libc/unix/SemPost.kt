// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun semPost(sem: io.github.kotlinmania.libc.COpaquePointer?): Int
