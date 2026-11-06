// port-lint: source unix/bsd/freebsdlike/freebsd/freebsd12/x86_64.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd12

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.PROC_PROCCTL_MD_MIN

public val PROC_KPTI_CTL: CInt = PROC_PROCCTL_MD_MIN

public val PROC_KPTI_CTL_ENABLE_ON_EXEC: CInt = 1

public val PROC_KPTI_CTL_DISABLE_ON_EXEC: CInt = 2

public val PROC_KPTI_STATUS: CInt = PROC_PROCCTL_MD_MIN + 1

public val PROC_KPTI_STATUS_ACTIVE: CInt = 0x80000000
