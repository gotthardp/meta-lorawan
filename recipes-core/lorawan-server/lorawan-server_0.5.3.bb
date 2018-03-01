DESCRIPTION = "Compact server for private LoRa networks"
HOMEPAGE = "https://gotthardp.github.io/lorawan-server/"
SECTION = "console/utils"
# https://github.com/joaohf/meta-erlang
DEPENDS = "erlang"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/gotthardp/lorawan-server.git;branch=master \
   file://lorawan-server.init \
   file://lorawan-server.default"
SRCREV = "12bc60f05f96164a846e6da4c2b4bfda1085c762"

S = "${WORKDIR}/git"

RDEPENDS_${PN} += "bash erlang erlang-compiler erlang-syntax-tools erlang-crypto \
    erlang-inets erlang-asn1 erlang-public-key erlang-ssl erlang-mnesia erlang-os-mon \
    erlang-xmerl"

inherit useradd update-rc.d

USERADD_PACKAGES = "${PN}"
USERADD_PARAM_${PN} = "--home-dir /var/lib/lorawan-server --create-home lorawan"

INITSCRIPT_NAME = "lorawan-server"
INITSCRIPT_PARAMS = "defaults 80 30"

do_compile() {
    oe_runmake release
}

do_install() {
    mkdir -p ${D}${libdir}
    cp -r ${S}/_build/default/rel/lorawan-server ${D}${libdir}

    install -d ${D}${sysconfdir}/default
    install -m 0644 ${WORKDIR}/lorawan-server.default ${D}${sysconfdir}/default/lorawan-server
    install -d ${D}${sysconfdir}/init.d
    install -m 0755 ${WORKDIR}/lorawan-server.init ${D}${sysconfdir}/init.d/lorawan-server
}

CONFFILES_${PN} = "${sysconfdir}/default/lorawan-server ${libdir}/lorawan-server/releases/${PV}/sys.config"
