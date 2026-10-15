// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun posixSpawnFileActionsAdddup2(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int, newfd: Int): Int
