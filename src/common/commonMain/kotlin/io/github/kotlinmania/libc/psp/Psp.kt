// port-lint: source psp.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.psp

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CChar
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.U128
import io.github.kotlinmania.rustlang.core.ffi.CVoid
import io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
import io.github.kotlinmania.rustlang.core.mem.TypeLayout
import io.github.kotlinmania.rustlang.core.ptr.ConstPtr
import io.github.kotlinmania.rustlang.core.ptr.MutPtr

// PSP C type definitions
//
// These type declarations are not enough, as they must be ultimately resolved
// by the linker. Crates that use these definitions must, somewhere in the
// crate graph, include a Note provider crate such as the `psp` crate.

public fun interface FnCallback {
    public operator fun invoke(args: ULong, argp: MutPtr<CVoid>): Int
}

public fun interface FnCallback1 {
    public operator fun invoke(common: MutPtr<CVoid>): UInt
}

public fun interface FnCallback2 {
    public operator fun invoke(arg1: Int, arg2: Int, arg: MutPtr<CVoid>): Int
}

public fun interface FnCallback3 {
    public operator fun invoke(uid: SceUid, arg1: MutPtr<SceKernelSysClock>, arg2: MutPtr<SceKernelSysClock>, arg3: MutPtr<CVoid>): UInt
}

public fun interface FnCallback4 {
    public operator fun invoke(uid: SceUid, arg1: Long, arg2: Long, arg3: MutPtr<CVoid>): UInt
}

public fun interface FnCallback5 {
    public operator fun invoke(mask: Int, thid: SceUid, common: MutPtr<CVoid>): Int
}

public fun interface FnCallback6 {
    public operator fun invoke(data: MutPtr<CVoid>, numPackets: Int, param: MutPtr<CVoid>): Int
}

public fun interface FnCallback7 {
    public operator fun invoke(id: Int, arg: MutPtr<CVoid>)
}

public fun interface FnCallback8 {
    public operator fun invoke(flag: Int, error: Int, unknown: MutPtr<CVoid>)
}

public fun interface FnCallback9 {
    public operator fun invoke(matchingId: Int, event: Int, mac: MutPtr<UByte>, optLen: Int, optData: MutPtr<CVoid>)
}

public fun interface FnCallback10 {
    public operator fun invoke(oldState: Int, newState: Int, event: Int, error: Int, pArg: MutPtr<CVoid>)
}

public fun interface FnCallback11 {
    public operator fun invoke(request: Int, authType: HttpAuthType, realm: ConstPtr<UByte>, username: MutPtr<UByte>, password: MutPtr<UByte>, needEntity: Int, entityBody: MutPtr<MutPtr<UByte>>, entitySize: MutPtr<ULong>, save: MutPtr<Int>): Int
}

public fun interface FnCallback12 {
    public operator fun invoke(size: ULong): MutPtr<CVoid>
}

public fun interface FnCallback13 {
    public operator fun invoke(p: MutPtr<CVoid>)
}

public fun interface FnCallback14 {
    public operator fun invoke(p: MutPtr<CVoid>, size: ULong): MutPtr<CVoid>
}

public typealias IntmaxT = Long

public typealias UintmaxT = ULong

public typealias SizeT = ULong

public typealias PtrdiffT = Long

public typealias IntptrT = Long

public typealias UintptrT = ULong

public typealias SsizeT = Long

public fun interface SceKernelVTimerHandler {
    public operator fun invoke(uid: SceUid, arg1: MutPtr<SceKernelSysClock>, arg2: MutPtr<SceKernelSysClock>, arg3: MutPtr<CVoid>): UInt
}

public fun interface SceKernelVTimerHandlerWide {
    public operator fun invoke(uid: SceUid, arg1: Long, arg2: Long, arg3: MutPtr<CVoid>): UInt
}

public fun interface SceKernelThreadEventHandler {
    public operator fun invoke(mask: Int, thid: SceUid, common: MutPtr<CVoid>): Int
}

public fun interface SceKernelAlarmHandler {
    public operator fun invoke(common: MutPtr<CVoid>): UInt
}

public fun interface SceKernelCallbackFunction {
    public operator fun invoke(arg1: Int, arg2: Int, arg: MutPtr<CVoid>): Int
}

public fun interface SceKernelThreadEntry {
    public operator fun invoke(args: ULong, argp: MutPtr<CVoid>): Int
}

public fun interface PowerCallback {
    public operator fun invoke(unknown: Int, powerInfo: Int)
}

public typealias IoPermissions = Int

public fun interface UmdCallback {
    public operator fun invoke(unknown: Int, event: Int): Int
}

public fun interface SceMpegRingbufferCbFn {
    public operator fun invoke(data: MutPtr<CVoid>, numPackets: Int, param: MutPtr<CVoid>): Int
}

public typealias SceMpegRingbufferCb = SceMpegRingbufferCbFn?

public fun interface GuCallbackFn {
    public operator fun invoke(id: Int, arg: MutPtr<CVoid>)
}

public typealias GuCallback = GuCallbackFn?

public fun interface GuSwapBuffersCallbackFn {
    public operator fun invoke(display: MutPtr<MutPtr<CVoid>>, render: MutPtr<MutPtr<CVoid>>)
}

public typealias GuSwapBuffersCallback = GuSwapBuffersCallbackFn?

public fun interface SceNetAdhocctlHandlerFn {
    public operator fun invoke(flag: Int, error: Int, unknown: MutPtr<CVoid>)
}

public typealias SceNetAdhocctlHandler = SceNetAdhocctlHandlerFn?

public fun interface AdhocMatchingCallbackFn {
    public operator fun invoke(matchingId: Int, event: Int, mac: MutPtr<UByte>, optLen: Int, optData: MutPtr<CVoid>)
}

public typealias AdhocMatchingCallback = AdhocMatchingCallbackFn?

public fun interface SceNetApctlHandlerFn {
    public operator fun invoke(oldState: Int, newState: Int, event: Int, error: Int, pArg: MutPtr<CVoid>)
}

public typealias SceNetApctlHandler = SceNetApctlHandlerFn?

public fun interface HttpMallocFunctionFn {
    public operator fun invoke(size: ULong): MutPtr<CVoid>
}

public typealias HttpMallocFunction = HttpMallocFunctionFn?

public fun interface HttpReallocFunctionFn {
    public operator fun invoke(p: MutPtr<CVoid>, size: ULong): MutPtr<CVoid>
}

public typealias HttpReallocFunction = HttpReallocFunctionFn?

public fun interface HttpFreeFunctionFn {
    public operator fun invoke(p: MutPtr<CVoid>)
}

public typealias HttpFreeFunction = HttpFreeFunctionFn?

public fun interface HttpPasswordCBFn {
    public operator fun invoke(request: Int, authType: HttpAuthType, realm: ConstPtr<UByte>, username: MutPtr<UByte>, password: MutPtr<UByte>, needEntity: Int, entityBody: MutPtr<MutPtr<UByte>>, entitySize: MutPtr<ULong>, save: MutPtr<Int>): Int
}

public typealias HttpPasswordCB = HttpPasswordCBFn?

public typealias SocklenT = UInt

public enum class AudioFormat(
    public val value: UInt,
) {
    Stereo(0u),
    Mono(0x10u),
}

public enum class DisplayMode(
    public val value: UInt,
) {
    Lcd(0u),
}

public enum class DisplayPixelFormat(
    public val value: UInt,
) {
    Psm5650(0u),
    Psm5551(1u),
    Psm4444(2u),
    Psm8888(3u),
}

public enum class DisplaySetBufSync(
    public val value: UInt,
) {
    Immediate(0u),
    NextFrame(1u),
}

public enum class AudioOutputFrequency(
    public val value: Int,
) {
    Khz48(48000),
    Khz441(44100),
    Khz32(32000),
    Khz24(24000),
    Khz2205(22050),
    Khz16(16000),
    Khz12(12000),
    Khz11025(11025),
    Khz8(8000),
}

public enum class AudioInputFrequency(
    public val value: Int,
) {
    Khz441(44100),
    Khz2205(22050),
    Khz11025(11025),
}

public enum class CtrlMode(
    public val value: UInt,
) {
    Digital(0u),
    Analog(((0u) + 1u)),
}

public enum class GeMatrixType(
    public val value: Int,
) {
    Bone0(0),
    Bone1(((0) + 1)),
    Bone2(((0) + 2)),
    Bone3(((0) + 3)),
    Bone4(((0) + 4)),
    Bone5(((0) + 5)),
    Bone6(((0) + 6)),
    Bone7(((0) + 7)),
    World(((0) + 8)),
    View(((0) + 9)),
    Projection(((0) + 10)),
    TexGen(((0) + 11)),
}

public enum class GeListState(
    public val value: Int,
) {
    Done(0),
    Queued(((0) + 1)),
    DrawingDone(((0) + 2)),
    StallReached(((0) + 3)),
    CancelDone(((0) + 4)),
}

public enum class GeCommand(
    public val value: UByte,
) {
    Nop(0u),
    Vaddr(0x1u),
    Iaddr(0x2u),
    Prim(0x4u),
    Bezier(0x5u),
    Spline(0x6u),
    BoundingBox(0x7u),
    Jump(0x8u),
    BJump(0x9u),
    Call(0xau),
    Ret(0xbu),
    End(0xcu),
    Signal(0xeu),
    Finish(0xfu),
    Base(0x10u),
    VertexType(0x12u),
    OffsetAddr(0x13u),
    Origin(0x14u),
    Region1(0x15u),
    Region2(0x16u),
    LightingEnable(0x17u),
    LightEnable0(0x18u),
    LightEnable1(0x19u),
    LightEnable2(0x1au),
    LightEnable3(0x1bu),
    DepthClampEnable(0x1cu),
    CullFaceEnable(0x1du),
    TextureMapEnable(0x1eu),
    FogEnable(0x1fu),
    DitherEnable(0x20u),
    AlphaBlendEnable(0x21u),
    AlphaTestEnable(0x22u),
    ZTestEnable(0x23u),
    StencilTestEnable(0x24u),
    AntiAliasEnable(0x25u),
    PatchCullEnable(0x26u),
    ColorTestEnable(0x27u),
    LogicOpEnable(0x28u),
    BoneMatrixNumber(0x2au),
    BoneMatrixData(0x2bu),
    MorphWeight0(0x2cu),
    MorphWeight1(0x2du),
    MorphWeight2(0x2eu),
    MorphWeight3(0x2fu),
    MorphWeight4(0x30u),
    MorphWeight5(0x31u),
    MorphWeight6(0x32u),
    MorphWeight7(0x33u),
    PatchDivision(0x36u),
    PatchPrimitive(0x37u),
    PatchFacing(0x38u),
    WorldMatrixNumber(0x3au),
    WorldMatrixData(0x3bu),
    ViewMatrixNumber(0x3cu),
    ViewMatrixData(0x3du),
    ProjMatrixNumber(0x3eu),
    ProjMatrixData(0x3fu),
    TGenMatrixNumber(0x40u),
    TGenMatrixData(0x41u),
    ViewportXScale(0x42u),
    ViewportYScale(0x43u),
    ViewportZScale(0x44u),
    ViewportXCenter(0x45u),
    ViewportYCenter(0x46u),
    ViewportZCenter(0x47u),
    TexScaleU(0x48u),
    TexScaleV(0x49u),
    TexOffsetU(0x4au),
    TexOffsetV(0x4bu),
    OffsetX(0x4cu),
    OffsetY(0x4du),
    ShadeMode(0x50u),
    ReverseNormal(0x51u),
    MaterialUpdate(0x53u),
    MaterialEmissive(0x54u),
    MaterialAmbient(0x55u),
    MaterialDiffuse(0x56u),
    MaterialSpecular(0x57u),
    MaterialAlpha(0x58u),
    MaterialSpecularCoef(0x5bu),
    AmbientColor(0x5cu),
    AmbientAlpha(0x5du),
    LightMode(0x5eu),
    LightType0(0x5fu),
    LightType1(0x60u),
    LightType2(0x61u),
    LightType3(0x62u),
    Light0X(0x63u),
    Light0Y(((0x63u).toUInt() + 1u).toUByte()),
    Light0Z(((0x63u).toUInt() + 2u).toUByte()),
    Light1X(((0x63u).toUInt() + 3u).toUByte()),
    Light1Y(((0x63u).toUInt() + 4u).toUByte()),
    Light1Z(((0x63u).toUInt() + 5u).toUByte()),
    Light2X(((0x63u).toUInt() + 6u).toUByte()),
    Light2Y(((0x63u).toUInt() + 7u).toUByte()),
    Light2Z(((0x63u).toUInt() + 8u).toUByte()),
    Light3X(((0x63u).toUInt() + 9u).toUByte()),
    Light3Y(((0x63u).toUInt() + 10u).toUByte()),
    Light3Z(((0x63u).toUInt() + 11u).toUByte()),
    Light0DirectionX(0x6fu),
    Light0DirectionY(((0x6fu).toUInt() + 1u).toUByte()),
    Light0DirectionZ(((0x6fu).toUInt() + 2u).toUByte()),
    Light1DirectionX(((0x6fu).toUInt() + 3u).toUByte()),
    Light1DirectionY(((0x6fu).toUInt() + 4u).toUByte()),
    Light1DirectionZ(((0x6fu).toUInt() + 5u).toUByte()),
    Light2DirectionX(((0x6fu).toUInt() + 6u).toUByte()),
    Light2DirectionY(((0x6fu).toUInt() + 7u).toUByte()),
    Light2DirectionZ(((0x6fu).toUInt() + 8u).toUByte()),
    Light3DirectionX(((0x6fu).toUInt() + 9u).toUByte()),
    Light3DirectionY(((0x6fu).toUInt() + 10u).toUByte()),
    Light3DirectionZ(((0x6fu).toUInt() + 11u).toUByte()),
    Light0ConstantAtten(0x7bu),
    Light0LinearAtten(((0x7bu).toUInt() + 1u).toUByte()),
    Light0QuadtraticAtten(((0x7bu).toUInt() + 2u).toUByte()),
    Light1ConstantAtten(((0x7bu).toUInt() + 3u).toUByte()),
    Light1LinearAtten(((0x7bu).toUInt() + 4u).toUByte()),
    Light1QuadtraticAtten(((0x7bu).toUInt() + 5u).toUByte()),
    Light2ConstantAtten(((0x7bu).toUInt() + 6u).toUByte()),
    Light2LinearAtten(((0x7bu).toUInt() + 7u).toUByte()),
    Light2QuadtraticAtten(((0x7bu).toUInt() + 8u).toUByte()),
    Light3ConstantAtten(((0x7bu).toUInt() + 9u).toUByte()),
    Light3LinearAtten(((0x7bu).toUInt() + 10u).toUByte()),
    Light3QuadtraticAtten(((0x7bu).toUInt() + 11u).toUByte()),
    Light0ExponentAtten(0x87u),
    Light1ExponentAtten(((0x87u).toUInt() + 1u).toUByte()),
    Light2ExponentAtten(((0x87u).toUInt() + 2u).toUByte()),
    Light3ExponentAtten(((0x87u).toUInt() + 3u).toUByte()),
    Light0CutoffAtten(0x8bu),
    Light1CutoffAtten(((0x8bu).toUInt() + 1u).toUByte()),
    Light2CutoffAtten(((0x8bu).toUInt() + 2u).toUByte()),
    Light3CutoffAtten(((0x8bu).toUInt() + 3u).toUByte()),
    Light0Ambient(0x8fu),
    Light0Diffuse(((0x8fu).toUInt() + 1u).toUByte()),
    Light0Specular(((0x8fu).toUInt() + 2u).toUByte()),
    Light1Ambient(((0x8fu).toUInt() + 3u).toUByte()),
    Light1Diffuse(((0x8fu).toUInt() + 4u).toUByte()),
    Light1Specular(((0x8fu).toUInt() + 5u).toUByte()),
    Light2Ambient(((0x8fu).toUInt() + 6u).toUByte()),
    Light2Diffuse(((0x8fu).toUInt() + 7u).toUByte()),
    Light2Specular(((0x8fu).toUInt() + 8u).toUByte()),
    Light3Ambient(((0x8fu).toUInt() + 9u).toUByte()),
    Light3Diffuse(((0x8fu).toUInt() + 10u).toUByte()),
    Light3Specular(((0x8fu).toUInt() + 11u).toUByte()),
    Cull(0x9bu),
    FrameBufPtr(0x9cu),
    FrameBufWidth(0x9du),
    ZBufPtr(0x9eu),
    ZBufWidth(0x9fu),
    TexAddr0(0xa0u),
    TexAddr1(((0xa0u).toUInt() + 1u).toUByte()),
    TexAddr2(((0xa0u).toUInt() + 2u).toUByte()),
    TexAddr3(((0xa0u).toUInt() + 3u).toUByte()),
    TexAddr4(((0xa0u).toUInt() + 4u).toUByte()),
    TexAddr5(((0xa0u).toUInt() + 5u).toUByte()),
    TexAddr6(((0xa0u).toUInt() + 6u).toUByte()),
    TexAddr7(((0xa0u).toUInt() + 7u).toUByte()),
    TexBufWidth0(0xa8u),
    TexBufWidth1(((0xa8u).toUInt() + 1u).toUByte()),
    TexBufWidth2(((0xa8u).toUInt() + 2u).toUByte()),
    TexBufWidth3(((0xa8u).toUInt() + 3u).toUByte()),
    TexBufWidth4(((0xa8u).toUInt() + 4u).toUByte()),
    TexBufWidth5(((0xa8u).toUInt() + 5u).toUByte()),
    TexBufWidth6(((0xa8u).toUInt() + 6u).toUByte()),
    TexBufWidth7(((0xa8u).toUInt() + 7u).toUByte()),
    ClutAddr(0xb0u),
    ClutAddrUpper(0xb1u),
    TransferSrc(((0xb1u).toUInt() + 1u).toUByte()),
    TransferSrcW(((0xb1u).toUInt() + 2u).toUByte()),
    TransferDst(((0xb1u).toUInt() + 3u).toUByte()),
    TransferDstW(((0xb1u).toUInt() + 4u).toUByte()),
    TexSize0(0xb8u),
    TexSize1(((0xb8u).toUInt() + 1u).toUByte()),
    TexSize2(((0xb8u).toUInt() + 2u).toUByte()),
    TexSize3(((0xb8u).toUInt() + 3u).toUByte()),
    TexSize4(((0xb8u).toUInt() + 4u).toUByte()),
    TexSize5(((0xb8u).toUInt() + 5u).toUByte()),
    TexSize6(((0xb8u).toUInt() + 6u).toUByte()),
    TexSize7(((0xb8u).toUInt() + 7u).toUByte()),
    TexMapMode(0xc0u),
    TexShadeLs(0xc1u),
    TexMode(0xc2u),
    TexFormat(0xc3u),
    LoadClut(0xc4u),
    ClutFormat(0xc5u),
    TexFilter(0xc6u),
    TexWrap(0xc7u),
    TexLevel(0xc8u),
    TexFunc(0xc9u),
    TexEnvColor(0xcau),
    TexFlush(0xcbu),
    TexSync(0xccu),
    Fog1(0xcdu),
    Fog2(0xceu),
    FogColor(0xcfu),
    TexLodSlope(0xd0u),
    FramebufPixFormat(0xd2u),
    ClearMode(0xd3u),
    Scissor1(0xd4u),
    Scissor2(0xd5u),
    MinZ(0xd6u),
    MaxZ(0xd7u),
    ColorTest(0xd8u),
    ColorRef(0xd9u),
    ColorTestmask(0xdau),
    AlphaTest(0xdbu),
    StencilTest(0xdcu),
    StencilOp(0xddu),
    ZTest(0xdeu),
    BlendMode(0xdfu),
    BlendFixedA(0xe0u),
    BlendFixedB(0xe1u),
    Dith0(0xe2u),
    Dith1(((0xe2u).toUInt() + 1u).toUByte()),
    Dith2(((0xe2u).toUInt() + 2u).toUByte()),
    Dith3(((0xe2u).toUInt() + 3u).toUByte()),
    LogicOp(0xe6u),
    ZWriteDisable(0xe7u),
    MaskRgb(0xe8u),
    MaskAlpha(0xe9u),
    TransferStart(0xeau),
    TransferSrcPos(0xebu),
    TransferDstPos(0xecu),
    TransferSize(0xeeu),
    Vscx(0xf0u),
    Vscy(0xf1u),
    Vscz(0xf2u),
    Vtcs(0xf3u),
    Vtct(0xf4u),
    Vtcq(0xf5u),
    Vcv(0xf6u),
    Vap(0xf7u),
    Vfc(0xf8u),
    Vscv(0xf9u),
    Unknown03(0x03u),
    Unknown0D(0x0du),
    Unknown11(0x11u),
    Unknown29(0x29u),
    Unknown34(0x34u),
    Unknown35(0x35u),
    Unknown39(0x39u),
    Unknown4E(0x4eu),
    Unknown4F(0x4fu),
    Unknown52(0x52u),
    Unknown59(0x59u),
    Unknown5A(0x5au),
    UnknownB6(0xb6u),
    UnknownB7(0xb7u),
    UnknownD1(0xd1u),
    UnknownED(0xedu),
    UnknownEF(0xefu),
    UnknownFA(0xfau),
    UnknownFB(0xfbu),
    UnknownFC(0xfcu),
    UnknownFD(0xfdu),
    UnknownFE(0xfeu),
    NopFF(0xffu),
}

public enum class SceSysMemPartitionId(
    public val value: Int,
) {
    SceKernelUnknownPartition(0),
    SceKernelPrimaryKernelPartition(1),
    SceKernelPrimaryUserPartition(2),
    SceKernelOtherKernelPartition1(3),
    SceKernelOtherKernelPartition2(4),
    SceKernelVshellPARTITION(5),
    SceKernelScUserPartition(6),
    SceKernelMeUserPartition(7),
    SceKernelExtendedScKernelPartition(8),
    SceKernelExtendedSc2KernelPartition(9),
    SceKernelExtendedMeKernelPartition(10),
    SceKernelVshellKernelPartition(11),
    SceKernelExtendedKernelPartition(12),
}

public enum class SceSysMemBlockTypes(
    public val value: Int,
) {
    Low(0),
    High(((0) + 1)),
    Addr(((0) + 2)),
}

public enum class Interrupt(
    public val value: UInt,
) {
    Gpio(4u),
    Ata(5u),
    Umd(6u),
    Mscm0(7u),
    Wlan(8u),
    Audio(10u),
    I2c(12u),
    Sircs(14u),
    Systimer0(15u),
    Systimer1(16u),
    Systimer2(17u),
    Systimer3(18u),
    Thread0(19u),
    Nand(20u),
    Dmacplus(21u),
    Dma0(22u),
    Dma1(23u),
    Memlmd(24u),
    Ge(25u),
    Vblank(30u),
    Mecodec(31u),
    Hpremote(36u),
    Mscm1(60u),
    Mscm2(61u),
    Thread1(65u),
    InterruptVariant(66u),
}

public enum class SubInterrupt(
    public val value: UInt,
) {
    Gpio(Interrupt.Gpio.value),
    Ata(Interrupt.Ata.value),
    Umd(Interrupt.Umd.value),
    Dmacplus(Interrupt.Dmacplus.value),
    Ge(Interrupt.Ge.value),
    Display(Interrupt.Vblank.value),
}

public enum class SceKernelIdListType(
    public val value: UInt,
) {
    Thread(1u),
    Semaphore(2u),
    EventFlag(3u),
    Mbox(4u),
    Vpl(5u),
    Fpl(6u),
    Mpipe(7u),
    Callback(8u),
    ThreadEventHandler(9u),
    Alarm(10u),
    VTimer(11u),
    SleepThread(64u),
    DelayThread(65u),
    SuspendThread(66u),
    DormantThread(67u),
}

public enum class UsbCamResolution(
    public val value: Int,
) {
    Px160120(0),
    Px176144(1),
    Px320240(2),
    Px352288(3),
    Px640480(4),
    Px1024768(5),
    Px1280960(6),
    Px480272(7),
    Px360272(8),
}

public enum class UsbCamResolutionEx(
    public val value: Int,
) {
    Px160120(0),
    Px176144(1),
    Px320240(2),
    Px352288(3),
    Px360272(4),
    Px480272(5),
    Px640480(6),
    Px1024768(7),
    Px1280960(8),
}

public enum class UsbCamDelay(
    public val value: Int,
) {
    NoDelay(0),
    Delay10Sec(1),
    Delay20Sec(2),
    Delay30Sec(3),
}

public enum class UsbCamFrameRate(
    public val value: Int,
) {
    Fps375(0),
    Fps5(1),
    Fps75(2),
    Fps10(3),
    Fps15(4),
    Fps20(5),
    Fps30(6),
    Fps60(7),
}

public enum class UsbCamWb(
    public val value: Int,
) {
    Auto(0),
    Daylight(1),
    Fluorescent(2),
    Incadescent(3),
}

public enum class UsbCamEffectMode(
    public val value: Int,
) {
    Normal(0),
    Negative(1),
    Blackwhite(2),
    Sepia(3),
    Blue(4),
    Red(5),
    Green(6),
}

public enum class UsbCamEvLevel(
    public val value: Int,
) {
    Pos20(0),
    Pos17(1),
    Pos15(2),
    Pos13(3),
    Pos10(4),
    Pos07(5),
    Pos05(6),
    Pos03(7),
    Zero(8),
    Neg03(((8) + 1)),
    Neg05(((8) + 2)),
    Neg07(((8) + 3)),
    Neg10(((8) + 4)),
    Neg13(((8) + 5)),
    Neg15(((8) + 6)),
    Neg17(((8) + 7)),
    Neg20(((8) + 8)),
}

public enum class RtcCheckValidError(
    public val value: Int,
) {
    InvalidYear(-1),
    InvalidMonth(-2),
    InvalidDay(-3),
    InvalidHour(-4),
    InvalidMinutes(-5),
    InvalidSeconds(-6),
    InvalidMicroseconds(-7),
}

public enum class PowerTick(
    public val value: UInt,
) {
    All(0u),
    Suspend(1u),
    Display(6u),
}

public enum class IoAssignPerms(
    public val value: UInt,
) {
    RdWr(0u),
    RdOnly(1u),
}

public enum class IoWhence(
    public val value: UInt,
) {
    Set(0u),
    Cur(1u),
    End(2u),
}

public enum class UmdType(
    public val value: UInt,
) {
    Game(0x10u),
    Video(0x20u),
    Audio(0x40u),
}

public enum class GuPrimitive(
    public val value: UInt,
) {
    Points(0u),
    Lines(1u),
    LineStrip(2u),
    Triangles(3u),
    TriangleStrip(4u),
    TriangleFan(5u),
    Sprites(6u),
}

public enum class PatchPrimitive(
    public val value: UInt,
) {
    Points(0u),
    LineStrip(2u),
    TriangleStrip(4u),
}

public enum class GuState(
    public val value: UInt,
) {
    AlphaTest(0u),
    DepthTest(1u),
    ScissorTest(2u),
    StencilTest(3u),
    Blend(4u),
    CullFace(5u),
    Dither(6u),
    Fog(7u),
    ClipPlanes(8u),
    Texture2D(9u),
    Lighting(10u),
    Light0(11u),
    Light1(12u),
    Light2(13u),
    Light3(14u),
    LineSmooth(15u),
    PatchCullFace(16u),
    ColorTest(17u),
    ColorLogicOp(18u),
    FaceNormalReverse(19u),
    PatchFace(20u),
    Fragment2X(21u),
}

public enum class MatrixMode(
    public val value: UInt,
) {
    Projection(0u),
    View(1u),
    Model(2u),
    Texture(3u),
}

public enum class TexturePixelFormat(
    public val value: UInt,
) {
    Psm5650(0u),
    Psm5551(1u),
    Psm4444(2u),
    Psm8888(3u),
    PsmT4(4u),
    PsmT8(5u),
    PsmT16(6u),
    PsmT32(7u),
    PsmDxt1(8u),
    PsmDxt3(9u),
    PsmDxt5(10u),
}

public enum class SplineMode(
    public val value: UInt,
) {
    FillFill(0u),
    OpenFill(1u),
    FillOpen(2u),
    OpenOpen(3u),
}

public enum class ShadingModel(
    public val value: UInt,
) {
    Flat(0u),
    Smooth(1u),
}

public enum class LogicalOperation(
    public val value: UInt,
) {
    Clear(0u),
    And(1u),
    AndReverse(2u),
    Copy(3u),
    AndInverted(4u),
    Noop(5u),
    Xor(6u),
    Or(7u),
    Nor(8u),
    Equiv(9u),
    Inverted(10u),
    OrReverse(11u),
    CopyInverted(12u),
    OrInverted(13u),
    Nand(14u),
    Set(15u),
}

public enum class TextureFilter(
    public val value: UInt,
) {
    Nearest(0u),
    Linear(1u),
    NearestMipmapNearest(4u),
    LinearMipmapNearest(5u),
    NearestMipmapLinear(6u),
    LinearMipmapLinear(7u),
}

public enum class TextureMapMode(
    public val value: UInt,
) {
    TextureCoords(0u),
    TextureMatrix(1u),
    EnvironmentMap(2u),
}

public enum class TextureLevelMode(
    public val value: UInt,
) {
    Auto(0u),
    Const(1u),
    Slope(2u),
}

public enum class TextureProjectionMapMode(
    public val value: UInt,
) {
    Position(0u),
    Uv(1u),
    NormalizedNormal(2u),
    Normal(3u),
}

public enum class GuTexWrapMode(
    public val value: UInt,
) {
    Repeat(0u),
    Clamp(1u),
}

public enum class FrontFaceDirection(
    public val value: UInt,
) {
    Clockwise(0u),
    CounterClockwise(1u),
}

public enum class AlphaFunc(
    public val value: UInt,
) {
    Never(0u),
    Always(((0u) + 1u)),
    Equal(((0u) + 2u)),
    NotEqual(((0u) + 3u)),
    Less(((0u) + 4u)),
    LessOrEqual(((0u) + 5u)),
    Greater(((0u) + 6u)),
    GreaterOrEqual(((0u) + 7u)),
}

public enum class StencilFunc(
    public val value: UInt,
) {
    Never(0u),
    Always(((0u) + 1u)),
    Equal(((0u) + 2u)),
    NotEqual(((0u) + 3u)),
    Less(((0u) + 4u)),
    LessOrEqual(((0u) + 5u)),
    Greater(((0u) + 6u)),
    GreaterOrEqual(((0u) + 7u)),
}

public enum class ColorFunc(
    public val value: UInt,
) {
    Never(0u),
    Always(((0u) + 1u)),
    Equal(((0u) + 2u)),
    NotEqual(((0u) + 3u)),
}

public enum class DepthFunc(
    public val value: UInt,
) {
    Never(0u),
    Always(((0u) + 1u)),
    Equal(((0u) + 2u)),
    NotEqual(((0u) + 3u)),
    Less(((0u) + 4u)),
    LessOrEqual(((0u) + 5u)),
    Greater(((0u) + 6u)),
    GreaterOrEqual(((0u) + 7u)),
}

public enum class TextureEffect(
    public val value: UInt,
) {
    Modulate(0u),
    Decal(1u),
    Blend(2u),
    Replace(3u),
    Add(4u),
}

public enum class TextureColorComponent(
    public val value: UInt,
) {
    Rgb(0u),
    Rgba(1u),
}

public enum class MipmapLevel(
    public val value: UInt,
) {
    None(0u),
    Level1(((0u) + 1u)),
    Level2(((0u) + 2u)),
    Level3(((0u) + 3u)),
    Level4(((0u) + 4u)),
    Level5(((0u) + 5u)),
    Level6(((0u) + 6u)),
    Level7(((0u) + 7u)),
}

public enum class BlendOp(
    public val value: UInt,
) {
    Add(0u),
    Subtract(1u),
    ReverseSubtract(2u),
    Min(3u),
    Max(4u),
    Abs(5u),
}

public enum class BlendSrc(
    public val value: UInt,
) {
    SrcColor(0u),
    OneMinusSrcColor(1u),
    SrcAlpha(2u),
    OneMinusSrcAlpha(3u),
    Fix(10u),
}

public enum class BlendDst(
    public val value: UInt,
) {
    DstColor(0u),
    OneMinusDstColor(1u),
    DstAlpha(4u),
    OneMinusDstAlpha(5u),
    Fix(10u),
}

public enum class StencilOperation(
    public val value: UInt,
) {
    Keep(0u),
    Zero(1u),
    Replace(2u),
    Invert(3u),
    Incr(4u),
    Decr(5u),
}

public enum class LightMode(
    public val value: UInt,
) {
    SingleColor(0u),
    SeparateSpecularColor(1u),
}

public enum class LightType(
    public val value: UInt,
) {
    Directional(0u),
    Pointlight(1u),
    Spotlight(2u),
}

public enum class GuContextType(
    public val value: UInt,
) {
    Direct(0u),
    Call(1u),
    Send(2u),
}

public enum class GuQueueMode(
    public val value: UInt,
) {
    Tail(0u),
    Head(1u),
}

public enum class GuSyncMode(
    public val value: UInt,
) {
    Finish(0u),
    Signal(1u),
    Done(2u),
    List(3u),
    Send(4u),
}

public enum class GuSyncBehavior(
    public val value: UInt,
) {
    Wait(0u),
    NoWait(1u),
}

public enum class GuCallbackId(
    public val value: UInt,
) {
    Signal(1u),
    Finish(4u),
}

public enum class SignalBehavior(
    public val value: UInt,
) {
    Suspend(1u),
    Continue(2u),
}

public enum class ClutPixelFormat(
    public val value: UInt,
) {
    Psm5650(0u),
    Psm5551(1u),
    Psm4444(2u),
    Psm8888(3u),
}

public enum class KeyType(
    public val value: UInt,
) {
    Directory(1u),
    Integer(2u),
    String(3u),
    Bytes(4u),
}

public enum class UtilityMsgDialogMode(
    public val value: UInt,
) {
    Error(0u),
    Text(1u),
}

public enum class UtilityMsgDialogPressed(
    public val value: UInt,
) {
    Unknown1(0u),
    Yes(1u),
    No(2u),
    Back(3u),
}

public enum class UtilityDialogButtonAccept(
    public val value: UInt,
) {
    Circle(0u),
    Cross(1u),
}

public enum class SceUtilityOskInputLanguage(
    public val value: UInt,
) {
    Default(0u),
    Japanese(1u),
    English(2u),
    French(3u),
    Spanish(4u),
    German(5u),
    Italian(6u),
    Dutch(7u),
    Portugese(8u),
    Russian(9u),
    Korean(10u),
}

public enum class SceUtilityOskInputType(
    public val value: UInt,
) {
    All(0u),
    LatinDigit(1u),
    LatinSymbol(2u),
    LatinLowercase(4u),
    LatinUppercase(8u),
    JapaneseDigit(0x100u),
    JapaneseSymbol(0x200u),
    JapaneseLowercase(0x400u),
    JapaneseUppercase(0x800u),
    JapaneseHiragana(0x1000u),
    JapaneseHalfWidthKatakana(0x2000u),
    JapaneseKatakana(0x4000u),
    JapaneseKanji(0x8000u),
    RussianLowercase(0x10000u),
    RussianUppercase(0x20000u),
    Korean(0x40000u),
    Url(0x80000u),
}

public enum class SceUtilityOskState(
    public val value: UInt,
) {
    None(0u),
    Initializing(1u),
    Initialized(2u),
    Visible(3u),
    Quit(4u),
    Finished(5u),
}

public enum class SceUtilityOskResult(
    public val value: UInt,
) {
    Unchanged(0u),
    Cancelled(1u),
    Changed(2u),
}

public enum class SystemParamLanguage(
    public val value: UInt,
) {
    Japanese(0u),
    English(1u),
    French(2u),
    Spanish(3u),
    German(4u),
    Italian(5u),
    Dutch(6u),
    Portugese(7u),
    Russian(8u),
    Korean(9u),
    ChineseTraditional(10u),
    ChineseSimplified(11u),
}

public enum class SystemParamId(
    public val value: UInt,
) {
    StringNickname(1u),
    AdhocChannel(((1u) + 1u)),
    WlanPowerSave(((1u) + 2u)),
    DateFormat(((1u) + 3u)),
    TimeFormat(((1u) + 4u)),
    Timezone(((1u) + 5u)),
    DaylightSavings(((1u) + 6u)),
    Language(((1u) + 7u)),
    Unknown(((1u) + 8u)),
}

public enum class SystemParamAdhocChannel(
    public val value: UInt,
) {
    ChannelAutomatic(0u),
    Channel1(1u),
    Channel6(6u),
    Channel11(11u),
}

public enum class SystemParamWlanPowerSaveState(
    public val value: UInt,
) {
    Off(0u),
    On(1u),
}

public enum class SystemParamDateFormat(
    public val value: UInt,
) {
    YYYYMMDD(0u),
    MMDDYYYY(1u),
    DDMMYYYY(2u),
}

public enum class SystemParamTimeFormat(
    public val value: UInt,
) {
    Hour24(0u),
    Hour12(1u),
}

public enum class SystemParamDaylightSavings(
    public val value: UInt,
) {
    Std(0u),
    Dst(1u),
}

public enum class AvModule(
    public val value: UInt,
) {
    AvCodec(0u),
    SasCore(1u),
    Atrac3Plus(2u),
    MpegBase(3u),
    Mp3(4u),
    Vaudio(5u),
    Aac(6u),
    G729(7u),
}

public enum class Module(
    public val value: UInt,
) {
    NetCommon(0x100u),
    NetAdhoc(((0x100u) + 1u)),
    NetInet(((0x100u) + 2u)),
    NetParseUri(((0x100u) + 3u)),
    NetHttp(((0x100u) + 4u)),
    NetSsl(((0x100u) + 5u)),
    UsbPspCm(0x200u),
    UsbMic(((0x200u) + 1u)),
    UsbCam(((0x200u) + 2u)),
    UsbGps(((0x200u) + 3u)),
    AvCodec(0x300u),
    AvSascore(((0x300u) + 1u)),
    AvAtrac3Plus(((0x300u) + 2u)),
    AvMpegBase(((0x300u) + 3u)),
    AvMp3(((0x300u) + 4u)),
    AvVaudio(((0x300u) + 5u)),
    AvAac(((0x300u) + 6u)),
    AvG729(((0x300u) + 7u)),
    NpCommon(0x400u),
    NpService(((0x400u) + 1u)),
    NpMatching2(((0x400u) + 2u)),
    NpDrm(0x500u),
    Irda(0x600u),
}

public enum class NetModule(
    public val value: UInt,
) {
    NetCommon(1u),
    NetAdhoc(((1u) + 1u)),
    NetInet(((1u) + 2u)),
    NetParseUri(((1u) + 3u)),
    NetHttp(((1u) + 4u)),
    NetSsl(((1u) + 5u)),
}

public enum class UsbModule(
    public val value: UInt,
) {
    UsbPspCm(1u),
    UsbAcc(((1u) + 1u)),
    UsbMic(((1u) + 2u)),
    UsbCam(((1u) + 3u)),
    UsbGps(((1u) + 4u)),
}

public enum class NetParam(
    public val value: UInt,
) {
    Name(0u),
    Ssid(1u),
    Secure(2u),
    WepKey(3u),
    IsStaticIp(4u),
    Ip(5u),
    NetMask(6u),
    Route(7u),
    ManualDns(8u),
    PrimaryDns(9u),
    SecondaryDns(10u),
    ProxyUser(11u),
    ProxyPass(12u),
    UseProxy(13u),
    ProxyServer(14u),
    ProxyPort(15u),
    Unknown1(16u),
    Unknown2(17u),
}

public enum class UtilityNetconfAction(
    public val value: UInt,
) {
    ConnectAP(0u),
    DisplayStatus(1u),
    ConnectAdhoc(2u),
}

public enum class UtilitySavedataMode(
    public val value: UInt,
) {
    AutoLoad(0u),
    AutoSave(1u),
    Load(2u),
    Save(3u),
    ListLoad(4u),
    ListSave(5u),
    ListDelete(6u),
    Delete(7u),
}

public enum class UtilitySavedataFocus(
    public val value: UInt,
) {
    Unknown1(0u),
    FirstList(1u),
    LastList(2u),
    Latest(3u),
    Oldest(4u),
    Unknown2(5u),
    Unknown3(6u),
    FirstEmpty(7u),
    LastEmpty(8u),
}

public enum class UtilityGameSharingMode(
    public val value: UInt,
) {
    Single(1u),
    Multiple(((1u) + 1u)),
}

public enum class UtilityGameSharingDataType(
    public val value: UInt,
) {
    File(1u),
    Memory(((1u) + 1u)),
}

public enum class UtilityHtmlViewerInterfaceMode(
    public val value: UInt,
) {
    Full(0u),
    Limited(1u),
    None(2u),
}

public enum class UtilityHtmlViewerCookieMode(
    public val value: UInt,
) {
    Disabled(0u),
    Enabled(((0u) + 1u)),
    Confirm(((0u) + 2u)),
    Default(((0u) + 3u)),
}

public enum class UtilityHtmlViewerTextSize(
    public val value: UInt,
) {
    Large(0u),
    Normal(1u),
    Small(2u),
}

public enum class UtilityHtmlViewerDisplayMode(
    public val value: UInt,
) {
    Normal(0u),
    Fit(1u),
    SmartFit(2u),
}

public enum class UtilityHtmlViewerConnectMode(
    public val value: UInt,
) {
    Last(0u),
    ManualOnce(1u),
    ManualAll(2u),
}

public enum class UtilityHtmlViewerDisconnectMode(
    public val value: UInt,
) {
    Enable(0u),
    Disable(1u),
    Confirm(2u),
}

public enum class ScePspnetAdhocPtpState(
    public val value: UInt,
) {
    Closed(0u),
    Listen(1u),
    SynSent(2u),
    SynReceived(3u),
    Established(4u),
}

public enum class AdhocMatchingMode(
    public val value: UInt,
) {
    Host(1u),
    Client(((1u) + 1u)),
    Ptp(((1u) + 2u)),
}

public enum class ApctlState(
    public val value: UInt,
) {
    Disconnected(0u),
    Scanning(1u),
    Joining(2u),
    GettingIp(3u),
    GotIp(4u),
    EapAuth(5u),
    KeyExchange(6u),
}

public enum class ApctlEvent(
    public val value: UInt,
) {
    ConnectRequest(0u),
    ScanRequest(1u),
    ScanComplete(2u),
    Established(3u),
    GetIp(4u),
    DisconnectRequest(5u),
    Error(6u),
    Info(7u),
    EapAuth(8u),
    KeyExchange(9u),
    Reconnect(10u),
}

public enum class ApctlInfo(
    public val value: UInt,
) {
    ProfileName(0u),
    Bssid(1u),
    Ssid(2u),
    SsidLength(3u),
    SecurityType(4u),
    Strength(5u),
    Channel(6u),
    PowerSave(7u),
    Ip(8u),
    SubnetMask(9u),
    Gateway(10u),
    PrimaryDns(11u),
    SecondaryDns(12u),
    UseProxy(13u),
    ProxyUrl(14u),
    ProxyPort(15u),
    EapType(16u),
    StartBrowser(17u),
    Wifisp(18u),
}

public enum class ApctlInfoSecurityType(
    public val value: UInt,
) {
    None(0u),
    Wep(1u),
    Wpa(2u),
}

public enum class HttpMethod(
    public val value: UInt,
) {
    Get(0u),
    Post(1u),
    Head(2u),
}

public enum class HttpAuthType(
    public val value: UInt,
) {
    Basic(0u),
    Digest(1u),
}

public data class SceUid(
    public var value: Int = 0,
) {
    public var field0: Int
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceUid> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceUid> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SceUid =
                    SceUid(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SceUid) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.value)
                }
            }
    }
}

public class SceMpeg internal constructor(
    valueCtorArg: MutPtr<MutPtr<CVoid>>,
) {
    public var value: MutPtr<MutPtr<CVoid>> = valueCtorArg
        internal set

    public var field0: MutPtr<MutPtr<CVoid>>
        get() = value
        set(v) {
            value = v
        }

    public constructor() : this(
        valueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<MutPtr<CVoid>> = this.value

    public fun copy(value: MutPtr<MutPtr<CVoid>> = this.value): SceMpeg = SceMpeg(valueCtorArg = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceMpeg) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int = this.value.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceMpeg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceMpeg> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceMpeg =
                    SceMpeg(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<MutPtr<CVoid>>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SceMpeg) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<MutPtr<CVoid>>(64)
                    ).writeNative(addr, value.value)
                }
            }

        public operator fun invoke(
            value: MutPtr<MutPtr<CVoid>> = MutPtr(0L),
        ): SceMpeg =
            SceMpeg(
                valueCtorArg = value,
            )
    }
}

public class SceMpegStream internal constructor(
    valueCtorArg: MutPtr<CVoid>,
) {
    public var value: MutPtr<CVoid> = valueCtorArg
        internal set

    public var field0: MutPtr<CVoid>
        get() = value
        set(v) {
            value = v
        }

    public constructor() : this(
        valueCtorArg = MutPtr(0L),
    )

    public operator fun component1(): MutPtr<CVoid> = this.value

    public fun copy(value: MutPtr<CVoid> = this.value): SceMpegStream = SceMpegStream(valueCtorArg = value)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceMpegStream) return false
        if (this.value != other.value) return false
        return true
    }

    override fun hashCode(): Int = this.value.hashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceMpegStream> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceMpegStream> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceMpegStream =
                    SceMpegStream(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SceMpegStream) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.value)
                }
            }

        public operator fun invoke(
            value: MutPtr<CVoid> = MutPtr(0L),
        ): SceMpegStream =
            SceMpegStream(
                valueCtorArg = value,
            )
    }
}

public data class Mp3Handle(
    public var value: Int = 0,
) {
    public var field0: Int
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mp3Handle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Mp3Handle> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Mp3Handle =
                    Mp3Handle(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: Mp3Handle) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.value)
                }
            }
    }
}

public data class RegHandle(
    public var value: UInt = 0u,
) {
    public var field0: UInt
        get() = value
        set(v) {
            value = v
        }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegHandle> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<RegHandle> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): RegHandle =
                    RegHandle(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: RegHandle) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.value)
                }
            }
    }
}

public data class Sockaddr(
    public var saLen: UByte = 0u,
    public var saFamily: UByte = 0u,
    public var saData: UByteArray = UByteArray(14),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Sockaddr) return false
        if (this.saLen != other.saLen) return false
        if (this.saFamily != other.saFamily) return false
        if (!this.saData.contentEquals(other.saData)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.saLen.hashCode()
        result = 31 * result + this.saFamily.hashCode()
        result = 31 * result + this.saData.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sockaddr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Sockaddr> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): Sockaddr =
                    Sockaddr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (14).toInt())
                        ).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: Sockaddr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr, value.saLen)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1L, value.saFamily)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (14).toInt())
                    ).writeNative(addr + 2L, value.saData)
                }
            }
    }
}

public data class InAddr(
    public var sAddr: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<InAddr> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<InAddr> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): InAddr =
                    InAddr(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: InAddr) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.sAddr)
                }
            }
    }
}

public data class AudioInputParams(
    public var unknown1: Int = 0,
    public var gain: Int = 0,
    public var unknown2: Int = 0,
    public var unknown3: Int = 0,
    public var unknown4: Int = 0,
    public var unknown5: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AudioInputParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AudioInputParams> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): AudioInputParams =
                    AudioInputParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: AudioInputParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.unknown1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.gain)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.unknown2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.unknown3)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.unknown4)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.unknown5)
                }
            }
    }
}

public class Atrac3BufferInfo internal constructor(
    pucWritePositionFirstBufCtorArg: MutPtr<UByte>,
    public var uiWritableByteFirstBuf: UInt,
    public var uiMinWriteByteFirstBuf: UInt,
    public var uiReadPositionFirstBuf: UInt,
    pucWritePositionSecondBufCtorArg: MutPtr<UByte>,
    public var uiWritableByteSecondBuf: UInt,
    public var uiMinWriteByteSecondBuf: UInt,
    public var uiReadPositionSecondBuf: UInt,
) {
    public var pucWritePositionFirstBuf: MutPtr<UByte> = pucWritePositionFirstBufCtorArg
        internal set

    public var pucWritePositionSecondBuf: MutPtr<UByte> = pucWritePositionSecondBufCtorArg
        internal set

    public constructor() : this(
        pucWritePositionFirstBufCtorArg = MutPtr(0L),
        uiWritableByteFirstBuf = 0u,
        uiMinWriteByteFirstBuf = 0u,
        uiReadPositionFirstBuf = 0u,
        pucWritePositionSecondBufCtorArg = MutPtr(0L),
        uiWritableByteSecondBuf = 0u,
        uiMinWriteByteSecondBuf = 0u,
        uiReadPositionSecondBuf = 0u,
    )

    public operator fun component1(): MutPtr<UByte> = this.pucWritePositionFirstBuf

    public operator fun component2(): UInt = this.uiWritableByteFirstBuf

    public operator fun component3(): UInt = this.uiMinWriteByteFirstBuf

    public operator fun component4(): UInt = this.uiReadPositionFirstBuf

    public operator fun component5(): MutPtr<UByte> = this.pucWritePositionSecondBuf

    public operator fun component6(): UInt = this.uiWritableByteSecondBuf

    public operator fun component7(): UInt = this.uiMinWriteByteSecondBuf

    public operator fun component8(): UInt = this.uiReadPositionSecondBuf

    public fun copy(pucWritePositionFirstBuf: MutPtr<UByte> = this.pucWritePositionFirstBuf, uiWritableByteFirstBuf: UInt = this.uiWritableByteFirstBuf, uiMinWriteByteFirstBuf: UInt = this.uiMinWriteByteFirstBuf, uiReadPositionFirstBuf: UInt = this.uiReadPositionFirstBuf, pucWritePositionSecondBuf: MutPtr<UByte> = this.pucWritePositionSecondBuf, uiWritableByteSecondBuf: UInt = this.uiWritableByteSecondBuf, uiMinWriteByteSecondBuf: UInt = this.uiMinWriteByteSecondBuf, uiReadPositionSecondBuf: UInt = this.uiReadPositionSecondBuf): Atrac3BufferInfo = Atrac3BufferInfo(pucWritePositionFirstBufCtorArg = pucWritePositionFirstBuf, uiWritableByteFirstBuf = uiWritableByteFirstBuf, uiMinWriteByteFirstBuf = uiMinWriteByteFirstBuf, uiReadPositionFirstBuf = uiReadPositionFirstBuf, pucWritePositionSecondBufCtorArg = pucWritePositionSecondBuf, uiWritableByteSecondBuf = uiWritableByteSecondBuf, uiMinWriteByteSecondBuf = uiMinWriteByteSecondBuf, uiReadPositionSecondBuf = uiReadPositionSecondBuf)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Atrac3BufferInfo) return false
        if (this.pucWritePositionFirstBuf != other.pucWritePositionFirstBuf) return false
        if (this.uiWritableByteFirstBuf != other.uiWritableByteFirstBuf) return false
        if (this.uiMinWriteByteFirstBuf != other.uiMinWriteByteFirstBuf) return false
        if (this.uiReadPositionFirstBuf != other.uiReadPositionFirstBuf) return false
        if (this.pucWritePositionSecondBuf != other.pucWritePositionSecondBuf) return false
        if (this.uiWritableByteSecondBuf != other.uiWritableByteSecondBuf) return false
        if (this.uiMinWriteByteSecondBuf != other.uiMinWriteByteSecondBuf) return false
        if (this.uiReadPositionSecondBuf != other.uiReadPositionSecondBuf) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.pucWritePositionFirstBuf.hashCode()
        result = 31 * result + this.uiWritableByteFirstBuf.hashCode()
        result = 31 * result + this.uiMinWriteByteFirstBuf.hashCode()
        result = 31 * result + this.uiReadPositionFirstBuf.hashCode()
        result = 31 * result + this.pucWritePositionSecondBuf.hashCode()
        result = 31 * result + this.uiWritableByteSecondBuf.hashCode()
        result = 31 * result + this.uiMinWriteByteSecondBuf.hashCode()
        result = 31 * result + this.uiReadPositionSecondBuf.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Atrac3BufferInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Atrac3BufferInfo> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): Atrac3BufferInfo =
                    Atrac3BufferInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: Atrac3BufferInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr, value.pucWritePositionFirstBuf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uiWritableByteFirstBuf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.uiMinWriteByteFirstBuf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.uiReadPositionFirstBuf)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 24L, value.pucWritePositionSecondBuf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.uiWritableByteSecondBuf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.uiMinWriteByteSecondBuf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.uiReadPositionSecondBuf)
                }
            }

        public operator fun invoke(
            pucWritePositionFirstBuf: MutPtr<UByte> = MutPtr(0L),
            uiWritableByteFirstBuf: UInt = 0u,
            uiMinWriteByteFirstBuf: UInt = 0u,
            uiReadPositionFirstBuf: UInt = 0u,
            pucWritePositionSecondBuf: MutPtr<UByte> = MutPtr(0L),
            uiWritableByteSecondBuf: UInt = 0u,
            uiMinWriteByteSecondBuf: UInt = 0u,
            uiReadPositionSecondBuf: UInt = 0u,
        ): Atrac3BufferInfo =
            Atrac3BufferInfo(
                pucWritePositionFirstBufCtorArg = pucWritePositionFirstBuf,
                uiWritableByteFirstBuf = uiWritableByteFirstBuf,
                uiMinWriteByteFirstBuf = uiMinWriteByteFirstBuf,
                uiReadPositionFirstBuf = uiReadPositionFirstBuf,
                pucWritePositionSecondBufCtorArg = pucWritePositionSecondBuf,
                uiWritableByteSecondBuf = uiWritableByteSecondBuf,
                uiMinWriteByteSecondBuf = uiMinWriteByteSecondBuf,
                uiReadPositionSecondBuf = uiReadPositionSecondBuf,
            )
    }
}

public data class SceCtrlData(
    public var timestamp: UInt = 0u,
    public var buttons: Int = 0,
    public var lx: UByte = 0u,
    public var ly: UByte = 0u,
    public var rsrv: UByteArray = UByteArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceCtrlData) return false
        if (this.timestamp != other.timestamp) return false
        if (this.buttons != other.buttons) return false
        if (this.lx != other.lx) return false
        if (this.ly != other.ly) return false
        if (!this.rsrv.contentEquals(other.rsrv)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.timestamp.hashCode()
        result = 31 * result + this.buttons.hashCode()
        result = 31 * result + this.lx.hashCode()
        result = 31 * result + this.ly.hashCode()
        result = 31 * result + this.rsrv.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceCtrlData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceCtrlData> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SceCtrlData =
                    SceCtrlData(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 9L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 10L),
                    )
                override fun writeNative(addr: Long, value: SceCtrlData) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.timestamp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.buttons)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.lx)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 9L, value.ly)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 10L, value.rsrv)
                }
            }
    }
}

public data class SceCtrlLatch(
    public var uiMake: UInt = 0u,
    public var uiBreak: UInt = 0u,
    public var uiPress: UInt = 0u,
    public var uiRelease: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceCtrlLatch> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceCtrlLatch> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SceCtrlLatch =
                    SceCtrlLatch(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: SceCtrlLatch) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.uiMake)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.uiBreak)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.uiPress)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.uiRelease)
                }
            }
    }
}

public data class GeStack(
    public var stack: UIntArray = UIntArray(8),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GeStack) return false
        if (!this.stack.contentEquals(other.stack)) return false
        return true
    }

    override fun hashCode(): Int = this.stack.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GeStack> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GeStack> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): GeStack =
                    GeStack(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (8).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GeStack) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (8).toInt())
                    ).writeNative(addr, value.stack)
                }
            }
    }
}

public class GeCallbackData internal constructor(
    public var signalFunc: FnCallback7?,
    signalArgCtorArg: MutPtr<CVoid>,
    public var finishFunc: FnCallback7?,
    finishArgCtorArg: MutPtr<CVoid>,
) {
    public var signalArg: MutPtr<CVoid> = signalArgCtorArg
        internal set

    public var finishArg: MutPtr<CVoid> = finishArgCtorArg
        internal set

    public constructor() : this(
        signalFunc = null,
        signalArgCtorArg = MutPtr(0L),
        finishFunc = null,
        finishArgCtorArg = MutPtr(0L),
    )

    public operator fun component1(): FnCallback7? = this.signalFunc

    public operator fun component2(): MutPtr<CVoid> = this.signalArg

    public operator fun component3(): FnCallback7? = this.finishFunc

    public operator fun component4(): MutPtr<CVoid> = this.finishArg

    public fun copy(signalFunc: FnCallback7? = this.signalFunc, signalArg: MutPtr<CVoid> = this.signalArg, finishFunc: FnCallback7? = this.finishFunc, finishArg: MutPtr<CVoid> = this.finishArg): GeCallbackData = GeCallbackData(signalFunc = signalFunc, signalArgCtorArg = signalArg, finishFunc = finishFunc, finishArgCtorArg = finishArg)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GeCallbackData) return false
        if (this.signalFunc != other.signalFunc) return false
        if (this.signalArg != other.signalArg) return false
        if (this.finishFunc != other.finishFunc) return false
        if (this.finishArg != other.finishArg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.signalFunc.hashCode()
        result = 31 * result + this.signalArg.hashCode()
        result = 31 * result + this.finishFunc.hashCode()
        result = 31 * result + this.finishArg.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            signalFunc: FnCallback7? = null,
            signalArg: MutPtr<CVoid> = MutPtr(0L),
            finishFunc: FnCallback7? = null,
            finishArg: MutPtr<CVoid> = MutPtr(0L),
        ): GeCallbackData =
            GeCallbackData(
                signalFunc = signalFunc,
                signalArgCtorArg = signalArg,
                finishFunc = finishFunc,
                finishArgCtorArg = finishArg,
            )
    }
}

public class GeListArgs internal constructor(
    public var size: UInt,
    contextCtorArg: MutPtr<GeContext>,
    public var numStacks: UInt,
    stacksCtorArg: MutPtr<GeStack>,
) {
    public var context: MutPtr<GeContext> = contextCtorArg
        internal set

    public var stacks: MutPtr<GeStack> = stacksCtorArg
        internal set

    public constructor() : this(
        size = 0u,
        contextCtorArg = MutPtr(0L),
        numStacks = 0u,
        stacksCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UInt = this.size

    public operator fun component2(): MutPtr<GeContext> = this.context

    public operator fun component3(): UInt = this.numStacks

    public operator fun component4(): MutPtr<GeStack> = this.stacks

    public fun copy(size: UInt = this.size, context: MutPtr<GeContext> = this.context, numStacks: UInt = this.numStacks, stacks: MutPtr<GeStack> = this.stacks): GeListArgs = GeListArgs(size = size, contextCtorArg = context, numStacks = numStacks, stacksCtorArg = stacks)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GeListArgs) return false
        if (this.size != other.size) return false
        if (this.context != other.context) return false
        if (this.numStacks != other.numStacks) return false
        if (this.stacks != other.stacks) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.context.hashCode()
        result = 31 * result + this.numStacks.hashCode()
        result = 31 * result + this.stacks.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GeListArgs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GeListArgs> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): GeListArgs =
                    GeListArgs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<GeContext>(64)
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<GeStack>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: GeListArgs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<GeContext>(64)
                    ).writeNative(addr + 8L, value.context)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.numStacks)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<GeStack>(64)
                    ).writeNative(addr + 24L, value.stacks)
                }
            }

        public operator fun invoke(
            size: UInt = 0u,
            context: MutPtr<GeContext> = MutPtr(0L),
            numStacks: UInt = 0u,
            stacks: MutPtr<GeStack> = MutPtr(0L),
        ): GeListArgs =
            GeListArgs(
                size = size,
                contextCtorArg = context,
                numStacks = numStacks,
                stacksCtorArg = stacks,
            )
    }
}

public data class GeBreakParam(
    public var buf: UIntArray = UIntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GeBreakParam) return false
        if (!this.buf.contentEquals(other.buf)) return false
        return true
    }

    override fun hashCode(): Int = this.buf.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GeBreakParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GeBreakParam> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): GeBreakParam =
                    GeBreakParam(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GeBreakParam) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr, value.buf)
                }
            }
    }
}

public class SceKernelLoadExecParam internal constructor(
    public var size: Int,
    public var args: Int,
    argpCtorArg: MutPtr<CVoid>,
    keyCtorArg: ConstPtr<UByte>,
) {
    public var argp: MutPtr<CVoid> = argpCtorArg
        internal set

    public var key: ConstPtr<UByte> = keyCtorArg
        internal set

    public constructor() : this(
        size = 0,
        args = 0,
        argpCtorArg = MutPtr(0L),
        keyCtorArg = ConstPtr(0L),
    )

    public operator fun component1(): Int = this.size

    public operator fun component2(): Int = this.args

    public operator fun component3(): MutPtr<CVoid> = this.argp

    public operator fun component4(): ConstPtr<UByte> = this.key

    public fun copy(size: Int = this.size, args: Int = this.args, argp: MutPtr<CVoid> = this.argp, key: ConstPtr<UByte> = this.key): SceKernelLoadExecParam = SceKernelLoadExecParam(size = size, args = args, argpCtorArg = argp, keyCtorArg = key)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceKernelLoadExecParam) return false
        if (this.size != other.size) return false
        if (this.args != other.args) return false
        if (this.argp != other.argp) return false
        if (this.key != other.key) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.args.hashCode()
        result = 31 * result + this.argp.hashCode()
        result = 31 * result + this.key.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelLoadExecParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelLoadExecParam> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceKernelLoadExecParam =
                    SceKernelLoadExecParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .constPtrLayout<UByte>(64)
                        ).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SceKernelLoadExecParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.args)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.argp)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .constPtrLayout<UByte>(64)
                    ).writeNative(addr + 24L, value.key)
                }
            }

        public operator fun invoke(
            size: Int = 0,
            args: Int = 0,
            argp: MutPtr<CVoid> = MutPtr(0L),
            key: ConstPtr<UByte> = ConstPtr(0L),
        ): SceKernelLoadExecParam =
            SceKernelLoadExecParam(
                size = size,
                args = args,
                argpCtorArg = argp,
                keyCtorArg = key,
            )
    }
}

public data class Timeval(
    public var tvSec: Int = 0,
    public var tvUsec: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timeval> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timeval> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Timeval =
                    Timeval(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Timeval) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.tvSec)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.tvUsec)
                }
            }
    }
}

public data class Timezone(
    public var tzMinutesWest: Int = 0,
    public var tzDstTime: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timezone> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<Timezone> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): Timezone =
                    Timezone(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: Timezone) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.tzMinutesWest)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.tzDstTime)
                }
            }
    }
}

public data class IntrHandlerOptionParam(
    public var size: Int = 0,
    public var entry: UInt = 0u,
    public var common: UInt = 0u,
    public var gp: UInt = 0u,
    public var intrCode: UShort = 0u,
    public var subCount: UShort = 0u,
    public var intrLevel: UShort = 0u,
    public var enabled: UShort = 0u,
    public var calls: UInt = 0u,
    public var field1c: UInt = 0u,
    public var totalClockLo: UInt = 0u,
    public var totalClockHi: UInt = 0u,
    public var minClockLo: UInt = 0u,
    public var minClockHi: UInt = 0u,
    public var maxClockLo: UInt = 0u,
    public var maxClockHi: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<IntrHandlerOptionParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<IntrHandlerOptionParam> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): IntrHandlerOptionParam =
                    IntrHandlerOptionParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: IntrHandlerOptionParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.entry)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.common)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.gp)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 16L, value.intrCode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.subCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.intrLevel)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.enabled)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.calls)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.field1c)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.totalClockLo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.totalClockHi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.minClockLo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.minClockHi)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.maxClockLo)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.maxClockHi)
                }
            }
    }
}

public data class SceKernelLMOption(
    public var size: Int = 0,
    public var mPidText: SceUid = SceUid(),
    public var mPidData: SceUid = SceUid(),
    public var flags: UInt = 0u,
    public var position: UByte = 0u,
    public var access: UByte = 0u,
    public var cReserved: UByteArray = UByteArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceKernelLMOption) return false
        if (this.size != other.size) return false
        if (this.mPidText != other.mPidText) return false
        if (this.mPidData != other.mPidData) return false
        if (this.flags != other.flags) return false
        if (this.position != other.position) return false
        if (this.access != other.access) return false
        if (!this.cReserved.contentEquals(other.cReserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.mPidText.hashCode()
        result = 31 * result + this.mPidData.hashCode()
        result = 31 * result + this.flags.hashCode()
        result = 31 * result + this.position.hashCode()
        result = 31 * result + this.access.hashCode()
        result = 31 * result + this.cReserved.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelLMOption> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelLMOption> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceKernelLMOption =
                    SceKernelLMOption(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (SceUid.typeLayout()).readNative(addr + 8L),
                        (SceUid.typeLayout()).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 21L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 22L),
                    )
                override fun writeNative(addr: Long, value: SceKernelLMOption) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                    (SceUid.typeLayout()).writeNative(addr + 8L, value.mPidText)
                    (SceUid.typeLayout()).writeNative(addr + 12L, value.mPidData)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.flags)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 20L, value.position)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 21L, value.access)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 22L, value.cReserved)
                }
            }
    }
}

public data class SceKernelSMOption(
    public var size: Int = 0,
    public var mPidStack: SceUid = SceUid(),
    public var stackSize: Int = 0,
    public var priority: Int = 0,
    public var attribute: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelSMOption> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelSMOption> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceKernelSMOption =
                    SceKernelSMOption(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (SceUid.typeLayout()).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: SceKernelSMOption) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                    (SceUid.typeLayout()).writeNative(addr + 8L, value.mPidStack)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.stackSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.priority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.attribute)
                }
            }
    }
}

public data class SceKernelModuleInfo(
    public var size: Int = 0,
    public var nSegment: UByte = 0u,
    public var reserved: UByteArray = UByteArray(3),
    public var segmentAddr: IntArray = IntArray(4),
    public var segmentSize: IntArray = IntArray(4),
    public var entryAddr: UInt = 0u,
    public var gpValue: UInt = 0u,
    public var textAddr: UInt = 0u,
    public var textSize: UInt = 0u,
    public var dataSize: UInt = 0u,
    public var bssSize: UInt = 0u,
    public var attribute: UShort = 0u,
    public var version: UByteArray = UByteArray(2),
    public var name: UByteArray = UByteArray(28),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceKernelModuleInfo) return false
        if (this.size != other.size) return false
        if (this.nSegment != other.nSegment) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        if (!this.segmentAddr.contentEquals(other.segmentAddr)) return false
        if (!this.segmentSize.contentEquals(other.segmentSize)) return false
        if (this.entryAddr != other.entryAddr) return false
        if (this.gpValue != other.gpValue) return false
        if (this.textAddr != other.textAddr) return false
        if (this.textSize != other.textSize) return false
        if (this.dataSize != other.dataSize) return false
        if (this.bssSize != other.bssSize) return false
        if (this.attribute != other.attribute) return false
        if (!this.version.contentEquals(other.version)) return false
        if (!this.name.contentEquals(other.name)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.nSegment.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        result = 31 * result + this.segmentAddr.contentHashCode()
        result = 31 * result + this.segmentSize.contentHashCode()
        result = 31 * result + this.entryAddr.hashCode()
        result = 31 * result + this.gpValue.hashCode()
        result = 31 * result + this.textAddr.hashCode()
        result = 31 * result + this.textSize.hashCode()
        result = 31 * result + this.dataSize.hashCode()
        result = 31 * result + this.bssSize.hashCode()
        result = 31 * result + this.attribute.hashCode()
        result = 31 * result + this.version.contentHashCode()
        result = 31 * result + this.name.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelModuleInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelModuleInfo> {
                override val sizeBytes: Long = 104L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceKernelModuleInfo =
                    SceKernelModuleInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 9L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (4).toInt())
                        ).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (4).toInt())
                        ).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 68L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 70L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (28).toInt())
                        ).readNative(addr + 72L),
                    )
                override fun writeNative(addr: Long, value: SceKernelModuleInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 8L, value.nSegment)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 9L, value.reserved)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (4).toInt())
                    ).writeNative(addr + 12L, value.segmentAddr)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (4).toInt())
                    ).writeNative(addr + 28L, value.segmentSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.entryAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.gpValue)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.textAddr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.textSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.dataSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.bssSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 68L, value.attribute)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 70L, value.version)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (28).toInt())
                    ).writeNative(addr + 72L, value.name)
                }
            }
    }
}

public class DebugProfilerRegs(
    public var enable: UInt = 0u,
    public var systemck: UInt = 0u,
    public var cpuck: UInt = 0u,
    public var internal: UInt = 0u,
    public var memory: UInt = 0u,
    public var copz: UInt = 0u,
    public var vfpu: UInt = 0u,
    public var sleep: UInt = 0u,
    public var busAccess: UInt = 0u,
    public var uncachedLoad: UInt = 0u,
    public var uncachedStore: UInt = 0u,
    public var cachedLoad: UInt = 0u,
    public var cachedStore: UInt = 0u,
    public var iMiss: UInt = 0u,
    public var dMiss: UInt = 0u,
    public var dWriteback: UInt = 0u,
    public var cop0Inst: UInt = 0u,
    public var fpuInst: UInt = 0u,
    public var vfpuInst: UInt = 0u,
    public var localBus: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugProfilerRegs> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<DebugProfilerRegs> {
                override val sizeBytes: Long = 80L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): DebugProfilerRegs =
                    DebugProfilerRegs(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 60L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 72L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 76L),
                    )
                override fun writeNative(addr: Long, value: DebugProfilerRegs) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.enable)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.systemck)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.cpuck)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.internal)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.memory)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.copz)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.vfpu)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.sleep)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 32L, value.busAccess)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.uncachedLoad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.uncachedStore)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.cachedLoad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.cachedStore)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 52L, value.iMiss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 56L, value.dMiss)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 60L, value.dWriteback)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 64L, value.cop0Inst)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 68L, value.fpuInst)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 72L, value.vfpuInst)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 76L, value.localBus)
                }
            }
    }
}

public data class SceKernelSysClock(
    public var low: UInt = 0u,
    public var hi: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelSysClock> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelSysClock> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SceKernelSysClock =
                    SceKernelSysClock(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SceKernelSysClock) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.low)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.hi)
                }
            }
    }
}

public data class SceKernelThreadOptParam(
    public var size: Int = 0,
    public var stackMpid: SceUid = SceUid(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelThreadOptParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelThreadOptParam> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceKernelThreadOptParam =
                    SceKernelThreadOptParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (SceUid.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SceKernelThreadOptParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                    (SceUid.typeLayout()).writeNative(addr + 8L, value.stackMpid)
                }
            }
    }
}

public class SceKernelThreadInfo internal constructor(
    public var size: Int,
    public var name: UByteArray,
    public var attr: UInt,
    public var status: Int,
    public var entry: SceKernelThreadEntry,
    stackCtorArg: MutPtr<CVoid>,
    public var stackSize: Int,
    gpRegCtorArg: MutPtr<CVoid>,
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
) {
    public var stack: MutPtr<CVoid> = stackCtorArg
        internal set

    public var gpReg: MutPtr<CVoid> = gpRegCtorArg
        internal set

    public constructor() : this(
        size = 0,
        name = UByteArray(32),
        attr = 0u,
        status = 0,
        entry = SceKernelThreadEntry { _, _ -> 0 },
        stackCtorArg = MutPtr(0L),
        stackSize = 0,
        gpRegCtorArg = MutPtr(0L),
        initPriority = 0,
        currentPriority = 0,
        waitType = 0,
        waitId = SceUid(),
        wakeupCount = 0,
        exitStatus = 0,
        runClocks = SceKernelSysClock(),
        intrPreemptCount = 0u,
        threadPreemptCount = 0u,
        releaseCount = 0u,
    )

    public companion object {
        public operator fun invoke(
            size: Int = 0,
            name: UByteArray = UByteArray(32),
            attr: UInt = 0u,
            status: Int = 0,
            entry: SceKernelThreadEntry = SceKernelThreadEntry { _, _ -> 0 },
            stack: MutPtr<CVoid> = MutPtr(0L),
            stackSize: Int = 0,
            gpReg: MutPtr<CVoid> = MutPtr(0L),
            initPriority: Int = 0,
            currentPriority: Int = 0,
            waitType: Int = 0,
            waitId: SceUid = SceUid(),
            wakeupCount: Int = 0,
            exitStatus: Int = 0,
            runClocks: SceKernelSysClock = SceKernelSysClock(),
            intrPreemptCount: UInt = 0u,
            threadPreemptCount: UInt = 0u,
            releaseCount: UInt = 0u,
        ): SceKernelThreadInfo =
            SceKernelThreadInfo(
                size = size,
                name = name,
                attr = attr,
                status = status,
                entry = entry,
                stackCtorArg = stack,
                stackSize = stackSize,
                gpRegCtorArg = gpReg,
                initPriority = initPriority,
                currentPriority = currentPriority,
                waitType = waitType,
                waitId = waitId,
                wakeupCount = wakeupCount,
                exitStatus = exitStatus,
                runClocks = runClocks,
                intrPreemptCount = intrPreemptCount,
                threadPreemptCount = threadPreemptCount,
                releaseCount = releaseCount,
            )
    }
}

public data class SceKernelThreadRunStatus(
    public var size: Int = 0,
    public var status: Int = 0,
    public var currentPriority: Int = 0,
    public var waitType: Int = 0,
    public var waitId: Int = 0,
    public var wakeupCount: Int = 0,
    public var runClocks: SceKernelSysClock = SceKernelSysClock(),
    public var intrPreemptCount: UInt = 0u,
    public var threadPreemptCount: UInt = 0u,
    public var releaseCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelThreadRunStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelThreadRunStatus> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceKernelThreadRunStatus =
                    SceKernelThreadRunStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (SceKernelSysClock.typeLayout()).readNative(addr + 28L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 36L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                    )
                override fun writeNative(addr: Long, value: SceKernelThreadRunStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.status)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.currentPriority)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 16L, value.waitType)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 20L, value.waitId)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.wakeupCount)
                    (SceKernelSysClock.typeLayout()).writeNative(addr + 28L, value.runClocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 36L, value.intrPreemptCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.threadPreemptCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.releaseCount)
                }
            }
    }
}

public data class SceKernelSemaOptParam(
    public var size: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelSemaOptParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelSemaOptParam> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceKernelSemaOptParam =
                    SceKernelSemaOptParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SceKernelSemaOptParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                }
            }
    }
}

public data class SceKernelSemaInfo(
    public var size: Int = 0,
    public var name: UByteArray = UByteArray(32),
    public var attr: UInt = 0u,
    public var initCount: Int = 0,
    public var currentCount: Int = 0,
    public var maxCount: Int = 0,
    public var numWaitThreads: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceKernelSemaInfo) return false
        if (this.size != other.size) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.attr != other.attr) return false
        if (this.initCount != other.initCount) return false
        if (this.currentCount != other.currentCount) return false
        if (this.maxCount != other.maxCount) return false
        if (this.numWaitThreads != other.numWaitThreads) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.attr.hashCode()
        result = 31 * result + this.initCount.hashCode()
        result = 31 * result + this.currentCount.hashCode()
        result = 31 * result + this.maxCount.hashCode()
        result = 31 * result + this.numWaitThreads.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelSemaInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelSemaInfo> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceKernelSemaInfo =
                    SceKernelSemaInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: SceKernelSemaInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 8L, value.name)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.attr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.initCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.currentCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.maxCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.numWaitThreads)
                }
            }
    }
}

public data class SceKernelEventFlagInfo(
    public var size: Int = 0,
    public var name: UByteArray = UByteArray(32),
    public var attr: UInt = 0u,
    public var initPattern: UInt = 0u,
    public var currentPattern: UInt = 0u,
    public var numWaitThreads: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceKernelEventFlagInfo) return false
        if (this.size != other.size) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.attr != other.attr) return false
        if (this.initPattern != other.initPattern) return false
        if (this.currentPattern != other.currentPattern) return false
        if (this.numWaitThreads != other.numWaitThreads) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.attr.hashCode()
        result = 31 * result + this.initPattern.hashCode()
        result = 31 * result + this.currentPattern.hashCode()
        result = 31 * result + this.numWaitThreads.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelEventFlagInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelEventFlagInfo> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceKernelEventFlagInfo =
                    SceKernelEventFlagInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: SceKernelEventFlagInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 8L, value.name)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.attr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 44L, value.initPattern)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 48L, value.currentPattern)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.numWaitThreads)
                }
            }
    }
}

public data class SceKernelEventFlagOptParam(
    public var size: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelEventFlagOptParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelEventFlagOptParam> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceKernelEventFlagOptParam =
                    SceKernelEventFlagOptParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SceKernelEventFlagOptParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                }
            }
    }
}

public data class SceKernelMbxOptParam(
    public var size: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelMbxOptParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelMbxOptParam> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceKernelMbxOptParam =
                    SceKernelMbxOptParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SceKernelMbxOptParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                }
            }
    }
}

public class SceKernelMbxInfo internal constructor(
    public var size: Int,
    public var name: UByteArray,
    public var attr: UInt,
    public var numWaitThreads: Int,
    public var numMessages: Int,
    firstMessageCtorArg: MutPtr<CVoid>,
) {
    public var firstMessage: MutPtr<CVoid> = firstMessageCtorArg
        internal set

    public constructor() : this(
        size = 0,
        name = UByteArray(32),
        attr = 0u,
        numWaitThreads = 0,
        numMessages = 0,
        firstMessageCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.size

    public operator fun component2(): UByteArray = this.name

    public operator fun component3(): UInt = this.attr

    public operator fun component4(): Int = this.numWaitThreads

    public operator fun component5(): Int = this.numMessages

    public operator fun component6(): MutPtr<CVoid> = this.firstMessage

    public fun copy(size: Int = this.size, name: UByteArray = this.name, attr: UInt = this.attr, numWaitThreads: Int = this.numWaitThreads, numMessages: Int = this.numMessages, firstMessage: MutPtr<CVoid> = this.firstMessage): SceKernelMbxInfo = SceKernelMbxInfo(size = size, name = name, attr = attr, numWaitThreads = numWaitThreads, numMessages = numMessages, firstMessageCtorArg = firstMessage)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceKernelMbxInfo) return false
        if (this.size != other.size) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.attr != other.attr) return false
        if (this.numWaitThreads != other.numWaitThreads) return false
        if (this.numMessages != other.numMessages) return false
        if (this.firstMessage != other.firstMessage) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.attr.hashCode()
        result = 31 * result + this.numWaitThreads.hashCode()
        result = 31 * result + this.numMessages.hashCode()
        result = 31 * result + this.firstMessage.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelMbxInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelMbxInfo> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceKernelMbxInfo =
                    SceKernelMbxInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: SceKernelMbxInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 8L, value.name)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.attr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.numWaitThreads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.numMessages)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 56L, value.firstMessage)
                }
            }

        public operator fun invoke(
            size: Int = 0,
            name: UByteArray = UByteArray(32),
            attr: UInt = 0u,
            numWaitThreads: Int = 0,
            numMessages: Int = 0,
            firstMessage: MutPtr<CVoid> = MutPtr(0L),
        ): SceKernelMbxInfo =
            SceKernelMbxInfo(
                size = size,
                name = name,
                attr = attr,
                numWaitThreads = numWaitThreads,
                numMessages = numMessages,
                firstMessageCtorArg = firstMessage,
            )
    }
}

public class SceKernelVTimerInfo internal constructor(
    public var size: Int,
    public var name: UByteArray,
    public var active: Int,
    public var base: SceKernelSysClock,
    public var current: SceKernelSysClock,
    public var schedule: SceKernelSysClock,
    public var handler: SceKernelVTimerHandler,
    commonCtorArg: MutPtr<CVoid>,
) {
    public var common: MutPtr<CVoid> = commonCtorArg
        internal set

    public constructor() : this(
        size = 0,
        name = UByteArray(32),
        active = 0,
        base = SceKernelSysClock(),
        current = SceKernelSysClock(),
        schedule = SceKernelSysClock(),
        handler = SceKernelVTimerHandler { _, _, _, _ -> 0u },
        commonCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.size

    public operator fun component2(): UByteArray = this.name

    public operator fun component3(): Int = this.active

    public operator fun component4(): SceKernelSysClock = this.base

    public operator fun component5(): SceKernelSysClock = this.current

    public operator fun component6(): SceKernelSysClock = this.schedule

    public operator fun component7(): SceKernelVTimerHandler = this.handler

    public operator fun component8(): MutPtr<CVoid> = this.common

    public fun copy(size: Int = this.size, name: UByteArray = this.name, active: Int = this.active, base: SceKernelSysClock = this.base, current: SceKernelSysClock = this.current, schedule: SceKernelSysClock = this.schedule, handler: SceKernelVTimerHandler = this.handler, common: MutPtr<CVoid> = this.common): SceKernelVTimerInfo = SceKernelVTimerInfo(size = size, name = name, active = active, base = base, current = current, schedule = schedule, handler = handler, commonCtorArg = common)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceKernelVTimerInfo) return false
        if (this.size != other.size) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.active != other.active) return false
        if (this.base != other.base) return false
        if (this.current != other.current) return false
        if (this.schedule != other.schedule) return false
        if (this.handler != other.handler) return false
        if (this.common != other.common) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.active.hashCode()
        result = 31 * result + this.base.hashCode()
        result = 31 * result + this.current.hashCode()
        result = 31 * result + this.schedule.hashCode()
        result = 31 * result + this.handler.hashCode()
        result = 31 * result + this.common.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: Int = 0,
            name: UByteArray = UByteArray(32),
            active: Int = 0,
            base: SceKernelSysClock = SceKernelSysClock(),
            current: SceKernelSysClock = SceKernelSysClock(),
            schedule: SceKernelSysClock = SceKernelSysClock(),
            handler: SceKernelVTimerHandler = SceKernelVTimerHandler { _, _, _, _ -> 0u },
            common: MutPtr<CVoid> = MutPtr(0L),
        ): SceKernelVTimerInfo =
            SceKernelVTimerInfo(
                size = size,
                name = name,
                active = active,
                base = base,
                current = current,
                schedule = schedule,
                handler = handler,
                commonCtorArg = common,
            )
    }
}

public class SceKernelThreadEventHandlerInfo internal constructor(
    public var size: Int,
    public var name: UByteArray,
    public var threadId: SceUid,
    public var mask: Int,
    public var handler: SceKernelThreadEventHandler,
    commonCtorArg: MutPtr<CVoid>,
) {
    public var common: MutPtr<CVoid> = commonCtorArg
        internal set

    public constructor() : this(
        size = 0,
        name = UByteArray(32),
        threadId = SceUid(),
        mask = 0,
        handler = SceKernelThreadEventHandler { _, _, _ -> 0 },
        commonCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.size

    public operator fun component2(): UByteArray = this.name

    public operator fun component3(): SceUid = this.threadId

    public operator fun component4(): Int = this.mask

    public operator fun component5(): SceKernelThreadEventHandler = this.handler

    public operator fun component6(): MutPtr<CVoid> = this.common

    public fun copy(size: Int = this.size, name: UByteArray = this.name, threadId: SceUid = this.threadId, mask: Int = this.mask, handler: SceKernelThreadEventHandler = this.handler, common: MutPtr<CVoid> = this.common): SceKernelThreadEventHandlerInfo = SceKernelThreadEventHandlerInfo(size = size, name = name, threadId = threadId, mask = mask, handler = handler, commonCtorArg = common)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceKernelThreadEventHandlerInfo) return false
        if (this.size != other.size) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.threadId != other.threadId) return false
        if (this.mask != other.mask) return false
        if (this.handler != other.handler) return false
        if (this.common != other.common) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.threadId.hashCode()
        result = 31 * result + this.mask.hashCode()
        result = 31 * result + this.handler.hashCode()
        result = 31 * result + this.common.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: Int = 0,
            name: UByteArray = UByteArray(32),
            threadId: SceUid = SceUid(),
            mask: Int = 0,
            handler: SceKernelThreadEventHandler = SceKernelThreadEventHandler { _, _, _ -> 0 },
            common: MutPtr<CVoid> = MutPtr(0L),
        ): SceKernelThreadEventHandlerInfo =
            SceKernelThreadEventHandlerInfo(
                size = size,
                name = name,
                threadId = threadId,
                mask = mask,
                handler = handler,
                commonCtorArg = common,
            )
    }
}

public class SceKernelAlarmInfo internal constructor(
    public var size: Int,
    public var schedule: SceKernelSysClock,
    public var handler: SceKernelAlarmHandler,
    commonCtorArg: MutPtr<CVoid>,
) {
    public var common: MutPtr<CVoid> = commonCtorArg
        internal set

    public constructor() : this(
        size = 0,
        schedule = SceKernelSysClock(),
        handler = SceKernelAlarmHandler { _ -> 0u },
        commonCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.size

    public operator fun component2(): SceKernelSysClock = this.schedule

    public operator fun component3(): SceKernelAlarmHandler = this.handler

    public operator fun component4(): MutPtr<CVoid> = this.common

    public fun copy(size: Int = this.size, schedule: SceKernelSysClock = this.schedule, handler: SceKernelAlarmHandler = this.handler, common: MutPtr<CVoid> = this.common): SceKernelAlarmInfo = SceKernelAlarmInfo(size = size, schedule = schedule, handler = handler, commonCtorArg = common)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceKernelAlarmInfo) return false
        if (this.size != other.size) return false
        if (this.schedule != other.schedule) return false
        if (this.handler != other.handler) return false
        if (this.common != other.common) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.schedule.hashCode()
        result = 31 * result + this.handler.hashCode()
        result = 31 * result + this.common.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: Int = 0,
            schedule: SceKernelSysClock = SceKernelSysClock(),
            handler: SceKernelAlarmHandler = SceKernelAlarmHandler { _ -> 0u },
            common: MutPtr<CVoid> = MutPtr(0L),
        ): SceKernelAlarmInfo =
            SceKernelAlarmInfo(
                size = size,
                schedule = schedule,
                handler = handler,
                commonCtorArg = common,
            )
    }
}

public data class SceKernelSystemStatus(
    public var size: Int = 0,
    public var status: UInt = 0u,
    public var idleClocks: SceKernelSysClock = SceKernelSysClock(),
    public var comesOutOfIdleCount: UInt = 0u,
    public var threadSwitchCount: UInt = 0u,
    public var vfpuSwitchCount: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelSystemStatus> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelSystemStatus> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceKernelSystemStatus =
                    SceKernelSystemStatus(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (SceKernelSysClock.typeLayout()).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 24L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: SceKernelSystemStatus) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.status)
                    (SceKernelSysClock.typeLayout()).writeNative(addr + 12L, value.idleClocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.comesOutOfIdleCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 24L, value.threadSwitchCount)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 28L, value.vfpuSwitchCount)
                }
            }
    }
}

public data class SceKernelMppInfo(
    public var size: Int = 0,
    public var name: UByteArray = UByteArray(32),
    public var attr: UInt = 0u,
    public var bufSize: Int = 0,
    public var freeSize: Int = 0,
    public var numSendWaitThreads: Int = 0,
    public var numReceiveWaitThreads: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceKernelMppInfo) return false
        if (this.size != other.size) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.attr != other.attr) return false
        if (this.bufSize != other.bufSize) return false
        if (this.freeSize != other.freeSize) return false
        if (this.numSendWaitThreads != other.numSendWaitThreads) return false
        if (this.numReceiveWaitThreads != other.numReceiveWaitThreads) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.attr.hashCode()
        result = 31 * result + this.bufSize.hashCode()
        result = 31 * result + this.freeSize.hashCode()
        result = 31 * result + this.numSendWaitThreads.hashCode()
        result = 31 * result + this.numReceiveWaitThreads.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelMppInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelMppInfo> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceKernelMppInfo =
                    SceKernelMppInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: SceKernelMppInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 8L, value.name)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.attr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.bufSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.freeSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.numSendWaitThreads)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.numReceiveWaitThreads)
                }
            }
    }
}

public data class SceKernelVplOptParam(
    public var size: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelVplOptParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelVplOptParam> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceKernelVplOptParam =
                    SceKernelVplOptParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SceKernelVplOptParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                }
            }
    }
}

public data class SceKernelVplInfo(
    public var size: Int = 0,
    public var name: UByteArray = UByteArray(32),
    public var attr: UInt = 0u,
    public var poolSize: Int = 0,
    public var freeSize: Int = 0,
    public var numWaitThreads: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceKernelVplInfo) return false
        if (this.size != other.size) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.attr != other.attr) return false
        if (this.poolSize != other.poolSize) return false
        if (this.freeSize != other.freeSize) return false
        if (this.numWaitThreads != other.numWaitThreads) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.attr.hashCode()
        result = 31 * result + this.poolSize.hashCode()
        result = 31 * result + this.freeSize.hashCode()
        result = 31 * result + this.numWaitThreads.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelVplInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelVplInfo> {
                override val sizeBytes: Long = 56L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceKernelVplInfo =
                    SceKernelVplInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                    )
                override fun writeNative(addr: Long, value: SceKernelVplInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 8L, value.name)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.attr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.poolSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.freeSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.numWaitThreads)
                }
            }
    }
}

public data class SceKernelFplOptParam(
    public var size: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelFplOptParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelFplOptParam> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceKernelFplOptParam =
                    SceKernelFplOptParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SceKernelFplOptParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                }
            }
    }
}

public data class SceKernelFplInfo(
    public var size: Int = 0,
    public var name: UByteArray = UByteArray(32),
    public var attr: UInt = 0u,
    public var blockSize: Int = 0,
    public var numBlocks: Int = 0,
    public var freeBlocks: Int = 0,
    public var numWaitThreads: Int = 0,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceKernelFplInfo) return false
        if (this.size != other.size) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.attr != other.attr) return false
        if (this.blockSize != other.blockSize) return false
        if (this.numBlocks != other.numBlocks) return false
        if (this.freeBlocks != other.freeBlocks) return false
        if (this.numWaitThreads != other.numWaitThreads) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.attr.hashCode()
        result = 31 * result + this.blockSize.hashCode()
        result = 31 * result + this.numBlocks.hashCode()
        result = 31 * result + this.freeBlocks.hashCode()
        result = 31 * result + this.numWaitThreads.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelFplInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelFplInfo> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceKernelFplInfo =
                    SceKernelFplInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                        ).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 40L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 44L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 48L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 52L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 56L),
                    )
                override fun writeNative(addr: Long, value: SceKernelFplInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (32).toInt())
                    ).writeNative(addr + 8L, value.name)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 40L, value.attr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 44L, value.blockSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 48L, value.numBlocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 52L, value.freeBlocks)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 56L, value.numWaitThreads)
                }
            }
    }
}

public data class SceKernelVTimerOptParam(
    public var size: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelVTimerOptParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelVTimerOptParam> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceKernelVTimerOptParam =
                    SceKernelVTimerOptParam(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: SceKernelVTimerOptParam) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr, value.size)
                }
            }
    }
}

public class SceKernelCallbackInfo internal constructor(
    public var size: Int,
    public var name: UByteArray,
    public var threadId: SceUid,
    public var callback: SceKernelCallbackFunction,
    commonCtorArg: MutPtr<CVoid>,
    public var notifyCount: Int,
    public var notifyArg: Int,
) {
    public var common: MutPtr<CVoid> = commonCtorArg
        internal set

    public constructor() : this(
        size = 0,
        name = UByteArray(32),
        threadId = SceUid(),
        callback = SceKernelCallbackFunction { _, _, _ -> 0 },
        commonCtorArg = MutPtr(0L),
        notifyCount = 0,
        notifyArg = 0,
    )

    public operator fun component1(): Int = this.size

    public operator fun component2(): UByteArray = this.name

    public operator fun component3(): SceUid = this.threadId

    public operator fun component4(): SceKernelCallbackFunction = this.callback

    public operator fun component5(): MutPtr<CVoid> = this.common

    public operator fun component6(): Int = this.notifyCount

    public operator fun component7(): Int = this.notifyArg

    public fun copy(size: Int = this.size, name: UByteArray = this.name, threadId: SceUid = this.threadId, callback: SceKernelCallbackFunction = this.callback, common: MutPtr<CVoid> = this.common, notifyCount: Int = this.notifyCount, notifyArg: Int = this.notifyArg): SceKernelCallbackInfo = SceKernelCallbackInfo(size = size, name = name, threadId = threadId, callback = callback, commonCtorArg = common, notifyCount = notifyCount, notifyArg = notifyArg)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceKernelCallbackInfo) return false
        if (this.size != other.size) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.threadId != other.threadId) return false
        if (this.callback != other.callback) return false
        if (this.common != other.common) return false
        if (this.notifyCount != other.notifyCount) return false
        if (this.notifyArg != other.notifyArg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.threadId.hashCode()
        result = 31 * result + this.callback.hashCode()
        result = 31 * result + this.common.hashCode()
        result = 31 * result + this.notifyCount.hashCode()
        result = 31 * result + this.notifyArg.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            size: Int = 0,
            name: UByteArray = UByteArray(32),
            threadId: SceUid = SceUid(),
            callback: SceKernelCallbackFunction = SceKernelCallbackFunction { _, _, _ -> 0 },
            common: MutPtr<CVoid> = MutPtr(0L),
            notifyCount: Int = 0,
            notifyArg: Int = 0,
        ): SceKernelCallbackInfo =
            SceKernelCallbackInfo(
                size = size,
                name = name,
                threadId = threadId,
                callback = callback,
                commonCtorArg = common,
                notifyCount = notifyCount,
                notifyArg = notifyArg,
            )
    }
}

public data class UsbCamSetupStillParam(
    public var size: Int = 0,
    public var resolution: UsbCamResolution = UsbCamResolution.entries.first(),
    public var jpegSize: Int = 0,
    public var reverseFlags: Int = 0,
    public var delay: UsbCamDelay = UsbCamDelay.entries.first(),
    public var compLevel: Int = 0,
)

public data class UsbCamSetupStillExParam(
    public var size: Int = 0,
    public var unk: UInt = 0u,
    public var resolution: UsbCamResolutionEx = UsbCamResolutionEx.entries.first(),
    public var jpegSize: Int = 0,
    public var compLevel: Int = 0,
    public var unk2: UInt = 0u,
    public var unk3: UInt = 0u,
    public var flip: Int = 0,
    public var mirror: Int = 0,
    public var delay: UsbCamDelay = UsbCamDelay.entries.first(),
    public var unk4: UIntArray = UIntArray(5),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UsbCamSetupStillExParam) return false
        if (this.size != other.size) return false
        if (this.unk != other.unk) return false
        if (this.resolution != other.resolution) return false
        if (this.jpegSize != other.jpegSize) return false
        if (this.compLevel != other.compLevel) return false
        if (this.unk2 != other.unk2) return false
        if (this.unk3 != other.unk3) return false
        if (this.flip != other.flip) return false
        if (this.mirror != other.mirror) return false
        if (this.delay != other.delay) return false
        if (!this.unk4.contentEquals(other.unk4)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.unk.hashCode()
        result = 31 * result + this.resolution.hashCode()
        result = 31 * result + this.jpegSize.hashCode()
        result = 31 * result + this.compLevel.hashCode()
        result = 31 * result + this.unk2.hashCode()
        result = 31 * result + this.unk3.hashCode()
        result = 31 * result + this.flip.hashCode()
        result = 31 * result + this.mirror.hashCode()
        result = 31 * result + this.delay.hashCode()
        result = 31 * result + this.unk4.contentHashCode()
        return result
    }
}

public data class UsbCamSetupVideoParam(
    public var size: Int = 0,
    public var resolution: UsbCamResolution = UsbCamResolution.entries.first(),
    public var framerate: UsbCamFrameRate = UsbCamFrameRate.entries.first(),
    public var whiteBalance: UsbCamWb = UsbCamWb.entries.first(),
    public var saturation: Int = 0,
    public var brightness: Int = 0,
    public var contrast: Int = 0,
    public var sharpness: Int = 0,
    public var effectMode: UsbCamEffectMode = UsbCamEffectMode.entries.first(),
    public var frameSize: Int = 0,
    public var unk: UInt = 0u,
    public var evlEvel: UsbCamEvLevel = UsbCamEvLevel.entries.first(),
)

public class UsbCamSetupVideoExParam(
    public var size: Int = 0,
    public var unk: UInt = 0u,
    public var resolution: UsbCamResolutionEx = UsbCamResolutionEx.entries.first(),
    public var framerate: UsbCamFrameRate = UsbCamFrameRate.entries.first(),
    public var unk2: UInt = 0u,
    public var unk3: UInt = 0u,
    public var whiteBalance: UsbCamWb = UsbCamWb.entries.first(),
    public var saturation: Int = 0,
    public var brightness: Int = 0,
    public var contrast: Int = 0,
    public var sharpness: Int = 0,
    public var unk4: UInt = 0u,
    public var unk5: UInt = 0u,
    public var unk6: UIntArray = UIntArray(3),
    public var effectMode: UsbCamEffectMode = UsbCamEffectMode.entries.first(),
    public var unk7: UInt = 0u,
    public var unk8: UInt = 0u,
    public var unk9: UInt = 0u,
    public var unk10: UInt = 0u,
    public var unk11: UInt = 0u,
    public var frameSize: Int = 0,
    public var unk12: UInt = 0u,
    public var evLevel: UsbCamEvLevel = UsbCamEvLevel.entries.first(),
)

public data class ScePspDateTime(
    public var year: UShort = 0u,
    public var month: UShort = 0u,
    public var day: UShort = 0u,
    public var hour: UShort = 0u,
    public var minutes: UShort = 0u,
    public var seconds: UShort = 0u,
    public var microseconds: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspDateTime> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspDateTime> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ScePspDateTime =
                    ScePspDateTime(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 6L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 10L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ScePspDateTime) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr, value.year)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 2L, value.month)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 4L, value.day)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 6L, value.hour)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 8L, value.minutes)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 10L, value.seconds)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.microseconds)
                }
            }
    }
}

public data class SceIoStat(
    public var stMode: Int = 0,
    public var stAttr: Int = 0,
    public var stSize: Long = 0L,
    public var stCtime: ScePspDateTime = ScePspDateTime(),
    public var stAtime: ScePspDateTime = ScePspDateTime(),
    public var stMtime: ScePspDateTime = ScePspDateTime(),
    public var stPrivate: UIntArray = UIntArray(6),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceIoStat) return false
        if (this.stMode != other.stMode) return false
        if (this.stAttr != other.stAttr) return false
        if (this.stSize != other.stSize) return false
        if (this.stCtime != other.stCtime) return false
        if (this.stAtime != other.stAtime) return false
        if (this.stMtime != other.stMtime) return false
        if (!this.stPrivate.contentEquals(other.stPrivate)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.stMode.hashCode()
        result = 31 * result + this.stAttr.hashCode()
        result = 31 * result + this.stSize.hashCode()
        result = 31 * result + this.stCtime.hashCode()
        result = 31 * result + this.stAtime.hashCode()
        result = 31 * result + this.stMtime.hashCode()
        result = 31 * result + this.stPrivate.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceIoStat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceIoStat> {
                override val sizeBytes: Long = 88L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceIoStat =
                    SceIoStat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).readNative(addr + 8L),
                        (ScePspDateTime.typeLayout()).readNative(addr + 16L),
                        (ScePspDateTime.typeLayout()).readNative(addr + 32L),
                        (ScePspDateTime.typeLayout()).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (6).toInt())
                        ).readNative(addr + 64L),
                    )
                override fun writeNative(addr: Long, value: SceIoStat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.stMode)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.stAttr)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I64).writeNative(addr + 8L, value.stSize)
                    (ScePspDateTime.typeLayout()).writeNative(addr + 16L, value.stCtime)
                    (ScePspDateTime.typeLayout()).writeNative(addr + 32L, value.stAtime)
                    (ScePspDateTime.typeLayout()).writeNative(addr + 48L, value.stMtime)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (6).toInt())
                    ).writeNative(addr + 64L, value.stPrivate)
                }
            }
    }
}

public data class UmdInfo(
    public var size: UInt = 0u,
    public var type: UmdType = UmdType.entries.first(),
)

public class SceMpegRingbuffer internal constructor(
    public var packets: Int,
    public var unk0: UInt,
    public var unk1: UInt,
    public var unk2: UInt,
    public var unk3: UInt,
    dataCtorArg: MutPtr<CVoid>,
    public var callback: SceMpegRingbufferCb,
    cbParamCtorArg: MutPtr<CVoid>,
    public var unk4: UInt,
    public var unk5: UInt,
    sceMpegCtorArg: MutPtr<CVoid>,
) {
    public var data: MutPtr<CVoid> = dataCtorArg
        internal set

    public var cbParam: MutPtr<CVoid> = cbParamCtorArg
        internal set

    public var sceMpeg: MutPtr<CVoid> = sceMpegCtorArg
        internal set

    public constructor() : this(
        packets = 0,
        unk0 = 0u,
        unk1 = 0u,
        unk2 = 0u,
        unk3 = 0u,
        dataCtorArg = MutPtr(0L),
        callback = null,
        cbParamCtorArg = MutPtr(0L),
        unk4 = 0u,
        unk5 = 0u,
        sceMpegCtorArg = MutPtr(0L),
    )

    public operator fun component1(): Int = this.packets

    public operator fun component2(): UInt = this.unk0

    public operator fun component3(): UInt = this.unk1

    public operator fun component4(): UInt = this.unk2

    public operator fun component5(): UInt = this.unk3

    public operator fun component6(): MutPtr<CVoid> = this.data

    public operator fun component7(): SceMpegRingbufferCb = this.callback

    public operator fun component8(): MutPtr<CVoid> = this.cbParam

    public operator fun component9(): UInt = this.unk4

    public operator fun component10(): UInt = this.unk5

    public operator fun component11(): MutPtr<CVoid> = this.sceMpeg

    public fun copy(packets: Int = this.packets, unk0: UInt = this.unk0, unk1: UInt = this.unk1, unk2: UInt = this.unk2, unk3: UInt = this.unk3, data: MutPtr<CVoid> = this.data, callback: SceMpegRingbufferCb = this.callback, cbParam: MutPtr<CVoid> = this.cbParam, unk4: UInt = this.unk4, unk5: UInt = this.unk5, sceMpeg: MutPtr<CVoid> = this.sceMpeg): SceMpegRingbuffer = SceMpegRingbuffer(packets = packets, unk0 = unk0, unk1 = unk1, unk2 = unk2, unk3 = unk3, dataCtorArg = data, callback = callback, cbParamCtorArg = cbParam, unk4 = unk4, unk5 = unk5, sceMpegCtorArg = sceMpeg)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceMpegRingbuffer) return false
        if (this.packets != other.packets) return false
        if (this.unk0 != other.unk0) return false
        if (this.unk1 != other.unk1) return false
        if (this.unk2 != other.unk2) return false
        if (this.unk3 != other.unk3) return false
        if (this.data != other.data) return false
        if (this.callback != other.callback) return false
        if (this.cbParam != other.cbParam) return false
        if (this.unk4 != other.unk4) return false
        if (this.unk5 != other.unk5) return false
        if (this.sceMpeg != other.sceMpeg) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.packets.hashCode()
        result = 31 * result + this.unk0.hashCode()
        result = 31 * result + this.unk1.hashCode()
        result = 31 * result + this.unk2.hashCode()
        result = 31 * result + this.unk3.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.callback.hashCode()
        result = 31 * result + this.cbParam.hashCode()
        result = 31 * result + this.unk4.hashCode()
        result = 31 * result + this.unk5.hashCode()
        result = 31 * result + this.sceMpeg.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            packets: Int = 0,
            unk0: UInt = 0u,
            unk1: UInt = 0u,
            unk2: UInt = 0u,
            unk3: UInt = 0u,
            data: MutPtr<CVoid> = MutPtr(0L),
            callback: SceMpegRingbufferCb = null,
            cbParam: MutPtr<CVoid> = MutPtr(0L),
            unk4: UInt = 0u,
            unk5: UInt = 0u,
            sceMpeg: MutPtr<CVoid> = MutPtr(0L),
        ): SceMpegRingbuffer =
            SceMpegRingbuffer(
                packets = packets,
                unk0 = unk0,
                unk1 = unk1,
                unk2 = unk2,
                unk3 = unk3,
                dataCtorArg = data,
                callback = callback,
                cbParamCtorArg = cbParam,
                unk4 = unk4,
                unk5 = unk5,
                sceMpegCtorArg = sceMpeg,
            )
    }
}

public data class SceMpegAu(
    public var ptsMsb: UInt = 0u,
    public var pts: UInt = 0u,
    public var dtsMsb: UInt = 0u,
    public var dts: UInt = 0u,
    public var esBuffer: UInt = 0u,
    public var auSize: UInt = 0u,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceMpegAu> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceMpegAu> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SceMpegAu =
                    SceMpegAu(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: SceMpegAu) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.ptsMsb)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.pts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.dtsMsb)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.dts)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.esBuffer)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.auSize)
                }
            }
    }
}

public data class SceMpegAvcMode(
    public var unk0: Int = 0,
    public var pixelFormat: DisplayPixelFormat = DisplayPixelFormat.entries.first(),
)

public class SceMpegLLI internal constructor(
    srcCtorArg: MutPtr<CVoid>,
    dstCtorArg: MutPtr<CVoid>,
    nextCtorArg: MutPtr<CVoid>,
    public var size: Int,
) {
    public var src: MutPtr<CVoid> = srcCtorArg
        internal set

    public var dst: MutPtr<CVoid> = dstCtorArg
        internal set

    public var next: MutPtr<CVoid> = nextCtorArg
        internal set

    public constructor() : this(
        srcCtorArg = MutPtr(0L),
        dstCtorArg = MutPtr(0L),
        nextCtorArg = MutPtr(0L),
        size = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.src

    public operator fun component2(): MutPtr<CVoid> = this.dst

    public operator fun component3(): MutPtr<CVoid> = this.next

    public operator fun component4(): Int = this.size

    public fun copy(src: MutPtr<CVoid> = this.src, dst: MutPtr<CVoid> = this.dst, next: MutPtr<CVoid> = this.next, size: Int = this.size): SceMpegLLI = SceMpegLLI(srcCtorArg = src, dstCtorArg = dst, nextCtorArg = next, size = size)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceMpegLLI) return false
        if (this.src != other.src) return false
        if (this.dst != other.dst) return false
        if (this.next != other.next) return false
        if (this.size != other.size) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.src.hashCode()
        result = 31 * result + this.dst.hashCode()
        result = 31 * result + this.next.hashCode()
        result = 31 * result + this.size.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceMpegLLI> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceMpegLLI> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 64L
                override fun readNative(addr: Long): SceMpegLLI =
                    SceMpegLLI(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: SceMpegLLI) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.src)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 8L, value.dst)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.next)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.size)
                }
            }

        public operator fun invoke(
            src: MutPtr<CVoid> = MutPtr(0L),
            dst: MutPtr<CVoid> = MutPtr(0L),
            next: MutPtr<CVoid> = MutPtr(0L),
            size: Int = 0,
        ): SceMpegLLI =
            SceMpegLLI(
                srcCtorArg = src,
                dstCtorArg = dst,
                nextCtorArg = next,
                size = size,
            )
    }
}

public class SceMpegYCrCbBuffer internal constructor(
    public var frameBufferHeight16: Int,
    public var frameBufferWidth16: Int,
    public var unknown: Int,
    public var unknown2: Int,
    yBufferCtorArg: MutPtr<CVoid>,
    yBuffer2CtorArg: MutPtr<CVoid>,
    crBufferCtorArg: MutPtr<CVoid>,
    cbBufferCtorArg: MutPtr<CVoid>,
    crBuffer2CtorArg: MutPtr<CVoid>,
    cbBuffer2CtorArg: MutPtr<CVoid>,
    public var frameHeight: Int,
    public var frameWidth: Int,
    public var frameBufferWidth: Int,
    public var unknown3: IntArray,
) {
    public var yBuffer: MutPtr<CVoid> = yBufferCtorArg
        internal set

    public var yBuffer2: MutPtr<CVoid> = yBuffer2CtorArg
        internal set

    public var crBuffer: MutPtr<CVoid> = crBufferCtorArg
        internal set

    public var cbBuffer: MutPtr<CVoid> = cbBufferCtorArg
        internal set

    public var crBuffer2: MutPtr<CVoid> = crBuffer2CtorArg
        internal set

    public var cbBuffer2: MutPtr<CVoid> = cbBuffer2CtorArg
        internal set

    public constructor() : this(
        frameBufferHeight16 = 0,
        frameBufferWidth16 = 0,
        unknown = 0,
        unknown2 = 0,
        yBufferCtorArg = MutPtr(0L),
        yBuffer2CtorArg = MutPtr(0L),
        crBufferCtorArg = MutPtr(0L),
        cbBufferCtorArg = MutPtr(0L),
        crBuffer2CtorArg = MutPtr(0L),
        cbBuffer2CtorArg = MutPtr(0L),
        frameHeight = 0,
        frameWidth = 0,
        frameBufferWidth = 0,
        unknown3 = IntArray(11),
    )

    public operator fun component1(): Int = this.frameBufferHeight16

    public operator fun component2(): Int = this.frameBufferWidth16

    public operator fun component3(): Int = this.unknown

    public operator fun component4(): Int = this.unknown2

    public operator fun component5(): MutPtr<CVoid> = this.yBuffer

    public operator fun component6(): MutPtr<CVoid> = this.yBuffer2

    public operator fun component7(): MutPtr<CVoid> = this.crBuffer

    public operator fun component8(): MutPtr<CVoid> = this.cbBuffer

    public operator fun component9(): MutPtr<CVoid> = this.crBuffer2

    public operator fun component10(): MutPtr<CVoid> = this.cbBuffer2

    public operator fun component11(): Int = this.frameHeight

    public operator fun component12(): Int = this.frameWidth

    public operator fun component13(): Int = this.frameBufferWidth

    public operator fun component14(): IntArray = this.unknown3

    public fun copy(frameBufferHeight16: Int = this.frameBufferHeight16, frameBufferWidth16: Int = this.frameBufferWidth16, unknown: Int = this.unknown, unknown2: Int = this.unknown2, yBuffer: MutPtr<CVoid> = this.yBuffer, yBuffer2: MutPtr<CVoid> = this.yBuffer2, crBuffer: MutPtr<CVoid> = this.crBuffer, cbBuffer: MutPtr<CVoid> = this.cbBuffer, crBuffer2: MutPtr<CVoid> = this.crBuffer2, cbBuffer2: MutPtr<CVoid> = this.cbBuffer2, frameHeight: Int = this.frameHeight, frameWidth: Int = this.frameWidth, frameBufferWidth: Int = this.frameBufferWidth, unknown3: IntArray = this.unknown3): SceMpegYCrCbBuffer = SceMpegYCrCbBuffer(frameBufferHeight16 = frameBufferHeight16, frameBufferWidth16 = frameBufferWidth16, unknown = unknown, unknown2 = unknown2, yBufferCtorArg = yBuffer, yBuffer2CtorArg = yBuffer2, crBufferCtorArg = crBuffer, cbBufferCtorArg = cbBuffer, crBuffer2CtorArg = crBuffer2, cbBuffer2CtorArg = cbBuffer2, frameHeight = frameHeight, frameWidth = frameWidth, frameBufferWidth = frameBufferWidth, unknown3 = unknown3)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceMpegYCrCbBuffer) return false
        if (this.frameBufferHeight16 != other.frameBufferHeight16) return false
        if (this.frameBufferWidth16 != other.frameBufferWidth16) return false
        if (this.unknown != other.unknown) return false
        if (this.unknown2 != other.unknown2) return false
        if (this.yBuffer != other.yBuffer) return false
        if (this.yBuffer2 != other.yBuffer2) return false
        if (this.crBuffer != other.crBuffer) return false
        if (this.cbBuffer != other.cbBuffer) return false
        if (this.crBuffer2 != other.crBuffer2) return false
        if (this.cbBuffer2 != other.cbBuffer2) return false
        if (this.frameHeight != other.frameHeight) return false
        if (this.frameWidth != other.frameWidth) return false
        if (this.frameBufferWidth != other.frameBufferWidth) return false
        if (!this.unknown3.contentEquals(other.unknown3)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.frameBufferHeight16.hashCode()
        result = 31 * result + this.frameBufferWidth16.hashCode()
        result = 31 * result + this.unknown.hashCode()
        result = 31 * result + this.unknown2.hashCode()
        result = 31 * result + this.yBuffer.hashCode()
        result = 31 * result + this.yBuffer2.hashCode()
        result = 31 * result + this.crBuffer.hashCode()
        result = 31 * result + this.cbBuffer.hashCode()
        result = 31 * result + this.crBuffer2.hashCode()
        result = 31 * result + this.cbBuffer2.hashCode()
        result = 31 * result + this.frameHeight.hashCode()
        result = 31 * result + this.frameWidth.hashCode()
        result = 31 * result + this.frameBufferWidth.hashCode()
        result = 31 * result + this.unknown3.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceMpegYCrCbBuffer> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceMpegYCrCbBuffer> {
                override val sizeBytes: Long = 128L
                override val alignBytes: Long = 64L
                override fun readNative(addr: Long): SceMpegYCrCbBuffer =
                    SceMpegYCrCbBuffer(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 40L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 48L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 56L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 64L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 68L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 72L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (11).toInt())
                        ).readNative(addr + 76L),
                    )
                override fun writeNative(addr: Long, value: SceMpegYCrCbBuffer) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.frameBufferHeight16)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.frameBufferWidth16)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.unknown)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.unknown2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.yBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 24L, value.yBuffer2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.crBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 40L, value.cbBuffer)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 48L, value.crBuffer2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 56L, value.cbBuffer2)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 64L, value.frameHeight)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 68L, value.frameWidth)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 72L, value.frameBufferWidth)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32, (11).toInt())
                    ).writeNative(addr + 76L, value.unknown3)
                }
            }

        public operator fun invoke(
            frameBufferHeight16: Int = 0,
            frameBufferWidth16: Int = 0,
            unknown: Int = 0,
            unknown2: Int = 0,
            yBuffer: MutPtr<CVoid> = MutPtr(0L),
            yBuffer2: MutPtr<CVoid> = MutPtr(0L),
            crBuffer: MutPtr<CVoid> = MutPtr(0L),
            cbBuffer: MutPtr<CVoid> = MutPtr(0L),
            crBuffer2: MutPtr<CVoid> = MutPtr(0L),
            cbBuffer2: MutPtr<CVoid> = MutPtr(0L),
            frameHeight: Int = 0,
            frameWidth: Int = 0,
            frameBufferWidth: Int = 0,
            unknown3: IntArray = IntArray(11),
        ): SceMpegYCrCbBuffer =
            SceMpegYCrCbBuffer(
                frameBufferHeight16 = frameBufferHeight16,
                frameBufferWidth16 = frameBufferWidth16,
                unknown = unknown,
                unknown2 = unknown2,
                yBufferCtorArg = yBuffer,
                yBuffer2CtorArg = yBuffer2,
                crBufferCtorArg = crBuffer,
                cbBufferCtorArg = cbBuffer,
                crBuffer2CtorArg = crBuffer2,
                cbBuffer2CtorArg = cbBuffer2,
                frameHeight = frameHeight,
                frameWidth = frameWidth,
                frameBufferWidth = frameBufferWidth,
                unknown3 = unknown3,
            )
    }
}

public data class ScePspSRect(
    public var x: Short = 0,
    public var y: Short = 0,
    public var w: Short = 0,
    public var h: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspSRect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspSRect> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): ScePspSRect =
                    ScePspSRect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: ScePspSRect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.w)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 6L, value.h)
                }
            }
    }
}

public data class ScePspIRect(
    public var x: Int = 0,
    public var y: Int = 0,
    public var w: Int = 0,
    public var h: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspIRect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspIRect> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ScePspIRect =
                    ScePspIRect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ScePspIRect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.w)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.h)
                }
            }
    }
}

public data class ScePspL64Rect(
    public var x: ULong = 0uL,
    public var y: ULong = 0uL,
    public var w: ULong = 0uL,
    public var h: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspL64Rect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspL64Rect> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ScePspL64Rect =
                    ScePspL64Rect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: ScePspL64Rect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.w)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.h)
                }
            }
    }
}

public data class ScePspSVector2(
    public var x: Short = 0,
    public var y: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspSVector2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspSVector2> {
                override val sizeBytes: Long = 4L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): ScePspSVector2 =
                    ScePspSVector2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                    )
                override fun writeNative(addr: Long, value: ScePspSVector2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.y)
                }
            }
    }
}

public data class ScePspIVector2(
    public var x: Int = 0,
    public var y: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspIVector2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspIVector2> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ScePspIVector2 =
                    ScePspIVector2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ScePspIVector2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.y)
                }
            }
    }
}

public data class ScePspL64Vector2(
    public var x: ULong = 0uL,
    public var y: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspL64Vector2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspL64Vector2> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ScePspL64Vector2 =
                    ScePspL64Vector2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ScePspL64Vector2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.y)
                }
            }
    }
}

public data class ScePspSVector3(
    public var x: Short = 0,
    public var y: Short = 0,
    public var z: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspSVector3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspSVector3> {
                override val sizeBytes: Long = 6L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): ScePspSVector3 =
                    ScePspSVector3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ScePspSVector3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.z)
                }
            }
    }
}

public data class ScePspIVector3(
    public var x: Int = 0,
    public var y: Int = 0,
    public var z: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspIVector3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspIVector3> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ScePspIVector3 =
                    ScePspIVector3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ScePspIVector3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.z)
                }
            }
    }
}

public data class ScePspL64Vector3(
    public var x: ULong = 0uL,
    public var y: ULong = 0uL,
    public var z: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspL64Vector3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspL64Vector3> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ScePspL64Vector3 =
                    ScePspL64Vector3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                    )
                override fun writeNative(addr: Long, value: ScePspL64Vector3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.z)
                }
            }
    }
}

public data class ScePspSVector4(
    public var x: Short = 0,
    public var y: Short = 0,
    public var z: Short = 0,
    public var w: Short = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspSVector4> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspSVector4> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 2L
                override fun readNative(addr: Long): ScePspSVector4 =
                    ScePspSVector4(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 2L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).readNative(addr + 6L),
                    )
                override fun writeNative(addr: Long, value: ScePspSVector4) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 2L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 4L, value.z)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I16).writeNative(addr + 6L, value.w)
                }
            }
    }
}

public data class ScePspIVector4(
    public var x: Int = 0,
    public var y: Int = 0,
    public var z: Int = 0,
    public var w: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspIVector4> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspIVector4> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ScePspIVector4 =
                    ScePspIVector4(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ScePspIVector4) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.z)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 12L, value.w)
                }
            }
    }
}

public data class ScePspL64Vector4(
    public var x: ULong = 0uL,
    public var y: ULong = 0uL,
    public var z: ULong = 0uL,
    public var w: ULong = 0uL,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspL64Vector4> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspL64Vector4> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): ScePspL64Vector4 =
                    ScePspL64Vector4(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: ScePspL64Vector4) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 8L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 16L, value.z)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.w)
                }
            }
    }
}

public data class ScePspIMatrix2(
    public var x: ScePspIVector2 = ScePspIVector2(),
    public var y: ScePspIVector2 = ScePspIVector2(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspIMatrix2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspIMatrix2> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ScePspIMatrix2 =
                    ScePspIMatrix2(
                        (ScePspIVector2.typeLayout()).readNative(addr),
                        (ScePspIVector2.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ScePspIMatrix2) {
                    (ScePspIVector2.typeLayout()).writeNative(addr, value.x)
                    (ScePspIVector2.typeLayout()).writeNative(addr + 8L, value.y)
                }
            }
    }
}

public data class ScePspIMatrix3(
    public var x: ScePspIVector3 = ScePspIVector3(),
    public var y: ScePspIVector3 = ScePspIVector3(),
    public var z: ScePspIVector3 = ScePspIVector3(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspIMatrix3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspIMatrix3> {
                override val sizeBytes: Long = 36L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ScePspIMatrix3 =
                    ScePspIMatrix3(
                        (ScePspIVector3.typeLayout()).readNative(addr),
                        (ScePspIVector3.typeLayout()).readNative(addr + 12L),
                        (ScePspIVector3.typeLayout()).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: ScePspIMatrix3) {
                    (ScePspIVector3.typeLayout()).writeNative(addr, value.x)
                    (ScePspIVector3.typeLayout()).writeNative(addr + 12L, value.y)
                    (ScePspIVector3.typeLayout()).writeNative(addr + 24L, value.z)
                }
            }
    }
}

public data class ScePspIMatrix4(
    public var x: ScePspIVector4 = ScePspIVector4(),
    public var y: ScePspIVector4 = ScePspIVector4(),
    public var z: ScePspIVector4 = ScePspIVector4(),
    public var w: ScePspIVector4 = ScePspIVector4(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspIMatrix4> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspIMatrix4> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 16L
                override fun readNative(addr: Long): ScePspIMatrix4 =
                    ScePspIMatrix4(
                        (ScePspIVector4.typeLayout()).readNative(addr),
                        (ScePspIVector4.typeLayout()).readNative(addr + 16L),
                        (ScePspIVector4.typeLayout()).readNative(addr + 32L),
                        (ScePspIVector4.typeLayout()).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: ScePspIMatrix4) {
                    (ScePspIVector4.typeLayout()).writeNative(addr, value.x)
                    (ScePspIVector4.typeLayout()).writeNative(addr + 16L, value.y)
                    (ScePspIVector4.typeLayout()).writeNative(addr + 32L, value.z)
                    (ScePspIVector4.typeLayout()).writeNative(addr + 48L, value.w)
                }
            }
    }
}

public data class ScePspIMatrix4Unaligned(
    public var x: ScePspIVector4 = ScePspIVector4(),
    public var y: ScePspIVector4 = ScePspIVector4(),
    public var z: ScePspIVector4 = ScePspIVector4(),
    public var w: ScePspIVector4 = ScePspIVector4(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspIMatrix4Unaligned> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspIMatrix4Unaligned> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ScePspIMatrix4Unaligned =
                    ScePspIMatrix4Unaligned(
                        (ScePspIVector4.typeLayout()).readNative(addr),
                        (ScePspIVector4.typeLayout()).readNative(addr + 16L),
                        (ScePspIVector4.typeLayout()).readNative(addr + 32L),
                        (ScePspIVector4.typeLayout()).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: ScePspIMatrix4Unaligned) {
                    (ScePspIVector4.typeLayout()).writeNative(addr, value.x)
                    (ScePspIVector4.typeLayout()).writeNative(addr + 16L, value.y)
                    (ScePspIVector4.typeLayout()).writeNative(addr + 32L, value.z)
                    (ScePspIVector4.typeLayout()).writeNative(addr + 48L, value.w)
                }
            }
    }
}

public class SceMp3InitArg internal constructor(
    public var mp3StreamStart: UInt,
    public var unk1: UInt,
    public var mp3StreamEnd: UInt,
    public var unk2: UInt,
    mp3BufCtorArg: MutPtr<CVoid>,
    public var mp3BufSize: Int,
    pcmBufCtorArg: MutPtr<CVoid>,
    public var pcmBufSize: Int,
) {
    public var mp3Buf: MutPtr<CVoid> = mp3BufCtorArg
        internal set

    public var pcmBuf: MutPtr<CVoid> = pcmBufCtorArg
        internal set

    public constructor() : this(
        mp3StreamStart = 0u,
        unk1 = 0u,
        mp3StreamEnd = 0u,
        unk2 = 0u,
        mp3BufCtorArg = MutPtr(0L),
        mp3BufSize = 0,
        pcmBufCtorArg = MutPtr(0L),
        pcmBufSize = 0,
    )

    public operator fun component1(): UInt = this.mp3StreamStart

    public operator fun component2(): UInt = this.unk1

    public operator fun component3(): UInt = this.mp3StreamEnd

    public operator fun component4(): UInt = this.unk2

    public operator fun component5(): MutPtr<CVoid> = this.mp3Buf

    public operator fun component6(): Int = this.mp3BufSize

    public operator fun component7(): MutPtr<CVoid> = this.pcmBuf

    public operator fun component8(): Int = this.pcmBufSize

    public fun copy(mp3StreamStart: UInt = this.mp3StreamStart, unk1: UInt = this.unk1, mp3StreamEnd: UInt = this.mp3StreamEnd, unk2: UInt = this.unk2, mp3Buf: MutPtr<CVoid> = this.mp3Buf, mp3BufSize: Int = this.mp3BufSize, pcmBuf: MutPtr<CVoid> = this.pcmBuf, pcmBufSize: Int = this.pcmBufSize): SceMp3InitArg = SceMp3InitArg(mp3StreamStart = mp3StreamStart, unk1 = unk1, mp3StreamEnd = mp3StreamEnd, unk2 = unk2, mp3BufCtorArg = mp3Buf, mp3BufSize = mp3BufSize, pcmBufCtorArg = pcmBuf, pcmBufSize = pcmBufSize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceMp3InitArg) return false
        if (this.mp3StreamStart != other.mp3StreamStart) return false
        if (this.unk1 != other.unk1) return false
        if (this.mp3StreamEnd != other.mp3StreamEnd) return false
        if (this.unk2 != other.unk2) return false
        if (this.mp3Buf != other.mp3Buf) return false
        if (this.mp3BufSize != other.mp3BufSize) return false
        if (this.pcmBuf != other.pcmBuf) return false
        if (this.pcmBufSize != other.pcmBufSize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.mp3StreamStart.hashCode()
        result = 31 * result + this.unk1.hashCode()
        result = 31 * result + this.mp3StreamEnd.hashCode()
        result = 31 * result + this.unk2.hashCode()
        result = 31 * result + this.mp3Buf.hashCode()
        result = 31 * result + this.mp3BufSize.hashCode()
        result = 31 * result + this.pcmBuf.hashCode()
        result = 31 * result + this.pcmBufSize.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceMp3InitArg> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceMp3InitArg> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceMp3InitArg =
                    SceMp3InitArg(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 32L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 40L),
                    )
                override fun writeNative(addr: Long, value: SceMp3InitArg) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.mp3StreamStart)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 4L, value.unk1)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.mp3StreamEnd)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 12L, value.unk2)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 16L, value.mp3Buf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.mp3BufSize)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 32L, value.pcmBuf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 40L, value.pcmBufSize)
                }
            }

        public operator fun invoke(
            mp3StreamStart: UInt = 0u,
            unk1: UInt = 0u,
            mp3StreamEnd: UInt = 0u,
            unk2: UInt = 0u,
            mp3Buf: MutPtr<CVoid> = MutPtr(0L),
            mp3BufSize: Int = 0,
            pcmBuf: MutPtr<CVoid> = MutPtr(0L),
            pcmBufSize: Int = 0,
        ): SceMp3InitArg =
            SceMp3InitArg(
                mp3StreamStart = mp3StreamStart,
                unk1 = unk1,
                mp3StreamEnd = mp3StreamEnd,
                unk2 = unk2,
                mp3BufCtorArg = mp3Buf,
                mp3BufSize = mp3BufSize,
                pcmBufCtorArg = pcmBuf,
                pcmBufSize = pcmBufSize,
            )
    }
}

public data class OpenPSID(
    public var data: UByteArray = UByteArray(16),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is OpenPSID) return false
        if (!this.data.contentEquals(other.data)) return false
        return true
    }

    override fun hashCode(): Int = this.data.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<OpenPSID> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<OpenPSID> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): OpenPSID =
                    OpenPSID(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: OpenPSID) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (16).toInt())
                    ).writeNative(addr, value.data)
                }
            }
    }
}

public data class UtilityDialogCommon(
    public var size: UInt = 0u,
    public var language: SystemParamLanguage = SystemParamLanguage.entries.first(),
    public var buttonAccept: UtilityDialogButtonAccept = UtilityDialogButtonAccept.entries.first(),
    public var graphicsThread: Int = 0,
    public var accessThread: Int = 0,
    public var fontThread: Int = 0,
    public var soundThread: Int = 0,
    public var result: Int = 0,
    public var reserved: IntArray = IntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UtilityDialogCommon) return false
        if (this.size != other.size) return false
        if (this.language != other.language) return false
        if (this.buttonAccept != other.buttonAccept) return false
        if (this.graphicsThread != other.graphicsThread) return false
        if (this.accessThread != other.accessThread) return false
        if (this.fontThread != other.fontThread) return false
        if (this.soundThread != other.soundThread) return false
        if (this.result != other.result) return false
        if (!this.reserved.contentEquals(other.reserved)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.size.hashCode()
        result = 31 * result + this.language.hashCode()
        result = 31 * result + this.buttonAccept.hashCode()
        result = 31 * result + this.graphicsThread.hashCode()
        result = 31 * result + this.accessThread.hashCode()
        result = 31 * result + this.fontThread.hashCode()
        result = 31 * result + this.soundThread.hashCode()
        result = 31 * result + this.result.hashCode()
        result = 31 * result + this.reserved.contentHashCode()
        return result
    }
}

public data class UtilityNetconfAdhoc(
    public var name: UByteArray = UByteArray(8),
    public var timeout: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UtilityNetconfAdhoc) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.timeout != other.timeout) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.name.contentHashCode()
        result = 31 * result + this.timeout.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UtilityNetconfAdhoc> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UtilityNetconfAdhoc> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): UtilityNetconfAdhoc =
                    UtilityNetconfAdhoc(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: UtilityNetconfAdhoc) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr, value.name)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 8L, value.timeout)
                }
            }
    }
}

public class UtilityNetconfData internal constructor(
    public var base: UtilityDialogCommon,
    public var action: UtilityNetconfAction,
    adhocparamCtorArg: MutPtr<UtilityNetconfAdhoc>,
    public var hotspot: Int,
    public var hotspotConnected: Int,
    public var wifisp: Int,
) {
    public var adhocparam: MutPtr<UtilityNetconfAdhoc> = adhocparamCtorArg
        internal set

    public constructor() : this(
        base = UtilityDialogCommon(),
        action = UtilityNetconfAction.entries.first(),
        adhocparamCtorArg = MutPtr(0L),
        hotspot = 0,
        hotspotConnected = 0,
        wifisp = 0,
    )

    public operator fun component1(): UtilityDialogCommon = this.base

    public operator fun component2(): UtilityNetconfAction = this.action

    public operator fun component3(): MutPtr<UtilityNetconfAdhoc> = this.adhocparam

    public operator fun component4(): Int = this.hotspot

    public operator fun component5(): Int = this.hotspotConnected

    public operator fun component6(): Int = this.wifisp

    public fun copy(base: UtilityDialogCommon = this.base, action: UtilityNetconfAction = this.action, adhocparam: MutPtr<UtilityNetconfAdhoc> = this.adhocparam, hotspot: Int = this.hotspot, hotspotConnected: Int = this.hotspotConnected, wifisp: Int = this.wifisp): UtilityNetconfData = UtilityNetconfData(base = base, action = action, adhocparamCtorArg = adhocparam, hotspot = hotspot, hotspotConnected = hotspotConnected, wifisp = wifisp)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UtilityNetconfData) return false
        if (this.base != other.base) return false
        if (this.action != other.action) return false
        if (this.adhocparam != other.adhocparam) return false
        if (this.hotspot != other.hotspot) return false
        if (this.hotspotConnected != other.hotspotConnected) return false
        if (this.wifisp != other.wifisp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.base.hashCode()
        result = 31 * result + this.action.hashCode()
        result = 31 * result + this.adhocparam.hashCode()
        result = 31 * result + this.hotspot.hashCode()
        result = 31 * result + this.hotspotConnected.hashCode()
        result = 31 * result + this.wifisp.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            base: UtilityDialogCommon = UtilityDialogCommon(),
            action: UtilityNetconfAction = UtilityNetconfAction.entries.first(),
            adhocparam: MutPtr<UtilityNetconfAdhoc> = MutPtr(0L),
            hotspot: Int = 0,
            hotspotConnected: Int = 0,
            wifisp: Int = 0,
        ): UtilityNetconfData =
            UtilityNetconfData(
                base = base,
                action = action,
                adhocparamCtorArg = adhocparam,
                hotspot = hotspot,
                hotspotConnected = hotspotConnected,
                wifisp = wifisp,
            )
    }
}

public class UtilitySavedataFileData internal constructor(
    bufCtorArg: MutPtr<CVoid>,
    public var bufSize: Int,
    public var size: Int,
    public var unknown: Int,
) {
    public var buf: MutPtr<CVoid> = bufCtorArg
        internal set

    public constructor() : this(
        bufCtorArg = MutPtr(0L),
        bufSize = 0,
        size = 0,
        unknown = 0,
    )

    public operator fun component1(): MutPtr<CVoid> = this.buf

    public operator fun component2(): Int = this.bufSize

    public operator fun component3(): Int = this.size

    public operator fun component4(): Int = this.unknown

    public fun copy(buf: MutPtr<CVoid> = this.buf, bufSize: Int = this.bufSize, size: Int = this.size, unknown: Int = this.unknown): UtilitySavedataFileData = UtilitySavedataFileData(bufCtorArg = buf, bufSize = bufSize, size = size, unknown = unknown)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UtilitySavedataFileData) return false
        if (this.buf != other.buf) return false
        if (this.bufSize != other.bufSize) return false
        if (this.size != other.size) return false
        if (this.unknown != other.unknown) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.buf.hashCode()
        result = 31 * result + this.bufSize.hashCode()
        result = 31 * result + this.size.hashCode()
        result = 31 * result + this.unknown.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UtilitySavedataFileData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UtilitySavedataFileData> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): UtilitySavedataFileData =
                    UtilitySavedataFileData(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 24L),
                    )
                override fun writeNative(addr: Long, value: UtilitySavedataFileData) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr, value.buf)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 8L, value.bufSize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.USIZE64).writeNative(addr + 16L, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 24L, value.unknown)
                }
            }

        public operator fun invoke(
            buf: MutPtr<CVoid> = MutPtr(0L),
            bufSize: Int = 0,
            size: Int = 0,
            unknown: Int = 0,
        ): UtilitySavedataFileData =
            UtilitySavedataFileData(
                bufCtorArg = buf,
                bufSize = bufSize,
                size = size,
                unknown = unknown,
            )
    }
}

public class UtilitySavedataListSaveNewData internal constructor(
    public var icon0: UtilitySavedataFileData,
    titleCtorArg: MutPtr<UByte>,
) {
    public var title: MutPtr<UByte> = titleCtorArg
        internal set

    public constructor() : this(
        icon0 = UtilitySavedataFileData(),
        titleCtorArg = MutPtr(0L),
    )

    public operator fun component1(): UtilitySavedataFileData = this.icon0

    public operator fun component2(): MutPtr<UByte> = this.title

    public fun copy(icon0: UtilitySavedataFileData = this.icon0, title: MutPtr<UByte> = this.title): UtilitySavedataListSaveNewData = UtilitySavedataListSaveNewData(icon0 = icon0, titleCtorArg = title)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UtilitySavedataListSaveNewData) return false
        if (this.icon0 != other.icon0) return false
        if (this.title != other.title) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.icon0.hashCode()
        result = 31 * result + this.title.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UtilitySavedataListSaveNewData> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UtilitySavedataListSaveNewData> {
                override val sizeBytes: Long = 40L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): UtilitySavedataListSaveNewData =
                    UtilitySavedataListSaveNewData(
                        (UtilitySavedataFileData.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<UByte>(64)
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: UtilitySavedataListSaveNewData) {
                    (UtilitySavedataFileData.typeLayout()).writeNative(addr, value.icon0)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<UByte>(64)
                    ).writeNative(addr + 32L, value.title)
                }
            }

        public operator fun invoke(
            icon0: UtilitySavedataFileData = UtilitySavedataFileData(),
            title: MutPtr<UByte> = MutPtr(0L),
        ): UtilitySavedataListSaveNewData =
            UtilitySavedataListSaveNewData(
                icon0 = icon0,
                titleCtorArg = title,
            )
    }
}

public class UtilityGameSharingParams internal constructor(
    public var base: UtilityDialogCommon,
    public var unknown1: Int,
    public var unknown2: Int,
    public var name: UByteArray,
    public var unknown3: Int,
    public var unknown4: Int,
    public var unknown5: Int,
    public var result: Int,
    filepathCtorArg: MutPtr<UByte>,
    public var mode: UtilityGameSharingMode,
    public var datatype: UtilityGameSharingDataType,
    dataCtorArg: MutPtr<CVoid>,
    public var datasize: UInt,
) {
    public var filepath: MutPtr<UByte> = filepathCtorArg
        internal set

    public var data: MutPtr<CVoid> = dataCtorArg
        internal set

    public constructor() : this(
        base = UtilityDialogCommon(),
        unknown1 = 0,
        unknown2 = 0,
        name = UByteArray(8),
        unknown3 = 0,
        unknown4 = 0,
        unknown5 = 0,
        result = 0,
        filepathCtorArg = MutPtr(0L),
        mode = UtilityGameSharingMode.entries.first(),
        datatype = UtilityGameSharingDataType.entries.first(),
        dataCtorArg = MutPtr(0L),
        datasize = 0u,
    )

    public operator fun component1(): UtilityDialogCommon = this.base

    public operator fun component2(): Int = this.unknown1

    public operator fun component3(): Int = this.unknown2

    public operator fun component4(): UByteArray = this.name

    public operator fun component5(): Int = this.unknown3

    public operator fun component6(): Int = this.unknown4

    public operator fun component7(): Int = this.unknown5

    public operator fun component8(): Int = this.result

    public operator fun component9(): MutPtr<UByte> = this.filepath

    public operator fun component10(): UtilityGameSharingMode = this.mode

    public operator fun component11(): UtilityGameSharingDataType = this.datatype

    public operator fun component12(): MutPtr<CVoid> = this.data

    public operator fun component13(): UInt = this.datasize

    public fun copy(base: UtilityDialogCommon = this.base, unknown1: Int = this.unknown1, unknown2: Int = this.unknown2, name: UByteArray = this.name, unknown3: Int = this.unknown3, unknown4: Int = this.unknown4, unknown5: Int = this.unknown5, result: Int = this.result, filepath: MutPtr<UByte> = this.filepath, mode: UtilityGameSharingMode = this.mode, datatype: UtilityGameSharingDataType = this.datatype, data: MutPtr<CVoid> = this.data, datasize: UInt = this.datasize): UtilityGameSharingParams = UtilityGameSharingParams(base = base, unknown1 = unknown1, unknown2 = unknown2, name = name, unknown3 = unknown3, unknown4 = unknown4, unknown5 = unknown5, result = result, filepathCtorArg = filepath, mode = mode, datatype = datatype, dataCtorArg = data, datasize = datasize)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UtilityGameSharingParams) return false
        if (this.base != other.base) return false
        if (this.unknown1 != other.unknown1) return false
        if (this.unknown2 != other.unknown2) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.unknown3 != other.unknown3) return false
        if (this.unknown4 != other.unknown4) return false
        if (this.unknown5 != other.unknown5) return false
        if (this.result != other.result) return false
        if (this.filepath != other.filepath) return false
        if (this.mode != other.mode) return false
        if (this.datatype != other.datatype) return false
        if (this.data != other.data) return false
        if (this.datasize != other.datasize) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.base.hashCode()
        result = 31 * result + this.unknown1.hashCode()
        result = 31 * result + this.unknown2.hashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.unknown3.hashCode()
        result = 31 * result + this.unknown4.hashCode()
        result = 31 * result + this.unknown5.hashCode()
        result = 31 * result + this.result.hashCode()
        result = 31 * result + this.filepath.hashCode()
        result = 31 * result + this.mode.hashCode()
        result = 31 * result + this.datatype.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.datasize.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            base: UtilityDialogCommon = UtilityDialogCommon(),
            unknown1: Int = 0,
            unknown2: Int = 0,
            name: UByteArray = UByteArray(8),
            unknown3: Int = 0,
            unknown4: Int = 0,
            unknown5: Int = 0,
            result: Int = 0,
            filepath: MutPtr<UByte> = MutPtr(0L),
            mode: UtilityGameSharingMode = UtilityGameSharingMode.entries.first(),
            datatype: UtilityGameSharingDataType = UtilityGameSharingDataType.entries.first(),
            data: MutPtr<CVoid> = MutPtr(0L),
            datasize: UInt = 0u,
        ): UtilityGameSharingParams =
            UtilityGameSharingParams(
                base = base,
                unknown1 = unknown1,
                unknown2 = unknown2,
                name = name,
                unknown3 = unknown3,
                unknown4 = unknown4,
                unknown5 = unknown5,
                result = result,
                filepathCtorArg = filepath,
                mode = mode,
                datatype = datatype,
                dataCtorArg = data,
                datasize = datasize,
            )
    }
}

public class UtilityHtmlViewerParam internal constructor(
    public var base: UtilityDialogCommon,
    memaddrCtorArg: MutPtr<CVoid>,
    public var memsize: UInt,
    public var unknown1: Int,
    public var unknown2: Int,
    initialurlCtorArg: MutPtr<UByte>,
    public var numtabs: UInt,
    public var interfacemode: UtilityHtmlViewerInterfaceMode,
    public var options: Int,
    dldirnameCtorArg: MutPtr<UByte>,
    dlfilenameCtorArg: MutPtr<UByte>,
    uldirnameCtorArg: MutPtr<UByte>,
    ulfilenameCtorArg: MutPtr<UByte>,
    public var cookiemode: UtilityHtmlViewerCookieMode,
    public var unknown3: UInt,
    homeurlCtorArg: MutPtr<UByte>,
    public var textsize: UtilityHtmlViewerTextSize,
    public var displaymode: UtilityHtmlViewerDisplayMode,
    public var connectmode: UtilityHtmlViewerConnectMode,
    public var disconnectmode: UtilityHtmlViewerDisconnectMode,
    public var memused: UInt,
    public var unknown4: IntArray,
) {
    public var memaddr: MutPtr<CVoid> = memaddrCtorArg
        internal set

    public var initialurl: MutPtr<UByte> = initialurlCtorArg
        internal set

    public var dldirname: MutPtr<UByte> = dldirnameCtorArg
        internal set

    public var dlfilename: MutPtr<UByte> = dlfilenameCtorArg
        internal set

    public var uldirname: MutPtr<UByte> = uldirnameCtorArg
        internal set

    public var ulfilename: MutPtr<UByte> = ulfilenameCtorArg
        internal set

    public var homeurl: MutPtr<UByte> = homeurlCtorArg
        internal set

    public constructor() : this(
        base = UtilityDialogCommon(),
        memaddrCtorArg = MutPtr(0L),
        memsize = 0u,
        unknown1 = 0,
        unknown2 = 0,
        initialurlCtorArg = MutPtr(0L),
        numtabs = 0u,
        interfacemode = UtilityHtmlViewerInterfaceMode.entries.first(),
        options = 0,
        dldirnameCtorArg = MutPtr(0L),
        dlfilenameCtorArg = MutPtr(0L),
        uldirnameCtorArg = MutPtr(0L),
        ulfilenameCtorArg = MutPtr(0L),
        cookiemode = UtilityHtmlViewerCookieMode.entries.first(),
        unknown3 = 0u,
        homeurlCtorArg = MutPtr(0L),
        textsize = UtilityHtmlViewerTextSize.entries.first(),
        displaymode = UtilityHtmlViewerDisplayMode.entries.first(),
        connectmode = UtilityHtmlViewerConnectMode.entries.first(),
        disconnectmode = UtilityHtmlViewerDisconnectMode.entries.first(),
        memused = 0u,
        unknown4 = IntArray(10),
    )

    public companion object {
        public operator fun invoke(
            base: UtilityDialogCommon = UtilityDialogCommon(),
            memaddr: MutPtr<CVoid> = MutPtr(0L),
            memsize: UInt = 0u,
            unknown1: Int = 0,
            unknown2: Int = 0,
            initialurl: MutPtr<UByte> = MutPtr(0L),
            numtabs: UInt = 0u,
            interfacemode: UtilityHtmlViewerInterfaceMode = UtilityHtmlViewerInterfaceMode.entries.first(),
            options: Int = 0,
            dldirname: MutPtr<UByte> = MutPtr(0L),
            dlfilename: MutPtr<UByte> = MutPtr(0L),
            uldirname: MutPtr<UByte> = MutPtr(0L),
            ulfilename: MutPtr<UByte> = MutPtr(0L),
            cookiemode: UtilityHtmlViewerCookieMode = UtilityHtmlViewerCookieMode.entries.first(),
            unknown3: UInt = 0u,
            homeurl: MutPtr<UByte> = MutPtr(0L),
            textsize: UtilityHtmlViewerTextSize = UtilityHtmlViewerTextSize.entries.first(),
            displaymode: UtilityHtmlViewerDisplayMode = UtilityHtmlViewerDisplayMode.entries.first(),
            connectmode: UtilityHtmlViewerConnectMode = UtilityHtmlViewerConnectMode.entries.first(),
            disconnectmode: UtilityHtmlViewerDisconnectMode = UtilityHtmlViewerDisconnectMode.entries.first(),
            memused: UInt = 0u,
            unknown4: IntArray = IntArray(10),
        ): UtilityHtmlViewerParam =
            UtilityHtmlViewerParam(
                base = base,
                memaddrCtorArg = memaddr,
                memsize = memsize,
                unknown1 = unknown1,
                unknown2 = unknown2,
                initialurlCtorArg = initialurl,
                numtabs = numtabs,
                interfacemode = interfacemode,
                options = options,
                dldirnameCtorArg = dldirname,
                dlfilenameCtorArg = dlfilename,
                uldirnameCtorArg = uldirname,
                ulfilenameCtorArg = ulfilename,
                cookiemode = cookiemode,
                unknown3 = unknown3,
                homeurlCtorArg = homeurl,
                textsize = textsize,
                displaymode = displaymode,
                connectmode = connectmode,
                disconnectmode = disconnectmode,
                memused = memused,
                unknown4 = unknown4,
            )
    }
}

public class SceUtilityOskData internal constructor(
    public var unk00: Int,
    public var unk04: Int,
    public var language: SceUtilityOskInputLanguage,
    public var unk12: Int,
    public var inputtype: SceUtilityOskInputType,
    public var lines: Int,
    public var unk24: Int,
    descCtorArg: MutPtr<UShort>,
    intextCtorArg: MutPtr<UShort>,
    public var outtextlength: Int,
    outtextCtorArg: MutPtr<UShort>,
    public var result: SceUtilityOskResult,
    public var outtextlimit: Int,
) {
    public var desc: MutPtr<UShort> = descCtorArg
        internal set

    public var intext: MutPtr<UShort> = intextCtorArg
        internal set

    public var outtext: MutPtr<UShort> = outtextCtorArg
        internal set

    public constructor() : this(
        unk00 = 0,
        unk04 = 0,
        language = SceUtilityOskInputLanguage.entries.first(),
        unk12 = 0,
        inputtype = SceUtilityOskInputType.entries.first(),
        lines = 0,
        unk24 = 0,
        descCtorArg = MutPtr(0L),
        intextCtorArg = MutPtr(0L),
        outtextlength = 0,
        outtextCtorArg = MutPtr(0L),
        result = SceUtilityOskResult.entries.first(),
        outtextlimit = 0,
    )

    public operator fun component1(): Int = this.unk00

    public operator fun component2(): Int = this.unk04

    public operator fun component3(): SceUtilityOskInputLanguage = this.language

    public operator fun component4(): Int = this.unk12

    public operator fun component5(): SceUtilityOskInputType = this.inputtype

    public operator fun component6(): Int = this.lines

    public operator fun component7(): Int = this.unk24

    public operator fun component8(): MutPtr<UShort> = this.desc

    public operator fun component9(): MutPtr<UShort> = this.intext

    public operator fun component10(): Int = this.outtextlength

    public operator fun component11(): MutPtr<UShort> = this.outtext

    public operator fun component12(): SceUtilityOskResult = this.result

    public operator fun component13(): Int = this.outtextlimit

    public fun copy(unk00: Int = this.unk00, unk04: Int = this.unk04, language: SceUtilityOskInputLanguage = this.language, unk12: Int = this.unk12, inputtype: SceUtilityOskInputType = this.inputtype, lines: Int = this.lines, unk24: Int = this.unk24, desc: MutPtr<UShort> = this.desc, intext: MutPtr<UShort> = this.intext, outtextlength: Int = this.outtextlength, outtext: MutPtr<UShort> = this.outtext, result: SceUtilityOskResult = this.result, outtextlimit: Int = this.outtextlimit): SceUtilityOskData = SceUtilityOskData(unk00 = unk00, unk04 = unk04, language = language, unk12 = unk12, inputtype = inputtype, lines = lines, unk24 = unk24, descCtorArg = desc, intextCtorArg = intext, outtextlength = outtextlength, outtextCtorArg = outtext, result = result, outtextlimit = outtextlimit)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceUtilityOskData) return false
        if (this.unk00 != other.unk00) return false
        if (this.unk04 != other.unk04) return false
        if (this.language != other.language) return false
        if (this.unk12 != other.unk12) return false
        if (this.inputtype != other.inputtype) return false
        if (this.lines != other.lines) return false
        if (this.unk24 != other.unk24) return false
        if (this.desc != other.desc) return false
        if (this.intext != other.intext) return false
        if (this.outtextlength != other.outtextlength) return false
        if (this.outtext != other.outtext) return false
        if (this.result != other.result) return false
        if (this.outtextlimit != other.outtextlimit) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.unk00.hashCode()
        result = 31 * result + this.unk04.hashCode()
        result = 31 * result + this.language.hashCode()
        result = 31 * result + this.unk12.hashCode()
        result = 31 * result + this.inputtype.hashCode()
        result = 31 * result + this.lines.hashCode()
        result = 31 * result + this.unk24.hashCode()
        result = 31 * result + this.desc.hashCode()
        result = 31 * result + this.intext.hashCode()
        result = 31 * result + this.outtextlength.hashCode()
        result = 31 * result + this.outtext.hashCode()
        result = 31 * result + this.result.hashCode()
        result = 31 * result + this.outtextlimit.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            unk00: Int = 0,
            unk04: Int = 0,
            language: SceUtilityOskInputLanguage = SceUtilityOskInputLanguage.entries.first(),
            unk12: Int = 0,
            inputtype: SceUtilityOskInputType = SceUtilityOskInputType.entries.first(),
            lines: Int = 0,
            unk24: Int = 0,
            desc: MutPtr<UShort> = MutPtr(0L),
            intext: MutPtr<UShort> = MutPtr(0L),
            outtextlength: Int = 0,
            outtext: MutPtr<UShort> = MutPtr(0L),
            result: SceUtilityOskResult = SceUtilityOskResult.entries.first(),
            outtextlimit: Int = 0,
        ): SceUtilityOskData =
            SceUtilityOskData(
                unk00 = unk00,
                unk04 = unk04,
                language = language,
                unk12 = unk12,
                inputtype = inputtype,
                lines = lines,
                unk24 = unk24,
                descCtorArg = desc,
                intextCtorArg = intext,
                outtextlength = outtextlength,
                outtextCtorArg = outtext,
                result = result,
                outtextlimit = outtextlimit,
            )
    }
}

public class SceUtilityOskParams internal constructor(
    public var base: UtilityDialogCommon,
    public var datacount: Int,
    dataCtorArg: MutPtr<SceUtilityOskData>,
    public var state: SceUtilityOskState,
    public var unk60: Int,
) {
    public var data: MutPtr<SceUtilityOskData> = dataCtorArg
        internal set

    public constructor() : this(
        base = UtilityDialogCommon(),
        datacount = 0,
        dataCtorArg = MutPtr(0L),
        state = SceUtilityOskState.entries.first(),
        unk60 = 0,
    )

    public operator fun component1(): UtilityDialogCommon = this.base

    public operator fun component2(): Int = this.datacount

    public operator fun component3(): MutPtr<SceUtilityOskData> = this.data

    public operator fun component4(): SceUtilityOskState = this.state

    public operator fun component5(): Int = this.unk60

    public fun copy(base: UtilityDialogCommon = this.base, datacount: Int = this.datacount, data: MutPtr<SceUtilityOskData> = this.data, state: SceUtilityOskState = this.state, unk60: Int = this.unk60): SceUtilityOskParams = SceUtilityOskParams(base = base, datacount = datacount, dataCtorArg = data, state = state, unk60 = unk60)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceUtilityOskParams) return false
        if (this.base != other.base) return false
        if (this.datacount != other.datacount) return false
        if (this.data != other.data) return false
        if (this.state != other.state) return false
        if (this.unk60 != other.unk60) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.base.hashCode()
        result = 31 * result + this.datacount.hashCode()
        result = 31 * result + this.data.hashCode()
        result = 31 * result + this.state.hashCode()
        result = 31 * result + this.unk60.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            base: UtilityDialogCommon = UtilityDialogCommon(),
            datacount: Int = 0,
            data: MutPtr<SceUtilityOskData> = MutPtr(0L),
            state: SceUtilityOskState = SceUtilityOskState.entries.first(),
            unk60: Int = 0,
        ): SceUtilityOskParams =
            SceUtilityOskParams(
                base = base,
                datacount = datacount,
                dataCtorArg = data,
                state = state,
                unk60 = unk60,
            )
    }
}

public data class SceNetMallocStat(
    public var pool: Int = 0,
    public var maximum: Int = 0,
    public var free: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceNetMallocStat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceNetMallocStat> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SceNetMallocStat =
                    SceNetMallocStat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: SceNetMallocStat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.pool)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.maximum)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.free)
                }
            }
    }
}

public data class SceNetAdhocctlAdhocId(
    public var unknown: Int = 0,
    public var adhocId: UByteArray = UByteArray(9),
    public var unk: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceNetAdhocctlAdhocId) return false
        if (this.unknown != other.unknown) return false
        if (!this.adhocId.contentEquals(other.adhocId)) return false
        if (!this.unk.contentEquals(other.unk)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.unknown.hashCode()
        result = 31 * result + this.adhocId.contentHashCode()
        result = 31 * result + this.unk.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceNetAdhocctlAdhocId> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceNetAdhocctlAdhocId> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SceNetAdhocctlAdhocId =
                    SceNetAdhocctlAdhocId(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (9).toInt())
                        ).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 13L),
                    )
                override fun writeNative(addr: Long, value: SceNetAdhocctlAdhocId) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.unknown)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (9).toInt())
                    ).writeNative(addr + 4L, value.adhocId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 13L, value.unk)
                }
            }
    }
}

public class SceNetAdhocctlScanInfo internal constructor(
    nextCtorArg: MutPtr<SceNetAdhocctlScanInfo>,
    public var channel: Int,
    public var name: UByteArray,
    public var bssid: UByteArray,
    public var unknown: UByteArray,
    public var unknown2: Int,
) {
    public var next: MutPtr<SceNetAdhocctlScanInfo> = nextCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
        channel = 0,
        name = UByteArray(8),
        bssid = UByteArray(6),
        unknown = UByteArray(2),
        unknown2 = 0,
    )

    public operator fun component1(): MutPtr<SceNetAdhocctlScanInfo> = this.next

    public operator fun component2(): Int = this.channel

    public operator fun component3(): UByteArray = this.name

    public operator fun component4(): UByteArray = this.bssid

    public operator fun component5(): UByteArray = this.unknown

    public operator fun component6(): Int = this.unknown2

    public fun copy(next: MutPtr<SceNetAdhocctlScanInfo> = this.next, channel: Int = this.channel, name: UByteArray = this.name, bssid: UByteArray = this.bssid, unknown: UByteArray = this.unknown, unknown2: Int = this.unknown2): SceNetAdhocctlScanInfo = SceNetAdhocctlScanInfo(nextCtorArg = next, channel = channel, name = name, bssid = bssid, unknown = unknown, unknown2 = unknown2)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceNetAdhocctlScanInfo) return false
        if (this.next != other.next) return false
        if (this.channel != other.channel) return false
        if (!this.name.contentEquals(other.name)) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (!this.unknown.contentEquals(other.unknown)) return false
        if (this.unknown2 != other.unknown2) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.next.hashCode()
        result = 31 * result + this.channel.hashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.bssid.contentHashCode()
        result = 31 * result + this.unknown.contentHashCode()
        result = 31 * result + this.unknown2.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceNetAdhocctlScanInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceNetAdhocctlScanInfo> {
                override val sizeBytes: Long = 32L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceNetAdhocctlScanInfo =
                    SceNetAdhocctlScanInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SceNetAdhocctlScanInfo>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 20L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                        ).readNative(addr + 26L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 28L),
                    )
                override fun writeNative(addr: Long, value: SceNetAdhocctlScanInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SceNetAdhocctlScanInfo>(64)
                    ).writeNative(addr, value.next)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.channel)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 12L, value.name)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 20L, value.bssid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (2).toInt())
                    ).writeNative(addr + 26L, value.unknown)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 28L, value.unknown2)
                }
            }

        public operator fun invoke(
            next: MutPtr<SceNetAdhocctlScanInfo> = MutPtr(0L),
            channel: Int = 0,
            name: UByteArray = UByteArray(8),
            bssid: UByteArray = UByteArray(6),
            unknown: UByteArray = UByteArray(2),
            unknown2: Int = 0,
        ): SceNetAdhocctlScanInfo =
            SceNetAdhocctlScanInfo(
                nextCtorArg = next,
                channel = channel,
                name = name,
                bssid = bssid,
                unknown = unknown,
                unknown2 = unknown2,
            )
    }
}

public data class SceNetAdhocctlGameModeInfo(
    public var count: Int = 0,
    public var macs: List<UByteArray> = List(16) { UByteArray(0) },
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceNetAdhocctlGameModeInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceNetAdhocctlGameModeInfo> {
                override val sizeBytes: Long = 100L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SceNetAdhocctlGameModeInfo =
                    SceNetAdhocctlGameModeInfo(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(
                                    io.github.kotlinmania.rustlang.core.mem
                                        .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt()),
                                    (16).toInt(),
                                )
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SceNetAdhocctlGameModeInfo) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(
                                io.github.kotlinmania.rustlang.core.mem
                                    .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt()),
                                (16).toInt(),
                            )
                    ).writeNative(addr + 4L, value.macs)
                }
            }
    }
}

public class SceNetAdhocPtpStat internal constructor(
    nextCtorArg: MutPtr<SceNetAdhocPtpStat>,
    public var ptpId: Int,
    public var mac: UByteArray,
    public var peermac: UByteArray,
    public var port: UShort,
    public var peerport: UShort,
    public var sentData: UInt,
    public var rcvdData: UInt,
    public var state: ScePspnetAdhocPtpState,
) {
    public var next: MutPtr<SceNetAdhocPtpStat> = nextCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
        ptpId = 0,
        mac = UByteArray(6),
        peermac = UByteArray(6),
        port = 0u,
        peerport = 0u,
        sentData = 0u,
        rcvdData = 0u,
        state = ScePspnetAdhocPtpState.entries.first(),
    )

    public operator fun component1(): MutPtr<SceNetAdhocPtpStat> = this.next

    public operator fun component2(): Int = this.ptpId

    public operator fun component3(): UByteArray = this.mac

    public operator fun component4(): UByteArray = this.peermac

    public operator fun component5(): UShort = this.port

    public operator fun component6(): UShort = this.peerport

    public operator fun component7(): UInt = this.sentData

    public operator fun component8(): UInt = this.rcvdData

    public operator fun component9(): ScePspnetAdhocPtpState = this.state

    public fun copy(next: MutPtr<SceNetAdhocPtpStat> = this.next, ptpId: Int = this.ptpId, mac: UByteArray = this.mac, peermac: UByteArray = this.peermac, port: UShort = this.port, peerport: UShort = this.peerport, sentData: UInt = this.sentData, rcvdData: UInt = this.rcvdData, state: ScePspnetAdhocPtpState = this.state): SceNetAdhocPtpStat = SceNetAdhocPtpStat(nextCtorArg = next, ptpId = ptpId, mac = mac, peermac = peermac, port = port, peerport = peerport, sentData = sentData, rcvdData = rcvdData, state = state)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceNetAdhocPtpStat) return false
        if (this.next != other.next) return false
        if (this.ptpId != other.ptpId) return false
        if (!this.mac.contentEquals(other.mac)) return false
        if (!this.peermac.contentEquals(other.peermac)) return false
        if (this.port != other.port) return false
        if (this.peerport != other.peerport) return false
        if (this.sentData != other.sentData) return false
        if (this.rcvdData != other.rcvdData) return false
        if (this.state != other.state) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.next.hashCode()
        result = 31 * result + this.ptpId.hashCode()
        result = 31 * result + this.mac.contentHashCode()
        result = 31 * result + this.peermac.contentHashCode()
        result = 31 * result + this.port.hashCode()
        result = 31 * result + this.peerport.hashCode()
        result = 31 * result + this.sentData.hashCode()
        result = 31 * result + this.rcvdData.hashCode()
        result = 31 * result + this.state.hashCode()
        return result
    }

    public companion object {
        public operator fun invoke(
            next: MutPtr<SceNetAdhocPtpStat> = MutPtr(0L),
            ptpId: Int = 0,
            mac: UByteArray = UByteArray(6),
            peermac: UByteArray = UByteArray(6),
            port: UShort = 0u,
            peerport: UShort = 0u,
            sentData: UInt = 0u,
            rcvdData: UInt = 0u,
            state: ScePspnetAdhocPtpState = ScePspnetAdhocPtpState.entries.first(),
        ): SceNetAdhocPtpStat =
            SceNetAdhocPtpStat(
                nextCtorArg = next,
                ptpId = ptpId,
                mac = mac,
                peermac = peermac,
                port = port,
                peerport = peerport,
                sentData = sentData,
                rcvdData = rcvdData,
                state = state,
            )
    }
}

public class SceNetAdhocPdpStat internal constructor(
    nextCtorArg: MutPtr<SceNetAdhocPdpStat>,
    public var pdpId: Int,
    public var mac: UByteArray,
    public var port: UShort,
    public var rcvdData: UInt,
) {
    public var next: MutPtr<SceNetAdhocPdpStat> = nextCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
        pdpId = 0,
        mac = UByteArray(6),
        port = 0u,
        rcvdData = 0u,
    )

    public operator fun component1(): MutPtr<SceNetAdhocPdpStat> = this.next

    public operator fun component2(): Int = this.pdpId

    public operator fun component3(): UByteArray = this.mac

    public operator fun component4(): UShort = this.port

    public operator fun component5(): UInt = this.rcvdData

    public fun copy(next: MutPtr<SceNetAdhocPdpStat> = this.next, pdpId: Int = this.pdpId, mac: UByteArray = this.mac, port: UShort = this.port, rcvdData: UInt = this.rcvdData): SceNetAdhocPdpStat = SceNetAdhocPdpStat(nextCtorArg = next, pdpId = pdpId, mac = mac, port = port, rcvdData = rcvdData)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceNetAdhocPdpStat) return false
        if (this.next != other.next) return false
        if (this.pdpId != other.pdpId) return false
        if (!this.mac.contentEquals(other.mac)) return false
        if (this.port != other.port) return false
        if (this.rcvdData != other.rcvdData) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.next.hashCode()
        result = 31 * result + this.pdpId.hashCode()
        result = 31 * result + this.mac.contentHashCode()
        result = 31 * result + this.port.hashCode()
        result = 31 * result + this.rcvdData.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceNetAdhocPdpStat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceNetAdhocPdpStat> {
                override val sizeBytes: Long = 24L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceNetAdhocPdpStat =
                    SceNetAdhocPdpStat(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SceNetAdhocPdpStat>(64)
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 12L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 18L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 20L),
                    )
                override fun writeNative(addr: Long, value: SceNetAdhocPdpStat) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SceNetAdhocPdpStat>(64)
                    ).writeNative(addr, value.next)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.pdpId)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 12L, value.mac)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 18L, value.port)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 20L, value.rcvdData)
                }
            }

        public operator fun invoke(
            next: MutPtr<SceNetAdhocPdpStat> = MutPtr(0L),
            pdpId: Int = 0,
            mac: UByteArray = UByteArray(6),
            port: UShort = 0u,
            rcvdData: UInt = 0u,
        ): SceNetAdhocPdpStat =
            SceNetAdhocPdpStat(
                nextCtorArg = next,
                pdpId = pdpId,
                mac = mac,
                port = port,
                rcvdData = rcvdData,
            )
    }
}

public data class AdhocPoolStat(
    public var size: Int = 0,
    public var maxsize: Int = 0,
    public var freesize: Int = 0,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<AdhocPoolStat> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<AdhocPoolStat> {
                override val sizeBytes: Long = 12L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): AdhocPoolStat =
                    AdhocPoolStat(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: AdhocPoolStat) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.size)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 4L, value.maxsize)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 8L, value.freesize)
                }
            }
    }
}

public data class GeContext(
    public var context: UIntArray = UIntArray(512),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is GeContext) return false
        if (!this.context.contentEquals(other.context)) return false
        return true
    }

    override fun hashCode(): Int = this.context.contentHashCode()

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<GeContext> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<GeContext> {
                override val sizeBytes: Long = 2048L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): GeContext =
                    GeContext(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (512).toInt())
                        ).readNative(addr),
                    )
                override fun writeNative(addr: Long, value: GeContext) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (512).toInt())
                    ).writeNative(addr, value.context)
                }
            }
    }
}

public data class SceKernelUtilsSha1Context(
    public var h: UIntArray = UIntArray(5),
    public var usRemains: UShort = 0u,
    public var usComputed: UShort = 0u,
    public var ullTotalLen: ULong = 0uL,
    public var buf: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceKernelUtilsSha1Context) return false
        if (!this.h.contentEquals(other.h)) return false
        if (this.usRemains != other.usRemains) return false
        if (this.usComputed != other.usComputed) return false
        if (this.ullTotalLen != other.ullTotalLen) return false
        if (!this.buf.contentEquals(other.buf)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.h.contentHashCode()
        result = 31 * result + this.usRemains.hashCode()
        result = 31 * result + this.usComputed.hashCode()
        result = 31 * result + this.ullTotalLen.hashCode()
        result = 31 * result + this.buf.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelUtilsSha1Context> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelUtilsSha1Context> {
                override val sizeBytes: Long = 96L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceKernelUtilsSha1Context =
                    SceKernelUtilsSha1Context(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (5).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: SceKernelUtilsSha1Context) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (5).toInt())
                    ).writeNative(addr, value.h)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.usRemains)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.usComputed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.ullTotalLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                    ).writeNative(addr + 32L, value.buf)
                }
            }
    }
}

public data class SceKernelUtilsMt19937Context(
    public var count: UInt = 0u,
    public var state: UIntArray = UIntArray(624),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceKernelUtilsMt19937Context) return false
        if (this.count != other.count) return false
        if (!this.state.contentEquals(other.state)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.count.hashCode()
        result = 31 * result + this.state.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelUtilsMt19937Context> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelUtilsMt19937Context> {
                override val sizeBytes: Long = 2500L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SceKernelUtilsMt19937Context =
                    SceKernelUtilsMt19937Context(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (624).toInt())
                        ).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: SceKernelUtilsMt19937Context) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr, value.count)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (624).toInt())
                    ).writeNative(addr + 4L, value.state)
                }
            }
    }
}

public data class SceKernelUtilsMd5Context(
    public var h: UIntArray = UIntArray(4),
    public var pad: UInt = 0u,
    public var usRemains: UShort = 0u,
    public var usComputed: UShort = 0u,
    public var ullTotalLen: ULong = 0uL,
    public var buf: UByteArray = UByteArray(64),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceKernelUtilsMd5Context) return false
        if (!this.h.contentEquals(other.h)) return false
        if (this.pad != other.pad) return false
        if (this.usRemains != other.usRemains) return false
        if (this.usComputed != other.usComputed) return false
        if (this.ullTotalLen != other.ullTotalLen) return false
        if (!this.buf.contentEquals(other.buf)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.h.contentHashCode()
        result = 31 * result + this.pad.hashCode()
        result = 31 * result + this.usRemains.hashCode()
        result = 31 * result + this.usComputed.hashCode()
        result = 31 * result + this.ullTotalLen.hashCode()
        result = 31 * result + this.buf.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelUtilsMd5Context> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceKernelUtilsMd5Context> {
                override val sizeBytes: Long = 96L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceKernelUtilsMd5Context =
                    SceKernelUtilsMd5Context(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                        ).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 16L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 20L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).readNative(addr + 22L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).readNative(addr + 24L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                        ).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: SceKernelUtilsMd5Context) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32, (4).toInt())
                    ).writeNative(addr, value.h)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 16L, value.pad)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 20L, value.usRemains)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U16).writeNative(addr + 22L, value.usComputed)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U64).writeNative(addr + 24L, value.ullTotalLen)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (64).toInt())
                    ).writeNative(addr + 32L, value.buf)
                }
            }
    }
}

public class SceIoDirent internal constructor(
    public var dStat: SceIoStat,
    public var dName: UByteArray,
    dPrivateCtorArg: MutPtr<CVoid>,
    public var dummy: Int,
) {
    public var dPrivate: MutPtr<CVoid> = dPrivateCtorArg
        internal set

    public constructor() : this(
        dStat = SceIoStat(),
        dName = UByteArray(256),
        dPrivateCtorArg = MutPtr(0L),
        dummy = 0,
    )

    public operator fun component1(): SceIoStat = this.dStat

    public operator fun component2(): UByteArray = this.dName

    public operator fun component3(): MutPtr<CVoid> = this.dPrivate

    public operator fun component4(): Int = this.dummy

    public fun copy(dStat: SceIoStat = this.dStat, dName: UByteArray = this.dName, dPrivate: MutPtr<CVoid> = this.dPrivate, dummy: Int = this.dummy): SceIoDirent = SceIoDirent(dStat = dStat, dName = dName, dPrivateCtorArg = dPrivate, dummy = dummy)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceIoDirent) return false
        if (this.dStat != other.dStat) return false
        if (!this.dName.contentEquals(other.dName)) return false
        if (this.dPrivate != other.dPrivate) return false
        if (this.dummy != other.dummy) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.dStat.hashCode()
        result = 31 * result + this.dName.contentHashCode()
        result = 31 * result + this.dPrivate.hashCode()
        result = 31 * result + this.dummy.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceIoDirent> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceIoDirent> {
                override val sizeBytes: Long = 360L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceIoDirent =
                    SceIoDirent(
                        (SceIoStat.typeLayout()).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                        ).readNative(addr + 88L),
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<CVoid>(64)
                        ).readNative(addr + 344L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr + 352L),
                    )
                override fun writeNative(addr: Long, value: SceIoDirent) {
                    (SceIoStat.typeLayout()).writeNative(addr, value.dStat)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (256).toInt())
                    ).writeNative(addr + 88L, value.dName)
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<CVoid>(64)
                    ).writeNative(addr + 344L, value.dPrivate)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr + 352L, value.dummy)
                }
            }

        public operator fun invoke(
            dStat: SceIoStat = SceIoStat(),
            dName: UByteArray = UByteArray(256),
            dPrivate: MutPtr<CVoid> = MutPtr(0L),
            dummy: Int = 0,
        ): SceIoDirent =
            SceIoDirent(
                dStat = dStat,
                dName = dName,
                dPrivateCtorArg = dPrivate,
                dummy = dummy,
            )
    }
}

public data class ScePspFRect(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
    public var w: Float = 0.0f,
    public var h: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspFRect> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspFRect> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ScePspFRect =
                    ScePspFRect(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ScePspFRect) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.w)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 12L, value.h)
                }
            }
    }
}

public data class ScePspFVector3(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
    public var z: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspFVector3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspFVector3> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 16L
                override fun readNative(addr: Long): ScePspFVector3 =
                    ScePspFVector3(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ScePspFVector3) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.z)
                }
            }
    }
}

public data class ScePspFVector4(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
    public var z: Float = 0.0f,
    public var w: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspFVector4> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspFVector4> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 16L
                override fun readNative(addr: Long): ScePspFVector4 =
                    ScePspFVector4(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ScePspFVector4) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.z)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 12L, value.w)
                }
            }
    }
}

public data class ScePspFVector4Unaligned(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
    public var z: Float = 0.0f,
    public var w: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspFVector4Unaligned> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspFVector4Unaligned> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ScePspFVector4Unaligned =
                    ScePspFVector4Unaligned(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 8L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 12L),
                    )
                override fun writeNative(addr: Long, value: ScePspFVector4Unaligned) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.y)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 8L, value.z)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 12L, value.w)
                }
            }
    }
}

public data class ScePspFVector2(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspFVector2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspFVector2> {
                override val sizeBytes: Long = 8L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ScePspFVector2 =
                    ScePspFVector2(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).readNative(addr + 4L),
                    )
                override fun writeNative(addr: Long, value: ScePspFVector2) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr, value.x)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.F32).writeNative(addr + 4L, value.y)
                }
            }
    }
}

public data class ScePspFMatrix2(
    public var x: ScePspFVector2 = ScePspFVector2(),
    public var y: ScePspFVector2 = ScePspFVector2(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspFMatrix2> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspFMatrix2> {
                override val sizeBytes: Long = 16L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): ScePspFMatrix2 =
                    ScePspFMatrix2(
                        (ScePspFVector2.typeLayout()).readNative(addr),
                        (ScePspFVector2.typeLayout()).readNative(addr + 8L),
                    )
                override fun writeNative(addr: Long, value: ScePspFMatrix2) {
                    (ScePspFVector2.typeLayout()).writeNative(addr, value.x)
                    (ScePspFVector2.typeLayout()).writeNative(addr + 8L, value.y)
                }
            }
    }
}

public data class ScePspFMatrix3(
    public var x: ScePspFVector3 = ScePspFVector3(),
    public var y: ScePspFVector3 = ScePspFVector3(),
    public var z: ScePspFVector3 = ScePspFVector3(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspFMatrix3> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspFMatrix3> {
                override val sizeBytes: Long = 48L
                override val alignBytes: Long = 16L
                override fun readNative(addr: Long): ScePspFMatrix3 =
                    ScePspFMatrix3(
                        (ScePspFVector3.typeLayout()).readNative(addr),
                        (ScePspFVector3.typeLayout()).readNative(addr + 16L),
                        (ScePspFVector3.typeLayout()).readNative(addr + 32L),
                    )
                override fun writeNative(addr: Long, value: ScePspFMatrix3) {
                    (ScePspFVector3.typeLayout()).writeNative(addr, value.x)
                    (ScePspFVector3.typeLayout()).writeNative(addr + 16L, value.y)
                    (ScePspFVector3.typeLayout()).writeNative(addr + 32L, value.z)
                }
            }
    }
}

public data class ScePspFMatrix4(
    public var x: ScePspFVector4 = ScePspFVector4(),
    public var y: ScePspFVector4 = ScePspFVector4(),
    public var z: ScePspFVector4 = ScePspFVector4(),
    public var w: ScePspFVector4 = ScePspFVector4(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspFMatrix4> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspFMatrix4> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 16L
                override fun readNative(addr: Long): ScePspFMatrix4 =
                    ScePspFMatrix4(
                        (ScePspFVector4.typeLayout()).readNative(addr),
                        (ScePspFVector4.typeLayout()).readNative(addr + 16L),
                        (ScePspFVector4.typeLayout()).readNative(addr + 32L),
                        (ScePspFVector4.typeLayout()).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: ScePspFMatrix4) {
                    (ScePspFVector4.typeLayout()).writeNative(addr, value.x)
                    (ScePspFVector4.typeLayout()).writeNative(addr + 16L, value.y)
                    (ScePspFVector4.typeLayout()).writeNative(addr + 32L, value.z)
                    (ScePspFVector4.typeLayout()).writeNative(addr + 48L, value.w)
                }
            }
    }
}

public data class ScePspFMatrix4Unaligned(
    public var x: ScePspFVector4 = ScePspFVector4(),
    public var y: ScePspFVector4 = ScePspFVector4(),
    public var z: ScePspFVector4 = ScePspFVector4(),
    public var w: ScePspFVector4 = ScePspFVector4(),
) {
    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspFMatrix4Unaligned> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<ScePspFMatrix4Unaligned> {
                override val sizeBytes: Long = 64L
                override val alignBytes: Long = 16L
                override fun readNative(addr: Long): ScePspFMatrix4Unaligned =
                    ScePspFMatrix4Unaligned(
                        (ScePspFVector4.typeLayout()).readNative(addr),
                        (ScePspFVector4.typeLayout()).readNative(addr + 16L),
                        (ScePspFVector4.typeLayout()).readNative(addr + 32L),
                        (ScePspFVector4.typeLayout()).readNative(addr + 48L),
                    )
                override fun writeNative(addr: Long, value: ScePspFMatrix4Unaligned) {
                    (ScePspFVector4.typeLayout()).writeNative(addr, value.x)
                    (ScePspFVector4.typeLayout()).writeNative(addr + 16L, value.y)
                    (ScePspFVector4.typeLayout()).writeNative(addr + 32L, value.z)
                    (ScePspFVector4.typeLayout()).writeNative(addr + 48L, value.w)
                }
            }
    }
}

public data class ScePspVector3(
    public var fv: ScePspFVector3 = ScePspFVector3(),
    public var iv: ScePspIVector3 = ScePspIVector3(),
    public var f: FloatArray = FloatArray(3),
    public var i: IntArray = IntArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScePspVector3) return false
        if (this.fv != other.fv) return false
        if (this.iv != other.iv) return false
        if (!this.f.contentEquals(other.f)) return false
        if (!this.i.contentEquals(other.i)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fv.hashCode()
        result = 31 * result + this.iv.hashCode()
        result = 31 * result + this.f.contentHashCode()
        result = 31 * result + this.i.contentHashCode()
        return result
    }
}

public data class ScePspVector4(
    public var fv: ScePspFVector4 = ScePspFVector4(),
    public var iv: ScePspIVector4 = ScePspIVector4(),
    public var qw: U128 = U128(),
    public var f: FloatArray = FloatArray(4),
    public var i: IntArray = IntArray(4),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScePspVector4) return false
        if (this.fv != other.fv) return false
        if (this.iv != other.iv) return false
        if (this.qw != other.qw) return false
        if (!this.f.contentEquals(other.f)) return false
        if (!this.i.contentEquals(other.i)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fv.hashCode()
        result = 31 * result + this.iv.hashCode()
        result = 31 * result + this.qw.hashCode()
        result = 31 * result + this.f.contentHashCode()
        result = 31 * result + this.i.contentHashCode()
        return result
    }
}

public data class ScePspMatrix2(
    public var fm: ScePspFMatrix2 = ScePspFMatrix2(),
    public var im: ScePspIMatrix2 = ScePspIMatrix2(),
    public var fv: List<ScePspFVector2> = List(2) { ScePspFVector2() },
    public var iv: List<ScePspIVector2> = List(2) { ScePspIVector2() },
    public var v: List<ScePspVector2> = List(2) { ScePspVector2() },
    public var f: List<FloatArray> = List(2) { FloatArray(0) },
    public var i: List<IntArray> = List(2) { IntArray(0) },
)

public data class ScePspMatrix3(
    public var fm: ScePspFMatrix3 = ScePspFMatrix3(),
    public var im: ScePspIMatrix3 = ScePspIMatrix3(),
    public var fv: List<ScePspFVector3> = List(3) { ScePspFVector3() },
    public var iv: List<ScePspIVector3> = List(3) { ScePspIVector3() },
    public var v: List<ScePspVector3> = List(3) { ScePspVector3() },
    public var f: List<FloatArray> = List(3) { FloatArray(0) },
    public var i: List<IntArray> = List(3) { IntArray(0) },
)

public data class ScePspVector2(
    public var fv: ScePspFVector2 = ScePspFVector2(),
    public var iv: ScePspIVector2 = ScePspIVector2(),
    public var f: FloatArray = FloatArray(2),
    public var i: IntArray = IntArray(2),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ScePspVector2) return false
        if (this.fv != other.fv) return false
        if (this.iv != other.iv) return false
        if (!this.f.contentEquals(other.f)) return false
        if (!this.i.contentEquals(other.i)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.fv.hashCode()
        result = 31 * result + this.iv.hashCode()
        result = 31 * result + this.f.contentHashCode()
        result = 31 * result + this.i.contentHashCode()
        return result
    }
}

public data class ScePspMatrix4(
    public var fm: ScePspFMatrix4 = ScePspFMatrix4(),
    public var im: ScePspIMatrix4 = ScePspIMatrix4(),
    public var fv: List<ScePspFVector4> = List(4) { ScePspFVector4() },
    public var iv: List<ScePspIVector4> = List(4) { ScePspIVector4() },
    public var v: List<ScePspVector4> = List(4) { ScePspVector4() },
    public var f: List<FloatArray> = List(4) { FloatArray(0) },
    public var i: List<IntArray> = List(4) { IntArray(0) },
)

public data class Key(
    public var keyType: KeyType = KeyType.entries.first(),
    public var name: UByteArray = UByteArray(256),
    public var nameLen: UInt = 0u,
    public var unk2: UInt = 0u,
    public var unk3: UInt = 0u,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Key) return false
        if (this.keyType != other.keyType) return false
        if (!this.name.contentEquals(other.name)) return false
        if (this.nameLen != other.nameLen) return false
        if (this.unk2 != other.unk2) return false
        if (this.unk3 != other.unk3) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.keyType.hashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.nameLen.hashCode()
        result = 31 * result + this.unk2.hashCode()
        result = 31 * result + this.unk3.hashCode()
        return result
    }
}

public data class UtilityMsgDialogParams(
    public var base: UtilityDialogCommon = UtilityDialogCommon(),
    public var unknown: Int = 0,
    public var mode: UtilityMsgDialogMode = UtilityMsgDialogMode.entries.first(),
    public var errorValue: UInt = 0u,
    public var message: UByteArray = UByteArray(512),
    public var options: Int = 0,
    public var buttonPressed: UtilityMsgDialogPressed = UtilityMsgDialogPressed.entries.first(),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UtilityMsgDialogParams) return false
        if (this.base != other.base) return false
        if (this.unknown != other.unknown) return false
        if (this.mode != other.mode) return false
        if (this.errorValue != other.errorValue) return false
        if (!this.message.contentEquals(other.message)) return false
        if (this.options != other.options) return false
        if (this.buttonPressed != other.buttonPressed) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.base.hashCode()
        result = 31 * result + this.unknown.hashCode()
        result = 31 * result + this.mode.hashCode()
        result = 31 * result + this.errorValue.hashCode()
        result = 31 * result + this.message.contentHashCode()
        result = 31 * result + this.options.hashCode()
        result = 31 * result + this.buttonPressed.hashCode()
        return result
    }
}

public data class UtilityNetData(
    public var asUint: UInt = 0u,
    public var asString: UByteArray = UByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UtilityNetData) return false
        if (this.asUint != other.asUint) return false
        if (!this.asString.contentEquals(other.asString)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.asUint.hashCode()
        result = 31 * result + this.asString.contentHashCode()
        return result
    }
}

public data class UtilitySavedataSFOParam(
    public var title: UByteArray = UByteArray(128),
    public var savedataTitle: UByteArray = UByteArray(128),
    public var detail: UByteArray = UByteArray(1024),
    public var parentalLevel: UByte = 0u,
    public var unknown: UByteArray = UByteArray(3),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UtilitySavedataSFOParam) return false
        if (!this.title.contentEquals(other.title)) return false
        if (!this.savedataTitle.contentEquals(other.savedataTitle)) return false
        if (!this.detail.contentEquals(other.detail)) return false
        if (this.parentalLevel != other.parentalLevel) return false
        if (!this.unknown.contentEquals(other.unknown)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.title.contentHashCode()
        result = 31 * result + this.savedataTitle.contentHashCode()
        result = 31 * result + this.detail.contentHashCode()
        result = 31 * result + this.parentalLevel.hashCode()
        result = 31 * result + this.unknown.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<UtilitySavedataSFOParam> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<UtilitySavedataSFOParam> {
                override val sizeBytes: Long = 1284L
                override val alignBytes: Long = 1L
                override fun readNative(addr: Long): UtilitySavedataSFOParam =
                    UtilitySavedataSFOParam(
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                        ).readNative(addr + 128L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1024).toInt())
                        ).readNative(addr + 256L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).readNative(addr + 1280L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                        ).readNative(addr + 1281L),
                    )
                override fun writeNative(addr: Long, value: UtilitySavedataSFOParam) {
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                    ).writeNative(addr, value.title)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                    ).writeNative(addr + 128L, value.savedataTitle)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (1024).toInt())
                    ).writeNative(addr + 256L, value.detail)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8).writeNative(addr + 1280L, value.parentalLevel)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (3).toInt())
                    ).writeNative(addr + 1281L, value.unknown)
                }
            }
    }
}

public class SceUtilitySavedataParam internal constructor(
    public var base: UtilityDialogCommon,
    public var mode: UtilitySavedataMode,
    public var unknown1: Int,
    public var overwrite: Int,
    public var gameName: UByteArray,
    public var reserved: UByteArray,
    public var saveName: UByteArray,
    saveNameListCtorArg: MutPtr<UByteArray>,
    public var fileName: UByteArray,
    public var reserved1: UByteArray,
    dataBufCtorArg: MutPtr<CVoid>,
    public var dataBufSize: Int,
    public var dataSize: Int,
    public var sfoParam: UtilitySavedataSFOParam,
    public var icon0FileData: UtilitySavedataFileData,
    public var icon1FileData: UtilitySavedataFileData,
    public var pic1FileData: UtilitySavedataFileData,
    public var snd0FileData: UtilitySavedataFileData,
    newDataCtorArg: MutPtr<UtilitySavedataListSaveNewData>,
    public var focus: UtilitySavedataFocus,
    public var unknown2: IntArray,
    public var key: UByteArray,
    public var unknown3: UByteArray,
) {
    public var saveNameList: MutPtr<UByteArray> = saveNameListCtorArg
        internal set

    public var dataBuf: MutPtr<CVoid> = dataBufCtorArg
        internal set

    public var newData: MutPtr<UtilitySavedataListSaveNewData> = newDataCtorArg
        internal set

    public constructor() : this(
        base = UtilityDialogCommon(),
        mode = UtilitySavedataMode.entries.first(),
        unknown1 = 0,
        overwrite = 0,
        gameName = UByteArray(13),
        reserved = UByteArray(3),
        saveName = UByteArray(20),
        saveNameListCtorArg = MutPtr(0L),
        fileName = UByteArray(13),
        reserved1 = UByteArray(3),
        dataBufCtorArg = MutPtr(0L),
        dataBufSize = 0,
        dataSize = 0,
        sfoParam = UtilitySavedataSFOParam(),
        icon0FileData = UtilitySavedataFileData(),
        icon1FileData = UtilitySavedataFileData(),
        pic1FileData = UtilitySavedataFileData(),
        snd0FileData = UtilitySavedataFileData(),
        newDataCtorArg = MutPtr(0L),
        focus = UtilitySavedataFocus.entries.first(),
        unknown2 = IntArray(4),
        key = UByteArray(16),
        unknown3 = UByteArray(20),
    )

    public companion object {
        public operator fun invoke(
            base: UtilityDialogCommon = UtilityDialogCommon(),
            mode: UtilitySavedataMode = UtilitySavedataMode.entries.first(),
            unknown1: Int = 0,
            overwrite: Int = 0,
            gameName: UByteArray = UByteArray(13),
            reserved: UByteArray = UByteArray(3),
            saveName: UByteArray = UByteArray(20),
            saveNameList: MutPtr<UByteArray> = MutPtr(0L),
            fileName: UByteArray = UByteArray(13),
            reserved1: UByteArray = UByteArray(3),
            dataBuf: MutPtr<CVoid> = MutPtr(0L),
            dataBufSize: Int = 0,
            dataSize: Int = 0,
            sfoParam: UtilitySavedataSFOParam = UtilitySavedataSFOParam(),
            icon0FileData: UtilitySavedataFileData = UtilitySavedataFileData(),
            icon1FileData: UtilitySavedataFileData = UtilitySavedataFileData(),
            pic1FileData: UtilitySavedataFileData = UtilitySavedataFileData(),
            snd0FileData: UtilitySavedataFileData = UtilitySavedataFileData(),
            newData: MutPtr<UtilitySavedataListSaveNewData> = MutPtr(0L),
            focus: UtilitySavedataFocus = UtilitySavedataFocus.entries.first(),
            unknown2: IntArray = IntArray(4),
            key: UByteArray = UByteArray(16),
            unknown3: UByteArray = UByteArray(20),
        ): SceUtilitySavedataParam =
            SceUtilitySavedataParam(
                base = base,
                mode = mode,
                unknown1 = unknown1,
                overwrite = overwrite,
                gameName = gameName,
                reserved = reserved,
                saveName = saveName,
                saveNameListCtorArg = saveNameList,
                fileName = fileName,
                reserved1 = reserved1,
                dataBufCtorArg = dataBuf,
                dataBufSize = dataBufSize,
                dataSize = dataSize,
                sfoParam = sfoParam,
                icon0FileData = icon0FileData,
                icon1FileData = icon1FileData,
                pic1FileData = pic1FileData,
                snd0FileData = snd0FileData,
                newDataCtorArg = newData,
                focus = focus,
                unknown2 = unknown2,
                key = key,
                unknown3 = unknown3,
            )
    }
}

public class SceNetAdhocctlPeerInfo internal constructor(
    nextCtorArg: MutPtr<SceNetAdhocctlPeerInfo>,
    public var nickname: UByteArray,
    public var mac: UByteArray,
    public var unknown: UByteArray,
    public var timestamp: UInt,
) {
    public var next: MutPtr<SceNetAdhocctlPeerInfo> = nextCtorArg
        internal set

    public constructor() : this(
        nextCtorArg = MutPtr(0L),
        nickname = UByteArray(128),
        mac = UByteArray(6),
        unknown = UByteArray(6),
        timestamp = 0u,
    )

    public operator fun component1(): MutPtr<SceNetAdhocctlPeerInfo> = this.next

    public operator fun component2(): UByteArray = this.nickname

    public operator fun component3(): UByteArray = this.mac

    public operator fun component4(): UByteArray = this.unknown

    public operator fun component5(): UInt = this.timestamp

    public fun copy(next: MutPtr<SceNetAdhocctlPeerInfo> = this.next, nickname: UByteArray = this.nickname, mac: UByteArray = this.mac, unknown: UByteArray = this.unknown, timestamp: UInt = this.timestamp): SceNetAdhocctlPeerInfo = SceNetAdhocctlPeerInfo(nextCtorArg = next, nickname = nickname, mac = mac, unknown = unknown, timestamp = timestamp)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceNetAdhocctlPeerInfo) return false
        if (this.next != other.next) return false
        if (!this.nickname.contentEquals(other.nickname)) return false
        if (!this.mac.contentEquals(other.mac)) return false
        if (!this.unknown.contentEquals(other.unknown)) return false
        if (this.timestamp != other.timestamp) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.next.hashCode()
        result = 31 * result + this.nickname.contentHashCode()
        result = 31 * result + this.mac.contentHashCode()
        result = 31 * result + this.unknown.contentHashCode()
        result = 31 * result + this.timestamp.hashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceNetAdhocctlPeerInfo> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceNetAdhocctlPeerInfo> {
                override val sizeBytes: Long = 152L
                override val alignBytes: Long = 8L
                override fun readNative(addr: Long): SceNetAdhocctlPeerInfo =
                    SceNetAdhocctlPeerInfo(
                        (
                            io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                                .mutPtrLayout<SceNetAdhocctlPeerInfo>(64)
                        ).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                        ).readNative(addr + 8L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 136L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 142L),
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).readNative(addr + 148L),
                    )
                override fun writeNative(addr: Long, value: SceNetAdhocctlPeerInfo) {
                    (
                        io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts
                            .mutPtrLayout<SceNetAdhocctlPeerInfo>(64)
                    ).writeNative(addr, value.next)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                    ).writeNative(addr + 8L, value.nickname)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 136L, value.mac)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 142L, value.unknown)
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U32).writeNative(addr + 148L, value.timestamp)
                }
            }

        public operator fun invoke(
            next: MutPtr<SceNetAdhocctlPeerInfo> = MutPtr(0L),
            nickname: UByteArray = UByteArray(128),
            mac: UByteArray = UByteArray(6),
            unknown: UByteArray = UByteArray(6),
            timestamp: UInt = 0u,
        ): SceNetAdhocctlPeerInfo =
            SceNetAdhocctlPeerInfo(
                nextCtorArg = next,
                nickname = nickname,
                mac = mac,
                unknown = unknown,
                timestamp = timestamp,
            )
    }
}

public data class SceNetAdhocctlParams(
    public var channel: Int = 0,
    public var name: UByteArray = UByteArray(8),
    public var bssid: UByteArray = UByteArray(6),
    public var nickname: UByteArray = UByteArray(128),
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is SceNetAdhocctlParams) return false
        if (this.channel != other.channel) return false
        if (!this.name.contentEquals(other.name)) return false
        if (!this.bssid.contentEquals(other.bssid)) return false
        if (!this.nickname.contentEquals(other.nickname)) return false
        return true
    }

    override fun hashCode(): Int {
        var result = this.channel.hashCode()
        result = 31 * result + this.name.contentHashCode()
        result = 31 * result + this.bssid.contentHashCode()
        result = 31 * result + this.nickname.contentHashCode()
        return result
    }

    public companion object {
        public fun typeLayout(): io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceNetAdhocctlParams> =
            object : io.github.kotlinmania.rustlang.core.mem.TypeLayout<SceNetAdhocctlParams> {
                override val sizeBytes: Long = 148L
                override val alignBytes: Long = 4L
                override fun readNative(addr: Long): SceNetAdhocctlParams =
                    SceNetAdhocctlParams(
                        (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).readNative(addr),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                        ).readNative(addr + 4L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                        ).readNative(addr + 12L),
                        (
                            io.github.kotlinmania.rustlang.core.mem
                                .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                        ).readNative(addr + 18L),
                    )
                override fun writeNative(addr: Long, value: SceNetAdhocctlParams) {
                    (io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.I32).writeNative(addr, value.channel)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (8).toInt())
                    ).writeNative(addr + 4L, value.name)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (6).toInt())
                    ).writeNative(addr + 12L, value.bssid)
                    (
                        io.github.kotlinmania.rustlang.core.mem
                            .FixedArrayTypeLayout(io.github.kotlinmania.rustlang.core.mem.PrimitiveLayouts.U8, (128).toInt())
                    ).writeNative(addr + 18L, value.nickname)
                }
            }
    }
}

public class SceNetApctlInfo(
    public var name: UByteArray = UByteArray(64),
    public var bssid: UByteArray = UByteArray(6),
    public var ssid: UByteArray = UByteArray(32),
    public var ssidLength: UInt = 0u,
    public var securityType: UInt = 0u,
    public var strength: UByte = 0u,
    public var channel: UByte = 0u,
    public var powerSave: UByte = 0u,
    public var ip: UByteArray = UByteArray(16),
    public var subNetMask: UByteArray = UByteArray(16),
    public var gateway: UByteArray = UByteArray(16),
    public var primaryDns: UByteArray = UByteArray(16),
    public var secondaryDns: UByteArray = UByteArray(16),
    public var useProxy: UInt = 0u,
    public var proxyUrl: UByteArray = UByteArray(128),
    public var proxyPort: UShort = 0u,
    public var eapType: UInt = 0u,
    public var startBrowser: UInt = 0u,
    public var wifisp: UInt = 0u,
)

public val INT_MIN: CInt = -2147483648.toInt()

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

public val THREAD_ATTR_USER: Int = 0x80000000.toInt()

public val THREAD_ATTR_USBWLAN: Int = 0xa0000000.toInt()

public val THREAD_ATTR_VSH: Int = 0xc0000000.toInt()

public val THREAD_ATTR_SCRATCH_SRAM: Int = 0x00008000

public val THREAD_ATTR_NO_FILLSTACK: Int = 0x00100000

public val THREAD_ATTR_CLEAR_STACK: Int = 0x00200000

public val EVENT_WAIT_MULTIPLE: Int = 0x200

public val EVENT_WAIT_AND: Int = 0

public val EVENT_WAIT_OR: Int = 1

public val EVENT_WAIT_CLEAR: Int = 0x20

public val POWER_INFO_POWER_SWITCH: Int = 0x80000000.toInt()

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

public val GU_PI: Float = 3.141593f

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

public val SYSTEM_REGISTRY: UByteArray = "/system".encodeToByteArray().toUByteArray()

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

public expect fun sceAudioChReserve(channel: Int, sampleCount: Int, format: AudioFormat): Int

public expect fun sceAudioChRelease(channel: Int): Int

public expect fun sceAudioOutput(channel: Int, vol: Int, buf: MutPtr<CVoid>): Int

public expect fun sceAudioOutputBlocking(channel: Int, vol: Int, buf: MutPtr<CVoid>): Int

public expect fun sceAudioOutputPanned(channel: Int, leftVol: Int, rightVol: Int, buf: MutPtr<CVoid>): Int

public expect fun sceAudioOutputPannedBlocking(channel: Int, leftVol: Int, rightVol: Int, buf: MutPtr<CVoid>): Int

public expect fun sceAudioGetChannelRestLen(channel: Int): Int

public expect fun sceAudioGetChannelRestLength(channel: Int): Int

public expect fun sceAudioSetChannelDataLen(channel: Int, sampleCount: Int): Int

public expect fun sceAudioChangeChannelConfig(channel: Int, format: AudioFormat): Int

public expect fun sceAudioChangeChannelVolume(channel: Int, leftVol: Int, rightVol: Int): Int

public expect fun sceAudioOutput2Reserve(sampleCount: Int): Int

public expect fun sceAudioOutput2Release(): Int

public expect fun sceAudioOutput2ChangeLength(sampleCount: Int): Int

public expect fun sceAudioOutput2OutputBlocking(vol: Int, buf: MutPtr<CVoid>): Int

public expect fun sceAudioOutput2GetRestSample(): Int

public expect fun sceAudioSRCChReserve(sampleCount: Int, freq: AudioOutputFrequency, channels: Int): Int

public expect fun sceAudioSRCChRelease(): Int

public expect fun sceAudioSRCOutputBlocking(vol: Int, buf: MutPtr<CVoid>): Int

public expect fun sceAudioInputInit(unknown1: Int, gain: Int, unknown2: Int): Int

public expect fun sceAudioInputInitEx(params: MutPtr<AudioInputParams>): Int

public expect fun sceAudioInputBlocking(sampleCount: Int, freq: AudioInputFrequency, buf: MutPtr<CVoid>)

public expect fun sceAudioInput(sampleCount: Int, freq: AudioInputFrequency, buf: MutPtr<CVoid>)

public expect fun sceAudioGetInputLength(): Int

public expect fun sceAudioWaitInputEnd(): Int

public expect fun sceAudioPollInputEnd(): Int

public expect fun sceAtracGetAtracID(uiCodecType: UInt): Int

public expect fun sceAtracSetDataAndGetID(buf: MutPtr<CVoid>, bufsize: ULong): Int

public expect fun sceAtracDecodeData(atracId: Int, outSamples: MutPtr<UShort>, outN: MutPtr<Int>, outEnd: MutPtr<Int>, outRemainFrame: MutPtr<Int>): Int

public expect fun sceAtracGetRemainFrame(atracId: Int, outRemainFrame: MutPtr<Int>): Int

public expect fun sceAtracGetStreamDataInfo(atracId: Int, writePointer: MutPtr<MutPtr<UByte>>, availableBytes: MutPtr<UInt>, readOffset: MutPtr<UInt>): Int

public expect fun sceAtracAddStreamData(atracId: Int, bytesToAdd: UInt): Int

public expect fun sceAtracGetBitrate(atracId: Int, outBitrate: MutPtr<Int>): Int

public expect fun sceAtracSetLoopNum(atracId: Int, nloops: Int): Int

public expect fun sceAtracReleaseAtracID(atracId: Int): Int

public expect fun sceAtracGetNextSample(atracId: Int, outN: MutPtr<Int>): Int

public expect fun sceAtracGetMaxSample(atracId: Int, outMax: MutPtr<Int>): Int

public expect fun sceAtracGetBufferInfoForReseting(atracId: Int, uiSample: UInt, pbufferInfo: MutPtr<Atrac3BufferInfo>): Int

public expect fun sceAtracGetChannel(atracId: Int, puiChannel: MutPtr<UInt>): Int

public expect fun sceAtracGetInternalErrorInfo(atracId: Int, piResult: MutPtr<Int>): Int

public expect fun sceAtracGetLoopStatus(atracId: Int, piLoopNum: MutPtr<Int>, puiLoopStatus: MutPtr<UInt>): Int

public expect fun sceAtracGetNextDecodePosition(atracId: Int, puiSamplePosition: MutPtr<UInt>): Int

public expect fun sceAtracGetSecondBufferInfo(atracId: Int, puiPosition: MutPtr<UInt>, puiDataByte: MutPtr<UInt>): Int

public expect fun sceAtracGetSoundSample(atracId: Int, piEndSample: MutPtr<Int>, piLoopStartSample: MutPtr<Int>, piLoopEndSample: MutPtr<Int>): Int

public expect fun sceAtracResetPlayPosition(atracId: Int, uiSample: UInt, uiWriteByteFirstBuf: UInt, uiWriteByteSecondBuf: UInt): Int

public expect fun sceAtracSetData(atracId: Int, pucBufferAddr: MutPtr<UByte>, uiBufferByte: UInt): Int

public expect fun sceAtracSetHalfwayBuffer(atracId: Int, pucBufferAddr: MutPtr<UByte>, uiReadByte: UInt, uiBufferByte: UInt): Int

public expect fun sceAtracSetHalfwayBufferAndGetID(pucBufferAddr: MutPtr<UByte>, uiReadByte: UInt, uiBufferByte: UInt): Int

public expect fun sceAtracSetSecondBuffer(atracId: Int, pucSecondBufferAddr: MutPtr<UByte>, uiSecondBufferByte: UInt): Int

public expect fun sceCtrlSetSamplingCycle(cycle: Int): Int

public expect fun sceCtrlGetSamplingCycle(pcycle: MutPtr<Int>): Int

public expect fun sceCtrlSetSamplingMode(mode: CtrlMode): Int

public expect fun sceCtrlGetSamplingMode(pmode: MutPtr<Int>): Int

public expect fun sceCtrlPeekBufferPositive(padData: MutPtr<SceCtrlData>, count: Int): Int

public expect fun sceCtrlPeekBufferNegative(padData: MutPtr<SceCtrlData>, count: Int): Int

public expect fun sceCtrlReadBufferPositive(padData: MutPtr<SceCtrlData>, count: Int): Int

public expect fun sceCtrlReadBufferNegative(padData: MutPtr<SceCtrlData>, count: Int): Int

public expect fun sceCtrlPeekLatch(latchData: MutPtr<SceCtrlLatch>): Int

public expect fun sceCtrlReadLatch(latchData: MutPtr<SceCtrlLatch>): Int

public expect fun sceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int

public expect fun sceCtrlGetIdleCancelThreshold(idlereset: MutPtr<Int>, idleback: MutPtr<Int>): Int

public expect fun sceDisplaySetMode(mode: DisplayMode, width: ULong, height: ULong): UInt

public expect fun sceDisplayGetMode(pmode: MutPtr<Int>, pwidth: MutPtr<Int>, pheight: MutPtr<Int>): Int

public expect fun sceDisplaySetFrameBuf(topAddr: ConstPtr<UByte>, bufferWidth: ULong, pixelFormat: DisplayPixelFormat, sync: DisplaySetBufSync): UInt

public expect fun sceDisplayGetFrameBuf(topAddr: MutPtr<MutPtr<CVoid>>, bufferWidth: MutPtr<ULong>, pixelFormat: MutPtr<DisplayPixelFormat>, sync: DisplaySetBufSync): Int

public expect fun sceDisplayGetVcount(): UInt

public expect fun sceDisplayWaitVblank(): Int

public expect fun sceDisplayWaitVblankCB(): Int

public expect fun sceDisplayWaitVblankStart(): Int

public expect fun sceDisplayWaitVblankStartCB(): Int

public expect fun sceDisplayGetAccumulatedHcount(): Int

public expect fun sceDisplayGetCurrentHcount(): Int

public expect fun sceDisplayGetFramePerSec(): Float

public expect fun sceDisplayIsForeground(): Int

public expect fun sceDisplayIsVblank(): Int

public expect fun sceGeEdramGetSize(): UInt

public expect fun sceGeEdramGetAddr(): MutPtr<UByte>

public expect fun sceGeEdramSetAddrTranslation(width: Int): Int

public expect fun sceGeGetCmd(cmd: Int): UInt

public expect fun sceGeGetMtx(type: GeMatrixType, matrix: MutPtr<CVoid>): Int

public expect fun sceGeGetStack(stackId: Int, stack: MutPtr<GeStack>): Int

public expect fun sceGeSaveContext(context: MutPtr<GeContext>): Int

public expect fun sceGeRestoreContext(context: ConstPtr<GeContext>): Int

public expect fun sceGeListEnQueue(list: ConstPtr<CVoid>, stall: MutPtr<CVoid>, cbid: Int, arg: MutPtr<GeListArgs>): Int

public expect fun sceGeListEnQueueHead(list: ConstPtr<CVoid>, stall: MutPtr<CVoid>, cbid: Int, arg: MutPtr<GeListArgs>): Int

public expect fun sceGeListDeQueue(qid: Int): Int

public expect fun sceGeListUpdateStallAddr(qid: Int, stall: MutPtr<CVoid>): Int

public expect fun sceGeListSync(qid: Int, syncType: Int): GeListState

public expect fun sceGeDrawSync(syncType: Int): GeListState

public expect fun sceGeBreak(mode: Int, pParam: MutPtr<GeBreakParam>): Int

public expect fun sceGeContinue(): Int

public expect fun sceGeSetCallback(cb: MutPtr<GeCallbackData>): Int

public expect fun sceGeUnsetCallback(cbid: Int): Int

public expect fun sceKernelExitGame()

public expect fun sceKernelRegisterExitCallback(id: SceUid): Int

public expect fun sceKernelLoadExec(file: ConstPtr<UByte>, param: MutPtr<SceKernelLoadExecParam>): Int

public expect fun sceKernelAllocPartitionMemory(partition: SceSysMemPartitionId, name: ConstPtr<UByte>, type: SceSysMemBlockTypes, size: UInt, addr: MutPtr<CVoid>): SceUid

public expect fun sceKernelGetBlockHeadAddr(blockid: SceUid): MutPtr<CVoid>

public expect fun sceKernelFreePartitionMemory(blockid: SceUid): Int

public expect fun sceKernelTotalFreeMemSize(): ULong

public expect fun sceKernelMaxFreeMemSize(): ULong

public expect fun sceKernelDevkitVersion(): UInt

public expect fun sceKernelSetCompiledSdkVersion(version: UInt): Int

public expect fun sceKernelGetCompiledSdkVersion(): UInt

public expect fun sceKernelLibcTime(t: MutPtr<Int>): Int

public expect fun sceKernelLibcClock(): UInt

public expect fun sceKernelLibcGettimeofday(tp: MutPtr<Timeval>, tzp: MutPtr<Timezone>): Int

public expect fun sceKernelDcacheWritebackAll()

public expect fun sceKernelDcacheWritebackInvalidateAll()

public expect fun sceKernelDcacheWritebackRange(p: ConstPtr<CVoid>, size: UInt)

public expect fun sceKernelDcacheWritebackInvalidateRange(p: ConstPtr<CVoid>, size: UInt)

public expect fun sceKernelDcacheInvalidateRange(p: ConstPtr<CVoid>, size: UInt)

public expect fun sceKernelIcacheInvalidateAll()

public expect fun sceKernelIcacheInvalidateRange(p: ConstPtr<CVoid>, size: UInt)

public expect fun sceKernelUtilsMt19937Init(ctx: MutPtr<SceKernelUtilsMt19937Context>, seed: UInt): Int

public expect fun sceKernelUtilsMt19937UInt(ctx: MutPtr<SceKernelUtilsMt19937Context>): UInt

public expect fun sceKernelUtilsMd5Digest(data: MutPtr<UByte>, size: UInt, digest: MutPtr<UByte>): Int

public expect fun sceKernelUtilsMd5BlockInit(ctx: MutPtr<SceKernelUtilsMd5Context>): Int

public expect fun sceKernelUtilsMd5BlockUpdate(ctx: MutPtr<SceKernelUtilsMd5Context>, data: MutPtr<UByte>, size: UInt): Int

public expect fun sceKernelUtilsMd5BlockResult(ctx: MutPtr<SceKernelUtilsMd5Context>, digest: MutPtr<UByte>): Int

public expect fun sceKernelUtilsSha1Digest(data: MutPtr<UByte>, size: UInt, digest: MutPtr<UByte>): Int

public expect fun sceKernelUtilsSha1BlockInit(ctx: MutPtr<SceKernelUtilsSha1Context>): Int

public expect fun sceKernelUtilsSha1BlockUpdate(ctx: MutPtr<SceKernelUtilsSha1Context>, data: MutPtr<UByte>, size: UInt): Int

public expect fun sceKernelUtilsSha1BlockResult(ctx: MutPtr<SceKernelUtilsSha1Context>, digest: MutPtr<UByte>): Int

public expect fun sceKernelRegisterSubIntrHandler(intNo: Int, no: Int, handler: MutPtr<CVoid>, arg: MutPtr<CVoid>): Int

public expect fun sceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int

public expect fun sceKernelEnableSubIntr(intNo: Int, no: Int): Int

public expect fun sceKernelDisableSubIntr(intNo: Int, no: Int): Int

public expect fun queryIntrHandlerInfo(intrCode: SceUid, subIntrCode: SceUid, data: MutPtr<IntrHandlerOptionParam>): Int

public expect fun sceKernelCpuSuspendIntr(): UInt

public expect fun sceKernelCpuResumeIntr(flags: UInt)

public expect fun sceKernelCpuResumeIntrWithSync(flags: UInt)

public expect fun sceKernelIsCpuIntrSuspended(flags: UInt): Int

public expect fun sceKernelIsCpuIntrEnable(): Int

public expect fun sceKernelLoadModule(path: ConstPtr<UByte>, flags: Int, option: MutPtr<SceKernelLMOption>): SceUid

public expect fun sceKernelLoadModuleMs(path: ConstPtr<UByte>, flags: Int, option: MutPtr<SceKernelLMOption>): SceUid

public expect fun sceKernelLoadModuleByID(fid: SceUid, flags: Int, option: MutPtr<SceKernelLMOption>): SceUid

public expect fun sceKernelLoadModuleBufferUsbWlan(bufSize: ULong, buf: MutPtr<CVoid>, flags: Int, option: MutPtr<SceKernelLMOption>): SceUid

public expect fun sceKernelStartModule(modId: SceUid, argSize: ULong, argp: MutPtr<CVoid>, status: MutPtr<Int>, option: MutPtr<SceKernelSMOption>): Int

public expect fun sceKernelStopModule(modId: SceUid, argSize: ULong, argp: MutPtr<CVoid>, status: MutPtr<Int>, option: MutPtr<SceKernelSMOption>): Int

public expect fun sceKernelUnloadModule(modId: SceUid): Int

public expect fun sceKernelSelfStopUnloadModule(unknown: Int, argSize: ULong, argp: MutPtr<CVoid>): Int

public expect fun sceKernelStopUnloadSelfModule(argSize: ULong, argp: MutPtr<CVoid>, status: MutPtr<Int>, option: MutPtr<SceKernelSMOption>): Int

public expect fun sceKernelQueryModuleInfo(modId: SceUid, info: MutPtr<SceKernelModuleInfo>): Int

public expect fun sceKernelGetModuleIdList(readBuf: MutPtr<SceUid>, readBufSize: Int, idCount: MutPtr<Int>): Int

public expect fun sceKernelVolatileMemLock(unk: Int, ptr: MutPtr<MutPtr<CVoid>>, size: MutPtr<Int>): Int

public expect fun sceKernelVolatileMemTryLock(unk: Int, ptr: MutPtr<MutPtr<CVoid>>, size: MutPtr<Int>): Int

public expect fun sceKernelVolatileMemUnlock(unk: Int): Int

public expect fun sceKernelStdin(): SceUid

public expect fun sceKernelStdout(): SceUid

public expect fun sceKernelStderr(): SceUid

public expect fun sceKernelGetThreadmanIdType(uid: SceUid): SceKernelIdListType

public expect fun sceKernelCreateThread(name: ConstPtr<UByte>, entry: SceKernelThreadEntry, initPriority: Int, stackSize: Int, attr: Int, option: MutPtr<SceKernelThreadOptParam>): SceUid

public expect fun sceKernelDeleteThread(thid: SceUid): Int

public expect fun sceKernelStartThread(id: SceUid, argLen: ULong, argP: MutPtr<CVoid>): Int

public expect fun sceKernelExitThread(status: Int): Int

public expect fun sceKernelExitDeleteThread(status: Int): Int

public expect fun sceKernelTerminateThread(thid: SceUid): Int

public expect fun sceKernelTerminateDeleteThread(thid: SceUid): Int

public expect fun sceKernelSuspendDispatchThread(): Int

public expect fun sceKernelResumeDispatchThread(state: Int): Int

public expect fun sceKernelSleepThread(): Int

public expect fun sceKernelSleepThreadCB(): Int

public expect fun sceKernelWakeupThread(thid: SceUid): Int

public expect fun sceKernelCancelWakeupThread(thid: SceUid): Int

public expect fun sceKernelSuspendThread(thid: SceUid): Int

public expect fun sceKernelResumeThread(thid: SceUid): Int

public expect fun sceKernelWaitThreadEnd(thid: SceUid, timeout: MutPtr<UInt>): Int

public expect fun sceKernelWaitThreadEndCB(thid: SceUid, timeout: MutPtr<UInt>): Int

public expect fun sceKernelDelayThread(delay: UInt): Int

public expect fun sceKernelDelayThreadCB(delay: UInt): Int

public expect fun sceKernelDelaySysClockThread(delay: MutPtr<SceKernelSysClock>): Int

public expect fun sceKernelDelaySysClockThreadCB(delay: MutPtr<SceKernelSysClock>): Int

public expect fun sceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int

public expect fun sceKernelChangeThreadPriority(thid: SceUid, priority: Int): Int

public expect fun sceKernelRotateThreadReadyQueue(priority: Int): Int

public expect fun sceKernelReleaseWaitThread(thid: SceUid): Int

public expect fun sceKernelGetThreadId(): Int

public expect fun sceKernelGetThreadCurrentPriority(): Int

public expect fun sceKernelGetThreadExitStatus(thid: SceUid): Int

public expect fun sceKernelCheckThreadStack(): Int

public expect fun sceKernelGetThreadStackFreeSize(thid: SceUid): Int

public expect fun sceKernelReferThreadStatus(thid: SceUid, info: MutPtr<SceKernelThreadInfo>): Int

public expect fun sceKernelReferThreadRunStatus(thid: SceUid, status: MutPtr<SceKernelThreadRunStatus>): Int

public expect fun sceKernelCreateSema(name: ConstPtr<UByte>, attr: UInt, initVal: Int, maxVal: Int, option: MutPtr<SceKernelSemaOptParam>): SceUid

public expect fun sceKernelDeleteSema(semaId: SceUid): Int

public expect fun sceKernelSignalSema(semaId: SceUid, signal: Int): Int

public expect fun sceKernelWaitSema(semaId: SceUid, signal: Int, timeout: MutPtr<UInt>): Int

public expect fun sceKernelWaitSemaCB(semaId: SceUid, signal: Int, timeout: MutPtr<UInt>): Int

public expect fun sceKernelPollSema(semaId: SceUid, signal: Int): Int

public expect fun sceKernelReferSemaStatus(semaId: SceUid, info: MutPtr<SceKernelSemaInfo>): Int

public expect fun sceKernelCreateEventFlag(name: ConstPtr<UByte>, attr: Int, bits: Int, opt: MutPtr<SceKernelEventFlagOptParam>): SceUid

public expect fun sceKernelSetEventFlag(evId: SceUid, bits: UInt): Int

public expect fun sceKernelClearEventFlag(evId: SceUid, bits: UInt): Int

public expect fun sceKernelPollEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: MutPtr<UInt>): Int

public expect fun sceKernelWaitEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: MutPtr<UInt>, timeout: MutPtr<UInt>): Int

public expect fun sceKernelWaitEventFlagCB(evId: SceUid, bits: UInt, wait: Int, outBits: MutPtr<UInt>, timeout: MutPtr<UInt>): Int

public expect fun sceKernelDeleteEventFlag(evId: SceUid): Int

public expect fun sceKernelReferEventFlagStatus(event: SceUid, status: MutPtr<SceKernelEventFlagInfo>): Int

public expect fun sceKernelCreateMbx(name: ConstPtr<UByte>, attr: UInt, option: MutPtr<SceKernelMbxOptParam>): SceUid

public expect fun sceKernelDeleteMbx(mbxId: SceUid): Int

public expect fun sceKernelSendMbx(mbxId: SceUid, message: MutPtr<CVoid>): Int

public expect fun sceKernelReceiveMbx(mbxId: SceUid, message: MutPtr<MutPtr<CVoid>>, timeout: MutPtr<UInt>): Int

public expect fun sceKernelReceiveMbxCB(mbxId: SceUid, message: MutPtr<MutPtr<CVoid>>, timeout: MutPtr<UInt>): Int

public expect fun sceKernelPollMbx(mbxId: SceUid, pmessage: MutPtr<MutPtr<CVoid>>): Int

public expect fun sceKernelCancelReceiveMbx(mbxId: SceUid, num: MutPtr<Int>): Int

public expect fun sceKernelReferMbxStatus(mbxId: SceUid, info: MutPtr<SceKernelMbxInfo>): Int

public expect fun sceKernelSetAlarm(clock: UInt, handler: SceKernelAlarmHandler, common: MutPtr<CVoid>): SceUid

public expect fun sceKernelSetSysClockAlarm(clock: MutPtr<SceKernelSysClock>, handler: MutPtr<SceKernelAlarmHandler>, common: MutPtr<CVoid>): SceUid

public expect fun sceKernelCancelAlarm(alarmId: SceUid): Int

public expect fun sceKernelReferAlarmStatus(alarmId: SceUid, info: MutPtr<SceKernelAlarmInfo>): Int

public expect fun sceKernelCreateCallback(name: ConstPtr<UByte>, func: SceKernelCallbackFunction, arg: MutPtr<CVoid>): SceUid

public expect fun sceKernelReferCallbackStatus(cb: SceUid, status: MutPtr<SceKernelCallbackInfo>): Int

public expect fun sceKernelDeleteCallback(cb: SceUid): Int

public expect fun sceKernelNotifyCallback(cb: SceUid, arg2: Int): Int

public expect fun sceKernelCancelCallback(cb: SceUid): Int

public expect fun sceKernelGetCallbackCount(cb: SceUid): Int

public expect fun sceKernelCheckCallback(): Int

public expect fun sceKernelGetThreadmanIdList(type: SceKernelIdListType, readBuf: MutPtr<SceUid>, readBufSize: Int, idCount: MutPtr<Int>): Int

public expect fun sceKernelReferSystemStatus(status: MutPtr<SceKernelSystemStatus>): Int

public expect fun sceKernelCreateMsgPipe(name: ConstPtr<UByte>, part: Int, attr: Int, unk1: MutPtr<CVoid>, opt: MutPtr<CVoid>): SceUid

public expect fun sceKernelDeleteMsgPipe(uid: SceUid): Int

public expect fun sceKernelSendMsgPipe(uid: SceUid, message: MutPtr<CVoid>, size: UInt, unk1: Int, unk2: MutPtr<CVoid>, timeout: MutPtr<UInt>): Int

public expect fun sceKernelSendMsgPipeCB(uid: SceUid, message: MutPtr<CVoid>, size: UInt, unk1: Int, unk2: MutPtr<CVoid>, timeout: MutPtr<UInt>): Int

public expect fun sceKernelTrySendMsgPipe(uid: SceUid, message: MutPtr<CVoid>, size: UInt, unk1: Int, unk2: MutPtr<CVoid>): Int

public expect fun sceKernelReceiveMsgPipe(uid: SceUid, message: MutPtr<CVoid>, size: UInt, unk1: Int, unk2: MutPtr<CVoid>, timeout: MutPtr<UInt>): Int

public expect fun sceKernelReceiveMsgPipeCB(uid: SceUid, message: MutPtr<CVoid>, size: UInt, unk1: Int, unk2: MutPtr<CVoid>, timeout: MutPtr<UInt>): Int

public expect fun sceKernelTryReceiveMsgPipe(uid: SceUid, message: MutPtr<CVoid>, size: UInt, unk1: Int, unk2: MutPtr<CVoid>): Int

public expect fun sceKernelCancelMsgPipe(uid: SceUid, send: MutPtr<Int>, recv: MutPtr<Int>): Int

public expect fun sceKernelReferMsgPipeStatus(uid: SceUid, info: MutPtr<SceKernelMppInfo>): Int

public expect fun sceKernelCreateVpl(name: ConstPtr<UByte>, part: Int, attr: Int, size: UInt, opt: MutPtr<SceKernelVplOptParam>): SceUid

public expect fun sceKernelDeleteVpl(uid: SceUid): Int

public expect fun sceKernelAllocateVpl(uid: SceUid, size: UInt, data: MutPtr<MutPtr<CVoid>>, timeout: MutPtr<UInt>): Int

public expect fun sceKernelAllocateVplCB(uid: SceUid, size: UInt, data: MutPtr<MutPtr<CVoid>>, timeout: MutPtr<UInt>): Int

public expect fun sceKernelTryAllocateVpl(uid: SceUid, size: UInt, data: MutPtr<MutPtr<CVoid>>): Int

public expect fun sceKernelFreeVpl(uid: SceUid, data: MutPtr<CVoid>): Int

public expect fun sceKernelCancelVpl(uid: SceUid, num: MutPtr<Int>): Int

public expect fun sceKernelReferVplStatus(uid: SceUid, info: MutPtr<SceKernelVplInfo>): Int

public expect fun sceKernelCreateFpl(name: ConstPtr<UByte>, part: Int, attr: Int, size: UInt, blocks: UInt, opt: MutPtr<SceKernelFplOptParam>): Int

public expect fun sceKernelDeleteFpl(uid: SceUid): Int

public expect fun sceKernelAllocateFpl(uid: SceUid, data: MutPtr<MutPtr<CVoid>>, timeout: MutPtr<UInt>): Int

public expect fun sceKernelAllocateFplCB(uid: SceUid, data: MutPtr<MutPtr<CVoid>>, timeout: MutPtr<UInt>): Int

public expect fun sceKernelTryAllocateFpl(uid: SceUid, data: MutPtr<MutPtr<CVoid>>): Int

public expect fun sceKernelFreeFpl(uid: SceUid, data: MutPtr<CVoid>): Int

public expect fun sceKernelCancelFpl(uid: SceUid, pnum: MutPtr<Int>): Int

public expect fun sceKernelReferFplStatus(uid: SceUid, info: MutPtr<SceKernelFplInfo>): Int

public expect fun sceKernelUSec2SysClock(usec: UInt, clock: MutPtr<SceKernelSysClock>): Int

public expect fun sceKernelUSec2SysClockWide(usec: UInt): Long

public expect fun sceKernelSysClock2USec(clock: MutPtr<SceKernelSysClock>, low: MutPtr<UInt>, high: MutPtr<UInt>): Int

public expect fun sceKernelSysClock2USecWide(clock: Long, low: MutPtr<UInt>, high: MutPtr<UInt>): Int

public expect fun sceKernelGetSystemTime(time: MutPtr<SceKernelSysClock>): Int

public expect fun sceKernelGetSystemTimeWide(): Long

public expect fun sceKernelGetSystemTimeLow(): UInt

public expect fun sceKernelCreateVTimer(name: ConstPtr<UByte>, opt: MutPtr<SceKernelVTimerOptParam>): SceUid

public expect fun sceKernelDeleteVTimer(uid: SceUid): Int

public expect fun sceKernelGetVTimerBase(uid: SceUid, base: MutPtr<SceKernelSysClock>): Int

public expect fun sceKernelGetVTimerBaseWide(uid: SceUid): Long

public expect fun sceKernelGetVTimerTime(uid: SceUid, time: MutPtr<SceKernelSysClock>): Int

public expect fun sceKernelGetVTimerTimeWide(uid: SceUid): Long

public expect fun sceKernelSetVTimerTime(uid: SceUid, time: MutPtr<SceKernelSysClock>): Int

public expect fun sceKernelSetVTimerTimeWide(uid: SceUid, time: Long): Long

public expect fun sceKernelStartVTimer(uid: SceUid): Int

public expect fun sceKernelStopVTimer(uid: SceUid): Int

public expect fun sceKernelSetVTimerHandler(uid: SceUid, time: MutPtr<SceKernelSysClock>, handler: SceKernelVTimerHandler, common: MutPtr<CVoid>): Int

public expect fun sceKernelSetVTimerHandlerWide(uid: SceUid, time: Long, handler: SceKernelVTimerHandlerWide, common: MutPtr<CVoid>): Int

public expect fun sceKernelCancelVTimerHandler(uid: SceUid): Int

public expect fun sceKernelReferVTimerStatus(uid: SceUid, info: MutPtr<SceKernelVTimerInfo>): Int

public expect fun sceKernelRegisterThreadEventHandler(name: ConstPtr<UByte>, threadId: SceUid, mask: Int, handler: SceKernelThreadEventHandler, common: MutPtr<CVoid>): SceUid

public expect fun sceKernelReleaseThreadEventHandler(uid: SceUid): Int

public expect fun sceKernelReferThreadEventHandlerStatus(uid: SceUid, info: MutPtr<SceKernelThreadEventHandlerInfo>): Int

public expect fun sceKernelReferThreadProfiler(): MutPtr<DebugProfilerRegs>

public expect fun sceKernelReferGlobalProfiler(): MutPtr<DebugProfilerRegs>

public expect fun sceUsbStart(driverName: ConstPtr<UByte>, size: Int, args: MutPtr<CVoid>): Int

public expect fun sceUsbStop(driverName: ConstPtr<UByte>, size: Int, args: MutPtr<CVoid>): Int

public expect fun sceUsbActivate(pid: UInt): Int

public expect fun sceUsbDeactivate(pid: UInt): Int

public expect fun sceUsbGetState(): Int

public expect fun sceUsbGetDrvState(driverName: ConstPtr<UByte>): Int

public expect fun sceUsbCamSetupStill(param: MutPtr<UsbCamSetupStillParam>): Int

public expect fun sceUsbCamSetupStillEx(param: MutPtr<UsbCamSetupStillExParam>): Int

public expect fun sceUsbCamStillInputBlocking(buf: MutPtr<UByte>, size: ULong): Int

public expect fun sceUsbCamStillInput(buf: MutPtr<UByte>, size: ULong): Int

public expect fun sceUsbCamStillWaitInputEnd(): Int

public expect fun sceUsbCamStillPollInputEnd(): Int

public expect fun sceUsbCamStillCancelInput(): Int

public expect fun sceUsbCamStillGetInputLength(): Int

public expect fun sceUsbCamSetupVideo(param: MutPtr<UsbCamSetupVideoParam>, workArea: MutPtr<CVoid>, workAreaSize: Int): Int

public expect fun sceUsbCamSetupVideoEx(param: MutPtr<UsbCamSetupVideoExParam>, workArea: MutPtr<CVoid>, workAreaSize: Int): Int

public expect fun sceUsbCamStartVideo(): Int

public expect fun sceUsbCamStopVideo(): Int

public expect fun sceUsbCamReadVideoFrameBlocking(buf: MutPtr<UByte>, size: ULong): Int

public expect fun sceUsbCamReadVideoFrame(buf: MutPtr<UByte>, size: ULong): Int

public expect fun sceUsbCamWaitReadVideoFrameEnd(): Int

public expect fun sceUsbCamPollReadVideoFrameEnd(): Int

public expect fun sceUsbCamGetReadVideoFrameSize(): Int

public expect fun sceUsbCamSetSaturation(saturation: Int): Int

public expect fun sceUsbCamSetBrightness(brightness: Int): Int

public expect fun sceUsbCamSetContrast(contrast: Int): Int

public expect fun sceUsbCamSetSharpness(sharpness: Int): Int

public expect fun sceUsbCamSetImageEffectMode(effectMode: UsbCamEffectMode): Int

public expect fun sceUsbCamSetEvLevel(exposureLevel: UsbCamEvLevel): Int

public expect fun sceUsbCamSetReverseMode(reverseFlags: Int): Int

public expect fun sceUsbCamSetZoom(zoom: Int): Int

public expect fun sceUsbCamGetSaturation(saturation: MutPtr<Int>): Int

public expect fun sceUsbCamGetBrightness(brightness: MutPtr<Int>): Int

public expect fun sceUsbCamGetContrast(contrast: MutPtr<Int>): Int

public expect fun sceUsbCamGetSharpness(sharpness: MutPtr<Int>): Int

public expect fun sceUsbCamGetImageEffectMode(effectMode: MutPtr<UsbCamEffectMode>): Int

public expect fun sceUsbCamGetEvLevel(exposureLevel: MutPtr<UsbCamEvLevel>): Int

public expect fun sceUsbCamGetReverseMode(reverseFlags: MutPtr<Int>): Int

public expect fun sceUsbCamGetZoom(zoom: MutPtr<Int>): Int

public expect fun sceUsbCamAutoImageReverseSW(on: Int): Int

public expect fun sceUsbCamGetAutoImageReverseState(): Int

public expect fun sceUsbCamGetLensDirection(): Int

public expect fun sceUsbstorBootRegisterNotify(eventFlag: SceUid): Int

public expect fun sceUsbstorBootUnregisterNotify(eventFlag: UInt): Int

public expect fun sceUsbstorBootSetCapacity(size: UInt): Int

public expect fun scePowerRegisterCallback(slot: Int, cbid: SceUid): Int

public expect fun scePowerUnregisterCallback(slot: Int): Int

public expect fun scePowerIsPowerOnline(): Int

public expect fun scePowerIsBatteryExist(): Int

public expect fun scePowerIsBatteryCharging(): Int

public expect fun scePowerGetBatteryChargingStatus(): Int

public expect fun scePowerIsLowBattery(): Int

public expect fun scePowerGetBatteryLifePercent(): Int

public expect fun scePowerGetBatteryLifeTime(): Int

public expect fun scePowerGetBatteryTemp(): Int

public expect fun scePowerGetBatteryElec(): Int

public expect fun scePowerGetBatteryVolt(): Int

public expect fun scePowerSetCpuClockFrequency(cpufreq: Int): Int

public expect fun scePowerSetBusClockFrequency(busfreq: Int): Int

public expect fun scePowerGetCpuClockFrequency(): Int

public expect fun scePowerGetCpuClockFrequencyInt(): Int

public expect fun scePowerGetCpuClockFrequencyFloat(): Float

public expect fun scePowerGetBusClockFrequency(): Int

public expect fun scePowerGetBusClockFrequencyInt(): Int

public expect fun scePowerGetBusClockFrequencyFloat(): Float

public expect fun scePowerSetClockFrequency(pllfreq: Int, cpufreq: Int, busfreq: Int): Int

public expect fun scePowerLock(unknown: Int): Int

public expect fun scePowerUnlock(unknown: Int): Int

public expect fun scePowerTick(t: PowerTick): Int

public expect fun scePowerGetIdleTimer(): Int

public expect fun scePowerIdleTimerEnable(unknown: Int): Int

public expect fun scePowerIdleTimerDisable(unknown: Int): Int

public expect fun scePowerRequestStandby(): Int

public expect fun scePowerRequestSuspend(): Int

public expect fun sceWlanDevIsPowerOn(): Int

public expect fun sceWlanGetSwitchState(): Int

public expect fun sceWlanGetEtherAddr(etherAddr: MutPtr<UByte>): Int

public expect fun sceWlanDevAttach(): Int

public expect fun sceWlanDevDetach(): Int

public expect fun sceRtcGetTickResolution(): UInt

public expect fun sceRtcGetCurrentTick(tick: MutPtr<ULong>): Int

public expect fun sceRtcGetCurrentClock(tm: MutPtr<ScePspDateTime>, tz: Int): Int

public expect fun sceRtcGetCurrentClockLocalTime(tm: MutPtr<ScePspDateTime>): Int

public expect fun sceRtcConvertUtcToLocalTime(tickUtc: ConstPtr<ULong>, tickLocal: MutPtr<ULong>): Int

public expect fun sceRtcConvertLocalTimeToUTC(tickLocal: ConstPtr<ULong>, tickUtc: MutPtr<ULong>): Int

public expect fun sceRtcIsLeapYear(year: Int): Int

public expect fun sceRtcGetDaysInMonth(year: Int, month: Int): Int

public expect fun sceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int

public expect fun sceRtcCheckValid(date: ConstPtr<ScePspDateTime>): Int

public expect fun sceRtcSetTick(date: MutPtr<ScePspDateTime>, tick: ConstPtr<ULong>): Int

public expect fun sceRtcGetTick(date: ConstPtr<ScePspDateTime>, tick: MutPtr<ULong>): Int

public expect fun sceRtcCompareTick(tick1: ConstPtr<ULong>, tick2: ConstPtr<ULong>): Int

public expect fun sceRtcTickAddTicks(destTick: MutPtr<ULong>, srcTick: ConstPtr<ULong>, numTicks: ULong): Int

public expect fun sceRtcTickAddMicroseconds(destTick: MutPtr<ULong>, srcTick: ConstPtr<ULong>, numMs: ULong): Int

public expect fun sceRtcTickAddSeconds(destTick: MutPtr<ULong>, srcTick: ConstPtr<ULong>, numSeconds: ULong): Int

public expect fun sceRtcTickAddMinutes(destTick: MutPtr<ULong>, srcTick: ConstPtr<ULong>, numMinutes: ULong): Int

public expect fun sceRtcTickAddHours(destTick: MutPtr<ULong>, srcTick: ConstPtr<ULong>, numHours: ULong): Int

public expect fun sceRtcTickAddDays(destTick: MutPtr<ULong>, srcTick: ConstPtr<ULong>, numDays: ULong): Int

public expect fun sceRtcTickAddWeeks(destTick: MutPtr<ULong>, srcTick: ConstPtr<ULong>, numWeeks: ULong): Int

public expect fun sceRtcTickAddMonths(destTick: MutPtr<ULong>, srcTick: ConstPtr<ULong>, numMonths: ULong): Int

public expect fun sceRtcTickAddYears(destTick: MutPtr<ULong>, srcTick: ConstPtr<ULong>, numYears: ULong): Int

public expect fun sceRtcSetTimeT(date: MutPtr<ScePspDateTime>, time: UInt): Int

public expect fun sceRtcGetTimeT(date: ConstPtr<ScePspDateTime>, time: MutPtr<UInt>): Int

public expect fun sceRtcSetTime64T(date: MutPtr<ScePspDateTime>, time: ULong): Int

public expect fun sceRtcGetTime64T(date: ConstPtr<ScePspDateTime>, time: MutPtr<ULong>): Int

public expect fun sceRtcSetDosTime(date: MutPtr<ScePspDateTime>, dosTime: UInt): Int

public expect fun sceRtcGetDosTime(date: MutPtr<ScePspDateTime>, dosTime: UInt): Int

public expect fun sceRtcSetWin32FileTime(date: MutPtr<ScePspDateTime>, time: MutPtr<ULong>): Int

public expect fun sceRtcGetWin32FileTime(date: MutPtr<ScePspDateTime>, time: MutPtr<ULong>): Int

public expect fun sceRtcParseDateTime(destTick: MutPtr<ULong>, dateString: ConstPtr<UByte>): Int

public expect fun sceRtcFormatRFC3339(pszDateTime: MutPtr<CChar>, pUtc: ConstPtr<ULong>, timeZoneMinutes: Int): Int

public expect fun sceRtcFormatRFC3339LocalTime(pszDateTime: MutPtr<CChar>, pUtc: ConstPtr<ULong>): Int

public expect fun sceRtcParseRFC3339(pUtc: MutPtr<ULong>, pszDateTime: ConstPtr<UByte>): Int

public expect fun sceRtcFormatRFC2822(pszDateTime: MutPtr<CChar>, pUtc: ConstPtr<ULong>, timeZoneMinutes: Int): Int

public expect fun sceRtcFormatRFC2822LocalTime(pszDateTime: MutPtr<CChar>, pUtc: ConstPtr<ULong>): Int

public expect fun sceIoOpen(file: ConstPtr<UByte>, flags: Int, permissions: IoPermissions): SceUid

public expect fun sceIoOpenAsync(file: ConstPtr<UByte>, flags: Int, permissions: IoPermissions): SceUid

public expect fun sceIoClose(fd: SceUid): Int

public expect fun sceIoCloseAsync(fd: SceUid): Int

public expect fun sceIoRead(fd: SceUid, data: MutPtr<CVoid>, size: UInt): Int

public expect fun sceIoReadAsync(fd: SceUid, data: MutPtr<CVoid>, size: UInt): Int

public expect fun sceIoWrite(fd: SceUid, data: ConstPtr<CVoid>, size: ULong): Int

public expect fun sceIoWriteAsync(fd: SceUid, data: ConstPtr<CVoid>, size: UInt): Int

public expect fun sceIoLseek(fd: SceUid, offset: Long, whence: IoWhence): Long

public expect fun sceIoLseekAsync(fd: SceUid, offset: Long, whence: IoWhence): Int

public expect fun sceIoLseek32(fd: SceUid, offset: Int, whence: IoWhence): Int

public expect fun sceIoLseek32Async(fd: SceUid, offset: Int, whence: IoWhence): Int

public expect fun sceIoRemove(file: ConstPtr<UByte>): Int

public expect fun sceIoMkdir(dir: ConstPtr<UByte>, mode: IoPermissions): Int

public expect fun sceIoRmdir(path: ConstPtr<UByte>): Int

public expect fun sceIoChdir(path: ConstPtr<UByte>): Int

public expect fun sceIoRename(oldname: ConstPtr<UByte>, newname: ConstPtr<UByte>): Int

public expect fun sceIoDopen(dirname: ConstPtr<UByte>): SceUid

public expect fun sceIoDread(fd: SceUid, dir: MutPtr<SceIoDirent>): Int

public expect fun sceIoDclose(fd: SceUid): Int

public expect fun sceIoDevctl(dev: ConstPtr<UByte>, cmd: UInt, indata: MutPtr<CVoid>, inlen: Int, outdata: MutPtr<CVoid>, outlen: Int): Int

public expect fun sceIoAssign(dev1: ConstPtr<UByte>, dev2: ConstPtr<UByte>, dev3: ConstPtr<UByte>, mode: IoAssignPerms, unk1: MutPtr<CVoid>, unk2: Int): Int

public expect fun sceIoUnassign(dev: ConstPtr<UByte>): Int

public expect fun sceIoGetstat(file: ConstPtr<UByte>, stat: MutPtr<SceIoStat>): Int

public expect fun sceIoChstat(file: ConstPtr<UByte>, stat: MutPtr<SceIoStat>, bits: Int): Int

public expect fun sceIoIoctl(fd: SceUid, cmd: UInt, indata: MutPtr<CVoid>, inlen: Int, outdata: MutPtr<CVoid>, outlen: Int): Int

public expect fun sceIoIoctlAsync(fd: SceUid, cmd: UInt, indata: MutPtr<CVoid>, inlen: Int, outdata: MutPtr<CVoid>, outlen: Int): Int

public expect fun sceIoSync(device: ConstPtr<UByte>, unk: UInt): Int

public expect fun sceIoWaitAsync(fd: SceUid, res: MutPtr<Long>): Int

public expect fun sceIoWaitAsyncCB(fd: SceUid, res: MutPtr<Long>): Int

public expect fun sceIoPollAsync(fd: SceUid, res: MutPtr<Long>): Int

public expect fun sceIoGetAsyncStat(fd: SceUid, poll: Int, res: MutPtr<Long>): Int

public expect fun sceIoCancel(fd: SceUid): Int

public expect fun sceIoGetDevType(fd: SceUid): Int

public expect fun sceIoChangeAsyncPriority(fd: SceUid, pri: Int): Int

public expect fun sceIoSetAsyncCallback(fd: SceUid, cb: SceUid, argp: MutPtr<CVoid>): Int

public expect fun sceJpegInitMJpeg(): Int

public expect fun sceJpegFinishMJpeg(): Int

public expect fun sceJpegCreateMJpeg(width: Int, height: Int): Int

public expect fun sceJpegDeleteMJpeg(): Int

public expect fun sceJpegDecodeMJpeg(jpegBuf: MutPtr<UByte>, size: ULong, rgba: MutPtr<CVoid>, unk: UInt): Int

public expect fun sceUmdCheckMedium(): Int

public expect fun sceUmdGetDiscInfo(info: MutPtr<UmdInfo>): Int

public expect fun sceUmdActivate(unit: Int, drive: ConstPtr<UByte>): Int

public expect fun sceUmdDeactivate(unit: Int, drive: ConstPtr<UByte>): Int

public expect fun sceUmdWaitDriveStat(state: Int): Int

public expect fun sceUmdWaitDriveStatWithTimer(state: Int, timeout: UInt): Int

public expect fun sceUmdWaitDriveStatCB(state: Int, timeout: UInt): Int

public expect fun sceUmdCancelWaitDriveStat(): Int

public expect fun sceUmdGetDriveStat(): Int

public expect fun sceUmdGetErrorStat(): Int

public expect fun sceUmdRegisterUMDCallBack(cbid: Int): Int

public expect fun sceUmdUnRegisterUMDCallBack(cbid: Int): Int

public expect fun sceUmdReplacePermit(): Int

public expect fun sceUmdReplaceProhibit(): Int

public expect fun sceMpegInit(): Int

public expect fun sceMpegFinish()

public expect fun sceMpegRingbufferQueryMemSize(packets: Int): Int

public expect fun sceMpegRingbufferConstruct(ringbuffer: MutPtr<SceMpegRingbuffer>, packets: Int, data: MutPtr<CVoid>, size: Int, callback: SceMpegRingbufferCb, cbParam: MutPtr<CVoid>): Int

public expect fun sceMpegRingbufferDestruct(ringbuffer: MutPtr<SceMpegRingbuffer>)

public expect fun sceMpegRingbufferAvailableSize(ringbuffer: MutPtr<SceMpegRingbuffer>): Int

public expect fun sceMpegRingbufferPut(ringbuffer: MutPtr<SceMpegRingbuffer>, numPackets: Int, available: Int): Int

public expect fun sceMpegQueryMemSize(unk: Int): Int

public expect fun sceMpegCreate(handle: SceMpeg, data: MutPtr<CVoid>, size: Int, ringbuffer: MutPtr<SceMpegRingbuffer>, frameWidth: Int, unk1: Int, unk2: Int): Int

public expect fun sceMpegDelete(handle: SceMpeg)

public expect fun sceMpegQueryStreamOffset(handle: SceMpeg, buffer: MutPtr<CVoid>, offset: MutPtr<Int>): Int

public expect fun sceMpegQueryStreamSize(buffer: MutPtr<CVoid>, size: MutPtr<Int>): Int

public expect fun sceMpegRegistStream(handle: SceMpeg, streamId: Int, unk: Int): SceMpegStream

public expect fun sceMpegUnRegistStream(handle: SceMpeg, stream: SceMpegStream)

public expect fun sceMpegFlushAllStream(handle: SceMpeg): Int

public expect fun sceMpegMallocAvcEsBuf(handle: SceMpeg): MutPtr<CVoid>

public expect fun sceMpegFreeAvcEsBuf(handle: SceMpeg, buf: MutPtr<CVoid>)

public expect fun sceMpegQueryAtracEsSize(handle: SceMpeg, esSize: MutPtr<Int>, outSize: MutPtr<Int>): Int

public expect fun sceMpegInitAu(handle: SceMpeg, esBuffer: MutPtr<CVoid>, au: MutPtr<SceMpegAu>): Int

public expect fun sceMpegGetAvcAu(handle: SceMpeg, stream: SceMpegStream, au: MutPtr<SceMpegAu>, unk: MutPtr<Int>): Int

public expect fun sceMpegAvcDecodeMode(handle: SceMpeg, mode: MutPtr<SceMpegAvcMode>): Int

public expect fun sceMpegAvcDecode(handle: SceMpeg, au: MutPtr<SceMpegAu>, iframeWidth: Int, buffer: MutPtr<CVoid>, init: MutPtr<Int>): Int

public expect fun sceMpegAvcDecodeStop(handle: SceMpeg, frameWidth: Int, buffer: MutPtr<CVoid>, status: MutPtr<Int>): Int

public expect fun sceMpegGetAtracAu(handle: SceMpeg, stream: SceMpegStream, au: MutPtr<SceMpegAu>, unk: MutPtr<CVoid>): Int

public expect fun sceMpegAtracDecode(handle: SceMpeg, au: MutPtr<SceMpegAu>, buffer: MutPtr<CVoid>, init: Int): Int

public expect fun sceMpegBaseYCrCbCopyVme(yuvBuffer: MutPtr<CVoid>, buffer: MutPtr<Int>, type: Int): Int

public expect fun sceMpegBaseCscInit(width: Int): Int

public expect fun sceMpegBaseCscVme(rgbBuffer: MutPtr<CVoid>, rgbBuffer2: MutPtr<CVoid>, width: Int, yCrCbBuffer: MutPtr<SceMpegYCrCbBuffer>): Int

public expect fun sceMpegbaseBea18f91(lli: MutPtr<SceMpegLLI>): Int

public expect fun sceHprmPeekCurrentKey(key: MutPtr<Int>): Int

public expect fun sceHprmPeekLatch(latch: MutPtr<UIntArray>): Int

public expect fun sceHprmReadLatch(latch: MutPtr<UIntArray>): Int

public expect fun sceHprmIsHeadphoneExist(): Int

public expect fun sceHprmIsRemoteExist(): Int

public expect fun sceHprmIsMicrophoneExist(): Int

public expect fun sceGuDepthBuffer(zbp: MutPtr<CVoid>, zbw: Int)

public expect fun sceGuDispBuffer(width: Int, height: Int, dispbp: MutPtr<CVoid>, dispbw: Int)

public expect fun sceGuDrawBuffer(psm: DisplayPixelFormat, fbp: MutPtr<CVoid>, fbw: Int)

public expect fun sceGuDrawBufferList(psm: DisplayPixelFormat, fbp: MutPtr<CVoid>, fbw: Int)

public expect fun sceGuDisplay(state: Boolean): Boolean

public expect fun sceGuDepthFunc(function: DepthFunc)

public expect fun sceGuDepthMask(mask: Int)

public expect fun sceGuDepthOffset(offset: Int)

public expect fun sceGuDepthRange(near: Int, far: Int)

public expect fun sceGuFog(near: Float, far: Float, color: UInt)

public expect fun sceGuInit()

public expect fun sceGuTerm()

public expect fun sceGuBreak(mode: Int)

public expect fun sceGuContinue()

public expect fun sceGuSetCallback(signal: GuCallbackId, callback: GuCallback): GuCallback

public expect fun sceGuSignal(behavior: SignalBehavior, signal: Int)

public expect fun sceGuSendCommandf(cmd: GeCommand, argument: Float)

public expect fun sceGuSendCommandi(cmd: GeCommand, argument: Int)

public expect fun sceGuGetMemory(size: Int): MutPtr<CVoid>

public expect fun sceGuStart(contextType: GuContextType, list: MutPtr<CVoid>)

public expect fun sceGuFinish(): Int

public expect fun sceGuFinishId(id: UInt): Int

public expect fun sceGuCallList(list: ConstPtr<CVoid>)

public expect fun sceGuCallMode(mode: Int)

public expect fun sceGuCheckList(): Int

public expect fun sceGuSendList(mode: GuQueueMode, list: ConstPtr<CVoid>, context: MutPtr<GeContext>)

public expect fun sceGuSwapBuffers(): MutPtr<CVoid>

public expect fun sceGuSync(mode: GuSyncMode, behavior: GuSyncBehavior): GeListState

public expect fun sceGuDrawArray(prim: GuPrimitive, vtype: Int, count: Int, indices: ConstPtr<CVoid>, vertices: ConstPtr<CVoid>)

public expect fun sceGuBeginObject(vtype: Int, count: Int, indices: ConstPtr<CVoid>, vertices: ConstPtr<CVoid>)

public expect fun sceGuEndObject()

public expect fun sceGuSetStatus(state: GuState, status: Int)

public expect fun sceGuGetStatus(state: GuState): Boolean

public expect fun sceGuSetAllStatus(status: Int)

public expect fun sceGuGetAllStatus(): Int

public expect fun sceGuEnable(state: GuState)

public expect fun sceGuDisable(state: GuState)

public expect fun sceGuLight(light: Int, type: LightType, components: Int, position: ScePspFVector3)

public expect fun sceGuLightAtt(light: Int, atten0: Float, atten1: Float, atten2: Float)

public expect fun sceGuLightColor(light: Int, component: Int, color: UInt)

public expect fun sceGuLightMode(mode: LightMode)

public expect fun sceGuLightSpot(light: Int, direction: ScePspFVector3, exponent: Float, cutoff: Float)

public expect fun sceGuClear(flags: Int)

public expect fun sceGuClearColor(color: UInt)

public expect fun sceGuClearDepth(depth: UInt)

public expect fun sceGuClearStencil(stencil: UInt)

public expect fun sceGuPixelMask(mask: UInt)

public expect fun sceGuColor(color: UInt)

public expect fun sceGuColorFunc(func: ColorFunc, color: UInt, mask: UInt)

public expect fun sceGuColorMaterial(components: Int)

public expect fun sceGuAlphaFunc(func: AlphaFunc, value: Int, mask: Int)

public expect fun sceGuAmbient(color: UInt)

public expect fun sceGuAmbientColor(color: UInt)

public expect fun sceGuBlendFunc(op: BlendOp, src: BlendSrc, dest: BlendDst, srcFix: UInt, destFix: UInt)

public expect fun sceGuMaterial(components: Int, color: UInt)

public expect fun sceGuModelColor(emissive: UInt, ambient: UInt, diffuse: UInt, specular: UInt)

public expect fun sceGuStencilFunc(func: StencilFunc, ref: Int, mask: Int)

public expect fun sceGuStencilOp(fail: StencilOperation, zfail: StencilOperation, zpass: StencilOperation)

public expect fun sceGuSpecular(power: Float)

public expect fun sceGuFrontFace(order: FrontFaceDirection)

public expect fun sceGuLogicalOp(op: LogicalOperation)

public expect fun sceGuSetDither(matrix: ScePspIMatrix4)

public expect fun sceGuShadeModel(mode: ShadingModel)

public expect fun sceGuCopyImage(psm: DisplayPixelFormat, sx: Int, sy: Int, width: Int, height: Int, srcw: Int, src: MutPtr<CVoid>, dx: Int, dy: Int, destw: Int, dest: MutPtr<CVoid>)

public expect fun sceGuTexEnvColor(color: UInt)

public expect fun sceGuTexFilter(min: TextureFilter, mag: TextureFilter)

public expect fun sceGuTexFlush()

public expect fun sceGuTexFunc(tfx: TextureEffect, tcc: TextureColorComponent)

public expect fun sceGuTexImage(mipmap: MipmapLevel, width: Int, height: Int, tbw: Int, tbp: ConstPtr<CVoid>)

public expect fun sceGuTexLevelMode(mode: TextureLevelMode, bias: Float)

public expect fun sceGuTexMapMode(mode: TextureMapMode, a1: UInt, a2: UInt)

public expect fun sceGuTexMode(tpsm: TexturePixelFormat, maxmips: Int, a2: Int, swizzle: Int)

public expect fun sceGuTexOffset(u: Float, v: Float)

public expect fun sceGuTexProjMapMode(mode: TextureProjectionMapMode)

public expect fun sceGuTexScale(u: Float, v: Float)

public expect fun sceGuTexSlope(slope: Float)

public expect fun sceGuTexSync()

public expect fun sceGuTexWrap(u: GuTexWrapMode, v: GuTexWrapMode)

public expect fun sceGuClutLoad(numBlocks: Int, cbp: ConstPtr<CVoid>)

public expect fun sceGuClutMode(cpsm: ClutPixelFormat, shift: UInt, mask: UInt, a3: UInt)

public expect fun sceGuOffset(x: UInt, y: UInt)

public expect fun sceGuScissor(x: Int, y: Int, w: Int, h: Int)

public expect fun sceGuViewport(cx: Int, cy: Int, width: Int, height: Int)

public expect fun sceGuDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: ConstPtr<CVoid>, vertices: ConstPtr<CVoid>)

public expect fun sceGuPatchDivide(ulevel: UInt, vlevel: UInt)

public expect fun sceGuPatchFrontFace(a0: UInt)

public expect fun sceGuPatchPrim(prim: PatchPrimitive)

public expect fun sceGuDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: ConstPtr<CVoid>, vertices: ConstPtr<CVoid>)

public expect fun sceGuSetMatrix(type: MatrixMode, matrix: ScePspFMatrix4)

public expect fun sceGuBoneMatrix(index: UInt, matrix: ScePspFMatrix4)

public expect fun sceGuMorphWeight(index: Int, weight: Float)

public expect fun sceGuDrawArrayN(primitiveType: GuPrimitive, vType: Int, count: Int, a3: Int, indices: ConstPtr<CVoid>, vertices: ConstPtr<CVoid>)

public expect fun sceGumDrawArray(prim: GuPrimitive, vType: Int, count: Int, indices: ConstPtr<CVoid>, vertices: ConstPtr<CVoid>)

public expect fun sceGumDrawArrayN(prim: GuPrimitive, vType: Int, count: Int, a3: Int, indices: ConstPtr<CVoid>, vertices: ConstPtr<CVoid>)

public expect fun sceGumDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: ConstPtr<CVoid>, vertices: ConstPtr<CVoid>)

public expect fun sceGumDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: ConstPtr<CVoid>, vertices: ConstPtr<CVoid>)

public expect fun sceGumFastInverse()

public expect fun sceGumFullInverse()

public expect fun sceGumLoadIdentity()

public expect fun sceGumLoadMatrix(m: ScePspFMatrix4)

public expect fun sceGumLookAt(eye: ScePspFVector3, center: ScePspFVector3, up: ScePspFVector3)

public expect fun sceGumMatrixMode(mode: MatrixMode)

public expect fun sceGumMultMatrix(m: ScePspFMatrix4)

public expect fun sceGumOrtho(left: Float, right: Float, bottom: Float, top: Float, near: Float, far: Float)

public expect fun sceGumPerspective(fovy: Float, aspect: Float, near: Float, far: Float)

public expect fun sceGumPopMatrix()

public expect fun sceGumPushMatrix()

public expect fun sceGumRotateX(angle: Float)

public expect fun sceGumRotateY(angle: Float)

public expect fun sceGumRotateZ(angle: Float)

public expect fun sceGumRotateXYZ(v: ScePspFVector3)

public expect fun sceGumRotateZYX(v: ScePspFVector3)

public expect fun sceGumScale(v: ScePspFVector3)

public expect fun sceGumStoreMatrix(m: ScePspFMatrix4)

public expect fun sceGumTranslate(v: ScePspFVector3)

public expect fun sceGumUpdateMatrix()

public expect fun sceMp3ReserveMp3Handle(args: MutPtr<SceMp3InitArg>): Int

public expect fun sceMp3ReleaseMp3Handle(handle: Mp3Handle): Int

public expect fun sceMp3InitResource(): Int

public expect fun sceMp3TermResource(): Int

public expect fun sceMp3Init(handle: Mp3Handle): Int

public expect fun sceMp3Decode(handle: Mp3Handle, dst: MutPtr<MutPtr<Short>>): Int

public expect fun sceMp3GetInfoToAddStreamData(handle: Mp3Handle, dst: MutPtr<MutPtr<UByte>>, toWrite: MutPtr<Int>, srcPos: MutPtr<Int>): Int

public expect fun sceMp3NotifyAddStreamData(handle: Mp3Handle, size: Int): Int

public expect fun sceMp3CheckStreamDataNeeded(handle: Mp3Handle): Int

public expect fun sceMp3SetLoopNum(handle: Mp3Handle, loop: Int): Int

public expect fun sceMp3GetLoopNum(handle: Mp3Handle): Int

public expect fun sceMp3GetSumDecodedSample(handle: Mp3Handle): Int

public expect fun sceMp3GetMaxOutputSample(handle: Mp3Handle): Int

public expect fun sceMp3GetSamplingRate(handle: Mp3Handle): Int

public expect fun sceMp3GetBitRate(handle: Mp3Handle): Int

public expect fun sceMp3GetMp3ChannelNum(handle: Mp3Handle): Int

public expect fun sceMp3ResetPlayPosition(handle: Mp3Handle): Int

public expect fun sceRegOpenRegistry(reg: MutPtr<Key>, mode: Int, handle: MutPtr<RegHandle>): Int

public expect fun sceRegFlushRegistry(handle: RegHandle): Int

public expect fun sceRegCloseRegistry(handle: RegHandle): Int

public expect fun sceRegOpenCategory(handle: RegHandle, name: ConstPtr<UByte>, mode: Int, dirHandle: MutPtr<RegHandle>): Int

public expect fun sceRegRemoveCategory(handle: RegHandle, name: ConstPtr<UByte>): Int

public expect fun sceRegCloseCategory(dirHandle: RegHandle): Int

public expect fun sceRegFlushCategory(dirHandle: RegHandle): Int

public expect fun sceRegGetKeyInfo(dirHandle: RegHandle, name: ConstPtr<UByte>, keyHandle: MutPtr<RegHandle>, type: MutPtr<KeyType>, size: MutPtr<ULong>): Int

public expect fun sceRegGetKeyInfoByName(dirHandle: RegHandle, name: ConstPtr<UByte>, type: MutPtr<KeyType>, size: MutPtr<ULong>): Int

public expect fun sceRegGetKeyValue(dirHandle: RegHandle, keyHandle: RegHandle, buf: MutPtr<CVoid>, size: ULong): Int

public expect fun sceRegGetKeyValueByName(dirHandle: RegHandle, name: ConstPtr<UByte>, buf: MutPtr<CVoid>, size: ULong): Int

public expect fun sceRegSetKeyValue(dirHandle: RegHandle, name: ConstPtr<UByte>, buf: ConstPtr<CVoid>, size: ULong): Int

public expect fun sceRegGetKeysNum(dirHandle: RegHandle, num: MutPtr<Int>): Int

public expect fun sceRegGetKeys(dirHandle: RegHandle, buf: MutPtr<UByte>, num: Int): Int

public expect fun sceRegCreateKey(dirHandle: RegHandle, name: ConstPtr<UByte>, type: Int, size: ULong): Int

public expect fun sceRegRemoveRegistry(key: MutPtr<Key>): Int

public expect fun sceOpenPSIDGetOpenPSID(openpsid: MutPtr<OpenPSID>): Int

public expect fun sceUtilityMsgDialogInitStart(params: MutPtr<UtilityMsgDialogParams>): Int

public expect fun sceUtilityMsgDialogShutdownStart()

public expect fun sceUtilityMsgDialogGetStatus(): Int

public expect fun sceUtilityMsgDialogUpdate(n: Int)

public expect fun sceUtilityMsgDialogAbort(): Int

public expect fun sceUtilityNetconfInitStart(data: MutPtr<UtilityNetconfData>): Int

public expect fun sceUtilityNetconfShutdownStart(): Int

public expect fun sceUtilityNetconfUpdate(unknown: Int): Int

public expect fun sceUtilityNetconfGetStatus(): Int

public expect fun sceUtilityCheckNetParam(id: Int): Int

public expect fun sceUtilityGetNetParam(conf: Int, param: NetParam, data: MutPtr<UtilityNetData>): Int

public expect fun sceUtilitySavedataInitStart(params: MutPtr<SceUtilitySavedataParam>): Int

public expect fun sceUtilitySavedataGetStatus(): Int

public expect fun sceUtilitySavedataShutdownStart(): Int

public expect fun sceUtilitySavedataUpdate(unknown: Int)

public expect fun sceUtilityGameSharingInitStart(params: MutPtr<UtilityGameSharingParams>): Int

public expect fun sceUtilityGameSharingShutdownStart()

public expect fun sceUtilityGameSharingGetStatus(): Int

public expect fun sceUtilityGameSharingUpdate(n: Int)

public expect fun sceUtilityHtmlViewerInitStart(params: MutPtr<UtilityHtmlViewerParam>): Int

public expect fun sceUtilityHtmlViewerShutdownStart(): Int

public expect fun sceUtilityHtmlViewerUpdate(n: Int): Int

public expect fun sceUtilityHtmlViewerGetStatus(): Int

public expect fun sceUtilitySetSystemParamInt(id: SystemParamId, value: Int): Int

public expect fun sceUtilitySetSystemParamString(id: SystemParamId, str: ConstPtr<UByte>): Int

public expect fun sceUtilityGetSystemParamInt(id: SystemParamId, value: MutPtr<Int>): Int

public expect fun sceUtilityGetSystemParamString(id: SystemParamId, str: MutPtr<UByte>, len: Int): Int

public expect fun sceUtilityOskInitStart(params: MutPtr<SceUtilityOskParams>): Int

public expect fun sceUtilityOskShutdownStart(): Int

public expect fun sceUtilityOskUpdate(n: Int): Int

public expect fun sceUtilityOskGetStatus(): Int

public expect fun sceUtilityLoadNetModule(module: NetModule): Int

public expect fun sceUtilityUnloadNetModule(module: NetModule): Int

public expect fun sceUtilityLoadAvModule(module: AvModule): Int

public expect fun sceUtilityUnloadAvModule(module: AvModule): Int

public expect fun sceUtilityLoadUsbModule(module: UsbModule): Int

public expect fun sceUtilityUnloadUsbModule(module: UsbModule): Int

public expect fun sceUtilityLoadModule(module: Module): Int

public expect fun sceUtilityUnloadModule(module: Module): Int

public expect fun sceUtilityCreateNetParam(conf: Int): Int

public expect fun sceUtilitySetNetParam(param: NetParam, value: ConstPtr<CVoid>): Int

public expect fun sceUtilityCopyNetParam(src: Int, dest: Int): Int

public expect fun sceUtilityDeleteNetParam(conf: Int): Int

public expect fun sceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int

public expect fun sceNetTerm(): Int

public expect fun sceNetFreeThreadinfo(thid: Int): Int

public expect fun sceNetThreadAbort(thid: Int): Int

public expect fun sceNetEtherStrton(name: MutPtr<UByte>, mac: MutPtr<UByte>)

public expect fun sceNetEtherNtostr(mac: MutPtr<UByte>, name: MutPtr<UByte>)

public expect fun sceNetGetLocalEtherAddr(mac: MutPtr<UByte>): Int

public expect fun sceNetGetMallocStat(stat: MutPtr<SceNetMallocStat>): Int

public expect fun sceNetAdhocctlInit(stacksize: Int, priority: Int, adhocId: MutPtr<SceNetAdhocctlAdhocId>): Int

public expect fun sceNetAdhocctlTerm(): Int

public expect fun sceNetAdhocctlConnect(name: ConstPtr<UByte>): Int

public expect fun sceNetAdhocctlDisconnect(): Int

public expect fun sceNetAdhocctlGetState(event: MutPtr<Int>): Int

public expect fun sceNetAdhocctlCreate(name: ConstPtr<UByte>): Int

public expect fun sceNetAdhocctlJoin(scaninfo: MutPtr<SceNetAdhocctlScanInfo>): Int

public expect fun sceNetAdhocctlGetAdhocId(id: MutPtr<SceNetAdhocctlAdhocId>): Int

public expect fun sceNetAdhocctlCreateEnterGameMode(name: ConstPtr<UByte>, unknown: Int, num: Int, macs: MutPtr<UByte>, timeout: UInt, unknown2: Int): Int

public expect fun sceNetAdhocctlJoinEnterGameMode(name: ConstPtr<UByte>, hostmac: MutPtr<UByte>, timeout: UInt, unknown: Int): Int

public expect fun sceNetAdhocctlGetGameModeInfo(gamemodeinfo: MutPtr<SceNetAdhocctlGameModeInfo>): Int

public expect fun sceNetAdhocctlExitGameMode(): Int

public expect fun sceNetAdhocctlGetPeerList(length: MutPtr<Int>, buf: MutPtr<CVoid>): Int

public expect fun sceNetAdhocctlGetPeerInfo(mac: MutPtr<UByte>, size: Int, peerinfo: MutPtr<SceNetAdhocctlPeerInfo>): Int

public expect fun sceNetAdhocctlScan(): Int

public expect fun sceNetAdhocctlGetScanInfo(length: MutPtr<Int>, buf: MutPtr<CVoid>): Int

public expect fun sceNetAdhocctlAddHandler(handler: SceNetAdhocctlHandler, unknown: MutPtr<CVoid>): Int

public expect fun sceNetAdhocctlDelHandler(id: Int): Int

public expect fun sceNetAdhocctlGetNameByAddr(mac: MutPtr<UByte>, nickname: MutPtr<UByte>): Int

public expect fun sceNetAdhocctlGetAddrByName(nickname: MutPtr<UByte>, length: MutPtr<Int>, buf: MutPtr<CVoid>): Int

public expect fun sceNetAdhocctlGetParameter(params: MutPtr<SceNetAdhocctlParams>): Int

public expect fun sceNetAdhocInit(): Int

public expect fun sceNetAdhocTerm(): Int

public expect fun sceNetAdhocPdpCreate(mac: MutPtr<UByte>, port: UShort, bufSize: UInt, unk1: Int): Int

public expect fun sceNetAdhocPdpDelete(id: Int, unk1: Int): Int

public expect fun sceNetAdhocPdpSend(id: Int, destMacAddr: MutPtr<UByte>, port: UShort, data: MutPtr<CVoid>, len: UInt, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocPdpRecv(id: Int, srcMacAddr: MutPtr<UByte>, port: MutPtr<UShort>, data: MutPtr<CVoid>, dataLength: MutPtr<CVoid>, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocGetPdpStat(size: MutPtr<Int>, stat: MutPtr<SceNetAdhocPdpStat>): Int

public expect fun sceNetAdhocGameModeCreateMaster(data: MutPtr<CVoid>, size: Int): Int

public expect fun sceNetAdhocGameModeCreateReplica(mac: MutPtr<UByte>, data: MutPtr<CVoid>, size: Int): Int

public expect fun sceNetAdhocGameModeUpdateMaster(): Int

public expect fun sceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int

public expect fun sceNetAdhocGameModeDeleteMaster(): Int

public expect fun sceNetAdhocGameModeDeleteReplica(id: Int): Int

public expect fun sceNetAdhocPtpOpen(srcmac: MutPtr<UByte>, srcport: UShort, destmac: MutPtr<UByte>, destport: UShort, bufSize: UInt, delay: UInt, count: Int, unk1: Int): Int

public expect fun sceNetAdhocPtpConnect(id: Int, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocPtpListen(srcmac: MutPtr<UByte>, srcport: UShort, bufSize: UInt, delay: UInt, count: Int, queue: Int, unk1: Int): Int

public expect fun sceNetAdhocPtpAccept(id: Int, mac: MutPtr<UByte>, port: MutPtr<UShort>, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocPtpSend(id: Int, data: MutPtr<CVoid>, dataSize: MutPtr<Int>, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocPtpRecv(id: Int, data: MutPtr<CVoid>, dataSize: MutPtr<Int>, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocPtpFlush(id: Int, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocPtpClose(id: Int, unk1: Int): Int

public expect fun sceNetAdhocGetPtpStat(size: MutPtr<Int>, stat: MutPtr<SceNetAdhocPtpStat>): Int

public expect fun sceNetAdhocMatchingInit(memsize: Int): Int

public expect fun sceNetAdhocMatchingTerm(): Int

public expect fun sceNetAdhocMatchingCreate(mode: AdhocMatchingMode, maxPeers: Int, port: UShort, bufSize: Int, helloDelay: UInt, pingDelay: UInt, initCount: Int, msgDelay: UInt, callback: AdhocMatchingCallback): Int

public expect fun sceNetAdhocMatchingDelete(matchingId: Int): Int

public expect fun sceNetAdhocMatchingStart(matchingId: Int, evthPri: Int, evthStack: Int, inthPri: Int, inthStack: Int, optLen: Int, optData: MutPtr<CVoid>): Int

public expect fun sceNetAdhocMatchingStop(matchingId: Int): Int

public expect fun sceNetAdhocMatchingSelectTarget(matchingId: Int, mac: MutPtr<UByte>, optLen: Int, optData: MutPtr<CVoid>): Int

public expect fun sceNetAdhocMatchingCancelTarget(matchingId: Int, mac: MutPtr<UByte>): Int

public expect fun sceNetAdhocMatchingCancelTargetWithOpt(matchingId: Int, mac: MutPtr<UByte>, optLen: Int, optData: MutPtr<CVoid>): Int

public expect fun sceNetAdhocMatchingSendData(matchingId: Int, mac: MutPtr<UByte>, dataLen: Int, data: MutPtr<CVoid>): Int

public expect fun sceNetAdhocMatchingAbortSendData(matchingId: Int, mac: MutPtr<UByte>): Int

public expect fun sceNetAdhocMatchingSetHelloOpt(matchingId: Int, optLen: Int, optData: MutPtr<CVoid>): Int

public expect fun sceNetAdhocMatchingGetHelloOpt(matchingId: Int, optLen: MutPtr<Int>, optData: MutPtr<CVoid>): Int

public expect fun sceNetAdhocMatchingGetMembers(matchingId: Int, length: MutPtr<Int>, buf: MutPtr<CVoid>): Int

public expect fun sceNetAdhocMatchingGetPoolMaxAlloc(): Int

public expect fun sceNetAdhocMatchingGetPoolStat(poolstat: MutPtr<AdhocPoolStat>): Int

public expect fun sceNetApctlInit(stackSize: Int, initPriority: Int): Int

public expect fun sceNetApctlTerm(): Int

public expect fun sceNetApctlGetInfo(code: ApctlInfo, pinfo: MutPtr<SceNetApctlInfo>): Int

public expect fun sceNetApctlAddHandler(handler: SceNetApctlHandler, parg: MutPtr<CVoid>): Int

public expect fun sceNetApctlDelHandler(handlerId: Int): Int

public expect fun sceNetApctlConnect(connIndex: Int): Int

public expect fun sceNetApctlDisconnect(): Int

public expect fun sceNetApctlGetState(pstate: MutPtr<ApctlState>): Int

public expect fun sceNetInetInit(): Int

public expect fun sceNetInetTerm(): Int

public expect fun sceNetInetAccept(s: Int, addr: MutPtr<Sockaddr>, addrLen: MutPtr<SocklenT>): Int

public expect fun sceNetInetBind(s: Int, myAddr: ConstPtr<Sockaddr>, addrLen: SocklenT): Int

public expect fun sceNetInetConnect(s: Int, servAddr: ConstPtr<Sockaddr>, addrLen: SocklenT): Int

public expect fun sceNetInetGetsockopt(s: Int, level: Int, optName: Int, optVal: MutPtr<CVoid>, optlEn: MutPtr<SocklenT>): Int

public expect fun sceNetInetListen(s: Int, backlog: Int): Int

public expect fun sceNetInetRecv(s: Int, buf: MutPtr<CVoid>, len: ULong, flags: Int): ULong

public expect fun sceNetInetRecvfrom(s: Int, buf: MutPtr<CVoid>, flags: ULong, arg1: Int, from: MutPtr<Sockaddr>, fromLen: MutPtr<SocklenT>): ULong

public expect fun sceNetInetSend(s: Int, buf: ConstPtr<CVoid>, len: ULong, flags: Int): ULong

public expect fun sceNetInetSendto(s: Int, buf: ConstPtr<CVoid>, len: ULong, flags: Int, to: ConstPtr<Sockaddr>, toLen: SocklenT): ULong

public expect fun sceNetInetSetsockopt(s: Int, level: Int, optName: Int, optVal: ConstPtr<CVoid>, optLen: SocklenT): Int

public expect fun sceNetInetShutdown(s: Int, how: Int): Int

public expect fun sceNetInetSocket(domain: Int, type: Int, protocol: Int): Int

public expect fun sceNetInetClose(s: Int): Int

public expect fun sceNetInetGetErrno(): Int

public expect fun sceSslInit(unknown1: Int): Int

public expect fun sceSslEnd(): Int

public expect fun sceSslGetUsedMemoryMax(memory: MutPtr<UInt>): Int

public expect fun sceSslGetUsedMemoryCurrent(memory: MutPtr<UInt>): Int

public expect fun sceHttpInit(unknown1: UInt): Int

public expect fun sceHttpEnd(): Int

public expect fun sceHttpCreateTemplate(agent: MutPtr<UByte>, unknown1: Int, unknown2: Int): Int

public expect fun sceHttpDeleteTemplate(templateid: Int): Int

public expect fun sceHttpCreateConnection(templateid: Int, host: MutPtr<UByte>, unknown1: MutPtr<UByte>, port: UShort, unknown2: Int): Int

public expect fun sceHttpCreateConnectionWithURL(templateid: Int, url: ConstPtr<UByte>, unknown1: Int): Int

public expect fun sceHttpDeleteConnection(connectionId: Int): Int

public expect fun sceHttpCreateRequest(connectionId: Int, method: HttpMethod, path: MutPtr<UByte>, contentLength: ULong): Int

public expect fun sceHttpCreateRequestWithURL(connectionId: Int, method: HttpMethod, url: MutPtr<UByte>, contentLength: ULong): Int

public expect fun sceHttpDeleteRequest(requestId: Int): Int

public expect fun sceHttpSendRequest(requestId: Int, data: MutPtr<CVoid>, dataSize: UInt): Int

public expect fun sceHttpAbortRequest(requestId: Int): Int

public expect fun sceHttpReadData(requestId: Int, data: MutPtr<CVoid>, dataSize: UInt): Int

public expect fun sceHttpGetContentLength(requestId: Int, contentLength: MutPtr<ULong>): Int

public expect fun sceHttpGetStatusCode(requestId: Int, statusCode: MutPtr<Int>): Int

public expect fun sceHttpSetResolveTimeOut(id: Int, timeout: UInt): Int

public expect fun sceHttpSetResolveRetry(id: Int, count: Int): Int

public expect fun sceHttpSetConnectTimeOut(id: Int, timeout: UInt): Int

public expect fun sceHttpSetSendTimeOut(id: Int, timeout: UInt): Int

public expect fun sceHttpSetRecvTimeOut(id: Int, timeout: UInt): Int

public expect fun sceHttpEnableKeepAlive(id: Int): Int

public expect fun sceHttpDisableKeepAlive(id: Int): Int

public expect fun sceHttpEnableRedirect(id: Int): Int

public expect fun sceHttpDisableRedirect(id: Int): Int

public expect fun sceHttpEnableCookie(id: Int): Int

public expect fun sceHttpDisableCookie(id: Int): Int

public expect fun sceHttpSaveSystemCookie(): Int

public expect fun sceHttpLoadSystemCookie(): Int

public expect fun sceHttpAddExtraHeader(id: Int, name: MutPtr<UByte>, value: MutPtr<UByte>, unknown1: Int): Int

public expect fun sceHttpDeleteHeader(id: Int, name: ConstPtr<UByte>): Int

public expect fun sceHttpsInit(unknown1: Int, unknown2: Int, unknown3: Int, unknown4: Int): Int

public expect fun sceHttpsEnd(): Int

public expect fun sceHttpsLoadDefaultCert(unknown1: Int, unknown2: Int): Int

public expect fun sceHttpDisableAuth(id: Int): Int

public expect fun sceHttpDisableCache(id: Int): Int

public expect fun sceHttpEnableAuth(id: Int): Int

public expect fun sceHttpEnableCache(id: Int): Int

public expect fun sceHttpEndCache(): Int

public expect fun sceHttpGetAllHeader(request: Int, header: MutPtr<MutPtr<UByte>>, headerSize: MutPtr<UInt>): Int

public expect fun sceHttpGetNetworkErrno(request: Int, errNum: MutPtr<Int>): Int

public expect fun sceHttpGetProxy(id: Int, activateFlag: MutPtr<Int>, mode: MutPtr<Int>, proxyHost: MutPtr<UByte>, len: ULong, proxyPort: MutPtr<UShort>): Int

public expect fun sceHttpInitCache(maxSize: ULong): Int

public expect fun sceHttpSetAuthInfoCB(id: Int, cbfunc: HttpPasswordCB): Int

public expect fun sceHttpSetProxy(id: Int, activateFlag: Int, mode: Int, newProxyHost: ConstPtr<UByte>, newProxyPort: UShort): Int

public expect fun sceHttpSetResHeaderMaxSize(id: Int, headerSize: UInt): Int

public expect fun sceHttpSetMallocFunction(mallocFunc: HttpMallocFunction, freeFunc: HttpFreeFunction, reallocFunc: HttpReallocFunction): Int

public expect fun sceNetResolverInit(): Int

public expect fun sceNetResolverCreate(rid: MutPtr<Int>, buf: MutPtr<CVoid>, bufLength: UInt): Int

public expect fun sceNetResolverDelete(rid: Int): Int

public expect fun sceNetResolverStartNtoA(rid: Int, hostname: ConstPtr<UByte>, addr: MutPtr<InAddr>, timeout: UInt, retry: Int): Int

public expect fun sceNetResolverStartAtoN(rid: Int, addr: ConstPtr<InAddr>, hostname: MutPtr<UByte>, hostnameLen: UInt, timeout: UInt, retry: Int): Int

public expect fun sceNetResolverStop(rid: Int): Int

public expect fun sceNetResolverTerm(): Int
