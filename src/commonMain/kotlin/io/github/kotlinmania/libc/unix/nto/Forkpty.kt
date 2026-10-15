// port-lint: source unix/nto/mod.rs
package io.github.kotlinmania.libc.unix.nto

import io.github.kotlinmania.libc.*

public expect fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int
