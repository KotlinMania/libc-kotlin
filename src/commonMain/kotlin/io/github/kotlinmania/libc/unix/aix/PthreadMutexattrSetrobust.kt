// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun pthreadMutexattrSetrobust(attr: io.github.kotlinmania.libc.COpaquePointer?, robust: Int): Int
