package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun pthreadCondattrGetclock(pAttr: PthreadCondattrT?, pClockId: Int?): Int
