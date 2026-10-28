package io.github.kotlinmania.libc.wasi

import io.github.kotlinmania.libc.*

public expect fun pthreadCondInit(cond: PthreadCondT?, attr: PthreadCondattrT?): Int
