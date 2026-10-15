// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun posixSpawnFileActionsAddopen(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int, path: String?, oflag: Int, mode: UShort): Int
