// port-lint: source unix/newlib/vita/mod.rs
package io.github.kotlinmania.libc.unix.newlib.vita

import io.github.kotlinmania.libc.*

public expect fun pthreadCondattrSetclock(attr: io.github.kotlinmania.libc.COpaquePointer?, clockId: Int): Int
