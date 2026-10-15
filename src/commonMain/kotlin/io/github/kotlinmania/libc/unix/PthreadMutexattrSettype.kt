// port-lint: source unix/mod.rs
package io.github.kotlinmania.libc.unix

import io.github.kotlinmania.libc.*

public expect fun pthreadMutexattrSettype(attr: io.github.kotlinmania.libc.COpaquePointer?, type: Int): Int
