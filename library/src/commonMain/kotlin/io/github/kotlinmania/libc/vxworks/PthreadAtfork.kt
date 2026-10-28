package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun pthreadAtfork(prepare: (() -> Unit)?, parent: (() -> Unit)?, child: (() -> Unit)?): Int
