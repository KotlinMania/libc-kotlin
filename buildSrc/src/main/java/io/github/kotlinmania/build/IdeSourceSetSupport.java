package io.github.kotlinmania.build;

import java.util.List;
import java.util.Map;
import org.gradle.api.Project;
import org.gradle.api.plugins.JavaPluginExtension;

/**
 * Configures hierarchical source-set directory paths across Kotlin and Java source sets
 * so IntelliJ IDEA's {@code GradleSourceSetModelBuilder} and {@code KotlinMppGradleProjectResolver}
 * resolve every source set to its directory in the {@code src/} hierarchy without colliding with
 * the Gradle subproject content roots.
 */
public final class IdeSourceSetSupport {
    private IdeSourceSetSupport() {}

    public static final Map<String, String> HIERARCHICAL_PATHS = Map.ofEntries(
            Map.entry("commonMain", "src/common/commonMain"),
            Map.entry("commonTest", "src/common/commonTest"),
            Map.entry("hostSystemMain", "src/common/hostSystemMain"),
            Map.entry("hostSystemTest", "src/common/hostSystemTest"),
            Map.entry("jvmMain", "src/jvm/jvmMain"),
            Map.entry("jvmTest", "src/jvm/jvmTest"),
            Map.entry("androidMain", "src/android/jvm/androidMain"),
            Map.entry("androidNativeMain", "src/android/native/androidNativeMain"),
            Map.entry("androidNativeArm64Main", "src/android/native/androidNativeArm64Main"),
            Map.entry("androidNativeX64Main", "src/android/native/androidNativeX64Main"),
            Map.entry("androidHostTest", "src/android/jvm/androidHostTest"),
            Map.entry("androidDeviceTest", "src/android/jvm/androidDeviceTest"),
            Map.entry("androidNativeTest", "src/android/native/androidNativeTest"),
            Map.entry("androidNativeArm64Test", "src/android/native/androidNativeTest/androidNativeArm64Test"),
            Map.entry("androidNativeX64Test", "src/android/native/androidNativeTest/androidNativeX64Test"),
            Map.entry("wasmWasiMain", "src/js/wasm/wasmWasiMain"),
            Map.entry("wasmWasiTest", "src/js/wasm/wasmWasiTest"),
            Map.entry("webMain", "src/js/webMain"),
            Map.entry("webTest", "src/js/webTest"),
            Map.entry("jsMain", "src/js/jsMain"),
            Map.entry("jsTest", "src/js/jsTest"),
            Map.entry("wasmJsMain", "src/js/wasm/wasmJsMain"),
            Map.entry("wasmJsTest", "src/js/wasm/wasmJsTest"),
            Map.entry("nativeMain", "src/native/nativeMain"),
            Map.entry("nativeTest", "src/native/nativeTest"),
            Map.entry("posixMain", "src/native/nativeMain/posixMain"),
            Map.entry("posixTest", "src/native/nativeTest/posixTest"),
            Map.entry("linuxMain", "src/native/nativeMain/linuxMain"),
            Map.entry("linuxTest", "src/native/nativeTest/linuxTest"),
            Map.entry("linuxArm64Main", "src/native/nativeMain/linuxMain/linuxArm64Main"),
            Map.entry("linuxArm64Test", "src/native/nativeTest/linuxTest/linuxArm64Test"),
            Map.entry("linuxX64Main", "src/native/nativeMain/linuxMain/linuxX64Main"),
            Map.entry("linuxX64Test", "src/native/nativeTest/linuxTest/linuxX64Test"),
            Map.entry("mingwMain", "src/native/nativeMain/mingwMain"),
            Map.entry("mingwTest", "src/native/nativeTest/mingwTest"),
            Map.entry("mingwX64Main", "src/native/nativeMain/mingwMain/mingwX64Main"),
            Map.entry("mingwX64Test", "src/native/nativeTest/mingwTest/mingwX64Test"),
            Map.entry("appleMain", "src/apple/appleMain"),
            Map.entry("appleTest", "src/native/nativeTest/appleTest"),
            Map.entry("iosMain", "src/apple/ios/iosMain"),
            Map.entry("iosTest", "src/native/nativeTest/appleTest/iosTest"),
            Map.entry("iosArm64Main", "src/apple/ios/iosArm64Main"),
            Map.entry("iosArm64Test", "src/native/nativeTest/appleTest/iosTest/iosArm64Test"),
            Map.entry("iosSimulatorArm64Main", "src/apple/ios/iosSimulatorArm64Main"),
            Map.entry("iosSimulatorArm64Test", "src/native/nativeTest/appleTest/iosTest/iosSimulatorArm64Test"),
            Map.entry("macosMain", "src/apple/macos/macosMain"),
            Map.entry("macosTest", "src/native/nativeTest/appleTest/macosTest"),
            Map.entry("macosArm64Main", "src/apple/macos/macosArm64Main"),
            Map.entry("macosArm64Test", "src/native/nativeTest/appleTest/macosTest/macosArm64Test"),
            Map.entry("tvosMain", "src/apple/tvos/tvosMain"),
            Map.entry("tvosTest", "src/native/nativeTest/appleTest/tvosTest"),
            Map.entry("tvosArm64Main", "src/apple/tvos/tvosArm64Main"),
            Map.entry("tvosArm64Test", "src/native/nativeTest/appleTest/tvosTest/tvosArm64Test"),
            Map.entry("tvosSimulatorArm64Main", "src/apple/tvos/tvosSimulatorArm64Main"),
            Map.entry("tvosSimulatorArm64Test", "src/native/nativeTest/appleTest/tvosTest/tvosSimulatorArm64Test"),
            Map.entry("watchosMain", "src/apple/watchos/watchosMain"),
            Map.entry("watchosTest", "src/native/nativeTest/appleTest/watchosTest"),
            Map.entry("watchosDeviceArm64Main", "src/apple/watchos/watchosDeviceArm64Main"),
            Map.entry("watchosDeviceArm64Test", "src/native/nativeTest/appleTest/watchosTest/watchosDeviceArm64Test"),
            Map.entry("watchosSimulatorArm64Main", "src/apple/watchos/watchosSimulatorArm64Main"),
            Map.entry("watchosSimulatorArm64Test", "src/native/nativeTest/appleTest/watchosTest/watchosSimulatorArm64Test"));

    public static String sourceSetDir(String name) {
        return HIERARCHICAL_PATHS.getOrDefault(name, "src/" + name);
    }

    public static void configure(Project project) {
        project.afterEvaluate(p -> {
            JavaPluginExtension javaExt = p.getExtensions().findByType(JavaPluginExtension.class);
            if (javaExt != null) {
                javaExt.getSourceSets().configureEach(ss -> {
                    String relPath = sourceSetDir(ss.getName());
                    ss.getJava().setSrcDirs(List.of(relPath + "/kotlin/java"));
                    ss.getResources().setSrcDirs(List.of(relPath + "/kotlin/resources"));
                });
            }
        });
    }
}
