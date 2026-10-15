package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun settimeofday(tv: Timeval?, tz: Timezone?): Int
