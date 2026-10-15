// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrGetschedpolicy(attr: io.github.kotlinmania.libc.COpaquePointer?, policy: Int?): Int
