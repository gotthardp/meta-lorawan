require recipes-core/images/mlinux-base-image.bb
DESCRIPTION = "mLinux LoRaWAN image"

# handy tools
IMAGE_INSTALL += "mc"

# LoRa support (MTAC-LORA accessory card)
IMAGE_INSTALL += "lora-packet-forwarder lora-packet-forwarder-usb lora-gateway-utils"
IMAGE_INSTALL += "lorawan-server"

# MQTT server
IMAGE_INSTALL += "mosquitto mosquitto-clients"

# end of file
