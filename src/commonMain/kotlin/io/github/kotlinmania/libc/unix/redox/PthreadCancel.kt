// port-lint: source unix/redox/mod.rs
package io.github.kotlinmania.libc.unix.redox

import io.github.kotlinmania.libc.*

public expect fun pthreadCancel(thread: io.github.kotlinmania.libc.COpaquePointer?): Int
