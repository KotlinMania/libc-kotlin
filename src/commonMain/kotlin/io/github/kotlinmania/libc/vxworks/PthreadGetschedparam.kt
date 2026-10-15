// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun pthreadGetschedparam(native: ULong, policy: Int?, param: SchedParam?): Int
