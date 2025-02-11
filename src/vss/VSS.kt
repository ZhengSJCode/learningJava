package vss

class VSS {
    object AISwitch {
        /**
         * 手机AI钥匙开关状态
         * 0x0: 默认缺省值
         * 0x1: 开
         * 0x2: 关
         */
        const val UploadAIPhoneSwitchInfo = "Vehicle.{{AccountId}}.BLE.UploadAIPhoneSwithInfo"

        /**
         * 上传手表AI开关信息
         */
        const val UploadAIWatchSwitchInfo = "Vehicle.{{AccountId}}.BLE.UploadAIWatchSwithInfo"
    }
}
