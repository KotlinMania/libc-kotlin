// port-lint: source unix/linux_like/l4re/uclibc/mod.rs
package io.github.kotlinmania.libc.unix.linuxlike.l4re.uclibc

import io.github.kotlinmania.libc.*

public expect fun gettimeofday(tp: Timeval?, tz: Timezone?): Int
