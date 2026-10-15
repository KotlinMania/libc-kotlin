// port-lint: source teeos/mod.rs
package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun pthreadOnce(pot: Int?, f: (() -> io.github.kotlinmania.libc.COpaquePointer?)?): Int
