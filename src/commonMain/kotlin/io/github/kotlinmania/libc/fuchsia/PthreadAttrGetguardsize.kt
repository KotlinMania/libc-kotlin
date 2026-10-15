// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrGetguardsize(attr: PthreadAttrT?, guardsize: ULong?): Int
