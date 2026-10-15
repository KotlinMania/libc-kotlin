// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun pthreadCondWait(cond: io.github.kotlinmania.libc.COpaquePointer?, lock: io.github.kotlinmania.libc.COpaquePointer?): Int
