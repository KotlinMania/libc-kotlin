// port-lint: source fuchsia/mod.rs
package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrSetguardsize(attr: PthreadAttrT?, guardsize: ULong): Int
