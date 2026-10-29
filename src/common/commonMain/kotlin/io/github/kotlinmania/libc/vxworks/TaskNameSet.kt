package io.github.kotlinmania.libc.vxworks

import io.github.kotlinmania.libc.*

public expect fun taskNameSet(taskId: Int, taskName: String?): Int
