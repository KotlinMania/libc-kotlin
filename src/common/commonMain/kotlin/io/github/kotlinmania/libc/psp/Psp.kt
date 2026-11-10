// port-lint: source psp.rs
@file:OptIn(ExperimentalUnsignedTypes::class)

package io.github.kotlinmania.libc.psp

import io.github.kotlinmania.libc.*
import io.github.kotlinmania.libc.CInt
import io.github.kotlinmania.libc.COpaquePointer
import io.github.kotlinmania.libc.U128

// PSP C type definitions
//
// These type declarations are not enough, as they must be ultimately resolved
// by the linker. Crates that use these definitions must, somewhere in the
// crate graph, include a Note provider crate such as the `psp` crate.

public fun interface FnCallback {
    public operator fun invoke(args: ULong, argp: COpaquePointer?): Int
}

public fun interface FnCallback1 {
    public operator fun invoke(common: COpaquePointer?): UInt
}

public fun interface FnCallback2 {
    public operator fun invoke(arg1: Int, arg2: Int, arg: COpaquePointer?): Int
}

public fun interface FnCallback3 {
    public operator fun invoke(uid: SceUid, arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: COpaquePointer?): UInt
}

public fun interface FnCallback4 {
    public operator fun invoke(uid: SceUid, arg1: Long, arg2: Long, arg3: COpaquePointer?): UInt
}

public fun interface FnCallback5 {
    public operator fun invoke(mask: Int, thid: SceUid, common: COpaquePointer?): Int
}

public fun interface FnCallback6 {
    public operator fun invoke(data: COpaquePointer?, numPackets: Int, param: COpaquePointer?): Int
}

public fun interface FnCallback7 {
    public operator fun invoke(id: Int, arg: COpaquePointer?)
}

public fun interface FnCallback8 {
    public operator fun invoke(flag: Int, error: Int, unknown: COpaquePointer?)
}

public fun interface FnCallback9 {
    public operator fun invoke(matchingId: Int, event: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?)
}

public fun interface FnCallback10 {
    public operator fun invoke(oldState: Int, newState: Int, event: Int, error: Int, pArg: COpaquePointer?)
}

public fun interface FnCallback11 {
    public operator fun invoke(request: Int, authType: HttpAuthType, realm: COpaquePointer?, username: COpaquePointer?, password: COpaquePointer?, needEntity: Int, entityBody: COpaquePointer?, entitySize: COpaquePointer?, save: COpaquePointer?): Int
}

public fun interface FnCallback12 {
    public operator fun invoke(size: ULong): COpaquePointer?
}

public fun interface FnCallback13 {
    public operator fun invoke(p: COpaquePointer?)
}

public fun interface FnCallback14 {
    public operator fun invoke(p: COpaquePointer?, size: ULong): COpaquePointer?
}

public typealias IntmaxT = Long

public typealias UintmaxT = ULong

public typealias SizeT = ULong

public typealias PtrdiffT = Long

public typealias IntptrT = Long

public typealias UintptrT = ULong

public typealias SsizeT = Long

public fun interface SceKernelVTimerHandler {
    public operator fun invoke(uid: SceUid, arg1: COpaquePointer?, arg2: COpaquePointer?, arg3: COpaquePointer?): UInt
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
    public operator fun invoke(request: Int, authType: HttpAuthType, realm: COpaquePointer?, username: COpaquePointer?, password: COpaquePointer?, needEntity: Int, entityBody: COpaquePointer?, entitySize: COpaquePointer?, save: COpaquePointer?): Int
}

public typealias HttpPasswordCB = HttpPasswordCBFn?

public typealias SocklenT = UInt

public enum class AudioFormat(public val value: UInt) {
    Stereo(0u),
    Mono(0x10u),
}

public enum class DisplayMode(public val value: UInt) {
    Lcd(0u),
}

public enum class DisplayPixelFormat(public val value: UInt) {
    Psm5650(0u),
    Psm5551(1u),
    Psm4444(2u),
    Psm8888(3u),
}

public enum class DisplaySetBufSync(public val value: UInt) {
    Immediate(0u),
    NextFrame(1u),
}

public enum class AudioOutputFrequency(public val value: Int) {
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

public enum class AudioInputFrequency(public val value: Int) {
    Khz441(44100),
    Khz2205(22050),
    Khz11025(11025),
}

public enum class CtrlMode(public val value: UInt) {
    Digital(0u),
    Analog(((0u) + 1u)),
}

public enum class GeMatrixType(public val value: Int) {
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

public enum class GeListState(public val value: Int) {
    Done(0),
    Queued(((0) + 1)),
    DrawingDone(((0) + 2)),
    StallReached(((0) + 3)),
    CancelDone(((0) + 4)),
}

public enum class GeCommand(public val value: UByte) {
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

public enum class SceSysMemPartitionId(public val value: Int) {
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

public enum class SceSysMemBlockTypes(public val value: Int) {
    Low(0),
    High(((0) + 1)),
    Addr(((0) + 2)),
}

public enum class Interrupt(public val value: UInt) {
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

public enum class SubInterrupt(public val value: UInt) {
    Gpio(Interrupt.Gpio.value),
    Ata(Interrupt.Ata.value),
    Umd(Interrupt.Umd.value),
    Dmacplus(Interrupt.Dmacplus.value),
    Ge(Interrupt.Ge.value),
    Display(Interrupt.Vblank.value),
}

public enum class SceKernelIdListType(public val value: UInt) {
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

public enum class UsbCamResolution(public val value: Int) {
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

public enum class UsbCamResolutionEx(public val value: Int) {
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

public enum class UsbCamDelay(public val value: Int) {
    NoDelay(0),
    Delay10Sec(1),
    Delay20Sec(2),
    Delay30Sec(3),
}

public enum class UsbCamFrameRate(public val value: Int) {
    Fps375(0),
    Fps5(1),
    Fps75(2),
    Fps10(3),
    Fps15(4),
    Fps20(5),
    Fps30(6),
    Fps60(7),
}

public enum class UsbCamWb(public val value: Int) {
    Auto(0),
    Daylight(1),
    Fluorescent(2),
    Incadescent(3),
}

public enum class UsbCamEffectMode(public val value: Int) {
    Normal(0),
    Negative(1),
    Blackwhite(2),
    Sepia(3),
    Blue(4),
    Red(5),
    Green(6),
}

public enum class UsbCamEvLevel(public val value: Int) {
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

public enum class RtcCheckValidError(public val value: Int) {
    InvalidYear(-1),
    InvalidMonth(-2),
    InvalidDay(-3),
    InvalidHour(-4),
    InvalidMinutes(-5),
    InvalidSeconds(-6),
    InvalidMicroseconds(-7),
}

public enum class PowerTick(public val value: UInt) {
    All(0u),
    Suspend(1u),
    Display(6u),
}

public enum class IoAssignPerms(public val value: UInt) {
    RdWr(0u),
    RdOnly(1u),
}

public enum class IoWhence(public val value: UInt) {
    Set(0u),
    Cur(1u),
    End(2u),
}

public enum class UmdType(public val value: UInt) {
    Game(0x10u),
    Video(0x20u),
    Audio(0x40u),
}

public enum class GuPrimitive(public val value: UInt) {
    Points(0u),
    Lines(1u),
    LineStrip(2u),
    Triangles(3u),
    TriangleStrip(4u),
    TriangleFan(5u),
    Sprites(6u),
}

public enum class PatchPrimitive(public val value: UInt) {
    Points(0u),
    LineStrip(2u),
    TriangleStrip(4u),
}

public enum class GuState(public val value: UInt) {
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

public enum class MatrixMode(public val value: UInt) {
    Projection(0u),
    View(1u),
    Model(2u),
    Texture(3u),
}

public enum class TexturePixelFormat(public val value: UInt) {
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

public enum class SplineMode(public val value: UInt) {
    FillFill(0u),
    OpenFill(1u),
    FillOpen(2u),
    OpenOpen(3u),
}

public enum class ShadingModel(public val value: UInt) {
    Flat(0u),
    Smooth(1u),
}

public enum class LogicalOperation(public val value: UInt) {
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

public enum class TextureFilter(public val value: UInt) {
    Nearest(0u),
    Linear(1u),
    NearestMipmapNearest(4u),
    LinearMipmapNearest(5u),
    NearestMipmapLinear(6u),
    LinearMipmapLinear(7u),
}

public enum class TextureMapMode(public val value: UInt) {
    TextureCoords(0u),
    TextureMatrix(1u),
    EnvironmentMap(2u),
}

public enum class TextureLevelMode(public val value: UInt) {
    Auto(0u),
    Const(1u),
    Slope(2u),
}

public enum class TextureProjectionMapMode(public val value: UInt) {
    Position(0u),
    Uv(1u),
    NormalizedNormal(2u),
    Normal(3u),
}

public enum class GuTexWrapMode(public val value: UInt) {
    Repeat(0u),
    Clamp(1u),
}

public enum class FrontFaceDirection(public val value: UInt) {
    Clockwise(0u),
    CounterClockwise(1u),
}

public enum class AlphaFunc(public val value: UInt) {
    Never(0u),
    Always(((0u) + 1u)),
    Equal(((0u) + 2u)),
    NotEqual(((0u) + 3u)),
    Less(((0u) + 4u)),
    LessOrEqual(((0u) + 5u)),
    Greater(((0u) + 6u)),
    GreaterOrEqual(((0u) + 7u)),
}

public enum class StencilFunc(public val value: UInt) {
    Never(0u),
    Always(((0u) + 1u)),
    Equal(((0u) + 2u)),
    NotEqual(((0u) + 3u)),
    Less(((0u) + 4u)),
    LessOrEqual(((0u) + 5u)),
    Greater(((0u) + 6u)),
    GreaterOrEqual(((0u) + 7u)),
}

public enum class ColorFunc(public val value: UInt) {
    Never(0u),
    Always(((0u) + 1u)),
    Equal(((0u) + 2u)),
    NotEqual(((0u) + 3u)),
}

public enum class DepthFunc(public val value: UInt) {
    Never(0u),
    Always(((0u) + 1u)),
    Equal(((0u) + 2u)),
    NotEqual(((0u) + 3u)),
    Less(((0u) + 4u)),
    LessOrEqual(((0u) + 5u)),
    Greater(((0u) + 6u)),
    GreaterOrEqual(((0u) + 7u)),
}

public enum class TextureEffect(public val value: UInt) {
    Modulate(0u),
    Decal(1u),
    Blend(2u),
    Replace(3u),
    Add(4u),
}

public enum class TextureColorComponent(public val value: UInt) {
    Rgb(0u),
    Rgba(1u),
}

public enum class MipmapLevel(public val value: UInt) {
    None(0u),
    Level1(((0u) + 1u)),
    Level2(((0u) + 2u)),
    Level3(((0u) + 3u)),
    Level4(((0u) + 4u)),
    Level5(((0u) + 5u)),
    Level6(((0u) + 6u)),
    Level7(((0u) + 7u)),
}

public enum class BlendOp(public val value: UInt) {
    Add(0u),
    Subtract(1u),
    ReverseSubtract(2u),
    Min(3u),
    Max(4u),
    Abs(5u),
}

public enum class BlendSrc(public val value: UInt) {
    SrcColor(0u),
    OneMinusSrcColor(1u),
    SrcAlpha(2u),
    OneMinusSrcAlpha(3u),
    Fix(10u),
}

public enum class BlendDst(public val value: UInt) {
    DstColor(0u),
    OneMinusDstColor(1u),
    DstAlpha(4u),
    OneMinusDstAlpha(5u),
    Fix(10u),
}

public enum class StencilOperation(public val value: UInt) {
    Keep(0u),
    Zero(1u),
    Replace(2u),
    Invert(3u),
    Incr(4u),
    Decr(5u),
}

public enum class LightMode(public val value: UInt) {
    SingleColor(0u),
    SeparateSpecularColor(1u),
}

public enum class LightType(public val value: UInt) {
    Directional(0u),
    Pointlight(1u),
    Spotlight(2u),
}

public enum class GuContextType(public val value: UInt) {
    Direct(0u),
    Call(1u),
    Send(2u),
}

public enum class GuQueueMode(public val value: UInt) {
    Tail(0u),
    Head(1u),
}

public enum class GuSyncMode(public val value: UInt) {
    Finish(0u),
    Signal(1u),
    Done(2u),
    List(3u),
    Send(4u),
}

public enum class GuSyncBehavior(public val value: UInt) {
    Wait(0u),
    NoWait(1u),
}

public enum class GuCallbackId(public val value: UInt) {
    Signal(1u),
    Finish(4u),
}

public enum class SignalBehavior(public val value: UInt) {
    Suspend(1u),
    Continue(2u),
}

public enum class ClutPixelFormat(public val value: UInt) {
    Psm5650(0u),
    Psm5551(1u),
    Psm4444(2u),
    Psm8888(3u),
}

public enum class KeyType(public val value: UInt) {
    Directory(1u),
    Integer(2u),
    String(3u),
    Bytes(4u),
}

public enum class UtilityMsgDialogMode(public val value: UInt) {
    Error(0u),
    Text(1u),
}

public enum class UtilityMsgDialogPressed(public val value: UInt) {
    Unknown1(0u),
    Yes(1u),
    No(2u),
    Back(3u),
}

public enum class UtilityDialogButtonAccept(public val value: UInt) {
    Circle(0u),
    Cross(1u),
}

public enum class SceUtilityOskInputLanguage(public val value: UInt) {
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

public enum class SceUtilityOskInputType(public val value: UInt) {
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

public enum class SceUtilityOskState(public val value: UInt) {
    None(0u),
    Initializing(1u),
    Initialized(2u),
    Visible(3u),
    Quit(4u),
    Finished(5u),
}

public enum class SceUtilityOskResult(public val value: UInt) {
    Unchanged(0u),
    Cancelled(1u),
    Changed(2u),
}

public enum class SystemParamLanguage(public val value: UInt) {
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

public enum class SystemParamId(public val value: UInt) {
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

public enum class SystemParamAdhocChannel(public val value: UInt) {
    ChannelAutomatic(0u),
    Channel1(1u),
    Channel6(6u),
    Channel11(11u),
}

public enum class SystemParamWlanPowerSaveState(public val value: UInt) {
    Off(0u),
    On(1u),
}

public enum class SystemParamDateFormat(public val value: UInt) {
    YYYYMMDD(0u),
    MMDDYYYY(1u),
    DDMMYYYY(2u),
}

public enum class SystemParamTimeFormat(public val value: UInt) {
    Hour24(0u),
    Hour12(1u),
}

public enum class SystemParamDaylightSavings(public val value: UInt) {
    Std(0u),
    Dst(1u),
}

public enum class AvModule(public val value: UInt) {
    AvCodec(0u),
    SasCore(1u),
    Atrac3Plus(2u),
    MpegBase(3u),
    Mp3(4u),
    Vaudio(5u),
    Aac(6u),
    G729(7u),
}

public enum class Module(public val value: UInt) {
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

public enum class NetModule(public val value: UInt) {
    NetCommon(1u),
    NetAdhoc(((1u) + 1u)),
    NetInet(((1u) + 2u)),
    NetParseUri(((1u) + 3u)),
    NetHttp(((1u) + 4u)),
    NetSsl(((1u) + 5u)),
}

public enum class UsbModule(public val value: UInt) {
    UsbPspCm(1u),
    UsbAcc(((1u) + 1u)),
    UsbMic(((1u) + 2u)),
    UsbCam(((1u) + 3u)),
    UsbGps(((1u) + 4u)),
}

public enum class NetParam(public val value: UInt) {
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

public enum class UtilityNetconfAction(public val value: UInt) {
    ConnectAP(0u),
    DisplayStatus(1u),
    ConnectAdhoc(2u),
}

public enum class UtilitySavedataMode(public val value: UInt) {
    AutoLoad(0u),
    AutoSave(1u),
    Load(2u),
    Save(3u),
    ListLoad(4u),
    ListSave(5u),
    ListDelete(6u),
    Delete(7u),
}

public enum class UtilitySavedataFocus(public val value: UInt) {
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

public enum class UtilityGameSharingMode(public val value: UInt) {
    Single(1u),
    Multiple(((1u) + 1u)),
}

public enum class UtilityGameSharingDataType(public val value: UInt) {
    File(1u),
    Memory(((1u) + 1u)),
}

public enum class UtilityHtmlViewerInterfaceMode(public val value: UInt) {
    Full(0u),
    Limited(1u),
    None(2u),
}

public enum class UtilityHtmlViewerCookieMode(public val value: UInt) {
    Disabled(0u),
    Enabled(((0u) + 1u)),
    Confirm(((0u) + 2u)),
    Default(((0u) + 3u)),
}

public enum class UtilityHtmlViewerTextSize(public val value: UInt) {
    Large(0u),
    Normal(1u),
    Small(2u),
}

public enum class UtilityHtmlViewerDisplayMode(public val value: UInt) {
    Normal(0u),
    Fit(1u),
    SmartFit(2u),
}

public enum class UtilityHtmlViewerConnectMode(public val value: UInt) {
    Last(0u),
    ManualOnce(1u),
    ManualAll(2u),
}

public enum class UtilityHtmlViewerDisconnectMode(public val value: UInt) {
    Enable(0u),
    Disable(1u),
    Confirm(2u),
}

public enum class ScePspnetAdhocPtpState(public val value: UInt) {
    Closed(0u),
    Listen(1u),
    SynSent(2u),
    SynReceived(3u),
    Established(4u),
}

public enum class AdhocMatchingMode(public val value: UInt) {
    Host(1u),
    Client(((1u) + 1u)),
    Ptp(((1u) + 2u)),
}

public enum class ApctlState(public val value: UInt) {
    Disconnected(0u),
    Scanning(1u),
    Joining(2u),
    GettingIp(3u),
    GotIp(4u),
    EapAuth(5u),
    KeyExchange(6u),
}

public enum class ApctlEvent(public val value: UInt) {
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

public enum class ApctlInfo(public val value: UInt) {
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

public enum class ApctlInfoSecurityType(public val value: UInt) {
    None(0u),
    Wep(1u),
    Wpa(2u),
}

public enum class HttpMethod(public val value: UInt) {
    Get(0u),
    Post(1u),
    Head(2u),
}

public enum class HttpAuthType(public val value: UInt) {
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
}

public data class SceMpeg(
    public var value: COpaquePointer? = null,
) {
    public var field0: COpaquePointer?
        get() = value
        set(v) {
            value = v
        }
}

public data class SceMpegStream(
    public var value: COpaquePointer? = null,
) {
    public var field0: COpaquePointer?
        get() = value
        set(v) {
            value = v
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
}

public data class RegHandle(
    public var value: UInt = 0u,
) {
    public var field0: UInt
        get() = value
        set(v) {
            value = v
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
}

public data class InAddr(
    public var sAddr: UInt = 0u,
)

public data class AudioInputParams(
    public var unknown1: Int = 0,
    public var gain: Int = 0,
    public var unknown2: Int = 0,
    public var unknown3: Int = 0,
    public var unknown4: Int = 0,
    public var unknown5: Int = 0,
)

public data class Atrac3BufferInfo(
    public var pucWritePositionFirstBuf: COpaquePointer? = null,
    public var uiWritableByteFirstBuf: UInt = 0u,
    public var uiMinWriteByteFirstBuf: UInt = 0u,
    public var uiReadPositionFirstBuf: UInt = 0u,
    public var pucWritePositionSecondBuf: COpaquePointer? = null,
    public var uiWritableByteSecondBuf: UInt = 0u,
    public var uiMinWriteByteSecondBuf: UInt = 0u,
    public var uiReadPositionSecondBuf: UInt = 0u,
)

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
}

public data class SceCtrlLatch(
    public var uiMake: UInt = 0u,
    public var uiBreak: UInt = 0u,
    public var uiPress: UInt = 0u,
    public var uiRelease: UInt = 0u,
)

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
}

public data class GeCallbackData(
    public var signalFunc: FnCallback7? = null,
    public var signalArg: COpaquePointer? = null,
    public var finishFunc: FnCallback7? = null,
    public var finishArg: COpaquePointer? = null,
)

public data class GeListArgs(
    public var size: UInt = 0u,
    public var context: GeContext? = null,
    public var numStacks: UInt = 0u,
    public var stacks: GeStack? = null,
)

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
}

public data class SceKernelLoadExecParam(
    public var size: Int = 0,
    public var args: Int = 0,
    public var argp: COpaquePointer? = null,
    public var key: COpaquePointer? = null,
)

public data class Timeval(
    public var tvSec: Int = 0,
    public var tvUsec: Int = 0,
)

public data class Timezone(
    public var tzMinutesWest: Int = 0,
    public var tzDstTime: Int = 0,
)

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
)

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
}

public data class SceKernelSMOption(
    public var size: Int = 0,
    public var mPidStack: SceUid = SceUid(),
    public var stackSize: Int = 0,
    public var priority: Int = 0,
    public var attribute: UInt = 0u,
)

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
)

public data class SceKernelSysClock(
    public var low: UInt = 0u,
    public var hi: UInt = 0u,
)

public data class SceKernelThreadOptParam(
    public var size: Int = 0,
    public var stackMpid: SceUid = SceUid(),
)

public class SceKernelThreadInfo(
    public var size: Int = 0,
    public var name: UByteArray = UByteArray(32),
    public var attr: UInt = 0u,
    public var status: Int = 0,
    public var entry: SceKernelThreadEntry = SceKernelThreadEntry { _, _ -> 0 },
    public var stack: COpaquePointer? = null,
    public var stackSize: Int = 0,
    public var gpReg: COpaquePointer? = null,
    public var initPriority: Int = 0,
    public var currentPriority: Int = 0,
    public var waitType: Int = 0,
    public var waitId: SceUid = SceUid(),
    public var wakeupCount: Int = 0,
    public var exitStatus: Int = 0,
    public var runClocks: SceKernelSysClock = SceKernelSysClock(),
    public var intrPreemptCount: UInt = 0u,
    public var threadPreemptCount: UInt = 0u,
    public var releaseCount: UInt = 0u,
)

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
)

public data class SceKernelSemaOptParam(
    public var size: Int = 0,
)

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
}

public data class SceKernelEventFlagOptParam(
    public var size: Int = 0,
)

public data class SceKernelMbxOptParam(
    public var size: Int = 0,
)

public data class SceKernelMbxInfo(
    public var size: Int = 0,
    public var name: UByteArray = UByteArray(32),
    public var attr: UInt = 0u,
    public var numWaitThreads: Int = 0,
    public var numMessages: Int = 0,
    public var firstMessage: COpaquePointer? = null,
) {
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
}

public data class SceKernelVTimerInfo(
    public var size: Int = 0,
    public var name: UByteArray = UByteArray(32),
    public var active: Int = 0,
    public var base: SceKernelSysClock = SceKernelSysClock(),
    public var current: SceKernelSysClock = SceKernelSysClock(),
    public var schedule: SceKernelSysClock = SceKernelSysClock(),
    public var handler: SceKernelVTimerHandler = SceKernelVTimerHandler { _, _, _, _ -> 0u },
    public var common: COpaquePointer? = null,
) {
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
}

public data class SceKernelThreadEventHandlerInfo(
    public var size: Int = 0,
    public var name: UByteArray = UByteArray(32),
    public var threadId: SceUid = SceUid(),
    public var mask: Int = 0,
    public var handler: SceKernelThreadEventHandler = SceKernelThreadEventHandler { _, _, _ -> 0 },
    public var common: COpaquePointer? = null,
) {
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
}

public data class SceKernelAlarmInfo(
    public var size: Int = 0,
    public var schedule: SceKernelSysClock = SceKernelSysClock(),
    public var handler: SceKernelAlarmHandler = SceKernelAlarmHandler { _ -> 0u },
    public var common: COpaquePointer? = null,
)

public data class SceKernelSystemStatus(
    public var size: Int = 0,
    public var status: UInt = 0u,
    public var idleClocks: SceKernelSysClock = SceKernelSysClock(),
    public var comesOutOfIdleCount: UInt = 0u,
    public var threadSwitchCount: UInt = 0u,
    public var vfpuSwitchCount: UInt = 0u,
)

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
}

public data class SceKernelVplOptParam(
    public var size: Int = 0,
)

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
}

public data class SceKernelFplOptParam(
    public var size: Int = 0,
)

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
}

public data class SceKernelVTimerOptParam(
    public var size: Int = 0,
)

public data class SceKernelCallbackInfo(
    public var size: Int = 0,
    public var name: UByteArray = UByteArray(32),
    public var threadId: SceUid = SceUid(),
    public var callback: SceKernelCallbackFunction = SceKernelCallbackFunction { _, _, _ -> 0 },
    public var common: COpaquePointer? = null,
    public var notifyCount: Int = 0,
    public var notifyArg: Int = 0,
) {
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
)

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
}

public data class UmdInfo(
    public var size: UInt = 0u,
    public var type: UmdType = UmdType.entries.first(),
)

public data class SceMpegRingbuffer(
    public var packets: Int = 0,
    public var unk0: UInt = 0u,
    public var unk1: UInt = 0u,
    public var unk2: UInt = 0u,
    public var unk3: UInt = 0u,
    public var data: COpaquePointer? = null,
    public var callback: SceMpegRingbufferCb = null,
    public var cbParam: COpaquePointer? = null,
    public var unk4: UInt = 0u,
    public var unk5: UInt = 0u,
    public var sceMpeg: COpaquePointer? = null,
)

public data class SceMpegAu(
    public var ptsMsb: UInt = 0u,
    public var pts: UInt = 0u,
    public var dtsMsb: UInt = 0u,
    public var dts: UInt = 0u,
    public var esBuffer: UInt = 0u,
    public var auSize: UInt = 0u,
)

public data class SceMpegAvcMode(
    public var unk0: Int = 0,
    public var pixelFormat: DisplayPixelFormat = DisplayPixelFormat.entries.first(),
)

public data class SceMpegLLI(
    public var src: COpaquePointer? = null,
    public var dst: COpaquePointer? = null,
    public var next: COpaquePointer? = null,
    public var size: Int = 0,
)

public data class SceMpegYCrCbBuffer(
    public var frameBufferHeight16: Int = 0,
    public var frameBufferWidth16: Int = 0,
    public var unknown: Int = 0,
    public var unknown2: Int = 0,
    public var yBuffer: COpaquePointer? = null,
    public var yBuffer2: COpaquePointer? = null,
    public var crBuffer: COpaquePointer? = null,
    public var cbBuffer: COpaquePointer? = null,
    public var crBuffer2: COpaquePointer? = null,
    public var cbBuffer2: COpaquePointer? = null,
    public var frameHeight: Int = 0,
    public var frameWidth: Int = 0,
    public var frameBufferWidth: Int = 0,
    public var unknown3: IntArray = IntArray(11),
) {
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
}

public data class ScePspSRect(
    public var x: Short = 0,
    public var y: Short = 0,
    public var w: Short = 0,
    public var h: Short = 0,
)

public data class ScePspIRect(
    public var x: Int = 0,
    public var y: Int = 0,
    public var w: Int = 0,
    public var h: Int = 0,
)

public data class ScePspL64Rect(
    public var x: ULong = 0uL,
    public var y: ULong = 0uL,
    public var w: ULong = 0uL,
    public var h: ULong = 0uL,
)

public data class ScePspSVector2(
    public var x: Short = 0,
    public var y: Short = 0,
)

public data class ScePspIVector2(
    public var x: Int = 0,
    public var y: Int = 0,
)

public data class ScePspL64Vector2(
    public var x: ULong = 0uL,
    public var y: ULong = 0uL,
)

public data class ScePspSVector3(
    public var x: Short = 0,
    public var y: Short = 0,
    public var z: Short = 0,
)

public data class ScePspIVector3(
    public var x: Int = 0,
    public var y: Int = 0,
    public var z: Int = 0,
)

public data class ScePspL64Vector3(
    public var x: ULong = 0uL,
    public var y: ULong = 0uL,
    public var z: ULong = 0uL,
)

public data class ScePspSVector4(
    public var x: Short = 0,
    public var y: Short = 0,
    public var z: Short = 0,
    public var w: Short = 0,
)

public data class ScePspIVector4(
    public var x: Int = 0,
    public var y: Int = 0,
    public var z: Int = 0,
    public var w: Int = 0,
)

public data class ScePspL64Vector4(
    public var x: ULong = 0uL,
    public var y: ULong = 0uL,
    public var z: ULong = 0uL,
    public var w: ULong = 0uL,
)

public data class ScePspIMatrix2(
    public var x: ScePspIVector2 = ScePspIVector2(),
    public var y: ScePspIVector2 = ScePspIVector2(),
)

public data class ScePspIMatrix3(
    public var x: ScePspIVector3 = ScePspIVector3(),
    public var y: ScePspIVector3 = ScePspIVector3(),
    public var z: ScePspIVector3 = ScePspIVector3(),
)

public data class ScePspIMatrix4(
    public var x: ScePspIVector4 = ScePspIVector4(),
    public var y: ScePspIVector4 = ScePspIVector4(),
    public var z: ScePspIVector4 = ScePspIVector4(),
    public var w: ScePspIVector4 = ScePspIVector4(),
)

public data class ScePspIMatrix4Unaligned(
    public var x: ScePspIVector4 = ScePspIVector4(),
    public var y: ScePspIVector4 = ScePspIVector4(),
    public var z: ScePspIVector4 = ScePspIVector4(),
    public var w: ScePspIVector4 = ScePspIVector4(),
)

public data class SceMp3InitArg(
    public var mp3StreamStart: UInt = 0u,
    public var unk1: UInt = 0u,
    public var mp3StreamEnd: UInt = 0u,
    public var unk2: UInt = 0u,
    public var mp3Buf: COpaquePointer? = null,
    public var mp3BufSize: Int = 0,
    public var pcmBuf: COpaquePointer? = null,
    public var pcmBufSize: Int = 0,
)

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
}

public data class UtilityNetconfData(
    public var base: UtilityDialogCommon = UtilityDialogCommon(),
    public var action: UtilityNetconfAction = UtilityNetconfAction.entries.first(),
    public var adhocparam: UtilityNetconfAdhoc? = null,
    public var hotspot: Int = 0,
    public var hotspotConnected: Int = 0,
    public var wifisp: Int = 0,
)

public data class UtilitySavedataFileData(
    public var buf: COpaquePointer? = null,
    public var bufSize: Int = 0,
    public var size: Int = 0,
    public var unknown: Int = 0,
)

public data class UtilitySavedataListSaveNewData(
    public var icon0: UtilitySavedataFileData = UtilitySavedataFileData(),
    public var title: COpaquePointer? = null,
)

public data class UtilityGameSharingParams(
    public var base: UtilityDialogCommon = UtilityDialogCommon(),
    public var unknown1: Int = 0,
    public var unknown2: Int = 0,
    public var name: UByteArray = UByteArray(8),
    public var unknown3: Int = 0,
    public var unknown4: Int = 0,
    public var unknown5: Int = 0,
    public var result: Int = 0,
    public var filepath: COpaquePointer? = null,
    public var mode: UtilityGameSharingMode = UtilityGameSharingMode.entries.first(),
    public var datatype: UtilityGameSharingDataType = UtilityGameSharingDataType.entries.first(),
    public var data: COpaquePointer? = null,
    public var datasize: UInt = 0u,
) {
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
}

public class UtilityHtmlViewerParam(
    public var base: UtilityDialogCommon = UtilityDialogCommon(),
    public var memaddr: COpaquePointer? = null,
    public var memsize: UInt = 0u,
    public var unknown1: Int = 0,
    public var unknown2: Int = 0,
    public var initialurl: COpaquePointer? = null,
    public var numtabs: UInt = 0u,
    public var interfacemode: UtilityHtmlViewerInterfaceMode = UtilityHtmlViewerInterfaceMode.entries.first(),
    public var options: Int = 0,
    public var dldirname: COpaquePointer? = null,
    public var dlfilename: COpaquePointer? = null,
    public var uldirname: COpaquePointer? = null,
    public var ulfilename: COpaquePointer? = null,
    public var cookiemode: UtilityHtmlViewerCookieMode = UtilityHtmlViewerCookieMode.entries.first(),
    public var unknown3: UInt = 0u,
    public var homeurl: COpaquePointer? = null,
    public var textsize: UtilityHtmlViewerTextSize = UtilityHtmlViewerTextSize.entries.first(),
    public var displaymode: UtilityHtmlViewerDisplayMode = UtilityHtmlViewerDisplayMode.entries.first(),
    public var connectmode: UtilityHtmlViewerConnectMode = UtilityHtmlViewerConnectMode.entries.first(),
    public var disconnectmode: UtilityHtmlViewerDisconnectMode = UtilityHtmlViewerDisconnectMode.entries.first(),
    public var memused: UInt = 0u,
    public var unknown4: IntArray = IntArray(10),
)

public data class SceUtilityOskData(
    public var unk00: Int = 0,
    public var unk04: Int = 0,
    public var language: SceUtilityOskInputLanguage = SceUtilityOskInputLanguage.entries.first(),
    public var unk12: Int = 0,
    public var inputtype: SceUtilityOskInputType = SceUtilityOskInputType.entries.first(),
    public var lines: Int = 0,
    public var unk24: Int = 0,
    public var desc: UShort? = null,
    public var intext: UShort? = null,
    public var outtextlength: Int = 0,
    public var outtext: UShort? = null,
    public var result: SceUtilityOskResult = SceUtilityOskResult.entries.first(),
    public var outtextlimit: Int = 0,
)

public data class SceUtilityOskParams(
    public var base: UtilityDialogCommon = UtilityDialogCommon(),
    public var datacount: Int = 0,
    public var data: SceUtilityOskData? = null,
    public var state: SceUtilityOskState = SceUtilityOskState.entries.first(),
    public var unk60: Int = 0,
)

public data class SceNetMallocStat(
    public var pool: Int = 0,
    public var maximum: Int = 0,
    public var free: Int = 0,
)

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
}

public data class SceNetAdhocctlScanInfo(
    public var next: SceNetAdhocctlScanInfo? = null,
    public var channel: Int = 0,
    public var name: UByteArray = UByteArray(8),
    public var bssid: UByteArray = UByteArray(6),
    public var unknown: UByteArray = UByteArray(2),
    public var unknown2: Int = 0,
) {
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
}

public data class SceNetAdhocctlGameModeInfo(
    public var count: Int = 0,
    public var macs: List<UByteArray> = List(16) { UByteArray(0) },
)

public data class SceNetAdhocPtpStat(
    public var next: SceNetAdhocPtpStat? = null,
    public var ptpId: Int = 0,
    public var mac: UByteArray = UByteArray(6),
    public var peermac: UByteArray = UByteArray(6),
    public var port: UShort = 0u,
    public var peerport: UShort = 0u,
    public var sentData: UInt = 0u,
    public var rcvdData: UInt = 0u,
    public var state: ScePspnetAdhocPtpState = ScePspnetAdhocPtpState.entries.first(),
) {
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
}

public data class SceNetAdhocPdpStat(
    public var next: SceNetAdhocPdpStat? = null,
    public var pdpId: Int = 0,
    public var mac: UByteArray = UByteArray(6),
    public var port: UShort = 0u,
    public var rcvdData: UInt = 0u,
) {
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
}

public data class AdhocPoolStat(
    public var size: Int = 0,
    public var maxsize: Int = 0,
    public var freesize: Int = 0,
)

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
}

public data class SceIoDirent(
    public var dStat: SceIoStat = SceIoStat(),
    public var dName: UByteArray = UByteArray(256),
    public var dPrivate: COpaquePointer? = null,
    public var dummy: Int = 0,
) {
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
}

public data class ScePspFRect(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
    public var w: Float = 0.0f,
    public var h: Float = 0.0f,
)

public data class ScePspFVector3(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
    public var z: Float = 0.0f,
)

public data class ScePspFVector4(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
    public var z: Float = 0.0f,
    public var w: Float = 0.0f,
)

public data class ScePspFVector4Unaligned(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
    public var z: Float = 0.0f,
    public var w: Float = 0.0f,
)

public data class ScePspFVector2(
    public var x: Float = 0.0f,
    public var y: Float = 0.0f,
)

public data class ScePspFMatrix2(
    public var x: ScePspFVector2 = ScePspFVector2(),
    public var y: ScePspFVector2 = ScePspFVector2(),
)

public data class ScePspFMatrix3(
    public var x: ScePspFVector3 = ScePspFVector3(),
    public var y: ScePspFVector3 = ScePspFVector3(),
    public var z: ScePspFVector3 = ScePspFVector3(),
)

public data class ScePspFMatrix4(
    public var x: ScePspFVector4 = ScePspFVector4(),
    public var y: ScePspFVector4 = ScePspFVector4(),
    public var z: ScePspFVector4 = ScePspFVector4(),
    public var w: ScePspFVector4 = ScePspFVector4(),
)

public data class ScePspFMatrix4Unaligned(
    public var x: ScePspFVector4 = ScePspFVector4(),
    public var y: ScePspFVector4 = ScePspFVector4(),
    public var z: ScePspFVector4 = ScePspFVector4(),
    public var w: ScePspFVector4 = ScePspFVector4(),
)

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
}

public class SceUtilitySavedataParam(
    public var base: UtilityDialogCommon = UtilityDialogCommon(),
    public var mode: UtilitySavedataMode = UtilitySavedataMode.entries.first(),
    public var unknown1: Int = 0,
    public var overwrite: Int = 0,
    public var gameName: UByteArray = UByteArray(13),
    public var reserved: UByteArray = UByteArray(3),
    public var saveName: UByteArray = UByteArray(20),
    public var saveNameList: UByteArray? = null,
    public var fileName: UByteArray = UByteArray(13),
    public var reserved1: UByteArray = UByteArray(3),
    public var dataBuf: COpaquePointer? = null,
    public var dataBufSize: Int = 0,
    public var dataSize: Int = 0,
    public var sfoParam: UtilitySavedataSFOParam = UtilitySavedataSFOParam(),
    public var icon0FileData: UtilitySavedataFileData = UtilitySavedataFileData(),
    public var icon1FileData: UtilitySavedataFileData = UtilitySavedataFileData(),
    public var pic1FileData: UtilitySavedataFileData = UtilitySavedataFileData(),
    public var snd0FileData: UtilitySavedataFileData = UtilitySavedataFileData(),
    public var newData: UtilitySavedataListSaveNewData? = null,
    public var focus: UtilitySavedataFocus = UtilitySavedataFocus.entries.first(),
    public var unknown2: IntArray = IntArray(4),
    public var key: UByteArray = UByteArray(16),
    public var unknown3: UByteArray = UByteArray(20),
)

public data class SceNetAdhocctlPeerInfo(
    public var next: SceNetAdhocctlPeerInfo? = null,
    public var nickname: UByteArray = UByteArray(128),
    public var mac: UByteArray = UByteArray(6),
    public var unknown: UByteArray = UByteArray(6),
    public var timestamp: UInt = 0u,
) {
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

public expect fun sceAudioOutput(channel: Int, vol: Int, buf: COpaquePointer?): Int

public expect fun sceAudioOutputBlocking(channel: Int, vol: Int, buf: COpaquePointer?): Int

public expect fun sceAudioOutputPanned(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int

public expect fun sceAudioOutputPannedBlocking(channel: Int, leftVol: Int, rightVol: Int, buf: COpaquePointer?): Int

public expect fun sceAudioGetChannelRestLen(channel: Int): Int

public expect fun sceAudioGetChannelRestLength(channel: Int): Int

public expect fun sceAudioSetChannelDataLen(channel: Int, sampleCount: Int): Int

public expect fun sceAudioChangeChannelConfig(channel: Int, format: AudioFormat): Int

public expect fun sceAudioChangeChannelVolume(channel: Int, leftVol: Int, rightVol: Int): Int

public expect fun sceAudioOutput2Reserve(sampleCount: Int): Int

public expect fun sceAudioOutput2Release(): Int

public expect fun sceAudioOutput2ChangeLength(sampleCount: Int): Int

public expect fun sceAudioOutput2OutputBlocking(vol: Int, buf: COpaquePointer?): Int

public expect fun sceAudioOutput2GetRestSample(): Int

public expect fun sceAudioSRCChReserve(sampleCount: Int, freq: AudioOutputFrequency, channels: Int): Int

public expect fun sceAudioSRCChRelease(): Int

public expect fun sceAudioSRCOutputBlocking(vol: Int, buf: COpaquePointer?): Int

public expect fun sceAudioInputInit(unknown1: Int, gain: Int, unknown2: Int): Int

public expect fun sceAudioInputInitEx(params: COpaquePointer?): Int

public expect fun sceAudioInputBlocking(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?)

public expect fun sceAudioInput(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?)

public expect fun sceAudioGetInputLength(): Int

public expect fun sceAudioWaitInputEnd(): Int

public expect fun sceAudioPollInputEnd(): Int

public expect fun sceAtracGetAtracID(uiCodecType: UInt): Int

public expect fun sceAtracSetDataAndGetID(buf: COpaquePointer?, bufsize: ULong): Int

public expect fun sceAtracDecodeData(atracId: Int, outSamples: COpaquePointer?, outN: COpaquePointer?, outEnd: COpaquePointer?, outRemainFrame: COpaquePointer?): Int

public expect fun sceAtracGetRemainFrame(atracId: Int, outRemainFrame: COpaquePointer?): Int

public expect fun sceAtracGetStreamDataInfo(atracId: Int, writePointer: COpaquePointer?, availableBytes: COpaquePointer?, readOffset: COpaquePointer?): Int

public expect fun sceAtracAddStreamData(atracId: Int, bytesToAdd: UInt): Int

public expect fun sceAtracGetBitrate(atracId: Int, outBitrate: COpaquePointer?): Int

public expect fun sceAtracSetLoopNum(atracId: Int, nloops: Int): Int

public expect fun sceAtracReleaseAtracID(atracId: Int): Int

public expect fun sceAtracGetNextSample(atracId: Int, outN: COpaquePointer?): Int

public expect fun sceAtracGetMaxSample(atracId: Int, outMax: COpaquePointer?): Int

public expect fun sceAtracGetBufferInfoForReseting(atracId: Int, uiSample: UInt, pbufferInfo: COpaquePointer?): Int

public expect fun sceAtracGetChannel(atracId: Int, puiChannel: COpaquePointer?): Int

public expect fun sceAtracGetInternalErrorInfo(atracId: Int, piResult: COpaquePointer?): Int

public expect fun sceAtracGetLoopStatus(atracId: Int, piLoopNum: COpaquePointer?, puiLoopStatus: COpaquePointer?): Int

public expect fun sceAtracGetNextDecodePosition(atracId: Int, puiSamplePosition: COpaquePointer?): Int

public expect fun sceAtracGetSecondBufferInfo(atracId: Int, puiPosition: COpaquePointer?, puiDataByte: COpaquePointer?): Int

public expect fun sceAtracGetSoundSample(atracId: Int, piEndSample: COpaquePointer?, piLoopStartSample: COpaquePointer?, piLoopEndSample: COpaquePointer?): Int

public expect fun sceAtracResetPlayPosition(atracId: Int, uiSample: UInt, uiWriteByteFirstBuf: UInt, uiWriteByteSecondBuf: UInt): Int

public expect fun sceAtracSetData(atracId: Int, pucBufferAddr: COpaquePointer?, uiBufferByte: UInt): Int

public expect fun sceAtracSetHalfwayBuffer(atracId: Int, pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int

public expect fun sceAtracSetHalfwayBufferAndGetID(pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int

public expect fun sceAtracSetSecondBuffer(atracId: Int, pucSecondBufferAddr: COpaquePointer?, uiSecondBufferByte: UInt): Int

public expect fun sceCtrlSetSamplingCycle(cycle: Int): Int

public expect fun sceCtrlGetSamplingCycle(pcycle: COpaquePointer?): Int

public expect fun sceCtrlSetSamplingMode(mode: CtrlMode): Int

public expect fun sceCtrlGetSamplingMode(pmode: COpaquePointer?): Int

public expect fun sceCtrlPeekBufferPositive(padData: COpaquePointer?, count: Int): Int

public expect fun sceCtrlPeekBufferNegative(padData: COpaquePointer?, count: Int): Int

public expect fun sceCtrlReadBufferPositive(padData: COpaquePointer?, count: Int): Int

public expect fun sceCtrlReadBufferNegative(padData: COpaquePointer?, count: Int): Int

public expect fun sceCtrlPeekLatch(latchData: COpaquePointer?): Int

public expect fun sceCtrlReadLatch(latchData: COpaquePointer?): Int

public expect fun sceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int

public expect fun sceCtrlGetIdleCancelThreshold(idlereset: COpaquePointer?, idleback: COpaquePointer?): Int

public expect fun sceDisplaySetMode(mode: DisplayMode, width: ULong, height: ULong): UInt

public expect fun sceDisplayGetMode(pmode: COpaquePointer?, pwidth: COpaquePointer?, pheight: COpaquePointer?): Int

public expect fun sceDisplaySetFrameBuf(topAddr: COpaquePointer?, bufferWidth: ULong, pixelFormat: DisplayPixelFormat, sync: DisplaySetBufSync): UInt

public expect fun sceDisplayGetFrameBuf(topAddr: COpaquePointer?, bufferWidth: COpaquePointer?, pixelFormat: COpaquePointer?, sync: DisplaySetBufSync): Int

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

public expect fun sceGeEdramGetAddr(): COpaquePointer?

public expect fun sceGeEdramSetAddrTranslation(width: Int): Int

public expect fun sceGeGetCmd(cmd: Int): UInt

public expect fun sceGeGetMtx(type: GeMatrixType, matrix: COpaquePointer?): Int

public expect fun sceGeGetStack(stackId: Int, stack: COpaquePointer?): Int

public expect fun sceGeSaveContext(context: COpaquePointer?): Int

public expect fun sceGeRestoreContext(context: COpaquePointer?): Int

public expect fun sceGeListEnQueue(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: COpaquePointer?): Int

public expect fun sceGeListEnQueueHead(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: COpaquePointer?): Int

public expect fun sceGeListDeQueue(qid: Int): Int

public expect fun sceGeListUpdateStallAddr(qid: Int, stall: COpaquePointer?): Int

public expect fun sceGeListSync(qid: Int, syncType: Int): GeListState

public expect fun sceGeDrawSync(syncType: Int): GeListState

public expect fun sceGeBreak(mode: Int, pParam: COpaquePointer?): Int

public expect fun sceGeContinue(): Int

public expect fun sceGeSetCallback(cb: COpaquePointer?): Int

public expect fun sceGeUnsetCallback(cbid: Int): Int

public expect fun sceKernelExitGame()

public expect fun sceKernelRegisterExitCallback(id: SceUid): Int

public expect fun sceKernelLoadExec(file: COpaquePointer?, param: COpaquePointer?): Int

public expect fun sceKernelAllocPartitionMemory(partition: SceSysMemPartitionId, name: COpaquePointer?, type: SceSysMemBlockTypes, size: UInt, addr: COpaquePointer?): SceUid

public expect fun sceKernelGetBlockHeadAddr(blockid: SceUid): COpaquePointer?

public expect fun sceKernelFreePartitionMemory(blockid: SceUid): Int

public expect fun sceKernelTotalFreeMemSize(): ULong

public expect fun sceKernelMaxFreeMemSize(): ULong

public expect fun sceKernelDevkitVersion(): UInt

public expect fun sceKernelSetCompiledSdkVersion(version: UInt): Int

public expect fun sceKernelGetCompiledSdkVersion(): UInt

public expect fun sceKernelLibcTime(t: COpaquePointer?): Int

public expect fun sceKernelLibcClock(): UInt

public expect fun sceKernelLibcGettimeofday(tp: COpaquePointer?, tzp: COpaquePointer?): Int

public expect fun sceKernelDcacheWritebackAll()

public expect fun sceKernelDcacheWritebackInvalidateAll()

public expect fun sceKernelDcacheWritebackRange(p: COpaquePointer?, size: UInt)

public expect fun sceKernelDcacheWritebackInvalidateRange(p: COpaquePointer?, size: UInt)

public expect fun sceKernelDcacheInvalidateRange(p: COpaquePointer?, size: UInt)

public expect fun sceKernelIcacheInvalidateAll()

public expect fun sceKernelIcacheInvalidateRange(p: COpaquePointer?, size: UInt)

public expect fun sceKernelUtilsMt19937Init(ctx: COpaquePointer?, seed: UInt): Int

public expect fun sceKernelUtilsMt19937UInt(ctx: COpaquePointer?): UInt

public expect fun sceKernelUtilsMd5Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int

public expect fun sceKernelUtilsMd5BlockInit(ctx: COpaquePointer?): Int

public expect fun sceKernelUtilsMd5BlockUpdate(ctx: COpaquePointer?, data: COpaquePointer?, size: UInt): Int

public expect fun sceKernelUtilsMd5BlockResult(ctx: COpaquePointer?, digest: COpaquePointer?): Int

public expect fun sceKernelUtilsSha1Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int

public expect fun sceKernelUtilsSha1BlockInit(ctx: COpaquePointer?): Int

public expect fun sceKernelUtilsSha1BlockUpdate(ctx: COpaquePointer?, data: COpaquePointer?, size: UInt): Int

public expect fun sceKernelUtilsSha1BlockResult(ctx: COpaquePointer?, digest: COpaquePointer?): Int

public expect fun sceKernelRegisterSubIntrHandler(intNo: Int, no: Int, handler: COpaquePointer?, arg: COpaquePointer?): Int

public expect fun sceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int

public expect fun sceKernelEnableSubIntr(intNo: Int, no: Int): Int

public expect fun sceKernelDisableSubIntr(intNo: Int, no: Int): Int

public expect fun queryIntrHandlerInfo(intrCode: SceUid, subIntrCode: SceUid, data: COpaquePointer?): Int

public expect fun sceKernelCpuSuspendIntr(): UInt

public expect fun sceKernelCpuResumeIntr(flags: UInt)

public expect fun sceKernelCpuResumeIntrWithSync(flags: UInt)

public expect fun sceKernelIsCpuIntrSuspended(flags: UInt): Int

public expect fun sceKernelIsCpuIntrEnable(): Int

public expect fun sceKernelLoadModule(path: COpaquePointer?, flags: Int, option: COpaquePointer?): SceUid

public expect fun sceKernelLoadModuleMs(path: COpaquePointer?, flags: Int, option: COpaquePointer?): SceUid

public expect fun sceKernelLoadModuleByID(fid: SceUid, flags: Int, option: COpaquePointer?): SceUid

public expect fun sceKernelLoadModuleBufferUsbWlan(bufSize: ULong, buf: COpaquePointer?, flags: Int, option: COpaquePointer?): SceUid

public expect fun sceKernelStartModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: COpaquePointer?, option: COpaquePointer?): Int

public expect fun sceKernelStopModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: COpaquePointer?, option: COpaquePointer?): Int

public expect fun sceKernelUnloadModule(modId: SceUid): Int

public expect fun sceKernelSelfStopUnloadModule(unknown: Int, argSize: ULong, argp: COpaquePointer?): Int

public expect fun sceKernelStopUnloadSelfModule(argSize: ULong, argp: COpaquePointer?, status: COpaquePointer?, option: COpaquePointer?): Int

public expect fun sceKernelQueryModuleInfo(modId: SceUid, info: COpaquePointer?): Int

public expect fun sceKernelGetModuleIdList(readBuf: COpaquePointer?, readBufSize: Int, idCount: COpaquePointer?): Int

public expect fun sceKernelVolatileMemLock(unk: Int, ptr: COpaquePointer?, size: COpaquePointer?): Int

public expect fun sceKernelVolatileMemTryLock(unk: Int, ptr: COpaquePointer?, size: COpaquePointer?): Int

public expect fun sceKernelVolatileMemUnlock(unk: Int): Int

public expect fun sceKernelStdin(): SceUid

public expect fun sceKernelStdout(): SceUid

public expect fun sceKernelStderr(): SceUid

public expect fun sceKernelGetThreadmanIdType(uid: SceUid): SceKernelIdListType

public expect fun sceKernelCreateThread(name: COpaquePointer?, entry: SceKernelThreadEntry, initPriority: Int, stackSize: Int, attr: Int, option: COpaquePointer?): SceUid

public expect fun sceKernelDeleteThread(thid: SceUid): Int

public expect fun sceKernelStartThread(id: SceUid, argLen: ULong, argP: COpaquePointer?): Int

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

public expect fun sceKernelWaitThreadEnd(thid: SceUid, timeout: COpaquePointer?): Int

public expect fun sceKernelWaitThreadEndCB(thid: SceUid, timeout: COpaquePointer?): Int

public expect fun sceKernelDelayThread(delay: UInt): Int

public expect fun sceKernelDelayThreadCB(delay: UInt): Int

public expect fun sceKernelDelaySysClockThread(delay: COpaquePointer?): Int

public expect fun sceKernelDelaySysClockThreadCB(delay: COpaquePointer?): Int

public expect fun sceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int

public expect fun sceKernelChangeThreadPriority(thid: SceUid, priority: Int): Int

public expect fun sceKernelRotateThreadReadyQueue(priority: Int): Int

public expect fun sceKernelReleaseWaitThread(thid: SceUid): Int

public expect fun sceKernelGetThreadId(): Int

public expect fun sceKernelGetThreadCurrentPriority(): Int

public expect fun sceKernelGetThreadExitStatus(thid: SceUid): Int

public expect fun sceKernelCheckThreadStack(): Int

public expect fun sceKernelGetThreadStackFreeSize(thid: SceUid): Int

public expect fun sceKernelReferThreadStatus(thid: SceUid, info: COpaquePointer?): Int

public expect fun sceKernelReferThreadRunStatus(thid: SceUid, status: COpaquePointer?): Int

public expect fun sceKernelCreateSema(name: COpaquePointer?, attr: UInt, initVal: Int, maxVal: Int, option: COpaquePointer?): SceUid

public expect fun sceKernelDeleteSema(semaId: SceUid): Int

public expect fun sceKernelSignalSema(semaId: SceUid, signal: Int): Int

public expect fun sceKernelWaitSema(semaId: SceUid, signal: Int, timeout: COpaquePointer?): Int

public expect fun sceKernelWaitSemaCB(semaId: SceUid, signal: Int, timeout: COpaquePointer?): Int

public expect fun sceKernelPollSema(semaId: SceUid, signal: Int): Int

public expect fun sceKernelReferSemaStatus(semaId: SceUid, info: COpaquePointer?): Int

public expect fun sceKernelCreateEventFlag(name: COpaquePointer?, attr: Int, bits: Int, opt: COpaquePointer?): SceUid

public expect fun sceKernelSetEventFlag(evId: SceUid, bits: UInt): Int

public expect fun sceKernelClearEventFlag(evId: SceUid, bits: UInt): Int

public expect fun sceKernelPollEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: COpaquePointer?): Int

public expect fun sceKernelWaitEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: COpaquePointer?, timeout: COpaquePointer?): Int

public expect fun sceKernelWaitEventFlagCB(evId: SceUid, bits: UInt, wait: Int, outBits: COpaquePointer?, timeout: COpaquePointer?): Int

public expect fun sceKernelDeleteEventFlag(evId: SceUid): Int

public expect fun sceKernelReferEventFlagStatus(event: SceUid, status: COpaquePointer?): Int

public expect fun sceKernelCreateMbx(name: COpaquePointer?, attr: UInt, option: COpaquePointer?): SceUid

public expect fun sceKernelDeleteMbx(mbxId: SceUid): Int

public expect fun sceKernelSendMbx(mbxId: SceUid, message: COpaquePointer?): Int

public expect fun sceKernelReceiveMbx(mbxId: SceUid, message: COpaquePointer?, timeout: COpaquePointer?): Int

public expect fun sceKernelReceiveMbxCB(mbxId: SceUid, message: COpaquePointer?, timeout: COpaquePointer?): Int

public expect fun sceKernelPollMbx(mbxId: SceUid, pmessage: COpaquePointer?): Int

public expect fun sceKernelCancelReceiveMbx(mbxId: SceUid, num: COpaquePointer?): Int

public expect fun sceKernelReferMbxStatus(mbxId: SceUid, info: COpaquePointer?): Int

public expect fun sceKernelSetAlarm(clock: UInt, handler: SceKernelAlarmHandler, common: COpaquePointer?): SceUid

public expect fun sceKernelSetSysClockAlarm(clock: COpaquePointer?, handler: COpaquePointer?, common: COpaquePointer?): SceUid

public expect fun sceKernelCancelAlarm(alarmId: SceUid): Int

public expect fun sceKernelReferAlarmStatus(alarmId: SceUid, info: COpaquePointer?): Int

public expect fun sceKernelCreateCallback(name: COpaquePointer?, func: SceKernelCallbackFunction, arg: COpaquePointer?): SceUid

public expect fun sceKernelReferCallbackStatus(cb: SceUid, status: COpaquePointer?): Int

public expect fun sceKernelDeleteCallback(cb: SceUid): Int

public expect fun sceKernelNotifyCallback(cb: SceUid, arg2: Int): Int

public expect fun sceKernelCancelCallback(cb: SceUid): Int

public expect fun sceKernelGetCallbackCount(cb: SceUid): Int

public expect fun sceKernelCheckCallback(): Int

public expect fun sceKernelGetThreadmanIdList(type: SceKernelIdListType, readBuf: COpaquePointer?, readBufSize: Int, idCount: COpaquePointer?): Int

public expect fun sceKernelReferSystemStatus(status: COpaquePointer?): Int

public expect fun sceKernelCreateMsgPipe(name: COpaquePointer?, part: Int, attr: Int, unk1: COpaquePointer?, opt: COpaquePointer?): SceUid

public expect fun sceKernelDeleteMsgPipe(uid: SceUid): Int

public expect fun sceKernelSendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: COpaquePointer?): Int

public expect fun sceKernelSendMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: COpaquePointer?): Int

public expect fun sceKernelTrySendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int

public expect fun sceKernelReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: COpaquePointer?): Int

public expect fun sceKernelReceiveMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: COpaquePointer?): Int

public expect fun sceKernelTryReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int

public expect fun sceKernelCancelMsgPipe(uid: SceUid, send: COpaquePointer?, recv: COpaquePointer?): Int

public expect fun sceKernelReferMsgPipeStatus(uid: SceUid, info: COpaquePointer?): Int

public expect fun sceKernelCreateVpl(name: COpaquePointer?, part: Int, attr: Int, size: UInt, opt: COpaquePointer?): SceUid

public expect fun sceKernelDeleteVpl(uid: SceUid): Int

public expect fun sceKernelAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: COpaquePointer?): Int

public expect fun sceKernelAllocateVplCB(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: COpaquePointer?): Int

public expect fun sceKernelTryAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?): Int

public expect fun sceKernelFreeVpl(uid: SceUid, data: COpaquePointer?): Int

public expect fun sceKernelCancelVpl(uid: SceUid, num: COpaquePointer?): Int

public expect fun sceKernelReferVplStatus(uid: SceUid, info: COpaquePointer?): Int

public expect fun sceKernelCreateFpl(name: COpaquePointer?, part: Int, attr: Int, size: UInt, blocks: UInt, opt: COpaquePointer?): Int

public expect fun sceKernelDeleteFpl(uid: SceUid): Int

public expect fun sceKernelAllocateFpl(uid: SceUid, data: COpaquePointer?, timeout: COpaquePointer?): Int

public expect fun sceKernelAllocateFplCB(uid: SceUid, data: COpaquePointer?, timeout: COpaquePointer?): Int

public expect fun sceKernelTryAllocateFpl(uid: SceUid, data: COpaquePointer?): Int

public expect fun sceKernelFreeFpl(uid: SceUid, data: COpaquePointer?): Int

public expect fun sceKernelCancelFpl(uid: SceUid, pnum: COpaquePointer?): Int

public expect fun sceKernelReferFplStatus(uid: SceUid, info: COpaquePointer?): Int

public expect fun sceKernelUSec2SysClock(usec: UInt, clock: COpaquePointer?): Int

public expect fun sceKernelUSec2SysClockWide(usec: UInt): Long

public expect fun sceKernelSysClock2USec(clock: COpaquePointer?, low: COpaquePointer?, high: COpaquePointer?): Int

public expect fun sceKernelSysClock2USecWide(clock: Long, low: COpaquePointer?, high: COpaquePointer?): Int

public expect fun sceKernelGetSystemTime(time: COpaquePointer?): Int

public expect fun sceKernelGetSystemTimeWide(): Long

public expect fun sceKernelGetSystemTimeLow(): UInt

public expect fun sceKernelCreateVTimer(name: COpaquePointer?, opt: COpaquePointer?): SceUid

public expect fun sceKernelDeleteVTimer(uid: SceUid): Int

public expect fun sceKernelGetVTimerBase(uid: SceUid, base: COpaquePointer?): Int

public expect fun sceKernelGetVTimerBaseWide(uid: SceUid): Long

public expect fun sceKernelGetVTimerTime(uid: SceUid, time: COpaquePointer?): Int

public expect fun sceKernelGetVTimerTimeWide(uid: SceUid): Long

public expect fun sceKernelSetVTimerTime(uid: SceUid, time: COpaquePointer?): Int

public expect fun sceKernelSetVTimerTimeWide(uid: SceUid, time: Long): Long

public expect fun sceKernelStartVTimer(uid: SceUid): Int

public expect fun sceKernelStopVTimer(uid: SceUid): Int

public expect fun sceKernelSetVTimerHandler(uid: SceUid, time: COpaquePointer?, handler: SceKernelVTimerHandler, common: COpaquePointer?): Int

public expect fun sceKernelSetVTimerHandlerWide(uid: SceUid, time: Long, handler: SceKernelVTimerHandlerWide, common: COpaquePointer?): Int

public expect fun sceKernelCancelVTimerHandler(uid: SceUid): Int

public expect fun sceKernelReferVTimerStatus(uid: SceUid, info: COpaquePointer?): Int

public expect fun sceKernelRegisterThreadEventHandler(name: COpaquePointer?, threadId: SceUid, mask: Int, handler: SceKernelThreadEventHandler, common: COpaquePointer?): SceUid

public expect fun sceKernelReleaseThreadEventHandler(uid: SceUid): Int

public expect fun sceKernelReferThreadEventHandlerStatus(uid: SceUid, info: COpaquePointer?): Int

public expect fun sceKernelReferThreadProfiler(): COpaquePointer?

public expect fun sceKernelReferGlobalProfiler(): COpaquePointer?

public expect fun sceUsbStart(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int

public expect fun sceUsbStop(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int

public expect fun sceUsbActivate(pid: UInt): Int

public expect fun sceUsbDeactivate(pid: UInt): Int

public expect fun sceUsbGetState(): Int

public expect fun sceUsbGetDrvState(driverName: COpaquePointer?): Int

public expect fun sceUsbCamSetupStill(param: COpaquePointer?): Int

public expect fun sceUsbCamSetupStillEx(param: COpaquePointer?): Int

public expect fun sceUsbCamStillInputBlocking(buf: COpaquePointer?, size: ULong): Int

public expect fun sceUsbCamStillInput(buf: COpaquePointer?, size: ULong): Int

public expect fun sceUsbCamStillWaitInputEnd(): Int

public expect fun sceUsbCamStillPollInputEnd(): Int

public expect fun sceUsbCamStillCancelInput(): Int

public expect fun sceUsbCamStillGetInputLength(): Int

public expect fun sceUsbCamSetupVideo(param: COpaquePointer?, workArea: COpaquePointer?, workAreaSize: Int): Int

public expect fun sceUsbCamSetupVideoEx(param: COpaquePointer?, workArea: COpaquePointer?, workAreaSize: Int): Int

public expect fun sceUsbCamStartVideo(): Int

public expect fun sceUsbCamStopVideo(): Int

public expect fun sceUsbCamReadVideoFrameBlocking(buf: COpaquePointer?, size: ULong): Int

public expect fun sceUsbCamReadVideoFrame(buf: COpaquePointer?, size: ULong): Int

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

public expect fun sceUsbCamGetSaturation(saturation: COpaquePointer?): Int

public expect fun sceUsbCamGetBrightness(brightness: COpaquePointer?): Int

public expect fun sceUsbCamGetContrast(contrast: COpaquePointer?): Int

public expect fun sceUsbCamGetSharpness(sharpness: COpaquePointer?): Int

public expect fun sceUsbCamGetImageEffectMode(effectMode: COpaquePointer?): Int

public expect fun sceUsbCamGetEvLevel(exposureLevel: COpaquePointer?): Int

public expect fun sceUsbCamGetReverseMode(reverseFlags: COpaquePointer?): Int

public expect fun sceUsbCamGetZoom(zoom: COpaquePointer?): Int

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

public expect fun sceWlanGetEtherAddr(etherAddr: COpaquePointer?): Int

public expect fun sceWlanDevAttach(): Int

public expect fun sceWlanDevDetach(): Int

public expect fun sceRtcGetTickResolution(): UInt

public expect fun sceRtcGetCurrentTick(tick: COpaquePointer?): Int

public expect fun sceRtcGetCurrentClock(tm: COpaquePointer?, tz: Int): Int

public expect fun sceRtcGetCurrentClockLocalTime(tm: COpaquePointer?): Int

public expect fun sceRtcConvertUtcToLocalTime(tickUtc: COpaquePointer?, tickLocal: COpaquePointer?): Int

public expect fun sceRtcConvertLocalTimeToUTC(tickLocal: COpaquePointer?, tickUtc: COpaquePointer?): Int

public expect fun sceRtcIsLeapYear(year: Int): Int

public expect fun sceRtcGetDaysInMonth(year: Int, month: Int): Int

public expect fun sceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int

public expect fun sceRtcCheckValid(date: COpaquePointer?): Int

public expect fun sceRtcSetTick(date: COpaquePointer?, tick: COpaquePointer?): Int

public expect fun sceRtcGetTick(date: COpaquePointer?, tick: COpaquePointer?): Int

public expect fun sceRtcCompareTick(tick1: COpaquePointer?, tick2: COpaquePointer?): Int

public expect fun sceRtcTickAddTicks(destTick: COpaquePointer?, srcTick: COpaquePointer?, numTicks: ULong): Int

public expect fun sceRtcTickAddMicroseconds(destTick: COpaquePointer?, srcTick: COpaquePointer?, numMs: ULong): Int

public expect fun sceRtcTickAddSeconds(destTick: COpaquePointer?, srcTick: COpaquePointer?, numSeconds: ULong): Int

public expect fun sceRtcTickAddMinutes(destTick: COpaquePointer?, srcTick: COpaquePointer?, numMinutes: ULong): Int

public expect fun sceRtcTickAddHours(destTick: COpaquePointer?, srcTick: COpaquePointer?, numHours: ULong): Int

public expect fun sceRtcTickAddDays(destTick: COpaquePointer?, srcTick: COpaquePointer?, numDays: ULong): Int

public expect fun sceRtcTickAddWeeks(destTick: COpaquePointer?, srcTick: COpaquePointer?, numWeeks: ULong): Int

public expect fun sceRtcTickAddMonths(destTick: COpaquePointer?, srcTick: COpaquePointer?, numMonths: ULong): Int

public expect fun sceRtcTickAddYears(destTick: COpaquePointer?, srcTick: COpaquePointer?, numYears: ULong): Int

public expect fun sceRtcSetTimeT(date: COpaquePointer?, time: UInt): Int

public expect fun sceRtcGetTimeT(date: COpaquePointer?, time: COpaquePointer?): Int

public expect fun sceRtcSetTime64T(date: COpaquePointer?, time: ULong): Int

public expect fun sceRtcGetTime64T(date: COpaquePointer?, time: COpaquePointer?): Int

public expect fun sceRtcSetDosTime(date: COpaquePointer?, dosTime: UInt): Int

public expect fun sceRtcGetDosTime(date: COpaquePointer?, dosTime: UInt): Int

public expect fun sceRtcSetWin32FileTime(date: COpaquePointer?, time: COpaquePointer?): Int

public expect fun sceRtcGetWin32FileTime(date: COpaquePointer?, time: COpaquePointer?): Int

public expect fun sceRtcParseDateTime(destTick: COpaquePointer?, dateString: COpaquePointer?): Int

public expect fun sceRtcFormatRFC3339(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?, timeZoneMinutes: Int): Int

public expect fun sceRtcFormatRFC3339LocalTime(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?): Int

public expect fun sceRtcParseRFC3339(pUtc: COpaquePointer?, pszDateTime: COpaquePointer?): Int

public expect fun sceRtcFormatRFC2822(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?, timeZoneMinutes: Int): Int

public expect fun sceRtcFormatRFC2822LocalTime(pszDateTime: COpaquePointer?, pUtc: COpaquePointer?): Int

public expect fun sceIoOpen(file: COpaquePointer?, flags: Int, permissions: IoPermissions): SceUid

public expect fun sceIoOpenAsync(file: COpaquePointer?, flags: Int, permissions: IoPermissions): SceUid

public expect fun sceIoClose(fd: SceUid): Int

public expect fun sceIoCloseAsync(fd: SceUid): Int

public expect fun sceIoRead(fd: SceUid, data: COpaquePointer?, size: UInt): Int

public expect fun sceIoReadAsync(fd: SceUid, data: COpaquePointer?, size: UInt): Int

public expect fun sceIoWrite(fd: SceUid, data: COpaquePointer?, size: ULong): Int

public expect fun sceIoWriteAsync(fd: SceUid, data: COpaquePointer?, size: UInt): Int

public expect fun sceIoLseek(fd: SceUid, offset: Long, whence: IoWhence): Long

public expect fun sceIoLseekAsync(fd: SceUid, offset: Long, whence: IoWhence): Int

public expect fun sceIoLseek32(fd: SceUid, offset: Int, whence: IoWhence): Int

public expect fun sceIoLseek32Async(fd: SceUid, offset: Int, whence: IoWhence): Int

public expect fun sceIoRemove(file: COpaquePointer?): Int

public expect fun sceIoMkdir(dir: COpaquePointer?, mode: IoPermissions): Int

public expect fun sceIoRmdir(path: COpaquePointer?): Int

public expect fun sceIoChdir(path: COpaquePointer?): Int

public expect fun sceIoRename(oldname: COpaquePointer?, newname: COpaquePointer?): Int

public expect fun sceIoDopen(dirname: COpaquePointer?): SceUid

public expect fun sceIoDread(fd: SceUid, dir: COpaquePointer?): Int

public expect fun sceIoDclose(fd: SceUid): Int

public expect fun sceIoDevctl(dev: COpaquePointer?, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int

public expect fun sceIoAssign(dev1: COpaquePointer?, dev2: COpaquePointer?, dev3: COpaquePointer?, mode: IoAssignPerms, unk1: COpaquePointer?, unk2: Int): Int

public expect fun sceIoUnassign(dev: COpaquePointer?): Int

public expect fun sceIoGetstat(file: COpaquePointer?, stat: COpaquePointer?): Int

public expect fun sceIoChstat(file: COpaquePointer?, stat: COpaquePointer?, bits: Int): Int

public expect fun sceIoIoctl(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int

public expect fun sceIoIoctlAsync(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int

public expect fun sceIoSync(device: COpaquePointer?, unk: UInt): Int

public expect fun sceIoWaitAsync(fd: SceUid, res: COpaquePointer?): Int

public expect fun sceIoWaitAsyncCB(fd: SceUid, res: COpaquePointer?): Int

public expect fun sceIoPollAsync(fd: SceUid, res: COpaquePointer?): Int

public expect fun sceIoGetAsyncStat(fd: SceUid, poll: Int, res: COpaquePointer?): Int

public expect fun sceIoCancel(fd: SceUid): Int

public expect fun sceIoGetDevType(fd: SceUid): Int

public expect fun sceIoChangeAsyncPriority(fd: SceUid, pri: Int): Int

public expect fun sceIoSetAsyncCallback(fd: SceUid, cb: SceUid, argp: COpaquePointer?): Int

public expect fun sceJpegInitMJpeg(): Int

public expect fun sceJpegFinishMJpeg(): Int

public expect fun sceJpegCreateMJpeg(width: Int, height: Int): Int

public expect fun sceJpegDeleteMJpeg(): Int

public expect fun sceJpegDecodeMJpeg(jpegBuf: COpaquePointer?, size: ULong, rgba: COpaquePointer?, unk: UInt): Int

public expect fun sceUmdCheckMedium(): Int

public expect fun sceUmdGetDiscInfo(info: COpaquePointer?): Int

public expect fun sceUmdActivate(unit: Int, drive: COpaquePointer?): Int

public expect fun sceUmdDeactivate(unit: Int, drive: COpaquePointer?): Int

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

public expect fun sceMpegRingbufferConstruct(ringbuffer: COpaquePointer?, packets: Int, data: COpaquePointer?, size: Int, callback: SceMpegRingbufferCb, cbParam: COpaquePointer?): Int

public expect fun sceMpegRingbufferDestruct(ringbuffer: COpaquePointer?)

public expect fun sceMpegRingbufferAvailableSize(ringbuffer: COpaquePointer?): Int

public expect fun sceMpegRingbufferPut(ringbuffer: COpaquePointer?, numPackets: Int, available: Int): Int

public expect fun sceMpegQueryMemSize(unk: Int): Int

public expect fun sceMpegCreate(handle: SceMpeg, data: COpaquePointer?, size: Int, ringbuffer: COpaquePointer?, frameWidth: Int, unk1: Int, unk2: Int): Int

public expect fun sceMpegDelete(handle: SceMpeg)

public expect fun sceMpegQueryStreamOffset(handle: SceMpeg, buffer: COpaquePointer?, offset: COpaquePointer?): Int

public expect fun sceMpegQueryStreamSize(buffer: COpaquePointer?, size: COpaquePointer?): Int

public expect fun sceMpegRegistStream(handle: SceMpeg, streamId: Int, unk: Int): SceMpegStream

public expect fun sceMpegUnRegistStream(handle: SceMpeg, stream: SceMpegStream)

public expect fun sceMpegFlushAllStream(handle: SceMpeg): Int

public expect fun sceMpegMallocAvcEsBuf(handle: SceMpeg): COpaquePointer?

public expect fun sceMpegFreeAvcEsBuf(handle: SceMpeg, buf: COpaquePointer?)

public expect fun sceMpegQueryAtracEsSize(handle: SceMpeg, esSize: COpaquePointer?, outSize: COpaquePointer?): Int

public expect fun sceMpegInitAu(handle: SceMpeg, esBuffer: COpaquePointer?, au: COpaquePointer?): Int

public expect fun sceMpegGetAvcAu(handle: SceMpeg, stream: SceMpegStream, au: COpaquePointer?, unk: COpaquePointer?): Int

public expect fun sceMpegAvcDecodeMode(handle: SceMpeg, mode: COpaquePointer?): Int

public expect fun sceMpegAvcDecode(handle: SceMpeg, au: COpaquePointer?, iframeWidth: Int, buffer: COpaquePointer?, init: COpaquePointer?): Int

public expect fun sceMpegAvcDecodeStop(handle: SceMpeg, frameWidth: Int, buffer: COpaquePointer?, status: COpaquePointer?): Int

public expect fun sceMpegGetAtracAu(handle: SceMpeg, stream: SceMpegStream, au: COpaquePointer?, unk: COpaquePointer?): Int

public expect fun sceMpegAtracDecode(handle: SceMpeg, au: COpaquePointer?, buffer: COpaquePointer?, init: Int): Int

public expect fun sceMpegBaseYCrCbCopyVme(yuvBuffer: COpaquePointer?, buffer: COpaquePointer?, type: Int): Int

public expect fun sceMpegBaseCscInit(width: Int): Int

public expect fun sceMpegBaseCscVme(rgbBuffer: COpaquePointer?, rgbBuffer2: COpaquePointer?, width: Int, yCrCbBuffer: COpaquePointer?): Int

public expect fun sceMpegbaseBea18f91(lli: COpaquePointer?): Int

public expect fun sceHprmPeekCurrentKey(key: COpaquePointer?): Int

public expect fun sceHprmPeekLatch(latch: COpaquePointer?): Int

public expect fun sceHprmReadLatch(latch: COpaquePointer?): Int

public expect fun sceHprmIsHeadphoneExist(): Int

public expect fun sceHprmIsRemoteExist(): Int

public expect fun sceHprmIsMicrophoneExist(): Int

public expect fun sceGuDepthBuffer(zbp: COpaquePointer?, zbw: Int)

public expect fun sceGuDispBuffer(width: Int, height: Int, dispbp: COpaquePointer?, dispbw: Int)

public expect fun sceGuDrawBuffer(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int)

public expect fun sceGuDrawBufferList(psm: DisplayPixelFormat, fbp: COpaquePointer?, fbw: Int)

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

public expect fun sceGuGetMemory(size: Int): COpaquePointer?

public expect fun sceGuStart(contextType: GuContextType, list: COpaquePointer?)

public expect fun sceGuFinish(): Int

public expect fun sceGuFinishId(id: UInt): Int

public expect fun sceGuCallList(list: COpaquePointer?)

public expect fun sceGuCallMode(mode: Int)

public expect fun sceGuCheckList(): Int

public expect fun sceGuSendList(mode: GuQueueMode, list: COpaquePointer?, context: COpaquePointer?)

public expect fun sceGuSwapBuffers(): COpaquePointer?

public expect fun sceGuSync(mode: GuSyncMode, behavior: GuSyncBehavior): GeListState

public expect fun sceGuDrawArray(prim: GuPrimitive, vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?)

public expect fun sceGuBeginObject(vtype: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?)

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

public expect fun sceGuCopyImage(psm: DisplayPixelFormat, sx: Int, sy: Int, width: Int, height: Int, srcw: Int, src: COpaquePointer?, dx: Int, dy: Int, destw: Int, dest: COpaquePointer?)

public expect fun sceGuTexEnvColor(color: UInt)

public expect fun sceGuTexFilter(min: TextureFilter, mag: TextureFilter)

public expect fun sceGuTexFlush()

public expect fun sceGuTexFunc(tfx: TextureEffect, tcc: TextureColorComponent)

public expect fun sceGuTexImage(mipmap: MipmapLevel, width: Int, height: Int, tbw: Int, tbp: COpaquePointer?)

public expect fun sceGuTexLevelMode(mode: TextureLevelMode, bias: Float)

public expect fun sceGuTexMapMode(mode: TextureMapMode, a1: UInt, a2: UInt)

public expect fun sceGuTexMode(tpsm: TexturePixelFormat, maxmips: Int, a2: Int, swizzle: Int)

public expect fun sceGuTexOffset(u: Float, v: Float)

public expect fun sceGuTexProjMapMode(mode: TextureProjectionMapMode)

public expect fun sceGuTexScale(u: Float, v: Float)

public expect fun sceGuTexSlope(slope: Float)

public expect fun sceGuTexSync()

public expect fun sceGuTexWrap(u: GuTexWrapMode, v: GuTexWrapMode)

public expect fun sceGuClutLoad(numBlocks: Int, cbp: COpaquePointer?)

public expect fun sceGuClutMode(cpsm: ClutPixelFormat, shift: UInt, mask: UInt, a3: UInt)

public expect fun sceGuOffset(x: UInt, y: UInt)

public expect fun sceGuScissor(x: Int, y: Int, w: Int, h: Int)

public expect fun sceGuViewport(cx: Int, cy: Int, width: Int, height: Int)

public expect fun sceGuDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?)

public expect fun sceGuPatchDivide(ulevel: UInt, vlevel: UInt)

public expect fun sceGuPatchFrontFace(a0: UInt)

public expect fun sceGuPatchPrim(prim: PatchPrimitive)

public expect fun sceGuDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?)

public expect fun sceGuSetMatrix(type: MatrixMode, matrix: ScePspFMatrix4)

public expect fun sceGuBoneMatrix(index: UInt, matrix: ScePspFMatrix4)

public expect fun sceGuMorphWeight(index: Int, weight: Float)

public expect fun sceGuDrawArrayN(primitiveType: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?)

public expect fun sceGumDrawArray(prim: GuPrimitive, vType: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?)

public expect fun sceGumDrawArrayN(prim: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?)

public expect fun sceGumDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?)

public expect fun sceGumDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?)

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

public expect fun sceMp3ReserveMp3Handle(args: COpaquePointer?): Int

public expect fun sceMp3ReleaseMp3Handle(handle: Mp3Handle): Int

public expect fun sceMp3InitResource(): Int

public expect fun sceMp3TermResource(): Int

public expect fun sceMp3Init(handle: Mp3Handle): Int

public expect fun sceMp3Decode(handle: Mp3Handle, dst: COpaquePointer?): Int

public expect fun sceMp3GetInfoToAddStreamData(handle: Mp3Handle, dst: COpaquePointer?, toWrite: COpaquePointer?, srcPos: COpaquePointer?): Int

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

public expect fun sceRegOpenRegistry(reg: COpaquePointer?, mode: Int, handle: COpaquePointer?): Int

public expect fun sceRegFlushRegistry(handle: RegHandle): Int

public expect fun sceRegCloseRegistry(handle: RegHandle): Int

public expect fun sceRegOpenCategory(handle: RegHandle, name: COpaquePointer?, mode: Int, dirHandle: COpaquePointer?): Int

public expect fun sceRegRemoveCategory(handle: RegHandle, name: COpaquePointer?): Int

public expect fun sceRegCloseCategory(dirHandle: RegHandle): Int

public expect fun sceRegFlushCategory(dirHandle: RegHandle): Int

public expect fun sceRegGetKeyInfo(dirHandle: RegHandle, name: COpaquePointer?, keyHandle: COpaquePointer?, type: COpaquePointer?, size: COpaquePointer?): Int

public expect fun sceRegGetKeyInfoByName(dirHandle: RegHandle, name: COpaquePointer?, type: COpaquePointer?, size: COpaquePointer?): Int

public expect fun sceRegGetKeyValue(dirHandle: RegHandle, keyHandle: RegHandle, buf: COpaquePointer?, size: ULong): Int

public expect fun sceRegGetKeyValueByName(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int

public expect fun sceRegSetKeyValue(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int

public expect fun sceRegGetKeysNum(dirHandle: RegHandle, num: COpaquePointer?): Int

public expect fun sceRegGetKeys(dirHandle: RegHandle, buf: COpaquePointer?, num: Int): Int

public expect fun sceRegCreateKey(dirHandle: RegHandle, name: COpaquePointer?, type: Int, size: ULong): Int

public expect fun sceRegRemoveRegistry(key: COpaquePointer?): Int

public expect fun sceOpenPSIDGetOpenPSID(openpsid: COpaquePointer?): Int

public expect fun sceUtilityMsgDialogInitStart(params: COpaquePointer?): Int

public expect fun sceUtilityMsgDialogShutdownStart()

public expect fun sceUtilityMsgDialogGetStatus(): Int

public expect fun sceUtilityMsgDialogUpdate(n: Int)

public expect fun sceUtilityMsgDialogAbort(): Int

public expect fun sceUtilityNetconfInitStart(data: COpaquePointer?): Int

public expect fun sceUtilityNetconfShutdownStart(): Int

public expect fun sceUtilityNetconfUpdate(unknown: Int): Int

public expect fun sceUtilityNetconfGetStatus(): Int

public expect fun sceUtilityCheckNetParam(id: Int): Int

public expect fun sceUtilityGetNetParam(conf: Int, param: NetParam, data: COpaquePointer?): Int

public expect fun sceUtilitySavedataInitStart(params: COpaquePointer?): Int

public expect fun sceUtilitySavedataGetStatus(): Int

public expect fun sceUtilitySavedataShutdownStart(): Int

public expect fun sceUtilitySavedataUpdate(unknown: Int)

public expect fun sceUtilityGameSharingInitStart(params: COpaquePointer?): Int

public expect fun sceUtilityGameSharingShutdownStart()

public expect fun sceUtilityGameSharingGetStatus(): Int

public expect fun sceUtilityGameSharingUpdate(n: Int)

public expect fun sceUtilityHtmlViewerInitStart(params: COpaquePointer?): Int

public expect fun sceUtilityHtmlViewerShutdownStart(): Int

public expect fun sceUtilityHtmlViewerUpdate(n: Int): Int

public expect fun sceUtilityHtmlViewerGetStatus(): Int

public expect fun sceUtilitySetSystemParamInt(id: SystemParamId, value: Int): Int

public expect fun sceUtilitySetSystemParamString(id: SystemParamId, str: COpaquePointer?): Int

public expect fun sceUtilityGetSystemParamInt(id: SystemParamId, value: COpaquePointer?): Int

public expect fun sceUtilityGetSystemParamString(id: SystemParamId, str: COpaquePointer?, len: Int): Int

public expect fun sceUtilityOskInitStart(params: COpaquePointer?): Int

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

public expect fun sceUtilitySetNetParam(param: NetParam, value: COpaquePointer?): Int

public expect fun sceUtilityCopyNetParam(src: Int, dest: Int): Int

public expect fun sceUtilityDeleteNetParam(conf: Int): Int

public expect fun sceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int

public expect fun sceNetTerm(): Int

public expect fun sceNetFreeThreadinfo(thid: Int): Int

public expect fun sceNetThreadAbort(thid: Int): Int

public expect fun sceNetEtherStrton(name: COpaquePointer?, mac: COpaquePointer?)

public expect fun sceNetEtherNtostr(mac: COpaquePointer?, name: COpaquePointer?)

public expect fun sceNetGetLocalEtherAddr(mac: COpaquePointer?): Int

public expect fun sceNetGetMallocStat(stat: COpaquePointer?): Int

public expect fun sceNetAdhocctlInit(stacksize: Int, priority: Int, adhocId: COpaquePointer?): Int

public expect fun sceNetAdhocctlTerm(): Int

public expect fun sceNetAdhocctlConnect(name: COpaquePointer?): Int

public expect fun sceNetAdhocctlDisconnect(): Int

public expect fun sceNetAdhocctlGetState(event: COpaquePointer?): Int

public expect fun sceNetAdhocctlCreate(name: COpaquePointer?): Int

public expect fun sceNetAdhocctlJoin(scaninfo: COpaquePointer?): Int

public expect fun sceNetAdhocctlGetAdhocId(id: COpaquePointer?): Int

public expect fun sceNetAdhocctlCreateEnterGameMode(name: COpaquePointer?, unknown: Int, num: Int, macs: COpaquePointer?, timeout: UInt, unknown2: Int): Int

public expect fun sceNetAdhocctlJoinEnterGameMode(name: COpaquePointer?, hostmac: COpaquePointer?, timeout: UInt, unknown: Int): Int

public expect fun sceNetAdhocctlGetGameModeInfo(gamemodeinfo: COpaquePointer?): Int

public expect fun sceNetAdhocctlExitGameMode(): Int

public expect fun sceNetAdhocctlGetPeerList(length: COpaquePointer?, buf: COpaquePointer?): Int

public expect fun sceNetAdhocctlGetPeerInfo(mac: COpaquePointer?, size: Int, peerinfo: COpaquePointer?): Int

public expect fun sceNetAdhocctlScan(): Int

public expect fun sceNetAdhocctlGetScanInfo(length: COpaquePointer?, buf: COpaquePointer?): Int

public expect fun sceNetAdhocctlAddHandler(handler: SceNetAdhocctlHandler, unknown: COpaquePointer?): Int

public expect fun sceNetAdhocctlDelHandler(id: Int): Int

public expect fun sceNetAdhocctlGetNameByAddr(mac: COpaquePointer?, nickname: COpaquePointer?): Int

public expect fun sceNetAdhocctlGetAddrByName(nickname: COpaquePointer?, length: COpaquePointer?, buf: COpaquePointer?): Int

public expect fun sceNetAdhocctlGetParameter(params: COpaquePointer?): Int

public expect fun sceNetAdhocInit(): Int

public expect fun sceNetAdhocTerm(): Int

public expect fun sceNetAdhocPdpCreate(mac: COpaquePointer?, port: UShort, bufSize: UInt, unk1: Int): Int

public expect fun sceNetAdhocPdpDelete(id: Int, unk1: Int): Int

public expect fun sceNetAdhocPdpSend(id: Int, destMacAddr: COpaquePointer?, port: UShort, data: COpaquePointer?, len: UInt, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocPdpRecv(id: Int, srcMacAddr: COpaquePointer?, port: COpaquePointer?, data: COpaquePointer?, dataLength: COpaquePointer?, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocGetPdpStat(size: COpaquePointer?, stat: COpaquePointer?): Int

public expect fun sceNetAdhocGameModeCreateMaster(data: COpaquePointer?, size: Int): Int

public expect fun sceNetAdhocGameModeCreateReplica(mac: COpaquePointer?, data: COpaquePointer?, size: Int): Int

public expect fun sceNetAdhocGameModeUpdateMaster(): Int

public expect fun sceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int

public expect fun sceNetAdhocGameModeDeleteMaster(): Int

public expect fun sceNetAdhocGameModeDeleteReplica(id: Int): Int

public expect fun sceNetAdhocPtpOpen(srcmac: COpaquePointer?, srcport: UShort, destmac: COpaquePointer?, destport: UShort, bufSize: UInt, delay: UInt, count: Int, unk1: Int): Int

public expect fun sceNetAdhocPtpConnect(id: Int, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocPtpListen(srcmac: COpaquePointer?, srcport: UShort, bufSize: UInt, delay: UInt, count: Int, queue: Int, unk1: Int): Int

public expect fun sceNetAdhocPtpAccept(id: Int, mac: COpaquePointer?, port: COpaquePointer?, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocPtpSend(id: Int, data: COpaquePointer?, dataSize: COpaquePointer?, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocPtpRecv(id: Int, data: COpaquePointer?, dataSize: COpaquePointer?, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocPtpFlush(id: Int, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocPtpClose(id: Int, unk1: Int): Int

public expect fun sceNetAdhocGetPtpStat(size: COpaquePointer?, stat: COpaquePointer?): Int

public expect fun sceNetAdhocMatchingInit(memsize: Int): Int

public expect fun sceNetAdhocMatchingTerm(): Int

public expect fun sceNetAdhocMatchingCreate(mode: AdhocMatchingMode, maxPeers: Int, port: UShort, bufSize: Int, helloDelay: UInt, pingDelay: UInt, initCount: Int, msgDelay: UInt, callback: AdhocMatchingCallback): Int

public expect fun sceNetAdhocMatchingDelete(matchingId: Int): Int

public expect fun sceNetAdhocMatchingStart(matchingId: Int, evthPri: Int, evthStack: Int, inthPri: Int, inthStack: Int, optLen: Int, optData: COpaquePointer?): Int

public expect fun sceNetAdhocMatchingStop(matchingId: Int): Int

public expect fun sceNetAdhocMatchingSelectTarget(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int

public expect fun sceNetAdhocMatchingCancelTarget(matchingId: Int, mac: COpaquePointer?): Int

public expect fun sceNetAdhocMatchingCancelTargetWithOpt(matchingId: Int, mac: COpaquePointer?, optLen: Int, optData: COpaquePointer?): Int

public expect fun sceNetAdhocMatchingSendData(matchingId: Int, mac: COpaquePointer?, dataLen: Int, data: COpaquePointer?): Int

public expect fun sceNetAdhocMatchingAbortSendData(matchingId: Int, mac: COpaquePointer?): Int

public expect fun sceNetAdhocMatchingSetHelloOpt(matchingId: Int, optLen: Int, optData: COpaquePointer?): Int

public expect fun sceNetAdhocMatchingGetHelloOpt(matchingId: Int, optLen: COpaquePointer?, optData: COpaquePointer?): Int

public expect fun sceNetAdhocMatchingGetMembers(matchingId: Int, length: COpaquePointer?, buf: COpaquePointer?): Int

public expect fun sceNetAdhocMatchingGetPoolMaxAlloc(): Int

public expect fun sceNetAdhocMatchingGetPoolStat(poolstat: COpaquePointer?): Int

public expect fun sceNetApctlInit(stackSize: Int, initPriority: Int): Int

public expect fun sceNetApctlTerm(): Int

public expect fun sceNetApctlGetInfo(code: ApctlInfo, pinfo: COpaquePointer?): Int

public expect fun sceNetApctlAddHandler(handler: SceNetApctlHandler, parg: COpaquePointer?): Int

public expect fun sceNetApctlDelHandler(handlerId: Int): Int

public expect fun sceNetApctlConnect(connIndex: Int): Int

public expect fun sceNetApctlDisconnect(): Int

public expect fun sceNetApctlGetState(pstate: COpaquePointer?): Int

public expect fun sceNetInetInit(): Int

public expect fun sceNetInetTerm(): Int

public expect fun sceNetInetAccept(s: Int, addr: COpaquePointer?, addrLen: COpaquePointer?): Int

public expect fun sceNetInetBind(s: Int, myAddr: COpaquePointer?, addrLen: SocklenT): Int

public expect fun sceNetInetConnect(s: Int, servAddr: COpaquePointer?, addrLen: SocklenT): Int

public expect fun sceNetInetGetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optlEn: COpaquePointer?): Int

public expect fun sceNetInetListen(s: Int, backlog: Int): Int

public expect fun sceNetInetRecv(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong

public expect fun sceNetInetRecvfrom(s: Int, buf: COpaquePointer?, flags: ULong, arg1: Int, from: COpaquePointer?, fromLen: COpaquePointer?): ULong

public expect fun sceNetInetSend(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong

public expect fun sceNetInetSendto(s: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: COpaquePointer?, toLen: SocklenT): ULong

public expect fun sceNetInetSetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optLen: SocklenT): Int

public expect fun sceNetInetShutdown(s: Int, how: Int): Int

public expect fun sceNetInetSocket(domain: Int, type: Int, protocol: Int): Int

public expect fun sceNetInetClose(s: Int): Int

public expect fun sceNetInetGetErrno(): Int

public expect fun sceSslInit(unknown1: Int): Int

public expect fun sceSslEnd(): Int

public expect fun sceSslGetUsedMemoryMax(memory: COpaquePointer?): Int

public expect fun sceSslGetUsedMemoryCurrent(memory: COpaquePointer?): Int

public expect fun sceHttpInit(unknown1: UInt): Int

public expect fun sceHttpEnd(): Int

public expect fun sceHttpCreateTemplate(agent: COpaquePointer?, unknown1: Int, unknown2: Int): Int

public expect fun sceHttpDeleteTemplate(templateid: Int): Int

public expect fun sceHttpCreateConnection(templateid: Int, host: COpaquePointer?, unknown1: COpaquePointer?, port: UShort, unknown2: Int): Int

public expect fun sceHttpCreateConnectionWithURL(templateid: Int, url: COpaquePointer?, unknown1: Int): Int

public expect fun sceHttpDeleteConnection(connectionId: Int): Int

public expect fun sceHttpCreateRequest(connectionId: Int, method: HttpMethod, path: COpaquePointer?, contentLength: ULong): Int

public expect fun sceHttpCreateRequestWithURL(connectionId: Int, method: HttpMethod, url: COpaquePointer?, contentLength: ULong): Int

public expect fun sceHttpDeleteRequest(requestId: Int): Int

public expect fun sceHttpSendRequest(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int

public expect fun sceHttpAbortRequest(requestId: Int): Int

public expect fun sceHttpReadData(requestId: Int, data: COpaquePointer?, dataSize: UInt): Int

public expect fun sceHttpGetContentLength(requestId: Int, contentLength: COpaquePointer?): Int

public expect fun sceHttpGetStatusCode(requestId: Int, statusCode: COpaquePointer?): Int

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

public expect fun sceHttpAddExtraHeader(id: Int, name: COpaquePointer?, value: COpaquePointer?, unknown1: Int): Int

public expect fun sceHttpDeleteHeader(id: Int, name: COpaquePointer?): Int

public expect fun sceHttpsInit(unknown1: Int, unknown2: Int, unknown3: Int, unknown4: Int): Int

public expect fun sceHttpsEnd(): Int

public expect fun sceHttpsLoadDefaultCert(unknown1: Int, unknown2: Int): Int

public expect fun sceHttpDisableAuth(id: Int): Int

public expect fun sceHttpDisableCache(id: Int): Int

public expect fun sceHttpEnableAuth(id: Int): Int

public expect fun sceHttpEnableCache(id: Int): Int

public expect fun sceHttpEndCache(): Int

public expect fun sceHttpGetAllHeader(request: Int, header: COpaquePointer?, headerSize: COpaquePointer?): Int

public expect fun sceHttpGetNetworkErrno(request: Int, errNum: COpaquePointer?): Int

public expect fun sceHttpGetProxy(id: Int, activateFlag: COpaquePointer?, mode: COpaquePointer?, proxyHost: COpaquePointer?, len: ULong, proxyPort: COpaquePointer?): Int

public expect fun sceHttpInitCache(maxSize: ULong): Int

public expect fun sceHttpSetAuthInfoCB(id: Int, cbfunc: HttpPasswordCB): Int

public expect fun sceHttpSetProxy(id: Int, activateFlag: Int, mode: Int, newProxyHost: COpaquePointer?, newProxyPort: UShort): Int

public expect fun sceHttpSetResHeaderMaxSize(id: Int, headerSize: UInt): Int

public expect fun sceHttpSetMallocFunction(mallocFunc: HttpMallocFunction, freeFunc: HttpFreeFunction, reallocFunc: HttpReallocFunction): Int

public expect fun sceNetResolverInit(): Int

public expect fun sceNetResolverCreate(rid: COpaquePointer?, buf: COpaquePointer?, bufLength: UInt): Int

public expect fun sceNetResolverDelete(rid: Int): Int

public expect fun sceNetResolverStartNtoA(rid: Int, hostname: COpaquePointer?, addr: COpaquePointer?, timeout: UInt, retry: Int): Int

public expect fun sceNetResolverStartAtoN(rid: Int, addr: COpaquePointer?, hostname: COpaquePointer?, hostnameLen: UInt, timeout: UInt, retry: Int): Int

public expect fun sceNetResolverStop(rid: Int): Int

public expect fun sceNetResolverTerm(): Int
