// port-lint: source psp.rs
package io.github.kotlinmania.libc

// PSP C type definitions
//
// These type declarations are not enough, as they must be ultimately resolved
// by the linker. Crates that use these definitions must, somewhere in the
// crate graph, include a Note provider crate such as the `psp` crate.

public typealias IntmaxT = Long

public typealias UintmaxT = ULong

public typealias SizeT = ULong

public typealias PtrdiffT = Long

public typealias IntptrT = Long

public typealias UintptrT = ULong

public typealias SsizeT = Long

public fun interface SceKernelVTimerHandler {
    public operator fun invoke(uid: SceUid, arg1: SceKernelSysClock?, arg2: SceKernelSysClock?, arg3: COpaquePointer?): UInt
}

public fun interface SceKernelVTimerHandlerWide {
    public operator fun invoke(uid: SceUid, arg1: Long, arg2: Long, arg3: COpaquePointer?): UInt
}

public fun interface SceKernelThreadEventHandler {
    public operator fun invoke(mask: Int, thid: SceUid, common: COpaquePointer?): Int
}

public fun interface SceKernelAlarmHandler {
    public operator fun invoke(common: COpaquePointer?): UInt
}

public fun interface SceKernelCallbackFunction {
    public operator fun invoke(arg1: Int, arg2: Int, arg: COpaquePointer?): Int
}

public fun interface SceKernelThreadEntry {
    public operator fun invoke(args: ULong, argp: COpaquePointer?): Int
}

public fun interface PowerCallback {
    public operator fun invoke(unknown: Int, powerInfo: Int)
}

public typealias IoPermissions = Int

public fun interface UmdCallback {
    public operator fun invoke(unknown: Int, event: Int): Int
}

public fun interface SceMpegRingbufferCbFn {
    public operator fun invoke(data: COpaquePointer?, numPackets: Int, param: COpaquePointer?): Int
}

public typealias SceMpegRingbufferCb = SceMpegRingbufferCbFn?

public fun interface GuCallbackFn {
    public operator fun invoke(id: Int, arg: COpaquePointer?)
}

public typealias GuCallback = GuCallbackFn?

public fun interface GuSwapBuffersCallbackFn {
    public operator fun invoke(display: COpaquePointer?, render: COpaquePointer?)
}

public typealias GuSwapBuffersCallback = GuSwapBuffersCallbackFn?

public fun interface SceNetAdhocctlHandlerFn {
    public operator fun invoke(flag: Int, error: Int, unknown: COpaquePointer?)
}

public typealias SceNetAdhocctlHandler = SceNetAdhocctlHandlerFn?

public fun interface AdhocMatchingCallbackFn {
    public operator fun invoke(matchingId: Int, event: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?)
}

public typealias AdhocMatchingCallback = AdhocMatchingCallbackFn?

public fun interface SceNetApctlHandlerFn {
    public operator fun invoke(oldState: Int, newState: Int, event: Int, error: Int, pArg: COpaquePointer?)
}

public typealias SceNetApctlHandler = SceNetApctlHandlerFn?

public fun interface HttpMallocFunctionFn {
    public operator fun invoke(size: ULong): COpaquePointer?
}

public typealias HttpMallocFunction = HttpMallocFunctionFn?

public fun interface HttpReallocFunctionFn {
    public operator fun invoke(p: COpaquePointer?, size: ULong): COpaquePointer?
}

public typealias HttpReallocFunction = HttpReallocFunctionFn?

public fun interface HttpFreeFunctionFn {
    public operator fun invoke(p: COpaquePointer?)
}

public typealias HttpFreeFunction = HttpFreeFunctionFn?

public fun interface HttpPasswordCBFn {
    public operator fun invoke(request: Int, authType: HttpAuthType, realm: COpaquePointer?, username: COpaquePointer?, password: COpaquePointer?, needEntity: Int, entityBody: COpaquePointer?, entitySize: ULong?, save: Int?): Int
}

public typealias HttpPasswordCB = HttpPasswordCBFn?

public typealias SocklenT = UInt

public sealed class AudioFormat(public val value: UInt) {
    public data object Stereo : AudioFormat(0u)
    public data object Mono : AudioFormat(0x10u)
}

public sealed class DisplayMode(public val value: UInt) {
    public data object Lcd : DisplayMode(0u)
}

public sealed class DisplayPixelFormat(public val value: UInt) {
    public data object Psm5650 : DisplayPixelFormat(0u)
    public data object Psm5551 : DisplayPixelFormat(1u)
    public data object Psm4444 : DisplayPixelFormat(2u)
    public data object Psm8888 : DisplayPixelFormat(3u)
}

public sealed class DisplaySetBufSync(public val value: UInt) {
    public data object Immediate : DisplaySetBufSync(0u)
    public data object NextFrame : DisplaySetBufSync(1u)
}

public sealed class AudioOutputFrequency(public val value: Int) {
    public data object Khz48 : AudioOutputFrequency(48000)
    public data object Khz441 : AudioOutputFrequency(44100)
    public data object Khz32 : AudioOutputFrequency(32000)
    public data object Khz24 : AudioOutputFrequency(24000)
    public data object Khz2205 : AudioOutputFrequency(22050)
    public data object Khz16 : AudioOutputFrequency(16000)
    public data object Khz12 : AudioOutputFrequency(12000)
    public data object Khz11025 : AudioOutputFrequency(11025)
    public data object Khz8 : AudioOutputFrequency(8000)
}

public sealed class AudioInputFrequency(public val value: Int) {
    public data object Khz441 : AudioInputFrequency(44100)
    public data object Khz2205 : AudioInputFrequency(22050)
    public data object Khz11025 : AudioInputFrequency(11025)
}

public sealed class CtrlMode(public val value: UInt) {
    public data object Digital : CtrlMode(0u)
    public data object Analog : CtrlMode(Digital.value + 1u)
}

public sealed class GeMatrixType(public val value: Int) {
    public data object Bone0 : GeMatrixType(0)
    public data object Bone1 : GeMatrixType(Bone0.value + 1)
    public data object Bone2 : GeMatrixType(Bone1.value + 1)
    public data object Bone3 : GeMatrixType(Bone2.value + 1)
    public data object Bone4 : GeMatrixType(Bone3.value + 1)
    public data object Bone5 : GeMatrixType(Bone4.value + 1)
    public data object Bone6 : GeMatrixType(Bone5.value + 1)
    public data object Bone7 : GeMatrixType(Bone6.value + 1)
    public data object World : GeMatrixType(Bone7.value + 1)
    public data object View : GeMatrixType(World.value + 1)
    public data object Projection : GeMatrixType(View.value + 1)
    public data object TexGen : GeMatrixType(Projection.value + 1)
}

public sealed class GeListState(public val value: Int) {
    public data object Done : GeListState(0)
    public data object Queued : GeListState(Done.value + 1)
    public data object DrawingDone : GeListState(Queued.value + 1)
    public data object StallReached : GeListState(DrawingDone.value + 1)
    public data object CancelDone : GeListState(StallReached.value + 1)
}

public sealed class GeCommand(public val value: UByte) {
    public data object Nop : GeCommand(0u)
    public data object Vaddr : GeCommand(0x1u)
    public data object Iaddr : GeCommand(0x2u)
    public data object Prim : GeCommand(0x4u)
    public data object Bezier : GeCommand(0x5u)
    public data object Spline : GeCommand(0x6u)
    public data object BoundingBox : GeCommand(0x7u)
    public data object Jump : GeCommand(0x8u)
    public data object BJump : GeCommand(0x9u)
    public data object Call : GeCommand(0xau)
    public data object Ret : GeCommand(0xbu)
    public data object End : GeCommand(0xcu)
    public data object Signal : GeCommand(0xeu)
    public data object Finish : GeCommand(0xfu)
    public data object Base : GeCommand(0x10u)
    public data object VertexType : GeCommand(0x12u)
    public data object OffsetAddr : GeCommand(0x13u)
    public data object Origin : GeCommand(0x14u)
    public data object Region1 : GeCommand(0x15u)
    public data object Region2 : GeCommand(0x16u)
    public data object LightingEnable : GeCommand(0x17u)
    public data object LightEnable0 : GeCommand(0x18u)
    public data object LightEnable1 : GeCommand(0x19u)
    public data object LightEnable2 : GeCommand(0x1au)
    public data object LightEnable3 : GeCommand(0x1bu)
    public data object DepthClampEnable : GeCommand(0x1cu)
    public data object CullFaceEnable : GeCommand(0x1du)
    public data object TextureMapEnable : GeCommand(0x1eu)
    public data object FogEnable : GeCommand(0x1fu)
    public data object DitherEnable : GeCommand(0x20u)
    public data object AlphaBlendEnable : GeCommand(0x21u)
    public data object AlphaTestEnable : GeCommand(0x22u)
    public data object ZTestEnable : GeCommand(0x23u)
    public data object StencilTestEnable : GeCommand(0x24u)
    public data object AntiAliasEnable : GeCommand(0x25u)
    public data object PatchCullEnable : GeCommand(0x26u)
    public data object ColorTestEnable : GeCommand(0x27u)
    public data object LogicOpEnable : GeCommand(0x28u)
    public data object BoneMatrixNumber : GeCommand(0x2au)
    public data object BoneMatrixData : GeCommand(0x2bu)
    public data object MorphWeight0 : GeCommand(0x2cu)
    public data object MorphWeight1 : GeCommand(0x2du)
    public data object MorphWeight2 : GeCommand(0x2eu)
    public data object MorphWeight3 : GeCommand(0x2fu)
    public data object MorphWeight4 : GeCommand(0x30u)
    public data object MorphWeight5 : GeCommand(0x31u)
    public data object MorphWeight6 : GeCommand(0x32u)
    public data object MorphWeight7 : GeCommand(0x33u)
    public data object PatchDivision : GeCommand(0x36u)
    public data object PatchPrimitive : GeCommand(0x37u)
    public data object PatchFacing : GeCommand(0x38u)
    public data object WorldMatrixNumber : GeCommand(0x3au)
    public data object WorldMatrixData : GeCommand(0x3bu)
    public data object ViewMatrixNumber : GeCommand(0x3cu)
    public data object ViewMatrixData : GeCommand(0x3du)
    public data object ProjMatrixNumber : GeCommand(0x3eu)
    public data object ProjMatrixData : GeCommand(0x3fu)
    public data object TGenMatrixNumber : GeCommand(0x40u)
    public data object TGenMatrixData : GeCommand(0x41u)
    public data object ViewportXScale : GeCommand(0x42u)
    public data object ViewportYScale : GeCommand(0x43u)
    public data object ViewportZScale : GeCommand(0x44u)
    public data object ViewportXCenter : GeCommand(0x45u)
    public data object ViewportYCenter : GeCommand(0x46u)
    public data object ViewportZCenter : GeCommand(0x47u)
    public data object TexScaleU : GeCommand(0x48u)
    public data object TexScaleV : GeCommand(0x49u)
    public data object TexOffsetU : GeCommand(0x4au)
    public data object TexOffsetV : GeCommand(0x4bu)
    public data object OffsetX : GeCommand(0x4cu)
    public data object OffsetY : GeCommand(0x4du)
    public data object ShadeMode : GeCommand(0x50u)
    public data object ReverseNormal : GeCommand(0x51u)
    public data object MaterialUpdate : GeCommand(0x53u)
    public data object MaterialEmissive : GeCommand(0x54u)
    public data object MaterialAmbient : GeCommand(0x55u)
    public data object MaterialDiffuse : GeCommand(0x56u)
    public data object MaterialSpecular : GeCommand(0x57u)
    public data object MaterialAlpha : GeCommand(0x58u)
    public data object MaterialSpecularCoef : GeCommand(0x5bu)
    public data object AmbientColor : GeCommand(0x5cu)
    public data object AmbientAlpha : GeCommand(0x5du)
    public data object LightMode : GeCommand(0x5eu)
    public data object LightType0 : GeCommand(0x5fu)
    public data object LightType1 : GeCommand(0x60u)
    public data object LightType2 : GeCommand(0x61u)
    public data object LightType3 : GeCommand(0x62u)
    public data object Light0X : GeCommand(0x63u)
    public data object Light0Y : GeCommand((Light0X.value + 1u).toUByte())
    public data object Light0Z : GeCommand((Light0Y.value + 1u).toUByte())
    public data object Light1X : GeCommand((Light0Z.value + 1u).toUByte())
    public data object Light1Y : GeCommand((Light1X.value + 1u).toUByte())
    public data object Light1Z : GeCommand((Light1Y.value + 1u).toUByte())
    public data object Light2X : GeCommand((Light1Z.value + 1u).toUByte())
    public data object Light2Y : GeCommand((Light2X.value + 1u).toUByte())
    public data object Light2Z : GeCommand((Light2Y.value + 1u).toUByte())
    public data object Light3X : GeCommand((Light2Z.value + 1u).toUByte())
    public data object Light3Y : GeCommand((Light3X.value + 1u).toUByte())
    public data object Light3Z : GeCommand((Light3Y.value + 1u).toUByte())
    public data object Light0DirectionX : GeCommand(0x6fu)
    public data object Light0DirectionY : GeCommand((Light0DirectionX.value + 1u).toUByte())
    public data object Light0DirectionZ : GeCommand((Light0DirectionY.value + 1u).toUByte())
    public data object Light1DirectionX : GeCommand((Light0DirectionZ.value + 1u).toUByte())
    public data object Light1DirectionY : GeCommand((Light1DirectionX.value + 1u).toUByte())
    public data object Light1DirectionZ : GeCommand((Light1DirectionY.value + 1u).toUByte())
    public data object Light2DirectionX : GeCommand((Light1DirectionZ.value + 1u).toUByte())
    public data object Light2DirectionY : GeCommand((Light2DirectionX.value + 1u).toUByte())
    public data object Light2DirectionZ : GeCommand((Light2DirectionY.value + 1u).toUByte())
    public data object Light3DirectionX : GeCommand((Light2DirectionZ.value + 1u).toUByte())
    public data object Light3DirectionY : GeCommand((Light3DirectionX.value + 1u).toUByte())
    public data object Light3DirectionZ : GeCommand((Light3DirectionY.value + 1u).toUByte())
    public data object Light0ConstantAtten : GeCommand(0x7bu)
    public data object Light0LinearAtten : GeCommand((Light0ConstantAtten.value + 1u).toUByte())
    public data object Light0QuadtraticAtten : GeCommand((Light0LinearAtten.value + 1u).toUByte())
    public data object Light1ConstantAtten : GeCommand((Light0QuadtraticAtten.value + 1u).toUByte())
    public data object Light1LinearAtten : GeCommand((Light1ConstantAtten.value + 1u).toUByte())
    public data object Light1QuadtraticAtten : GeCommand((Light1LinearAtten.value + 1u).toUByte())
    public data object Light2ConstantAtten : GeCommand((Light1QuadtraticAtten.value + 1u).toUByte())
    public data object Light2LinearAtten : GeCommand((Light2ConstantAtten.value + 1u).toUByte())
    public data object Light2QuadtraticAtten : GeCommand((Light2LinearAtten.value + 1u).toUByte())
    public data object Light3ConstantAtten : GeCommand((Light2QuadtraticAtten.value + 1u).toUByte())
    public data object Light3LinearAtten : GeCommand((Light3ConstantAtten.value + 1u).toUByte())
    public data object Light3QuadtraticAtten : GeCommand((Light3LinearAtten.value + 1u).toUByte())
    public data object Light0ExponentAtten : GeCommand(0x87u)
    public data object Light1ExponentAtten : GeCommand((Light0ExponentAtten.value + 1u).toUByte())
    public data object Light2ExponentAtten : GeCommand((Light1ExponentAtten.value + 1u).toUByte())
    public data object Light3ExponentAtten : GeCommand((Light2ExponentAtten.value + 1u).toUByte())
    public data object Light0CutoffAtten : GeCommand(0x8bu)
    public data object Light1CutoffAtten : GeCommand((Light0CutoffAtten.value + 1u).toUByte())
    public data object Light2CutoffAtten : GeCommand((Light1CutoffAtten.value + 1u).toUByte())
    public data object Light3CutoffAtten : GeCommand((Light2CutoffAtten.value + 1u).toUByte())
    public data object Light0Ambient : GeCommand(0x8fu)
    public data object Light0Diffuse : GeCommand((Light0Ambient.value + 1u).toUByte())
    public data object Light0Specular : GeCommand((Light0Diffuse.value + 1u).toUByte())
    public data object Light1Ambient : GeCommand((Light0Specular.value + 1u).toUByte())
    public data object Light1Diffuse : GeCommand((Light1Ambient.value + 1u).toUByte())
    public data object Light1Specular : GeCommand((Light1Diffuse.value + 1u).toUByte())
    public data object Light2Ambient : GeCommand((Light1Specular.value + 1u).toUByte())
    public data object Light2Diffuse : GeCommand((Light2Ambient.value + 1u).toUByte())
    public data object Light2Specular : GeCommand((Light2Diffuse.value + 1u).toUByte())
    public data object Light3Ambient : GeCommand((Light2Specular.value + 1u).toUByte())
    public data object Light3Diffuse : GeCommand((Light3Ambient.value + 1u).toUByte())
    public data object Light3Specular : GeCommand((Light3Diffuse.value + 1u).toUByte())
    public data object Cull : GeCommand(0x9bu)
    public data object FrameBufPtr : GeCommand(0x9cu)
    public data object FrameBufWidth : GeCommand(0x9du)
    public data object ZBufPtr : GeCommand(0x9eu)
    public data object ZBufWidth : GeCommand(0x9fu)
    public data object TexAddr0 : GeCommand(0xa0u)
    public data object TexAddr1 : GeCommand((TexAddr0.value + 1u).toUByte())
    public data object TexAddr2 : GeCommand((TexAddr1.value + 1u).toUByte())
    public data object TexAddr3 : GeCommand((TexAddr2.value + 1u).toUByte())
    public data object TexAddr4 : GeCommand((TexAddr3.value + 1u).toUByte())
    public data object TexAddr5 : GeCommand((TexAddr4.value + 1u).toUByte())
    public data object TexAddr6 : GeCommand((TexAddr5.value + 1u).toUByte())
    public data object TexAddr7 : GeCommand((TexAddr6.value + 1u).toUByte())
    public data object TexBufWidth0 : GeCommand(0xa8u)
    public data object TexBufWidth1 : GeCommand((TexBufWidth0.value + 1u).toUByte())
    public data object TexBufWidth2 : GeCommand((TexBufWidth1.value + 1u).toUByte())
    public data object TexBufWidth3 : GeCommand((TexBufWidth2.value + 1u).toUByte())
    public data object TexBufWidth4 : GeCommand((TexBufWidth3.value + 1u).toUByte())
    public data object TexBufWidth5 : GeCommand((TexBufWidth4.value + 1u).toUByte())
    public data object TexBufWidth6 : GeCommand((TexBufWidth5.value + 1u).toUByte())
    public data object TexBufWidth7 : GeCommand((TexBufWidth6.value + 1u).toUByte())
    public data object ClutAddr : GeCommand(0xb0u)
    public data object ClutAddrUpper : GeCommand(0xb1u)
    public data object TransferSrc : GeCommand((ClutAddrUpper.value + 1u).toUByte())
    public data object TransferSrcW : GeCommand((TransferSrc.value + 1u).toUByte())
    public data object TransferDst : GeCommand((TransferSrcW.value + 1u).toUByte())
    public data object TransferDstW : GeCommand((TransferDst.value + 1u).toUByte())
    public data object TexSize0 : GeCommand(0xb8u)
    public data object TexSize1 : GeCommand((TexSize0.value + 1u).toUByte())
    public data object TexSize2 : GeCommand((TexSize1.value + 1u).toUByte())
    public data object TexSize3 : GeCommand((TexSize2.value + 1u).toUByte())
    public data object TexSize4 : GeCommand((TexSize3.value + 1u).toUByte())
    public data object TexSize5 : GeCommand((TexSize4.value + 1u).toUByte())
    public data object TexSize6 : GeCommand((TexSize5.value + 1u).toUByte())
    public data object TexSize7 : GeCommand((TexSize6.value + 1u).toUByte())
    public data object TexMapMode : GeCommand(0xc0u)
    public data object TexShadeLs : GeCommand(0xc1u)
    public data object TexMode : GeCommand(0xc2u)
    public data object TexFormat : GeCommand(0xc3u)
    public data object LoadClut : GeCommand(0xc4u)
    public data object ClutFormat : GeCommand(0xc5u)
    public data object TexFilter : GeCommand(0xc6u)
    public data object TexWrap : GeCommand(0xc7u)
    public data object TexLevel : GeCommand(0xc8u)
    public data object TexFunc : GeCommand(0xc9u)
    public data object TexEnvColor : GeCommand(0xcau)
    public data object TexFlush : GeCommand(0xcbu)
    public data object TexSync : GeCommand(0xccu)
    public data object Fog1 : GeCommand(0xcdu)
    public data object Fog2 : GeCommand(0xceu)
    public data object FogColor : GeCommand(0xcfu)
    public data object TexLodSlope : GeCommand(0xd0u)
    public data object FramebufPixFormat : GeCommand(0xd2u)
    public data object ClearMode : GeCommand(0xd3u)
    public data object Scissor1 : GeCommand(0xd4u)
    public data object Scissor2 : GeCommand(0xd5u)
    public data object MinZ : GeCommand(0xd6u)
    public data object MaxZ : GeCommand(0xd7u)
    public data object ColorTest : GeCommand(0xd8u)
    public data object ColorRef : GeCommand(0xd9u)
    public data object ColorTestmask : GeCommand(0xdau)
    public data object AlphaTest : GeCommand(0xdbu)
    public data object StencilTest : GeCommand(0xdcu)
    public data object StencilOp : GeCommand(0xddu)
    public data object ZTest : GeCommand(0xdeu)
    public data object BlendMode : GeCommand(0xdfu)
    public data object BlendFixedA : GeCommand(0xe0u)
    public data object BlendFixedB : GeCommand(0xe1u)
    public data object Dith0 : GeCommand(0xe2u)
    public data object Dith1 : GeCommand((Dith0.value + 1u).toUByte())
    public data object Dith2 : GeCommand((Dith1.value + 1u).toUByte())
    public data object Dith3 : GeCommand((Dith2.value + 1u).toUByte())
    public data object LogicOp : GeCommand(0xe6u)
    public data object ZWriteDisable : GeCommand(0xe7u)
    public data object MaskRgb : GeCommand(0xe8u)
    public data object MaskAlpha : GeCommand(0xe9u)
    public data object TransferStart : GeCommand(0xeau)
    public data object TransferSrcPos : GeCommand(0xebu)
    public data object TransferDstPos : GeCommand(0xecu)
    public data object TransferSize : GeCommand(0xeeu)
    public data object Vscx : GeCommand(0xf0u)
    public data object Vscy : GeCommand(0xf1u)
    public data object Vscz : GeCommand(0xf2u)
    public data object Vtcs : GeCommand(0xf3u)
    public data object Vtct : GeCommand(0xf4u)
    public data object Vtcq : GeCommand(0xf5u)
    public data object Vcv : GeCommand(0xf6u)
    public data object Vap : GeCommand(0xf7u)
    public data object Vfc : GeCommand(0xf8u)
    public data object Vscv : GeCommand(0xf9u)
    public data object Unknown03 : GeCommand(0x03u)
    public data object Unknown0D : GeCommand(0x0du)
    public data object Unknown11 : GeCommand(0x11u)
    public data object Unknown29 : GeCommand(0x29u)
    public data object Unknown34 : GeCommand(0x34u)
    public data object Unknown35 : GeCommand(0x35u)
    public data object Unknown39 : GeCommand(0x39u)
    public data object Unknown4E : GeCommand(0x4eu)
    public data object Unknown4F : GeCommand(0x4fu)
    public data object Unknown52 : GeCommand(0x52u)
    public data object Unknown59 : GeCommand(0x59u)
    public data object Unknown5A : GeCommand(0x5au)
    public data object UnknownB6 : GeCommand(0xb6u)
    public data object UnknownB7 : GeCommand(0xb7u)
    public data object UnknownD1 : GeCommand(0xd1u)
    public data object UnknownED : GeCommand(0xedu)
    public data object UnknownEF : GeCommand(0xefu)
    public data object UnknownFA : GeCommand(0xfau)
    public data object UnknownFB : GeCommand(0xfbu)
    public data object UnknownFC : GeCommand(0xfcu)
    public data object UnknownFD : GeCommand(0xfdu)
    public data object UnknownFE : GeCommand(0xfeu)
    public data object NopFF : GeCommand(0xffu)
}

public sealed class SceSysMemPartitionId(public val value: Int) {
    public data object SceKernelUnknownPartition : SceSysMemPartitionId(0)
    public data object SceKernelPrimaryKernelPartition : SceSysMemPartitionId(1)
    public data object SceKernelPrimaryUserPartition : SceSysMemPartitionId(2)
    public data object SceKernelOtherKernelPartition1 : SceSysMemPartitionId(3)
    public data object SceKernelOtherKernelPartition2 : SceSysMemPartitionId(4)
    public data object SceKernelVshellPARTITION : SceSysMemPartitionId(5)
    public data object SceKernelScUserPartition : SceSysMemPartitionId(6)
    public data object SceKernelMeUserPartition : SceSysMemPartitionId(7)
    public data object SceKernelExtendedScKernelPartition : SceSysMemPartitionId(8)
    public data object SceKernelExtendedSc2KernelPartition : SceSysMemPartitionId(9)
    public data object SceKernelExtendedMeKernelPartition : SceSysMemPartitionId(10)
    public data object SceKernelVshellKernelPartition : SceSysMemPartitionId(11)
    public data object SceKernelExtendedKernelPartition : SceSysMemPartitionId(12)
}

public sealed class SceSysMemBlockTypes(public val value: Int) {
    public data object Low : SceSysMemBlockTypes(0)
    public data object High : SceSysMemBlockTypes(Low.value + 1)
    public data object Addr : SceSysMemBlockTypes(High.value + 1)
}

public sealed class Interrupt(public val value: UInt) {
    public data object Gpio : Interrupt(4u)
    public data object Ata : Interrupt(5u)
    public data object Umd : Interrupt(6u)
    public data object Mscm0 : Interrupt(7u)
    public data object Wlan : Interrupt(8u)
    public data object Audio : Interrupt(10u)
    public data object I2c : Interrupt(12u)
    public data object Sircs : Interrupt(14u)
    public data object Systimer0 : Interrupt(15u)
    public data object Systimer1 : Interrupt(16u)
    public data object Systimer2 : Interrupt(17u)
    public data object Systimer3 : Interrupt(18u)
    public data object Thread0 : Interrupt(19u)
    public data object Nand : Interrupt(20u)
    public data object Dmacplus : Interrupt(21u)
    public data object Dma0 : Interrupt(22u)
    public data object Dma1 : Interrupt(23u)
    public data object Memlmd : Interrupt(24u)
    public data object Ge : Interrupt(25u)
    public data object Vblank : Interrupt(30u)
    public data object Mecodec : Interrupt(31u)
    public data object Hpremote : Interrupt(36u)
    public data object Mscm1 : Interrupt(60u)
    public data object Mscm2 : Interrupt(61u)
    public data object Thread1 : Interrupt(65u)
    public data object Interrupt : Interrupt(66u)
}

public sealed class SubInterrupt(public val value: UInt) {
    public data object Gpio : SubInterrupt(Interrupt.Gpio.toUInt())
    public data object Ata : SubInterrupt(Interrupt.Ata.toUInt())
    public data object Umd : SubInterrupt(Interrupt.Umd.toUInt())
    public data object Dmacplus : SubInterrupt(Interrupt.Dmacplus.toUInt())
    public data object Ge : SubInterrupt(Interrupt.Ge.toUInt())
    public data object Display : SubInterrupt(Interrupt.Vblank.toUInt())
}

public sealed class SceKernelIdListType(public val value: UInt) {
    public data object Thread : SceKernelIdListType(1u)
    public data object Semaphore : SceKernelIdListType(2u)
    public data object EventFlag : SceKernelIdListType(3u)
    public data object Mbox : SceKernelIdListType(4u)
    public data object Vpl : SceKernelIdListType(5u)
    public data object Fpl : SceKernelIdListType(6u)
    public data object Mpipe : SceKernelIdListType(7u)
    public data object Callback : SceKernelIdListType(8u)
    public data object ThreadEventHandler : SceKernelIdListType(9u)
    public data object Alarm : SceKernelIdListType(10u)
    public data object VTimer : SceKernelIdListType(11u)
    public data object SleepThread : SceKernelIdListType(64u)
    public data object DelayThread : SceKernelIdListType(65u)
    public data object SuspendThread : SceKernelIdListType(66u)
    public data object DormantThread : SceKernelIdListType(67u)
}

public sealed class UsbCamResolution(public val value: Int) {
    public data object Px160120 : UsbCamResolution(0)
    public data object Px176144 : UsbCamResolution(1)
    public data object Px320240 : UsbCamResolution(2)
    public data object Px352288 : UsbCamResolution(3)
    public data object Px640480 : UsbCamResolution(4)
    public data object Px1024768 : UsbCamResolution(5)
    public data object Px1280960 : UsbCamResolution(6)
    public data object Px480272 : UsbCamResolution(7)
    public data object Px360272 : UsbCamResolution(8)
}

public sealed class UsbCamResolutionEx(public val value: Int) {
    public data object Px160120 : UsbCamResolutionEx(0)
    public data object Px176144 : UsbCamResolutionEx(1)
    public data object Px320240 : UsbCamResolutionEx(2)
    public data object Px352288 : UsbCamResolutionEx(3)
    public data object Px360272 : UsbCamResolutionEx(4)
    public data object Px480272 : UsbCamResolutionEx(5)
    public data object Px640480 : UsbCamResolutionEx(6)
    public data object Px1024768 : UsbCamResolutionEx(7)
    public data object Px1280960 : UsbCamResolutionEx(8)
}

public sealed class UsbCamDelay(public val value: Int) {
    public data object NoDelay : UsbCamDelay(0)
    public data object Delay10Sec : UsbCamDelay(1)
    public data object Delay20Sec : UsbCamDelay(2)
    public data object Delay30Sec : UsbCamDelay(3)
}

public sealed class UsbCamFrameRate(public val value: Int) {
    public data object Fps375 : UsbCamFrameRate(0)
    public data object Fps5 : UsbCamFrameRate(1)
    public data object Fps75 : UsbCamFrameRate(2)
    public data object Fps10 : UsbCamFrameRate(3)
    public data object Fps15 : UsbCamFrameRate(4)
    public data object Fps20 : UsbCamFrameRate(5)
    public data object Fps30 : UsbCamFrameRate(6)
    public data object Fps60 : UsbCamFrameRate(7)
}

public sealed class UsbCamWb(public val value: Int) {
    public data object Auto : UsbCamWb(0)
    public data object Daylight : UsbCamWb(1)
    public data object Fluorescent : UsbCamWb(2)
    public data object Incadescent : UsbCamWb(3)
}

public sealed class UsbCamEffectMode(public val value: Int) {
    public data object Normal : UsbCamEffectMode(0)
    public data object Negative : UsbCamEffectMode(1)
    public data object Blackwhite : UsbCamEffectMode(2)
    public data object Sepia : UsbCamEffectMode(3)
    public data object Blue : UsbCamEffectMode(4)
    public data object Red : UsbCamEffectMode(5)
    public data object Green : UsbCamEffectMode(6)
}

public sealed class UsbCamEvLevel(public val value: Int) {
    public data object Pos20 : UsbCamEvLevel(0)
    public data object Pos17 : UsbCamEvLevel(1)
    public data object Pos15 : UsbCamEvLevel(2)
    public data object Pos13 : UsbCamEvLevel(3)
    public data object Pos10 : UsbCamEvLevel(4)
    public data object Pos07 : UsbCamEvLevel(5)
    public data object Pos05 : UsbCamEvLevel(6)
    public data object Pos03 : UsbCamEvLevel(7)
    public data object Zero : UsbCamEvLevel(8)
    public data object Neg03 : UsbCamEvLevel(Zero.value + 1)
    public data object Neg05 : UsbCamEvLevel(Neg03.value + 1)
    public data object Neg07 : UsbCamEvLevel(Neg05.value + 1)
    public data object Neg10 : UsbCamEvLevel(Neg07.value + 1)
    public data object Neg13 : UsbCamEvLevel(Neg10.value + 1)
    public data object Neg15 : UsbCamEvLevel(Neg13.value + 1)
    public data object Neg17 : UsbCamEvLevel(Neg15.value + 1)
    public data object Neg20 : UsbCamEvLevel(Neg17.value + 1)
}

public sealed class RtcCheckValidError(public val value: Int) {
    public data object InvalidYear : RtcCheckValidError(-1)
    public data object InvalidMonth : RtcCheckValidError(-2)
    public data object InvalidDay : RtcCheckValidError(-3)
    public data object InvalidHour : RtcCheckValidError(-4)
    public data object InvalidMinutes : RtcCheckValidError(-5)
    public data object InvalidSeconds : RtcCheckValidError(-6)
    public data object InvalidMicroseconds : RtcCheckValidError(-7)
}

public sealed class PowerTick(public val value: UInt) {
    public data object All : PowerTick(0u)
    public data object Suspend : PowerTick(1u)
    public data object Display : PowerTick(6u)
}

public sealed class IoAssignPerms(public val value: UInt) {
    public data object RdWr : IoAssignPerms(0u)
    public data object RdOnly : IoAssignPerms(1u)
}

public sealed class IoWhence(public val value: UInt) {
    public data object Set : IoWhence(0u)
    public data object Cur : IoWhence(1u)
    public data object End : IoWhence(2u)
}

public sealed class UmdType(public val value: UInt) {
    public data object Game : UmdType(0x10u)
    public data object Video : UmdType(0x20u)
    public data object Audio : UmdType(0x40u)
}

public sealed class GuPrimitive(public val value: UInt) {
    public data object Points : GuPrimitive(0u)
    public data object Lines : GuPrimitive(1u)
    public data object LineStrip : GuPrimitive(2u)
    public data object Triangles : GuPrimitive(3u)
    public data object TriangleStrip : GuPrimitive(4u)
    public data object TriangleFan : GuPrimitive(5u)
    public data object Sprites : GuPrimitive(6u)
}

public sealed class PatchPrimitive(public val value: UInt) {
    public data object Points : PatchPrimitive(0u)
    public data object LineStrip : PatchPrimitive(2u)
    public data object TriangleStrip : PatchPrimitive(4u)
}

public sealed class GuState(public val value: UInt) {
    public data object AlphaTest : GuState(0u)
    public data object DepthTest : GuState(1u)
    public data object ScissorTest : GuState(2u)
    public data object StencilTest : GuState(3u)
    public data object Blend : GuState(4u)
    public data object CullFace : GuState(5u)
    public data object Dither : GuState(6u)
    public data object Fog : GuState(7u)
    public data object ClipPlanes : GuState(8u)
    public data object Texture2D : GuState(9u)
    public data object Lighting : GuState(10u)
    public data object Light0 : GuState(11u)
    public data object Light1 : GuState(12u)
    public data object Light2 : GuState(13u)
    public data object Light3 : GuState(14u)
    public data object LineSmooth : GuState(15u)
    public data object PatchCullFace : GuState(16u)
    public data object ColorTest : GuState(17u)
    public data object ColorLogicOp : GuState(18u)
    public data object FaceNormalReverse : GuState(19u)
    public data object PatchFace : GuState(20u)
    public data object Fragment2X : GuState(21u)
}

public sealed class MatrixMode(public val value: UInt) {
    public data object Projection : MatrixMode(0u)
    public data object View : MatrixMode(1u)
    public data object Model : MatrixMode(2u)
    public data object Texture : MatrixMode(3u)
}

public sealed class TexturePixelFormat(public val value: UInt) {
    public data object Psm5650 : TexturePixelFormat(0u)
    public data object Psm5551 : TexturePixelFormat(1u)
    public data object Psm4444 : TexturePixelFormat(2u)
    public data object Psm8888 : TexturePixelFormat(3u)
    public data object PsmT4 : TexturePixelFormat(4u)
    public data object PsmT8 : TexturePixelFormat(5u)
    public data object PsmT16 : TexturePixelFormat(6u)
    public data object PsmT32 : TexturePixelFormat(7u)
    public data object PsmDxt1 : TexturePixelFormat(8u)
    public data object PsmDxt3 : TexturePixelFormat(9u)
    public data object PsmDxt5 : TexturePixelFormat(10u)
}

public sealed class SplineMode(public val value: UInt) {
    public data object FillFill : SplineMode(0u)
    public data object OpenFill : SplineMode(1u)
    public data object FillOpen : SplineMode(2u)
    public data object OpenOpen : SplineMode(3u)
}

public sealed class ShadingModel(public val value: UInt) {
    public data object Flat : ShadingModel(0u)
    public data object Smooth : ShadingModel(1u)
}

public sealed class LogicalOperation(public val value: UInt) {
    public data object Clear : LogicalOperation(0u)
    public data object And : LogicalOperation(1u)
    public data object AndReverse : LogicalOperation(2u)
    public data object Copy : LogicalOperation(3u)
    public data object AndInverted : LogicalOperation(4u)
    public data object Noop : LogicalOperation(5u)
    public data object Xor : LogicalOperation(6u)
    public data object Or : LogicalOperation(7u)
    public data object Nor : LogicalOperation(8u)
    public data object Equiv : LogicalOperation(9u)
    public data object Inverted : LogicalOperation(10u)
    public data object OrReverse : LogicalOperation(11u)
    public data object CopyInverted : LogicalOperation(12u)
    public data object OrInverted : LogicalOperation(13u)
    public data object Nand : LogicalOperation(14u)
    public data object Set : LogicalOperation(15u)
}

public sealed class TextureFilter(public val value: UInt) {
    public data object Nearest : TextureFilter(0u)
    public data object Linear : TextureFilter(1u)
    public data object NearestMipmapNearest : TextureFilter(4u)
    public data object LinearMipmapNearest : TextureFilter(5u)
    public data object NearestMipmapLinear : TextureFilter(6u)
    public data object LinearMipmapLinear : TextureFilter(7u)
}

public sealed class TextureMapMode(public val value: UInt) {
    public data object TextureCoords : TextureMapMode(0u)
    public data object TextureMatrix : TextureMapMode(1u)
    public data object EnvironmentMap : TextureMapMode(2u)
}

public sealed class TextureLevelMode(public val value: UInt) {
    public data object Auto : TextureLevelMode(0u)
    public data object Const : TextureLevelMode(1u)
    public data object Slope : TextureLevelMode(2u)
}

public sealed class TextureProjectionMapMode(public val value: UInt) {
    public data object Position : TextureProjectionMapMode(0u)
    public data object Uv : TextureProjectionMapMode(1u)
    public data object NormalizedNormal : TextureProjectionMapMode(2u)
    public data object Normal : TextureProjectionMapMode(3u)
}

public sealed class GuTexWrapMode(public val value: UInt) {
    public data object Repeat : GuTexWrapMode(0u)
    public data object Clamp : GuTexWrapMode(1u)
}

public sealed class FrontFaceDirection(public val value: UInt) {
    public data object Clockwise : FrontFaceDirection(0u)
    public data object CounterClockwise : FrontFaceDirection(1u)
}

public sealed class AlphaFunc(public val value: UInt) {
    public data object Never : AlphaFunc(0u)
    public data object Always : AlphaFunc(Never.value + 1u)
    public data object Equal : AlphaFunc(Always.value + 1u)
    public data object NotEqual : AlphaFunc(Equal.value + 1u)
    public data object Less : AlphaFunc(NotEqual.value + 1u)
    public data object LessOrEqual : AlphaFunc(Less.value + 1u)
    public data object Greater : AlphaFunc(LessOrEqual.value + 1u)
    public data object GreaterOrEqual : AlphaFunc(Greater.value + 1u)
}

public sealed class StencilFunc(public val value: UInt) {
    public data object Never : StencilFunc(0u)
    public data object Always : StencilFunc(Never.value + 1u)
    public data object Equal : StencilFunc(Always.value + 1u)
    public data object NotEqual : StencilFunc(Equal.value + 1u)
    public data object Less : StencilFunc(NotEqual.value + 1u)
    public data object LessOrEqual : StencilFunc(Less.value + 1u)
    public data object Greater : StencilFunc(LessOrEqual.value + 1u)
    public data object GreaterOrEqual : StencilFunc(Greater.value + 1u)
}

public sealed class ColorFunc(public val value: UInt) {
    public data object Never : ColorFunc(0u)
    public data object Always : ColorFunc(Never.value + 1u)
    public data object Equal : ColorFunc(Always.value + 1u)
    public data object NotEqual : ColorFunc(Equal.value + 1u)
}

public sealed class DepthFunc(public val value: UInt) {
    public data object Never : DepthFunc(0u)
    public data object Always : DepthFunc(Never.value + 1u)
    public data object Equal : DepthFunc(Always.value + 1u)
    public data object NotEqual : DepthFunc(Equal.value + 1u)
    public data object Less : DepthFunc(NotEqual.value + 1u)
    public data object LessOrEqual : DepthFunc(Less.value + 1u)
    public data object Greater : DepthFunc(LessOrEqual.value + 1u)
    public data object GreaterOrEqual : DepthFunc(Greater.value + 1u)
}

public sealed class TextureEffect(public val value: UInt) {
    public data object Modulate : TextureEffect(0u)
    public data object Decal : TextureEffect(1u)
    public data object Blend : TextureEffect(2u)
    public data object Replace : TextureEffect(3u)
    public data object Add : TextureEffect(4u)
}

public sealed class TextureColorComponent(public val value: UInt) {
    public data object Rgb : TextureColorComponent(0u)
    public data object Rgba : TextureColorComponent(1u)
}

public sealed class MipmapLevel(public val value: UInt) {
    public data object None : MipmapLevel(0u)
    public data object Level1 : MipmapLevel(None.value + 1u)
    public data object Level2 : MipmapLevel(Level1.value + 1u)
    public data object Level3 : MipmapLevel(Level2.value + 1u)
    public data object Level4 : MipmapLevel(Level3.value + 1u)
    public data object Level5 : MipmapLevel(Level4.value + 1u)
    public data object Level6 : MipmapLevel(Level5.value + 1u)
    public data object Level7 : MipmapLevel(Level6.value + 1u)
}

public sealed class BlendOp(public val value: UInt) {
    public data object Add : BlendOp(0u)
    public data object Subtract : BlendOp(1u)
    public data object ReverseSubtract : BlendOp(2u)
    public data object Min : BlendOp(3u)
    public data object Max : BlendOp(4u)
    public data object Abs : BlendOp(5u)
}

public sealed class BlendSrc(public val value: UInt) {
    public data object SrcColor : BlendSrc(0u)
    public data object OneMinusSrcColor : BlendSrc(1u)
    public data object SrcAlpha : BlendSrc(2u)
    public data object OneMinusSrcAlpha : BlendSrc(3u)
    public data object Fix : BlendSrc(10u)
}

public sealed class BlendDst(public val value: UInt) {
    public data object DstColor : BlendDst(0u)
    public data object OneMinusDstColor : BlendDst(1u)
    public data object DstAlpha : BlendDst(4u)
    public data object OneMinusDstAlpha : BlendDst(5u)
    public data object Fix : BlendDst(10u)
}

public sealed class StencilOperation(public val value: UInt) {
    public data object Keep : StencilOperation(0u)
    public data object Zero : StencilOperation(1u)
    public data object Replace : StencilOperation(2u)
    public data object Invert : StencilOperation(3u)
    public data object Incr : StencilOperation(4u)
    public data object Decr : StencilOperation(5u)
}

public sealed class LightMode(public val value: UInt) {
    public data object SingleColor : LightMode(0u)
    public data object SeparateSpecularColor : LightMode(1u)
}

public sealed class LightType(public val value: UInt) {
    public data object Directional : LightType(0u)
    public data object Pointlight : LightType(1u)
    public data object Spotlight : LightType(2u)
}

public sealed class GuContextType(public val value: UInt) {
    public data object Direct : GuContextType(0u)
    public data object Call : GuContextType(1u)
    public data object Send : GuContextType(2u)
}

public sealed class GuQueueMode(public val value: UInt) {
    public data object Tail : GuQueueMode(0u)
    public data object Head : GuQueueMode(1u)
}

public sealed class GuSyncMode(public val value: UInt) {
    public data object Finish : GuSyncMode(0u)
    public data object Signal : GuSyncMode(1u)
    public data object Done : GuSyncMode(2u)
    public data object List : GuSyncMode(3u)
    public data object Send : GuSyncMode(4u)
}

public sealed class GuSyncBehavior(public val value: UInt) {
    public data object Wait : GuSyncBehavior(0u)
    public data object NoWait : GuSyncBehavior(1u)
}

public sealed class GuCallbackId(public val value: UInt) {
    public data object Signal : GuCallbackId(1u)
    public data object Finish : GuCallbackId(4u)
}

public sealed class SignalBehavior(public val value: UInt) {
    public data object Suspend : SignalBehavior(1u)
    public data object Continue : SignalBehavior(2u)
}

public sealed class ClutPixelFormat(public val value: UInt) {
    public data object Psm5650 : ClutPixelFormat(0u)
    public data object Psm5551 : ClutPixelFormat(1u)
    public data object Psm4444 : ClutPixelFormat(2u)
    public data object Psm8888 : ClutPixelFormat(3u)
}

public sealed class KeyType(public val value: Int) {
    public data object Directory : KeyType(1)
    public data object Integer : KeyType(2)
    public data object String : KeyType(3)
    public data object Bytes : KeyType(4)
}

public sealed class UtilityMsgDialogMode {
    public data object Error : UtilityMsgDialogMode()
    public data object Text : UtilityMsgDialogMode()
}

public sealed class UtilityMsgDialogPressed {
    public data object Unknown1 : UtilityMsgDialogPressed()
    public data object Yes : UtilityMsgDialogPressed()
    public data object No : UtilityMsgDialogPressed()
    public data object Back : UtilityMsgDialogPressed()
}

public sealed class UtilityDialogButtonAccept {
    public data object Circle : UtilityDialogButtonAccept()
    public data object Cross : UtilityDialogButtonAccept()
}

public sealed class SceUtilityOskInputLanguage {
    public data object Default : SceUtilityOskInputLanguage()
    public data object Japanese : SceUtilityOskInputLanguage()
    public data object English : SceUtilityOskInputLanguage()
    public data object French : SceUtilityOskInputLanguage()
    public data object Spanish : SceUtilityOskInputLanguage()
    public data object German : SceUtilityOskInputLanguage()
    public data object Italian : SceUtilityOskInputLanguage()
    public data object Dutch : SceUtilityOskInputLanguage()
    public data object Portugese : SceUtilityOskInputLanguage()
    public data object Russian : SceUtilityOskInputLanguage()
    public data object Korean : SceUtilityOskInputLanguage()
}

public sealed class SceUtilityOskInputType(public val value: UInt) {
    public data object All : SceUtilityOskInputType(0u)
    public data object LatinDigit : SceUtilityOskInputType(All.value + 1u)
    public data object LatinSymbol : SceUtilityOskInputType(LatinDigit.value + 1u)
    public data object LatinLowercase : SceUtilityOskInputType(4u)
    public data object LatinUppercase : SceUtilityOskInputType(8u)
    public data object JapaneseDigit : SceUtilityOskInputType(0x100u)
    public data object JapaneseSymbol : SceUtilityOskInputType(0x200u)
    public data object JapaneseLowercase : SceUtilityOskInputType(0x400u)
    public data object JapaneseUppercase : SceUtilityOskInputType(0x800u)
    public data object JapaneseHiragana : SceUtilityOskInputType(0x1000u)
    public data object JapaneseHalfWidthKatakana : SceUtilityOskInputType(0x2000u)
    public data object JapaneseKatakana : SceUtilityOskInputType(0x4000u)
    public data object JapaneseKanji : SceUtilityOskInputType(0x8000u)
    public data object RussianLowercase : SceUtilityOskInputType(0x10000u)
    public data object RussianUppercase : SceUtilityOskInputType(0x20000u)
    public data object Korean : SceUtilityOskInputType(0x40000u)
    public data object Url : SceUtilityOskInputType(0x80000u)
}

public sealed class SceUtilityOskState {
    public data object None : SceUtilityOskState()
    public data object Initializing : SceUtilityOskState()
    public data object Initialized : SceUtilityOskState()
    public data object Visible : SceUtilityOskState()
    public data object Quit : SceUtilityOskState()
    public data object Finished : SceUtilityOskState()
}

public sealed class SceUtilityOskResult {
    public data object Unchanged : SceUtilityOskResult()
    public data object Cancelled : SceUtilityOskResult()
    public data object Changed : SceUtilityOskResult()
}

public sealed class SystemParamLanguage {
    public data object Japanese : SystemParamLanguage()
    public data object English : SystemParamLanguage()
    public data object French : SystemParamLanguage()
    public data object Spanish : SystemParamLanguage()
    public data object German : SystemParamLanguage()
    public data object Italian : SystemParamLanguage()
    public data object Dutch : SystemParamLanguage()
    public data object Portugese : SystemParamLanguage()
    public data object Russian : SystemParamLanguage()
    public data object Korean : SystemParamLanguage()
    public data object ChineseTraditional : SystemParamLanguage()
    public data object ChineseSimplified : SystemParamLanguage()
}

public sealed class SystemParamId(public val value: UInt) {
    public data object StringNickname : SystemParamId(1u)
    public data object AdhocChannel : SystemParamId(StringNickname.value + 1u)
    public data object WlanPowerSave : SystemParamId(AdhocChannel.value + 1u)
    public data object DateFormat : SystemParamId(WlanPowerSave.value + 1u)
    public data object TimeFormat : SystemParamId(DateFormat.value + 1u)
    public data object Timezone : SystemParamId(TimeFormat.value + 1u)
    public data object DaylightSavings : SystemParamId(Timezone.value + 1u)
    public data object Language : SystemParamId(DaylightSavings.value + 1u)
    public data object Unknown : SystemParamId(Language.value + 1u)
}

public sealed class SystemParamAdhocChannel(public val value: UInt) {
    public data object ChannelAutomatic : SystemParamAdhocChannel(0u)
    public data object Channel1 : SystemParamAdhocChannel(1u)
    public data object Channel6 : SystemParamAdhocChannel(6u)
    public data object Channel11 : SystemParamAdhocChannel(11u)
}

public sealed class SystemParamWlanPowerSaveState {
    public data object Off : SystemParamWlanPowerSaveState()
    public data object On : SystemParamWlanPowerSaveState()
}

public sealed class SystemParamDateFormat {
    public data object Yyyymmdd : SystemParamDateFormat()
    public data object Mmddyyyy : SystemParamDateFormat()
    public data object Ddmmyyyy : SystemParamDateFormat()
}

public sealed class SystemParamTimeFormat {
    public data object Hour24 : SystemParamTimeFormat()
    public data object Hour12 : SystemParamTimeFormat()
}

public sealed class SystemParamDaylightSavings {
    public data object Std : SystemParamDaylightSavings()
    public data object Dst : SystemParamDaylightSavings()
}

public sealed class AvModule {
    public data object AvCodec : AvModule()
    public data object SasCore : AvModule()
    public data object Atrac3Plus : AvModule()
    public data object MpegBase : AvModule()
    public data object Mp3 : AvModule()
    public data object Vaudio : AvModule()
    public data object Aac : AvModule()
    public data object G729 : AvModule()
}

public sealed class Module(public val value: UInt) {
    public data object NetCommon : Module(0x100u)
    public data object NetAdhoc : Module(NetCommon.value + 1u)
    public data object NetInet : Module(NetAdhoc.value + 1u)
    public data object NetParseUri : Module(NetInet.value + 1u)
    public data object NetHttp : Module(NetParseUri.value + 1u)
    public data object NetSsl : Module(NetHttp.value + 1u)
    public data object UsbPspCm : Module(0x200u)
    public data object UsbMic : Module(UsbPspCm.value + 1u)
    public data object UsbCam : Module(UsbMic.value + 1u)
    public data object UsbGps : Module(UsbCam.value + 1u)
    public data object AvCodec : Module(0x300u)
    public data object AvSascore : Module(AvCodec.value + 1u)
    public data object AvAtrac3Plus : Module(AvSascore.value + 1u)
    public data object AvMpegBase : Module(AvAtrac3Plus.value + 1u)
    public data object AvMp3 : Module(AvMpegBase.value + 1u)
    public data object AvVaudio : Module(AvMp3.value + 1u)
    public data object AvAac : Module(AvVaudio.value + 1u)
    public data object AvG729 : Module(AvAac.value + 1u)
    public data object NpCommon : Module(0x400u)
    public data object NpService : Module(NpCommon.value + 1u)
    public data object NpMatching2 : Module(NpService.value + 1u)
    public data object NpDrm : Module(0x500u)
    public data object Irda : Module(0x600u)
}

public sealed class NetModule(public val value: UInt) {
    public data object NetCommon : NetModule(1u)
    public data object NetAdhoc : NetModule(NetCommon.value + 1u)
    public data object NetInet : NetModule(NetAdhoc.value + 1u)
    public data object NetParseUri : NetModule(NetInet.value + 1u)
    public data object NetHttp : NetModule(NetParseUri.value + 1u)
    public data object NetSsl : NetModule(NetHttp.value + 1u)
}

public sealed class UsbModule(public val value: UInt) {
    public data object UsbPspCm : UsbModule(1u)
    public data object UsbAcc : UsbModule(UsbPspCm.value + 1u)
    public data object UsbMic : UsbModule(UsbAcc.value + 1u)
    public data object UsbCam : UsbModule(UsbMic.value + 1u)
    public data object UsbGps : UsbModule(UsbCam.value + 1u)
}

public sealed class NetParam {
    public data object Name : NetParam()
    public data object Ssid : NetParam()
    public data object Secure : NetParam()
    public data object WepKey : NetParam()
    public data object IsStaticIp : NetParam()
    public data object Ip : NetParam()
    public data object NetMask : NetParam()
    public data object Route : NetParam()
    public data object ManualDns : NetParam()
    public data object PrimaryDns : NetParam()
    public data object SecondaryDns : NetParam()
    public data object ProxyUser : NetParam()
    public data object ProxyPass : NetParam()
    public data object UseProxy : NetParam()
    public data object ProxyServer : NetParam()
    public data object ProxyPort : NetParam()
    public data object Unknown1 : NetParam()
    public data object Unknown2 : NetParam()
}

public sealed class UtilityNetconfAction {
    public data object ConnectAP : UtilityNetconfAction()
    public data object DisplayStatus : UtilityNetconfAction()
    public data object ConnectAdhoc : UtilityNetconfAction()
}

public sealed class UtilitySavedataMode {
    public data object AutoLoad : UtilitySavedataMode()
    public data object AutoSave : UtilitySavedataMode()
    public data object Load : UtilitySavedataMode()
    public data object Save : UtilitySavedataMode()
    public data object ListLoad : UtilitySavedataMode()
    public data object ListSave : UtilitySavedataMode()
    public data object ListDelete : UtilitySavedataMode()
    public data object Delete : UtilitySavedataMode()
}

public sealed class UtilitySavedataFocus {
    public data object Unknown1 : UtilitySavedataFocus()
    public data object FirstList : UtilitySavedataFocus()
    public data object LastList : UtilitySavedataFocus()
    public data object Latest : UtilitySavedataFocus()
    public data object Oldest : UtilitySavedataFocus()
    public data object Unknown2 : UtilitySavedataFocus()
    public data object Unknown3 : UtilitySavedataFocus()
    public data object FirstEmpty : UtilitySavedataFocus()
    public data object LastEmpty : UtilitySavedataFocus()
}

public sealed class UtilityGameSharingMode(public val value: UInt) {
    public data object Single : UtilityGameSharingMode(1u)
    public data object Multiple : UtilityGameSharingMode(Single.value + 1u)
}

public sealed class UtilityGameSharingDataType(public val value: UInt) {
    public data object File : UtilityGameSharingDataType(1u)
    public data object Memory : UtilityGameSharingDataType(File.value + 1u)
}

public sealed class UtilityHtmlViewerInterfaceMode {
    public data object Full : UtilityHtmlViewerInterfaceMode()
    public data object Limited : UtilityHtmlViewerInterfaceMode()
    public data object None : UtilityHtmlViewerInterfaceMode()
}

public sealed class UtilityHtmlViewerCookieMode(public val value: UInt) {
    public data object Disabled : UtilityHtmlViewerCookieMode(0u)
    public data object Enabled : UtilityHtmlViewerCookieMode(Disabled.value + 1u)
    public data object Confirm : UtilityHtmlViewerCookieMode(Enabled.value + 1u)
    public data object Default : UtilityHtmlViewerCookieMode(Confirm.value + 1u)
}

public sealed class UtilityHtmlViewerTextSize {
    public data object Large : UtilityHtmlViewerTextSize()
    public data object Normal : UtilityHtmlViewerTextSize()
    public data object Small : UtilityHtmlViewerTextSize()
}

public sealed class UtilityHtmlViewerDisplayMode {
    public data object Normal : UtilityHtmlViewerDisplayMode()
    public data object Fit : UtilityHtmlViewerDisplayMode()
    public data object SmartFit : UtilityHtmlViewerDisplayMode()
}

public sealed class UtilityHtmlViewerConnectMode {
    public data object Last : UtilityHtmlViewerConnectMode()
    public data object ManualOnce : UtilityHtmlViewerConnectMode()
    public data object ManualAll : UtilityHtmlViewerConnectMode()
}

public sealed class UtilityHtmlViewerDisconnectMode {
    public data object Enable : UtilityHtmlViewerDisconnectMode()
    public data object Disable : UtilityHtmlViewerDisconnectMode()
    public data object Confirm : UtilityHtmlViewerDisconnectMode()
}

public sealed class ScePspnetAdhocPtpState {
    public data object Closed : ScePspnetAdhocPtpState()
    public data object Listen : ScePspnetAdhocPtpState()
    public data object SynSent : ScePspnetAdhocPtpState()
    public data object SynReceived : ScePspnetAdhocPtpState()
    public data object Established : ScePspnetAdhocPtpState()
}

public sealed class AdhocMatchingMode(public val value: UInt) {
    public data object Host : AdhocMatchingMode(1u)
    public data object Client : AdhocMatchingMode(Host.value + 1u)
    public data object Ptp : AdhocMatchingMode(Client.value + 1u)
}

public sealed class ApctlState {
    public data object Disconnected : ApctlState()
    public data object Scanning : ApctlState()
    public data object Joining : ApctlState()
    public data object GettingIp : ApctlState()
    public data object GotIp : ApctlState()
    public data object EapAuth : ApctlState()
    public data object KeyExchange : ApctlState()
}

public sealed class ApctlEvent {
    public data object ConnectRequest : ApctlEvent()
    public data object ScanRequest : ApctlEvent()
    public data object ScanComplete : ApctlEvent()
    public data object Established : ApctlEvent()
    public data object GetIp : ApctlEvent()
    public data object DisconnectRequest : ApctlEvent()
    public data object Error : ApctlEvent()
    public data object Info : ApctlEvent()
    public data object EapAuth : ApctlEvent()
    public data object KeyExchange : ApctlEvent()
    public data object Reconnect : ApctlEvent()
}

public sealed class ApctlInfo {
    public data object ProfileName : ApctlInfo()
    public data object Bssid : ApctlInfo()
    public data object Ssid : ApctlInfo()
    public data object SsidLength : ApctlInfo()
    public data object SecurityType : ApctlInfo()
    public data object Strength : ApctlInfo()
    public data object Channel : ApctlInfo()
    public data object PowerSave : ApctlInfo()
    public data object Ip : ApctlInfo()
    public data object SubnetMask : ApctlInfo()
    public data object Gateway : ApctlInfo()
    public data object PrimaryDns : ApctlInfo()
    public data object SecondaryDns : ApctlInfo()
    public data object UseProxy : ApctlInfo()
    public data object ProxyUrl : ApctlInfo()
    public data object ProxyPort : ApctlInfo()
    public data object EapType : ApctlInfo()
    public data object StartBrowser : ApctlInfo()
    public data object Wifisp : ApctlInfo()
}

public sealed class ApctlInfoSecurityType {
    public data object None : ApctlInfoSecurityType()
    public data object Wep : ApctlInfoSecurityType()
    public data object Wpa : ApctlInfoSecurityType()
}

public sealed class HttpMethod {
    public data object Get : HttpMethod()
    public data object Post : HttpMethod()
    public data object Head : HttpMethod()
}

public sealed class HttpAuthType {
    public data object Basic : HttpAuthType()
    public data object Digest : HttpAuthType()
}

public open class SceUid(public var value: Int) {
    public var field0: Int
        get() = value
        set(v) { value = v }
}

public open class SceMpeg(public var value: COpaquePointer?) {
    public var field0: COpaquePointer?
        get() = value
        set(v) { value = v }
}

public open class SceMpegStream(public var value: COpaquePointer?) {
    public var field0: COpaquePointer?
        get() = value
        set(v) { value = v }
}

public open class Mp3Handle(public var value: Int) {
    public var field0: Int
        get() = value
        set(v) { value = v }
}

public open class RegHandle(public var value: UInt) {
    public var field0: UInt
        get() = value
        set(v) { value = v }
}

public open class Sockaddr(
    public var saLen: UByte,
    public var saFamily: UByte,
    public var saData: List<UByte>,
)

public open class InAddr(public var sAddr: UInt)

public open class AudioInputParams(
    public var unknown1: Int,
    public var gain: Int,
    public var unknown2: Int,
    public var unknown3: Int,
    public var unknown4: Int,
    public var unknown5: Int,
)

public open class Atrac3BufferInfo(
    public var pucWritePositionFirstBuf: COpaquePointer?,
    public var uiWritableByteFirstBuf: UInt,
    public var uiMinWriteByteFirstBuf: UInt,
    public var uiReadPositionFirstBuf: UInt,
    public var pucWritePositionSecondBuf: COpaquePointer?,
    public var uiWritableByteSecondBuf: UInt,
    public var uiMinWriteByteSecondBuf: UInt,
    public var uiReadPositionSecondBuf: UInt,
)

public open class SceCtrlData(
    public var timestamp: UInt,
    public var buttons: Int,
    public var lx: UByte,
    public var ly: UByte,
    public var rsrv: List<UByte>,
)

public open class SceCtrlLatch(
    public var uiMake: UInt,
    public var uiBreak: UInt,
    public var uiPress: UInt,
    public var uiRelease: UInt,
)

public open class GeStack(public var stack: List<UInt>)

public open class GeCallbackData(
    public var signalFunc: GuCallbackFn?,
    public var signalArg: COpaquePointer?,
    public var finishFunc: GuCallbackFn?,
    public var finishArg: COpaquePointer?,
)

public open class GeListArgs(
    public var size: UInt,
    public var context: GeContext?,
    public var numStacks: UInt,
    public var stacks: GeStack?,
)

public open class GeBreakParam(public var buf: List<UInt>)

public open class SceKernelLoadExecParam(
    public var size: Int,
    public var args: Int,
    public var argp: COpaquePointer?,
    public var key: COpaquePointer?,
)

public open class Timeval(public var tvSec: Int, public var tvUsec: Int)

public open class Timezone(public var tzMinutesWest: Int, public var tzDstTime: Int)

public open class IntrHandlerOptionParam(
    public var size: Int,
    public var entry: UInt,
    public var common: UInt,
    public var gp: UInt,
    public var intrCode: UShort,
    public var subCount: UShort,
    public var intrLevel: UShort,
    public var enabled: UShort,
    public var calls: UInt,
    public var field1c: UInt,
    public var totalClockLo: UInt,
    public var totalClockHi: UInt,
    public var minClockLo: UInt,
    public var minClockHi: UInt,
    public var maxClockLo: UInt,
    public var maxClockHi: UInt,
)

public open class SceKernelLMOption(
    public var size: Int,
    public var mPidText: SceUid,
    public var mPidData: SceUid,
    public var flags: UInt,
    public var position: UByte,
    public var access: UByte,
    public var cReserved: List<UByte>,
)

public open class SceKernelSMOption(
    public var size: Int,
    public var mPidStack: SceUid,
    public var stackSize: Int,
    public var priority: Int,
    public var attribute: UInt,
)

public open class SceKernelModuleInfo(
    public var size: Int,
    public var nSegment: UByte,
    public var reserved: List<UByte>,
    public var segmentAddr: List<Int>,
    public var segmentSize: List<Int>,
    public var entryAddr: UInt,
    public var gpValue: UInt,
    public var textAddr: UInt,
    public var textSize: UInt,
    public var dataSize: UInt,
    public var bssSize: UInt,
    public var attribute: UShort,
    public var version: List<UByte>,
    public var name: List<UByte>,
)

public open class DebugProfilerRegs(
    public var enable: UInt,
    public var systemck: UInt,
    public var cpuck: UInt,
    public var internal: UInt,
    public var memory: UInt,
    public var copz: UInt,
    public var vfpu: UInt,
    public var sleep: UInt,
    public var busAccess: UInt,
    public var uncachedLoad: UInt,
    public var uncachedStore: UInt,
    public var cachedLoad: UInt,
    public var cachedStore: UInt,
    public var iMiss: UInt,
    public var dMiss: UInt,
    public var dWriteback: UInt,
    public var cop0Inst: UInt,
    public var fpuInst: UInt,
    public var vfpuInst: UInt,
    public var localBus: UInt,
)

public open class SceKernelSysClock(public var low: UInt, public var hi: UInt)

public open class SceKernelThreadOptParam(public var size: Int, public var stackMpid: SceUid)

public open class SceKernelThreadInfo(
    public var size: Int,
    public var name: List<UByte>,
    public var attr: UInt,
    public var status: Int,
    public var entry: SceKernelThreadEntry,
    public var stack: COpaquePointer?,
    public var stackSize: Int,
    public var gpReg: COpaquePointer?,
    public var initPriority: Int,
    public var currentPriority: Int,
    public var waitType: Int,
    public var waitId: SceUid,
    public var wakeupCount: Int,
    public var exitStatus: Int,
    public var runClocks: SceKernelSysClock,
    public var intrPreemptCount: UInt,
    public var threadPreemptCount: UInt,
    public var releaseCount: UInt,
)

public open class SceKernelThreadRunStatus(
    public var size: Int,
    public var status: Int,
    public var currentPriority: Int,
    public var waitType: Int,
    public var waitId: Int,
    public var wakeupCount: Int,
    public var runClocks: SceKernelSysClock,
    public var intrPreemptCount: UInt,
    public var threadPreemptCount: UInt,
    public var releaseCount: UInt,
)

public open class SceKernelSemaOptParam(public var size: Int)

public open class SceKernelSemaInfo(
    public var size: Int,
    public var name: List<UByte>,
    public var attr: UInt,
    public var initCount: Int,
    public var currentCount: Int,
    public var maxCount: Int,
    public var numWaitThreads: Int,
)

public open class SceKernelEventFlagInfo(
    public var size: Int,
    public var name: List<UByte>,
    public var attr: UInt,
    public var initPattern: UInt,
    public var currentPattern: UInt,
    public var numWaitThreads: Int,
)

public open class SceKernelEventFlagOptParam(public var size: Int)

public open class SceKernelMbxOptParam(public var size: Int)

public open class SceKernelMbxInfo(
    public var size: Int,
    public var name: List<UByte>,
    public var attr: UInt,
    public var numWaitThreads: Int,
    public var numMessages: Int,
    public var firstMessage: COpaquePointer?,
)

public open class SceKernelVTimerInfo(
    public var size: Int,
    public var name: List<UByte>,
    public var active: Int,
    public var base: SceKernelSysClock,
    public var current: SceKernelSysClock,
    public var schedule: SceKernelSysClock,
    public var handler: SceKernelVTimerHandler,
    public var common: COpaquePointer?,
)

public open class SceKernelThreadEventHandlerInfo(
    public var size: Int,
    public var name: List<UByte>,
    public var threadId: SceUid,
    public var mask: Int,
    public var handler: SceKernelThreadEventHandler,
    public var common: COpaquePointer?,
)

public open class SceKernelAlarmInfo(
    public var size: Int,
    public var schedule: SceKernelSysClock,
    public var handler: SceKernelAlarmHandler,
    public var common: COpaquePointer?,
)

public open class SceKernelSystemStatus(
    public var size: Int,
    public var status: UInt,
    public var idleClocks: SceKernelSysClock,
    public var comesOutOfIdleCount: UInt,
    public var threadSwitchCount: UInt,
    public var vfpuSwitchCount: UInt,
)

public open class SceKernelMppInfo(
    public var size: Int,
    public var name: List<UByte>,
    public var attr: UInt,
    public var bufSize: Int,
    public var freeSize: Int,
    public var numSendWaitThreads: Int,
    public var numReceiveWaitThreads: Int,
)

public open class SceKernelVplOptParam(public var size: Int)

public open class SceKernelVplInfo(
    public var size: Int,
    public var name: List<UByte>,
    public var attr: UInt,
    public var poolSize: Int,
    public var freeSize: Int,
    public var numWaitThreads: Int,
)

public open class SceKernelFplOptParam(public var size: Int)

public open class SceKernelFplInfo(
    public var size: Int,
    public var name: List<UByte>,
    public var attr: UInt,
    public var blockSize: Int,
    public var numBlocks: Int,
    public var freeBlocks: Int,
    public var numWaitThreads: Int,
)

public open class SceKernelVTimerOptParam(public var size: Int)

public open class SceKernelCallbackInfo(
    public var size: Int,
    public var name: List<UByte>,
    public var threadId: SceUid,
    public var callback: SceKernelCallbackFunction,
    public var common: COpaquePointer?,
    public var notifyCount: Int,
    public var notifyArg: Int,
)

public open class UsbCamSetupStillParam(
    public var size: Int,
    public var resolution: UsbCamResolution,
    public var jpegSize: Int,
    public var reverseFlags: Int,
    public var delay: UsbCamDelay,
    public var compLevel: Int,
)

public open class UsbCamSetupStillExParam(
    public var size: Int,
    public var unk: UInt,
    public var resolution: UsbCamResolutionEx,
    public var jpegSize: Int,
    public var compLevel: Int,
    public var unk2: UInt,
    public var unk3: UInt,
    public var flip: Int,
    public var mirror: Int,
    public var delay: UsbCamDelay,
    public var unk4: List<UInt>,
)

public open class UsbCamSetupVideoParam(
    public var size: Int,
    public var resolution: UsbCamResolution,
    public var framerate: UsbCamFrameRate,
    public var whiteBalance: UsbCamWb,
    public var saturation: Int,
    public var brightness: Int,
    public var contrast: Int,
    public var sharpness: Int,
    public var effectMode: UsbCamEffectMode,
    public var frameSize: Int,
    public var unk: UInt,
    public var evlEvel: UsbCamEvLevel,
)

public open class UsbCamSetupVideoExParam(
    public var size: Int,
    public var unk: UInt,
    public var resolution: UsbCamResolutionEx,
    public var framerate: UsbCamFrameRate,
    public var unk2: UInt,
    public var unk3: UInt,
    public var whiteBalance: UsbCamWb,
    public var saturation: Int,
    public var brightness: Int,
    public var contrast: Int,
    public var sharpness: Int,
    public var unk4: UInt,
    public var unk5: UInt,
    public var unk6: List<UInt>,
    public var effectMode: UsbCamEffectMode,
    public var unk7: UInt,
    public var unk8: UInt,
    public var unk9: UInt,
    public var unk10: UInt,
    public var unk11: UInt,
    public var frameSize: Int,
    public var unk12: UInt,
    public var evLevel: UsbCamEvLevel,
)

public open class ScePspDateTime(
    public var year: UShort,
    public var month: UShort,
    public var day: UShort,
    public var hour: UShort,
    public var minutes: UShort,
    public var seconds: UShort,
    public var microseconds: UInt,
)

public open class SceIoStat(
    public var stMode: Int,
    public var stAttr: Int,
    public var stSize: Long,
    public var stCtime: ScePspDateTime,
    public var stAtime: ScePspDateTime,
    public var stMtime: ScePspDateTime,
    public var stPrivate: List<UInt>,
)

public open class UmdInfo(public var size: UInt, public var type: UmdType)

public open class SceMpegRingbuffer(
    public var packets: Int,
    public var unk0: UInt,
    public var unk1: UInt,
    public var unk2: UInt,
    public var unk3: UInt,
    public var data: COpaquePointer?,
    public var callback: SceMpegRingbufferCb,
    public var cbParam: COpaquePointer?,
    public var unk4: UInt,
    public var unk5: UInt,
    public var sceMpeg: COpaquePointer?,
)

public open class SceMpegAu(
    public var ptsMsb: UInt,
    public var pts: UInt,
    public var dtsMsb: UInt,
    public var dts: UInt,
    public var esBuffer: UInt,
    public var auSize: UInt,
)

public open class SceMpegAvcMode(public var unk0: Int, public var pixelFormat: DisplayPixelFormat)

public open class SceMpegLLI(
    public var src: COpaquePointer?,
    public var dst: COpaquePointer?,
    public var next: COpaquePointer?,
    public var size: Int,
)

public open class SceMpegYCrCbBuffer(
    public var frameBufferHeight16: Int,
    public var frameBufferWidth16: Int,
    public var unknown: Int,
    public var unknown2: Int,
    public var yBuffer: COpaquePointer?,
    public var yBuffer2: COpaquePointer?,
    public var crBuffer: COpaquePointer?,
    public var cbBuffer: COpaquePointer?,
    public var crBuffer2: COpaquePointer?,
    public var cbBuffer2: COpaquePointer?,
    public var frameHeight: Int,
    public var frameWidth: Int,
    public var frameBufferWidth: Int,
    public var unknown3: List<Int>,
)

public open class ScePspSRect(
    public var x: Short,
    public var y: Short,
    public var w: Short,
    public var h: Short,
)

public open class ScePspIRect(
    public var x: Int,
    public var y: Int,
    public var w: Int,
    public var h: Int,
)

public open class ScePspL64Rect(
    public var x: ULong,
    public var y: ULong,
    public var w: ULong,
    public var h: ULong,
)

public open class ScePspSVector2(public var x: Short, public var y: Short)

public open class ScePspIVector2(public var x: Int, public var y: Int)

public open class ScePspL64Vector2(public var x: ULong, public var y: ULong)

public open class ScePspSVector3(
    public var x: Short,
    public var y: Short,
    public var z: Short,
)

public open class ScePspIVector3(
    public var x: Int,
    public var y: Int,
    public var z: Int,
)

public open class ScePspL64Vector3(
    public var x: ULong,
    public var y: ULong,
    public var z: ULong,
)

public open class ScePspSVector4(
    public var x: Short,
    public var y: Short,
    public var z: Short,
    public var w: Short,
)

public open class ScePspIVector4(
    public var x: Int,
    public var y: Int,
    public var z: Int,
    public var w: Int,
)

public open class ScePspL64Vector4(
    public var x: ULong,
    public var y: ULong,
    public var z: ULong,
    public var w: ULong,
)

public open class ScePspIMatrix2(public var x: ScePspIVector2, public var y: ScePspIVector2)

public open class ScePspIMatrix3(
    public var x: ScePspIVector3,
    public var y: ScePspIVector3,
    public var z: ScePspIVector3,
)

public open class ScePspIMatrix4(
    public var x: ScePspIVector4,
    public var y: ScePspIVector4,
    public var z: ScePspIVector4,
    public var w: ScePspIVector4,
)

public open class ScePspIMatrix4Unaligned(
    public var x: ScePspIVector4,
    public var y: ScePspIVector4,
    public var z: ScePspIVector4,
    public var w: ScePspIVector4,
)

public open class SceMp3InitArg(
    public var mp3StreamStart: UInt,
    public var unk1: UInt,
    public var mp3StreamEnd: UInt,
    public var unk2: UInt,
    public var mp3Buf: COpaquePointer?,
    public var mp3BufSize: Int,
    public var pcmBuf: COpaquePointer?,
    public var pcmBufSize: Int,
)

public open class OpenPSID(public var data: List<UByte>)

public open class UtilityDialogCommon(
    public var size: UInt,
    public var language: SystemParamLanguage,
    public var buttonAccept: UtilityDialogButtonAccept,
    public var graphicsThread: Int,
    public var accessThread: Int,
    public var fontThread: Int,
    public var soundThread: Int,
    public var result: Int,
    public var reserved: List<Int>,
)

public open class UtilityNetconfAdhoc(public var name: List<UByte>, public var timeout: UInt)

public open class UtilityNetconfData(
    public var base: UtilityDialogCommon,
    public var action: UtilityNetconfAction,
    public var adhocparam: UtilityNetconfAdhoc?,
    public var hotspot: Int,
    public var hotspotConnected: Int,
    public var wifisp: Int,
)

public open class UtilitySavedataFileData(
    public var buf: COpaquePointer?,
    public var bufSize: Int,
    public var size: Int,
    public var unknown: Int,
)

public open class UtilitySavedataListSaveNewData(public var icon0: UtilitySavedataFileData, public var title: COpaquePointer?)

public open class UtilityGameSharingParams(
    public var base: UtilityDialogCommon,
    public var unknown1: Int,
    public var unknown2: Int,
    public var name: List<UByte>,
    public var unknown3: Int,
    public var unknown4: Int,
    public var unknown5: Int,
    public var result: Int,
    public var filepath: COpaquePointer?,
    public var mode: UtilityGameSharingMode,
    public var datatype: UtilityGameSharingDataType,
    public var data: COpaquePointer?,
    public var datasize: UInt,
)

public open class UtilityHtmlViewerParam(
    public var base: UtilityDialogCommon,
    public var memaddr: COpaquePointer?,
    public var memsize: UInt,
    public var unknown1: Int,
    public var unknown2: Int,
    public var initialurl: COpaquePointer?,
    public var numtabs: UInt,
    public var interfacemode: UtilityHtmlViewerInterfaceMode,
    public var options: Int,
    public var dldirname: COpaquePointer?,
    public var dlfilename: COpaquePointer?,
    public var uldirname: COpaquePointer?,
    public var ulfilename: COpaquePointer?,
    public var cookiemode: UtilityHtmlViewerCookieMode,
    public var unknown3: UInt,
    public var homeurl: COpaquePointer?,
    public var textsize: UtilityHtmlViewerTextSize,
    public var displaymode: UtilityHtmlViewerDisplayMode,
    public var connectmode: UtilityHtmlViewerConnectMode,
    public var disconnectmode: UtilityHtmlViewerDisconnectMode,
    public var memused: UInt,
    public var unknown4: List<Int>,
)

public open class SceUtilityOskData(
    public var unk00: Int,
    public var unk04: Int,
    public var language: SceUtilityOskInputLanguage,
    public var unk12: Int,
    public var inputtype: SceUtilityOskInputType,
    public var lines: Int,
    public var unk24: Int,
    public var desc: UShort?,
    public var intext: UShort?,
    public var outtextlength: Int,
    public var outtext: UShort?,
    public var result: SceUtilityOskResult,
    public var outtextlimit: Int,
)

public open class SceUtilityOskParams(
    public var base: UtilityDialogCommon,
    public var datacount: Int,
    public var data: SceUtilityOskData?,
    public var state: SceUtilityOskState,
    public var unk60: Int,
)

public open class SceNetMallocStat(
    public var pool: Int,
    public var maximum: Int,
    public var free: Int,
)

public open class SceNetAdhocctlAdhocId(
    public var unknown: Int,
    public var adhocId: List<UByte>,
    public var unk: List<UByte>,
)

public open class SceNetAdhocctlScanInfo(
    public var next: SceNetAdhocctlScanInfo?,
    public var channel: Int,
    public var name: List<UByte>,
    public var bssid: List<UByte>,
    public var unknown: List<UByte>,
    public var unknown2: Int,
)

public open class SceNetAdhocctlGameModeInfo(public var count: Int, public var macs: List<List<UByte>>)

public open class SceNetAdhocPtpStat(
    public var next: SceNetAdhocPtpStat?,
    public var ptpId: Int,
    public var mac: List<UByte>,
    public var peermac: List<UByte>,
    public var port: UShort,
    public var peerport: UShort,
    public var sentData: UInt,
    public var rcvdData: UInt,
    public var state: ScePspnetAdhocPtpState,
)

public open class SceNetAdhocPdpStat(
    public var next: SceNetAdhocPdpStat?,
    public var pdpId: Int,
    public var mac: List<UByte>,
    public var port: UShort,
    public var rcvdData: UInt,
)

public open class AdhocPoolStat(
    public var size: Int,
    public var maxsize: Int,
    public var freesize: Int,
)

public open class GeContext(public var context: List<UInt>)

public open class SceKernelUtilsSha1Context(
    public var h: List<UInt>,
    public var usRemains: UShort,
    public var usComputed: UShort,
    public var ullTotalLen: ULong,
    public var buf: List<UByte>,
)

public open class SceKernelUtilsMt19937Context(public var count: UInt, public var state: List<UInt>)

public open class SceKernelUtilsMd5Context(
    public var h: List<UInt>,
    public var pad: UInt,
    public var usRemains: UShort,
    public var usComputed: UShort,
    public var ullTotalLen: ULong,
    public var buf: List<UByte>,
)

public open class SceIoDirent(
    public var dStat: SceIoStat,
    public var dName: List<UByte>,
    public var dPrivate: COpaquePointer?,
    public var dummy: Int,
)

public open class ScePspFRect(
    public var x: Float,
    public var y: Float,
    public var w: Float,
    public var h: Float,
)

public open class ScePspFVector3(
    public var x: Float,
    public var y: Float,
    public var z: Float,
)

public open class ScePspFVector4(
    public var x: Float,
    public var y: Float,
    public var z: Float,
    public var w: Float,
)

public open class ScePspFVector4Unaligned(
    public var x: Float,
    public var y: Float,
    public var z: Float,
    public var w: Float,
)

public open class ScePspFVector2(public var x: Float, public var y: Float)

public open class ScePspFMatrix2(public var x: ScePspFVector2, public var y: ScePspFVector2)

public open class ScePspFMatrix3(
    public var x: ScePspFVector3,
    public var y: ScePspFVector3,
    public var z: ScePspFVector3,
)

public open class ScePspFMatrix4(
    public var x: ScePspFVector4,
    public var y: ScePspFVector4,
    public var z: ScePspFVector4,
    public var w: ScePspFVector4,
)

public open class ScePspFMatrix4Unaligned(
    public var x: ScePspFVector4,
    public var y: ScePspFVector4,
    public var z: ScePspFVector4,
    public var w: ScePspFVector4,
)

public open class ScePspVector3(
    public var fv: ScePspFVector3? = null,
    public var iv: ScePspIVector3? = null,
    public var f: List<Float>? = null,
    public var i: List<Int>? = null,
)

public open class ScePspVector4(
    public var fv: ScePspFVector4? = null,
    public var iv: ScePspIVector4? = null,
    public var qw: U128? = null,
    public var f: List<Float>? = null,
    public var i: List<Int>? = null,
)

public open class ScePspMatrix2(
    public var fm: ScePspFMatrix2? = null,
    public var im: ScePspIMatrix2? = null,
    public var fv: List<ScePspFVector2>? = null,
    public var iv: List<ScePspIVector2>? = null,
    public var v: List<ScePspVector2>? = null,
    public var f: List<List<Float>>? = null,
    public var i: List<List<Int>>? = null,
)

public open class ScePspMatrix3(
    public var fm: ScePspFMatrix3? = null,
    public var im: ScePspIMatrix3? = null,
    public var fv: List<ScePspFVector3>? = null,
    public var iv: List<ScePspIVector3>? = null,
    public var v: List<ScePspVector3>? = null,
    public var f: List<List<Float>>? = null,
    public var i: List<List<Int>>? = null,
)

public open class ScePspVector2(
    public var fv: ScePspFVector2? = null,
    public var iv: ScePspIVector2? = null,
    public var f: List<Float>? = null,
    public var i: List<Int>? = null,
)

public open class ScePspMatrix4(
    public var fm: ScePspFMatrix4? = null,
    public var im: ScePspIMatrix4? = null,
    public var fv: List<ScePspFVector4>? = null,
    public var iv: List<ScePspIVector4>? = null,
    public var v: List<ScePspVector4>? = null,
    public var f: List<List<Float>>? = null,
    public var i: List<List<Int>>? = null,
)

public open class Key(
    public var keyType: KeyType,
    public var name: List<UByte>,
    public var nameLen: UInt,
    public var unk2: UInt,
    public var unk3: UInt,
)

public open class UtilityMsgDialogParams(
    public var base: UtilityDialogCommon,
    public var unknown: Int,
    public var mode: UtilityMsgDialogMode,
    public var errorValue: UInt,
    public var message: List<UByte>,
    public var options: Int,
    public var buttonPressed: UtilityMsgDialogPressed,
)

public open class UtilityNetData(public var asUint: UInt? = null, public var asString: List<UByte>? = null)

public open class UtilitySavedataSFOParam(
    public var title: List<UByte>,
    public var savedataTitle: List<UByte>,
    public var detail: List<UByte>,
    public var parentalLevel: UByte,
    public var unknown: List<UByte>,
)

public open class SceUtilitySavedataParam(
    public var base: UtilityDialogCommon,
    public var mode: UtilitySavedataMode,
    public var unknown1: Int,
    public var overwrite: Int,
    public var gameName: List<UByte>,
    public var reserved: List<UByte>,
    public var saveName: List<UByte>,
    public var saveNameList: List<UByte>?,
    public var fileName: List<UByte>,
    public var reserved1: List<UByte>,
    public var dataBuf: COpaquePointer?,
    public var dataBufSize: Int,
    public var dataSize: Int,
    public var sfoParam: UtilitySavedataSFOParam,
    public var icon0FileData: UtilitySavedataFileData,
    public var icon1FileData: UtilitySavedataFileData,
    public var pic1FileData: UtilitySavedataFileData,
    public var snd0FileData: UtilitySavedataFileData,
    public var newData: UtilitySavedataListSaveNewData?,
    public var focus: UtilitySavedataFocus,
    public var unknown2: List<Int>,
    public var key: List<UByte>,
    public var unknown3: List<UByte>,
)

public open class SceNetAdhocctlPeerInfo(
    public var next: SceNetAdhocctlPeerInfo?,
    public var nickname: List<UByte>,
    public var mac: List<UByte>,
    public var unknown: List<UByte>,
    public var timestamp: UInt,
)

public open class SceNetAdhocctlParams(
    public var channel: Int,
    public var name: List<UByte>,
    public var bssid: List<UByte>,
    public var nickname: List<UByte>,
)

public open class SceNetApctlInfo(
    public var name: List<UByte>? = null,
    public var bssid: List<UByte>? = null,
    public var ssid: List<UByte>? = null,
    public var ssidLength: UInt? = null,
    public var securityType: UInt? = null,
    public var strength: UByte? = null,
    public var channel: UByte? = null,
    public var powerSave: UByte? = null,
    public var ip: List<UByte>? = null,
    public var subNetMask: List<UByte>? = null,
    public var gateway: List<UByte>? = null,
    public var primaryDns: List<UByte>? = null,
    public var secondaryDns: List<UByte>? = null,
    public var useProxy: UInt? = null,
    public var proxyUrl: List<UByte>? = null,
    public var proxyPort: UShort? = null,
    public var eapType: UInt? = null,
    public var startBrowser: UInt? = null,
    public var wifisp: UInt? = null,
)

public val INT_MIN: CInt = -2147483648

public val INT_MAX: CInt = 2147483647

public val AUDIO_VOLUME_MAX: UInt = 0x8000u

public val AUDIO_CHANNEL_MAX: UInt = 8u

public val AUDIO_NEXT_CHANNEL: Int = -1

public val AUDIO_SAMPLE_MIN: UInt = 64u

public val AUDIO_SAMPLE_MAX: UInt = 65472u

public val PSP_CTRL_SELECT: Int = 0x000001

public val PSP_CTRL_START: Int = 0x000008

public val PSP_CTRL_UP: Int = 0x000010

public val PSP_CTRL_RIGHT: Int = 0x000020

public val PSP_CTRL_DOWN: Int = 0x000040

public val PSP_CTRL_LEFT: Int = 0x000080

public val PSP_CTRL_LTRIGGER: Int = 0x000100

public val PSP_CTRL_RTRIGGER: Int = 0x000200

public val PSP_CTRL_TRIANGLE: Int = 0x001000

public val PSP_CTRL_CIRCLE: Int = 0x002000

public val PSP_CTRL_CROSS: Int = 0x004000

public val PSP_CTRL_SQUARE: Int = 0x008000

public val PSP_CTRL_HOME: Int = 0x010000

public val PSP_CTRL_HOLD: Int = 0x020000

public val PSP_CTRL_NOTE: Int = 0x800000

public val PSP_CTRL_SCREEN: Int = 0x400000

public val PSP_CTRL_VOLUP: Int = 0x100000

public val PSP_CTRL_VOLDOWN: Int = 0x200000

public val PSP_CTRL_WLAN_UP: Int = 0x040000

public val PSP_CTRL_REMOTE: Int = 0x080000

public val PSP_CTRL_DISC: Int = 0x1000000

public val PSP_CTRL_MS: Int = 0x2000000

public val USB_CAM_PID: Int = 0x282

public val USB_BUS_DRIVER_NAME: String = "USBBusDriver"

public val USB_CAM_DRIVER_NAME: String = "USBCamDriver"

public val USB_CAM_MIC_DRIVER_NAME: String = "USBCamMicDriver"

public val USB_STOR_DRIVER_NAME: String = "USBStor_Driver"

public val ACTIVATED: Int = 0x200

public val CONNECTED: Int = 0x020

public val ESTABLISHED: Int = 0x002

public val USB_CAM_FLIP: Int = 1

public val USB_CAM_MIRROR: Int = 0x100

public val THREAD_ATTR_VFPU: Int = 0x00004000

public val THREAD_ATTR_USER: Int = 0x80000000

public val THREAD_ATTR_USBWLAN: Int = 0xa0000000

public val THREAD_ATTR_VSH: Int = 0xc0000000

public val THREAD_ATTR_SCRATCH_SRAM: Int = 0x00008000

public val THREAD_ATTR_NO_FILLSTACK: Int = 0x00100000

public val THREAD_ATTR_CLEAR_STACK: Int = 0x00200000

public val EVENT_WAIT_MULTIPLE: Int = 0x200

public val EVENT_WAIT_AND: Int = 0

public val EVENT_WAIT_OR: Int = 1

public val EVENT_WAIT_CLEAR: Int = 0x20

public val POWER_INFO_POWER_SWITCH: Int = 0x80000000

public val POWER_INFO_HOLD_SWITCH: Int = 0x40000000

public val POWER_INFO_STANDBY: Int = 0x00080000

public val POWER_INFO_RESUME_COMPLETE: Int = 0x00040000

public val POWER_INFO_RESUMING: Int = 0x00020000

public val POWER_INFO_SUSPENDING: Int = 0x00010000

public val POWER_INFO_AC_POWER: Int = 0x00001000

public val POWER_INFO_BATTERY_LOW: Int = 0x00000100

public val POWER_INFO_BATTERY_EXIST: Int = 0x00000080

public val POWER_INFO_BATTERY_POWER: Int = 0x0000007

public val FIO_S_IFLNK: Int = 0x4000

public val FIO_S_IFDIR: Int = 0x1000

public val FIO_S_IFREG: Int = 0x2000

public val FIO_S_ISUID: Int = 0x0800

public val FIO_S_ISGID: Int = 0x0400

public val FIO_S_ISVTX: Int = 0x0200

public val FIO_S_IRUSR: Int = 0x0100

public val FIO_S_IWUSR: Int = 0x0080

public val FIO_S_IXUSR: Int = 0x0040

public val FIO_S_IRGRP: Int = 0x0020

public val FIO_S_IWGRP: Int = 0x0010

public val FIO_S_IXGRP: Int = 0x0008

public val FIO_S_IROTH: Int = 0x0004

public val FIO_S_IWOTH: Int = 0x0002

public val FIO_S_IXOTH: Int = 0x0001

public val FIO_SO_IFLNK: Int = 0x0008

public val FIO_SO_IFDIR: Int = 0x0010

public val FIO_SO_IFREG: Int = 0x0020

public val FIO_SO_IROTH: Int = 0x0004

public val FIO_SO_IWOTH: Int = 0x0002

public val FIO_SO_IXOTH: Int = 0x0001

public val PSP_O_RD_ONLY: Int = 0x0001

public val PSP_O_WR_ONLY: Int = 0x0002

public val PSP_O_RD_WR: Int = 0x0003

public val PSP_O_NBLOCK: Int = 0x0004

public val PSP_O_DIR: Int = 0x0008

public val PSP_O_APPEND: Int = 0x0100

public val PSP_O_CREAT: Int = 0x0200

public val PSP_O_TRUNC: Int = 0x0400

public val PSP_O_EXCL: Int = 0x0800

public val PSP_O_NO_WAIT: Int = 0x8000

public val UMD_NOT_PRESENT: Int = 0x01

public val UMD_PRESENT: Int = 0x02

public val UMD_CHANGED: Int = 0x04

public val UMD_INITING: Int = 0x08

public val UMD_INITED: Int = 0x10

public val UMD_READY: Int = 0x20

public val PLAY_PAUSE: Int = 0x1

public val FORWARD: Int = 0x4

public val BACK: Int = 0x8

public val VOL_UP: Int = 0x10

public val VOL_DOWN: Int = 0x20

public val HOLD: Int = 0x80

public val GU_PI: Float = 3.141593

public val GU_TEXTURE_8BIT: Int = 1

public val GU_TEXTURE_16BIT: Int = 2

public val GU_TEXTURE_32BITF: Int = 3

public val GU_COLOR_5650: Int = 4 shl 2

public val GU_COLOR_5551: Int = 5 shl 2

public val GU_COLOR_4444: Int = 6 shl 2

public val GU_COLOR_8888: Int = 7 shl 2

public val GU_NORMAL_8BIT: Int = 1 shl 5

public val GU_NORMAL_16BIT: Int = 2 shl 5

public val GU_NORMAL_32BITF: Int = 3 shl 5

public val GU_VERTEX_8BIT: Int = 1 shl 7

public val GU_VERTEX_16BIT: Int = 2 shl 7

public val GU_VERTEX_32BITF: Int = 3 shl 7

public val GU_WEIGHT_8BIT: Int = 1 shl 9

public val GU_WEIGHT_16BIT: Int = 2 shl 9

public val GU_WEIGHT_32BITF: Int = 3 shl 9

public val GU_INDEX_8BIT: Int = 1 shl 11

public val GU_INDEX_16BIT: Int = 2 shl 11

public val GU_WEIGHTS1: Int = (((1 - 1) and 7) shl 14).toInt()

public val GU_WEIGHTS2: Int = (((2 - 1) and 7) shl 14).toInt()

public val GU_WEIGHTS3: Int = (((3 - 1) and 7) shl 14).toInt()

public val GU_WEIGHTS4: Int = (((4 - 1) and 7) shl 14).toInt()

public val GU_WEIGHTS5: Int = (((5 - 1) and 7) shl 14).toInt()

public val GU_WEIGHTS6: Int = (((6 - 1) and 7) shl 14).toInt()

public val GU_WEIGHTS7: Int = (((7 - 1) and 7) shl 14).toInt()

public val GU_WEIGHTS8: Int = (((8 - 1) and 7) shl 14).toInt()

public val GU_VERTICES1: Int = (((1 - 1) and 7) shl 18).toInt()

public val GU_VERTICES2: Int = (((2 - 1) and 7) shl 18).toInt()

public val GU_VERTICES3: Int = (((3 - 1) and 7) shl 18).toInt()

public val GU_VERTICES4: Int = (((4 - 1) and 7) shl 18).toInt()

public val GU_VERTICES5: Int = (((5 - 1) and 7) shl 18).toInt()

public val GU_VERTICES6: Int = (((6 - 1) and 7) shl 18).toInt()

public val GU_VERTICES7: Int = (((7 - 1) and 7) shl 18).toInt()

public val GU_VERTICES8: Int = (((8 - 1) and 7) shl 18).toInt()

public val GU_TRANSFORM_2D: Int = 1 shl 23

public val GU_TRANSFORM_3D: Int = 0

public val GU_COLOR_BUFFER_BIT: Int = 1

public val GU_STENCIL_BUFFER_BIT: Int = 2

public val GU_DEPTH_BUFFER_BIT: Int = 4

public val GU_FAST_CLEAR_BIT: Int = 16

public val GU_AMBIENT: Int = 1

public val GU_DIFFUSE: Int = 2

public val GU_SPECULAR: Int = 4

public val GU_UNKNOWN_LIGHT_COMPONENT: Int = 8

public val SYSTEM_REGISTRY: List<UByte> = "/system".encodeToByteArray()

public val REG_KEYNAME_SIZE: UInt = 27u

public val UTILITY_MSGDIALOG_ERROR: Int = 0

public val UTILITY_MSGDIALOG_TEXT: Int = 1

public val UTILITY_MSGDIALOG_YES_NO_BUTTONS: Int = 0x10

public val UTILITY_MSGDIALOG_DEFAULT_NO: Int = 0x100

public val UTILITY_HTMLVIEWER_OPEN_SCE_START_PAGE: Int = 0x000001

public val UTILITY_HTMLVIEWER_DISABLE_STARTUP_LIMITS: Int = 0x000002

public val UTILITY_HTMLVIEWER_DISABLE_EXIT_DIALOG: Int = 0x000004

public val UTILITY_HTMLVIEWER_DISABLE_CURSOR: Int = 0x000008

public val UTILITY_HTMLVIEWER_DISABLE_DOWNLOAD_COMPLETE_DIALOG: Int = 0x000010

public val UTILITY_HTMLVIEWER_DISABLE_DOWNLOAD_START_DIALOG: Int = 0x000020

public val UTILITY_HTMLVIEWER_DISABLE_DOWNLOAD_DESTINATION_DIALOG: Int = 0x000040

public val UTILITY_HTMLVIEWER_LOCK_DOWNLOAD_DESTINATION_DIALOG: Int = 0x000080

public val UTILITY_HTMLVIEWER_DISABLE_TAB_DISPLAY: Int = 0x000100

public val UTILITY_HTMLVIEWER_ENABLE_ANALOG_HOLD: Int = 0x000200

public val UTILITY_HTMLVIEWER_ENABLE_FLASH: Int = 0x000400

public val UTILITY_HTMLVIEWER_DISABLE_LRTRIGGER: Int = 0x000800

public fun sceAudioChReserve(channel: Int, sampleCount: Int, format: AudioFormat): Int {
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceAudioChReserve", -1, longArrayOf(channel.toLong(), sampleCount.toLong(), __scratch_2)).toInt()
    } finally {
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun sceAudioChRelease(channel: Int): Int {
    return LibcDynamicFfi.invoke("sceAudioChRelease", -1, longArrayOf(channel.toLong())).toInt()
}

public fun sceAudioOutput(channel: Int, vol: Int, buf: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceAudioOutput", -1, longArrayOf(channel.toLong(), vol.toLong(), buf?.value ?: 0L)).toInt()
}

public fun sceAudioOutputBlocking(channel: Int, vol: Int, buf: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceAudioOutputBlocking", -1, longArrayOf(channel.toLong(), vol.toLong(), buf?.value ?: 0L)).toInt()
}

public fun sceAudioOutputPanned(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceAudioOutputPanned", -1, longArrayOf(channel.toLong(), leftVol.toLong(), rightVol.toLong(), buf?.value ?: 0L)).toInt()
}

public fun sceAudioOutputPannedBlocking(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceAudioOutputPannedBlocking", -1, longArrayOf(channel.toLong(), leftVol.toLong(), rightVol.toLong(), buf?.value ?: 0L)).toInt()
}

public fun sceAudioGetChannelRestLen(channel: Int): Int {
    return LibcDynamicFfi.invoke("sceAudioGetChannelRestLen", -1, longArrayOf(channel.toLong())).toInt()
}

public fun sceAudioGetChannelRestLength(channel: Int): Int {
    return LibcDynamicFfi.invoke("sceAudioGetChannelRestLength", -1, longArrayOf(channel.toLong())).toInt()
}

public fun sceAudioSetChannelDataLen(channel: Int, sampleCount: Int): Int {
    return LibcDynamicFfi.invoke("sceAudioSetChannelDataLen", -1, longArrayOf(channel.toLong(), sampleCount.toLong())).toInt()
}

public fun sceAudioChangeChannelConfig(channel: Int, format: AudioFormat): Int {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceAudioChangeChannelConfig", -1, longArrayOf(channel.toLong(), __scratch_1)).toInt()
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun sceAudioChangeChannelVolume(channel: Int, leftVol: Int, rightVol: Int): Int {
    return LibcDynamicFfi.invoke("sceAudioChangeChannelVolume", -1, longArrayOf(channel.toLong(), leftVol.toLong(), rightVol.toLong())).toInt()
}

public fun sceAudioOutput2Reserve(sampleCount: Int): Int {
    return LibcDynamicFfi.invoke("sceAudioOutput2Reserve", -1, longArrayOf(sampleCount.toLong())).toInt()
}

public fun sceAudioOutput2Release(): Int {
    return LibcDynamicFfi.invoke("sceAudioOutput2Release", -1, longArrayOf()).toInt()
}

public fun sceAudioOutput2ChangeLength(sampleCount: Int): Int {
    return LibcDynamicFfi.invoke("sceAudioOutput2ChangeLength", -1, longArrayOf(sampleCount.toLong())).toInt()
}

public fun sceAudioOutput2OutputBlocking(vol: Int, buf: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceAudioOutput2OutputBlocking", -1, longArrayOf(vol.toLong(), buf?.value ?: 0L)).toInt()
}

public fun sceAudioOutput2GetRestSample(): Int {
    return LibcDynamicFfi.invoke("sceAudioOutput2GetRestSample", -1, longArrayOf()).toInt()
}

public fun sceAudioSRCChReserve(sampleCount: Int, freq: AudioOutputFrequency, channels: Int): Int {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceAudioSRCChReserve", -1, longArrayOf(sampleCount.toLong(), __scratch_1, channels.toLong())).toInt()
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun sceAudioSRCChRelease(): Int {
    return LibcDynamicFfi.invoke("sceAudioSRCChRelease", -1, longArrayOf()).toInt()
}

public fun sceAudioSRCOutputBlocking(vol: Int, buf: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceAudioSRCOutputBlocking", -1, longArrayOf(vol.toLong(), buf?.value ?: 0L)).toInt()
}

public fun sceAudioInputInit(unknown1: Int, gain: Int, unknown2: Int): Int {
    return LibcDynamicFfi.invoke("sceAudioInputInit", -1, longArrayOf(unknown1.toLong(), gain.toLong(), unknown2.toLong())).toInt()
}

public fun sceAudioInputInitEx(params: AudioInputParams?): Int {
    return LibcDynamicFfi.invoke("sceAudioInputInitEx", -1, longArrayOf(params?.value ?: 0L)).toInt()
}

public fun sceAudioInputBlocking(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?) {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceAudioInputBlocking", -1, longArrayOf(sampleCount.toLong(), __scratch_1, buf?.value ?: 0L))
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun sceAudioInput(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?) {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceAudioInput", -1, longArrayOf(sampleCount.toLong(), __scratch_1, buf?.value ?: 0L))
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun sceAudioGetInputLength(): Int {
    return LibcDynamicFfi.invoke("sceAudioGetInputLength", -1, longArrayOf()).toInt()
}

public fun sceAudioWaitInputEnd(): Int {
    return LibcDynamicFfi.invoke("sceAudioWaitInputEnd", -1, longArrayOf()).toInt()
}

public fun sceAudioPollInputEnd(): Int {
    return LibcDynamicFfi.invoke("sceAudioPollInputEnd", -1, longArrayOf()).toInt()
}

public fun sceAtracGetAtracID(uiCodecType: UInt): Int {
    return LibcDynamicFfi.invoke("sceAtracGetAtracID", -1, longArrayOf(uiCodecType.toLong())).toInt()
}

public fun sceAtracSetDataAndGetID(buf: COpaquePointer?, bufsize: ULong): Int {
    return LibcDynamicFfi.invoke("sceAtracSetDataAndGetID", -1, longArrayOf(buf?.value ?: 0L, bufsize.toLong())).toInt()
}

public fun sceAtracDecodeData(atracId: Int, outSamples: UShort?, outN: Int?, outEnd: Int?, outRemainFrame: Int?): Int {
    val __slot_1 = if (outSamples == null) 0L else LibcDynamicFfi.allocScalarSlot(outSamples.toLong())
    val __slot_2 = if (outN == null) 0L else LibcDynamicFfi.allocScalarSlot(outN.toLong())
    val __slot_3 = if (outEnd == null) 0L else LibcDynamicFfi.allocScalarSlot(outEnd.toLong())
    val __slot_4 = if (outRemainFrame == null) 0L else LibcDynamicFfi.allocScalarSlot(outRemainFrame.toLong())
    try {
        return LibcDynamicFfi.invoke("sceAtracDecodeData", -1, longArrayOf(atracId.toLong(), __slot_1, __slot_2, __slot_3, __slot_4)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

public fun sceAtracGetRemainFrame(atracId: Int, outRemainFrame: Int?): Int {
    val __slot_1 = if (outRemainFrame == null) 0L else LibcDynamicFfi.allocScalarSlot(outRemainFrame.toLong())
    try {
        return LibcDynamicFfi.invoke("sceAtracGetRemainFrame", -1, longArrayOf(atracId.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceAtracGetStreamDataInfo(atracId: Int, writePointer: COpaquePointer?, availableBytes: UInt?, readOffset: UInt?): Int {
    val __slot_2 = if (availableBytes == null) 0L else LibcDynamicFfi.allocScalarSlot(availableBytes.toLong())
    val __slot_3 = if (readOffset == null) 0L else LibcDynamicFfi.allocScalarSlot(readOffset.toLong())
    try {
        return LibcDynamicFfi.invoke("sceAtracGetStreamDataInfo", -1, longArrayOf(atracId.toLong(), writePointer?.value ?: 0L, __slot_2, __slot_3)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun sceAtracAddStreamData(atracId: Int, bytesToAdd: UInt): Int {
    return LibcDynamicFfi.invoke("sceAtracAddStreamData", -1, longArrayOf(atracId.toLong(), bytesToAdd.toLong())).toInt()
}

public fun sceAtracGetBitrate(atracId: Int, outBitrate: Int?): Int {
    val __slot_1 = if (outBitrate == null) 0L else LibcDynamicFfi.allocScalarSlot(outBitrate.toLong())
    try {
        return LibcDynamicFfi.invoke("sceAtracGetBitrate", -1, longArrayOf(atracId.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceAtracSetLoopNum(atracId: Int, nloops: Int): Int {
    return LibcDynamicFfi.invoke("sceAtracSetLoopNum", -1, longArrayOf(atracId.toLong(), nloops.toLong())).toInt()
}

public fun sceAtracReleaseAtracID(atracId: Int): Int {
    return LibcDynamicFfi.invoke("sceAtracReleaseAtracID", -1, longArrayOf(atracId.toLong())).toInt()
}

public fun sceAtracGetNextSample(atracId: Int, outN: Int?): Int {
    val __slot_1 = if (outN == null) 0L else LibcDynamicFfi.allocScalarSlot(outN.toLong())
    try {
        return LibcDynamicFfi.invoke("sceAtracGetNextSample", -1, longArrayOf(atracId.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceAtracGetMaxSample(atracId: Int, outMax: Int?): Int {
    val __slot_1 = if (outMax == null) 0L else LibcDynamicFfi.allocScalarSlot(outMax.toLong())
    try {
        return LibcDynamicFfi.invoke("sceAtracGetMaxSample", -1, longArrayOf(atracId.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceAtracGetBufferInfoForReseting(atracId: Int, uiSample: UInt, pbufferInfo: Atrac3BufferInfo?): Int {
    return LibcDynamicFfi.invoke("sceAtracGetBufferInfoForReseting", -1, longArrayOf(atracId.toLong(), uiSample.toLong(), pbufferInfo?.value ?: 0L)).toInt()
}

public fun sceAtracGetChannel(atracId: Int, puiChannel: UInt?): Int {
    val __slot_1 = if (puiChannel == null) 0L else LibcDynamicFfi.allocScalarSlot(puiChannel.toLong())
    try {
        return LibcDynamicFfi.invoke("sceAtracGetChannel", -1, longArrayOf(atracId.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceAtracGetInternalErrorInfo(atracId: Int, piResult: Int?): Int {
    val __slot_1 = if (piResult == null) 0L else LibcDynamicFfi.allocScalarSlot(piResult.toLong())
    try {
        return LibcDynamicFfi.invoke("sceAtracGetInternalErrorInfo", -1, longArrayOf(atracId.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceAtracGetLoopStatus(atracId: Int, piLoopNum: Int?, puiLoopStatus: UInt?): Int {
    val __slot_1 = if (piLoopNum == null) 0L else LibcDynamicFfi.allocScalarSlot(piLoopNum.toLong())
    val __slot_2 = if (puiLoopStatus == null) 0L else LibcDynamicFfi.allocScalarSlot(puiLoopStatus.toLong())
    try {
        return LibcDynamicFfi.invoke("sceAtracGetLoopStatus", -1, longArrayOf(atracId.toLong(), __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceAtracGetNextDecodePosition(atracId: Int, puiSamplePosition: UInt?): Int {
    val __slot_1 = if (puiSamplePosition == null) 0L else LibcDynamicFfi.allocScalarSlot(puiSamplePosition.toLong())
    try {
        return LibcDynamicFfi.invoke("sceAtracGetNextDecodePosition", -1, longArrayOf(atracId.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceAtracGetSecondBufferInfo(atracId: Int, puiPosition: UInt?, puiDataByte: UInt?): Int {
    val __slot_1 = if (puiPosition == null) 0L else LibcDynamicFfi.allocScalarSlot(puiPosition.toLong())
    val __slot_2 = if (puiDataByte == null) 0L else LibcDynamicFfi.allocScalarSlot(puiDataByte.toLong())
    try {
        return LibcDynamicFfi.invoke("sceAtracGetSecondBufferInfo", -1, longArrayOf(atracId.toLong(), __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceAtracGetSoundSample(atracId: Int, piEndSample: Int?, piLoopStartSample: Int?, piLoopEndSample: Int?): Int {
    val __slot_1 = if (piEndSample == null) 0L else LibcDynamicFfi.allocScalarSlot(piEndSample.toLong())
    val __slot_2 = if (piLoopStartSample == null) 0L else LibcDynamicFfi.allocScalarSlot(piLoopStartSample.toLong())
    val __slot_3 = if (piLoopEndSample == null) 0L else LibcDynamicFfi.allocScalarSlot(piLoopEndSample.toLong())
    try {
        return LibcDynamicFfi.invoke("sceAtracGetSoundSample", -1, longArrayOf(atracId.toLong(), __slot_1, __slot_2, __slot_3)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun sceAtracResetPlayPosition(atracId: Int, uiSample: UInt, uiWriteByteFirstBuf: UInt, uiWriteByteSecondBuf: UInt): Int {
    return LibcDynamicFfi.invoke("sceAtracResetPlayPosition", -1, longArrayOf(atracId.toLong(), uiSample.toLong(), uiWriteByteFirstBuf.toLong(), uiWriteByteSecondBuf.toLong())).toInt()
}

public fun sceAtracSetData(atracId: Int, pucBufferAddr: COpaquePointer?, uiBufferByte: UInt): Int {
    return LibcDynamicFfi.invoke("sceAtracSetData", -1, longArrayOf(atracId.toLong(), pucBufferAddr?.value ?: 0L, uiBufferByte.toLong())).toInt()
}

public fun sceAtracSetHalfwayBuffer(atracId: Int, pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int {
    return LibcDynamicFfi.invoke("sceAtracSetHalfwayBuffer", -1, longArrayOf(atracId.toLong(), pucBufferAddr?.value ?: 0L, uiReadByte.toLong(), uiBufferByte.toLong())).toInt()
}

public fun sceAtracSetHalfwayBufferAndGetID(pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int {
    return LibcDynamicFfi.invoke("sceAtracSetHalfwayBufferAndGetID", -1, longArrayOf(pucBufferAddr?.value ?: 0L, uiReadByte.toLong(), uiBufferByte.toLong())).toInt()
}

public fun sceAtracSetSecondBuffer(atracId: Int, pucSecondBufferAddr: COpaquePointer?, uiSecondBufferByte: UInt): Int {
    return LibcDynamicFfi.invoke("sceAtracSetSecondBuffer", -1, longArrayOf(atracId.toLong(), pucSecondBufferAddr?.value ?: 0L, uiSecondBufferByte.toLong())).toInt()
}

public fun sceCtrlSetSamplingCycle(cycle: Int): Int {
    return LibcDynamicFfi.invoke("sceCtrlSetSamplingCycle", -1, longArrayOf(cycle.toLong())).toInt()
}

public fun sceCtrlGetSamplingCycle(pcycle: Int?): Int {
    val __slot_0 = if (pcycle == null) 0L else LibcDynamicFfi.allocScalarSlot(pcycle.toLong())
    try {
        return LibcDynamicFfi.invoke("sceCtrlGetSamplingCycle", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sceCtrlSetSamplingMode(mode: CtrlMode): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceCtrlSetSamplingMode", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceCtrlGetSamplingMode(pmode: Int?): Int {
    val __slot_0 = if (pmode == null) 0L else LibcDynamicFfi.allocScalarSlot(pmode.toLong())
    try {
        return LibcDynamicFfi.invoke("sceCtrlGetSamplingMode", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sceCtrlPeekBufferPositive(padData: SceCtrlData?, count: Int): Int {
    return LibcDynamicFfi.invoke("sceCtrlPeekBufferPositive", -1, longArrayOf(padData?.value ?: 0L, count.toLong())).toInt()
}

public fun sceCtrlPeekBufferNegative(padData: SceCtrlData?, count: Int): Int {
    return LibcDynamicFfi.invoke("sceCtrlPeekBufferNegative", -1, longArrayOf(padData?.value ?: 0L, count.toLong())).toInt()
}

public fun sceCtrlReadBufferPositive(padData: SceCtrlData?, count: Int): Int {
    return LibcDynamicFfi.invoke("sceCtrlReadBufferPositive", -1, longArrayOf(padData?.value ?: 0L, count.toLong())).toInt()
}

public fun sceCtrlReadBufferNegative(padData: SceCtrlData?, count: Int): Int {
    return LibcDynamicFfi.invoke("sceCtrlReadBufferNegative", -1, longArrayOf(padData?.value ?: 0L, count.toLong())).toInt()
}

public fun sceCtrlPeekLatch(latchData: SceCtrlLatch?): Int {
    return LibcDynamicFfi.invoke("sceCtrlPeekLatch", -1, longArrayOf(latchData?.value ?: 0L)).toInt()
}

public fun sceCtrlReadLatch(latchData: SceCtrlLatch?): Int {
    return LibcDynamicFfi.invoke("sceCtrlReadLatch", -1, longArrayOf(latchData?.value ?: 0L)).toInt()
}

public fun sceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int {
    return LibcDynamicFfi.invoke("sceCtrlSetIdleCancelThreshold", -1, longArrayOf(idlereset.toLong(), idleback.toLong())).toInt()
}

public fun sceCtrlGetIdleCancelThreshold(idlereset: Int?, idleback: Int?): Int {
    val __slot_0 = if (idlereset == null) 0L else LibcDynamicFfi.allocScalarSlot(idlereset.toLong())
    val __slot_1 = if (idleback == null) 0L else LibcDynamicFfi.allocScalarSlot(idleback.toLong())
    try {
        return LibcDynamicFfi.invoke("sceCtrlGetIdleCancelThreshold", -1, longArrayOf(__slot_0, __slot_1)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceDisplaySetMode(mode: DisplayMode, width: ULong, height: ULong): UInt {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceDisplaySetMode", -1, longArrayOf(__scratch_0, width.toLong(), height.toLong())).toUInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceDisplayGetMode(pmode: Int?, pwidth: Int?, pheight: Int?): Int {
    val __slot_0 = if (pmode == null) 0L else LibcDynamicFfi.allocScalarSlot(pmode.toLong())
    val __slot_1 = if (pwidth == null) 0L else LibcDynamicFfi.allocScalarSlot(pwidth.toLong())
    val __slot_2 = if (pheight == null) 0L else LibcDynamicFfi.allocScalarSlot(pheight.toLong())
    try {
        return LibcDynamicFfi.invoke("sceDisplayGetMode", -1, longArrayOf(__slot_0, __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceDisplaySetFrameBuf(topAddr: COpaquePointer?, bufferWidth: ULong, pixelFormat: DisplayPixelFormat, sync: DisplaySetBufSync): UInt {
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_3 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceDisplaySetFrameBuf", -1, longArrayOf(topAddr?.value ?: 0L, bufferWidth.toLong(), __scratch_2, __scratch_3)).toUInt()
    } finally {
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
        if (__scratch_3 != 0L) LibcDynamicFfi.freeMem(__scratch_3)
    }
}

public fun sceDisplayGetFrameBuf(topAddr: COpaquePointer?, bufferWidth: ULong?, pixelFormat: DisplayPixelFormat?, sync: DisplaySetBufSync): Int {
    val __slot_1 = if (bufferWidth == null) 0L else LibcDynamicFfi.allocScalarSlot(bufferWidth.toLong())
    val __scratch_3 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceDisplayGetFrameBuf", -1, longArrayOf(topAddr?.value ?: 0L, __slot_1, pixelFormat?.value ?: 0L, __scratch_3)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__scratch_3 != 0L) LibcDynamicFfi.freeMem(__scratch_3)
    }
}

public fun sceDisplayGetVcount(): UInt {
    return LibcDynamicFfi.invoke("sceDisplayGetVcount", -1, longArrayOf()).toUInt()
}

public fun sceDisplayWaitVblank(): Int {
    return LibcDynamicFfi.invoke("sceDisplayWaitVblank", -1, longArrayOf()).toInt()
}

public fun sceDisplayWaitVblankCB(): Int {
    return LibcDynamicFfi.invoke("sceDisplayWaitVblankCB", -1, longArrayOf()).toInt()
}

public fun sceDisplayWaitVblankStart(): Int {
    return LibcDynamicFfi.invoke("sceDisplayWaitVblankStart", -1, longArrayOf()).toInt()
}

public fun sceDisplayWaitVblankStartCB(): Int {
    return LibcDynamicFfi.invoke("sceDisplayWaitVblankStartCB", -1, longArrayOf()).toInt()
}

public fun sceDisplayGetAccumulatedHcount(): Int {
    return LibcDynamicFfi.invoke("sceDisplayGetAccumulatedHcount", -1, longArrayOf()).toInt()
}

public fun sceDisplayGetCurrentHcount(): Int {
    return LibcDynamicFfi.invoke("sceDisplayGetCurrentHcount", -1, longArrayOf()).toInt()
}

public fun sceDisplayGetFramePerSec(): Float {
    return LibcDynamicFfi.invokeFp("sceDisplayGetFramePerSec", 0, true, longArrayOf()).toFloat()
}

public fun sceDisplayIsForeground(): Int {
    return LibcDynamicFfi.invoke("sceDisplayIsForeground", -1, longArrayOf()).toInt()
}

public fun sceDisplayIsVblank(): Int {
    return LibcDynamicFfi.invoke("sceDisplayIsVblank", -1, longArrayOf()).toInt()
}

public fun sceGeEdramGetSize(): UInt {
    return LibcDynamicFfi.invoke("sceGeEdramGetSize", -1, longArrayOf()).toUInt()
}

public fun sceGeEdramGetAddr(): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("sceGeEdramGetAddr", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun sceGeEdramSetAddrTranslation(width: Int): Int {
    return LibcDynamicFfi.invoke("sceGeEdramSetAddrTranslation", -1, longArrayOf(width.toLong())).toInt()
}

public fun sceGeGetCmd(cmd: Int): UInt {
    return LibcDynamicFfi.invoke("sceGeGetCmd", -1, longArrayOf(cmd.toLong())).toUInt()
}

public fun sceGeGetMtx(type: GeMatrixType, matrix: COpaquePointer?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceGeGetMtx", -1, longArrayOf(__scratch_0, matrix?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGeGetStack(stackId: Int, stack: GeStack?): Int {
    return LibcDynamicFfi.invoke("sceGeGetStack", -1, longArrayOf(stackId.toLong(), stack?.value ?: 0L)).toInt()
}

public fun sceGeSaveContext(context: GeContext?): Int {
    return LibcDynamicFfi.invoke("sceGeSaveContext", -1, longArrayOf(context?.value ?: 0L)).toInt()
}

public fun sceGeRestoreContext(context: GeContext?): Int {
    return LibcDynamicFfi.invoke("sceGeRestoreContext", -1, longArrayOf(context?.value ?: 0L)).toInt()
}

public fun sceGeListEnQueue(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: GeListArgs?): Int {
    return LibcDynamicFfi.invoke("sceGeListEnQueue", -1, longArrayOf(list?.value ?: 0L, stall?.value ?: 0L, cbid.toLong(), arg?.value ?: 0L)).toInt()
}

public fun sceGeListEnQueueHead(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: GeListArgs?): Int {
    return LibcDynamicFfi.invoke("sceGeListEnQueueHead", -1, longArrayOf(list?.value ?: 0L, stall?.value ?: 0L, cbid.toLong(), arg?.value ?: 0L)).toInt()
}

public fun sceGeListDeQueue(qid: Int): Int {
    return LibcDynamicFfi.invoke("sceGeListDeQueue", -1, longArrayOf(qid.toLong())).toInt()
}

public fun sceGeListUpdateStallAddr(qid: Int, stall: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceGeListUpdateStallAddr", -1, longArrayOf(qid.toLong(), stall?.value ?: 0L)).toInt()
}

public fun sceGeListSync(qid: Int, syncType: Int): GeListState {
    LibcDynamicFfi.invoke("sceGeListSync", -1, longArrayOf(qid.toLong(), syncType.toLong()))
    return null as GeListState
}

public fun sceGeDrawSync(syncType: Int): GeListState {
    LibcDynamicFfi.invoke("sceGeDrawSync", -1, longArrayOf(syncType.toLong()))
    return null as GeListState
}

public fun sceGeBreak(mode: Int, pParam: GeBreakParam?): Int {
    return LibcDynamicFfi.invoke("sceGeBreak", -1, longArrayOf(mode.toLong(), pParam?.value ?: 0L)).toInt()
}

public fun sceGeContinue(): Int {
    return LibcDynamicFfi.invoke("sceGeContinue", -1, longArrayOf()).toInt()
}

public fun sceGeSetCallback(cb: GeCallbackData?): Int {
    return LibcDynamicFfi.invoke("sceGeSetCallback", -1, longArrayOf(cb?.value ?: 0L)).toInt()
}

public fun sceGeUnsetCallback(cbid: Int): Int {
    return LibcDynamicFfi.invoke("sceGeUnsetCallback", -1, longArrayOf(cbid.toLong())).toInt()
}

public fun sceKernelExitGame() {
    LibcDynamicFfi.invoke("sceKernelExitGame", -1, longArrayOf())
}

public fun sceKernelRegisterExitCallback(id: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelRegisterExitCallback", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelLoadExec(file: COpaquePointer?, param: SceKernelLoadExecParam?): Int {
    return LibcDynamicFfi.invoke("sceKernelLoadExec", -1, longArrayOf(file?.value ?: 0L, param?.value ?: 0L)).toInt()
}

public fun sceKernelAllocPartitionMemory(partition: SceSysMemPartitionId, name: COpaquePointer?, type: SceSysMemBlockTypes, size: UInt, addr: COpaquePointer?): SceUid {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceKernelAllocPartitionMemory", -1, longArrayOf(__scratch_0, name?.value ?: 0L, __scratch_2, size.toLong(), addr?.value ?: 0L))
        return null as SceUid
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun sceKernelGetBlockHeadAddr(blockid: SceUid): COpaquePointer? {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        val rawRet = LibcDynamicFfi.invoke("sceKernelGetBlockHeadAddr", -1, longArrayOf(__scratch_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelFreePartitionMemory(blockid: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelFreePartitionMemory", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelTotalFreeMemSize(): ULong {
    return LibcDynamicFfi.invoke("sceKernelTotalFreeMemSize", -1, longArrayOf()).toULong()
}

public fun sceKernelMaxFreeMemSize(): ULong {
    return LibcDynamicFfi.invoke("sceKernelMaxFreeMemSize", -1, longArrayOf()).toULong()
}

public fun sceKernelDevkitVersion(): UInt {
    return LibcDynamicFfi.invoke("sceKernelDevkitVersion", -1, longArrayOf()).toUInt()
}

public fun sceKernelSetCompiledSdkVersion(version: UInt): Int {
    return LibcDynamicFfi.invoke("sceKernelSetCompiledSdkVersion", -1, longArrayOf(version.toLong())).toInt()
}

public fun sceKernelGetCompiledSdkVersion(): UInt {
    return LibcDynamicFfi.invoke("sceKernelGetCompiledSdkVersion", -1, longArrayOf()).toUInt()
}

public fun sceKernelLibcTime(t: Int?): Int {
    val __slot_0 = if (t == null) 0L else LibcDynamicFfi.allocScalarSlot(t.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelLibcTime", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sceKernelLibcClock(): UInt {
    return LibcDynamicFfi.invoke("sceKernelLibcClock", -1, longArrayOf()).toUInt()
}

public fun sceKernelLibcGettimeofday(tp: Timeval?, tzp: Timezone?): Int {
    return LibcDynamicFfi.invoke("sceKernelLibcGettimeofday", -1, longArrayOf(tp?.value ?: 0L, tzp?.value ?: 0L)).toInt()
}

public fun sceKernelDcacheWritebackAll() {
    LibcDynamicFfi.invoke("sceKernelDcacheWritebackAll", -1, longArrayOf())
}

public fun sceKernelDcacheWritebackInvalidateAll() {
    LibcDynamicFfi.invoke("sceKernelDcacheWritebackInvalidateAll", -1, longArrayOf())
}

public fun sceKernelDcacheWritebackRange(p: COpaquePointer?, size: UInt) {
    LibcDynamicFfi.invoke("sceKernelDcacheWritebackRange", -1, longArrayOf(p?.value ?: 0L, size.toLong()))
}

public fun sceKernelDcacheWritebackInvalidateRange(p: COpaquePointer?, size: UInt) {
    LibcDynamicFfi.invoke("sceKernelDcacheWritebackInvalidateRange", -1, longArrayOf(p?.value ?: 0L, size.toLong()))
}

public fun sceKernelDcacheInvalidateRange(p: COpaquePointer?, size: UInt) {
    LibcDynamicFfi.invoke("sceKernelDcacheInvalidateRange", -1, longArrayOf(p?.value ?: 0L, size.toLong()))
}

public fun sceKernelIcacheInvalidateAll() {
    LibcDynamicFfi.invoke("sceKernelIcacheInvalidateAll", -1, longArrayOf())
}

public fun sceKernelIcacheInvalidateRange(p: COpaquePointer?, size: UInt) {
    LibcDynamicFfi.invoke("sceKernelIcacheInvalidateRange", -1, longArrayOf(p?.value ?: 0L, size.toLong()))
}

public fun sceKernelUtilsMt19937Init(ctx: SceKernelUtilsMt19937Context?, seed: UInt): Int {
    return LibcDynamicFfi.invoke("sceKernelUtilsMt19937Init", -1, longArrayOf(ctx?.value ?: 0L, seed.toLong())).toInt()
}

public fun sceKernelUtilsMt19937UInt(ctx: SceKernelUtilsMt19937Context?): UInt {
    return LibcDynamicFfi.invoke("sceKernelUtilsMt19937UInt", -1, longArrayOf(ctx?.value ?: 0L)).toUInt()
}

public fun sceKernelUtilsMd5Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceKernelUtilsMd5Digest", -1, longArrayOf(data?.value ?: 0L, size.toLong(), digest?.value ?: 0L)).toInt()
}

public fun sceKernelUtilsMd5BlockInit(ctx: SceKernelUtilsMd5Context?): Int {
    return LibcDynamicFfi.invoke("sceKernelUtilsMd5BlockInit", -1, longArrayOf(ctx?.value ?: 0L)).toInt()
}

public fun sceKernelUtilsMd5BlockUpdate(ctx: SceKernelUtilsMd5Context?, data: COpaquePointer?, size: UInt): Int {
    return LibcDynamicFfi.invoke("sceKernelUtilsMd5BlockUpdate", -1, longArrayOf(ctx?.value ?: 0L, data?.value ?: 0L, size.toLong())).toInt()
}

public fun sceKernelUtilsMd5BlockResult(ctx: SceKernelUtilsMd5Context?, digest: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceKernelUtilsMd5BlockResult", -1, longArrayOf(ctx?.value ?: 0L, digest?.value ?: 0L)).toInt()
}

public fun sceKernelUtilsSha1Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceKernelUtilsSha1Digest", -1, longArrayOf(data?.value ?: 0L, size.toLong(), digest?.value ?: 0L)).toInt()
}

public fun sceKernelUtilsSha1BlockInit(ctx: SceKernelUtilsSha1Context?): Int {
    return LibcDynamicFfi.invoke("sceKernelUtilsSha1BlockInit", -1, longArrayOf(ctx?.value ?: 0L)).toInt()
}

public fun sceKernelUtilsSha1BlockUpdate(ctx: SceKernelUtilsSha1Context?, data: COpaquePointer?, size: UInt): Int {
    return LibcDynamicFfi.invoke("sceKernelUtilsSha1BlockUpdate", -1, longArrayOf(ctx?.value ?: 0L, data?.value ?: 0L, size.toLong())).toInt()
}

public fun sceKernelUtilsSha1BlockResult(ctx: SceKernelUtilsSha1Context?, digest: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceKernelUtilsSha1BlockResult", -1, longArrayOf(ctx?.value ?: 0L, digest?.value ?: 0L)).toInt()
}

public fun sceKernelRegisterSubIntrHandler(intNo: Int, no: Int, handler: COpaquePointer?, arg: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceKernelRegisterSubIntrHandler", -1, longArrayOf(intNo.toLong(), no.toLong(), handler?.value ?: 0L, arg?.value ?: 0L)).toInt()
}

public fun sceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int {
    return LibcDynamicFfi.invoke("sceKernelReleaseSubIntrHandler", -1, longArrayOf(intNo.toLong(), no.toLong())).toInt()
}

public fun sceKernelEnableSubIntr(intNo: Int, no: Int): Int {
    return LibcDynamicFfi.invoke("sceKernelEnableSubIntr", -1, longArrayOf(intNo.toLong(), no.toLong())).toInt()
}

public fun sceKernelDisableSubIntr(intNo: Int, no: Int): Int {
    return LibcDynamicFfi.invoke("sceKernelDisableSubIntr", -1, longArrayOf(intNo.toLong(), no.toLong())).toInt()
}

public fun queryIntrHandlerInfo(intrCode: SceUid, subIntrCode: SceUid, data: IntrHandlerOptionParam?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("QueryIntrHandlerInfo", -1, longArrayOf(__scratch_0, __scratch_1, data?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun sceKernelCpuSuspendIntr(): UInt {
    return LibcDynamicFfi.invoke("sceKernelCpuSuspendIntr", -1, longArrayOf()).toUInt()
}

public fun sceKernelCpuResumeIntr(flags: UInt) {
    LibcDynamicFfi.invoke("sceKernelCpuResumeIntr", -1, longArrayOf(flags.toLong()))
}

public fun sceKernelCpuResumeIntrWithSync(flags: UInt) {
    LibcDynamicFfi.invoke("sceKernelCpuResumeIntrWithSync", -1, longArrayOf(flags.toLong()))
}

public fun sceKernelIsCpuIntrSuspended(flags: UInt): Int {
    return LibcDynamicFfi.invoke("sceKernelIsCpuIntrSuspended", -1, longArrayOf(flags.toLong())).toInt()
}

public fun sceKernelIsCpuIntrEnable(): Int {
    return LibcDynamicFfi.invoke("sceKernelIsCpuIntrEnable", -1, longArrayOf()).toInt()
}

public fun sceKernelLoadModule(path: COpaquePointer?, flags: Int, option: SceKernelLMOption?): SceUid {
    LibcDynamicFfi.invoke("sceKernelLoadModule", -1, longArrayOf(path?.value ?: 0L, flags.toLong(), option?.value ?: 0L))
    return null as SceUid
}

public fun sceKernelLoadModuleMs(path: COpaquePointer?, flags: Int, option: SceKernelLMOption?): SceUid {
    LibcDynamicFfi.invoke("sceKernelLoadModuleMs", -1, longArrayOf(path?.value ?: 0L, flags.toLong(), option?.value ?: 0L))
    return null as SceUid
}

public fun sceKernelLoadModuleByID(fid: SceUid, flags: Int, option: SceKernelLMOption?): SceUid {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceKernelLoadModuleByID", -1, longArrayOf(__scratch_0, flags.toLong(), option?.value ?: 0L))
        return null as SceUid
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelLoadModuleBufferUsbWlan(bufSize: ULong, buf: COpaquePointer?, flags: Int, option: SceKernelLMOption?): SceUid {
    LibcDynamicFfi.invoke("sceKernelLoadModuleBufferUsbWlan", -1, longArrayOf(bufSize.toLong(), buf?.value ?: 0L, flags.toLong(), option?.value ?: 0L))
    return null as SceUid
}

public fun sceKernelStartModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: Int?, option: SceKernelSMOption?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_3 = if (status == null) 0L else LibcDynamicFfi.allocScalarSlot(status.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelStartModule", -1, longArrayOf(__scratch_0, argSize.toLong(), argp?.value ?: 0L, __slot_3, option?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun sceKernelStopModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: Int?, option: SceKernelSMOption?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_3 = if (status == null) 0L else LibcDynamicFfi.allocScalarSlot(status.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelStopModule", -1, longArrayOf(__scratch_0, argSize.toLong(), argp?.value ?: 0L, __slot_3, option?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun sceKernelUnloadModule(modId: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelUnloadModule", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelSelfStopUnloadModule(unknown: Int, argSize: ULong, argp: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceKernelSelfStopUnloadModule", -1, longArrayOf(unknown.toLong(), argSize.toLong(), argp?.value ?: 0L)).toInt()
}

public fun sceKernelStopUnloadSelfModule(argSize: ULong, argp: COpaquePointer?, status: Int?, option: SceKernelSMOption?): Int {
    val __slot_2 = if (status == null) 0L else LibcDynamicFfi.allocScalarSlot(status.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelStopUnloadSelfModule", -1, longArrayOf(argSize.toLong(), argp?.value ?: 0L, __slot_2, option?.value ?: 0L)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceKernelQueryModuleInfo(modId: SceUid, info: SceKernelModuleInfo?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelQueryModuleInfo", -1, longArrayOf(__scratch_0, info?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelGetModuleIdList(readBuf: SceUid?, readBufSize: Int, idCount: Int?): Int {
    val __slot_2 = if (idCount == null) 0L else LibcDynamicFfi.allocScalarSlot(idCount.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelGetModuleIdList", -1, longArrayOf(readBuf?.value ?: 0L, readBufSize.toLong(), __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceKernelVolatileMemLock(unk: Int, ptr: COpaquePointer?, size: Int?): Int {
    val __slot_2 = if (size == null) 0L else LibcDynamicFfi.allocScalarSlot(size.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelVolatileMemLock", -1, longArrayOf(unk.toLong(), ptr?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceKernelVolatileMemTryLock(unk: Int, ptr: COpaquePointer?, size: Int?): Int {
    val __slot_2 = if (size == null) 0L else LibcDynamicFfi.allocScalarSlot(size.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelVolatileMemTryLock", -1, longArrayOf(unk.toLong(), ptr?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceKernelVolatileMemUnlock(unk: Int): Int {
    return LibcDynamicFfi.invoke("sceKernelVolatileMemUnlock", -1, longArrayOf(unk.toLong())).toInt()
}

public fun sceKernelStdin(): SceUid {
    LibcDynamicFfi.invoke("sceKernelStdin", -1, longArrayOf())
    return null as SceUid
}

public fun sceKernelStdout(): SceUid {
    LibcDynamicFfi.invoke("sceKernelStdout", -1, longArrayOf())
    return null as SceUid
}

public fun sceKernelStderr(): SceUid {
    LibcDynamicFfi.invoke("sceKernelStderr", -1, longArrayOf())
    return null as SceUid
}

public fun sceKernelGetThreadmanIdType(uid: SceUid): SceKernelIdListType {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceKernelGetThreadmanIdType", -1, longArrayOf(__scratch_0))
        return null as SceKernelIdListType
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelCreateThread(name: COpaquePointer?, entry: SceKernelThreadEntry, initPriority: Int, stackSize: Int, attr: Int, option: SceKernelThreadOptParam?): SceUid {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceKernelCreateThread", -1, longArrayOf(name?.value ?: 0L, __scratch_1, initPriority.toLong(), stackSize.toLong(), attr.toLong(), option?.value ?: 0L))
        return null as SceUid
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun sceKernelDeleteThread(thid: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelDeleteThread", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelStartThread(id: SceUid, argLen: ULong, argP: COpaquePointer?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelStartThread", -1, longArrayOf(__scratch_0, argLen.toLong(), argP?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelExitThread(status: Int): Int {
    return LibcDynamicFfi.invoke("sceKernelExitThread", -1, longArrayOf(status.toLong())).toInt()
}

public fun sceKernelExitDeleteThread(status: Int): Int {
    return LibcDynamicFfi.invoke("sceKernelExitDeleteThread", -1, longArrayOf(status.toLong())).toInt()
}

public fun sceKernelTerminateThread(thid: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelTerminateThread", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelTerminateDeleteThread(thid: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelTerminateDeleteThread", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelSuspendDispatchThread(): Int {
    return LibcDynamicFfi.invoke("sceKernelSuspendDispatchThread", -1, longArrayOf()).toInt()
}

public fun sceKernelResumeDispatchThread(state: Int): Int {
    return LibcDynamicFfi.invoke("sceKernelResumeDispatchThread", -1, longArrayOf(state.toLong())).toInt()
}

public fun sceKernelSleepThread(): Int {
    return LibcDynamicFfi.invoke("sceKernelSleepThread", -1, longArrayOf()).toInt()
}

public fun sceKernelSleepThreadCB(): Int {
    return LibcDynamicFfi.invoke("sceKernelSleepThreadCB", -1, longArrayOf()).toInt()
}

public fun sceKernelWakeupThread(thid: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelWakeupThread", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelCancelWakeupThread(thid: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelCancelWakeupThread", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelSuspendThread(thid: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelSuspendThread", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelResumeThread(thid: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelResumeThread", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelWaitThreadEnd(thid: SceUid, timeout: UInt?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_1 = if (timeout == null) 0L else LibcDynamicFfi.allocScalarSlot(timeout.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelWaitThreadEnd", -1, longArrayOf(__scratch_0, __slot_1)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceKernelWaitThreadEndCB(thid: SceUid, timeout: UInt?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_1 = if (timeout == null) 0L else LibcDynamicFfi.allocScalarSlot(timeout.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelWaitThreadEndCB", -1, longArrayOf(__scratch_0, __slot_1)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceKernelDelayThread(delay: UInt): Int {
    return LibcDynamicFfi.invoke("sceKernelDelayThread", -1, longArrayOf(delay.toLong())).toInt()
}

public fun sceKernelDelayThreadCB(delay: UInt): Int {
    return LibcDynamicFfi.invoke("sceKernelDelayThreadCB", -1, longArrayOf(delay.toLong())).toInt()
}

public fun sceKernelDelaySysClockThread(delay: SceKernelSysClock?): Int {
    return LibcDynamicFfi.invoke("sceKernelDelaySysClockThread", -1, longArrayOf(delay?.value ?: 0L)).toInt()
}

public fun sceKernelDelaySysClockThreadCB(delay: SceKernelSysClock?): Int {
    return LibcDynamicFfi.invoke("sceKernelDelaySysClockThreadCB", -1, longArrayOf(delay?.value ?: 0L)).toInt()
}

public fun sceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int {
    return LibcDynamicFfi.invoke("sceKernelChangeCurrentThreadAttr", -1, longArrayOf(unknown.toLong(), attr.toLong())).toInt()
}

public fun sceKernelChangeThreadPriority(thid: SceUid, priority: Int): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelChangeThreadPriority", -1, longArrayOf(__scratch_0, priority.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelRotateThreadReadyQueue(priority: Int): Int {
    return LibcDynamicFfi.invoke("sceKernelRotateThreadReadyQueue", -1, longArrayOf(priority.toLong())).toInt()
}

public fun sceKernelReleaseWaitThread(thid: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelReleaseWaitThread", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelGetThreadId(): Int {
    return LibcDynamicFfi.invoke("sceKernelGetThreadId", -1, longArrayOf()).toInt()
}

public fun sceKernelGetThreadCurrentPriority(): Int {
    return LibcDynamicFfi.invoke("sceKernelGetThreadCurrentPriority", -1, longArrayOf()).toInt()
}

public fun sceKernelGetThreadExitStatus(thid: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelGetThreadExitStatus", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelCheckThreadStack(): Int {
    return LibcDynamicFfi.invoke("sceKernelCheckThreadStack", -1, longArrayOf()).toInt()
}

public fun sceKernelGetThreadStackFreeSize(thid: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelGetThreadStackFreeSize", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelReferThreadStatus(thid: SceUid, info: SceKernelThreadInfo?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelReferThreadStatus", -1, longArrayOf(__scratch_0, info?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelReferThreadRunStatus(thid: SceUid, status: SceKernelThreadRunStatus?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelReferThreadRunStatus", -1, longArrayOf(__scratch_0, status?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelCreateSema(name: COpaquePointer?, attr: UInt, initVal: Int, maxVal: Int, option: SceKernelSemaOptParam?): SceUid {
    LibcDynamicFfi.invoke("sceKernelCreateSema", -1, longArrayOf(name?.value ?: 0L, attr.toLong(), initVal.toLong(), maxVal.toLong(), option?.value ?: 0L))
    return null as SceUid
}

public fun sceKernelDeleteSema(semaId: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelDeleteSema", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelSignalSema(semaId: SceUid, signal: Int): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelSignalSema", -1, longArrayOf(__scratch_0, signal.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelWaitSema(semaId: SceUid, signal: Int, timeout: UInt?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_2 = if (timeout == null) 0L else LibcDynamicFfi.allocScalarSlot(timeout.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelWaitSema", -1, longArrayOf(__scratch_0, signal.toLong(), __slot_2)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceKernelWaitSemaCB(semaId: SceUid, signal: Int, timeout: UInt?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_2 = if (timeout == null) 0L else LibcDynamicFfi.allocScalarSlot(timeout.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelWaitSemaCB", -1, longArrayOf(__scratch_0, signal.toLong(), __slot_2)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceKernelPollSema(semaId: SceUid, signal: Int): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelPollSema", -1, longArrayOf(__scratch_0, signal.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelReferSemaStatus(semaId: SceUid, info: SceKernelSemaInfo?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelReferSemaStatus", -1, longArrayOf(__scratch_0, info?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelCreateEventFlag(name: COpaquePointer?, attr: Int, bits: Int, opt: SceKernelEventFlagOptParam?): SceUid {
    LibcDynamicFfi.invoke("sceKernelCreateEventFlag", -1, longArrayOf(name?.value ?: 0L, attr.toLong(), bits.toLong(), opt?.value ?: 0L))
    return null as SceUid
}

public fun sceKernelSetEventFlag(evId: SceUid, bits: UInt): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelSetEventFlag", -1, longArrayOf(__scratch_0, bits.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelClearEventFlag(evId: SceUid, bits: UInt): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelClearEventFlag", -1, longArrayOf(__scratch_0, bits.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelPollEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: UInt?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_3 = if (outBits == null) 0L else LibcDynamicFfi.allocScalarSlot(outBits.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelPollEventFlag", -1, longArrayOf(__scratch_0, bits.toLong(), wait.toLong(), __slot_3)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun sceKernelWaitEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: UInt?, timeout: UInt?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_3 = if (outBits == null) 0L else LibcDynamicFfi.allocScalarSlot(outBits.toLong())
    val __slot_4 = if (timeout == null) 0L else LibcDynamicFfi.allocScalarSlot(timeout.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelWaitEventFlag", -1, longArrayOf(__scratch_0, bits.toLong(), wait.toLong(), __slot_3, __slot_4)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

public fun sceKernelWaitEventFlagCB(evId: SceUid, bits: UInt, wait: Int, outBits: UInt?, timeout: UInt?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_3 = if (outBits == null) 0L else LibcDynamicFfi.allocScalarSlot(outBits.toLong())
    val __slot_4 = if (timeout == null) 0L else LibcDynamicFfi.allocScalarSlot(timeout.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelWaitEventFlagCB", -1, longArrayOf(__scratch_0, bits.toLong(), wait.toLong(), __slot_3, __slot_4)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

public fun sceKernelDeleteEventFlag(evId: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelDeleteEventFlag", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelReferEventFlagStatus(event: SceUid, status: SceKernelEventFlagInfo?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelReferEventFlagStatus", -1, longArrayOf(__scratch_0, status?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelCreateMbx(name: COpaquePointer?, attr: UInt, option: SceKernelMbxOptParam?): SceUid {
    LibcDynamicFfi.invoke("sceKernelCreateMbx", -1, longArrayOf(name?.value ?: 0L, attr.toLong(), option?.value ?: 0L))
    return null as SceUid
}

public fun sceKernelDeleteMbx(mbxId: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelDeleteMbx", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelSendMbx(mbxId: SceUid, message: COpaquePointer?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelSendMbx", -1, longArrayOf(__scratch_0, message?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelReceiveMbx(mbxId: SceUid, message: COpaquePointer?, timeout: UInt?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_2 = if (timeout == null) 0L else LibcDynamicFfi.allocScalarSlot(timeout.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelReceiveMbx", -1, longArrayOf(__scratch_0, message?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceKernelReceiveMbxCB(mbxId: SceUid, message: COpaquePointer?, timeout: UInt?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_2 = if (timeout == null) 0L else LibcDynamicFfi.allocScalarSlot(timeout.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelReceiveMbxCB", -1, longArrayOf(__scratch_0, message?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceKernelPollMbx(mbxId: SceUid, pmessage: COpaquePointer?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelPollMbx", -1, longArrayOf(__scratch_0, pmessage?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelCancelReceiveMbx(mbxId: SceUid, num: Int?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_1 = if (num == null) 0L else LibcDynamicFfi.allocScalarSlot(num.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelCancelReceiveMbx", -1, longArrayOf(__scratch_0, __slot_1)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceKernelReferMbxStatus(mbxId: SceUid, info: SceKernelMbxInfo?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelReferMbxStatus", -1, longArrayOf(__scratch_0, info?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelSetAlarm(clock: UInt, handler: SceKernelAlarmHandler, common: COpaquePointer?): SceUid {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceKernelSetAlarm", -1, longArrayOf(clock.toLong(), __scratch_1, common?.value ?: 0L))
        return null as SceUid
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun sceKernelSetSysClockAlarm(clock: SceKernelSysClock?, handler: SceKernelAlarmHandler?, common: COpaquePointer?): SceUid {
    LibcDynamicFfi.invoke("sceKernelSetSysClockAlarm", -1, longArrayOf(clock?.value ?: 0L, handler?.value ?: 0L, common?.value ?: 0L))
    return null as SceUid
}

public fun sceKernelCancelAlarm(alarmId: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelCancelAlarm", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelReferAlarmStatus(alarmId: SceUid, info: SceKernelAlarmInfo?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelReferAlarmStatus", -1, longArrayOf(__scratch_0, info?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelCreateCallback(name: COpaquePointer?, func: SceKernelCallbackFunction, arg: COpaquePointer?): SceUid {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceKernelCreateCallback", -1, longArrayOf(name?.value ?: 0L, __scratch_1, arg?.value ?: 0L))
        return null as SceUid
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun sceKernelReferCallbackStatus(cb: SceUid, status: SceKernelCallbackInfo?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelReferCallbackStatus", -1, longArrayOf(__scratch_0, status?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelDeleteCallback(cb: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelDeleteCallback", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelNotifyCallback(cb: SceUid, arg2: Int): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelNotifyCallback", -1, longArrayOf(__scratch_0, arg2.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelCancelCallback(cb: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelCancelCallback", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelGetCallbackCount(cb: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelGetCallbackCount", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelCheckCallback(): Int {
    return LibcDynamicFfi.invoke("sceKernelCheckCallback", -1, longArrayOf()).toInt()
}

public fun sceKernelGetThreadmanIdList(type: SceKernelIdListType, readBuf: SceUid?, readBufSize: Int, idCount: Int?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_3 = if (idCount == null) 0L else LibcDynamicFfi.allocScalarSlot(idCount.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelGetThreadmanIdList", -1, longArrayOf(__scratch_0, readBuf?.value ?: 0L, readBufSize.toLong(), __slot_3)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun sceKernelReferSystemStatus(status: SceKernelSystemStatus?): Int {
    return LibcDynamicFfi.invoke("sceKernelReferSystemStatus", -1, longArrayOf(status?.value ?: 0L)).toInt()
}

public fun sceKernelCreateMsgPipe(name: COpaquePointer?, part: Int, attr: Int, unk1: COpaquePointer?, opt: COpaquePointer?): SceUid {
    LibcDynamicFfi.invoke("sceKernelCreateMsgPipe", -1, longArrayOf(name?.value ?: 0L, part.toLong(), attr.toLong(), unk1?.value ?: 0L, opt?.value ?: 0L))
    return null as SceUid
}

public fun sceKernelDeleteMsgPipe(uid: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelDeleteMsgPipe", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelSendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_5 = if (timeout == null) 0L else LibcDynamicFfi.allocScalarSlot(timeout.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelSendMsgPipe", -1, longArrayOf(__scratch_0, message?.value ?: 0L, size.toLong(), unk1.toLong(), unk2?.value ?: 0L, __slot_5)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_5 != 0L) LibcDynamicFfi.freeMem(__slot_5)
    }
}

public fun sceKernelSendMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_5 = if (timeout == null) 0L else LibcDynamicFfi.allocScalarSlot(timeout.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelSendMsgPipeCB", -1, longArrayOf(__scratch_0, message?.value ?: 0L, size.toLong(), unk1.toLong(), unk2?.value ?: 0L, __slot_5)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_5 != 0L) LibcDynamicFfi.freeMem(__slot_5)
    }
}

public fun sceKernelTrySendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelTrySendMsgPipe", -1, longArrayOf(__scratch_0, message?.value ?: 0L, size.toLong(), unk1.toLong(), unk2?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_5 = if (timeout == null) 0L else LibcDynamicFfi.allocScalarSlot(timeout.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelReceiveMsgPipe", -1, longArrayOf(__scratch_0, message?.value ?: 0L, size.toLong(), unk1.toLong(), unk2?.value ?: 0L, __slot_5)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_5 != 0L) LibcDynamicFfi.freeMem(__slot_5)
    }
}

public fun sceKernelReceiveMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_5 = if (timeout == null) 0L else LibcDynamicFfi.allocScalarSlot(timeout.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelReceiveMsgPipeCB", -1, longArrayOf(__scratch_0, message?.value ?: 0L, size.toLong(), unk1.toLong(), unk2?.value ?: 0L, __slot_5)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_5 != 0L) LibcDynamicFfi.freeMem(__slot_5)
    }
}

public fun sceKernelTryReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelTryReceiveMsgPipe", -1, longArrayOf(__scratch_0, message?.value ?: 0L, size.toLong(), unk1.toLong(), unk2?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelCancelMsgPipe(uid: SceUid, send: Int?, recv: Int?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_1 = if (send == null) 0L else LibcDynamicFfi.allocScalarSlot(send.toLong())
    val __slot_2 = if (recv == null) 0L else LibcDynamicFfi.allocScalarSlot(recv.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelCancelMsgPipe", -1, longArrayOf(__scratch_0, __slot_1, __slot_2)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceKernelReferMsgPipeStatus(uid: SceUid, info: SceKernelMppInfo?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelReferMsgPipeStatus", -1, longArrayOf(__scratch_0, info?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelCreateVpl(name: COpaquePointer?, part: Int, attr: Int, size: UInt, opt: SceKernelVplOptParam?): SceUid {
    LibcDynamicFfi.invoke("sceKernelCreateVpl", -1, longArrayOf(name?.value ?: 0L, part.toLong(), attr.toLong(), size.toLong(), opt?.value ?: 0L))
    return null as SceUid
}

public fun sceKernelDeleteVpl(uid: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelDeleteVpl", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: UInt?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_3 = if (timeout == null) 0L else LibcDynamicFfi.allocScalarSlot(timeout.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelAllocateVpl", -1, longArrayOf(__scratch_0, size.toLong(), data?.value ?: 0L, __slot_3)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun sceKernelAllocateVplCB(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: UInt?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_3 = if (timeout == null) 0L else LibcDynamicFfi.allocScalarSlot(timeout.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelAllocateVplCB", -1, longArrayOf(__scratch_0, size.toLong(), data?.value ?: 0L, __slot_3)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun sceKernelTryAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelTryAllocateVpl", -1, longArrayOf(__scratch_0, size.toLong(), data?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelFreeVpl(uid: SceUid, data: COpaquePointer?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelFreeVpl", -1, longArrayOf(__scratch_0, data?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelCancelVpl(uid: SceUid, num: Int?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_1 = if (num == null) 0L else LibcDynamicFfi.allocScalarSlot(num.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelCancelVpl", -1, longArrayOf(__scratch_0, __slot_1)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceKernelReferVplStatus(uid: SceUid, info: SceKernelVplInfo?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelReferVplStatus", -1, longArrayOf(__scratch_0, info?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelCreateFpl(name: COpaquePointer?, part: Int, attr: Int, size: UInt, blocks: UInt, opt: SceKernelFplOptParam?): Int {
    return LibcDynamicFfi.invoke("sceKernelCreateFpl", -1, longArrayOf(name?.value ?: 0L, part.toLong(), attr.toLong(), size.toLong(), blocks.toLong(), opt?.value ?: 0L)).toInt()
}

public fun sceKernelDeleteFpl(uid: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelDeleteFpl", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelAllocateFpl(uid: SceUid, data: COpaquePointer?, timeout: UInt?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_2 = if (timeout == null) 0L else LibcDynamicFfi.allocScalarSlot(timeout.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelAllocateFpl", -1, longArrayOf(__scratch_0, data?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceKernelAllocateFplCB(uid: SceUid, data: COpaquePointer?, timeout: UInt?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_2 = if (timeout == null) 0L else LibcDynamicFfi.allocScalarSlot(timeout.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelAllocateFplCB", -1, longArrayOf(__scratch_0, data?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceKernelTryAllocateFpl(uid: SceUid, data: COpaquePointer?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelTryAllocateFpl", -1, longArrayOf(__scratch_0, data?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelFreeFpl(uid: SceUid, data: COpaquePointer?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelFreeFpl", -1, longArrayOf(__scratch_0, data?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelCancelFpl(uid: SceUid, pnum: Int?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_1 = if (pnum == null) 0L else LibcDynamicFfi.allocScalarSlot(pnum.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelCancelFpl", -1, longArrayOf(__scratch_0, __slot_1)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceKernelReferFplStatus(uid: SceUid, info: SceKernelFplInfo?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelReferFplStatus", -1, longArrayOf(__scratch_0, info?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelUSec2SysClock(usec: UInt, clock: SceKernelSysClock?): Int {
    return LibcDynamicFfi.invoke("sceKernelUSec2SysClock", -1, longArrayOf(usec.toLong(), clock?.value ?: 0L)).toInt()
}

public fun sceKernelUSec2SysClockWide(usec: UInt): Long {
    return LibcDynamicFfi.invoke("sceKernelUSec2SysClockWide", -1, longArrayOf(usec.toLong()))
}

public fun sceKernelSysClock2USec(clock: SceKernelSysClock?, low: UInt?, high: UInt?): Int {
    val __slot_1 = if (low == null) 0L else LibcDynamicFfi.allocScalarSlot(low.toLong())
    val __slot_2 = if (high == null) 0L else LibcDynamicFfi.allocScalarSlot(high.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelSysClock2USec", -1, longArrayOf(clock?.value ?: 0L, __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceKernelSysClock2USecWide(clock: Long, low: UInt?, high: UInt?): Int {
    val __slot_1 = if (low == null) 0L else LibcDynamicFfi.allocScalarSlot(low.toLong())
    val __slot_2 = if (high == null) 0L else LibcDynamicFfi.allocScalarSlot(high.toLong())
    try {
        return LibcDynamicFfi.invoke("sceKernelSysClock2USecWide", -1, longArrayOf(clock, __slot_1, __slot_2)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceKernelGetSystemTime(time: SceKernelSysClock?): Int {
    return LibcDynamicFfi.invoke("sceKernelGetSystemTime", -1, longArrayOf(time?.value ?: 0L)).toInt()
}

public fun sceKernelGetSystemTimeWide(): Long {
    return LibcDynamicFfi.invoke("sceKernelGetSystemTimeWide", -1, longArrayOf())
}

public fun sceKernelGetSystemTimeLow(): UInt {
    return LibcDynamicFfi.invoke("sceKernelGetSystemTimeLow", -1, longArrayOf()).toUInt()
}

public fun sceKernelCreateVTimer(name: COpaquePointer?, opt: SceKernelVTimerOptParam?): SceUid {
    LibcDynamicFfi.invoke("sceKernelCreateVTimer", -1, longArrayOf(name?.value ?: 0L, opt?.value ?: 0L))
    return null as SceUid
}

public fun sceKernelDeleteVTimer(uid: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelDeleteVTimer", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelGetVTimerBase(uid: SceUid, base: SceKernelSysClock?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelGetVTimerBase", -1, longArrayOf(__scratch_0, base?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelGetVTimerBaseWide(uid: SceUid): Long {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelGetVTimerBaseWide", -1, longArrayOf(__scratch_0))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelGetVTimerTime(uid: SceUid, time: SceKernelSysClock?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelGetVTimerTime", -1, longArrayOf(__scratch_0, time?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelGetVTimerTimeWide(uid: SceUid): Long {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelGetVTimerTimeWide", -1, longArrayOf(__scratch_0))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelSetVTimerTime(uid: SceUid, time: SceKernelSysClock?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelSetVTimerTime", -1, longArrayOf(__scratch_0, time?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelSetVTimerTimeWide(uid: SceUid, time: Long): Long {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelSetVTimerTimeWide", -1, longArrayOf(__scratch_0, time))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelStartVTimer(uid: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelStartVTimer", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelStopVTimer(uid: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelStopVTimer", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelSetVTimerHandler(uid: SceUid, time: SceKernelSysClock?, handler: SceKernelVTimerHandler, common: COpaquePointer?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelSetVTimerHandler", -1, longArrayOf(__scratch_0, time?.value ?: 0L, __scratch_2, common?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun sceKernelSetVTimerHandlerWide(uid: SceUid, time: Long, handler: SceKernelVTimerHandlerWide, common: COpaquePointer?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelSetVTimerHandlerWide", -1, longArrayOf(__scratch_0, time, __scratch_2, common?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun sceKernelCancelVTimerHandler(uid: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelCancelVTimerHandler", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelReferVTimerStatus(uid: SceUid, info: SceKernelVTimerInfo?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelReferVTimerStatus", -1, longArrayOf(__scratch_0, info?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelRegisterThreadEventHandler(name: COpaquePointer?, threadId: SceUid, mask: Int, handler: SceKernelThreadEventHandler, common: COpaquePointer?): SceUid {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_3 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceKernelRegisterThreadEventHandler", -1, longArrayOf(name?.value ?: 0L, __scratch_1, mask.toLong(), __scratch_3, common?.value ?: 0L))
        return null as SceUid
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
        if (__scratch_3 != 0L) LibcDynamicFfi.freeMem(__scratch_3)
    }
}

public fun sceKernelReleaseThreadEventHandler(uid: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelReleaseThreadEventHandler", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelReferThreadEventHandlerStatus(uid: SceUid, info: SceKernelThreadEventHandlerInfo?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceKernelReferThreadEventHandlerStatus", -1, longArrayOf(__scratch_0, info?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceKernelReferThreadProfiler(): DebugProfilerRegs? {
    val rawRet = LibcDynamicFfi.invoke("sceKernelReferThreadProfiler", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun sceKernelReferGlobalProfiler(): DebugProfilerRegs? {
    val rawRet = LibcDynamicFfi.invoke("sceKernelReferGlobalProfiler", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun sceUsbStart(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceUsbStart", -1, longArrayOf(driverName?.value ?: 0L, size.toLong(), args?.value ?: 0L)).toInt()
}

public fun sceUsbStop(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceUsbStop", -1, longArrayOf(driverName?.value ?: 0L, size.toLong(), args?.value ?: 0L)).toInt()
}

public fun sceUsbActivate(pid: UInt): Int {
    return LibcDynamicFfi.invoke("sceUsbActivate", -1, longArrayOf(pid.toLong())).toInt()
}

public fun sceUsbDeactivate(pid: UInt): Int {
    return LibcDynamicFfi.invoke("sceUsbDeactivate", -1, longArrayOf(pid.toLong())).toInt()
}

public fun sceUsbGetState(): Int {
    return LibcDynamicFfi.invoke("sceUsbGetState", -1, longArrayOf()).toInt()
}

public fun sceUsbGetDrvState(driverName: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceUsbGetDrvState", -1, longArrayOf(driverName?.value ?: 0L)).toInt()
}

public fun sceUsbCamSetupStill(param: UsbCamSetupStillParam?): Int {
    return LibcDynamicFfi.invoke("sceUsbCamSetupStill", -1, longArrayOf(param?.value ?: 0L)).toInt()
}

public fun sceUsbCamSetupStillEx(param: UsbCamSetupStillExParam?): Int {
    return LibcDynamicFfi.invoke("sceUsbCamSetupStillEx", -1, longArrayOf(param?.value ?: 0L)).toInt()
}

public fun sceUsbCamStillInputBlocking(buf: COpaquePointer?, size: ULong): Int {
    return LibcDynamicFfi.invoke("sceUsbCamStillInputBlocking", -1, longArrayOf(buf?.value ?: 0L, size.toLong())).toInt()
}

public fun sceUsbCamStillInput(buf: COpaquePointer?, size: ULong): Int {
    return LibcDynamicFfi.invoke("sceUsbCamStillInput", -1, longArrayOf(buf?.value ?: 0L, size.toLong())).toInt()
}

public fun sceUsbCamStillWaitInputEnd(): Int {
    return LibcDynamicFfi.invoke("sceUsbCamStillWaitInputEnd", -1, longArrayOf()).toInt()
}

public fun sceUsbCamStillPollInputEnd(): Int {
    return LibcDynamicFfi.invoke("sceUsbCamStillPollInputEnd", -1, longArrayOf()).toInt()
}

public fun sceUsbCamStillCancelInput(): Int {
    return LibcDynamicFfi.invoke("sceUsbCamStillCancelInput", -1, longArrayOf()).toInt()
}

public fun sceUsbCamStillGetInputLength(): Int {
    return LibcDynamicFfi.invoke("sceUsbCamStillGetInputLength", -1, longArrayOf()).toInt()
}

public fun sceUsbCamSetupVideo(param: UsbCamSetupVideoParam?, workArea: COpaquePointer?, workAreaSize: Int): Int {
    return LibcDynamicFfi.invoke("sceUsbCamSetupVideo", -1, longArrayOf(param?.value ?: 0L, workArea?.value ?: 0L, workAreaSize.toLong())).toInt()
}

public fun sceUsbCamSetupVideoEx(param: UsbCamSetupVideoExParam?, workArea: COpaquePointer?, workAreaSize: Int): Int {
    return LibcDynamicFfi.invoke("sceUsbCamSetupVideoEx", -1, longArrayOf(param?.value ?: 0L, workArea?.value ?: 0L, workAreaSize.toLong())).toInt()
}

public fun sceUsbCamStartVideo(): Int {
    return LibcDynamicFfi.invoke("sceUsbCamStartVideo", -1, longArrayOf()).toInt()
}

public fun sceUsbCamStopVideo(): Int {
    return LibcDynamicFfi.invoke("sceUsbCamStopVideo", -1, longArrayOf()).toInt()
}

public fun sceUsbCamReadVideoFrameBlocking(buf: COpaquePointer?, size: ULong): Int {
    return LibcDynamicFfi.invoke("sceUsbCamReadVideoFrameBlocking", -1, longArrayOf(buf?.value ?: 0L, size.toLong())).toInt()
}

public fun sceUsbCamReadVideoFrame(buf: COpaquePointer?, size: ULong): Int {
    return LibcDynamicFfi.invoke("sceUsbCamReadVideoFrame", -1, longArrayOf(buf?.value ?: 0L, size.toLong())).toInt()
}

public fun sceUsbCamWaitReadVideoFrameEnd(): Int {
    return LibcDynamicFfi.invoke("sceUsbCamWaitReadVideoFrameEnd", -1, longArrayOf()).toInt()
}

public fun sceUsbCamPollReadVideoFrameEnd(): Int {
    return LibcDynamicFfi.invoke("sceUsbCamPollReadVideoFrameEnd", -1, longArrayOf()).toInt()
}

public fun sceUsbCamGetReadVideoFrameSize(): Int {
    return LibcDynamicFfi.invoke("sceUsbCamGetReadVideoFrameSize", -1, longArrayOf()).toInt()
}

public fun sceUsbCamSetSaturation(saturation: Int): Int {
    return LibcDynamicFfi.invoke("sceUsbCamSetSaturation", -1, longArrayOf(saturation.toLong())).toInt()
}

public fun sceUsbCamSetBrightness(brightness: Int): Int {
    return LibcDynamicFfi.invoke("sceUsbCamSetBrightness", -1, longArrayOf(brightness.toLong())).toInt()
}

public fun sceUsbCamSetContrast(contrast: Int): Int {
    return LibcDynamicFfi.invoke("sceUsbCamSetContrast", -1, longArrayOf(contrast.toLong())).toInt()
}

public fun sceUsbCamSetSharpness(sharpness: Int): Int {
    return LibcDynamicFfi.invoke("sceUsbCamSetSharpness", -1, longArrayOf(sharpness.toLong())).toInt()
}

public fun sceUsbCamSetImageEffectMode(effectMode: UsbCamEffectMode): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceUsbCamSetImageEffectMode", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceUsbCamSetEvLevel(exposureLevel: UsbCamEvLevel): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceUsbCamSetEvLevel", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceUsbCamSetReverseMode(reverseFlags: Int): Int {
    return LibcDynamicFfi.invoke("sceUsbCamSetReverseMode", -1, longArrayOf(reverseFlags.toLong())).toInt()
}

public fun sceUsbCamSetZoom(zoom: Int): Int {
    return LibcDynamicFfi.invoke("sceUsbCamSetZoom", -1, longArrayOf(zoom.toLong())).toInt()
}

public fun sceUsbCamGetSaturation(saturation: Int?): Int {
    val __slot_0 = if (saturation == null) 0L else LibcDynamicFfi.allocScalarSlot(saturation.toLong())
    try {
        return LibcDynamicFfi.invoke("sceUsbCamGetSaturation", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sceUsbCamGetBrightness(brightness: Int?): Int {
    val __slot_0 = if (brightness == null) 0L else LibcDynamicFfi.allocScalarSlot(brightness.toLong())
    try {
        return LibcDynamicFfi.invoke("sceUsbCamGetBrightness", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sceUsbCamGetContrast(contrast: Int?): Int {
    val __slot_0 = if (contrast == null) 0L else LibcDynamicFfi.allocScalarSlot(contrast.toLong())
    try {
        return LibcDynamicFfi.invoke("sceUsbCamGetContrast", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sceUsbCamGetSharpness(sharpness: Int?): Int {
    val __slot_0 = if (sharpness == null) 0L else LibcDynamicFfi.allocScalarSlot(sharpness.toLong())
    try {
        return LibcDynamicFfi.invoke("sceUsbCamGetSharpness", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sceUsbCamGetImageEffectMode(effectMode: UsbCamEffectMode?): Int {
    return LibcDynamicFfi.invoke("sceUsbCamGetImageEffectMode", -1, longArrayOf(effectMode?.value ?: 0L)).toInt()
}

public fun sceUsbCamGetEvLevel(exposureLevel: UsbCamEvLevel?): Int {
    return LibcDynamicFfi.invoke("sceUsbCamGetEvLevel", -1, longArrayOf(exposureLevel?.value ?: 0L)).toInt()
}

public fun sceUsbCamGetReverseMode(reverseFlags: Int?): Int {
    val __slot_0 = if (reverseFlags == null) 0L else LibcDynamicFfi.allocScalarSlot(reverseFlags.toLong())
    try {
        return LibcDynamicFfi.invoke("sceUsbCamGetReverseMode", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sceUsbCamGetZoom(zoom: Int?): Int {
    val __slot_0 = if (zoom == null) 0L else LibcDynamicFfi.allocScalarSlot(zoom.toLong())
    try {
        return LibcDynamicFfi.invoke("sceUsbCamGetZoom", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sceUsbCamAutoImageReverseSW(on: Int): Int {
    return LibcDynamicFfi.invoke("sceUsbCamAutoImageReverseSW", -1, longArrayOf(on.toLong())).toInt()
}

public fun sceUsbCamGetAutoImageReverseState(): Int {
    return LibcDynamicFfi.invoke("sceUsbCamGetAutoImageReverseState", -1, longArrayOf()).toInt()
}

public fun sceUsbCamGetLensDirection(): Int {
    return LibcDynamicFfi.invoke("sceUsbCamGetLensDirection", -1, longArrayOf()).toInt()
}

public fun sceUsbstorBootRegisterNotify(eventFlag: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceUsbstorBootRegisterNotify", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceUsbstorBootUnregisterNotify(eventFlag: UInt): Int {
    return LibcDynamicFfi.invoke("sceUsbstorBootUnregisterNotify", -1, longArrayOf(eventFlag.toLong())).toInt()
}

public fun sceUsbstorBootSetCapacity(size: UInt): Int {
    return LibcDynamicFfi.invoke("sceUsbstorBootSetCapacity", -1, longArrayOf(size.toLong())).toInt()
}

public fun scePowerRegisterCallback(slot: Int, cbid: SceUid): Int {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("scePowerRegisterCallback", -1, longArrayOf(slot.toLong(), __scratch_1)).toInt()
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun scePowerUnregisterCallback(slot: Int): Int {
    return LibcDynamicFfi.invoke("scePowerUnregisterCallback", -1, longArrayOf(slot.toLong())).toInt()
}

public fun scePowerIsPowerOnline(): Int {
    return LibcDynamicFfi.invoke("scePowerIsPowerOnline", -1, longArrayOf()).toInt()
}

public fun scePowerIsBatteryExist(): Int {
    return LibcDynamicFfi.invoke("scePowerIsBatteryExist", -1, longArrayOf()).toInt()
}

public fun scePowerIsBatteryCharging(): Int {
    return LibcDynamicFfi.invoke("scePowerIsBatteryCharging", -1, longArrayOf()).toInt()
}

public fun scePowerGetBatteryChargingStatus(): Int {
    return LibcDynamicFfi.invoke("scePowerGetBatteryChargingStatus", -1, longArrayOf()).toInt()
}

public fun scePowerIsLowBattery(): Int {
    return LibcDynamicFfi.invoke("scePowerIsLowBattery", -1, longArrayOf()).toInt()
}

public fun scePowerGetBatteryLifePercent(): Int {
    return LibcDynamicFfi.invoke("scePowerGetBatteryLifePercent", -1, longArrayOf()).toInt()
}

public fun scePowerGetBatteryLifeTime(): Int {
    return LibcDynamicFfi.invoke("scePowerGetBatteryLifeTime", -1, longArrayOf()).toInt()
}

public fun scePowerGetBatteryTemp(): Int {
    return LibcDynamicFfi.invoke("scePowerGetBatteryTemp", -1, longArrayOf()).toInt()
}

public fun scePowerGetBatteryElec(): Int {
    return LibcDynamicFfi.invoke("scePowerGetBatteryElec", -1, longArrayOf()).toInt()
}

public fun scePowerGetBatteryVolt(): Int {
    return LibcDynamicFfi.invoke("scePowerGetBatteryVolt", -1, longArrayOf()).toInt()
}

public fun scePowerSetCpuClockFrequency(cpufreq: Int): Int {
    return LibcDynamicFfi.invoke("scePowerSetCpuClockFrequency", -1, longArrayOf(cpufreq.toLong())).toInt()
}

public fun scePowerSetBusClockFrequency(busfreq: Int): Int {
    return LibcDynamicFfi.invoke("scePowerSetBusClockFrequency", -1, longArrayOf(busfreq.toLong())).toInt()
}

public fun scePowerGetCpuClockFrequency(): Int {
    return LibcDynamicFfi.invoke("scePowerGetCpuClockFrequency", -1, longArrayOf()).toInt()
}

public fun scePowerGetCpuClockFrequencyInt(): Int {
    return LibcDynamicFfi.invoke("scePowerGetCpuClockFrequencyInt", -1, longArrayOf()).toInt()
}

public fun scePowerGetCpuClockFrequencyFloat(): Float {
    return LibcDynamicFfi.invokeFp("scePowerGetCpuClockFrequencyFloat", 0, true, longArrayOf()).toFloat()
}

public fun scePowerGetBusClockFrequency(): Int {
    return LibcDynamicFfi.invoke("scePowerGetBusClockFrequency", -1, longArrayOf()).toInt()
}

public fun scePowerGetBusClockFrequencyInt(): Int {
    return LibcDynamicFfi.invoke("scePowerGetBusClockFrequencyInt", -1, longArrayOf()).toInt()
}

public fun scePowerGetBusClockFrequencyFloat(): Float {
    return LibcDynamicFfi.invokeFp("scePowerGetBusClockFrequencyFloat", 0, true, longArrayOf()).toFloat()
}

public fun scePowerSetClockFrequency(pllfreq: Int, cpufreq: Int, busfreq: Int): Int {
    return LibcDynamicFfi.invoke("scePowerSetClockFrequency", -1, longArrayOf(pllfreq.toLong(), cpufreq.toLong(), busfreq.toLong())).toInt()
}

public fun scePowerLock(unknown: Int): Int {
    return LibcDynamicFfi.invoke("scePowerLock", -1, longArrayOf(unknown.toLong())).toInt()
}

public fun scePowerUnlock(unknown: Int): Int {
    return LibcDynamicFfi.invoke("scePowerUnlock", -1, longArrayOf(unknown.toLong())).toInt()
}

public fun scePowerTick(t: PowerTick): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("scePowerTick", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun scePowerGetIdleTimer(): Int {
    return LibcDynamicFfi.invoke("scePowerGetIdleTimer", -1, longArrayOf()).toInt()
}

public fun scePowerIdleTimerEnable(unknown: Int): Int {
    return LibcDynamicFfi.invoke("scePowerIdleTimerEnable", -1, longArrayOf(unknown.toLong())).toInt()
}

public fun scePowerIdleTimerDisable(unknown: Int): Int {
    return LibcDynamicFfi.invoke("scePowerIdleTimerDisable", -1, longArrayOf(unknown.toLong())).toInt()
}

public fun scePowerRequestStandby(): Int {
    return LibcDynamicFfi.invoke("scePowerRequestStandby", -1, longArrayOf()).toInt()
}

public fun scePowerRequestSuspend(): Int {
    return LibcDynamicFfi.invoke("scePowerRequestSuspend", -1, longArrayOf()).toInt()
}

public fun sceWlanDevIsPowerOn(): Int {
    return LibcDynamicFfi.invoke("sceWlanDevIsPowerOn", -1, longArrayOf()).toInt()
}

public fun sceWlanGetSwitchState(): Int {
    return LibcDynamicFfi.invoke("sceWlanGetSwitchState", -1, longArrayOf()).toInt()
}

public fun sceWlanGetEtherAddr(etherAddr: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceWlanGetEtherAddr", -1, longArrayOf(etherAddr?.value ?: 0L)).toInt()
}

public fun sceWlanDevAttach(): Int {
    return LibcDynamicFfi.invoke("sceWlanDevAttach", -1, longArrayOf()).toInt()
}

public fun sceWlanDevDetach(): Int {
    return LibcDynamicFfi.invoke("sceWlanDevDetach", -1, longArrayOf()).toInt()
}

public fun sceRtcGetTickResolution(): UInt {
    return LibcDynamicFfi.invoke("sceRtcGetTickResolution", -1, longArrayOf()).toUInt()
}

public fun sceRtcGetCurrentTick(tick: ULong?): Int {
    val __slot_0 = if (tick == null) 0L else LibcDynamicFfi.allocScalarSlot(tick.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcGetCurrentTick", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sceRtcGetCurrentClock(tm: ScePspDateTime?, tz: Int): Int {
    return LibcDynamicFfi.invoke("sceRtcGetCurrentClock", -1, longArrayOf(tm?.value ?: 0L, tz.toLong())).toInt()
}

public fun sceRtcGetCurrentClockLocalTime(tm: ScePspDateTime?): Int {
    return LibcDynamicFfi.invoke("sceRtcGetCurrentClockLocalTime", -1, longArrayOf(tm?.value ?: 0L)).toInt()
}

public fun sceRtcConvertUtcToLocalTime(tickUtc: ULong?, tickLocal: ULong?): Int {
    val __slot_0 = if (tickUtc == null) 0L else LibcDynamicFfi.allocScalarSlot(tickUtc.toLong())
    val __slot_1 = if (tickLocal == null) 0L else LibcDynamicFfi.allocScalarSlot(tickLocal.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcConvertUtcToLocalTime", -1, longArrayOf(__slot_0, __slot_1)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceRtcConvertLocalTimeToUTC(tickLocal: ULong?, tickUtc: ULong?): Int {
    val __slot_0 = if (tickLocal == null) 0L else LibcDynamicFfi.allocScalarSlot(tickLocal.toLong())
    val __slot_1 = if (tickUtc == null) 0L else LibcDynamicFfi.allocScalarSlot(tickUtc.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcConvertLocalTimeToUTC", -1, longArrayOf(__slot_0, __slot_1)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceRtcIsLeapYear(year: Int): Int {
    return LibcDynamicFfi.invoke("sceRtcIsLeapYear", -1, longArrayOf(year.toLong())).toInt()
}

public fun sceRtcGetDaysInMonth(year: Int, month: Int): Int {
    return LibcDynamicFfi.invoke("sceRtcGetDaysInMonth", -1, longArrayOf(year.toLong(), month.toLong())).toInt()
}

public fun sceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int {
    return LibcDynamicFfi.invoke("sceRtcGetDayOfWeek", -1, longArrayOf(year.toLong(), month.toLong(), day.toLong())).toInt()
}

public fun sceRtcCheckValid(date: ScePspDateTime?): Int {
    return LibcDynamicFfi.invoke("sceRtcCheckValid", -1, longArrayOf(date?.value ?: 0L)).toInt()
}

public fun sceRtcSetTick(date: ScePspDateTime?, tick: ULong?): Int {
    val __slot_1 = if (tick == null) 0L else LibcDynamicFfi.allocScalarSlot(tick.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcSetTick", -1, longArrayOf(date?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceRtcGetTick(date: ScePspDateTime?, tick: ULong?): Int {
    val __slot_1 = if (tick == null) 0L else LibcDynamicFfi.allocScalarSlot(tick.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcGetTick", -1, longArrayOf(date?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceRtcCompareTick(tick1: ULong?, tick2: ULong?): Int {
    val __slot_0 = if (tick1 == null) 0L else LibcDynamicFfi.allocScalarSlot(tick1.toLong())
    val __slot_1 = if (tick2 == null) 0L else LibcDynamicFfi.allocScalarSlot(tick2.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcCompareTick", -1, longArrayOf(__slot_0, __slot_1)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceRtcTickAddTicks(destTick: ULong?, srcTick: ULong?, numTicks: ULong): Int {
    val __slot_0 = if (destTick == null) 0L else LibcDynamicFfi.allocScalarSlot(destTick.toLong())
    val __slot_1 = if (srcTick == null) 0L else LibcDynamicFfi.allocScalarSlot(srcTick.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcTickAddTicks", -1, longArrayOf(__slot_0, __slot_1, numTicks.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceRtcTickAddMicroseconds(destTick: ULong?, srcTick: ULong?, numMs: ULong): Int {
    val __slot_0 = if (destTick == null) 0L else LibcDynamicFfi.allocScalarSlot(destTick.toLong())
    val __slot_1 = if (srcTick == null) 0L else LibcDynamicFfi.allocScalarSlot(srcTick.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcTickAddMicroseconds", -1, longArrayOf(__slot_0, __slot_1, numMs.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceRtcTickAddSeconds(destTick: ULong?, srcTick: ULong?, numSeconds: ULong): Int {
    val __slot_0 = if (destTick == null) 0L else LibcDynamicFfi.allocScalarSlot(destTick.toLong())
    val __slot_1 = if (srcTick == null) 0L else LibcDynamicFfi.allocScalarSlot(srcTick.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcTickAddSeconds", -1, longArrayOf(__slot_0, __slot_1, numSeconds.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceRtcTickAddMinutes(destTick: ULong?, srcTick: ULong?, numMinutes: ULong): Int {
    val __slot_0 = if (destTick == null) 0L else LibcDynamicFfi.allocScalarSlot(destTick.toLong())
    val __slot_1 = if (srcTick == null) 0L else LibcDynamicFfi.allocScalarSlot(srcTick.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcTickAddMinutes", -1, longArrayOf(__slot_0, __slot_1, numMinutes.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceRtcTickAddHours(destTick: ULong?, srcTick: ULong?, numHours: ULong): Int {
    val __slot_0 = if (destTick == null) 0L else LibcDynamicFfi.allocScalarSlot(destTick.toLong())
    val __slot_1 = if (srcTick == null) 0L else LibcDynamicFfi.allocScalarSlot(srcTick.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcTickAddHours", -1, longArrayOf(__slot_0, __slot_1, numHours.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceRtcTickAddDays(destTick: ULong?, srcTick: ULong?, numDays: ULong): Int {
    val __slot_0 = if (destTick == null) 0L else LibcDynamicFfi.allocScalarSlot(destTick.toLong())
    val __slot_1 = if (srcTick == null) 0L else LibcDynamicFfi.allocScalarSlot(srcTick.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcTickAddDays", -1, longArrayOf(__slot_0, __slot_1, numDays.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceRtcTickAddWeeks(destTick: ULong?, srcTick: ULong?, numWeeks: ULong): Int {
    val __slot_0 = if (destTick == null) 0L else LibcDynamicFfi.allocScalarSlot(destTick.toLong())
    val __slot_1 = if (srcTick == null) 0L else LibcDynamicFfi.allocScalarSlot(srcTick.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcTickAddWeeks", -1, longArrayOf(__slot_0, __slot_1, numWeeks.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceRtcTickAddMonths(destTick: ULong?, srcTick: ULong?, numMonths: ULong): Int {
    val __slot_0 = if (destTick == null) 0L else LibcDynamicFfi.allocScalarSlot(destTick.toLong())
    val __slot_1 = if (srcTick == null) 0L else LibcDynamicFfi.allocScalarSlot(srcTick.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcTickAddMonths", -1, longArrayOf(__slot_0, __slot_1, numMonths.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceRtcTickAddYears(destTick: ULong?, srcTick: ULong?, numYears: ULong): Int {
    val __slot_0 = if (destTick == null) 0L else LibcDynamicFfi.allocScalarSlot(destTick.toLong())
    val __slot_1 = if (srcTick == null) 0L else LibcDynamicFfi.allocScalarSlot(srcTick.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcTickAddYears", -1, longArrayOf(__slot_0, __slot_1, numYears.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceRtcSetTimeT(date: ScePspDateTime?, time: UInt): Int {
    return LibcDynamicFfi.invoke("sceRtcSetTime_t", -1, longArrayOf(date?.value ?: 0L, time.toLong())).toInt()
}

public fun sceRtcGetTimeT(date: ScePspDateTime?, time: UInt?): Int {
    val __slot_1 = if (time == null) 0L else LibcDynamicFfi.allocScalarSlot(time.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcGetTime_t", -1, longArrayOf(date?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceRtcSetTime64T(date: ScePspDateTime?, time: ULong): Int {
    return LibcDynamicFfi.invoke("sceRtcSetTime64_t", -1, longArrayOf(date?.value ?: 0L, time.toLong())).toInt()
}

public fun sceRtcGetTime64T(date: ScePspDateTime?, time: ULong?): Int {
    val __slot_1 = if (time == null) 0L else LibcDynamicFfi.allocScalarSlot(time.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcGetTime64_t", -1, longArrayOf(date?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceRtcSetDosTime(date: ScePspDateTime?, dosTime: UInt): Int {
    return LibcDynamicFfi.invoke("sceRtcSetDosTime", -1, longArrayOf(date?.value ?: 0L, dosTime.toLong())).toInt()
}

public fun sceRtcGetDosTime(date: ScePspDateTime?, dosTime: UInt): Int {
    return LibcDynamicFfi.invoke("sceRtcGetDosTime", -1, longArrayOf(date?.value ?: 0L, dosTime.toLong())).toInt()
}

public fun sceRtcSetWin32FileTime(date: ScePspDateTime?, time: ULong?): Int {
    val __slot_1 = if (time == null) 0L else LibcDynamicFfi.allocScalarSlot(time.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcSetWin32FileTime", -1, longArrayOf(date?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceRtcGetWin32FileTime(date: ScePspDateTime?, time: ULong?): Int {
    val __slot_1 = if (time == null) 0L else LibcDynamicFfi.allocScalarSlot(time.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcGetWin32FileTime", -1, longArrayOf(date?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceRtcParseDateTime(destTick: ULong?, dateString: COpaquePointer?): Int {
    val __slot_0 = if (destTick == null) 0L else LibcDynamicFfi.allocScalarSlot(destTick.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcParseDateTime", -1, longArrayOf(__slot_0, dateString?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sceRtcFormatRFC3339(pszDateTime: COpaquePointer?, pUtc: ULong?, timeZoneMinutes: Int): Int {
    val __slot_1 = if (pUtc == null) 0L else LibcDynamicFfi.allocScalarSlot(pUtc.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcFormatRFC3339", -1, longArrayOf(pszDateTime?.value ?: 0L, __slot_1, timeZoneMinutes.toLong())).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceRtcFormatRFC3339LocalTime(pszDateTime: COpaquePointer?, pUtc: ULong?): Int {
    val __slot_1 = if (pUtc == null) 0L else LibcDynamicFfi.allocScalarSlot(pUtc.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcFormatRFC3339LocalTime", -1, longArrayOf(pszDateTime?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceRtcParseRFC3339(pUtc: ULong?, pszDateTime: COpaquePointer?): Int {
    val __slot_0 = if (pUtc == null) 0L else LibcDynamicFfi.allocScalarSlot(pUtc.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcParseRFC3339", -1, longArrayOf(__slot_0, pszDateTime?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sceRtcFormatRFC2822(pszDateTime: COpaquePointer?, pUtc: ULong?, timeZoneMinutes: Int): Int {
    val __slot_1 = if (pUtc == null) 0L else LibcDynamicFfi.allocScalarSlot(pUtc.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcFormatRFC2822", -1, longArrayOf(pszDateTime?.value ?: 0L, __slot_1, timeZoneMinutes.toLong())).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceRtcFormatRFC2822LocalTime(pszDateTime: COpaquePointer?, pUtc: ULong?): Int {
    val __slot_1 = if (pUtc == null) 0L else LibcDynamicFfi.allocScalarSlot(pUtc.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRtcFormatRFC2822LocalTime", -1, longArrayOf(pszDateTime?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceIoOpen(file: COpaquePointer?, flags: Int, permissions: IoPermissions): SceUid {
    LibcDynamicFfi.invoke("sceIoOpen", -1, longArrayOf(file?.value ?: 0L, flags.toLong(), permissions.toLong()))
    return null as SceUid
}

public fun sceIoOpenAsync(file: COpaquePointer?, flags: Int, permissions: IoPermissions): SceUid {
    LibcDynamicFfi.invoke("sceIoOpenAsync", -1, longArrayOf(file?.value ?: 0L, flags.toLong(), permissions.toLong()))
    return null as SceUid
}

public fun sceIoClose(fd: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceIoClose", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceIoCloseAsync(fd: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceIoCloseAsync", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceIoRead(fd: SceUid, data: COpaquePointer?, size: UInt): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceIoRead", -1, longArrayOf(__scratch_0, data?.value ?: 0L, size.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceIoReadAsync(fd: SceUid, data: COpaquePointer?, size: UInt): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceIoReadAsync", -1, longArrayOf(__scratch_0, data?.value ?: 0L, size.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceIoWrite(fd: SceUid, data: COpaquePointer?, size: ULong): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceIoWrite", -1, longArrayOf(__scratch_0, data?.value ?: 0L, size.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceIoWriteAsync(fd: SceUid, data: COpaquePointer?, size: UInt): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceIoWriteAsync", -1, longArrayOf(__scratch_0, data?.value ?: 0L, size.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceIoLseek(fd: SceUid, offset: Long, whence: IoWhence): Long {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceIoLseek", -1, longArrayOf(__scratch_0, offset, __scratch_2))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun sceIoLseekAsync(fd: SceUid, offset: Long, whence: IoWhence): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceIoLseekAsync", -1, longArrayOf(__scratch_0, offset, __scratch_2)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun sceIoLseek32(fd: SceUid, offset: Int, whence: IoWhence): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceIoLseek32", -1, longArrayOf(__scratch_0, offset.toLong(), __scratch_2)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun sceIoLseek32Async(fd: SceUid, offset: Int, whence: IoWhence): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceIoLseek32Async", -1, longArrayOf(__scratch_0, offset.toLong(), __scratch_2)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun sceIoRemove(file: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceIoRemove", -1, longArrayOf(file?.value ?: 0L)).toInt()
}

public fun sceIoMkdir(dir: COpaquePointer?, mode: IoPermissions): Int {
    return LibcDynamicFfi.invoke("sceIoMkdir", -1, longArrayOf(dir?.value ?: 0L, mode.toLong())).toInt()
}

public fun sceIoRmdir(path: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceIoRmdir", -1, longArrayOf(path?.value ?: 0L)).toInt()
}

public fun sceIoChdir(path: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceIoChdir", -1, longArrayOf(path?.value ?: 0L)).toInt()
}

public fun sceIoRename(oldname: COpaquePointer?, newname: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceIoRename", -1, longArrayOf(oldname?.value ?: 0L, newname?.value ?: 0L)).toInt()
}

public fun sceIoDopen(dirname: COpaquePointer?): SceUid {
    LibcDynamicFfi.invoke("sceIoDopen", -1, longArrayOf(dirname?.value ?: 0L))
    return null as SceUid
}

public fun sceIoDread(fd: SceUid, dir: SceIoDirent?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceIoDread", -1, longArrayOf(__scratch_0, dir?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceIoDclose(fd: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceIoDclose", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceIoDevctl(dev: COpaquePointer?, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int {
    return LibcDynamicFfi.invoke("sceIoDevctl", -1, longArrayOf(dev?.value ?: 0L, cmd.toLong(), indata?.value ?: 0L, inlen.toLong(), outdata?.value ?: 0L, outlen.toLong())).toInt()
}

public fun sceIoAssign(dev1: COpaquePointer?, dev2: COpaquePointer?, dev3: COpaquePointer?, mode: IoAssignPerms, unk1: COpaquePointer?, unk2: Int): Int {
    val __scratch_3 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceIoAssign", -1, longArrayOf(dev1?.value ?: 0L, dev2?.value ?: 0L, dev3?.value ?: 0L, __scratch_3, unk1?.value ?: 0L, unk2.toLong())).toInt()
    } finally {
        if (__scratch_3 != 0L) LibcDynamicFfi.freeMem(__scratch_3)
    }
}

public fun sceIoUnassign(dev: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceIoUnassign", -1, longArrayOf(dev?.value ?: 0L)).toInt()
}

public fun sceIoGetstat(file: COpaquePointer?, stat: SceIoStat?): Int {
    return LibcDynamicFfi.invoke("sceIoGetstat", -1, longArrayOf(file?.value ?: 0L, stat?.value ?: 0L)).toInt()
}

public fun sceIoChstat(file: COpaquePointer?, stat: SceIoStat?, bits: Int): Int {
    return LibcDynamicFfi.invoke("sceIoChstat", -1, longArrayOf(file?.value ?: 0L, stat?.value ?: 0L, bits.toLong())).toInt()
}

public fun sceIoIoctl(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceIoIoctl", -1, longArrayOf(__scratch_0, cmd.toLong(), indata?.value ?: 0L, inlen.toLong(), outdata?.value ?: 0L, outlen.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceIoIoctlAsync(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceIoIoctlAsync", -1, longArrayOf(__scratch_0, cmd.toLong(), indata?.value ?: 0L, inlen.toLong(), outdata?.value ?: 0L, outlen.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceIoSync(device: COpaquePointer?, unk: UInt): Int {
    return LibcDynamicFfi.invoke("sceIoSync", -1, longArrayOf(device?.value ?: 0L, unk.toLong())).toInt()
}

public fun sceIoWaitAsync(fd: SceUid, res: Long?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_1 = if (res == null) 0L else LibcDynamicFfi.allocScalarSlot(res)
    try {
        return LibcDynamicFfi.invoke("sceIoWaitAsync", -1, longArrayOf(__scratch_0, __slot_1)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceIoWaitAsyncCB(fd: SceUid, res: Long?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_1 = if (res == null) 0L else LibcDynamicFfi.allocScalarSlot(res)
    try {
        return LibcDynamicFfi.invoke("sceIoWaitAsyncCB", -1, longArrayOf(__scratch_0, __slot_1)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceIoPollAsync(fd: SceUid, res: Long?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_1 = if (res == null) 0L else LibcDynamicFfi.allocScalarSlot(res)
    try {
        return LibcDynamicFfi.invoke("sceIoPollAsync", -1, longArrayOf(__scratch_0, __slot_1)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceIoGetAsyncStat(fd: SceUid, poll: Int, res: Long?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_2 = if (res == null) 0L else LibcDynamicFfi.allocScalarSlot(res)
    try {
        return LibcDynamicFfi.invoke("sceIoGetAsyncStat", -1, longArrayOf(__scratch_0, poll.toLong(), __slot_2)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceIoCancel(fd: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceIoCancel", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceIoGetDevType(fd: SceUid): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceIoGetDevType", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceIoChangeAsyncPriority(fd: SceUid, pri: Int): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceIoChangeAsyncPriority", -1, longArrayOf(__scratch_0, pri.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceIoSetAsyncCallback(fd: SceUid, cb: SceUid, argp: COpaquePointer?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceIoSetAsyncCallback", -1, longArrayOf(__scratch_0, __scratch_1, argp?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun sceJpegInitMJpeg(): Int {
    return LibcDynamicFfi.invoke("sceJpegInitMJpeg", -1, longArrayOf()).toInt()
}

public fun sceJpegFinishMJpeg(): Int {
    return LibcDynamicFfi.invoke("sceJpegFinishMJpeg", -1, longArrayOf()).toInt()
}

public fun sceJpegCreateMJpeg(width: Int, height: Int): Int {
    return LibcDynamicFfi.invoke("sceJpegCreateMJpeg", -1, longArrayOf(width.toLong(), height.toLong())).toInt()
}

public fun sceJpegDeleteMJpeg(): Int {
    return LibcDynamicFfi.invoke("sceJpegDeleteMJpeg", -1, longArrayOf()).toInt()
}

public fun sceJpegDecodeMJpeg(jpegBuf: COpaquePointer?, size: ULong, rgba: COpaquePointer?, unk: UInt): Int {
    return LibcDynamicFfi.invoke("sceJpegDecodeMJpeg", -1, longArrayOf(jpegBuf?.value ?: 0L, size.toLong(), rgba?.value ?: 0L, unk.toLong())).toInt()
}

public fun sceUmdCheckMedium(): Int {
    return LibcDynamicFfi.invoke("sceUmdCheckMedium", -1, longArrayOf()).toInt()
}

public fun sceUmdGetDiscInfo(info: UmdInfo?): Int {
    return LibcDynamicFfi.invoke("sceUmdGetDiscInfo", -1, longArrayOf(info?.value ?: 0L)).toInt()
}

public fun sceUmdActivate(unit: Int, drive: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceUmdActivate", -1, longArrayOf(unit.toLong(), drive?.value ?: 0L)).toInt()
}

public fun sceUmdDeactivate(unit: Int, drive: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceUmdDeactivate", -1, longArrayOf(unit.toLong(), drive?.value ?: 0L)).toInt()
}

public fun sceUmdWaitDriveStat(state: Int): Int {
    return LibcDynamicFfi.invoke("sceUmdWaitDriveStat", -1, longArrayOf(state.toLong())).toInt()
}

public fun sceUmdWaitDriveStatWithTimer(state: Int, timeout: UInt): Int {
    return LibcDynamicFfi.invoke("sceUmdWaitDriveStatWithTimer", -1, longArrayOf(state.toLong(), timeout.toLong())).toInt()
}

public fun sceUmdWaitDriveStatCB(state: Int, timeout: UInt): Int {
    return LibcDynamicFfi.invoke("sceUmdWaitDriveStatCB", -1, longArrayOf(state.toLong(), timeout.toLong())).toInt()
}

public fun sceUmdCancelWaitDriveStat(): Int {
    return LibcDynamicFfi.invoke("sceUmdCancelWaitDriveStat", -1, longArrayOf()).toInt()
}

public fun sceUmdGetDriveStat(): Int {
    return LibcDynamicFfi.invoke("sceUmdGetDriveStat", -1, longArrayOf()).toInt()
}

public fun sceUmdGetErrorStat(): Int {
    return LibcDynamicFfi.invoke("sceUmdGetErrorStat", -1, longArrayOf()).toInt()
}

public fun sceUmdRegisterUMDCallBack(cbid: Int): Int {
    return LibcDynamicFfi.invoke("sceUmdRegisterUMDCallBack", -1, longArrayOf(cbid.toLong())).toInt()
}

public fun sceUmdUnRegisterUMDCallBack(cbid: Int): Int {
    return LibcDynamicFfi.invoke("sceUmdUnRegisterUMDCallBack", -1, longArrayOf(cbid.toLong())).toInt()
}

public fun sceUmdReplacePermit(): Int {
    return LibcDynamicFfi.invoke("sceUmdReplacePermit", -1, longArrayOf()).toInt()
}

public fun sceUmdReplaceProhibit(): Int {
    return LibcDynamicFfi.invoke("sceUmdReplaceProhibit", -1, longArrayOf()).toInt()
}

public fun sceMpegInit(): Int {
    return LibcDynamicFfi.invoke("sceMpegInit", -1, longArrayOf()).toInt()
}

public fun sceMpegFinish() {
    LibcDynamicFfi.invoke("sceMpegFinish", -1, longArrayOf())
}

public fun sceMpegRingbufferQueryMemSize(packets: Int): Int {
    return LibcDynamicFfi.invoke("sceMpegRingbufferQueryMemSize", -1, longArrayOf(packets.toLong())).toInt()
}

public fun sceMpegRingbufferConstruct(ringbuffer: SceMpegRingbuffer?, packets: Int, data: COpaquePointer?, size: Int, callback: SceMpegRingbufferCb, cbParam: COpaquePointer?): Int {
    val __scratch_4 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceMpegRingbufferConstruct", -1, longArrayOf(ringbuffer?.value ?: 0L, packets.toLong(), data?.value ?: 0L, size.toLong(), __scratch_4, cbParam?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_4 != 0L) LibcDynamicFfi.freeMem(__scratch_4)
    }
}

public fun sceMpegRingbufferDestruct(ringbuffer: SceMpegRingbuffer?) {
    LibcDynamicFfi.invoke("sceMpegRingbufferDestruct", -1, longArrayOf(ringbuffer?.value ?: 0L))
}

public fun sceMpegRingbufferAvailableSize(ringbuffer: SceMpegRingbuffer?): Int {
    return LibcDynamicFfi.invoke("sceMpegRingbufferAvailableSize", -1, longArrayOf(ringbuffer?.value ?: 0L)).toInt()
}

public fun sceMpegRingbufferPut(ringbuffer: SceMpegRingbuffer?, numPackets: Int, available: Int): Int {
    return LibcDynamicFfi.invoke("sceMpegRingbufferPut", -1, longArrayOf(ringbuffer?.value ?: 0L, numPackets.toLong(), available.toLong())).toInt()
}

public fun sceMpegQueryMemSize(unk: Int): Int {
    return LibcDynamicFfi.invoke("sceMpegQueryMemSize", -1, longArrayOf(unk.toLong())).toInt()
}

public fun sceMpegCreate(handle: SceMpeg, data: COpaquePointer?, size: Int, ringbuffer: SceMpegRingbuffer?, frameWidth: Int, unk1: Int, unk2: Int): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceMpegCreate", -1, longArrayOf(__scratch_0, data?.value ?: 0L, size.toLong(), ringbuffer?.value ?: 0L, frameWidth.toLong(), unk1.toLong(), unk2.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceMpegDelete(handle: SceMpeg) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceMpegDelete", -1, longArrayOf(__scratch_0))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceMpegQueryStreamOffset(handle: SceMpeg, buffer: COpaquePointer?, offset: Int?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_2 = if (offset == null) 0L else LibcDynamicFfi.allocScalarSlot(offset.toLong())
    try {
        return LibcDynamicFfi.invoke("sceMpegQueryStreamOffset", -1, longArrayOf(__scratch_0, buffer?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceMpegQueryStreamSize(buffer: COpaquePointer?, size: Int?): Int {
    val __slot_1 = if (size == null) 0L else LibcDynamicFfi.allocScalarSlot(size.toLong())
    try {
        return LibcDynamicFfi.invoke("sceMpegQueryStreamSize", -1, longArrayOf(buffer?.value ?: 0L, __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceMpegRegistStream(handle: SceMpeg, streamId: Int, unk: Int): SceMpegStream {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceMpegRegistStream", -1, longArrayOf(__scratch_0, streamId.toLong(), unk.toLong()))
        return null as SceMpegStream
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceMpegUnRegistStream(handle: SceMpeg, stream: SceMpegStream) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceMpegUnRegistStream", -1, longArrayOf(__scratch_0, __scratch_1))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun sceMpegFlushAllStream(handle: SceMpeg): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceMpegFlushAllStream", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceMpegMallocAvcEsBuf(handle: SceMpeg): COpaquePointer? {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        val rawRet = LibcDynamicFfi.invoke("sceMpegMallocAvcEsBuf", -1, longArrayOf(__scratch_0))
        return if (rawRet == 0L) null else COpaquePointer(rawRet)
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceMpegFreeAvcEsBuf(handle: SceMpeg, buf: COpaquePointer?) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceMpegFreeAvcEsBuf", -1, longArrayOf(__scratch_0, buf?.value ?: 0L))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceMpegQueryAtracEsSize(handle: SceMpeg, esSize: Int?, outSize: Int?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_1 = if (esSize == null) 0L else LibcDynamicFfi.allocScalarSlot(esSize.toLong())
    val __slot_2 = if (outSize == null) 0L else LibcDynamicFfi.allocScalarSlot(outSize.toLong())
    try {
        return LibcDynamicFfi.invoke("sceMpegQueryAtracEsSize", -1, longArrayOf(__scratch_0, __slot_1, __slot_2)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceMpegInitAu(handle: SceMpeg, esBuffer: COpaquePointer?, au: SceMpegAu?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceMpegInitAu", -1, longArrayOf(__scratch_0, esBuffer?.value ?: 0L, au?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceMpegGetAvcAu(handle: SceMpeg, stream: SceMpegStream, au: SceMpegAu?, unk: Int?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_3 = if (unk == null) 0L else LibcDynamicFfi.allocScalarSlot(unk.toLong())
    try {
        return LibcDynamicFfi.invoke("sceMpegGetAvcAu", -1, longArrayOf(__scratch_0, __scratch_1, au?.value ?: 0L, __slot_3)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun sceMpegAvcDecodeMode(handle: SceMpeg, mode: SceMpegAvcMode?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceMpegAvcDecodeMode", -1, longArrayOf(__scratch_0, mode?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceMpegAvcDecode(handle: SceMpeg, au: SceMpegAu?, iframeWidth: Int, buffer: COpaquePointer?, init: Int?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_4 = if (init == null) 0L else LibcDynamicFfi.allocScalarSlot(init.toLong())
    try {
        return LibcDynamicFfi.invoke("sceMpegAvcDecode", -1, longArrayOf(__scratch_0, au?.value ?: 0L, iframeWidth.toLong(), buffer?.value ?: 0L, __slot_4)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

public fun sceMpegAvcDecodeStop(handle: SceMpeg, frameWidth: Int, buffer: COpaquePointer?, status: Int?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_3 = if (status == null) 0L else LibcDynamicFfi.allocScalarSlot(status.toLong())
    try {
        return LibcDynamicFfi.invoke("sceMpegAvcDecodeStop", -1, longArrayOf(__scratch_0, frameWidth.toLong(), buffer?.value ?: 0L, __slot_3)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun sceMpegGetAtracAu(handle: SceMpeg, stream: SceMpegStream, au: SceMpegAu?, unk: COpaquePointer?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceMpegGetAtracAu", -1, longArrayOf(__scratch_0, __scratch_1, au?.value ?: 0L, unk?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun sceMpegAtracDecode(handle: SceMpeg, au: SceMpegAu?, buffer: COpaquePointer?, init: Int): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceMpegAtracDecode", -1, longArrayOf(__scratch_0, au?.value ?: 0L, buffer?.value ?: 0L, init.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceMpegBaseYCrCbCopyVme(yuvBuffer: COpaquePointer?, buffer: Int?, type: Int): Int {
    val __slot_1 = if (buffer == null) 0L else LibcDynamicFfi.allocScalarSlot(buffer.toLong())
    try {
        return LibcDynamicFfi.invoke("sceMpegBaseYCrCbCopyVme", -1, longArrayOf(yuvBuffer?.value ?: 0L, __slot_1, type.toLong())).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceMpegBaseCscInit(width: Int): Int {
    return LibcDynamicFfi.invoke("sceMpegBaseCscInit", -1, longArrayOf(width.toLong())).toInt()
}

public fun sceMpegBaseCscVme(rgbBuffer: COpaquePointer?, rgbBuffer2: COpaquePointer?, width: Int, yCrCbBuffer: SceMpegYCrCbBuffer?): Int {
    return LibcDynamicFfi.invoke("sceMpegBaseCscVme", -1, longArrayOf(rgbBuffer?.value ?: 0L, rgbBuffer2?.value ?: 0L, width.toLong(), yCrCbBuffer?.value ?: 0L)).toInt()
}

public fun sceMpegbaseBea18f91(lli: SceMpegLLI?): Int {
    return LibcDynamicFfi.invoke("sceMpegbase_BEA18F91", -1, longArrayOf(lli?.value ?: 0L)).toInt()
}

public fun sceHprmPeekCurrentKey(key: Int?): Int {
    val __slot_0 = if (key == null) 0L else LibcDynamicFfi.allocScalarSlot(key.toLong())
    try {
        return LibcDynamicFfi.invoke("sceHprmPeekCurrentKey", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sceHprmPeekLatch(latch: List<UInt>?): Int {
    return LibcDynamicFfi.invoke("sceHprmPeekLatch", -1, longArrayOf(latch?.value ?: 0L)).toInt()
}

public fun sceHprmReadLatch(latch: List<UInt>?): Int {
    return LibcDynamicFfi.invoke("sceHprmReadLatch", -1, longArrayOf(latch?.value ?: 0L)).toInt()
}

public fun sceHprmIsHeadphoneExist(): Int {
    return LibcDynamicFfi.invoke("sceHprmIsHeadphoneExist", -1, longArrayOf()).toInt()
}

public fun sceHprmIsRemoteExist(): Int {
    return LibcDynamicFfi.invoke("sceHprmIsRemoteExist", -1, longArrayOf()).toInt()
}

public fun sceHprmIsMicrophoneExist(): Int {
    return LibcDynamicFfi.invoke("sceHprmIsMicrophoneExist", -1, longArrayOf()).toInt()
}

public fun sceGuDepthBuffer(zbp: COpaquePointer?, zbw: Int) {
    LibcDynamicFfi.invoke("sceGuDepthBuffer", -1, longArrayOf(zbp?.value ?: 0L, zbw.toLong()))
}

public fun sceGuDispBuffer(width: Int, height: Int, dispbp: COpaquePointer?, dispbw: Int) {
    LibcDynamicFfi.invoke("sceGuDispBuffer", -1, longArrayOf(width.toLong(), height.toLong(), dispbp?.value ?: 0L, dispbw.toLong()))
}

public fun sceGuDrawBuffer(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuDrawBuffer", -1, longArrayOf(__scratch_0, fbp?.value ?: 0L, fbw.toLong()))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuDrawBufferList(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuDrawBufferList", -1, longArrayOf(__scratch_0, fbp?.value ?: 0L, fbw.toLong()))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuDisplay(state: Boolean): Boolean {
    val rawRet = LibcDynamicFfi.invoke("sceGuDisplay", -1, longArrayOf(if (state) 1L else 0L))
    return (rawRet and 0xFFL) != 0L
}

public fun sceGuDepthFunc(function: DepthFunc) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuDepthFunc", -1, longArrayOf(__scratch_0))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuDepthMask(mask: Int) {
    LibcDynamicFfi.invoke("sceGuDepthMask", -1, longArrayOf(mask.toLong()))
}

public fun sceGuDepthOffset(offset: Int) {
    LibcDynamicFfi.invoke("sceGuDepthOffset", -1, longArrayOf(offset.toLong()))
}

public fun sceGuDepthRange(near: Int, far: Int) {
    LibcDynamicFfi.invoke("sceGuDepthRange", -1, longArrayOf(near.toLong(), far.toLong()))
}

public fun sceGuFog(near: Float, far: Float, color: UInt) {
    LibcDynamicFfi.invokeFp("sceGuFog", 5, false, longArrayOf((near.toRawBits().toLong() and 0xFFFF_FFFFL), (far.toRawBits().toLong() and 0xFFFF_FFFFL), color.toLong()))
}

public fun sceGuInit() {
    LibcDynamicFfi.invoke("sceGuInit", -1, longArrayOf())
}

public fun sceGuTerm() {
    LibcDynamicFfi.invoke("sceGuTerm", -1, longArrayOf())
}

public fun sceGuBreak(mode: Int) {
    LibcDynamicFfi.invoke("sceGuBreak", -1, longArrayOf(mode.toLong()))
}

public fun sceGuContinue() {
    LibcDynamicFfi.invoke("sceGuContinue", -1, longArrayOf())
}

public fun sceGuSetCallback(signal: GuCallbackId, callback: GuCallback): GuCallback {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuSetCallback", -1, longArrayOf(__scratch_0, __scratch_1))
        return null
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun sceGuSignal(behavior: SignalBehavior, signal: Int) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuSignal", -1, longArrayOf(__scratch_0, signal.toLong()))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuSendCommandf(cmd: GeCommand, argument: Float) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invokeFp("sceGuSendCommandf", 4, false, longArrayOf(__scratch_0, (argument.toRawBits().toLong() and 0xFFFF_FFFFL)))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuSendCommandi(cmd: GeCommand, argument: Int) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuSendCommandi", -1, longArrayOf(__scratch_0, argument.toLong()))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuGetMemory(size: Int): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("sceGuGetMemory", -1, longArrayOf(size.toLong()))
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun sceGuStart(contextType: GuContextType, list: COpaquePointer?) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuStart", -1, longArrayOf(__scratch_0, list?.value ?: 0L))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuFinish(): Int {
    return LibcDynamicFfi.invoke("sceGuFinish", -1, longArrayOf()).toInt()
}

public fun sceGuFinishId(id: UInt): Int {
    return LibcDynamicFfi.invoke("sceGuFinishId", -1, longArrayOf(id.toLong())).toInt()
}

public fun sceGuCallList(list: COpaquePointer?) {
    LibcDynamicFfi.invoke("sceGuCallList", -1, longArrayOf(list?.value ?: 0L))
}

public fun sceGuCallMode(mode: Int) {
    LibcDynamicFfi.invoke("sceGuCallMode", -1, longArrayOf(mode.toLong()))
}

public fun sceGuCheckList(): Int {
    return LibcDynamicFfi.invoke("sceGuCheckList", -1, longArrayOf()).toInt()
}

public fun sceGuSendList(mode: GuQueueMode, list: COpaquePointer?, context: GeContext?) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuSendList", -1, longArrayOf(__scratch_0, list?.value ?: 0L, context?.value ?: 0L))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuSwapBuffers(): COpaquePointer? {
    val rawRet = LibcDynamicFfi.invoke("sceGuSwapBuffers", -1, longArrayOf())
    return if (rawRet == 0L) null else COpaquePointer(rawRet)
}

public fun sceGuSync(mode: GuSyncMode, behavior: GuSyncBehavior): GeListState {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuSync", -1, longArrayOf(__scratch_0, __scratch_1))
        return null as GeListState
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun sceGuDrawArray(prim: GuPrimitive, vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuDrawArray", -1, longArrayOf(__scratch_0, vtype.toLong(), count.toLong(), indices?.value ?: 0L, vertices?.value ?: 0L))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuBeginObject(vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    LibcDynamicFfi.invoke("sceGuBeginObject", -1, longArrayOf(vtype.toLong(), count.toLong(), indices?.value ?: 0L, vertices?.value ?: 0L))
}

public fun sceGuEndObject() {
    LibcDynamicFfi.invoke("sceGuEndObject", -1, longArrayOf())
}

public fun sceGuSetStatus(state: GuState, status: Int) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuSetStatus", -1, longArrayOf(__scratch_0, status.toLong()))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuGetStatus(state: GuState): Boolean {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        val rawRet = LibcDynamicFfi.invoke("sceGuGetStatus", -1, longArrayOf(__scratch_0))
        return (rawRet and 0xFFL) != 0L
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuSetAllStatus(status: Int) {
    LibcDynamicFfi.invoke("sceGuSetAllStatus", -1, longArrayOf(status.toLong()))
}

public fun sceGuGetAllStatus(): Int {
    return LibcDynamicFfi.invoke("sceGuGetAllStatus", -1, longArrayOf()).toInt()
}

public fun sceGuEnable(state: GuState) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuEnable", -1, longArrayOf(__scratch_0))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuDisable(state: GuState) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuDisable", -1, longArrayOf(__scratch_0))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuLight(light: Int, type: LightType, components: Int, position: ScePspFVector3) {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_3 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuLight", -1, longArrayOf(light.toLong(), __scratch_1, components.toLong(), __scratch_3))
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
        if (__scratch_3 != 0L) LibcDynamicFfi.freeMem(__scratch_3)
    }
}

public fun sceGuLightAtt(light: Int, atten0: Float, atten1: Float, atten2: Float) {
    LibcDynamicFfi.invokeFp("sceGuLightAtt", 84, false, longArrayOf(light.toLong(), (atten0.toRawBits().toLong() and 0xFFFF_FFFFL), (atten1.toRawBits().toLong() and 0xFFFF_FFFFL), (atten2.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun sceGuLightColor(light: Int, component: Int, color: UInt) {
    LibcDynamicFfi.invoke("sceGuLightColor", -1, longArrayOf(light.toLong(), component.toLong(), color.toLong()))
}

public fun sceGuLightMode(mode: LightMode) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuLightMode", -1, longArrayOf(__scratch_0))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuLightSpot(light: Int, direction: ScePspFVector3, exponent: Float, cutoff: Float) {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invokeFp("sceGuLightSpot", 80, false, longArrayOf(light.toLong(), __scratch_1, (exponent.toRawBits().toLong() and 0xFFFF_FFFFL), (cutoff.toRawBits().toLong() and 0xFFFF_FFFFL)))
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun sceGuClear(flags: Int) {
    LibcDynamicFfi.invoke("sceGuClear", -1, longArrayOf(flags.toLong()))
}

public fun sceGuClearColor(color: UInt) {
    LibcDynamicFfi.invoke("sceGuClearColor", -1, longArrayOf(color.toLong()))
}

public fun sceGuClearDepth(depth: UInt) {
    LibcDynamicFfi.invoke("sceGuClearDepth", -1, longArrayOf(depth.toLong()))
}

public fun sceGuClearStencil(stencil: UInt) {
    LibcDynamicFfi.invoke("sceGuClearStencil", -1, longArrayOf(stencil.toLong()))
}

public fun sceGuPixelMask(mask: UInt) {
    LibcDynamicFfi.invoke("sceGuPixelMask", -1, longArrayOf(mask.toLong()))
}

public fun sceGuColor(color: UInt) {
    LibcDynamicFfi.invoke("sceGuColor", -1, longArrayOf(color.toLong()))
}

public fun sceGuColorFunc(func: ColorFunc, color: UInt, mask: UInt) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuColorFunc", -1, longArrayOf(__scratch_0, color.toLong(), mask.toLong()))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuColorMaterial(components: Int) {
    LibcDynamicFfi.invoke("sceGuColorMaterial", -1, longArrayOf(components.toLong()))
}

public fun sceGuAlphaFunc(func: AlphaFunc, value: Int, mask: Int) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuAlphaFunc", -1, longArrayOf(__scratch_0, value.toLong(), mask.toLong()))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuAmbient(color: UInt) {
    LibcDynamicFfi.invoke("sceGuAmbient", -1, longArrayOf(color.toLong()))
}

public fun sceGuAmbientColor(color: UInt) {
    LibcDynamicFfi.invoke("sceGuAmbientColor", -1, longArrayOf(color.toLong()))
}

public fun sceGuBlendFunc(op: BlendOp, src: BlendSrc, dest: BlendDst, srcFix: UInt, destFix: UInt) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuBlendFunc", -1, longArrayOf(__scratch_0, __scratch_1, __scratch_2, srcFix.toLong(), destFix.toLong()))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun sceGuMaterial(components: Int, color: UInt) {
    LibcDynamicFfi.invoke("sceGuMaterial", -1, longArrayOf(components.toLong(), color.toLong()))
}

public fun sceGuModelColor(emissive: UInt, ambient: UInt, diffuse: UInt, specular: UInt) {
    LibcDynamicFfi.invoke("sceGuModelColor", -1, longArrayOf(emissive.toLong(), ambient.toLong(), diffuse.toLong(), specular.toLong()))
}

public fun sceGuStencilFunc(func: StencilFunc, ref: Int, mask: Int) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuStencilFunc", -1, longArrayOf(__scratch_0, ref.toLong(), mask.toLong()))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuStencilOp(fail: StencilOperation, zfail: StencilOperation, zpass: StencilOperation) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuStencilOp", -1, longArrayOf(__scratch_0, __scratch_1, __scratch_2))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun sceGuSpecular(power: Float) {
    LibcDynamicFfi.invokeFp("sceGuSpecular", 1, false, longArrayOf((power.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun sceGuFrontFace(order: FrontFaceDirection) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuFrontFace", -1, longArrayOf(__scratch_0))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuLogicalOp(op: LogicalOperation) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuLogicalOp", -1, longArrayOf(__scratch_0))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuSetDither(matrix: ScePspIMatrix4) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuSetDither", -1, longArrayOf(__scratch_0))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuShadeModel(mode: ShadingModel) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuShadeModel", -1, longArrayOf(__scratch_0))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuCopyImage(psm: DisplayPixelFormat, sx: Int, sy: Int, width: Int, height: Int, srcw: Int, src: COpaquePointer?, dx: Int, dy: Int, destw: Int, dest: COpaquePointer?) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuCopyImage", -1, longArrayOf(__scratch_0, sx.toLong(), sy.toLong(), width.toLong(), height.toLong(), srcw.toLong(), src?.value ?: 0L, dx.toLong(), dy.toLong(), destw.toLong(), dest?.value ?: 0L))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuTexEnvColor(color: UInt) {
    LibcDynamicFfi.invoke("sceGuTexEnvColor", -1, longArrayOf(color.toLong()))
}

public fun sceGuTexFilter(min: TextureFilter, mag: TextureFilter) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuTexFilter", -1, longArrayOf(__scratch_0, __scratch_1))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun sceGuTexFlush() {
    LibcDynamicFfi.invoke("sceGuTexFlush", -1, longArrayOf())
}

public fun sceGuTexFunc(tfx: TextureEffect, tcc: TextureColorComponent) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuTexFunc", -1, longArrayOf(__scratch_0, __scratch_1))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun sceGuTexImage(mipmap: MipmapLevel, width: Int, height: Int, tbw: Int, tbp: COpaquePointer?) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuTexImage", -1, longArrayOf(__scratch_0, width.toLong(), height.toLong(), tbw.toLong(), tbp?.value ?: 0L))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuTexLevelMode(mode: TextureLevelMode, bias: Float) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invokeFp("sceGuTexLevelMode", 4, false, longArrayOf(__scratch_0, (bias.toRawBits().toLong() and 0xFFFF_FFFFL)))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuTexMapMode(mode: TextureMapMode, a1: UInt, a2: UInt) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuTexMapMode", -1, longArrayOf(__scratch_0, a1.toLong(), a2.toLong()))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuTexMode(tpsm: TexturePixelFormat, maxmips: Int, a2: Int, swizzle: Int) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuTexMode", -1, longArrayOf(__scratch_0, maxmips.toLong(), a2.toLong(), swizzle.toLong()))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuTexOffset(u: Float, v: Float) {
    LibcDynamicFfi.invokeFp("sceGuTexOffset", 5, false, longArrayOf((u.toRawBits().toLong() and 0xFFFF_FFFFL), (v.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun sceGuTexProjMapMode(mode: TextureProjectionMapMode) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuTexProjMapMode", -1, longArrayOf(__scratch_0))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuTexScale(u: Float, v: Float) {
    LibcDynamicFfi.invokeFp("sceGuTexScale", 5, false, longArrayOf((u.toRawBits().toLong() and 0xFFFF_FFFFL), (v.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun sceGuTexSlope(slope: Float) {
    LibcDynamicFfi.invokeFp("sceGuTexSlope", 1, false, longArrayOf((slope.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun sceGuTexSync() {
    LibcDynamicFfi.invoke("sceGuTexSync", -1, longArrayOf())
}

public fun sceGuTexWrap(u: GuTexWrapMode, v: GuTexWrapMode) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuTexWrap", -1, longArrayOf(__scratch_0, __scratch_1))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun sceGuClutLoad(numBlocks: Int, cbp: COpaquePointer?) {
    LibcDynamicFfi.invoke("sceGuClutLoad", -1, longArrayOf(numBlocks.toLong(), cbp?.value ?: 0L))
}

public fun sceGuClutMode(cpsm: ClutPixelFormat, shift: UInt, mask: UInt, a3: UInt) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuClutMode", -1, longArrayOf(__scratch_0, shift.toLong(), mask.toLong(), a3.toLong()))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuOffset(x: UInt, y: UInt) {
    LibcDynamicFfi.invoke("sceGuOffset", -1, longArrayOf(x.toLong(), y.toLong()))
}

public fun sceGuScissor(x: Int, y: Int, w: Int, h: Int) {
    LibcDynamicFfi.invoke("sceGuScissor", -1, longArrayOf(x.toLong(), y.toLong(), w.toLong(), h.toLong()))
}

public fun sceGuViewport(cx: Int, cy: Int, width: Int, height: Int) {
    LibcDynamicFfi.invoke("sceGuViewport", -1, longArrayOf(cx.toLong(), cy.toLong(), width.toLong(), height.toLong()))
}

public fun sceGuDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    LibcDynamicFfi.invoke("sceGuDrawBezier", -1, longArrayOf(vType.toLong(), uCount.toLong(), vCount.toLong(), indices?.value ?: 0L, vertices?.value ?: 0L))
}

public fun sceGuPatchDivide(ulevel: UInt, vlevel: UInt) {
    LibcDynamicFfi.invoke("sceGuPatchDivide", -1, longArrayOf(ulevel.toLong(), vlevel.toLong()))
}

public fun sceGuPatchFrontFace(a0: UInt) {
    LibcDynamicFfi.invoke("sceGuPatchFrontFace", -1, longArrayOf(a0.toLong()))
}

public fun sceGuPatchPrim(prim: PatchPrimitive) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuPatchPrim", -1, longArrayOf(__scratch_0))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGuDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    LibcDynamicFfi.invoke("sceGuDrawSpline", -1, longArrayOf(vType.toLong(), uCount.toLong(), vCount.toLong(), uEdge.toLong(), vEdge.toLong(), indices?.value ?: 0L, vertices?.value ?: 0L))
}

public fun sceGuSetMatrix(type: MatrixMode, matrix: ScePspFMatrix4) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuSetMatrix", -1, longArrayOf(__scratch_0, __scratch_1))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun sceGuBoneMatrix(index: UInt, matrix: ScePspFMatrix4) {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuBoneMatrix", -1, longArrayOf(index.toLong(), __scratch_1))
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun sceGuMorphWeight(index: Int, weight: Float) {
    LibcDynamicFfi.invokeFp("sceGuMorphWeight", 4, false, longArrayOf(index.toLong(), (weight.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun sceGuDrawArrayN(primitiveType: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGuDrawArrayN", -1, longArrayOf(__scratch_0, vType.toLong(), count.toLong(), a3.toLong(), indices?.value ?: 0L, vertices?.value ?: 0L))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGumDrawArray(prim: GuPrimitive, vType: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGumDrawArray", -1, longArrayOf(__scratch_0, vType.toLong(), count.toLong(), indices?.value ?: 0L, vertices?.value ?: 0L))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGumDrawArrayN(prim: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGumDrawArrayN", -1, longArrayOf(__scratch_0, vType.toLong(), count.toLong(), a3.toLong(), indices?.value ?: 0L, vertices?.value ?: 0L))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGumDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    LibcDynamicFfi.invoke("sceGumDrawBezier", -1, longArrayOf(vType.toLong(), uCount.toLong(), vCount.toLong(), indices?.value ?: 0L, vertices?.value ?: 0L))
}

public fun sceGumDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?) {
    LibcDynamicFfi.invoke("sceGumDrawSpline", -1, longArrayOf(vType.toLong(), uCount.toLong(), vCount.toLong(), uEdge.toLong(), vEdge.toLong(), indices?.value ?: 0L, vertices?.value ?: 0L))
}

public fun sceGumFastInverse() {
    LibcDynamicFfi.invoke("sceGumFastInverse", -1, longArrayOf())
}

public fun sceGumFullInverse() {
    LibcDynamicFfi.invoke("sceGumFullInverse", -1, longArrayOf())
}

public fun sceGumLoadIdentity() {
    LibcDynamicFfi.invoke("sceGumLoadIdentity", -1, longArrayOf())
}

public fun sceGumLoadMatrix(m: ScePspFMatrix4) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGumLoadMatrix", -1, longArrayOf(__scratch_0))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGumLookAt(eye: ScePspFVector3, center: ScePspFVector3, up: ScePspFVector3) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGumLookAt", -1, longArrayOf(__scratch_0, __scratch_1, __scratch_2))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun sceGumMatrixMode(mode: MatrixMode) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGumMatrixMode", -1, longArrayOf(__scratch_0))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGumMultMatrix(m: ScePspFMatrix4) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGumMultMatrix", -1, longArrayOf(__scratch_0))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGumOrtho(left: Float, right: Float, bottom: Float, top: Float, near: Float, far: Float) {
    LibcDynamicFfi.invokeFp("sceGumOrtho", 1365, false, longArrayOf((left.toRawBits().toLong() and 0xFFFF_FFFFL), (right.toRawBits().toLong() and 0xFFFF_FFFFL), (bottom.toRawBits().toLong() and 0xFFFF_FFFFL), (top.toRawBits().toLong() and 0xFFFF_FFFFL), (near.toRawBits().toLong() and 0xFFFF_FFFFL), (far.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun sceGumPerspective(fovy: Float, aspect: Float, near: Float, far: Float) {
    LibcDynamicFfi.invokeFp("sceGumPerspective", 85, false, longArrayOf((fovy.toRawBits().toLong() and 0xFFFF_FFFFL), (aspect.toRawBits().toLong() and 0xFFFF_FFFFL), (near.toRawBits().toLong() and 0xFFFF_FFFFL), (far.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun sceGumPopMatrix() {
    LibcDynamicFfi.invoke("sceGumPopMatrix", -1, longArrayOf())
}

public fun sceGumPushMatrix() {
    LibcDynamicFfi.invoke("sceGumPushMatrix", -1, longArrayOf())
}

public fun sceGumRotateX(angle: Float) {
    LibcDynamicFfi.invokeFp("sceGumRotateX", 1, false, longArrayOf((angle.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun sceGumRotateY(angle: Float) {
    LibcDynamicFfi.invokeFp("sceGumRotateY", 1, false, longArrayOf((angle.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun sceGumRotateZ(angle: Float) {
    LibcDynamicFfi.invokeFp("sceGumRotateZ", 1, false, longArrayOf((angle.toRawBits().toLong() and 0xFFFF_FFFFL)))
}

public fun sceGumRotateXYZ(v: ScePspFVector3) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGumRotateXYZ", -1, longArrayOf(__scratch_0))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGumRotateZYX(v: ScePspFVector3) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGumRotateZYX", -1, longArrayOf(__scratch_0))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGumScale(v: ScePspFVector3) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGumScale", -1, longArrayOf(__scratch_0))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGumStoreMatrix(m: ScePspFMatrix4) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGumStoreMatrix", -1, longArrayOf(__scratch_0))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGumTranslate(v: ScePspFVector3) {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        LibcDynamicFfi.invoke("sceGumTranslate", -1, longArrayOf(__scratch_0))
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceGumUpdateMatrix() {
    LibcDynamicFfi.invoke("sceGumUpdateMatrix", -1, longArrayOf())
}

public fun sceMp3ReserveMp3Handle(args: SceMp3InitArg?): Int {
    return LibcDynamicFfi.invoke("sceMp3ReserveMp3Handle", -1, longArrayOf(args?.value ?: 0L)).toInt()
}

public fun sceMp3ReleaseMp3Handle(handle: Mp3Handle): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceMp3ReleaseMp3Handle", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceMp3InitResource(): Int {
    return LibcDynamicFfi.invoke("sceMp3InitResource", -1, longArrayOf()).toInt()
}

public fun sceMp3TermResource(): Int {
    return LibcDynamicFfi.invoke("sceMp3TermResource", -1, longArrayOf()).toInt()
}

public fun sceMp3Init(handle: Mp3Handle): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceMp3Init", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceMp3Decode(handle: Mp3Handle, dst: COpaquePointer?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceMp3Decode", -1, longArrayOf(__scratch_0, dst?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceMp3GetInfoToAddStreamData(handle: Mp3Handle, dst: COpaquePointer?, toWrite: Int?, srcPos: Int?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_2 = if (toWrite == null) 0L else LibcDynamicFfi.allocScalarSlot(toWrite.toLong())
    val __slot_3 = if (srcPos == null) 0L else LibcDynamicFfi.allocScalarSlot(srcPos.toLong())
    try {
        return LibcDynamicFfi.invoke("sceMp3GetInfoToAddStreamData", -1, longArrayOf(__scratch_0, dst?.value ?: 0L, __slot_2, __slot_3)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun sceMp3NotifyAddStreamData(handle: Mp3Handle, size: Int): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceMp3NotifyAddStreamData", -1, longArrayOf(__scratch_0, size.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceMp3CheckStreamDataNeeded(handle: Mp3Handle): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceMp3CheckStreamDataNeeded", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceMp3SetLoopNum(handle: Mp3Handle, loop: Int): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceMp3SetLoopNum", -1, longArrayOf(__scratch_0, loop.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceMp3GetLoopNum(handle: Mp3Handle): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceMp3GetLoopNum", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceMp3GetSumDecodedSample(handle: Mp3Handle): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceMp3GetSumDecodedSample", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceMp3GetMaxOutputSample(handle: Mp3Handle): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceMp3GetMaxOutputSample", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceMp3GetSamplingRate(handle: Mp3Handle): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceMp3GetSamplingRate", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceMp3GetBitRate(handle: Mp3Handle): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceMp3GetBitRate", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceMp3GetMp3ChannelNum(handle: Mp3Handle): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceMp3GetMp3ChannelNum", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceMp3ResetPlayPosition(handle: Mp3Handle): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceMp3ResetPlayPosition", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceRegOpenRegistry(reg: Key?, mode: Int, handle: RegHandle?): Int {
    return LibcDynamicFfi.invoke("sceRegOpenRegistry", -1, longArrayOf(reg?.value ?: 0L, mode.toLong(), handle?.value ?: 0L)).toInt()
}

public fun sceRegFlushRegistry(handle: RegHandle): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceRegFlushRegistry", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceRegCloseRegistry(handle: RegHandle): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceRegCloseRegistry", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceRegOpenCategory(handle: RegHandle, name: COpaquePointer?, mode: Int, dirHandle: RegHandle?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceRegOpenCategory", -1, longArrayOf(__scratch_0, name?.value ?: 0L, mode.toLong(), dirHandle?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceRegRemoveCategory(handle: RegHandle, name: COpaquePointer?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceRegRemoveCategory", -1, longArrayOf(__scratch_0, name?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceRegCloseCategory(dirHandle: RegHandle): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceRegCloseCategory", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceRegFlushCategory(dirHandle: RegHandle): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceRegFlushCategory", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceRegGetKeyInfo(dirHandle: RegHandle, name: COpaquePointer?, keyHandle: RegHandle?, type: KeyType?, size: ULong?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_4 = if (size == null) 0L else LibcDynamicFfi.allocScalarSlot(size.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRegGetKeyInfo", -1, longArrayOf(__scratch_0, name?.value ?: 0L, keyHandle?.value ?: 0L, type?.value ?: 0L, __slot_4)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

public fun sceRegGetKeyInfoByName(dirHandle: RegHandle, name: COpaquePointer?, type: KeyType?, size: ULong?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_3 = if (size == null) 0L else LibcDynamicFfi.allocScalarSlot(size.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRegGetKeyInfoByName", -1, longArrayOf(__scratch_0, name?.value ?: 0L, type?.value ?: 0L, __slot_3)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_3 != 0L) LibcDynamicFfi.freeMem(__slot_3)
    }
}

public fun sceRegGetKeyValue(dirHandle: RegHandle, keyHandle: RegHandle, buf: COpaquePointer?, size: ULong): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceRegGetKeyValue", -1, longArrayOf(__scratch_0, __scratch_1, buf?.value ?: 0L, size.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun sceRegGetKeyValueByName(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceRegGetKeyValueByName", -1, longArrayOf(__scratch_0, name?.value ?: 0L, buf?.value ?: 0L, size.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceRegSetKeyValue(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceRegSetKeyValue", -1, longArrayOf(__scratch_0, name?.value ?: 0L, buf?.value ?: 0L, size.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceRegGetKeysNum(dirHandle: RegHandle, num: Int?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_1 = if (num == null) 0L else LibcDynamicFfi.allocScalarSlot(num.toLong())
    try {
        return LibcDynamicFfi.invoke("sceRegGetKeysNum", -1, longArrayOf(__scratch_0, __slot_1)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceRegGetKeys(dirHandle: RegHandle, buf: COpaquePointer?, num: Int): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceRegGetKeys", -1, longArrayOf(__scratch_0, buf?.value ?: 0L, num.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceRegCreateKey(dirHandle: RegHandle, name: COpaquePointer?, type: Int, size: ULong): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceRegCreateKey", -1, longArrayOf(__scratch_0, name?.value ?: 0L, type.toLong(), size.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceRegRemoveRegistry(key: Key?): Int {
    return LibcDynamicFfi.invoke("sceRegRemoveRegistry", -1, longArrayOf(key?.value ?: 0L)).toInt()
}

public fun sceOpenPSIDGetOpenPSID(openpsid: OpenPSID?): Int {
    return LibcDynamicFfi.invoke("sceOpenPSIDGetOpenPSID", -1, longArrayOf(openpsid?.value ?: 0L)).toInt()
}

public fun sceUtilityMsgDialogInitStart(params: UtilityMsgDialogParams?): Int {
    return LibcDynamicFfi.invoke("sceUtilityMsgDialogInitStart", -1, longArrayOf(params?.value ?: 0L)).toInt()
}

public fun sceUtilityMsgDialogShutdownStart() {
    LibcDynamicFfi.invoke("sceUtilityMsgDialogShutdownStart", -1, longArrayOf())
}

public fun sceUtilityMsgDialogGetStatus(): Int {
    return LibcDynamicFfi.invoke("sceUtilityMsgDialogGetStatus", -1, longArrayOf()).toInt()
}

public fun sceUtilityMsgDialogUpdate(n: Int) {
    LibcDynamicFfi.invoke("sceUtilityMsgDialogUpdate", -1, longArrayOf(n.toLong()))
}

public fun sceUtilityMsgDialogAbort(): Int {
    return LibcDynamicFfi.invoke("sceUtilityMsgDialogAbort", -1, longArrayOf()).toInt()
}

public fun sceUtilityNetconfInitStart(data: UtilityNetconfData?): Int {
    return LibcDynamicFfi.invoke("sceUtilityNetconfInitStart", -1, longArrayOf(data?.value ?: 0L)).toInt()
}

public fun sceUtilityNetconfShutdownStart(): Int {
    return LibcDynamicFfi.invoke("sceUtilityNetconfShutdownStart", -1, longArrayOf()).toInt()
}

public fun sceUtilityNetconfUpdate(unknown: Int): Int {
    return LibcDynamicFfi.invoke("sceUtilityNetconfUpdate", -1, longArrayOf(unknown.toLong())).toInt()
}

public fun sceUtilityNetconfGetStatus(): Int {
    return LibcDynamicFfi.invoke("sceUtilityNetconfGetStatus", -1, longArrayOf()).toInt()
}

public fun sceUtilityCheckNetParam(id: Int): Int {
    return LibcDynamicFfi.invoke("sceUtilityCheckNetParam", -1, longArrayOf(id.toLong())).toInt()
}

public fun sceUtilityGetNetParam(conf: Int, param: NetParam, data: UtilityNetData?): Int {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceUtilityGetNetParam", -1, longArrayOf(conf.toLong(), __scratch_1, data?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun sceUtilitySavedataInitStart(params: SceUtilitySavedataParam?): Int {
    return LibcDynamicFfi.invoke("sceUtilitySavedataInitStart", -1, longArrayOf(params?.value ?: 0L)).toInt()
}

public fun sceUtilitySavedataGetStatus(): Int {
    return LibcDynamicFfi.invoke("sceUtilitySavedataGetStatus", -1, longArrayOf()).toInt()
}

public fun sceUtilitySavedataShutdownStart(): Int {
    return LibcDynamicFfi.invoke("sceUtilitySavedataShutdownStart", -1, longArrayOf()).toInt()
}

public fun sceUtilitySavedataUpdate(unknown: Int) {
    LibcDynamicFfi.invoke("sceUtilitySavedataUpdate", -1, longArrayOf(unknown.toLong()))
}

public fun sceUtilityGameSharingInitStart(params: UtilityGameSharingParams?): Int {
    return LibcDynamicFfi.invoke("sceUtilityGameSharingInitStart", -1, longArrayOf(params?.value ?: 0L)).toInt()
}

public fun sceUtilityGameSharingShutdownStart() {
    LibcDynamicFfi.invoke("sceUtilityGameSharingShutdownStart", -1, longArrayOf())
}

public fun sceUtilityGameSharingGetStatus(): Int {
    return LibcDynamicFfi.invoke("sceUtilityGameSharingGetStatus", -1, longArrayOf()).toInt()
}

public fun sceUtilityGameSharingUpdate(n: Int) {
    LibcDynamicFfi.invoke("sceUtilityGameSharingUpdate", -1, longArrayOf(n.toLong()))
}

public fun sceUtilityHtmlViewerInitStart(params: UtilityHtmlViewerParam?): Int {
    return LibcDynamicFfi.invoke("sceUtilityHtmlViewerInitStart", -1, longArrayOf(params?.value ?: 0L)).toInt()
}

public fun sceUtilityHtmlViewerShutdownStart(): Int {
    return LibcDynamicFfi.invoke("sceUtilityHtmlViewerShutdownStart", -1, longArrayOf()).toInt()
}

public fun sceUtilityHtmlViewerUpdate(n: Int): Int {
    return LibcDynamicFfi.invoke("sceUtilityHtmlViewerUpdate", -1, longArrayOf(n.toLong())).toInt()
}

public fun sceUtilityHtmlViewerGetStatus(): Int {
    return LibcDynamicFfi.invoke("sceUtilityHtmlViewerGetStatus", -1, longArrayOf()).toInt()
}

public fun sceUtilitySetSystemParamInt(id: SystemParamId, value: Int): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceUtilitySetSystemParamInt", -1, longArrayOf(__scratch_0, value.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceUtilitySetSystemParamString(id: SystemParamId, str: COpaquePointer?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceUtilitySetSystemParamString", -1, longArrayOf(__scratch_0, str?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceUtilityGetSystemParamInt(id: SystemParamId, value: Int?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __slot_1 = if (value == null) 0L else LibcDynamicFfi.allocScalarSlot(value.toLong())
    try {
        return LibcDynamicFfi.invoke("sceUtilityGetSystemParamInt", -1, longArrayOf(__scratch_0, __slot_1)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceUtilityGetSystemParamString(id: SystemParamId, str: COpaquePointer?, len: Int): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceUtilityGetSystemParamString", -1, longArrayOf(__scratch_0, str?.value ?: 0L, len.toLong())).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceUtilityOskInitStart(params: SceUtilityOskParams?): Int {
    return LibcDynamicFfi.invoke("sceUtilityOskInitStart", -1, longArrayOf(params?.value ?: 0L)).toInt()
}

public fun sceUtilityOskShutdownStart(): Int {
    return LibcDynamicFfi.invoke("sceUtilityOskShutdownStart", -1, longArrayOf()).toInt()
}

public fun sceUtilityOskUpdate(n: Int): Int {
    return LibcDynamicFfi.invoke("sceUtilityOskUpdate", -1, longArrayOf(n.toLong())).toInt()
}

public fun sceUtilityOskGetStatus(): Int {
    return LibcDynamicFfi.invoke("sceUtilityOskGetStatus", -1, longArrayOf()).toInt()
}

public fun sceUtilityLoadNetModule(module: NetModule): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceUtilityLoadNetModule", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceUtilityUnloadNetModule(module: NetModule): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceUtilityUnloadNetModule", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceUtilityLoadAvModule(module: AvModule): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceUtilityLoadAvModule", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceUtilityUnloadAvModule(module: AvModule): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceUtilityUnloadAvModule", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceUtilityLoadUsbModule(module: UsbModule): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceUtilityLoadUsbModule", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceUtilityUnloadUsbModule(module: UsbModule): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceUtilityUnloadUsbModule", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceUtilityLoadModule(module: Module): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceUtilityLoadModule", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceUtilityUnloadModule(module: Module): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceUtilityUnloadModule", -1, longArrayOf(__scratch_0)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceUtilityCreateNetParam(conf: Int): Int {
    return LibcDynamicFfi.invoke("sceUtilityCreateNetParam", -1, longArrayOf(conf.toLong())).toInt()
}

public fun sceUtilitySetNetParam(param: NetParam, value: COpaquePointer?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceUtilitySetNetParam", -1, longArrayOf(__scratch_0, value?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceUtilityCopyNetParam(src: Int, dest: Int): Int {
    return LibcDynamicFfi.invoke("sceUtilityCopyNetParam", -1, longArrayOf(src.toLong(), dest.toLong())).toInt()
}

public fun sceUtilityDeleteNetParam(conf: Int): Int {
    return LibcDynamicFfi.invoke("sceUtilityDeleteNetParam", -1, longArrayOf(conf.toLong())).toInt()
}

public fun sceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int {
    return LibcDynamicFfi.invoke("sceNetInit", -1, longArrayOf(poolsize.toLong(), calloutprio.toLong(), calloutstack.toLong(), netintrprio.toLong(), netintrstack.toLong())).toInt()
}

public fun sceNetTerm(): Int {
    return LibcDynamicFfi.invoke("sceNetTerm", -1, longArrayOf()).toInt()
}

public fun sceNetFreeThreadinfo(thid: Int): Int {
    return LibcDynamicFfi.invoke("sceNetFreeThreadinfo", -1, longArrayOf(thid.toLong())).toInt()
}

public fun sceNetThreadAbort(thid: Int): Int {
    return LibcDynamicFfi.invoke("sceNetThreadAbort", -1, longArrayOf(thid.toLong())).toInt()
}

public fun sceNetEtherStrton(name: COpaquePointer?, mac: COpaquePointer?) {
    LibcDynamicFfi.invoke("sceNetEtherStrton", -1, longArrayOf(name?.value ?: 0L, mac?.value ?: 0L))
}

public fun sceNetEtherNtostr(mac: COpaquePointer?, name: COpaquePointer?) {
    LibcDynamicFfi.invoke("sceNetEtherNtostr", -1, longArrayOf(mac?.value ?: 0L, name?.value ?: 0L))
}

public fun sceNetGetLocalEtherAddr(mac: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceNetGetLocalEtherAddr", -1, longArrayOf(mac?.value ?: 0L)).toInt()
}

public fun sceNetGetMallocStat(stat: SceNetMallocStat?): Int {
    return LibcDynamicFfi.invoke("sceNetGetMallocStat", -1, longArrayOf(stat?.value ?: 0L)).toInt()
}

public fun sceNetAdhocctlInit(stacksize: Int, priority: Int, adhocId: SceNetAdhocctlAdhocId?): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocctlInit", -1, longArrayOf(stacksize.toLong(), priority.toLong(), adhocId?.value ?: 0L)).toInt()
}

public fun sceNetAdhocctlTerm(): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocctlTerm", -1, longArrayOf()).toInt()
}

public fun sceNetAdhocctlConnect(name: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocctlConnect", -1, longArrayOf(name?.value ?: 0L)).toInt()
}

public fun sceNetAdhocctlDisconnect(): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocctlDisconnect", -1, longArrayOf()).toInt()
}

public fun sceNetAdhocctlGetState(event: Int?): Int {
    val __slot_0 = if (event == null) 0L else LibcDynamicFfi.allocScalarSlot(event.toLong())
    try {
        return LibcDynamicFfi.invoke("sceNetAdhocctlGetState", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sceNetAdhocctlCreate(name: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocctlCreate", -1, longArrayOf(name?.value ?: 0L)).toInt()
}

public fun sceNetAdhocctlJoin(scaninfo: SceNetAdhocctlScanInfo?): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocctlJoin", -1, longArrayOf(scaninfo?.value ?: 0L)).toInt()
}

public fun sceNetAdhocctlGetAdhocId(id: SceNetAdhocctlAdhocId?): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocctlGetAdhocId", -1, longArrayOf(id?.value ?: 0L)).toInt()
}

public fun sceNetAdhocctlCreateEnterGameMode(name: COpaquePointer?, unknown: Int, num: Int, macs: COpaquePointer?, timeout: UInt, unknown2: Int): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocctlCreateEnterGameMode", -1, longArrayOf(name?.value ?: 0L, unknown.toLong(), num.toLong(), macs?.value ?: 0L, timeout.toLong(), unknown2.toLong())).toInt()
}

public fun sceNetAdhocctlJoinEnterGameMode(name: COpaquePointer?, hostmac: COpaquePointer?, timeout: UInt, unknown: Int): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocctlJoinEnterGameMode", -1, longArrayOf(name?.value ?: 0L, hostmac?.value ?: 0L, timeout.toLong(), unknown.toLong())).toInt()
}

public fun sceNetAdhocctlGetGameModeInfo(gamemodeinfo: SceNetAdhocctlGameModeInfo?): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocctlGetGameModeInfo", -1, longArrayOf(gamemodeinfo?.value ?: 0L)).toInt()
}

public fun sceNetAdhocctlExitGameMode(): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocctlExitGameMode", -1, longArrayOf()).toInt()
}

public fun sceNetAdhocctlGetPeerList(length: Int?, buf: COpaquePointer?): Int {
    val __slot_0 = if (length == null) 0L else LibcDynamicFfi.allocScalarSlot(length.toLong())
    try {
        return LibcDynamicFfi.invoke("sceNetAdhocctlGetPeerList", -1, longArrayOf(__slot_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sceNetAdhocctlGetPeerInfo(mac: COpaquePointer?, size: Int, peerinfo: SceNetAdhocctlPeerInfo?): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocctlGetPeerInfo", -1, longArrayOf(mac?.value ?: 0L, size.toLong(), peerinfo?.value ?: 0L)).toInt()
}

public fun sceNetAdhocctlScan(): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocctlScan", -1, longArrayOf()).toInt()
}

public fun sceNetAdhocctlGetScanInfo(length: Int?, buf: COpaquePointer?): Int {
    val __slot_0 = if (length == null) 0L else LibcDynamicFfi.allocScalarSlot(length.toLong())
    try {
        return LibcDynamicFfi.invoke("sceNetAdhocctlGetScanInfo", -1, longArrayOf(__slot_0, buf?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sceNetAdhocctlAddHandler(handler: SceNetAdhocctlHandler, unknown: COpaquePointer?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceNetAdhocctlAddHandler", -1, longArrayOf(__scratch_0, unknown?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceNetAdhocctlDelHandler(id: Int): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocctlDelHandler", -1, longArrayOf(id.toLong())).toInt()
}

public fun sceNetAdhocctlGetNameByAddr(mac: COpaquePointer?, nickname: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocctlGetNameByAddr", -1, longArrayOf(mac?.value ?: 0L, nickname?.value ?: 0L)).toInt()
}

public fun sceNetAdhocctlGetAddrByName(nickname: COpaquePointer?, length: Int?, buf: COpaquePointer?): Int {
    val __slot_1 = if (length == null) 0L else LibcDynamicFfi.allocScalarSlot(length.toLong())
    try {
        return LibcDynamicFfi.invoke("sceNetAdhocctlGetAddrByName", -1, longArrayOf(nickname?.value ?: 0L, __slot_1, buf?.value ?: 0L)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceNetAdhocctlGetParameter(params: SceNetAdhocctlParams?): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocctlGetParameter", -1, longArrayOf(params?.value ?: 0L)).toInt()
}

public fun sceNetAdhocInit(): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocInit", -1, longArrayOf()).toInt()
}

public fun sceNetAdhocTerm(): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocTerm", -1, longArrayOf()).toInt()
}

public fun sceNetAdhocPdpCreate(mac: COpaquePointer?, port: UShort, bufSize: UInt, unk1: Int): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocPdpCreate", -1, longArrayOf(mac?.value ?: 0L, port.toLong(), bufSize.toLong(), unk1.toLong())).toInt()
}

public fun sceNetAdhocPdpDelete(id: Int, unk1: Int): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocPdpDelete", -1, longArrayOf(id.toLong(), unk1.toLong())).toInt()
}

public fun sceNetAdhocPdpSend(id: Int, destMacAddr: COpaquePointer?, port: UShort, data: COpaquePointer?, len: UInt, timeout: UInt, nonblock: Int): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocPdpSend", -1, longArrayOf(id.toLong(), destMacAddr?.value ?: 0L, port.toLong(), data?.value ?: 0L, len.toLong(), timeout.toLong(), nonblock.toLong())).toInt()
}

public fun sceNetAdhocPdpRecv(id: Int, srcMacAddr: COpaquePointer?, port: UShort?, data: COpaquePointer?, dataLength: COpaquePointer?, timeout: UInt, nonblock: Int): Int {
    val __slot_2 = if (port == null) 0L else LibcDynamicFfi.allocScalarSlot(port.toLong())
    try {
        return LibcDynamicFfi.invoke("sceNetAdhocPdpRecv", -1, longArrayOf(id.toLong(), srcMacAddr?.value ?: 0L, __slot_2, data?.value ?: 0L, dataLength?.value ?: 0L, timeout.toLong(), nonblock.toLong())).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceNetAdhocGetPdpStat(size: Int?, stat: SceNetAdhocPdpStat?): Int {
    val __slot_0 = if (size == null) 0L else LibcDynamicFfi.allocScalarSlot(size.toLong())
    try {
        return LibcDynamicFfi.invoke("sceNetAdhocGetPdpStat", -1, longArrayOf(__slot_0, stat?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sceNetAdhocGameModeCreateMaster(data: COpaquePointer?, size: Int): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocGameModeCreateMaster", -1, longArrayOf(data?.value ?: 0L, size.toLong())).toInt()
}

public fun sceNetAdhocGameModeCreateReplica(mac: COpaquePointer?, data: COpaquePointer?, size: Int): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocGameModeCreateReplica", -1, longArrayOf(mac?.value ?: 0L, data?.value ?: 0L, size.toLong())).toInt()
}

public fun sceNetAdhocGameModeUpdateMaster(): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocGameModeUpdateMaster", -1, longArrayOf()).toInt()
}

public fun sceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocGameModeUpdateReplica", -1, longArrayOf(id.toLong(), unk1.toLong())).toInt()
}

public fun sceNetAdhocGameModeDeleteMaster(): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocGameModeDeleteMaster", -1, longArrayOf()).toInt()
}

public fun sceNetAdhocGameModeDeleteReplica(id: Int): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocGameModeDeleteReplica", -1, longArrayOf(id.toLong())).toInt()
}

public fun sceNetAdhocPtpOpen(srcmac: COpaquePointer?, srcport: UShort, destmac: COpaquePointer?, destport: UShort, bufSize: UInt, delay: UInt, count: Int, unk1: Int): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocPtpOpen", -1, longArrayOf(srcmac?.value ?: 0L, srcport.toLong(), destmac?.value ?: 0L, destport.toLong(), bufSize.toLong(), delay.toLong(), count.toLong(), unk1.toLong())).toInt()
}

public fun sceNetAdhocPtpConnect(id: Int, timeout: UInt, nonblock: Int): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocPtpConnect", -1, longArrayOf(id.toLong(), timeout.toLong(), nonblock.toLong())).toInt()
}

public fun sceNetAdhocPtpListen(srcmac: COpaquePointer?, srcport: UShort, bufSize: UInt, delay: UInt, count: Int, queue: Int, unk1: Int): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocPtpListen", -1, longArrayOf(srcmac?.value ?: 0L, srcport.toLong(), bufSize.toLong(), delay.toLong(), count.toLong(), queue.toLong(), unk1.toLong())).toInt()
}

public fun sceNetAdhocPtpAccept(id: Int, mac: COpaquePointer?, port: UShort?, timeout: UInt, nonblock: Int): Int {
    val __slot_2 = if (port == null) 0L else LibcDynamicFfi.allocScalarSlot(port.toLong())
    try {
        return LibcDynamicFfi.invoke("sceNetAdhocPtpAccept", -1, longArrayOf(id.toLong(), mac?.value ?: 0L, __slot_2, timeout.toLong(), nonblock.toLong())).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceNetAdhocPtpSend(id: Int, data: COpaquePointer?, dataSize: Int?, timeout: UInt, nonblock: Int): Int {
    val __slot_2 = if (dataSize == null) 0L else LibcDynamicFfi.allocScalarSlot(dataSize.toLong())
    try {
        return LibcDynamicFfi.invoke("sceNetAdhocPtpSend", -1, longArrayOf(id.toLong(), data?.value ?: 0L, __slot_2, timeout.toLong(), nonblock.toLong())).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceNetAdhocPtpRecv(id: Int, data: COpaquePointer?, dataSize: Int?, timeout: UInt, nonblock: Int): Int {
    val __slot_2 = if (dataSize == null) 0L else LibcDynamicFfi.allocScalarSlot(dataSize.toLong())
    try {
        return LibcDynamicFfi.invoke("sceNetAdhocPtpRecv", -1, longArrayOf(id.toLong(), data?.value ?: 0L, __slot_2, timeout.toLong(), nonblock.toLong())).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceNetAdhocPtpFlush(id: Int, timeout: UInt, nonblock: Int): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocPtpFlush", -1, longArrayOf(id.toLong(), timeout.toLong(), nonblock.toLong())).toInt()
}

public fun sceNetAdhocPtpClose(id: Int, unk1: Int): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocPtpClose", -1, longArrayOf(id.toLong(), unk1.toLong())).toInt()
}

public fun sceNetAdhocGetPtpStat(size: Int?, stat: SceNetAdhocPtpStat?): Int {
    val __slot_0 = if (size == null) 0L else LibcDynamicFfi.allocScalarSlot(size.toLong())
    try {
        return LibcDynamicFfi.invoke("sceNetAdhocGetPtpStat", -1, longArrayOf(__slot_0, stat?.value ?: 0L)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sceNetAdhocMatchingInit(memsize: Int): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocMatchingInit", -1, longArrayOf(memsize.toLong())).toInt()
}

public fun sceNetAdhocMatchingTerm(): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocMatchingTerm", -1, longArrayOf()).toInt()
}

public fun sceNetAdhocMatchingCreate(mode: AdhocMatchingMode, maxPeers: Int, port: UShort, bufSize: Int, helloDelay: UInt, pingDelay: UInt, initCount: Int, msgDelay: UInt, callback: AdhocMatchingCallback): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_8 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceNetAdhocMatchingCreate", -1, longArrayOf(__scratch_0, maxPeers.toLong(), port.toLong(), bufSize.toLong(), helloDelay.toLong(), pingDelay.toLong(), initCount.toLong(), msgDelay.toLong(), __scratch_8)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_8 != 0L) LibcDynamicFfi.freeMem(__scratch_8)
    }
}

public fun sceNetAdhocMatchingDelete(matchingId: Int): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocMatchingDelete", -1, longArrayOf(matchingId.toLong())).toInt()
}

public fun sceNetAdhocMatchingStart(matchingId: Int, evthPri: Int, evthStack: Int, inthPri: Int, inthStack: Int, optLen: Int, optData: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocMatchingStart", -1, longArrayOf(matchingId.toLong(), evthPri.toLong(), evthStack.toLong(), inthPri.toLong(), inthStack.toLong(), optLen.toLong(), optData?.value ?: 0L)).toInt()
}

public fun sceNetAdhocMatchingStop(matchingId: Int): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocMatchingStop", -1, longArrayOf(matchingId.toLong())).toInt()
}

public fun sceNetAdhocMatchingSelectTarget(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocMatchingSelectTarget", -1, longArrayOf(matchingId.toLong(), mac?.value ?: 0L, optLen.toLong(), optData?.value ?: 0L)).toInt()
}

public fun sceNetAdhocMatchingCancelTarget(matchingId: Int, mac: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocMatchingCancelTarget", -1, longArrayOf(matchingId.toLong(), mac?.value ?: 0L)).toInt()
}

public fun sceNetAdhocMatchingCancelTargetWithOpt(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocMatchingCancelTargetWithOpt", -1, longArrayOf(matchingId.toLong(), mac?.value ?: 0L, optLen.toLong(), optData?.value ?: 0L)).toInt()
}

public fun sceNetAdhocMatchingSendData(matchingId: Int, mac: COpaquePointer?, dataLen: Int, data: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocMatchingSendData", -1, longArrayOf(matchingId.toLong(), mac?.value ?: 0L, dataLen.toLong(), data?.value ?: 0L)).toInt()
}

public fun sceNetAdhocMatchingAbortSendData(matchingId: Int, mac: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocMatchingAbortSendData", -1, longArrayOf(matchingId.toLong(), mac?.value ?: 0L)).toInt()
}

public fun sceNetAdhocMatchingSetHelloOpt(matchingId: Int, optLen: Int, optData: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocMatchingSetHelloOpt", -1, longArrayOf(matchingId.toLong(), optLen.toLong(), optData?.value ?: 0L)).toInt()
}

public fun sceNetAdhocMatchingGetHelloOpt(matchingId: Int, optLen: Int?, optData: COpaquePointer?): Int {
    val __slot_1 = if (optLen == null) 0L else LibcDynamicFfi.allocScalarSlot(optLen.toLong())
    try {
        return LibcDynamicFfi.invoke("sceNetAdhocMatchingGetHelloOpt", -1, longArrayOf(matchingId.toLong(), __slot_1, optData?.value ?: 0L)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceNetAdhocMatchingGetMembers(matchingId: Int, length: Int?, buf: COpaquePointer?): Int {
    val __slot_1 = if (length == null) 0L else LibcDynamicFfi.allocScalarSlot(length.toLong())
    try {
        return LibcDynamicFfi.invoke("sceNetAdhocMatchingGetMembers", -1, longArrayOf(matchingId.toLong(), __slot_1, buf?.value ?: 0L)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceNetAdhocMatchingGetPoolMaxAlloc(): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocMatchingGetPoolMaxAlloc", -1, longArrayOf()).toInt()
}

public fun sceNetAdhocMatchingGetPoolStat(poolstat: AdhocPoolStat?): Int {
    return LibcDynamicFfi.invoke("sceNetAdhocMatchingGetPoolStat", -1, longArrayOf(poolstat?.value ?: 0L)).toInt()
}

public fun sceNetApctlInit(stackSize: Int, initPriority: Int): Int {
    return LibcDynamicFfi.invoke("sceNetApctlInit", -1, longArrayOf(stackSize.toLong(), initPriority.toLong())).toInt()
}

public fun sceNetApctlTerm(): Int {
    return LibcDynamicFfi.invoke("sceNetApctlTerm", -1, longArrayOf()).toInt()
}

public fun sceNetApctlGetInfo(code: ApctlInfo, pinfo: SceNetApctlInfo?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceNetApctlGetInfo", -1, longArrayOf(__scratch_0, pinfo?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceNetApctlAddHandler(handler: SceNetApctlHandler, parg: COpaquePointer?): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceNetApctlAddHandler", -1, longArrayOf(__scratch_0, parg?.value ?: 0L)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
    }
}

public fun sceNetApctlDelHandler(handlerId: Int): Int {
    return LibcDynamicFfi.invoke("sceNetApctlDelHandler", -1, longArrayOf(handlerId.toLong())).toInt()
}

public fun sceNetApctlConnect(connIndex: Int): Int {
    return LibcDynamicFfi.invoke("sceNetApctlConnect", -1, longArrayOf(connIndex.toLong())).toInt()
}

public fun sceNetApctlDisconnect(): Int {
    return LibcDynamicFfi.invoke("sceNetApctlDisconnect", -1, longArrayOf()).toInt()
}

public fun sceNetApctlGetState(pstate: ApctlState?): Int {
    return LibcDynamicFfi.invoke("sceNetApctlGetState", -1, longArrayOf(pstate?.value ?: 0L)).toInt()
}

public fun sceNetInetInit(): Int {
    return LibcDynamicFfi.invoke("sceNetInetInit", -1, longArrayOf()).toInt()
}

public fun sceNetInetTerm(): Int {
    return LibcDynamicFfi.invoke("sceNetInetTerm", -1, longArrayOf()).toInt()
}

public fun sceNetInetAccept(s: Int, addr: Sockaddr?, addrLen: UInt?): Int {
    val __slot_2 = if (addrLen == null) 0L else LibcDynamicFfi.allocScalarSlot(addrLen.toLong())
    try {
        return LibcDynamicFfi.invoke("sceNetInetAccept", -1, longArrayOf(s.toLong(), addr?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceNetInetBind(s: Int, myAddr: Sockaddr?, addrLen: SocklenT): Int {
    return LibcDynamicFfi.invoke("sceNetInetBind", -1, longArrayOf(s.toLong(), myAddr?.value ?: 0L, addrLen.toLong())).toInt()
}

public fun sceNetInetConnect(s: Int, servAddr: Sockaddr?, addrLen: SocklenT): Int {
    return LibcDynamicFfi.invoke("sceNetInetConnect", -1, longArrayOf(s.toLong(), servAddr?.value ?: 0L, addrLen.toLong())).toInt()
}

public fun sceNetInetGetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optlEn: UInt?): Int {
    val __slot_4 = if (optlEn == null) 0L else LibcDynamicFfi.allocScalarSlot(optlEn.toLong())
    try {
        return LibcDynamicFfi.invoke("sceNetInetGetsockopt", -1, longArrayOf(s.toLong(), level.toLong(), optName.toLong(), optVal?.value ?: 0L, __slot_4)).toInt()
    } finally {
        if (__slot_4 != 0L) LibcDynamicFfi.freeMem(__slot_4)
    }
}

public fun sceNetInetListen(s: Int, backlog: Int): Int {
    return LibcDynamicFfi.invoke("sceNetInetListen", -1, longArrayOf(s.toLong(), backlog.toLong())).toInt()
}

public fun sceNetInetRecv(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong {
    return LibcDynamicFfi.invoke("sceNetInetRecv", -1, longArrayOf(s.toLong(), buf?.value ?: 0L, len.toLong(), flags.toLong())).toULong()
}

public fun sceNetInetRecvfrom(s: Int, buf: COpaquePointer?, flags: ULong, arg1: Int, from: Sockaddr?, fromLen: UInt?): ULong {
    val __slot_5 = if (fromLen == null) 0L else LibcDynamicFfi.allocScalarSlot(fromLen.toLong())
    try {
        return LibcDynamicFfi.invoke("sceNetInetRecvfrom", -1, longArrayOf(s.toLong(), buf?.value ?: 0L, flags.toLong(), arg1.toLong(), from?.value ?: 0L, __slot_5)).toULong()
    } finally {
        if (__slot_5 != 0L) LibcDynamicFfi.freeMem(__slot_5)
    }
}

public fun sceNetInetSend(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong {
    return LibcDynamicFfi.invoke("sceNetInetSend", -1, longArrayOf(s.toLong(), buf?.value ?: 0L, len.toLong(), flags.toLong())).toULong()
}

public fun sceNetInetSendto(s: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: Sockaddr?, toLen: SocklenT): ULong {
    return LibcDynamicFfi.invoke("sceNetInetSendto", -1, longArrayOf(s.toLong(), buf?.value ?: 0L, len.toLong(), flags.toLong(), to?.value ?: 0L, toLen.toLong())).toULong()
}

public fun sceNetInetSetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optLen: SocklenT): Int {
    return LibcDynamicFfi.invoke("sceNetInetSetsockopt", -1, longArrayOf(s.toLong(), level.toLong(), optName.toLong(), optVal?.value ?: 0L, optLen.toLong())).toInt()
}

public fun sceNetInetShutdown(s: Int, how: Int): Int {
    return LibcDynamicFfi.invoke("sceNetInetShutdown", -1, longArrayOf(s.toLong(), how.toLong())).toInt()
}

public fun sceNetInetSocket(domain: Int, type: Int, protocol: Int): Int {
    return LibcDynamicFfi.invoke("sceNetInetSocket", -1, longArrayOf(domain.toLong(), type.toLong(), protocol.toLong())).toInt()
}

public fun sceNetInetClose(s: Int): Int {
    return LibcDynamicFfi.invoke("sceNetInetClose", -1, longArrayOf(s.toLong())).toInt()
}

public fun sceNetInetGetErrno(): Int {
    return LibcDynamicFfi.invoke("sceNetInetGetErrno", -1, longArrayOf()).toInt()
}

public fun sceSslInit(unknown1: Int): Int {
    return LibcDynamicFfi.invoke("sceSslInit", -1, longArrayOf(unknown1.toLong())).toInt()
}

public fun sceSslEnd(): Int {
    return LibcDynamicFfi.invoke("sceSslEnd", -1, longArrayOf()).toInt()
}

public fun sceSslGetUsedMemoryMax(memory: UInt?): Int {
    val __slot_0 = if (memory == null) 0L else LibcDynamicFfi.allocScalarSlot(memory.toLong())
    try {
        return LibcDynamicFfi.invoke("sceSslGetUsedMemoryMax", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sceSslGetUsedMemoryCurrent(memory: UInt?): Int {
    val __slot_0 = if (memory == null) 0L else LibcDynamicFfi.allocScalarSlot(memory.toLong())
    try {
        return LibcDynamicFfi.invoke("sceSslGetUsedMemoryCurrent", -1, longArrayOf(__slot_0)).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sceHttpInit(unknown1: UInt): Int {
    return LibcDynamicFfi.invoke("sceHttpInit", -1, longArrayOf(unknown1.toLong())).toInt()
}

public fun sceHttpEnd(): Int {
    return LibcDynamicFfi.invoke("sceHttpEnd", -1, longArrayOf()).toInt()
}

public fun sceHttpCreateTemplate(agent: COpaquePointer?, unknown1: Int, unknown2: Int): Int {
    return LibcDynamicFfi.invoke("sceHttpCreateTemplate", -1, longArrayOf(agent?.value ?: 0L, unknown1.toLong(), unknown2.toLong())).toInt()
}

public fun sceHttpDeleteTemplate(templateid: Int): Int {
    return LibcDynamicFfi.invoke("sceHttpDeleteTemplate", -1, longArrayOf(templateid.toLong())).toInt()
}

public fun sceHttpCreateConnection(templateid: Int, host: COpaquePointer?, unknown1: COpaquePointer?, port: UShort, unknown2: Int): Int {
    return LibcDynamicFfi.invoke("sceHttpCreateConnection", -1, longArrayOf(templateid.toLong(), host?.value ?: 0L, unknown1?.value ?: 0L, port.toLong(), unknown2.toLong())).toInt()
}

public fun sceHttpCreateConnectionWithURL(templateid: Int, url: COpaquePointer?, unknown1: Int): Int {
    return LibcDynamicFfi.invoke("sceHttpCreateConnectionWithURL", -1, longArrayOf(templateid.toLong(), url?.value ?: 0L, unknown1.toLong())).toInt()
}

public fun sceHttpDeleteConnection(connectionId: Int): Int {
    return LibcDynamicFfi.invoke("sceHttpDeleteConnection", -1, longArrayOf(connectionId.toLong())).toInt()
}

public fun sceHttpCreateRequest(connectionId: Int, method: HttpMethod, path: COpaquePointer?, contentLength: ULong): Int {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceHttpCreateRequest", -1, longArrayOf(connectionId.toLong(), __scratch_1, path?.value ?: 0L, contentLength.toLong())).toInt()
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun sceHttpCreateRequestWithURL(connectionId: Int, method: HttpMethod, url: COpaquePointer?, contentLength: ULong): Int {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceHttpCreateRequestWithURL", -1, longArrayOf(connectionId.toLong(), __scratch_1, url?.value ?: 0L, contentLength.toLong())).toInt()
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun sceHttpDeleteRequest(requestId: Int): Int {
    return LibcDynamicFfi.invoke("sceHttpDeleteRequest", -1, longArrayOf(requestId.toLong())).toInt()
}

public fun sceHttpSendRequest(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int {
    return LibcDynamicFfi.invoke("sceHttpSendRequest", -1, longArrayOf(requestId.toLong(), data?.value ?: 0L, dataSize.toLong())).toInt()
}

public fun sceHttpAbortRequest(requestId: Int): Int {
    return LibcDynamicFfi.invoke("sceHttpAbortRequest", -1, longArrayOf(requestId.toLong())).toInt()
}

public fun sceHttpReadData(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int {
    return LibcDynamicFfi.invoke("sceHttpReadData", -1, longArrayOf(requestId.toLong(), data?.value ?: 0L, dataSize.toLong())).toInt()
}

public fun sceHttpGetContentLength(requestId: Int, contentLength: ULong?): Int {
    val __slot_1 = if (contentLength == null) 0L else LibcDynamicFfi.allocScalarSlot(contentLength.toLong())
    try {
        return LibcDynamicFfi.invoke("sceHttpGetContentLength", -1, longArrayOf(requestId.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceHttpGetStatusCode(requestId: Int, statusCode: Int?): Int {
    val __slot_1 = if (statusCode == null) 0L else LibcDynamicFfi.allocScalarSlot(statusCode.toLong())
    try {
        return LibcDynamicFfi.invoke("sceHttpGetStatusCode", -1, longArrayOf(requestId.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceHttpSetResolveTimeOut(id: Int, timeout: UInt): Int {
    return LibcDynamicFfi.invoke("sceHttpSetResolveTimeOut", -1, longArrayOf(id.toLong(), timeout.toLong())).toInt()
}

public fun sceHttpSetResolveRetry(id: Int, count: Int): Int {
    return LibcDynamicFfi.invoke("sceHttpSetResolveRetry", -1, longArrayOf(id.toLong(), count.toLong())).toInt()
}

public fun sceHttpSetConnectTimeOut(id: Int, timeout: UInt): Int {
    return LibcDynamicFfi.invoke("sceHttpSetConnectTimeOut", -1, longArrayOf(id.toLong(), timeout.toLong())).toInt()
}

public fun sceHttpSetSendTimeOut(id: Int, timeout: UInt): Int {
    return LibcDynamicFfi.invoke("sceHttpSetSendTimeOut", -1, longArrayOf(id.toLong(), timeout.toLong())).toInt()
}

public fun sceHttpSetRecvTimeOut(id: Int, timeout: UInt): Int {
    return LibcDynamicFfi.invoke("sceHttpSetRecvTimeOut", -1, longArrayOf(id.toLong(), timeout.toLong())).toInt()
}

public fun sceHttpEnableKeepAlive(id: Int): Int {
    return LibcDynamicFfi.invoke("sceHttpEnableKeepAlive", -1, longArrayOf(id.toLong())).toInt()
}

public fun sceHttpDisableKeepAlive(id: Int): Int {
    return LibcDynamicFfi.invoke("sceHttpDisableKeepAlive", -1, longArrayOf(id.toLong())).toInt()
}

public fun sceHttpEnableRedirect(id: Int): Int {
    return LibcDynamicFfi.invoke("sceHttpEnableRedirect", -1, longArrayOf(id.toLong())).toInt()
}

public fun sceHttpDisableRedirect(id: Int): Int {
    return LibcDynamicFfi.invoke("sceHttpDisableRedirect", -1, longArrayOf(id.toLong())).toInt()
}

public fun sceHttpEnableCookie(id: Int): Int {
    return LibcDynamicFfi.invoke("sceHttpEnableCookie", -1, longArrayOf(id.toLong())).toInt()
}

public fun sceHttpDisableCookie(id: Int): Int {
    return LibcDynamicFfi.invoke("sceHttpDisableCookie", -1, longArrayOf(id.toLong())).toInt()
}

public fun sceHttpSaveSystemCookie(): Int {
    return LibcDynamicFfi.invoke("sceHttpSaveSystemCookie", -1, longArrayOf()).toInt()
}

public fun sceHttpLoadSystemCookie(): Int {
    return LibcDynamicFfi.invoke("sceHttpLoadSystemCookie", -1, longArrayOf()).toInt()
}

public fun sceHttpAddExtraHeader(id: Int, name: COpaquePointer?, value: COpaquePointer?, unknown1: Int): Int {
    return LibcDynamicFfi.invoke("sceHttpAddExtraHeader", -1, longArrayOf(id.toLong(), name?.value ?: 0L, value?.value ?: 0L, unknown1.toLong())).toInt()
}

public fun sceHttpDeleteHeader(id: Int, name: COpaquePointer?): Int {
    return LibcDynamicFfi.invoke("sceHttpDeleteHeader", -1, longArrayOf(id.toLong(), name?.value ?: 0L)).toInt()
}

public fun sceHttpsInit(unknown1: Int, unknown2: Int, unknown3: Int, unknown4: Int): Int {
    return LibcDynamicFfi.invoke("sceHttpsInit", -1, longArrayOf(unknown1.toLong(), unknown2.toLong(), unknown3.toLong(), unknown4.toLong())).toInt()
}

public fun sceHttpsEnd(): Int {
    return LibcDynamicFfi.invoke("sceHttpsEnd", -1, longArrayOf()).toInt()
}

public fun sceHttpsLoadDefaultCert(unknown1: Int, unknown2: Int): Int {
    return LibcDynamicFfi.invoke("sceHttpsLoadDefaultCert", -1, longArrayOf(unknown1.toLong(), unknown2.toLong())).toInt()
}

public fun sceHttpDisableAuth(id: Int): Int {
    return LibcDynamicFfi.invoke("sceHttpDisableAuth", -1, longArrayOf(id.toLong())).toInt()
}

public fun sceHttpDisableCache(id: Int): Int {
    return LibcDynamicFfi.invoke("sceHttpDisableCache", -1, longArrayOf(id.toLong())).toInt()
}

public fun sceHttpEnableAuth(id: Int): Int {
    return LibcDynamicFfi.invoke("sceHttpEnableAuth", -1, longArrayOf(id.toLong())).toInt()
}

public fun sceHttpEnableCache(id: Int): Int {
    return LibcDynamicFfi.invoke("sceHttpEnableCache", -1, longArrayOf(id.toLong())).toInt()
}

public fun sceHttpEndCache(): Int {
    return LibcDynamicFfi.invoke("sceHttpEndCache", -1, longArrayOf()).toInt()
}

public fun sceHttpGetAllHeader(request: Int, header: COpaquePointer?, headerSize: UInt?): Int {
    val __slot_2 = if (headerSize == null) 0L else LibcDynamicFfi.allocScalarSlot(headerSize.toLong())
    try {
        return LibcDynamicFfi.invoke("sceHttpGetAllHeader", -1, longArrayOf(request.toLong(), header?.value ?: 0L, __slot_2)).toInt()
    } finally {
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
    }
}

public fun sceHttpGetNetworkErrno(request: Int, errNum: Int?): Int {
    val __slot_1 = if (errNum == null) 0L else LibcDynamicFfi.allocScalarSlot(errNum.toLong())
    try {
        return LibcDynamicFfi.invoke("sceHttpGetNetworkErrno", -1, longArrayOf(request.toLong(), __slot_1)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
    }
}

public fun sceHttpGetProxy(id: Int, activateFlag: Int?, mode: Int?, proxyHost: COpaquePointer?, len: ULong, proxyPort: UShort?): Int {
    val __slot_1 = if (activateFlag == null) 0L else LibcDynamicFfi.allocScalarSlot(activateFlag.toLong())
    val __slot_2 = if (mode == null) 0L else LibcDynamicFfi.allocScalarSlot(mode.toLong())
    val __slot_5 = if (proxyPort == null) 0L else LibcDynamicFfi.allocScalarSlot(proxyPort.toLong())
    try {
        return LibcDynamicFfi.invoke("sceHttpGetProxy", -1, longArrayOf(id.toLong(), __slot_1, __slot_2, proxyHost?.value ?: 0L, len.toLong(), __slot_5)).toInt()
    } finally {
        if (__slot_1 != 0L) LibcDynamicFfi.freeMem(__slot_1)
        if (__slot_2 != 0L) LibcDynamicFfi.freeMem(__slot_2)
        if (__slot_5 != 0L) LibcDynamicFfi.freeMem(__slot_5)
    }
}

public fun sceHttpInitCache(maxSize: ULong): Int {
    return LibcDynamicFfi.invoke("sceHttpInitCache", -1, longArrayOf(maxSize.toLong())).toInt()
}

public fun sceHttpSetAuthInfoCB(id: Int, cbfunc: HttpPasswordCB): Int {
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceHttpSetAuthInfoCB", -1, longArrayOf(id.toLong(), __scratch_1)).toInt()
    } finally {
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
    }
}

public fun sceHttpSetProxy(id: Int, activateFlag: Int, mode: Int, newProxyHost: COpaquePointer?, newProxyPort: UShort): Int {
    return LibcDynamicFfi.invoke("sceHttpSetProxy", -1, longArrayOf(id.toLong(), activateFlag.toLong(), mode.toLong(), newProxyHost?.value ?: 0L, newProxyPort.toLong())).toInt()
}

public fun sceHttpSetResHeaderMaxSize(id: Int, headerSize: UInt): Int {
    return LibcDynamicFfi.invoke("sceHttpSetResHeaderMaxSize", -1, longArrayOf(id.toLong(), headerSize.toLong())).toInt()
}

public fun sceHttpSetMallocFunction(mallocFunc: HttpMallocFunction, freeFunc: HttpFreeFunction, reallocFunc: HttpReallocFunction): Int {
    val __scratch_0 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_1 = LibcDynamicFfi.allocZeroed(4096)
    val __scratch_2 = LibcDynamicFfi.allocZeroed(4096)
    try {
        return LibcDynamicFfi.invoke("sceHttpSetMallocFunction", -1, longArrayOf(__scratch_0, __scratch_1, __scratch_2)).toInt()
    } finally {
        if (__scratch_0 != 0L) LibcDynamicFfi.freeMem(__scratch_0)
        if (__scratch_1 != 0L) LibcDynamicFfi.freeMem(__scratch_1)
        if (__scratch_2 != 0L) LibcDynamicFfi.freeMem(__scratch_2)
    }
}

public fun sceNetResolverInit(): Int {
    return LibcDynamicFfi.invoke("sceNetResolverInit", -1, longArrayOf()).toInt()
}

public fun sceNetResolverCreate(rid: Int?, buf: COpaquePointer?, bufLength: UInt): Int {
    val __slot_0 = if (rid == null) 0L else LibcDynamicFfi.allocScalarSlot(rid.toLong())
    try {
        return LibcDynamicFfi.invoke("sceNetResolverCreate", -1, longArrayOf(__slot_0, buf?.value ?: 0L, bufLength.toLong())).toInt()
    } finally {
        if (__slot_0 != 0L) LibcDynamicFfi.freeMem(__slot_0)
    }
}

public fun sceNetResolverDelete(rid: Int): Int {
    return LibcDynamicFfi.invoke("sceNetResolverDelete", -1, longArrayOf(rid.toLong())).toInt()
}

public fun sceNetResolverStartNtoA(rid: Int, hostname: COpaquePointer?, addr: InAddr?, timeout: UInt, retry: Int): Int {
    return LibcDynamicFfi.invoke("sceNetResolverStartNtoA", -1, longArrayOf(rid.toLong(), hostname?.value ?: 0L, addr?.value ?: 0L, timeout.toLong(), retry.toLong())).toInt()
}

public fun sceNetResolverStartAtoN(rid: Int, addr: InAddr?, hostname: COpaquePointer?, hostnameLen: UInt, timeout: UInt, retry: Int): Int {
    return LibcDynamicFfi.invoke("sceNetResolverStartAtoN", -1, longArrayOf(rid.toLong(), addr?.value ?: 0L, hostname?.value ?: 0L, hostnameLen.toLong(), timeout.toLong(), retry.toLong())).toInt()
}

public fun sceNetResolverStop(rid: Int): Int {
    return LibcDynamicFfi.invoke("sceNetResolverStop", -1, longArrayOf(rid.toLong())).toInt()
}

public fun sceNetResolverTerm(): Int {
    return LibcDynamicFfi.invoke("sceNetResolverTerm", -1, longArrayOf()).toInt()
}
