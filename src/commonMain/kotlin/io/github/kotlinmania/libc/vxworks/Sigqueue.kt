// port-lint: source vxworks/mod.rs
package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.Sigval

public expect fun sigqueue(pid: Int, signo: Int, value: Sigval): Int

public expect fun sigqueue(rtpId: Int, signo: Int, pValue: Sigval?, sigCode: Int): Int
