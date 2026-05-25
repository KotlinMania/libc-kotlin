// port-lint: source new/common/posix/unistd.rs
package io.github.kotlinmania.libc.new.common.posix

import io.github.kotlinmania.libc.CInt

/**
 * Header: `unistd.h`.
 *
 * See [unistd.h in the Open Group base specifications](https://pubs.opengroup.org/onlinepubs/007904975/basedefs/unistd.h.html).
 */

public const val STDIN_FILENO: CInt = 0
public const val STDOUT_FILENO: CInt = 1
public const val STDERR_FILENO: CInt = 2
