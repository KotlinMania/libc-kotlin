// port-lint: source unix/hurd/mod.rs
package io.github.kotlinmania.libc.unix.hurd

import io.github.kotlinmania.libc.*

public expect fun posixSpawnFileActionsAddopen(actions: PosixSpawnFileActionsT?, fd: Int, path: String?, oflag: Int, mode: UInt): Int
