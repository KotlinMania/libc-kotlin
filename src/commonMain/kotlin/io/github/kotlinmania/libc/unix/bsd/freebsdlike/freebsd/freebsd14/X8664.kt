// port-lint: source libc/src/unix/bsd/freebsdlike/freebsd/freebsd14/x86_64.rs
package io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.freebsd14

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.unix.bsd.freebsdlike.freebsd.*

public const val PROC_KPTI_CTL: CInt = PROC_PROCCTL_MD_MIN
public const val PROC_KPTI_CTL_ENABLE_ON_EXEC: CInt = 1
public const val PROC_KPTI_CTL_DISABLE_ON_EXEC: CInt = 2
public val PROC_KPTI_STATUS: CInt = PROC_PROCCTL_MD_MIN + 1
public const val PROC_KPTI_STATUS_ACTIVE: CInt = 0x80000000.toInt()
public val PROC_LA_CTL: CInt = PROC_PROCCTL_MD_MIN + 2
public val PROC_LA_STATUS: CInt = PROC_PROCCTL_MD_MIN + 3
public const val PROC_LA_CTL_LA48_ON_EXEC: CInt = 1
public const val PROC_LA_CTL_LA57_ON_EXEC: CInt = 2
public const val PROC_LA_CTL_DEFAULT_ON_EXEC: CInt = 3
public const val PROC_LA_STATUS_LA48: CInt = 0x01000000
public const val PROC_LA_STATUS_LA57: CInt = 0x02000000
