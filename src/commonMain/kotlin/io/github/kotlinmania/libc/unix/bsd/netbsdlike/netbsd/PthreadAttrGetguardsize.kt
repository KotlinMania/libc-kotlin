// port-lint: source unix/bsd/netbsdlike/netbsd/mod.rs
package io.github.kotlinmania.libc.unix.bsd.netbsdlike.netbsd

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): Int
