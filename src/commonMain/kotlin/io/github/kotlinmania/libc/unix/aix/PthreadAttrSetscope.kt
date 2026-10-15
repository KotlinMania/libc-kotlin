// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrSetscope(attr: io.github.kotlinmania.libc.COpaquePointer?, contentionscope: Int): Int
