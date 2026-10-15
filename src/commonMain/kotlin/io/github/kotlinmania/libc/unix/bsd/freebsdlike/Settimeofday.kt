package io.github.kotlinmania.libc.unix.bsd.freebsdlike

import io.github.kotlinmania.libc.*

public expect fun settimeofday(tv: Timeval?, tz: Timezone?): Int
