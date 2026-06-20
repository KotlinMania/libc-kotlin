// port-lint: source new/linux_uapi/linux/can/error.rs
package io.github.kotlinmania.libc.new.linuxuapi.linux.can

import io.github.kotlinmania.libc.*

/**
 * Header: `linux/can/error.h`.
 */

public const val CAN_ERR_DLC: CInt = 8

public const val CAN_ERR_TX_TIMEOUT: CUInt = 0x00000001u
public const val CAN_ERR_LOSTARB: CUInt = 0x00000002u
public const val CAN_ERR_CRTL: CUInt = 0x00000004u
public const val CAN_ERR_PROT: CUInt = 0x00000008u
public const val CAN_ERR_TRX: CUInt = 0x00000010u
public const val CAN_ERR_ACK: CUInt = 0x00000020u
public const val CAN_ERR_BUSOFF: CUInt = 0x00000040u
public const val CAN_ERR_BUSERROR: CUInt = 0x00000080u
public const val CAN_ERR_RESTARTED: CUInt = 0x00000100u
public const val CAN_ERR_CNT: CUInt = 0x00000200u

public const val CAN_ERR_LOSTARB_UNSPEC: CInt = 0x00

public const val CAN_ERR_CRTL_UNSPEC: CInt = 0x00
public const val CAN_ERR_CRTL_RX_OVERFLOW: CInt = 0x01
public const val CAN_ERR_CRTL_TX_OVERFLOW: CInt = 0x02
public const val CAN_ERR_CRTL_RX_WARNING: CInt = 0x04
public const val CAN_ERR_CRTL_TX_WARNING: CInt = 0x08
public const val CAN_ERR_CRTL_RX_PASSIVE: CInt = 0x10
public const val CAN_ERR_CRTL_TX_PASSIVE: CInt = 0x20
public const val CAN_ERR_CRTL_ACTIVE: CInt = 0x40

public const val CAN_ERR_PROT_UNSPEC: CInt = 0x00
public const val CAN_ERR_PROT_BIT: CInt = 0x01
public const val CAN_ERR_PROT_FORM: CInt = 0x02
public const val CAN_ERR_PROT_STUFF: CInt = 0x04
public const val CAN_ERR_PROT_BIT0: CInt = 0x08
public const val CAN_ERR_PROT_BIT1: CInt = 0x10
public const val CAN_ERR_PROT_OVERLOAD: CInt = 0x20
public const val CAN_ERR_PROT_ACTIVE: CInt = 0x40
public const val CAN_ERR_PROT_TX: CInt = 0x80

public const val CAN_ERR_PROT_LOC_UNSPEC: CInt = 0x00
public const val CAN_ERR_PROT_LOC_SOF: CInt = 0x03
public const val CAN_ERR_PROT_LOC_ID28_21: CInt = 0x02
public const val CAN_ERR_PROT_LOC_ID20_18: CInt = 0x06
public const val CAN_ERR_PROT_LOC_SRTR: CInt = 0x04
public const val CAN_ERR_PROT_LOC_IDE: CInt = 0x05
public const val CAN_ERR_PROT_LOC_ID17_13: CInt = 0x07
public const val CAN_ERR_PROT_LOC_ID12_05: CInt = 0x0F
public const val CAN_ERR_PROT_LOC_ID04_00: CInt = 0x0E
public const val CAN_ERR_PROT_LOC_RTR: CInt = 0x0C
public const val CAN_ERR_PROT_LOC_RES1: CInt = 0x0D
public const val CAN_ERR_PROT_LOC_RES0: CInt = 0x09
public const val CAN_ERR_PROT_LOC_DLC: CInt = 0x0B
public const val CAN_ERR_PROT_LOC_DATA: CInt = 0x0A
public const val CAN_ERR_PROT_LOC_CRC_SEQ: CInt = 0x08
public const val CAN_ERR_PROT_LOC_CRC_DEL: CInt = 0x18
public const val CAN_ERR_PROT_LOC_ACK: CInt = 0x19
public const val CAN_ERR_PROT_LOC_ACK_DEL: CInt = 0x1B
public const val CAN_ERR_PROT_LOC_EOF: CInt = 0x1A
public const val CAN_ERR_PROT_LOC_INTERM: CInt = 0x12

public const val CAN_ERR_TRX_UNSPEC: CInt = 0x00
public const val CAN_ERR_TRX_CANH_NO_WIRE: CInt = 0x04
public const val CAN_ERR_TRX_CANH_SHORT_TO_BAT: CInt = 0x05
public const val CAN_ERR_TRX_CANH_SHORT_TO_VCC: CInt = 0x06
public const val CAN_ERR_TRX_CANH_SHORT_TO_GND: CInt = 0x07
public const val CAN_ERR_TRX_CANL_NO_WIRE: CInt = 0x40
public const val CAN_ERR_TRX_CANL_SHORT_TO_BAT: CInt = 0x50
public const val CAN_ERR_TRX_CANL_SHORT_TO_VCC: CInt = 0x60
public const val CAN_ERR_TRX_CANL_SHORT_TO_GND: CInt = 0x70
public const val CAN_ERR_TRX_CANL_SHORT_TO_CANH: CInt = 0x80

public const val CAN_ERROR_WARNING_THRESHOLD: CInt = 96
public const val CAN_ERROR_PASSIVE_THRESHOLD: CInt = 128
public const val CAN_BUS_OFF_THRESHOLD: CInt = 256
