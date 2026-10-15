// port-lint: source unix/cygwin/mod.rs
package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun forkpty(amaster: Int?, name: String?, termp: Termios?, winp: Winsize?): Int
