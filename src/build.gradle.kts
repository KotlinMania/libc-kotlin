val evaluationOrder =
    listOf(
        "commonMain",
        "hostSystemMain",
        "jvmMain",
        "androidMain",
        "webMain",
        "wasmWasiMain",
        "nativeMain",
        "commonTest",
        "hostSystemTest",
        "jvmTest",
        "androidTest",
        "webTest",
        "wasmWasiTest",
        "nativeTest",
    )

evaluationOrder.forEach { name ->
    childProjects[name]?.let { evaluationDependsOn(it.path) }
}
