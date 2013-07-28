DESCRIPTION = "Python ROS message and service generators."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "genmsg-native"
RDEPENDS_${PN} = "python-math genmsg python-shell"
RDEPENDS_${PN}_class-native = ""

PR = "r2"

SRC_URI = "git://github.com/ros/${BPN}.git;branch=relocatable"
SRCREV = "1bc78ac23e465c1b3ef040d11c53d89cdc00b8ae"
PV = "0.4.13+gitr${SRCPV}"

S = "${WORKDIR}/git"

inherit catkin
