// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun osUnfairLockAssertNotOwner(lock: io.github.kotlinmania.libc.unix.bsd.apple.OsUnfairLockS?)
