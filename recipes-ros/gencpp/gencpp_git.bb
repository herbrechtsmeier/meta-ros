DESCRIPTION = "C++ ROS message and service generators."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "genmsg-native"

PR = "r1"

SRC_URI = "git://github.com/ros/${BPN}.git;branch=relocatable"
SRCREV = "d80b91f9faf8a5de5ed9ca05a26af201da90f918"
PV = "0.4.13+gitr${SRCPV}"

S = "${WORKDIR}/git"

inherit catkin
