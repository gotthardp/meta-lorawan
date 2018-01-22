DESCRIPTION = "Image with LORIX One support and lorawan-server"

LICENSE = "MIT"
PR = "r0"

require wifx-base.bb

IMAGE_INSTALL += "lorawan-server"

# MQTT server
IMAGE_INSTALL += "mosquitto mosquitto-clients"

# end of file
