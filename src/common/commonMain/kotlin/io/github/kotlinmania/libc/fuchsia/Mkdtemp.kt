package io.github.kotlinmania.libc.fuchsia

import io.github.kotlinmania.libc.*

public expect fun mkdtemp(template: String?): String?
