import groovy.json.JsonSlurper
import org.gradle.api.file.DuplicatesStrategy
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.publish.maven.tasks.PublishToMavenRepository
import org.gradle.api.tasks.bundling.Jar
import org.gradle.api.tasks.bundling.Zip
import org.gradle.plugins.signing.Sign
import org.gradle.plugins.signing.SigningExtension
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.util.Base64
import java.util.UUID

// ============================================================================
// Maven Central Publishing & Signing (gradle/publishing.gradle.kts)
// ============================================================================

fun boolProperty(name: String, default: Boolean = false): Boolean =
    providers.gradleProperty(name).map { it.trim().lowercase() == "true" }.getOrElse(default)

val publishProjectName = providers.gradleProperty("project.name").getOrElse("unnamed-project")
val jvmFfiEnabled = boolProperty("project.ffi.jvm")
val kotlin = extensions.getByType<KotlinMultiplatformExtension>()
val publishing = extensions.getByType<PublishingExtension>()

val emptyJavadocJar =
    tasks.register<Jar>("emptyJavadocJar") {
        description = "Empty javadoc jar required by Maven Central for every publication."
        archiveClassifier.set("javadoc")
    }

publishing.apply {
    publications.withType<MavenPublication>().configureEach {
        artifactId =
            if (name == "kotlinMultiplatform" || artifactId == project.name) {
                publishProjectName
            } else {
                "$publishProjectName-${artifactId.removePrefix("${project.name}-")}"
            }
        artifact(emptyJavadocJar)
        pom {
            name.set(publishProjectName)
            description.set(providers.gradleProperty("project.pom.description").getOrElse(""))
            inceptionYear.set("2026")
            url.set("https://github.com/KotlinMania/$publishProjectName")
            licenses {
                license {
                    name.set(providers.gradleProperty("project.pom.licenseName").getOrElse("MIT"))
                    url.set(
                        providers
                            .gradleProperty("project.pom.licenseUrl")
                            .getOrElse("https://opensource.org/licenses/MIT"),
                    )
                    distribution.set("repo")
                }
            }
            developers {
                developer {
                    id.set("sydneyrenee")
                    name.set("Sydney Renee")
                    email.set("sydney@solace.ofharmony.ai")
                    url.set("https://github.com/sydneyrenee")
                    organization.set("KotlinMania")
                    organizationUrl.set("https://github.com/KotlinMania")
                }
            }
            scm {
                url.set("https://github.com/KotlinMania/$publishProjectName")
                connection.set("scm:git:git://github.com/KotlinMania/$publishProjectName.git")
                developerConnection.set("scm:git:ssh://github.com/KotlinMania/$publishProjectName.git")
            }
        }
    }

    repositories {
        maven {
            name = "centralPortalStaging"
            url = uri(layout.buildDirectory.dir("staging-deploy"))
        }
    }
}

extensions.configure<SigningExtension> {
    val signingKey = providers.gradleProperty("signingInMemoryKey").orNull
    val signingKeyId = providers.gradleProperty("signingInMemoryKeyId").orNull
    val signingPassword = providers.gradleProperty("signingInMemoryKeyPassword").orNull
    val signingEnabled = project.findProperty("RELEASE_SIGNING_ENABLED") != "false" && signingKey != null
    if (signingEnabled) {
        useInMemoryPgpKeys(signingKeyId, signingKey, signingPassword)
        sign(publishing.publications)
    }
}

val centralPortalPublishTasks =
    tasks.withType<PublishToMavenRepository>().matching {
        it.name.endsWith("ToCentralPortalStagingRepository")
    }

centralPortalPublishTasks.configureEach {
    dependsOn(tasks.withType<Sign>())
}

val centralPortalBundle =
    tasks.register<Zip>("centralPortalBundle") {
        group = "publishing"
        description = "Bundles the staged Maven artifacts into a Central Portal deployment zip."
        dependsOn(centralPortalPublishTasks)
        from(layout.buildDirectory.dir("staging-deploy"))
        archiveFileName.set("$publishProjectName-$version-bundle.zip")
        destinationDirectory.set(layout.buildDirectory.dir("central-portal"))
    }

val publishToCentralPortal =
    tasks.register("publishToCentralPortal") {
        group = "publishing"
        description = "Uploads the deployment bundle to the Sonatype Central Portal."
        dependsOn(centralPortalBundle)
        if (jvmFfiEnabled) {
            dependsOn("verifyJniDistribution")
        }
        doLast {
            val user =
                providers.gradleProperty("mavenCentralUsername").orNull
                    ?: error("mavenCentralUsername is required to publish to the Central Portal.")
            val password =
                providers.gradleProperty("mavenCentralPassword").orNull
                    ?: error("mavenCentralPassword is required to publish to the Central Portal.")
            val publishingType = providers.gradleProperty("centralPublishingType").getOrElse("USER_MANAGED")
            val token = Base64.getEncoder().encodeToString("$user:$password".toByteArray(Charsets.UTF_8))

            val bundle =
                centralPortalBundle
                    .get()
                    .archiveFile
                    .get()
                    .asFile
            require(bundle.exists()) { "Deployment bundle not found: $bundle" }

            val boundary = "CentralPortalBoundary" + UUID.randomUUID().toString().replace("-", "")
            val crlf = "\r\n"
            val preamble =
                (
                    "--$boundary$crlf" +
                        "Content-Disposition: form-data; name=\"bundle\"; filename=\"${bundle.name}\"$crlf" +
                        "Content-Type: application/octet-stream$crlf$crlf"
                ).toByteArray(Charsets.UTF_8)
            val epilogue = "$crlf--$boundary--$crlf".toByteArray(Charsets.UTF_8)
            val body = preamble + bundle.readBytes() + epilogue

            val deploymentName = "$publishProjectName-$version"
            val uploadUri =
                URI(
                    "https://central.sonatype.com/api/v1/publisher/upload" +
                        "?name=$deploymentName&publishingType=$publishingType",
                )
            val request =
                HttpRequest
                    .newBuilder()
                    .uri(uploadUri)
                    .header("Authorization", "Bearer $token")
                    .header("Content-Type", "multipart/form-data; boundary=$boundary")
                    .POST(HttpRequest.BodyPublishers.ofByteArray(body))
                    .build()

            val client = HttpClient.newHttpClient()
            val response = client.send(request, HttpResponse.BodyHandlers.ofString())
            if (response.statusCode() !in 200..299) {
                error("Central Portal upload failed: HTTP ${response.statusCode()} — ${response.body()}")
            }
            val deploymentId = response.body().trim()
            logger.lifecycle(
                "Central Portal upload accepted (deployment id: $deploymentId). " +
                    "publishingType=$publishingType.",
            )
            val automaticPublishing = publishingType.equals("AUTOMATIC", ignoreCase = true)
            val terminalStates =
                if (automaticPublishing) {
                    setOf("PUBLISHED")
                } else {
                    setOf("VALIDATED", "PUBLISHED")
                }
            val statusUri = URI("https://central.sonatype.com/api/v1/publisher/status?id=$deploymentId")
            val statusAttempts =
                providers.gradleProperty("centralPublishStatusAttempts").map(String::toInt).getOrElse(120)
            val statusDelayMillis =
                providers.gradleProperty("centralPublishStatusDelayMillis").map(String::toLong).getOrElse(10_000L)
            repeat(statusAttempts) { attempt ->
                val statusRequest =
                    HttpRequest
                        .newBuilder()
                        .uri(statusUri)
                        .header("Authorization", "Bearer $token")
                        .POST(HttpRequest.BodyPublishers.noBody())
                        .build()
                val statusResponse = client.send(statusRequest, HttpResponse.BodyHandlers.ofString())
                if (statusResponse.statusCode() !in 200..299) {
                    error("Central Portal status check failed: HTTP ${statusResponse.statusCode()} — ${statusResponse.body()}")
                }
                val statusBody = JsonSlurper().parseText(statusResponse.body()) as Map<*, *>
                val deploymentState =
                    statusBody["deploymentState"]?.toString()
                        ?: error("Central Portal status response did not contain deploymentState: ${statusResponse.body()}")
                when (deploymentState) {
                    "FAILED" -> {
                        error("Central Portal deployment failed: ${statusBody["errors"] ?: statusResponse.body()}")
                    }

                    in terminalStates -> {
                        logger.lifecycle("Central Portal deployment $deploymentId reached $deploymentState.")
                        return@doLast
                    }
                }
                logger.lifecycle(
                    "Central Portal deployment $deploymentId is $deploymentState " +
                        "(${attempt + 1}/$statusAttempts).",
                )
                if (attempt + 1 < statusAttempts) {
                    Thread.sleep(statusDelayMillis)
                }
            }
            error(
                "Central Portal deployment $deploymentId did not reach " +
                    "${terminalStates.joinToString("/")} after $statusAttempts checks.",
            )
        }
    }

// kotlinmania:android-publication:v1 begin
val androidPublicationRoot =
    providers.provider {
        publishing.publications.getByName("kotlinMultiplatform") as MavenPublication
    }
tasks.register<Zip>("androidPublicationBundle") {
    group = "verification"
    val externalRoot = providers.gradleProperty("project.publication.android.rootStagingDirectory").orNull
    val root = androidPublicationRoot.get()
    val coordinatePath = "${root.groupId.replace('.', '/')}/$publishProjectName"
    dependsOn(tasks.named<PublishToMavenRepository>("publishAndroidPublicationToCentralPortalStagingRepository"))
    from(layout.buildDirectory.dir("staging-deploy")) {
        include("$coordinatePath-android/${root.version}/**")
    }
    if (externalRoot == null) {
        val hasAppleTargets =
            kotlin.targets
                .withType<KotlinNativeTarget>()
                .any { it.konanTarget.family.isAppleFamily }
        check(!hasAppleTargets || providers.systemProperty("os.name").get().startsWith("Mac")) {
            "Stage the real KMP root on macOS, then set project.publication.android.rootStagingDirectory and expectedRootHead"
        }
        dependsOn(tasks.named<PublishToMavenRepository>("publishKotlinMultiplatformPublicationToCentralPortalStagingRepository"))
        from(layout.buildDirectory.dir("staging-deploy")) {
            include("$coordinatePath/${root.version}/**")
        }
    } else {
        val rootDirectory = rootProject.file(externalRoot)
        val sourceReceipt = rootProject.file("$externalRoot.source-head")
        val expectedHead = providers.gradleProperty("project.publication.android.expectedRootHead")
        inputs.file(sourceReceipt)
        inputs.property("expectedRootHead", expectedHead)
        from(rootDirectory) { include("$coordinatePath/${root.version}/**") }
        doFirst {
            val head = expectedHead.orNull
            check(head != null && head.matches(Regex("[0-9a-f]{40}"))) { "Set expectedRootHead to the exact source commit" }
            check(rootDirectory.isDirectory && sourceReceipt.isFile && sourceReceipt.readText().trim() == head) {
                "Missing or stale same-head KMP root staging receipt: $sourceReceipt"
            }
            check(rootProject.file("$externalRoot/$coordinatePath/${root.version}/$publishProjectName-${root.version}.module").isFile) {
                "Missing real KMP root module metadata in $rootDirectory"
            }
        }
    }
    duplicatesStrategy = DuplicatesStrategy.FAIL
    archiveFileName.set("android-publication.zip")
    destinationDirectory.set(layout.buildDirectory.dir("verification"))
}
// kotlinmania:android-publication:v1 end
