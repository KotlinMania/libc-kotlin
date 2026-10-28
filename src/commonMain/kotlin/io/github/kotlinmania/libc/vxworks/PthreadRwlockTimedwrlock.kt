package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun pthreadRwlockTimedwrlock(attr: PthreadRwlockT?, host: Timespec?): Int
