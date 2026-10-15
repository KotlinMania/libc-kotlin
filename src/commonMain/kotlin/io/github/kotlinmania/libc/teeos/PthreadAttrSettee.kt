// port-lint: source teeos/mod.rs
package io.github.kotlinmania.libc.teeos

import io.github.kotlinmania.libc.*

public expect fun pthreadAttrSettee(attr: PthreadAttrT?, ca: Int, taskId: Int, shadow: Int): Int
