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
            Map.entry("commonMain", "src/commonMain"),
            Map.entry("commonTest", "src/commonTest"),
            Map.entry("hostSystemMain", "src/hostSystemMain"),
            Map.entry("hostSystemTest", "src/hostSystemTest"),
            Map.entry("jvmMain", "src/jvmMain"),
            Map.entry("jvmTest", "src/jvmTest"),
            Map.entry("androidMain", "src/androidMain"),
            Map.entry("androidNativeMain", "src/androidMain/androidNativeMain"),
            Map.entry("androidNativeArm64Main", "src/androidMain/androidNativeMain/androidNativeArm64Main"),
            Map.entry("androidNativeX64Main", "src/androidMain/androidNativeMain/androidNativeX64Main"),
            Map.entry("androidHostTest", "src/androidTest/androidHostTest"),
            Map.entry("androidDeviceTest", "src/androidTest/androidDeviceTest"),
            Map.entry("androidNativeTest", "src/androidTest/androidNativeTest"),
            Map.entry("androidNativeArm64Test", "src/androidTest/androidNativeTest/androidNativeArm64Test"),
            Map.entry("androidNativeX64Test", "src/androidTest/androidNativeTest/androidNativeX64Test"),
            Map.entry("wasmWasiMain", "src/wasmWasiMain"),
            Map.entry("wasmWasiTest", "src/wasmWasiTest"),
            Map.entry("webMain", "src/webMain"),
            Map.entry("webTest", "src/webTest"),
            Map.entry("jsMain", "src/webMain/jsMain"),
            Map.entry("jsTest", "src/webTest/jsTest"),
            Map.entry("wasmJsMain", "src/webMain/wasmJsMain"),
            Map.entry("wasmJsTest", "src/webTest/wasmJsTest"),
            Map.entry("nativeMain", "src/nativeMain"),
            Map.entry("nativeTest", "src/nativeTest"),
            Map.entry("posixMain", "src/nativeMain/posixMain"),
            Map.entry("posixTest", "src/nativeTest/posixTest"),
            Map.entry("linuxMain", "src/nativeMain/linuxMain"),
            Map.entry("linuxTest", "src/nativeTest/linuxTest"),
            Map.entry("linuxArm64Main", "src/nativeMain/linuxMain/linuxArm64Main"),
            Map.entry("linuxArm64Test", "src/nativeTest/linuxTest/linuxArm64Test"),
            Map.entry("linuxX64Main", "src/nativeMain/linuxMain/linuxX64Main"),
            Map.entry("linuxX64Test", "src/nativeTest/linuxTest/linuxX64Test"),
            Map.entry("mingwMain", "src/nativeMain/mingwMain"),
            Map.entry("mingwTest", "src/nativeTest/mingwTest"),
            Map.entry("mingwX64Main", "src/nativeMain/mingwMain/mingwX64Main"),
            Map.entry("mingwX64Test", "src/nativeTest/mingwTest/mingwX64Test"),
            Map.entry("appleMain", "src/nativeMain/appleMain"),
            Map.entry("appleTest", "src/nativeTest/appleTest"),
            Map.entry("iosMain", "src/nativeMain/appleMain/iosMain"),
            Map.entry("iosTest", "src/nativeTest/appleTest/iosTest"),
            Map.entry("iosArm64Main", "src/nativeMain/appleMain/iosMain/iosArm64Main"),
            Map.entry("iosArm64Test", "src/nativeTest/appleTest/iosTest/iosArm64Test"),
            Map.entry("iosSimulatorArm64Main", "src/nativeMain/appleMain/iosMain/iosSimulatorArm64Main"),
            Map.entry("iosSimulatorArm64Test", "src/nativeTest/appleTest/iosTest/iosSimulatorArm64Test"),
            Map.entry("macosMain", "src/nativeMain/appleMain/macosMain"),
            Map.entry("macosTest", "src/nativeTest/appleTest/macosTest"),
            Map.entry("macosArm64Main", "src/nativeMain/appleMain/macosMain/macosArm64Main"),
            Map.entry("macosArm64Test", "src/nativeTest/appleTest/macosTest/macosArm64Test"),
            Map.entry("tvosMain", "src/nativeMain/appleMain/tvosMain"),
            Map.entry("tvosTest", "src/nativeTest/appleTest/tvosTest"),
            Map.entry("tvosArm64Main", "src/nativeMain/appleMain/tvosMain/tvosArm64Main"),
            Map.entry("tvosArm64Test", "src/nativeTest/appleTest/tvosTest/tvosArm64Test"),
            Map.entry("tvosSimulatorArm64Main", "src/nativeMain/appleMain/tvosMain/tvosSimulatorArm64Main"),
            Map.entry("tvosSimulatorArm64Test", "src/nativeTest/appleTest/tvosTest/tvosSimulatorArm64Test"),
            Map.entry("watchosMain", "src/nativeMain/appleMain/watchosMain"),
            Map.entry("watchosTest", "src/nativeTest/appleTest/watchosTest"),
            Map.entry("watchosDeviceArm64Main", "src/nativeMain/appleMain/watchosMain/watchosDeviceArm64Main"),
            Map.entry("watchosDeviceArm64Test", "src/nativeTest/appleTest/watchosTest/watchosDeviceArm64Test"),
            Map.entry("watchosSimulatorArm64Main", "src/nativeMain/appleMain/watchosMain/watchosSimulatorArm64Main"),
            Map.entry("watchosSimulatorArm64Test", "src/nativeTest/appleTest/watchosTest/watchosSimulatorArm64Test"));

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
