DESCRIPTION = "C++ ROS message and service generators."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "genmsg-native"

PR = "r2"

SRC_URI = "git://github.com/ros/${BPN}.git;branch=relocatable"
SRCREV = "e5acaf690d6276d427f6b0ecaab67b52f55bbe8a"
PV = "0.4.13+gitr${SRCPV}"

S = "${WORKDIR}/git"

inherit catkin
