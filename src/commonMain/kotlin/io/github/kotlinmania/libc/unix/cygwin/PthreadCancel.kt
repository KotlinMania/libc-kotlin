// port-lint: source unix/cygwin/mod.rs
package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun pthreadCancel(thread: io.github.kotlinmania.libc.COpaquePointer?): Int
