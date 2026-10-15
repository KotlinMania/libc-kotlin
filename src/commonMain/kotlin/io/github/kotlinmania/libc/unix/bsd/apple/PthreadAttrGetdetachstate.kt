// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrGetdetachstate(attr: io.github.kotlinmania.libc.COpaquePointer?, detachstate: Int?): Int
