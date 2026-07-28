// port-lint: source psp.rs
package io.github.kotlinmania.libc.psp

import io.github.kotlinmania.libc.*

public typealias IntmaxT = Long
public typealias UintmaxT = ULong
public typealias SizeT = ULong
public typealias PtrdiffT = Long
public typealias IntptrT = Long
public typealias UintptrT = ULong
public typealias SsizeT = Long
public typealias SceKernelVTimerHandler = ((SceUid, SceKernelSysClock?, SceKernelSysClock?, COpaquePointer?) -> UInt)?
public typealias SceKernelVTimerHandlerWide = ((SceUid, Long, Long, COpaquePointer?) -> UInt)?
public typealias SceKernelThreadEventHandler = ((Int, SceUid, COpaquePointer?) -> Int)?
public typealias SceKernelAlarmHandler = ((COpaquePointer?) -> UInt)?
public typealias SceKernelCallbackFunction = ((Int, Int, COpaquePointer?) -> Int)?
public typealias SceKernelThreadEntry = ((ULong, COpaquePointer?) -> Int)?
public typealias PowerCallback = ((Int, Int) -> Unit)?
public typealias IoPermissions = Int
public typealias UmdCallback = ((Int, Int) -> Int)?
public typealias SceMpegRingbufferCb = ((COpaquePointer?, Int, COpaquePointer?) -> Int)?
public typealias GuCallback = ((Int, COpaquePointer?) -> Unit)?
public typealias GuSwapBuffersCallback = ((COpaquePointer?, COpaquePointer?) -> Unit)?
public typealias SceNetAdhocctlHandler = ((Int, Int, COpaquePointer?) -> Unit)?
public typealias AdhocMatchingCallback = (() -> Unit)?
public typealias SceNetApctlHandler = (() -> Unit)?
public typealias HttpMallocFunction = ((ULong) -> COpaquePointer?)?
public typealias HttpReallocFunction = ((COpaquePointer?, ULong) -> COpaquePointer?)?
public typealias HttpFreeFunction = ((COpaquePointer?) -> Unit)?
public typealias HttpPasswordCB = ((Int, HttpAuthType, COpaquePointer?, COpaquePointer?, COpaquePointer?, Int, COpaquePointer?, ULong?, Int?) -> Int)?
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
    Khz44_1(44100),
    Khz32(32000),
    Khz24(24000),
    Khz22_05(22050),
    Khz16(16000),
    Khz12(12000),
    Khz11_025(11025),
    Khz8(8000),
}

public enum class AudioInputFrequency(
    public val value: Int,
) {
    Khz44_1(44100),
    Khz22_05(22050),
    Khz11_025(11025),
}

public enum class CtrlMode(
    public val value: UInt,
) {
    Digital(0u),
    Analog(1u),
}

public enum class GeMatrixType(
    public val value: Int,
) {
    Bone0(0),
    Bone1(1),
    Bone2(2),
    Bone3(3),
    Bone4(4),
    Bone5(5),
    Bone6(6),
    Bone7(7),
    World(8),
    View(9),
    Projection(10),
    TexGen(11),
}

public enum class GeListState(
    public val value: Int,
) {
    Done(0),
    Queued(1),
    DrawingDone(2),
    StallReached(3),
    CancelDone(4),
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
    Light0Y(100u),
    Light0Z(101u),
    Light1X(102u),
    Light1Y(103u),
    Light1Z(104u),
    Light2X(105u),
    Light2Y(106u),
    Light2Z(107u),
    Light3X(108u),
    Light3Y(109u),
    Light3Z(110u),
    Light0DirectionX(0x6fu),
    Light0DirectionY(112u),
    Light0DirectionZ(113u),
    Light1DirectionX(114u),
    Light1DirectionY(115u),
    Light1DirectionZ(116u),
    Light2DirectionX(117u),
    Light2DirectionY(118u),
    Light2DirectionZ(119u),
    Light3DirectionX(120u),
    Light3DirectionY(121u),
    Light3DirectionZ(122u),
    Light0ConstantAtten(0x7bu),
    Light0LinearAtten(124u),
    Light0QuadtraticAtten(125u),
    Light1ConstantAtten(126u),
    Light1LinearAtten(127u),
    Light1QuadtraticAtten(128u),
    Light2ConstantAtten(129u),
    Light2LinearAtten(130u),
    Light2QuadtraticAtten(131u),
    Light3ConstantAtten(132u),
    Light3LinearAtten(133u),
    Light3QuadtraticAtten(134u),
    Light0ExponentAtten(0x87u),
    Light1ExponentAtten(136u),
    Light2ExponentAtten(137u),
    Light3ExponentAtten(138u),
    Light0CutoffAtten(0x8bu),
    Light1CutoffAtten(140u),
    Light2CutoffAtten(141u),
    Light3CutoffAtten(142u),
    Light0Ambient(0x8fu),
    Light0Diffuse(144u),
    Light0Specular(145u),
    Light1Ambient(146u),
    Light1Diffuse(147u),
    Light1Specular(148u),
    Light2Ambient(149u),
    Light2Diffuse(150u),
    Light2Specular(151u),
    Light3Ambient(152u),
    Light3Diffuse(153u),
    Light3Specular(154u),
    Cull(0x9bu),
    FrameBufPtr(0x9cu),
    FrameBufWidth(0x9du),
    ZBufPtr(0x9eu),
    ZBufWidth(0x9fu),
    TexAddr0(0xa0u),
    TexAddr1(161u),
    TexAddr2(162u),
    TexAddr3(163u),
    TexAddr4(164u),
    TexAddr5(165u),
    TexAddr6(166u),
    TexAddr7(167u),
    TexBufWidth0(0xa8u),
    TexBufWidth1(169u),
    TexBufWidth2(170u),
    TexBufWidth3(171u),
    TexBufWidth4(172u),
    TexBufWidth5(173u),
    TexBufWidth6(174u),
    TexBufWidth7(175u),
    ClutAddr(0xb0u),
    ClutAddrUpper(0xb1u),
    TransferSrc(178u),
    TransferSrcW(179u),
    TransferDst(180u),
    TransferDstW(181u),
    TexSize0(0xb8u),
    TexSize1(185u),
    TexSize2(186u),
    TexSize3(187u),
    TexSize4(188u),
    TexSize5(189u),
    TexSize6(190u),
    TexSize7(191u),
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
    Dith1(227u),
    Dith2(228u),
    Dith3(229u),
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
    High(1),
    Addr(2),
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
    Interrupt(66u),
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
    Px160_120(0),
    Px176_144(1),
    Px320_240(2),
    Px352_288(3),
    Px640_480(4),
    Px1024_768(5),
    Px1280_960(6),
    Px480_272(7),
    Px360_272(8),
}

public enum class UsbCamResolutionEx(
    public val value: Int,
) {
    Px160_120(0),
    Px176_144(1),
    Px320_240(2),
    Px352_288(3),
    Px360_272(4),
    Px480_272(5),
    Px640_480(6),
    Px1024_768(7),
    Px1280_960(8),
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
    Fps3_75(0),
    Fps5(1),
    Fps7_5(2),
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
    Pos2_0(0),
    Pos1_7(1),
    Pos1_5(2),
    Pos1_3(3),
    Pos1_0(4),
    Pos0_7(5),
    Pos0_5(6),
    Pos0_3(7),
    Zero(8),
    Neg0_3(9),
    Neg0_5(10),
    Neg0_7(11),
    Neg1_0(12),
    Neg1_3(13),
    Neg1_5(14),
    Neg1_7(15),
    Neg2_0(16),
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
    Always(1u),
    Equal(2u),
    NotEqual(3u),
    Less(4u),
    LessOrEqual(5u),
    Greater(6u),
    GreaterOrEqual(7u),
}

public enum class StencilFunc(
    public val value: UInt,
) {
    Never(0u),
    Always(1u),
    Equal(2u),
    NotEqual(3u),
    Less(4u),
    LessOrEqual(5u),
    Greater(6u),
    GreaterOrEqual(7u),
}

public enum class ColorFunc(
    public val value: UInt,
) {
    Never(0u),
    Always(1u),
    Equal(2u),
    NotEqual(3u),
}

public enum class DepthFunc(
    public val value: UInt,
) {
    Never(0u),
    Always(1u),
    Equal(2u),
    NotEqual(3u),
    Less(4u),
    LessOrEqual(5u),
    Greater(6u),
    GreaterOrEqual(7u),
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
    Level1(1u),
    Level2(2u),
    Level3(3u),
    Level4(4u),
    Level5(5u),
    Level6(6u),
    Level7(7u),
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
    public val value: Int,
) {
    Directory(1),
    Integer(2),
    String(3),
    Bytes(4),
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
    AdhocChannel(2u),
    WlanPowerSave(3u),
    DateFormat(4u),
    TimeFormat(5u),
    Timezone(6u),
    DaylightSavings(7u),
    Language(8u),
    Unknown(9u),
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
    NetAdhoc(257u),
    NetInet(258u),
    NetParseUri(259u),
    NetHttp(260u),
    NetSsl(261u),
    UsbPspCm(0x200u),
    UsbMic(513u),
    UsbCam(514u),
    UsbGps(515u),
    AvCodec(0x300u),
    AvSascore(769u),
    AvAtrac3Plus(770u),
    AvMpegBase(771u),
    AvMp3(772u),
    AvVaudio(773u),
    AvAac(774u),
    AvG729(775u),
    NpCommon(0x400u),
    NpService(1025u),
    NpMatching2(1026u),
    NpDrm(0x500u),
    Irda(0x600u),
}

public enum class NetModule(
    public val value: UInt,
) {
    NetCommon(1u),
    NetAdhoc(2u),
    NetInet(3u),
    NetParseUri(4u),
    NetHttp(5u),
    NetSsl(6u),
}

public enum class UsbModule(
    public val value: UInt,
) {
    UsbPspCm(1u),
    UsbAcc(2u),
    UsbMic(3u),
    UsbCam(4u),
    UsbGps(5u),
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
    Multiple(2u),
}

public enum class UtilityGameSharingDataType(
    public val value: UInt,
) {
    File(1u),
    Memory(2u),
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
    Enabled(1u),
    Confirm(2u),
    Default(3u),
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
    Client(2u),
    Ptp(3u),
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

public data class Sockaddr(
    val saLen: UByte,
    val saFamily: UByte,
    val saData: UByteArray,
)

public data class InAddr(
    val sAddr: UInt,
)

public data class AudioInputParams(
    val unknown1: Int,
    val gain: Int,
    val unknown2: Int,
    val unknown3: Int,
    val unknown4: Int,
    val unknown5: Int,
)

public data class Atrac3BufferInfo(
    val pucWritePositionFirstBuf: COpaquePointer?,
    val uiWritableByteFirstBuf: UInt,
    val uiMinWriteByteFirstBuf: UInt,
    val uiReadPositionFirstBuf: UInt,
    val pucWritePositionSecondBuf: COpaquePointer?,
    val uiWritableByteSecondBuf: UInt,
    val uiMinWriteByteSecondBuf: UInt,
    val uiReadPositionSecondBuf: UInt,
)

public data class SceCtrlData(
    val timestamp: UInt,
    val buttons: Int,
    val lx: UByte,
    val ly: UByte,
    val rsrv: UByteArray,
)

public data class SceCtrlLatch(
    val uiMake: UInt,
    val uiBreak: UInt,
    val uiPress: UInt,
    val uiRelease: UInt,
)

public data class GeStack(
    val stack: UIntArray,
)

public data class GeCallbackData(
    val signalFunc: ((Int, COpaquePointer?) -> Unit)?,
    val signalArg: COpaquePointer?,
    val finishFunc: ((Int, COpaquePointer?) -> Unit)?,
    val finishArg: COpaquePointer?,
)

public data class GeListArgs(
    val size: UInt,
    val context: GeContext?,
    val numStacks: UInt,
    val stacks: GeStack?,
)

public data class GeBreakParam(
    val buf: UIntArray,
)

public data class SceKernelLoadExecParam(
    val size: ULong,
    val args: ULong,
    val argp: COpaquePointer?,
    val key: COpaquePointer?,
)

public data class Timeval(
    val tvSec: Int,
    val tvUsec: Int,
)

public data class Timezone(
    val tzMinutesWest: Int,
    val tzDstTime: Int,
)

public data class IntrHandlerOptionParam(
    val size: Int,
    val entry: UInt,
    val common: UInt,
    val gp: UInt,
    val intrCode: UShort,
    val subCount: UShort,
    val intrLevel: UShort,
    val enabled: UShort,
    val calls: UInt,
    val field1c: UInt,
    val totalClockLo: UInt,
    val totalClockHi: UInt,
    val minClockLo: UInt,
    val minClockHi: UInt,
    val maxClockLo: UInt,
    val maxClockHi: UInt,
)

public data class SceKernelLMOption(
    val size: ULong,
    val mPidText: SceUid,
    val mPidData: SceUid,
    val flags: UInt,
    val position: UByte,
    val access: UByte,
    val cReserved: UByteArray,
)

public data class SceKernelSMOption(
    val size: ULong,
    val mPidStack: SceUid,
    val stackSize: ULong,
    val priority: Int,
    val attribute: UInt,
)

public data class SceKernelModuleInfo(
    val size: ULong,
    val nSegment: UByte,
    val reserved: UByteArray,
    val segmentAddr: IntArray,
    val segmentSize: IntArray,
    val entryAddr: UInt,
    val gpValue: UInt,
    val textAddr: UInt,
    val textSize: UInt,
    val dataSize: UInt,
    val bssSize: UInt,
    val attribute: UShort,
    val version: UByteArray,
    val name: UByteArray,
)

public data class DebugProfilerRegs(
    val enable: UInt,
    val systemck: UInt,
    val cpuck: UInt,
    val internal: UInt,
    val memory: UInt,
    val copz: UInt,
    val vfpu: UInt,
    val sleep: UInt,
    val busAccess: UInt,
    val uncachedLoad: UInt,
    val uncachedStore: UInt,
    val cachedLoad: UInt,
    val cachedStore: UInt,
    val iMiss: UInt,
    val dMiss: UInt,
    val dWriteback: UInt,
    val cop0Inst: UInt,
    val fpuInst: UInt,
    val vfpuInst: UInt,
    val localBus: UInt,
)

public data class SceKernelSysClock(
    val low: UInt,
    val hi: UInt,
)

public data class SceKernelThreadOptParam(
    val size: ULong,
    val stackMpid: SceUid,
)

public data class SceKernelThreadInfo(
    val size: ULong,
    val name: UByteArray,
    val attr: UInt,
    val status: Int,
    val entry: SceKernelThreadEntry,
    val stack: COpaquePointer?,
    val stackSize: Int,
    val gpReg: COpaquePointer?,
    val initPriority: Int,
    val currentPriority: Int,
    val waitType: Int,
    val waitId: SceUid,
    val wakeupCount: Int,
    val exitStatus: Int,
    val runClocks: SceKernelSysClock,
    val intrPreemptCount: UInt,
    val threadPreemptCount: UInt,
    val releaseCount: UInt,
)

public data class SceKernelThreadRunStatus(
    val size: ULong,
    val status: Int,
    val currentPriority: Int,
    val waitType: Int,
    val waitId: Int,
    val wakeupCount: Int,
    val runClocks: SceKernelSysClock,
    val intrPreemptCount: UInt,
    val threadPreemptCount: UInt,
    val releaseCount: UInt,
)

public data class SceKernelSemaOptParam(
    val size: ULong,
)

public data class SceKernelSemaInfo(
    val size: ULong,
    val name: UByteArray,
    val attr: UInt,
    val initCount: Int,
    val currentCount: Int,
    val maxCount: Int,
    val numWaitThreads: Int,
)

public data class SceKernelEventFlagInfo(
    val size: ULong,
    val name: UByteArray,
    val attr: UInt,
    val initPattern: UInt,
    val currentPattern: UInt,
    val numWaitThreads: Int,
)

public data class SceKernelEventFlagOptParam(
    val size: ULong,
)

public data class SceKernelMbxOptParam(
    val size: ULong,
)

public data class SceKernelMbxInfo(
    val size: ULong,
    val name: UByteArray,
    val attr: UInt,
    val numWaitThreads: Int,
    val numMessages: Int,
    val firstMessage: COpaquePointer?,
)

public data class SceKernelVTimerInfo(
    val size: ULong,
    val name: UByteArray,
    val active: Int,
    val base: SceKernelSysClock,
    val current: SceKernelSysClock,
    val schedule: SceKernelSysClock,
    val handler: SceKernelVTimerHandler,
    val common: COpaquePointer?,
)

public data class SceKernelThreadEventHandlerInfo(
    val size: ULong,
    val name: UByteArray,
    val threadId: SceUid,
    val mask: Int,
    val handler: SceKernelThreadEventHandler,
    val common: COpaquePointer?,
)

public data class SceKernelAlarmInfo(
    val size: ULong,
    val schedule: SceKernelSysClock,
    val handler: SceKernelAlarmHandler,
    val common: COpaquePointer?,
)

public data class SceKernelSystemStatus(
    val size: ULong,
    val status: UInt,
    val idleClocks: SceKernelSysClock,
    val comesOutOfIdleCount: UInt,
    val threadSwitchCount: UInt,
    val vfpuSwitchCount: UInt,
)

public data class SceKernelMppInfo(
    val size: ULong,
    val name: UByteArray,
    val attr: UInt,
    val bufSize: Int,
    val freeSize: Int,
    val numSendWaitThreads: Int,
    val numReceiveWaitThreads: Int,
)

public data class SceKernelVplOptParam(
    val size: ULong,
)

public data class SceKernelVplInfo(
    val size: ULong,
    val name: UByteArray,
    val attr: UInt,
    val poolSize: Int,
    val freeSize: Int,
    val numWaitThreads: Int,
)

public data class SceKernelFplOptParam(
    val size: ULong,
)

public data class SceKernelFplInfo(
    val size: ULong,
    val name: UByteArray,
    val attr: UInt,
    val blockSize: Int,
    val numBlocks: Int,
    val freeBlocks: Int,
    val numWaitThreads: Int,
)

public data class SceKernelVTimerOptParam(
    val size: ULong,
)

public data class SceKernelCallbackInfo(
    val size: ULong,
    val name: UByteArray,
    val threadId: SceUid,
    val callback: SceKernelCallbackFunction,
    val common: COpaquePointer?,
    val notifyCount: Int,
    val notifyArg: Int,
)

public data class UsbCamSetupStillParam(
    val size: Int,
    val resolution: UsbCamResolution,
    val jpegSize: Int,
    val reverseFlags: Int,
    val delay: UsbCamDelay,
    val compLevel: Int,
)

public data class UsbCamSetupStillExParam(
    val size: Int,
    val unk: UInt,
    val resolution: UsbCamResolutionEx,
    val jpegSize: Int,
    val compLevel: Int,
    val unk2: UInt,
    val unk3: UInt,
    val flip: Int,
    val mirror: Int,
    val delay: UsbCamDelay,
    val unk4: UIntArray,
)

public data class UsbCamSetupVideoParam(
    val size: Int,
    val resolution: UsbCamResolution,
    val framerate: UsbCamFrameRate,
    val whiteBalance: UsbCamWb,
    val saturation: Int,
    val brightness: Int,
    val contrast: Int,
    val sharpness: Int,
    val effectMode: UsbCamEffectMode,
    val frameSize: Int,
    val unk: UInt,
    val evlEvel: UsbCamEvLevel,
)

public data class UsbCamSetupVideoExParam(
    val size: Int,
    val unk: UInt,
    val resolution: UsbCamResolutionEx,
    val framerate: UsbCamFrameRate,
    val unk2: UInt,
    val unk3: UInt,
    val whiteBalance: UsbCamWb,
    val saturation: Int,
    val brightness: Int,
    val contrast: Int,
    val sharpness: Int,
    val unk4: UInt,
    val unk5: UInt,
    val unk6: UIntArray,
    val effectMode: UsbCamEffectMode,
    val unk7: UInt,
    val unk8: UInt,
    val unk9: UInt,
    val unk10: UInt,
    val unk11: UInt,
    val frameSize: Int,
    val unk12: UInt,
    val evLevel: UsbCamEvLevel,
)

public data class ScePspDateTime(
    val year: UShort,
    val month: UShort,
    val day: UShort,
    val hour: UShort,
    val minutes: UShort,
    val seconds: UShort,
    val microseconds: UInt,
)

public data class SceIoStat(
    val stMode: Int,
    val stAttr: Int,
    val stSize: Long,
    val stCtime: ScePspDateTime,
    val stAtime: ScePspDateTime,
    val stMtime: ScePspDateTime,
    val stPrivate: UIntArray,
)

public data class UmdInfo(
    val size: UInt,
    val type: UmdType,
)

public data class SceMpegRingbuffer(
    val packets: Int,
    val unk0: UInt,
    val unk1: UInt,
    val unk2: UInt,
    val unk3: UInt,
    val data: COpaquePointer?,
    val callback: SceMpegRingbufferCb,
    val cbParam: COpaquePointer?,
    val unk4: UInt,
    val unk5: UInt,
    val sceMpeg: COpaquePointer?,
)

public data class SceMpegAu(
    val ptsMsb: UInt,
    val pts: UInt,
    val dtsMsb: UInt,
    val dts: UInt,
    val esBuffer: UInt,
    val auSize: UInt,
)

public data class SceMpegAvcMode(
    val unk0: Int,
    val pixelFormat: DisplayPixelFormat,
)

public data class SceMpegLLI(
    val src: COpaquePointer?,
    val dst: COpaquePointer?,
    val next: COpaquePointer?,
    val size: Int,
)

public data class SceMpegYCrCbBuffer(
    val frameBufferHeight16: Int,
    val frameBufferWidth16: Int,
    val unknown: Int,
    val unknown2: Int,
    val yBuffer: COpaquePointer?,
    val yBuffer2: COpaquePointer?,
    val crBuffer: COpaquePointer?,
    val cbBuffer: COpaquePointer?,
    val crBuffer2: COpaquePointer?,
    val cbBuffer2: COpaquePointer?,
    val frameHeight: Int,
    val frameWidth: Int,
    val frameBufferWidth: Int,
    val unknown3: IntArray,
)

public data class ScePspSRect(
    val x: Short,
    val y: Short,
    val w: Short,
    val h: Short,
)

public data class ScePspIRect(
    val x: Int,
    val y: Int,
    val w: Int,
    val h: Int,
)

public data class ScePspL64Rect(
    val x: ULong,
    val y: ULong,
    val w: ULong,
    val h: ULong,
)

public data class ScePspSVector2(
    val x: Short,
    val y: Short,
)

public data class ScePspIVector2(
    val x: Int,
    val y: Int,
)

public data class ScePspL64Vector2(
    val x: ULong,
    val y: ULong,
)

public data class ScePspSVector3(
    val x: Short,
    val y: Short,
    val z: Short,
)

public data class ScePspIVector3(
    val x: Int,
    val y: Int,
    val z: Int,
)

public data class ScePspL64Vector3(
    val x: ULong,
    val y: ULong,
    val z: ULong,
)

public data class ScePspSVector4(
    val x: Short,
    val y: Short,
    val z: Short,
    val w: Short,
)

public data class ScePspIVector4(
    val x: Int,
    val y: Int,
    val z: Int,
    val w: Int,
)

public data class ScePspL64Vector4(
    val x: ULong,
    val y: ULong,
    val z: ULong,
    val w: ULong,
)

public data class ScePspIMatrix2(
    val x: ScePspIVector2,
    val y: ScePspIVector2,
)

public data class ScePspIMatrix3(
    val x: ScePspIVector3,
    val y: ScePspIVector3,
    val z: ScePspIVector3,
)

public data class ScePspIMatrix4(
    val x: ScePspIVector4,
    val y: ScePspIVector4,
    val z: ScePspIVector4,
    val w: ScePspIVector4,
)

public data class ScePspIMatrix4Unaligned(
    val x: ScePspIVector4,
    val y: ScePspIVector4,
    val z: ScePspIVector4,
    val w: ScePspIVector4,
)

public data class SceMp3InitArg(
    val mp3StreamStart: UInt,
    val unk1: UInt,
    val mp3StreamEnd: UInt,
    val unk2: UInt,
    val mp3Buf: COpaquePointer?,
    val mp3BufSize: Int,
    val pcmBuf: COpaquePointer?,
    val pcmBufSize: Int,
)

public data class OpenPSID(
    val data: UByteArray,
)

public data class UtilityDialogCommon(
    val size: UInt,
    val language: SystemParamLanguage,
    val buttonAccept: UtilityDialogButtonAccept,
    val graphicsThread: Int,
    val accessThread: Int,
    val fontThread: Int,
    val soundThread: Int,
    val result: Int,
    val reserved: IntArray,
)

public data class UtilityNetconfAdhoc(
    val name: UByteArray,
    val timeout: UInt,
)

public data class UtilityNetconfData(
    val base: UtilityDialogCommon,
    val action: UtilityNetconfAction,
    val adhocparam: UtilityNetconfAdhoc?,
    val hotspot: Int,
    val hotspotConnected: Int,
    val wifisp: Int,
)

public data class UtilitySavedataFileData(
    val buf: COpaquePointer?,
    val bufSize: ULong,
    val size: ULong,
    val unknown: Int,
)

public data class UtilitySavedataListSaveNewData(
    val icon0: UtilitySavedataFileData,
    val title: COpaquePointer?,
)

public data class UtilityGameSharingParams(
    val base: UtilityDialogCommon,
    val unknown1: Int,
    val unknown2: Int,
    val name: UByteArray,
    val unknown3: Int,
    val unknown4: Int,
    val unknown5: Int,
    val result: Int,
    val filepath: COpaquePointer?,
    val mode: UtilityGameSharingMode,
    val datatype: UtilityGameSharingDataType,
    val data: COpaquePointer?,
    val datasize: UInt,
)

public data class UtilityHtmlViewerParam(
    val base: UtilityDialogCommon,
    val memaddr: COpaquePointer?,
    val memsize: UInt,
    val unknown1: Int,
    val unknown2: Int,
    val initialurl: COpaquePointer?,
    val numtabs: UInt,
    val interfacemode: UtilityHtmlViewerInterfaceMode,
    val options: Int,
    val dldirname: COpaquePointer?,
    val dlfilename: COpaquePointer?,
    val uldirname: COpaquePointer?,
    val ulfilename: COpaquePointer?,
    val cookiemode: UtilityHtmlViewerCookieMode,
    val unknown3: UInt,
    val homeurl: COpaquePointer?,
    val textsize: UtilityHtmlViewerTextSize,
    val displaymode: UtilityHtmlViewerDisplayMode,
    val connectmode: UtilityHtmlViewerConnectMode,
    val disconnectmode: UtilityHtmlViewerDisconnectMode,
    val memused: UInt,
    val unknown4: IntArray,
)

public data class SceUtilityOskData(
    val unk00: Int,
    val unk04: Int,
    val language: SceUtilityOskInputLanguage,
    val unk12: Int,
    val inputtype: SceUtilityOskInputType,
    val lines: Int,
    val unk24: Int,
    val desc: UShort?,
    val intext: UShort?,
    val outtextlength: Int,
    val outtext: UShort?,
    val result: SceUtilityOskResult,
    val outtextlimit: Int,
)

public data class SceUtilityOskParams(
    val base: UtilityDialogCommon,
    val datacount: Int,
    val data: SceUtilityOskData?,
    val state: SceUtilityOskState,
    val unk60: Int,
)

public data class SceNetMallocStat(
    val pool: Int,
    val maximum: Int,
    val free: Int,
)

public data class SceNetAdhocctlAdhocId(
    val unknown: Int,
    val adhocId: UByteArray,
    val unk: UByteArray,
)

public data class SceNetAdhocctlScanInfo(
    val next: SceNetAdhocctlScanInfo?,
    val channel: Int,
    val name: UByteArray,
    val bssid: UByteArray,
    val unknown: UByteArray,
    val unknown2: Int,
)

public data class SceNetAdhocctlGameModeInfo(
    val count: Int,
    val macs: List<UByteArray>,
)

public data class SceNetAdhocPtpStat(
    val next: SceNetAdhocPtpStat?,
    val ptpId: Int,
    val mac: UByteArray,
    val peermac: UByteArray,
    val port: UShort,
    val peerport: UShort,
    val sentData: UInt,
    val rcvdData: UInt,
    val state: ScePspnetAdhocPtpState,
)

public data class SceNetAdhocPdpStat(
    val next: SceNetAdhocPdpStat?,
    val pdpId: Int,
    val mac: UByteArray,
    val port: UShort,
    val rcvdData: UInt,
)

public data class AdhocPoolStat(
    val size: Int,
    val maxsize: Int,
    val freesize: Int,
)

public data class GeContext(
    val context: UIntArray,
)

public data class SceKernelUtilsSha1Context(
    val h: UIntArray,
    val usRemains: UShort,
    val usComputed: UShort,
    val ullTotalLen: ULong,
    val buf: UByteArray,
)

public data class SceKernelUtilsMt19937Context(
    val count: UInt,
    val state: UIntArray,
)

public data class SceKernelUtilsMd5Context(
    val h: UIntArray,
    val pad: UInt,
    val usRemains: UShort,
    val usComputed: UShort,
    val ullTotalLen: ULong,
    val buf: UByteArray,
)

public data class SceIoDirent(
    val dStat: SceIoStat,
    val dName: UByteArray,
    val dPrivate: COpaquePointer?,
    val dummy: Int,
)

public data class ScePspFRect(
    val x: Float,
    val y: Float,
    val w: Float,
    val h: Float,
)

public data class ScePspFVector3(
    val x: Float,
    val y: Float,
    val z: Float,
)

public data class ScePspFVector4(
    val x: Float,
    val y: Float,
    val z: Float,
    val w: Float,
)

public data class ScePspFVector4Unaligned(
    val x: Float,
    val y: Float,
    val z: Float,
    val w: Float,
)

public data class ScePspFVector2(
    val x: Float,
    val y: Float,
)

public data class ScePspFMatrix2(
    val x: ScePspFVector2,
    val y: ScePspFVector2,
)

public data class ScePspFMatrix3(
    val x: ScePspFVector3,
    val y: ScePspFVector3,
    val z: ScePspFVector3,
)

public data class ScePspFMatrix4(
    val x: ScePspFVector4,
    val y: ScePspFVector4,
    val z: ScePspFVector4,
    val w: ScePspFVector4,
)

public data class ScePspFMatrix4Unaligned(
    val x: ScePspFVector4,
    val y: ScePspFVector4,
    val z: ScePspFVector4,
    val w: ScePspFVector4,
)

public data class Key(
    val keyType: KeyType,
    val name: UByteArray,
    val nameLen: UInt,
    val unk2: UInt,
    val unk3: UInt,
)

public data class UtilityMsgDialogParams(
    val base: UtilityDialogCommon,
    val unknown: Int,
    val mode: UtilityMsgDialogMode,
    val errorValue: UInt,
    val message: UByteArray,
    val options: Int,
    val buttonPressed: UtilityMsgDialogPressed,
)

public data class UtilitySavedataSFOParam(
    val title: UByteArray,
    val savedataTitle: UByteArray,
    val detail: UByteArray,
    val parentalLevel: UByte,
    val unknown: UByteArray,
)

public data class SceUtilitySavedataParam(
    val base: UtilityDialogCommon,
    val mode: UtilitySavedataMode,
    val unknown1: Int,
    val overwrite: Int,
    val gameName: UByteArray,
    val reserved: UByteArray,
    val saveName: UByteArray,
    val saveNameList: UByteArray?,
    val fileName: UByteArray,
    val reserved1: UByteArray,
    val dataBuf: COpaquePointer?,
    val dataBufSize: ULong,
    val dataSize: ULong,
    val sfoParam: UtilitySavedataSFOParam,
    val icon0FileData: UtilitySavedataFileData,
    val icon1FileData: UtilitySavedataFileData,
    val pic1FileData: UtilitySavedataFileData,
    val snd0FileData: UtilitySavedataFileData,
    val newData: UtilitySavedataListSaveNewData?,
    val focus: UtilitySavedataFocus,
    val unknown2: IntArray,
    val key: UByteArray,
    val unknown3: UByteArray,
)

public data class SceNetAdhocctlPeerInfo(
    val next: SceNetAdhocctlPeerInfo?,
    val nickname: UByteArray,
    val mac: UByteArray,
    val unknown: UByteArray,
    val timestamp: UInt,
)

public data class SceNetAdhocctlParams(
    val channel: Int,
    val name: UByteArray,
    val bssid: UByteArray,
    val nickname: UByteArray,
)

public data class SceUid(
    val value: Int,
)

public data class SceMpeg(
    val value: COpaquePointer?,
)

public data class SceMpegStream(
    val value: COpaquePointer?,
)

public data class Mp3Handle(
    val value: Int,
)

public data class RegHandle(
    val value: UInt,
)

// C union; only one variant is valid at a time.
public data class ScePspVector3(
    val fv: ScePspFVector3? = null,
    val iv: ScePspIVector3? = null,
    val f: List<Float>? = null,
    val i: IntArray? = null,
)

// C union; only one variant is valid at a time.
public data class ScePspVector4(
    val fv: ScePspFVector4? = null,
    val iv: ScePspIVector4? = null,
    val qw: ByteArray? = null,
    val f: List<Float>? = null,
    val i: IntArray? = null,
)

// C union; only one variant is valid at a time.
public data class ScePspMatrix2(
    val fm: ScePspFMatrix2? = null,
    val im: ScePspIMatrix2? = null,
    val fv: List<ScePspFVector2>? = null,
    val iv: List<ScePspIVector2>? = null,
    val v: List<ScePspVector2>? = null,
    val f: List<FloatArray>? = null,
    val i: List<IntArray>? = null,
)

// C union; only one variant is valid at a time.
public data class ScePspMatrix3(
    val fm: ScePspFMatrix3? = null,
    val im: ScePspIMatrix3? = null,
    val fv: List<ScePspFVector3>? = null,
    val iv: List<ScePspIVector3>? = null,
    val v: List<ScePspVector3>? = null,
    val f: List<FloatArray>? = null,
    val i: List<IntArray>? = null,
)

// C union; only one variant is valid at a time.
public data class ScePspVector2(
    val fv: ScePspFVector2? = null,
    val iv: ScePspIVector2? = null,
    val f: List<Float>? = null,
    val i: IntArray? = null,
)

// C union; only one variant is valid at a time.
public data class ScePspMatrix4(
    val fm: ScePspFMatrix4? = null,
    val im: ScePspIMatrix4? = null,
    val fv: List<ScePspFVector4>? = null,
    val iv: List<ScePspIVector4>? = null,
    val v: List<ScePspVector4>? = null,
    val f: List<FloatArray>? = null,
    val i: List<IntArray>? = null,
)

// C union; only one variant is valid at a time.
public data class UtilityNetData(
    val asUint: UInt? = null,
    val asString: UByteArray? = null,
)

// C union; only one variant is valid at a time.
public data class SceNetApctlInfo(
    val name: UByteArray? = null,
    val bssid: UByteArray? = null,
    val ssid: UByteArray? = null,
    val ssidLength: UInt? = null,
    val securityType: UInt? = null,
    val strength: UByte? = null,
    val channel: UByte? = null,
    val powerSave: UByte? = null,
    val ip: UByteArray? = null,
    val subNetMask: UByteArray? = null,
    val gateway: UByteArray? = null,
    val primaryDns: UByteArray? = null,
    val secondaryDns: UByteArray? = null,
    val useProxy: UInt? = null,
    val proxyUrl: UByteArray? = null,
    val proxyPort: UShort? = null,
    val eapType: UInt? = null,
    val startBrowser: UInt? = null,
    val wifisp: UInt? = null,
)

public const val INT_MIN: CInt = -2147483648
public const val INT_MAX: CInt = 2147483647
public const val AUDIO_VOLUME_MAX: UInt = 0x8000u
public const val AUDIO_CHANNEL_MAX: UInt = 8u
public const val AUDIO_NEXT_CHANNEL: Int = -1
public const val AUDIO_SAMPLE_MIN: UInt = 64u
public const val AUDIO_SAMPLE_MAX: UInt = 65472u
public const val PSP_CTRL_SELECT: Int = 0x000001
public const val PSP_CTRL_START: Int = 0x000008
public const val PSP_CTRL_UP: Int = 0x000010
public const val PSP_CTRL_RIGHT: Int = 0x000020
public const val PSP_CTRL_DOWN: Int = 0x000040
public const val PSP_CTRL_LEFT: Int = 0x000080
public const val PSP_CTRL_LTRIGGER: Int = 0x000100
public const val PSP_CTRL_RTRIGGER: Int = 0x000200
public const val PSP_CTRL_TRIANGLE: Int = 0x001000
public const val PSP_CTRL_CIRCLE: Int = 0x002000
public const val PSP_CTRL_CROSS: Int = 0x004000
public const val PSP_CTRL_SQUARE: Int = 0x008000
public const val PSP_CTRL_HOME: Int = 0x010000
public const val PSP_CTRL_HOLD: Int = 0x020000
public const val PSP_CTRL_NOTE: Int = 0x800000
public const val PSP_CTRL_SCREEN: Int = 0x400000
public const val PSP_CTRL_VOLUP: Int = 0x100000
public const val PSP_CTRL_VOLDOWN: Int = 0x200000
public const val PSP_CTRL_WLAN_UP: Int = 0x040000
public const val PSP_CTRL_REMOTE: Int = 0x080000
public const val PSP_CTRL_DISC: Int = 0x1000000
public const val PSP_CTRL_MS: Int = 0x2000000
public const val USB_CAM_PID: Int = 0x282
public const val ACTIVATED: Int = 0x200
public const val CONNECTED: Int = 0x020
public const val ESTABLISHED: Int = 0x002
public const val USB_CAM_FLIP: Int = 1
public const val USB_CAM_MIRROR: Int = 0x100
public const val THREAD_ATTR_VFPU: Int = 0x00004000
public const val THREAD_ATTR_USER: Int = 0x80000000
public const val THREAD_ATTR_USBWLAN: Int = 0xa0000000
public const val THREAD_ATTR_VSH: Int = 0xc0000000
public const val THREAD_ATTR_SCRATCH_SRAM: Int = 0x00008000
public const val THREAD_ATTR_NO_FILLSTACK: Int = 0x00100000
public const val THREAD_ATTR_CLEAR_STACK: Int = 0x00200000
public const val EVENT_WAIT_MULTIPLE: Int = 0x200
public const val EVENT_WAIT_AND: Int = 0
public const val EVENT_WAIT_OR: Int = 1
public const val EVENT_WAIT_CLEAR: Int = 0x20
public const val POWER_INFO_POWER_SWITCH: Int = 0x80000000
public const val POWER_INFO_HOLD_SWITCH: Int = 0x40000000
public const val POWER_INFO_STANDBY: Int = 0x00080000
public const val POWER_INFO_RESUME_COMPLETE: Int = 0x00040000
public const val POWER_INFO_RESUMING: Int = 0x00020000
public const val POWER_INFO_SUSPENDING: Int = 0x00010000
public const val POWER_INFO_AC_POWER: Int = 0x00001000
public const val POWER_INFO_BATTERY_LOW: Int = 0x00000100
public const val POWER_INFO_BATTERY_EXIST: Int = 0x00000080
public const val POWER_INFO_BATTERY_POWER: Int = 0x0000007
public const val FIO_S_IFLNK: Int = 0x4000
public const val FIO_S_IFDIR: Int = 0x1000
public const val FIO_S_IFREG: Int = 0x2000
public const val FIO_S_ISUID: Int = 0x0800
public const val FIO_S_ISGID: Int = 0x0400
public const val FIO_S_ISVTX: Int = 0x0200
public const val FIO_S_IRUSR: Int = 0x0100
public const val FIO_S_IWUSR: Int = 0x0080
public const val FIO_S_IXUSR: Int = 0x0040
public const val FIO_S_IRGRP: Int = 0x0020
public const val FIO_S_IWGRP: Int = 0x0010
public const val FIO_S_IXGRP: Int = 0x0008
public const val FIO_S_IROTH: Int = 0x0004
public const val FIO_S_IWOTH: Int = 0x0002
public const val FIO_S_IXOTH: Int = 0x0001
public const val FIO_SO_IFLNK: Int = 0x0008
public const val FIO_SO_IFDIR: Int = 0x0010
public const val FIO_SO_IFREG: Int = 0x0020
public const val FIO_SO_IROTH: Int = 0x0004
public const val FIO_SO_IWOTH: Int = 0x0002
public const val FIO_SO_IXOTH: Int = 0x0001
public const val PSP_O_RD_ONLY: Int = 0x0001
public const val PSP_O_WR_ONLY: Int = 0x0002
public const val PSP_O_RD_WR: Int = 0x0003
public const val PSP_O_NBLOCK: Int = 0x0004
public const val PSP_O_DIR: Int = 0x0008
public const val PSP_O_APPEND: Int = 0x0100
public const val PSP_O_CREAT: Int = 0x0200
public const val PSP_O_TRUNC: Int = 0x0400
public const val PSP_O_EXCL: Int = 0x0800
public const val PSP_O_NO_WAIT: Int = 0x8000
public const val UMD_NOT_PRESENT: Int = 0x01
public const val UMD_PRESENT: Int = 0x02
public const val UMD_CHANGED: Int = 0x04
public const val UMD_INITING: Int = 0x08
public const val UMD_INITED: Int = 0x10
public const val UMD_READY: Int = 0x20
public const val PLAY_PAUSE: Int = 0x1
public const val FORWARD: Int = 0x4
public const val BACK: Int = 0x8
public const val VOL_UP: Int = 0x10
public const val VOL_DOWN: Int = 0x20
public const val HOLD: Int = 0x80
public const val GU_PI: Float = 3.141593
public const val GU_TEXTURE_8BIT: Int = 1
public const val GU_TEXTURE_16BIT: Int = 2
public const val GU_TEXTURE_32BITF: Int = 3
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
public const val GU_TRANSFORM_3D: Int = 0
public const val GU_COLOR_BUFFER_BIT: Int = 1
public const val GU_STENCIL_BUFFER_BIT: Int = 2
public const val GU_DEPTH_BUFFER_BIT: Int = 4
public const val GU_FAST_CLEAR_BIT: Int = 16
public const val GU_AMBIENT: Int = 1
public const val GU_DIFFUSE: Int = 2
public const val GU_SPECULAR: Int = 4
public const val GU_UNKNOWN_LIGHT_COMPONENT: Int = 8
public const val REG_KEYNAME_SIZE: UInt = 27u
public const val UTILITY_MSGDIALOG_ERROR: Int = 0
public const val UTILITY_MSGDIALOG_TEXT: Int = 1
public const val UTILITY_MSGDIALOG_YES_NO_BUTTONS: Int = 0x10
public const val UTILITY_MSGDIALOG_DEFAULT_NO: Int = 0x100
public const val UTILITY_HTMLVIEWER_OPEN_SCE_START_PAGE: Int = 0x000001
public const val UTILITY_HTMLVIEWER_DISABLE_STARTUP_LIMITS: Int = 0x000002
public const val UTILITY_HTMLVIEWER_DISABLE_EXIT_DIALOG: Int = 0x000004
public const val UTILITY_HTMLVIEWER_DISABLE_CURSOR: Int = 0x000008
public const val UTILITY_HTMLVIEWER_DISABLE_DOWNLOAD_COMPLETE_DIALOG: Int = 0x000010
public const val UTILITY_HTMLVIEWER_DISABLE_DOWNLOAD_START_DIALOG: Int = 0x000020
public const val UTILITY_HTMLVIEWER_DISABLE_DOWNLOAD_DESTINATION_DIALOG: Int = 0x000040
public const val UTILITY_HTMLVIEWER_LOCK_DOWNLOAD_DESTINATION_DIALOG: Int = 0x000080
public const val UTILITY_HTMLVIEWER_DISABLE_TAB_DISPLAY: Int = 0x000100
public const val UTILITY_HTMLVIEWER_ENABLE_ANALOG_HOLD: Int = 0x000200
public const val UTILITY_HTMLVIEWER_ENABLE_FLASH: Int = 0x000400
public const val UTILITY_HTMLVIEWER_DISABLE_LRTRIGGER: Int = 0x000800

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

public expect fun sceAudioInputInitEx(params: AudioInputParams?): Int

public expect fun sceAudioInputBlocking(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?)

public expect fun sceAudioInput(sampleCount: Int, freq: AudioInputFrequency, buf: COpaquePointer?)

public expect fun sceAudioGetInputLength(): Int

public expect fun sceAudioWaitInputEnd(): Int

public expect fun sceAudioPollInputEnd(): Int

public expect fun sceAtracGetAtracID(uiCodecType: UInt): Int

public expect fun sceAtracSetDataAndGetID(buf: COpaquePointer?, bufsize: ULong): Int

public expect fun sceAtracDecodeData(atracId: Int, outSamples: UShort?, outN: Int?, outEnd: Int?, outRemainFrame: Int?): Int

public expect fun sceAtracGetRemainFrame(atracId: Int, outRemainFrame: Int?): Int

public expect fun sceAtracGetStreamDataInfo(atracId: Int, writePointer: COpaquePointer?, availableBytes: UInt?, readOffset: UInt?): Int

public expect fun sceAtracAddStreamData(atracId: Int, bytesToAdd: UInt): Int

public expect fun sceAtracGetBitrate(atracId: Int, outBitrate: Int?): Int

public expect fun sceAtracSetLoopNum(atracId: Int, nloops: Int): Int

public expect fun sceAtracReleaseAtracID(atracId: Int): Int

public expect fun sceAtracGetNextSample(atracId: Int, outN: Int?): Int

public expect fun sceAtracGetMaxSample(atracId: Int, outMax: Int?): Int

public expect fun sceAtracGetBufferInfoForReseting(atracId: Int, uiSample: UInt, pbufferInfo: Atrac3BufferInfo?): Int

public expect fun sceAtracGetChannel(atracId: Int, puiChannel: UInt?): Int

public expect fun sceAtracGetInternalErrorInfo(atracId: Int, piResult: Int?): Int

public expect fun sceAtracGetLoopStatus(atracId: Int, piLoopNum: Int?, puiLoopStatus: UInt?): Int

public expect fun sceAtracGetNextDecodePosition(atracId: Int, puiSamplePosition: UInt?): Int

public expect fun sceAtracGetSecondBufferInfo(atracId: Int, puiPosition: UInt?, puiDataByte: UInt?): Int

public expect fun sceAtracGetSoundSample(atracId: Int, piEndSample: Int?, piLoopStartSample: Int?, piLoopEndSample: Int?): Int

public expect fun sceAtracResetPlayPosition(atracId: Int, uiSample: UInt, uiWriteByteFirstBuf: UInt, uiWriteByteSecondBuf: UInt): Int

public expect fun sceAtracSetData(atracId: Int, pucBufferAddr: COpaquePointer?, uiBufferByte: UInt): Int

public expect fun sceAtracSetHalfwayBuffer(atracId: Int, pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int

public expect fun sceAtracSetHalfwayBufferAndGetID(pucBufferAddr: COpaquePointer?, uiReadByte: UInt, uiBufferByte: UInt): Int

public expect fun sceAtracSetSecondBuffer(atracId: Int, pucSecondBufferAddr: COpaquePointer?, uiSecondBufferByte: UInt): Int

public expect fun sceCtrlSetSamplingCycle(cycle: Int): Int

public expect fun sceCtrlGetSamplingCycle(pcycle: Int?): Int

public expect fun sceCtrlSetSamplingMode(mode: CtrlMode): Int

public expect fun sceCtrlGetSamplingMode(pmode: Int?): Int

public expect fun sceCtrlPeekBufferPositive(padData: SceCtrlData?, count: Int): Int

public expect fun sceCtrlPeekBufferNegative(padData: SceCtrlData?, count: Int): Int

public expect fun sceCtrlReadBufferPositive(padData: SceCtrlData?, count: Int): Int

public expect fun sceCtrlReadBufferNegative(padData: SceCtrlData?, count: Int): Int

public expect fun sceCtrlPeekLatch(latchData: SceCtrlLatch?): Int

public expect fun sceCtrlReadLatch(latchData: SceCtrlLatch?): Int

public expect fun sceCtrlSetIdleCancelThreshold(idlereset: Int, idleback: Int): Int

public expect fun sceCtrlGetIdleCancelThreshold(idlereset: Int?, idleback: Int?): Int

public expect fun sceDisplaySetMode(mode: DisplayMode, width: ULong, height: ULong): UInt

public expect fun sceDisplayGetMode(pmode: Int?, pwidth: Int?, pheight: Int?): Int

public expect fun sceDisplaySetFrameBuf(topAddr: COpaquePointer?, bufferWidth: ULong, pixelFormat: DisplayPixelFormat, sync: DisplaySetBufSync): UInt

public expect fun sceDisplayGetFrameBuf(topAddr: COpaquePointer?, bufferWidth: ULong?, pixelFormat: DisplayPixelFormat?, sync: DisplaySetBufSync): Int

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

public expect fun sceGeGetStack(stackId: Int, stack: GeStack?): Int

public expect fun sceGeSaveContext(context: GeContext?): Int

public expect fun sceGeRestoreContext(context: GeContext?): Int

public expect fun sceGeListEnQueue(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: GeListArgs?): Int

public expect fun sceGeListEnQueueHead(list: COpaquePointer?, stall: COpaquePointer?, cbid: Int, arg: GeListArgs?): Int

public expect fun sceGeListDeQueue(qid: Int): Int

public expect fun sceGeListUpdateStallAddr(qid: Int, stall: COpaquePointer?): Int

public expect fun sceGeListSync(qid: Int, syncType: Int): GeListState

public expect fun sceGeDrawSync(syncType: Int): GeListState

public expect fun sceGeBreak(mode: Int, pParam: GeBreakParam?): Int

public expect fun sceGeContinue(): Int

public expect fun sceGeSetCallback(cb: GeCallbackData?): Int

public expect fun sceGeUnsetCallback(cbid: Int): Int

public expect fun sceKernelExitGame()

public expect fun sceKernelRegisterExitCallback(id: SceUid): Int

public expect fun sceKernelLoadExec(file: COpaquePointer?, param: SceKernelLoadExecParam?): Int

public expect fun sceKernelAllocPartitionMemory(partition: SceSysMemPartitionId, name: COpaquePointer?, type: SceSysMemBlockTypes, size: UInt, addr: COpaquePointer?): SceUid

public expect fun sceKernelGetBlockHeadAddr(blockid: SceUid): COpaquePointer?

public expect fun sceKernelFreePartitionMemory(blockid: SceUid): Int

public expect fun sceKernelTotalFreeMemSize(): ULong

public expect fun sceKernelMaxFreeMemSize(): ULong

public expect fun sceKernelDevkitVersion(): UInt

public expect fun sceKernelSetCompiledSdkVersion(version: UInt): Int

public expect fun sceKernelGetCompiledSdkVersion(): UInt

public expect fun sceKernelLibcTime(t: Int?): Int

public expect fun sceKernelLibcClock(): UInt

public expect fun sceKernelLibcGettimeofday(tp: Timeval?, tzp: Timezone?): Int

public expect fun sceKernelDcacheWritebackAll()

public expect fun sceKernelDcacheWritebackInvalidateAll()

public expect fun sceKernelDcacheWritebackRange(p: COpaquePointer?, size: UInt)

public expect fun sceKernelDcacheWritebackInvalidateRange(p: COpaquePointer?, size: UInt)

public expect fun sceKernelDcacheInvalidateRange(p: COpaquePointer?, size: UInt)

public expect fun sceKernelIcacheInvalidateAll()

public expect fun sceKernelIcacheInvalidateRange(p: COpaquePointer?, size: UInt)

public expect fun sceKernelUtilsMt19937Init(ctx: SceKernelUtilsMt19937Context?, seed: UInt): Int

public expect fun sceKernelUtilsMt19937UInt(ctx: SceKernelUtilsMt19937Context?): UInt

public expect fun sceKernelUtilsMd5Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int

public expect fun sceKernelUtilsMd5BlockInit(ctx: SceKernelUtilsMd5Context?): Int

public expect fun sceKernelUtilsMd5BlockUpdate(ctx: SceKernelUtilsMd5Context?, data: COpaquePointer?, size: UInt): Int

public expect fun sceKernelUtilsMd5BlockResult(ctx: SceKernelUtilsMd5Context?, digest: COpaquePointer?): Int

public expect fun sceKernelUtilsSha1Digest(data: COpaquePointer?, size: UInt, digest: COpaquePointer?): Int

public expect fun sceKernelUtilsSha1BlockInit(ctx: SceKernelUtilsSha1Context?): Int

public expect fun sceKernelUtilsSha1BlockUpdate(ctx: SceKernelUtilsSha1Context?, data: COpaquePointer?, size: UInt): Int

public expect fun sceKernelUtilsSha1BlockResult(ctx: SceKernelUtilsSha1Context?, digest: COpaquePointer?): Int

public expect fun sceKernelRegisterSubIntrHandler(intNo: Int, no: Int, handler: COpaquePointer?, arg: COpaquePointer?): Int

public expect fun sceKernelReleaseSubIntrHandler(intNo: Int, no: Int): Int

public expect fun sceKernelEnableSubIntr(intNo: Int, no: Int): Int

public expect fun sceKernelDisableSubIntr(intNo: Int, no: Int): Int

public expect fun queryIntrHandlerInfo(intrCode: SceUid, subIntrCode: SceUid, data: IntrHandlerOptionParam?): Int

public expect fun sceKernelCpuSuspendIntr(): UInt

public expect fun sceKernelCpuResumeIntr(flags: UInt)

public expect fun sceKernelCpuResumeIntrWithSync(flags: UInt)

public expect fun sceKernelIsCpuIntrSuspended(flags: UInt): Int

public expect fun sceKernelIsCpuIntrEnable(): Int

public expect fun sceKernelLoadModule(path: COpaquePointer?, flags: Int, option: SceKernelLMOption?): SceUid

public expect fun sceKernelLoadModuleMs(path: COpaquePointer?, flags: Int, option: SceKernelLMOption?): SceUid

public expect fun sceKernelLoadModuleByID(fid: SceUid, flags: Int, option: SceKernelLMOption?): SceUid

public expect fun sceKernelLoadModuleBufferUsbWlan(bufSize: ULong, buf: COpaquePointer?, flags: Int, option: SceKernelLMOption?): SceUid

public expect fun sceKernelStartModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: Int?, option: SceKernelSMOption?): Int

public expect fun sceKernelStopModule(modId: SceUid, argSize: ULong, argp: COpaquePointer?, status: Int?, option: SceKernelSMOption?): Int

public expect fun sceKernelUnloadModule(modId: SceUid): Int

public expect fun sceKernelSelfStopUnloadModule(unknown: Int, argSize: ULong, argp: COpaquePointer?): Int

public expect fun sceKernelStopUnloadSelfModule(argSize: ULong, argp: COpaquePointer?, status: Int?, option: SceKernelSMOption?): Int

public expect fun sceKernelQueryModuleInfo(modId: SceUid, info: SceKernelModuleInfo?): Int

public expect fun sceKernelGetModuleIdList(readBuf: SceUid?, readBufSize: Int, idCount: Int?): Int

public expect fun sceKernelVolatileMemLock(unk: Int, ptr: COpaquePointer?, size: Int?): Int

public expect fun sceKernelVolatileMemTryLock(unk: Int, ptr: COpaquePointer?, size: Int?): Int

public expect fun sceKernelVolatileMemUnlock(unk: Int): Int

public expect fun sceKernelStdin(): SceUid

public expect fun sceKernelStdout(): SceUid

public expect fun sceKernelStderr(): SceUid

public expect fun sceKernelGetThreadmanIdType(uid: SceUid): SceKernelIdListType

public expect fun sceKernelCreateThread(name: COpaquePointer?, entry: SceKernelThreadEntry, initPriority: Int, stackSize: Int, attr: Int, option: SceKernelThreadOptParam?): SceUid

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

public expect fun sceKernelWaitThreadEnd(thid: SceUid, timeout: UInt?): Int

public expect fun sceKernelWaitThreadEndCB(thid: SceUid, timeout: UInt?): Int

public expect fun sceKernelDelayThread(delay: UInt): Int

public expect fun sceKernelDelayThreadCB(delay: UInt): Int

public expect fun sceKernelDelaySysClockThread(delay: SceKernelSysClock?): Int

public expect fun sceKernelDelaySysClockThreadCB(delay: SceKernelSysClock?): Int

public expect fun sceKernelChangeCurrentThreadAttr(unknown: Int, attr: Int): Int

public expect fun sceKernelChangeThreadPriority(thid: SceUid, priority: Int): Int

public expect fun sceKernelRotateThreadReadyQueue(priority: Int): Int

public expect fun sceKernelReleaseWaitThread(thid: SceUid): Int

public expect fun sceKernelGetThreadId(): Int

public expect fun sceKernelGetThreadCurrentPriority(): Int

public expect fun sceKernelGetThreadExitStatus(thid: SceUid): Int

public expect fun sceKernelCheckThreadStack(): Int

public expect fun sceKernelGetThreadStackFreeSize(thid: SceUid): Int

public expect fun sceKernelReferThreadStatus(thid: SceUid, info: SceKernelThreadInfo?): Int

public expect fun sceKernelReferThreadRunStatus(thid: SceUid, status: SceKernelThreadRunStatus?): Int

public expect fun sceKernelCreateSema(name: COpaquePointer?, attr: UInt, initVal: Int, maxVal: Int, option: SceKernelSemaOptParam?): SceUid

public expect fun sceKernelDeleteSema(semaId: SceUid): Int

public expect fun sceKernelSignalSema(semaId: SceUid, signal: Int): Int

public expect fun sceKernelWaitSema(semaId: SceUid, signal: Int, timeout: UInt?): Int

public expect fun sceKernelWaitSemaCB(semaId: SceUid, signal: Int, timeout: UInt?): Int

public expect fun sceKernelPollSema(semaId: SceUid, signal: Int): Int

public expect fun sceKernelReferSemaStatus(semaId: SceUid, info: SceKernelSemaInfo?): Int

public expect fun sceKernelCreateEventFlag(name: COpaquePointer?, attr: Int, bits: Int, opt: SceKernelEventFlagOptParam?): SceUid

public expect fun sceKernelSetEventFlag(evId: SceUid, bits: UInt): Int

public expect fun sceKernelClearEventFlag(evId: SceUid, bits: UInt): Int

public expect fun sceKernelPollEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: UInt?): Int

public expect fun sceKernelWaitEventFlag(evId: SceUid, bits: UInt, wait: Int, outBits: UInt?, timeout: UInt?): Int

public expect fun sceKernelWaitEventFlagCB(evId: SceUid, bits: UInt, wait: Int, outBits: UInt?, timeout: UInt?): Int

public expect fun sceKernelDeleteEventFlag(evId: SceUid): Int

public expect fun sceKernelReferEventFlagStatus(event: SceUid, status: SceKernelEventFlagInfo?): Int

public expect fun sceKernelCreateMbx(name: COpaquePointer?, attr: UInt, option: SceKernelMbxOptParam?): SceUid

public expect fun sceKernelDeleteMbx(mbxId: SceUid): Int

public expect fun sceKernelSendMbx(mbxId: SceUid, message: COpaquePointer?): Int

public expect fun sceKernelReceiveMbx(mbxId: SceUid, message: COpaquePointer?, timeout: UInt?): Int

public expect fun sceKernelReceiveMbxCB(mbxId: SceUid, message: COpaquePointer?, timeout: UInt?): Int

public expect fun sceKernelPollMbx(mbxId: SceUid, pmessage: COpaquePointer?): Int

public expect fun sceKernelCancelReceiveMbx(mbxId: SceUid, num: Int?): Int

public expect fun sceKernelReferMbxStatus(mbxId: SceUid, info: SceKernelMbxInfo?): Int

public expect fun sceKernelSetAlarm(clock: UInt, handler: SceKernelAlarmHandler, common: COpaquePointer?): SceUid

public expect fun sceKernelSetSysClockAlarm(clock: SceKernelSysClock?, handler: SceKernelAlarmHandler?, common: COpaquePointer?): SceUid

public expect fun sceKernelCancelAlarm(alarmId: SceUid): Int

public expect fun sceKernelReferAlarmStatus(alarmId: SceUid, info: SceKernelAlarmInfo?): Int

public expect fun sceKernelCreateCallback(name: COpaquePointer?, func: SceKernelCallbackFunction, arg: COpaquePointer?): SceUid

public expect fun sceKernelReferCallbackStatus(cb: SceUid, status: SceKernelCallbackInfo?): Int

public expect fun sceKernelDeleteCallback(cb: SceUid): Int

public expect fun sceKernelNotifyCallback(cb: SceUid, arg2: Int): Int

public expect fun sceKernelCancelCallback(cb: SceUid): Int

public expect fun sceKernelGetCallbackCount(cb: SceUid): Int

public expect fun sceKernelCheckCallback(): Int

public expect fun sceKernelGetThreadmanIdList(type: SceKernelIdListType, readBuf: SceUid?, readBufSize: Int, idCount: Int?): Int

public expect fun sceKernelReferSystemStatus(status: SceKernelSystemStatus?): Int

public expect fun sceKernelCreateMsgPipe(name: COpaquePointer?, part: Int, attr: Int, unk1: COpaquePointer?, opt: COpaquePointer?): SceUid

public expect fun sceKernelDeleteMsgPipe(uid: SceUid): Int

public expect fun sceKernelSendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int

public expect fun sceKernelSendMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int

public expect fun sceKernelTrySendMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int

public expect fun sceKernelReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int

public expect fun sceKernelReceiveMsgPipeCB(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?, timeout: UInt?): Int

public expect fun sceKernelTryReceiveMsgPipe(uid: SceUid, message: COpaquePointer?, size: UInt, unk1: Int, unk2: COpaquePointer?): Int

public expect fun sceKernelCancelMsgPipe(uid: SceUid, send: Int?, recv: Int?): Int

public expect fun sceKernelReferMsgPipeStatus(uid: SceUid, info: SceKernelMppInfo?): Int

public expect fun sceKernelCreateVpl(name: COpaquePointer?, part: Int, attr: Int, size: UInt, opt: SceKernelVplOptParam?): SceUid

public expect fun sceKernelDeleteVpl(uid: SceUid): Int

public expect fun sceKernelAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: UInt?): Int

public expect fun sceKernelAllocateVplCB(uid: SceUid, size: UInt, data: COpaquePointer?, timeout: UInt?): Int

public expect fun sceKernelTryAllocateVpl(uid: SceUid, size: UInt, data: COpaquePointer?): Int

public expect fun sceKernelFreeVpl(uid: SceUid, data: COpaquePointer?): Int

public expect fun sceKernelCancelVpl(uid: SceUid, num: Int?): Int

public expect fun sceKernelReferVplStatus(uid: SceUid, info: SceKernelVplInfo?): Int

public expect fun sceKernelCreateFpl(name: COpaquePointer?, part: Int, attr: Int, size: UInt, blocks: UInt, opt: SceKernelFplOptParam?): Int

public expect fun sceKernelDeleteFpl(uid: SceUid): Int

public expect fun sceKernelAllocateFpl(uid: SceUid, data: COpaquePointer?, timeout: UInt?): Int

public expect fun sceKernelAllocateFplCB(uid: SceUid, data: COpaquePointer?, timeout: UInt?): Int

public expect fun sceKernelTryAllocateFpl(uid: SceUid, data: COpaquePointer?): Int

public expect fun sceKernelFreeFpl(uid: SceUid, data: COpaquePointer?): Int

public expect fun sceKernelCancelFpl(uid: SceUid, pnum: Int?): Int

public expect fun sceKernelReferFplStatus(uid: SceUid, info: SceKernelFplInfo?): Int

public expect fun sceKernelUSec2SysClock(usec: UInt, clock: SceKernelSysClock?): Int

public expect fun sceKernelUSec2SysClockWide(usec: UInt): Long

public expect fun sceKernelSysClock2USec(clock: SceKernelSysClock?, low: UInt?, high: UInt?): Int

public expect fun sceKernelSysClock2USecWide(clock: Long, low: UInt?, high: UInt?): Int

public expect fun sceKernelGetSystemTime(time: SceKernelSysClock?): Int

public expect fun sceKernelGetSystemTimeWide(): Long

public expect fun sceKernelGetSystemTimeLow(): UInt

public expect fun sceKernelCreateVTimer(name: COpaquePointer?, opt: SceKernelVTimerOptParam?): SceUid

public expect fun sceKernelDeleteVTimer(uid: SceUid): Int

public expect fun sceKernelGetVTimerBase(uid: SceUid, base: SceKernelSysClock?): Int

public expect fun sceKernelGetVTimerBaseWide(uid: SceUid): Long

public expect fun sceKernelGetVTimerTime(uid: SceUid, time: SceKernelSysClock?): Int

public expect fun sceKernelGetVTimerTimeWide(uid: SceUid): Long

public expect fun sceKernelSetVTimerTime(uid: SceUid, time: SceKernelSysClock?): Int

public expect fun sceKernelSetVTimerTimeWide(uid: SceUid, time: Long): Long

public expect fun sceKernelStartVTimer(uid: SceUid): Int

public expect fun sceKernelStopVTimer(uid: SceUid): Int

public expect fun sceKernelSetVTimerHandler(uid: SceUid, time: SceKernelSysClock?, handler: SceKernelVTimerHandler, common: COpaquePointer?): Int

public expect fun sceKernelSetVTimerHandlerWide(uid: SceUid, time: Long, handler: SceKernelVTimerHandlerWide, common: COpaquePointer?): Int

public expect fun sceKernelCancelVTimerHandler(uid: SceUid): Int

public expect fun sceKernelReferVTimerStatus(uid: SceUid, info: SceKernelVTimerInfo?): Int

public expect fun sceKernelRegisterThreadEventHandler(name: COpaquePointer?, threadId: SceUid, mask: Int, handler: SceKernelThreadEventHandler, common: COpaquePointer?): SceUid

public expect fun sceKernelReleaseThreadEventHandler(uid: SceUid): Int

public expect fun sceKernelReferThreadEventHandlerStatus(uid: SceUid, info: SceKernelThreadEventHandlerInfo?): Int

public expect fun sceKernelReferThreadProfiler(): DebugProfilerRegs?

public expect fun sceKernelReferGlobalProfiler(): DebugProfilerRegs?

public expect fun sceUsbStart(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int

public expect fun sceUsbStop(driverName: COpaquePointer?, size: Int, args: COpaquePointer?): Int

public expect fun sceUsbActivate(pid: UInt): Int

public expect fun sceUsbDeactivate(pid: UInt): Int

public expect fun sceUsbGetState(): Int

public expect fun sceUsbGetDrvState(driverName: COpaquePointer?): Int

public expect fun sceUsbCamSetupStill(param: UsbCamSetupStillParam?): Int

public expect fun sceUsbCamSetupStillEx(param: UsbCamSetupStillExParam?): Int

public expect fun sceUsbCamStillInputBlocking(buf: COpaquePointer?, size: ULong): Int

public expect fun sceUsbCamStillInput(buf: COpaquePointer?, size: ULong): Int

public expect fun sceUsbCamStillWaitInputEnd(): Int

public expect fun sceUsbCamStillPollInputEnd(): Int

public expect fun sceUsbCamStillCancelInput(): Int

public expect fun sceUsbCamStillGetInputLength(): Int

public expect fun sceUsbCamSetupVideo(param: UsbCamSetupVideoParam?, workArea: COpaquePointer?, workAreaSize: Int): Int

public expect fun sceUsbCamSetupVideoEx(param: UsbCamSetupVideoExParam?, workArea: COpaquePointer?, workAreaSize: Int): Int

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

public expect fun sceUsbCamGetSaturation(saturation: Int?): Int

public expect fun sceUsbCamGetBrightness(brightness: Int?): Int

public expect fun sceUsbCamGetContrast(contrast: Int?): Int

public expect fun sceUsbCamGetSharpness(sharpness: Int?): Int

public expect fun sceUsbCamGetImageEffectMode(effectMode: UsbCamEffectMode?): Int

public expect fun sceUsbCamGetEvLevel(exposureLevel: UsbCamEvLevel?): Int

public expect fun sceUsbCamGetReverseMode(reverseFlags: Int?): Int

public expect fun sceUsbCamGetZoom(zoom: Int?): Int

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

public expect fun sceRtcGetCurrentTick(tick: ULong?): Int

public expect fun sceRtcGetCurrentClock(tm: ScePspDateTime?, tz: Int): Int

public expect fun sceRtcGetCurrentClockLocalTime(tm: ScePspDateTime?): Int

public expect fun sceRtcConvertUtcToLocalTime(tickUtc: ULong?, tickLocal: ULong?): Int

public expect fun sceRtcConvertLocalTimeToUTC(tickLocal: ULong?, tickUtc: ULong?): Int

public expect fun sceRtcIsLeapYear(year: Int): Int

public expect fun sceRtcGetDaysInMonth(year: Int, month: Int): Int

public expect fun sceRtcGetDayOfWeek(year: Int, month: Int, day: Int): Int

public expect fun sceRtcCheckValid(date: ScePspDateTime?): Int

public expect fun sceRtcSetTick(date: ScePspDateTime?, tick: ULong?): Int

public expect fun sceRtcGetTick(date: ScePspDateTime?, tick: ULong?): Int

public expect fun sceRtcCompareTick(tick1: ULong?, tick2: ULong?): Int

public expect fun sceRtcTickAddTicks(destTick: ULong?, srcTick: ULong?, numTicks: ULong): Int

public expect fun sceRtcTickAddMicroseconds(destTick: ULong?, srcTick: ULong?, numMs: ULong): Int

public expect fun sceRtcTickAddSeconds(destTick: ULong?, srcTick: ULong?, numSeconds: ULong): Int

public expect fun sceRtcTickAddMinutes(destTick: ULong?, srcTick: ULong?, numMinutes: ULong): Int

public expect fun sceRtcTickAddHours(destTick: ULong?, srcTick: ULong?, numHours: ULong): Int

public expect fun sceRtcTickAddDays(destTick: ULong?, srcTick: ULong?, numDays: ULong): Int

public expect fun sceRtcTickAddWeeks(destTick: ULong?, srcTick: ULong?, numWeeks: ULong): Int

public expect fun sceRtcTickAddMonths(destTick: ULong?, srcTick: ULong?, numMonths: ULong): Int

public expect fun sceRtcTickAddYears(destTick: ULong?, srcTick: ULong?, numYears: ULong): Int

public expect fun sceRtcSetTimeT(date: ScePspDateTime?, time: UInt): Int

public expect fun sceRtcGetTimeT(date: ScePspDateTime?, time: UInt?): Int

public expect fun sceRtcSetTime64T(date: ScePspDateTime?, time: ULong): Int

public expect fun sceRtcGetTime64T(date: ScePspDateTime?, time: ULong?): Int

public expect fun sceRtcSetDosTime(date: ScePspDateTime?, dosTime: UInt): Int

public expect fun sceRtcGetDosTime(date: ScePspDateTime?, dosTime: UInt): Int

public expect fun sceRtcSetWin32FileTime(date: ScePspDateTime?, time: ULong?): Int

public expect fun sceRtcGetWin32FileTime(date: ScePspDateTime?, time: ULong?): Int

public expect fun sceRtcParseDateTime(destTick: ULong?, dateString: COpaquePointer?): Int

public expect fun sceRtcFormatRFC3339(pszDateTime: String?, pUtc: ULong?, timeZoneMinutes: Int): Int

public expect fun sceRtcFormatRFC3339LocalTime(pszDateTime: String?, pUtc: ULong?): Int

public expect fun sceRtcParseRFC3339(pUtc: ULong?, pszDateTime: COpaquePointer?): Int

public expect fun sceRtcFormatRFC2822(pszDateTime: String?, pUtc: ULong?, timeZoneMinutes: Int): Int

public expect fun sceRtcFormatRFC2822LocalTime(pszDateTime: String?, pUtc: ULong?): Int

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

public expect fun sceIoDread(fd: SceUid, dir: SceIoDirent?): Int

public expect fun sceIoDclose(fd: SceUid): Int

public expect fun sceIoDevctl(dev: COpaquePointer?, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int

public expect fun sceIoAssign(dev1: COpaquePointer?, dev2: COpaquePointer?, dev3: COpaquePointer?, mode: IoAssignPerms, unk1: COpaquePointer?, unk2: Int): Int

public expect fun sceIoUnassign(dev: COpaquePointer?): Int

public expect fun sceIoGetstat(file: COpaquePointer?, stat: SceIoStat?): Int

public expect fun sceIoChstat(file: COpaquePointer?, stat: SceIoStat?, bits: Int): Int

public expect fun sceIoIoctl(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int

public expect fun sceIoIoctlAsync(fd: SceUid, cmd: UInt, indata: COpaquePointer?, inlen: Int, outdata: COpaquePointer?, outlen: Int): Int

public expect fun sceIoSync(device: COpaquePointer?, unk: UInt): Int

public expect fun sceIoWaitAsync(fd: SceUid, res: Long?): Int

public expect fun sceIoWaitAsyncCB(fd: SceUid, res: Long?): Int

public expect fun sceIoPollAsync(fd: SceUid, res: Long?): Int

public expect fun sceIoGetAsyncStat(fd: SceUid, poll: Int, res: Long?): Int

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

public expect fun sceUmdGetDiscInfo(info: UmdInfo?): Int

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

public expect fun sceMpegRingbufferConstruct(ringbuffer: SceMpegRingbuffer?, packets: Int, data: COpaquePointer?, size: Int, callback: SceMpegRingbufferCb, cbParam: COpaquePointer?): Int

public expect fun sceMpegRingbufferDestruct(ringbuffer: SceMpegRingbuffer?)

public expect fun sceMpegRingbufferAvailableSize(ringbuffer: SceMpegRingbuffer?): Int

public expect fun sceMpegRingbufferPut(ringbuffer: SceMpegRingbuffer?, numPackets: Int, available: Int): Int

public expect fun sceMpegQueryMemSize(unk: Int): Int

public expect fun sceMpegCreate(handle: SceMpeg, data: COpaquePointer?, size: Int, ringbuffer: SceMpegRingbuffer?, frameWidth: Int, unk1: Int, unk2: Int): Int

public expect fun sceMpegDelete(handle: SceMpeg)

public expect fun sceMpegQueryStreamOffset(handle: SceMpeg, buffer: COpaquePointer?, offset: Int?): Int

public expect fun sceMpegQueryStreamSize(buffer: COpaquePointer?, size: Int?): Int

public expect fun sceMpegRegistStream(handle: SceMpeg, streamId: Int, unk: Int): SceMpegStream

public expect fun sceMpegUnRegistStream(handle: SceMpeg, stream: SceMpegStream)

public expect fun sceMpegFlushAllStream(handle: SceMpeg): Int

public expect fun sceMpegMallocAvcEsBuf(handle: SceMpeg): COpaquePointer?

public expect fun sceMpegFreeAvcEsBuf(handle: SceMpeg, buf: COpaquePointer?)

public expect fun sceMpegQueryAtracEsSize(handle: SceMpeg, esSize: Int?, outSize: Int?): Int

public expect fun sceMpegInitAu(handle: SceMpeg, esBuffer: COpaquePointer?, au: SceMpegAu?): Int

public expect fun sceMpegGetAvcAu(handle: SceMpeg, stream: SceMpegStream, au: SceMpegAu?, unk: Int?): Int

public expect fun sceMpegAvcDecodeMode(handle: SceMpeg, mode: SceMpegAvcMode?): Int

public expect fun sceMpegAvcDecode(handle: SceMpeg, au: SceMpegAu?, iframeWidth: Int, buffer: COpaquePointer?, init: Int?): Int

public expect fun sceMpegAvcDecodeStop(handle: SceMpeg, frameWidth: Int, buffer: COpaquePointer?, status: Int?): Int

public expect fun sceMpegGetAtracAu(handle: SceMpeg, stream: SceMpegStream, au: SceMpegAu?, unk: COpaquePointer?): Int

public expect fun sceMpegAtracDecode(handle: SceMpeg, au: SceMpegAu?, buffer: COpaquePointer?, init: Int): Int

public expect fun sceMpegBaseYCrCbCopyVme(yuvBuffer: COpaquePointer?, buffer: Int?, type: Int): Int

public expect fun sceMpegBaseCscInit(width: Int): Int

public expect fun sceMpegBaseCscVme(rgbBuffer: COpaquePointer?, rgbBuffer2: COpaquePointer?, width: Int, yCrCbBuffer: SceMpegYCrCbBuffer?): Int

public expect fun sceMpegbaseBEA18F91(lli: SceMpegLLI?): Int

public expect fun sceHprmPeekCurrentKey(key: Int?): Int

public expect fun sceHprmPeekLatch(latch: UIntArray?): Int

public expect fun sceHprmReadLatch(latch: UIntArray?): Int

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

public expect fun sceGuSendList(mode: GuQueueMode, list: COpaquePointer?, context: GeContext?)

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

public expect fun sceGuLight(light: Int, type: LightType, components: Int, position: ScePspFVector3?)

public expect fun sceGuLightAtt(light: Int, atten0: Float, atten1: Float, atten2: Float)

public expect fun sceGuLightColor(light: Int, component: Int, color: UInt)

public expect fun sceGuLightMode(mode: LightMode)

public expect fun sceGuLightSpot(light: Int, direction: ScePspFVector3?, exponent: Float, cutoff: Float)

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

public expect fun sceGuSetDither(matrix: ScePspIMatrix4?)

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

public expect fun sceGuSetMatrix(type: MatrixMode, matrix: ScePspFMatrix4?)

public expect fun sceGuBoneMatrix(index: UInt, matrix: ScePspFMatrix4?)

public expect fun sceGuMorphWeight(index: Int, weight: Float)

public expect fun sceGuDrawArrayN(primitiveType: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?)

public expect fun sceGumDrawArray(prim: GuPrimitive, vType: Int, count: Int, indices: COpaquePointer?, vertices: COpaquePointer?)

public expect fun sceGumDrawArrayN(prim: GuPrimitive, vType: Int, count: Int, a3: Int, indices: COpaquePointer?, vertices: COpaquePointer?)

public expect fun sceGumDrawBezier(vType: Int, uCount: Int, vCount: Int, indices: COpaquePointer?, vertices: COpaquePointer?)

public expect fun sceGumDrawSpline(vType: Int, uCount: Int, vCount: Int, uEdge: Int, vEdge: Int, indices: COpaquePointer?, vertices: COpaquePointer?)

public expect fun sceGumFastInverse()

public expect fun sceGumFullInverse()

public expect fun sceGumLoadIdentity()

public expect fun sceGumLoadMatrix(m: ScePspFMatrix4?)

public expect fun sceGumLookAt(eye: ScePspFVector3?, center: ScePspFVector3?, up: ScePspFVector3?)

public expect fun sceGumMatrixMode(mode: MatrixMode)

public expect fun sceGumMultMatrix(m: ScePspFMatrix4?)

public expect fun sceGumOrtho(left: Float, right: Float, bottom: Float, top: Float, near: Float, far: Float)

public expect fun sceGumPerspective(fovy: Float, aspect: Float, near: Float, far: Float)

public expect fun sceGumPopMatrix()

public expect fun sceGumPushMatrix()

public expect fun sceGumRotateX(angle: Float)

public expect fun sceGumRotateY(angle: Float)

public expect fun sceGumRotateZ(angle: Float)

public expect fun sceGumRotateXYZ(v: ScePspFVector3?)

public expect fun sceGumRotateZYX(v: ScePspFVector3?)

public expect fun sceGumScale(v: ScePspFVector3?)

public expect fun sceGumStoreMatrix(m: ScePspFMatrix4?)

public expect fun sceGumTranslate(v: ScePspFVector3?)

public expect fun sceGumUpdateMatrix()

public expect fun sceMp3ReserveMp3Handle(args: SceMp3InitArg?): Int

public expect fun sceMp3ReleaseMp3Handle(handle: Mp3Handle): Int

public expect fun sceMp3InitResource(): Int

public expect fun sceMp3TermResource(): Int

public expect fun sceMp3Init(handle: Mp3Handle): Int

public expect fun sceMp3Decode(handle: Mp3Handle, dst: COpaquePointer?): Int

public expect fun sceMp3GetInfoToAddStreamData(handle: Mp3Handle, dst: COpaquePointer?, toWrite: Int?, srcPos: Int?): Int

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

public expect fun sceRegOpenRegistry(reg: Key?, mode: Int, handle: RegHandle?): Int

public expect fun sceRegFlushRegistry(handle: RegHandle): Int

public expect fun sceRegCloseRegistry(handle: RegHandle): Int

public expect fun sceRegOpenCategory(handle: RegHandle, name: COpaquePointer?, mode: Int, dirHandle: RegHandle?): Int

public expect fun sceRegRemoveCategory(handle: RegHandle, name: COpaquePointer?): Int

public expect fun sceRegCloseCategory(dirHandle: RegHandle): Int

public expect fun sceRegFlushCategory(dirHandle: RegHandle): Int

public expect fun sceRegGetKeyInfo(dirHandle: RegHandle, name: COpaquePointer?, keyHandle: RegHandle?, type: KeyType?, size: ULong?): Int

public expect fun sceRegGetKeyInfoByName(dirHandle: RegHandle, name: COpaquePointer?, type: KeyType?, size: ULong?): Int

public expect fun sceRegGetKeyValue(dirHandle: RegHandle, keyHandle: RegHandle, buf: COpaquePointer?, size: ULong): Int

public expect fun sceRegGetKeyValueByName(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int

public expect fun sceRegSetKeyValue(dirHandle: RegHandle, name: COpaquePointer?, buf: COpaquePointer?, size: ULong): Int

public expect fun sceRegGetKeysNum(dirHandle: RegHandle, num: Int?): Int

public expect fun sceRegGetKeys(dirHandle: RegHandle, buf: COpaquePointer?, num: Int): Int

public expect fun sceRegCreateKey(dirHandle: RegHandle, name: COpaquePointer?, type: Int, size: ULong): Int

public expect fun sceRegRemoveRegistry(key: Key?): Int

public expect fun sceOpenPSIDGetOpenPSID(openpsid: OpenPSID?): Int

public expect fun sceUtilityMsgDialogInitStart(params: UtilityMsgDialogParams?): Int

public expect fun sceUtilityMsgDialogShutdownStart()

public expect fun sceUtilityMsgDialogGetStatus(): Int

public expect fun sceUtilityMsgDialogUpdate(n: Int)

public expect fun sceUtilityMsgDialogAbort(): Int

public expect fun sceUtilityNetconfInitStart(data: UtilityNetconfData?): Int

public expect fun sceUtilityNetconfShutdownStart(): Int

public expect fun sceUtilityNetconfUpdate(unknown: Int): Int

public expect fun sceUtilityNetconfGetStatus(): Int

public expect fun sceUtilityCheckNetParam(id: Int): Int

public expect fun sceUtilityGetNetParam(conf: Int, param: NetParam, data: UtilityNetData?): Int

public expect fun sceUtilitySavedataInitStart(params: SceUtilitySavedataParam?): Int

public expect fun sceUtilitySavedataGetStatus(): Int

public expect fun sceUtilitySavedataShutdownStart(): Int

public expect fun sceUtilitySavedataUpdate(unknown: Int)

public expect fun sceUtilityGameSharingInitStart(params: UtilityGameSharingParams?): Int

public expect fun sceUtilityGameSharingShutdownStart()

public expect fun sceUtilityGameSharingGetStatus(): Int

public expect fun sceUtilityGameSharingUpdate(n: Int)

public expect fun sceUtilityHtmlViewerInitStart(params: UtilityHtmlViewerParam?): Int

public expect fun sceUtilityHtmlViewerShutdownStart(): Int

public expect fun sceUtilityHtmlViewerUpdate(n: Int): Int

public expect fun sceUtilityHtmlViewerGetStatus(): Int

public expect fun sceUtilitySetSystemParamInt(id: SystemParamId, value: Int): Int

public expect fun sceUtilitySetSystemParamString(id: SystemParamId, str: COpaquePointer?): Int

public expect fun sceUtilityGetSystemParamInt(id: SystemParamId, value: Int?): Int

public expect fun sceUtilityGetSystemParamString(id: SystemParamId, str: COpaquePointer?, len: Int): Int

public expect fun sceUtilityOskInitStart(params: SceUtilityOskParams?): Int

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

public expect fun sceUtilitySetNetParam(param: NetParam, `val`: COpaquePointer?): Int

public expect fun sceUtilityCopyNetParam(src: Int, dest: Int): Int

public expect fun sceUtilityDeleteNetParam(conf: Int): Int

public expect fun sceNetInit(poolsize: Int, calloutprio: Int, calloutstack: Int, netintrprio: Int, netintrstack: Int): Int

public expect fun sceNetTerm(): Int

public expect fun sceNetFreeThreadinfo(thid: Int): Int

public expect fun sceNetThreadAbort(thid: Int): Int

public expect fun sceNetEtherStrton(name: COpaquePointer?, mac: COpaquePointer?)

public expect fun sceNetEtherNtostr(mac: COpaquePointer?, name: COpaquePointer?)

public expect fun sceNetGetLocalEtherAddr(mac: COpaquePointer?): Int

public expect fun sceNetGetMallocStat(stat: SceNetMallocStat?): Int

public expect fun sceNetAdhocctlInit(stacksize: Int, priority: Int, adhocId: SceNetAdhocctlAdhocId?): Int

public expect fun sceNetAdhocctlTerm(): Int

public expect fun sceNetAdhocctlConnect(name: COpaquePointer?): Int

public expect fun sceNetAdhocctlDisconnect(): Int

public expect fun sceNetAdhocctlGetState(event: Int?): Int

public expect fun sceNetAdhocctlCreate(name: COpaquePointer?): Int

public expect fun sceNetAdhocctlJoin(scaninfo: SceNetAdhocctlScanInfo?): Int

public expect fun sceNetAdhocctlGetAdhocId(id: SceNetAdhocctlAdhocId?): Int

public expect fun sceNetAdhocctlCreateEnterGameMode(name: COpaquePointer?, unknown: Int, num: Int, macs: COpaquePointer?, timeout: UInt, unknown2: Int): Int

public expect fun sceNetAdhocctlJoinEnterGameMode(name: COpaquePointer?, hostmac: COpaquePointer?, timeout: UInt, unknown: Int): Int

public expect fun sceNetAdhocctlGetGameModeInfo(gamemodeinfo: SceNetAdhocctlGameModeInfo?): Int

public expect fun sceNetAdhocctlExitGameMode(): Int

public expect fun sceNetAdhocctlGetPeerList(length: Int?, buf: COpaquePointer?): Int

public expect fun sceNetAdhocctlGetPeerInfo(mac: COpaquePointer?, size: Int, peerinfo: SceNetAdhocctlPeerInfo?): Int

public expect fun sceNetAdhocctlScan(): Int

public expect fun sceNetAdhocctlGetScanInfo(length: Int?, buf: COpaquePointer?): Int

public expect fun sceNetAdhocctlAddHandler(handler: SceNetAdhocctlHandler, unknown: COpaquePointer?): Int

public expect fun sceNetAdhocctlDelHandler(id: Int): Int

public expect fun sceNetAdhocctlGetNameByAddr(mac: COpaquePointer?, nickname: COpaquePointer?): Int

public expect fun sceNetAdhocctlGetAddrByName(nickname: COpaquePointer?, length: Int?, buf: COpaquePointer?): Int

public expect fun sceNetAdhocctlGetParameter(params: SceNetAdhocctlParams?): Int

public expect fun sceNetAdhocInit(): Int

public expect fun sceNetAdhocTerm(): Int

public expect fun sceNetAdhocPdpCreate(mac: COpaquePointer?, port: UShort, bufSize: UInt, unk1: Int): Int

public expect fun sceNetAdhocPdpDelete(id: Int, unk1: Int): Int

public expect fun sceNetAdhocPdpSend(id: Int, destMacAddr: COpaquePointer?, port: UShort, data: COpaquePointer?, len: UInt, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocPdpRecv(id: Int, srcMacAddr: COpaquePointer?, port: UShort?, data: COpaquePointer?, dataLength: COpaquePointer?, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocGetPdpStat(size: Int?, stat: SceNetAdhocPdpStat?): Int

public expect fun sceNetAdhocGameModeCreateMaster(data: COpaquePointer?, size: Int): Int

public expect fun sceNetAdhocGameModeCreateReplica(mac: COpaquePointer?, data: COpaquePointer?, size: Int): Int

public expect fun sceNetAdhocGameModeUpdateMaster(): Int

public expect fun sceNetAdhocGameModeUpdateReplica(id: Int, unk1: Int): Int

public expect fun sceNetAdhocGameModeDeleteMaster(): Int

public expect fun sceNetAdhocGameModeDeleteReplica(id: Int): Int

public expect fun sceNetAdhocPtpOpen(srcmac: COpaquePointer?, srcport: UShort, destmac: COpaquePointer?, destport: UShort, bufSize: UInt, delay: UInt, count: Int, unk1: Int): Int

public expect fun sceNetAdhocPtpConnect(id: Int, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocPtpListen(srcmac: COpaquePointer?, srcport: UShort, bufSize: UInt, delay: UInt, count: Int, queue: Int, unk1: Int): Int

public expect fun sceNetAdhocPtpAccept(id: Int, mac: COpaquePointer?, port: UShort?, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocPtpSend(id: Int, data: COpaquePointer?, dataSize: Int?, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocPtpRecv(id: Int, data: COpaquePointer?, dataSize: Int?, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocPtpFlush(id: Int, timeout: UInt, nonblock: Int): Int

public expect fun sceNetAdhocPtpClose(id: Int, unk1: Int): Int

public expect fun sceNetAdhocGetPtpStat(size: Int?, stat: SceNetAdhocPtpStat?): Int

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

public expect fun sceNetAdhocMatchingGetHelloOpt(matchingId: Int, optLen: Int?, optData: COpaquePointer?): Int

public expect fun sceNetAdhocMatchingGetMembers(matchingId: Int, length: Int?, buf: COpaquePointer?): Int

public expect fun sceNetAdhocMatchingGetPoolMaxAlloc(): Int

public expect fun sceNetAdhocMatchingGetPoolStat(poolstat: AdhocPoolStat?): Int

public expect fun sceNetApctlInit(stackSize: Int, initPriority: Int): Int

public expect fun sceNetApctlTerm(): Int

public expect fun sceNetApctlGetInfo(code: ApctlInfo, pinfo: SceNetApctlInfo?): Int

public expect fun sceNetApctlAddHandler(handler: SceNetApctlHandler, parg: COpaquePointer?): Int

public expect fun sceNetApctlDelHandler(handlerId: Int): Int

public expect fun sceNetApctlConnect(connIndex: Int): Int

public expect fun sceNetApctlDisconnect(): Int

public expect fun sceNetApctlGetState(pstate: ApctlState?): Int

public expect fun sceNetInetInit(): Int

public expect fun sceNetInetTerm(): Int

public expect fun sceNetInetAccept(s: Int, addr: Sockaddr?, addrLen: SocklenT?): Int

public expect fun sceNetInetBind(s: Int, myAddr: Sockaddr?, addrLen: SocklenT): Int

public expect fun sceNetInetConnect(s: Int, servAddr: Sockaddr?, addrLen: SocklenT): Int

public expect fun sceNetInetGetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optlEn: SocklenT?): Int

public expect fun sceNetInetListen(s: Int, backlog: Int): Int

public expect fun sceNetInetRecv(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong

public expect fun sceNetInetRecvfrom(s: Int, buf: COpaquePointer?, flags: ULong, arg1: Int, from: Sockaddr?, fromLen: SocklenT?): ULong

public expect fun sceNetInetSend(s: Int, buf: COpaquePointer?, len: ULong, flags: Int): ULong

public expect fun sceNetInetSendto(s: Int, buf: COpaquePointer?, len: ULong, flags: Int, to: Sockaddr?, toLen: SocklenT): ULong

public expect fun sceNetInetSetsockopt(s: Int, level: Int, optName: Int, optVal: COpaquePointer?, optLen: SocklenT): Int

public expect fun sceNetInetShutdown(s: Int, how: Int): Int

public expect fun sceNetInetSocket(domain: Int, type: Int, protocol: Int): Int

public expect fun sceNetInetClose(s: Int): Int

public expect fun sceNetInetGetErrno(): Int

public expect fun sceSslInit(unknown1: Int): Int

public expect fun sceSslEnd(): Int

public expect fun sceSslGetUsedMemoryMax(memory: UInt?): Int

public expect fun sceSslGetUsedMemoryCurrent(memory: UInt?): Int

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

public expect fun sceHttpGetContentLength(requestId: Int, contentLength: ULong?): Int

public expect fun sceHttpGetStatusCode(requestId: Int, statusCode: Int?): Int

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

public expect fun sceHttpGetAllHeader(request: Int, header: COpaquePointer?, headerSize: UInt?): Int

public expect fun sceHttpGetNetworkErrno(request: Int, errNum: Int?): Int

public expect fun sceHttpGetProxy(id: Int, activateFlag: Int?, mode: Int?, proxyHost: COpaquePointer?, len: ULong, proxyPort: UShort?): Int

public expect fun sceHttpInitCache(maxSize: ULong): Int

public expect fun sceHttpSetAuthInfoCB(id: Int, cbfunc: HttpPasswordCB): Int

public expect fun sceHttpSetProxy(id: Int, activateFlag: Int, mode: Int, newProxyHost: COpaquePointer?, newProxyPort: UShort): Int

public expect fun sceHttpSetResHeaderMaxSize(id: Int, headerSize: UInt): Int

public expect fun sceHttpSetMallocFunction(mallocFunc: HttpMallocFunction, freeFunc: HttpFreeFunction, reallocFunc: HttpReallocFunction): Int

public expect fun sceNetResolverInit(): Int

public expect fun sceNetResolverCreate(rid: Int?, buf: COpaquePointer?, bufLength: UInt): Int

public expect fun sceNetResolverDelete(rid: Int): Int

public expect fun sceNetResolverStartNtoA(rid: Int, hostname: COpaquePointer?, addr: InAddr?, timeout: UInt, retry: Int): Int

public expect fun sceNetResolverStartAtoN(rid: Int, addr: InAddr?, hostname: COpaquePointer?, hostnameLen: UInt, timeout: UInt, retry: Int): Int

public expect fun sceNetResolverStop(rid: Int): Int

public expect fun sceNetResolverTerm(): Int
