// port-lint: source unix/bsd/apple/mod.rs
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.COpaquePointer

public fun sysdirStartSearchPathEnumeration(
    dir: SysdirSearchPathDirectoryT,
    domainMask: SysdirSearchPathDomainMaskT,
): SysdirSearchPathEnumerationState = 0u

public fun sysdirGetNextSearchPathEnumeration(
    state: SysdirSearchPathEnumerationState,
    path: COpaquePointer?,
): SysdirSearchPathEnumerationState = 0u
