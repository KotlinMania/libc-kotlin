# Concrete callback contracts

Stored and returned Kotlin function types generated 34 unchecked `Any` to `FunctionN` receiver casts in the Swift bridge. The callback follow-up replaces 68 record fields and the parameter/return contracts of `esetfunc`, `sceGuSetCallback` and `pthreadIntrospectionHookInstall` with 41 concrete `fun interface` types. Their `operator fun invoke` methods retain ordinary Kotlin call syntax. These are nominal public types, not function typealiases or hidden APIs.

| Contract family | Source |
|---|---|
| Signal restorers and handlers | `src/commonMain/kotlin/io/github/kotlinmania/libc/SignalCallbacks.kt` |
| Signal notification payload | `src/commonMain/kotlin/io/github/kotlinmania/libc/unix/SignalNotification.kt` |
| QuRT notification/action, VxWorks non-returning handlers | `new/qurt/SignalCallbacks.kt`, `vxworks/SignalCallbacks.kt` beneath the same package root |
| Thirteen distinct allocator hooks | `unix/bsd/apple/b64/x8664/MallocZoneCallbacks.kt` |
| Five file operations and nested selection notification | `unix/aix/FileOperationCallbacks.kt` |
| Graphics, thread, timer, alarm, kernel and ringbuffer callbacks | `psp/Callbacks.kt` |
| Thread introspection and coroutine context | `new/apple/libpthread/pthread/IntrospectionHook.kt`, `unix/bsd/freebsdlike/dragonfly/ContextCoroutine.kt` |
| Diagnostic, glob, thread-exit, ELF and image lifecycle callbacks | `unix/bsd/netbsdlike/netbsd/DiagnosticHandler.kt`, `unix/nto/Callbacks.kt`, `unix/bsd/freebsdlike/freebsd/x8664/ElfAuxiliaryFunction.kt`, `unix/haiku/ImageCallbacks.kt` |

All paths are common source inherited by every retained KMP target. No artificial expect/actual layer, platform actual implementation, native runtime body, dependency, target declaration or compiler option changes in this follow-up. Existing legacy ABI record namespaces do not add build targets.

The allocator `batchFree` signature was independently incorrect: the existing zero-argument callback discarded its zone, pointer-array address and count. Upstream `tmp/libc/src/unix/bsd/apple/b64/x86_64/mod.rs` declares all three arguments. `MallocZoneBatchFree.invoke(zone: MallocZoneT?, pointers: COpaquePointer?, count: UInt)` now carries them. The pointer-array address remains an explicitly raw pointer; this does not add ownership or a native trampoline.

## Compatibility and semantic limits

Record constructors, getters, components and copy methods now expose the named interfaces. Ordinary lambda arguments retain SAM conversion; callback invocation retains operator syntax. Callers that explicitly store a function type or require `FunctionN` must adopt the named interface or wrap the function explicitly. For example, a diagnostic function becomes `DiagnosticHandler { status, message -> ... }`. No erased compatibility overload is added.

The bounded downstream check examined 65 existing libc-importing files across 20 repositories and found no occurrences of the changed field/method identifiers. It is a lexical source inventory, not dependency resolution, complete alias/wildcard analysis or downstream compilation. No downstream source changed.

These interfaces describe callbacks carried by Kotlin models. They do not implement unavailable OS hook registration or establish native C callback lifetime/ABI behavior. Existing unsupported installers remain unsupported. Ten common regression tests check callback identity, nullability, exact argument/result forwarding, full-width unsigned values, nested notification ordering, exception identity and the corrected batch-free arguments. They do not simulate OS registration or claim physical allocator execution.

Input-only raw callback signatures remain in other APIs. The bounded lexical follow-up finds 146 remaining raw callback declaration lines and no stored/returned callback line matches. This is not a claim that every library function-type surface has been redesigned.

## Actual validation

`./gradlew ktlintFormat jvmTest macosArm64Test --no-daemon --max-workers=2 --no-configuration-cache --console=plain --warning-mode summary` exited 0 in 53s: 72 tasks, 16 executed and 56 up-to-date. JVM ran 55 tests and macOS Native ran 104; each executed all ten new callback regressions, with zero failures/errors/skips.

`./gradlew swiftExportSmokeTest --no-daemon --max-workers=2 --no-configuration-cache --console=plain --warning-mode summary` exited 1 in 2m 41s. Actual fresh generation contains all 41 nominal Swift protocols and **zero erased functional receiver casts**, down from 34. The bridge was regenerated normally; generated output and installed compiler/cache files were not patched.

| Strict warning family | Before | After |
|---|---:|---:|
| Forward Unit/Boolean marker | 3190 | 3195 |
| Reverse Boolean/Unit | 171 | 113 |
| Reverse Boolean/Nothing | 4 | 4 |
| Erased callback receiver cast | 34 | 0 |
| Coroutine runtime diagnostics | 4 | 4 |
| Total | 3403 | 3316 |

Every remaining warning matches the actual generated source coordinate. Counts by module: Libc 3302, KotlinStdlib 10, coroutine support 4. There are no unclassified warnings. Forward-marker warnings increase by five in the regenerated bridge; all remaining families need the separate producer/runtime repair. No suppression, API hiding, generated-output patch or installed compiler/cache change was applied.

**Zero Swift tests execute**, because strict generated Kotlin compilation fails first. Nominal protocol presence is generated-shape evidence, not successful Swift callback execution. The previous 691-test full aggregate belongs to the earlier production revision; it is not final all-platform proof for this callback follow-up. Remaining targets, real Swift integration and exact-final-revision CI still require validation before merge/release.

Raw commands, copied XML, source manifests, all 34 cast-to-declaration mappings, caller impact and fresh warning/source hashes are under workspace `automation-artifacts/libc-p1-repair-2026-10-20/callback-review/`. Both granted commands exited and the local slot was explicitly returned. No remote run, release, external publication or toolchain integration occurred.
