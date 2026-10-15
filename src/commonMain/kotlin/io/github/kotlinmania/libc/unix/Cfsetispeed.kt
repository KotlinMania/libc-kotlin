// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun cfsetispeed(termios: Termios?, speed: UInt): Int
