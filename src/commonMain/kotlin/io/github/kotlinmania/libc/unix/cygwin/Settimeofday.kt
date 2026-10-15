package io.github.kotlinmania.libc.unix.cygwin

import io.github.kotlinmania.libc.*

public expect fun settimeofday(tv: Timeval?, tz: Timezone?): Int
