// port-lint: source unix/cygwin/mod.rs
package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun posixSpawnFileActionsAddopen(actions: io.github.kotlinmania.libc.COpaquePointer?, fd: Int, path: String?, oflag: Int, mode: UInt): Int
