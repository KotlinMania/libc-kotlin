// port-lint: source unix/bsd/apple/mod.rs (sysdir functions)
package io.github.kotlinmania.libc.unix.bsd.apple

import io.github.kotlinmania.libc.COpaquePointer

// Apple-specific sysdir functions — these use C interop types (COpaquePointer)
// that are not available on JS/WASM targets. Moved to appleMain so they only
// compile for native Apple targets (ios, macos, tvos, watchos).

public external fun sysdirStartSearchPathEnumeration(
    dir: SysdirSearchPathDirectoryT,
    domainMask: SysdirSearchPathDomainMaskT,
): SysdirSearchPathEnumerationState

public external fun sysdirGetNextSearchPathEnumeration(
    state: SysdirSearchPathEnumerationState,
    path: COpaquePointer?,
): SysdirSearchPathEnumerationState
