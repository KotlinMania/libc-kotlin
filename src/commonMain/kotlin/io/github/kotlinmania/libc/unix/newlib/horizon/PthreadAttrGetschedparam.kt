// port-lint: source unix/newlib/horizon/mod.rs
package io.github.kotlinmania.libc.unix.newlib.horizon

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrGetschedparam(attr: io.github.kotlinmania.libc.COpaquePointer?, param: SchedParam?): Int
