// port-lint: source unix/linux_like/linux/gnu/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.linux.gnu

import io.github.kotlinmania.libc.*

// C union; only one variant is valid at a time.
public data class CAnonymousPtraceSyscallInfoData(
    val entry: CAnonymousPtraceSyscallInfoEntry? = null,
    val exit: CAnonymousPtraceSyscallInfoExit? = null,
    val seccomp: CAnonymousPtraceSyscallInfoSeccomp? = null,
)
