// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun fcntl(fd: Int, cmd: Int, vararg args: Any?): Int
