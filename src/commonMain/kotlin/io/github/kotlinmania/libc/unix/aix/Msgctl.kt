// port-lint: source unix/aix/mod.rs
package io.github.kotlinmania.libc.unix.aix

import io.github.kotlinmania.libc.*

public expect fun msgctl(msqid: Int, cmd: Int, buf: MsqidDs?): Int
